package csc241;

public class Main {

    public static void main(String[] args) {

        IntQueue iq1 = new IntQueue();

        iq1.enqueue(12);
        iq1.enqueue(24);
        iq1.enqueue(36);

        while (!iq1.isEmpty()){
            System.out.println("DEQUEUE: " + iq1.dequeue());
        }


    }
}
