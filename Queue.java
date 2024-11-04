import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int queue[] = new int[size];
        int front = 0;
        int rear = 0;
        int ch = 0;

        boolean flag = true;
        System.out.println("1: Insert element in queue");
        System.out.println("2: Delete element in queue");
        System.out.println("3: Display element in queue");
        System.out.println("4: Exit");

        while (flag) {
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    if (rear == size) {
                        System.out.println("Queue is full");
                    } else {
                        System.out.println("Enter the element: ");
                        int ele = sc.nextInt();
                        queue[rear] = ele;
                        rear++;
                    }
                    break;
                case 2:
                    if (rear == front) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println("Deleted element is: " + queue[front]);
                        front++;
                    }
                    break;
                case 3:
                    if (rear == front) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println("Queue elements are: ");
                        for (int i = front; i < rear; i++) {
                            System.out.println(queue[i]);
                        }
                    }
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }

    }
}