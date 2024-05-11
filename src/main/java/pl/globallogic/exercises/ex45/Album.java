package pl.globallogic.exercises.ex45;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) != null || duration < 0) return false;
        songs.add(new Song(title, duration));
        return true;
    }

    public Song findSong(String title) {
        for (int i = 0; i < songs.size(); i++) {
            if (title == songs.get(i).getTitle()) return songs.get(i);
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if (index >= 0 && index < songs.size()) {
            playlist.add(songs.get(index));
            return true;
        }
        System.out.println("Song with this track number does not exist in this album");
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song song = findSong(title);
        if (song != null) {
            playlist.add(song);
            return true;
        }
        System.out.println("Song with this title does not exist in this album");
        return false;
    }

}
