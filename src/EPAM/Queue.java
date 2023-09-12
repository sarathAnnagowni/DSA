package EPAM;
public class Queue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add("sarath");
        queue.add("bharath");
        queue.add("raj");
        queue.remove();
        queue.remove();
        queue.printElements();
    }

    String[] queue = new String[10];
    int tail = 0;

    public boolean add(String element) {
        if (tail >= queue.length) {
            System.out.println("Queue is full");
            return false;
        } else {
            queue[tail] = element;
            tail++;
            return true;
        }

    }

    public String remove() {
        if (tail <= 0) {
            System.out.println("Queue is Empty");
        } else {
            String removedElement = queue[tail];
            queue[tail] = null;
            for (int i = 0; i < queue.length - 1; i++) {
                queue[i] = queue[i + 1];
            }
            tail--;
            return removedElement;
        }
        return null;
    }

    public void printElements() {
        for (String s : this.queue) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
