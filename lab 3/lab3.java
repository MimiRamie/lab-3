
import java.util.Scanner;
import java.util.Stack;

public class lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//1. Push Stack
        Stack<Integer> teaStack = new Stack<>();
        System.out.println("Element Stack: Empty");
        teaStack.push(20);
        System.out.println("Element Stack: "+teaStack);
        teaStack.push(13);
        System.out.println("Element Stack: "+teaStack);
        teaStack.push(89);
        System.out.println("Element Stack: "+teaStack);
        teaStack.push(90);
        System.out.println("Element Stack: "+teaStack);
        teaStack.push(90);
        System.out.println("Element Stack: "+teaStack);
        teaStack.push(11);
        System.out.println("Element Stack: "+teaStack);
        teaStack.push(45);
        System.out.println("Element Stack: "+teaStack);
        teaStack.push(18);
        System.out.println("Element Stack: "+teaStack);

// //2.1. Delete Stack
//         System.out.println("------\nDelete Stack");
//         System.out.println("Deleted number: " +  teaStack.pop());
//         System.out.println("Current Stack: " + teaStack);
//         System.out.println("Deleted number: " +  teaStack.pop());
//         System.out.println("Current Stack: " + teaStack);
//         System.out.println("Deleted number: " +  teaStack.pop()); 
//         System.out.println("Current Stack: " + teaStack);

// //2.2. Search
//         System.out.println("------\nSearch");
//         System.out.println("Searching a Number in Stack:");
//         int numInStack = sc.nextInt();
//         int numPosition = teaStack.search(numInStack);
//         if (numPosition != -1 ){
//                 System.out.println("Element "+ numInStack + " is at position "+numPosition+ " from right to left");
                

//         }
//         else{
//                 System.out.println("Cant not find number " +numInStack+ " in Stack" );
//                 sc.nextInt();
//         }
//         sc.close();
//3. Loop
        System.out.println("------\nLoop");
        System.out.println("Current Stack; "+teaStack);
        System.out.println("Enter element: ");
        int newElement = sc.nextInt();
        System.out.println("New number: ");
        int newNum = sc.nextInt();
        for (Integer element : teaStack){
                if (element == newElement){
                        teaStack.set(teaStack.indexOf(newElement), newNum);
                }
        }
        System.out.println("New Stack: ");
        for (Integer element : teaStack){
                System.out.println(newElement);
        }

    }
}
