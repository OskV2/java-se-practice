package pl.globallogic.exercises.ex47;

public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    protected ListItem next() {
        return rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return item;
    }

    @Override
    ListItem previous() {
        return leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return item;
    }

    @Override
    int compareTo(ListItem item) {
        Object thisValue = super.getValue();
        Object passedValue = item.getValue();
        if (thisValue == passedValue) return 0;
        return ((String) super.getValue()).compareTo((String) item.getValue());
    }
}
