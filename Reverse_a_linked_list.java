// Input: Linked list: 1->2->3->4->5->6
// Output: 6->5->4->3->2->1
// Explanation:

// Input: Linked list: 2->7->10->9->8 
// Output: 8->9->10->7->2
// Explanation:

// Input: Linked List: 10
// Output: 10
// Explanation: For a single node list, the reverse would be same as original


class Solution {
    // Function to reverse a linked list.
    Node reverseList(Node head) {
        // code here
        Node current = head;
        Node prev = null;
        
        while(current != null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
