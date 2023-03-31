package csc241;

public class Main {

    public static void main(String[] args) {

        IntQueue iq1 = new IntQueue();

        iq1.enqueue(5);
        iq1.enqueue(20);
        iq1.enqueue(15);

        System.out.println("FIRST PEEK: " + iq1.peek());

        iq1.enqueue(37);

        System.out.println("---=== Dequeue ===---");
        while (!iq1.isEmpty()) {
            System.out.println("DEQUEUE: " + iq1.dequeue());
            System.out.println("PEEK: " + iq1.peek());
        }
    }
}
