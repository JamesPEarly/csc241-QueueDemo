package csc241;

public class IntQueue {

    // Instance variables
    IntNode front;
    IntNode back;

    // Constructor
    public IntQueue(){
        this.front = null;
        this.back = null;
    }

    // isEmpty -- determine if queue is empty
    public boolean isEmpty(){
        return front == null && back == null;
    }

    // enqueue -- add element to the back
    public void enqueue(int v){
        IntNode temp = new IntNode(v);
        if (back == null) {
            // Adding first element
            back = temp;
            front = temp;
        } else {
            // Add new back element
            back.next = temp;
            back = temp;
        }
    }

    // dequeue -- remove element from front
    public Integer dequeue(){
        if (front != null) {
            IntNode temp = front;
            front = front.next;
            if (front == null) {
                // removed the only element
                back = null;
            }
            return temp.value;
        } else {
            // Queue empty
            return null;
        }
    }

    // peek - Return first element if present
    public Integer peek(){
        // Examine front
        if (front == null) {
            // Queue is empty
            return null;
        } else {
            // Return the first value
            return front.value;
        }
    }



}
