//Sepid Ebrahimi, CS245


public class Node<T> {
    protected T data;
    protected Node next;

    public Node(T data) { this.data = data; } //creates Node

    public T getData() { return this.data; } //get Node's data

    public Node getNext() {
        return this.next;
    } //get Node's next

    public void setNext(Node next) {
        this.next = next;
    } //set Node's next

}
