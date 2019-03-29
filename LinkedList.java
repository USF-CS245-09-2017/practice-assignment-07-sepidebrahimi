//Sepid Ebrahimi, CS245

public class LinkedList<T> implements List<T> {
    // data member
    private Node<T> head;
    private int size;


    public LinkedList(){
        head = null;
        size = 0;
    }


    public int size() {
        return this.size;
    } //returns the size of the list


    public void add(T item) { //add the item at the end
        if (this.head == null) {
            Node<T> newItem = new Node(item);
            head = newItem;
        }//end of if
        else {
            Node<T> curr = head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            Node<T> node = new Node(item);
            curr.setNext(node);
        }// end of if
        this.size++;
    }

    public void add(int pos, T item) { //adds an item into a specific position
        Assert.not_false(pos >= 0 && pos < size);
        if (pos == 0) { //adding head
            Node<T> n = new Node(item);
            n.setNext(head);
            head = n;
            size++;

        } else {
            Node<T> n = new Node(item);
            Node prev = head;
            for (int i = 0; i < pos - 1; i++) {//move the pointer till you get to the position
                prev = prev.getNext();
            }
            n.setNext(prev.getNext());
            prev.next = n;
            ++size;
        }//end of else
    }

    public T remove(int pos) {
        Assert.not_false(pos < 0 && pos > size); //check if position is in bound
        Node<T> curr = head;
        if (pos == 0) { //adding head
            head = head.getNext();
            this.size--;
            return curr.getData();
        }//end of if
        for (int i = 0; i < pos - 1; i++) {
            curr = curr.getNext();
        }//end of for
        Node<T> update = curr.getNext();
        curr.setNext(update.getNext());
        --size;
        return update.getData();
    }

    public T get(int pos) { //get an item
        Assert.not_false(pos < 0 && pos > size); //check if position is in bound
        Node<T> n = head;
        for (int i = 0; i < pos; i++) {
            n = n.getNext();
        }
        return n.getData();

    }

}
