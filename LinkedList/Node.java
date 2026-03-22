// package LinkedList;

// import java.lang.classfile.components.ClassPrinter.ListNode;

// public class Node {
//     int data;
//     Node next;

//     public Node(int data){
//         this.data = data;
//         this.next = null;
//     }

//     public Node middleNode(Node head) {
//         if(head == null) return null;

//         Node slow = head;
//         Node fast = head;

//         while(fast!=null & fast.next!=null & fast.next.next!=null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//         // 1 2 3 4 5 6
//         // slow = 1 fast = 1
//         // slow = 2 fast = 3
//         // slow = 3 fast = 5
//         // slow = 4 fast = null
//     }
//     public static void main(String[] args) {
//         Node head = new Node(1);
//         head.next = new Node(2);
//         head.next.next = new Node(3);
//         head.next.next.next = new Node(4);
//         head.next.next.next.next = new Node(5);
//         // head.next.next.next.next.next = new Node(6);

//         Node middle = head.middleNode(head);
//         System.out.println(middle.data); // Output: 3

//     }
// }
