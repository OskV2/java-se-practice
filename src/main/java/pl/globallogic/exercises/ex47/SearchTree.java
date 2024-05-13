package pl.globallogic.exercises.ex47;

public class SearchTree implements NodeList {
    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (root == null) {
            root = newItem;
            return true;
        }

        ListItem currentItem = root;
        while (true) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison == 0) {
                return false;
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    return true;
                }
            }
        }
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (root == null) return false;

        ListItem currentItem = root;
        ListItem parentItem = root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                // Found the item to remove
                performRemoval(currentItem, parentItem);
                return true;
            } else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                parentItem = currentItem;
                currentItem = currentItem.next();
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        if (item.next() == null) {
            if (parent.previous() == item) {
                parent.setPrevious(item.previous());
            } else if (parent.next() == item) {
                parent.setNext(item.previous());
            }
        } else if (item.previous() == null) {
            if (parent.previous() == item) {
                parent.setPrevious(item.next());
            } else if (parent.next() == item) {
                parent.setNext(item.next());
            }
        } else {
            ListItem current = item.next();
            ListItem parentOfCurrent = item;
            while (current.previous() != null) {
                parentOfCurrent = current;
                current = current.previous();
            }
            item.setValue(current.getValue());
            performRemoval(current, parentOfCurrent);
        }
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The tree is empty");
        } else {
            if (root.previous() != null) {
                traverse(root.previous());
            }
            System.out.println(root.getValue());
            if (root.next() != null) {
                traverse(root.next());
            }
        }
    }
}
