import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        
        int [] stack = new int[size];
        
        int top = -1;
        while(true){
            System.out.println("1:: P ush");
            System.out.println("2:: Pop");
            System.out.println("3:: Peek");
            System.out.println("4:: Display");
            System.out.println("5:: Exit");

            System.out.println("Enter the operation");
            int ch = sc.nextInt();

            switch(ch){
                case 1:
                    if(top == size - 1){
                        System.out.println("Stack is full");
                    }
                    else{
                        System.out.println("Enter the element to push");

                        int ele = sc.nextInt();
                        ++top;
                        stack[top] = ele;
                        System.out.println("Element pushed");
                    }
                    break;
                case 2:
                    if(top == -1){
                        System.out.println("Stack is empty");
                    }
                    else{
                        System.out.println("Popped element is " + stack[top]);
                        --top;
                    }
                    break;
                case 3:
                    if(top == -1){
                        System.out.println("Stack is empty");
                    }
                    else{
                        System.out.println("Top element is " + stack[top]);
                    }
                    break;
                case 4:
                    if(top == -1){
                        System.out.println("Stack is empty");
                    }
                    else{
                        System.out.print("Stack elements are: ");
                        for(int i = top; i >= 0; i--){
                            System.out.println(stack[i]);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}







// import java.util.Scanner;

// public class Q01 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = 5;
        
//         int [] stack = new int[size];
        
//         int top = -1;
//         while(true){
//             System.out.println("1:: Push");
//             System.out.println("2:: Pop");
//             System.out.println("3:: Peek");
//             System.out.println("4:: Display");
//             System.out.println("5:: Exit");

//             System.out.println("Enter the operation");
//             int ch = sc.nextInt();

//             if(ch == 1){
//                 if(top == size - 1){
//                     System.out.println("Stack is full");
//                 }
//                 else{
//                     System.out.println("Enter the element to push");

//                     int ele = sc.nextInt();
//                     ++top;
//                     stack[top] = ele;
//                     System.out.println("Element pushed");
//                 }
//             }
//             else if(ch == 2){
//                 if(top == -1){
//                     System.out.println("Stack is empty");
//                 }
//                 else{
//                     System.out.println("Popped element is " + stack[top]);
//                     --top;
//                 }
//             }
//             else if(ch == 3){
//                 if(top == -1){
//                     System.out.println("Stack is empty");
//                 }
//                 else{
//                     System.out.println("Top element is " + stack[top]);
//                 }
//             }
//             else if(ch == 4){
//                 if(top == -1){
//                     System.out.println("Stack is empty");
//                 }
//                 else{
//                     System.out.print("Stack elements are: ");
//                     for(int i = top; i >= 0; i--){
//                         System.out.println(stack[i]);
//                     }
//                 }
//             }
//             else if(ch == 5){
//                 System.out.println("Exiting...");
//                 break;
//             }
//             else{
//                 System.out.println("Invalid choice");
//             }
//         }
//     }
// }