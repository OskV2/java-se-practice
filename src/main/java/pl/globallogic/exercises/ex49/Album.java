package pl.globallogic.exercises.ex49;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        if (duration < 0) return false;
        songs.add(new Song(title, duration));
        return true;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        Song song = songs.findSong(trackNumber);
        if (song != null) {
            playlist.add(song);
            return true;
        }
        System.out.println("Song with track number " + trackNumber + " does not exist in this album");
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song song = songs.findSong(title);
        if (song != null) {
            playlist.add(song);
            return true;
        }
        System.out.println("Song named \"" + title + "\" does not exist in this album");
        return false;
    }

    //  ------------------------- INNER CLASS -------------------------

    public static class SongList {
        ArrayList<Song> songs;  //  IT DOESNT WORK IF U ADD STATIC !!!

        private SongList() {
            this.songs = new ArrayList<>();
        }

        public boolean add(Song song) {  //  IT DOESNT WORK IF U ADD STATIC !!!
            if (findSong(song.getTitle()) != null) return false;
            songs.add(song);
            return true;
        }

        public Song findSong(String title) {  //  IT DOESNT WORK IF U ADD STATIC !!!

//            System.out.println("--------------------------------");
//            System.out.println("LIST OF SONGS THAT WILL BE CHECKED");
//            for (int j = 0; j < songs.size(); j++) System.out.println("Title: " + songs.get(j).getTitle());
//            System.out.println("--------------------------------");
//            System.out.println("LOOKING FOR SONG: " + title);
//            System.out.println("--------------------------------");

            for (int i = 0; i < songs.size() ; i++) {
//                System.out.println("FUNCTION findSong:          Checking song: " + songs.get(i).getTitle()); // Print out the title of each song
                if (title.equals(songs.get(i).getTitle())) {
//                    System.out.println("FUNCTION findSong:          Song " + title + " has been found ");
                    return songs.get(i);
                }
            }
//            System.out.println("");
            return null;
        }

        public Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if (index >= 0 && index < songs.size()) {
                return songs.get(index);
            }
            return null;
        }
    }

}
