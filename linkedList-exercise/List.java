public class List {
    private ListElement head;
    public List() {
    }
    public void append(String elemToAppend) {
        if (elemToAppend == null || elemToAppend == "") {
            throw new IllegalArgumentException("Content must not be null");
        }
        ListElement newElem = new ListElement(elemToAppend);
        if (head == null) {
            head = newElem;
        } else {
            ListElement current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newElem);
        }
    }
    public String remove(String content) {
        if (content == null || content == "") {
            throw new IllegalArgumentException("Content must not be null");
        }
        ListElement current = head;
        ListElement previous = null;
        while (current != null) {
            if (current.getContent().equals(content)) {
                String removedContent = current.getContent();
                if (previous == null) {
                    head = current.getNext();
                } else {
                    previous.setNext(current.getNext());
                }
                return removedContent;
            }
            previous = current;
            current = current.getNext();
        }
        return null;
    }
}