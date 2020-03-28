package csc241;

public class IntQueue {

    // Insatnce variables
    IntNode front;
    IntNode back;

    public IntQueue() {
        this.front = null;
        this.back = null;
    }

    // isEmpty -- check if queue has any eleemnts
    public boolean isEmpty() {
        return front == null && back == null;
    }

    // enqueue -- add item to the back of the queue
    public void enqueue(int v) {
        IntNode temp = new IntNode(v);
        if (this.isEmpty()) {
            // Add first element
            front = back = temp;
        } else {
            // link to current back node
            back.next = temp;
            // Update back
            back = temp;
        }
    }


    public Integer dequeue() {
        if (this.isEmpty()) {
            return null;
        } else {
            int temp = front.value;
            // Update front
            front = front.next;
            // check if now empty
            if (front == null) {
                back = null;
            }
            return temp;
        }
    }

}
