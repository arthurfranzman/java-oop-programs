public class ListElement {
    private String content;
    private ListElement next;
    
    public ListElement(String content) {
        setContent(content);
        this.next = null;
    }
    public String getContent() {
        return content;
    }
    public ListElement getNext() {
        return next;
    }
    public void setContent(String content) {
        if (content == null || content == "") {
            throw new IllegalArgumentException("Content must not be null");
        }
        this.content = content;
    }
    public void setNext(ListElement next) {
        this.next = next;
    }
}