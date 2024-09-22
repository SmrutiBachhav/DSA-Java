// public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
//     // Write your code here
//     SinglyLinkedListNode previous = llist;
//     int count=0;
//     while(count<position-1){
//         previous=previous.next;
//         count++;
//     }
//     SinglyLinkedListNode current=previous.next;
//     previous.next=current.next;
    
//     return llist;