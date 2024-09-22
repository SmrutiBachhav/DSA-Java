//import LinkedLists.SinglyLinkedList;

import java.util.List;

public class SinglyLinkedList {

    private ListNode head; /*
                            * head is instance variable of type ListNode
                            * initially pointing towards null head-->null if not head is pointing towards
                            * 2st node
                            * & singly linkedlist
                            */

    private static class ListNode { // class
        private int data;
        private ListNode next;

        public ListNode(int data) { // constructor
            this.data = data;
            this.next = null;
        }
    }

    // Printing Elements of Singly Linked List
    public void display() { // display() will display elts of singly Linked List
        ListNode current = head; // temporary node current to contain value node
        while (current != null) { /* when current =null loop break, last elt point towards null */
            System.out.print(current.data + "-->" + " "); // printing data stored in current
            current = current.next; // to traverse current to next node
        }
        System.out.println("null list is completely traversed");
    }

    // finding length of Singly Linked List
    public int length() { // it will return length of linked list
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // to INSERT node at the BEGINING of singly linked list
    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);// constructor with passed value to be added
        newNode.next = head;
        head = newNode;
    }

    // to INSERT node at the END of singly linked list
    public void insertLast(int value) {
        ListNode newNode = new ListNode(value); // cretaing node with given value to be added
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head; // temporary node current pointing towards head
        while (current.next != null) { /*
                                        * iterate till current.next=null(end of th list) it will
                                        * be last element of list
                                        */
            current = current.next;
        }
        current.next = newNode;
    }

    /*
     * to insert node in a singly linked list at a given position assuming position
     * to
     * be valid and starting from 1
     */
    public void insert(int position, int value) {
        ListNode node = new ListNode(value); /*
                                              * to create new listnode ex node=7
                                              * node.next=null also initially head points towards nulltherfore->
                                              */
        if (position == 1) {
            node.next = head;
            ;
            head = node;
        } else {
            ListNode previous = head;
            int count = 1; /* to keep track and traverse till (given position-1) node */
            while (count < position - 1) {
                previous = previous.next; /* to accomodate newly created node inside list */
                count++;
            }
            ListNode current = previous.next; /*
                                               * to have reference of node to be moved
                                               * due to adding of new node in between, to make rest of the node of
                                               * singly linked
                                               * list instact
                                               */
            previous.next = node;
            node.next = current;
        }
        System.out.println("newly added node is " + value + " at position " + position);
    }

    // delete first node in the singly linked list
    // 10->1->11->null
    public ListNode deleteFirst() {
        if (head == null) { // to check whether the linked list is empty or not
            return null;
        }
        ListNode temp = head; // storing value of head in temp listnode
        head = head.next; // if we delete first node 2nd node becomes new head
        temp.next = null; // to remove node from linked list
        return temp; // will return deleted node
    }

    // delete last node of a singly linked list
    // 10->1->11->null
    // current traverse the last node
    // previous traverse 2nd last node to free the last node to break linkage
    public ListNode deleteLast() {
        if (head == null || head.next == null) { /*
                                                  * signifying linked list has only one node
                                                  * (head.next=null) or linked list is empty(head=null)
                                                  */
            return null;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null) {/*
                                       * to traverse current to last node and previous to 2nd last
                                       * node till list is completely traversed last element current.next=null
                                       */
            previous = current;
            current = current.next;
        }
        previous.next = null;// break the link between 2nd last and last node
        return current;
    }

    // delete a node from a Singly Linked List at a given position assuming position
    // to be
    // valid and starting from 1
    // 10->1->8->11->null (Example)
    // 1 2 3 4 <-position
    public void delete(int position) { // same as insert node at given position
        // same same but different
        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;// to reach position just before the given position to delete
            while (count < position - 1) {
                previous = previous.next;// to traverse
                count++;
            }
            ListNode current = previous.next;// point towards node to be deleted
            previous.next = current.next;// current.next--node next to node to be deleted
        }

    }

    // search an element in a linked list in java
    // 10->1->8->11->null
    public boolean searchNode(int searchKey) {
        if (head == null) {
            return false;
        }
        ListNode current = head;
        int count = 1;
        while (current != null) {
            if (current.data == searchKey) {
                System.out.println(searchKey + " Found at " + count);
                return true;
            }
            count++;
            current = current.next;// if not equal current will point towards next node
        }
        System.out.println(searchKey + " Not found!!!");
        return false; // if not found
    }

    // reverse a singly linked list]
    // 10->1->8->11->null
    // 11->8->1->10->null
    public ListNode reverse() {
        if (head == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
        return head;
    }

    // how to find nth node from the end of a Linked List in Java
    // 10->8->1->11->15->null
    // n=2
    // o/p:-11 2nd from end
    public ListNode getNthNodeFromEnd(int n) {
        if (head == null) {
            return null;
        }
        if (n <= 0) { // assuming index starts from 1 only
            throw new IllegalArgumentException("Invalid value n:" + n);
        }
        ListNode mainPtr = head; // main pointer till refptr encounter null mainptr required value
        ListNode refPtr = head; // reference pointer traverse n positions
        int count = 0;
        while (count < n) {
            if (refPtr == null) {
                throw new IllegalArgumentException(n + " is greater the number of nodes in list");
            }
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr != null) {// move both pointer together till refPtr encounters the null value
            refPtr = refPtr.next;// refptr will be n steps ahead of mainPtr as it traverse n-1 times(for n=2
                                 // refPtr will traverse for 0&1 when while loop conditon becomes false refPtr
                                 // will traverse till null and mainPtr will be n steps behind refPtr)
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    // How to remove duplicates from sorted linked list in java
    // 1->1->2->3->3->null
    // o/p:- 1->2->3->null
    public void removeDuplicateNodes() {
        if (head == null) {
            return;
        }
        ListNode current = head;
        while (current != null && current.next != null) {// it means list is fully traversed
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next; // simply traverse to next node if if block is false
            }
        }
    }

    // how to insert a node in a sorted singly linkrd list in java
    // condition-after inserting the sorting order is maintained
    // 1->8->10->16->null
    // insert 11
    // newNode->11->null newNode.next point to null
    // o/p;- 1->8->10->11->16
    public ListNode insertInSortedList(int value) {
        ListNode newNode = new ListNode(value); // creating ListNode for value to be inserted
        if (head == null) {
            return newNode;
        }
        ListNode current = head;// temp for value less than given newNode
        ListNode temp = null;// current for value greater than given newNode
        while (current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }
        newNode.next = current;// to insert newNode(11) between temp(10)and current(16)
        temp.next = newNode;

        return head;
    }

    // remove a given key from Singly Linked List
    // 1->8->10->->11->16->null
    // key=11 data to be deleted
    // o/p: 1->8->10->16->null
    public void deleteNode(int key) {
        ListNode current = head;
        ListNode temp = null; // temp will always 1 step behind current traverse till current reach the value
                              // to be deleted i.e. temp till node just behind node(value/key) to be deleted
        if (current != null && current.data == key) {// head=key
            head = current.next;
            return;
        }
        while (current != null && current.data != key) {
            temp = current; // to traverse through linked list till current=null(list is fully traversed) &&
                            // current=key (value to be deleted)
            current = current.next;
        }
        if (current == null || current.data != key) {
            System.out.println("key to be deletd not found!");
            return; // value to be deleted not found
        }
        temp.next = current.next;
    }

    // LinkedLists\SinglyLinkedList.java
    // Creating a Singly LinkedLsit with a Loop

    public void createLoop() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        // creating loop by connecting nodes
        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;

    }

    // detect a loop in a Singly Linked List
    public boolean containsLoop() {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        if (head == null) {
            return false;
        }
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastPtr) {
                return true;
            }
        }
        return false;
    }

    // to find start of a loop in a singly linked list
    // 1st detect loop
    public ListNode startingNodeOfLoop() {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        if (head == null) {
            return null;
        }
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastPtr) {
                return getStartingNodeOfLoop(slowPtr);
            }
        }
        return null;
    }

    // pass the value of slowPtr to below method to fing starting node
    private ListNode getStartingNodeOfLoop(ListNode slowPtr) {
        ListNode temp = head;
        while (slowPtr != temp) {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        // when temp=slowPtr while loop will break and will return starting node of loop
        // as temp
        return temp;
    }

    // Remove a loop from Singly Linked list
    public void removeLoop() {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        if (head == null) {
            return;
        }
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastPtr) {
                removeLoop(slowPtr);
                return;
            }
        }
    }

    private void removeLoop(ListNode slowPtr) {
        ListNode temp = head;
        while (temp.next != slowPtr.next) {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        /*
         * when slowPtr=temp break the loop in linkedList by pointing last elt before
         * when slowptr.next and temp.next meets i.e slowPtr to null
         * here temp.next and slowPtr.next meets at 3 so slowPtr i.e 6 to null i.e
         * slowPtr.next = null
         */
        slowPtr.next = null;
    }

    // to Merge two Sorted Singly linked list
    /*
     * a->1,4,8
     * b->3,5,8,9,14,18
     * result->1,3,4,5,8,9,14,18
     * 
     */
    public static ListNode merge(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        // dummy node storing 0 value having no significance and it next stores merged
        // sorted linkedlist
        ListNode tail = dummy;
        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if (a == null) {
            // directly appends remaining elements of b to resultant list when a is empty
            tail.next = b;
        } else { // b==null
                 // directly appends remaining elements of a to resultant list when b is empty
            tail.next = a;
        }
        // will return two merged sorted linked list
        return dummy.next;

    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList(); // creating instance of class
        // four nodes whose each next point towards null
        // sll.head = new ListNode(1);
        // ListNode second = new ListNode(8);
        // ListNode third = new ListNode(10);
        // ListNode fourth = new ListNode(16);
        /*
         * connecting nodes with each other(together) to form a chaon which is nothing
         * but
         * our Singly Linked List
         * 
         * now each node's next will point towards it's next node(10->1->8->11) instead
         * of
         * null
         */

        // sll.head.next = second;
        // second.next = third;
        // third.next = fourth;

        // to insert node at BEGINING of the singly linked list
        // sll.insertFirst(10);

        // to insert node at END of the singly linked list
        // sll.insertLast(5);

        /*
         * to insert node in a singly linked list at a given position assuming position
         * to
         * be valid and starting from 1
         */
        // sll.insert(3,11);

        // delete first node in the singly linked list
        // System.out.println("deleted first node:"+sll.deleteFirst().data);

        // delete last node of a singly linked list
        // System.out.println("deleted last node:"+sll.deleteLast().data);

        /*
         * to delete node in a singly linked list at a given position assuming position
         * to
         * be valid and starting from 1
         */
        // sll.delete(3);

        // search an element in a linked list in java
        // sll.searchNode(26);

        // to reverse linked list
        // sll.reverse();

        // how to find nth node from the end of a Linked List in Java
        // System.out.println("value at n is: "+sll.getNthNodeFromEnd(2).data);

        // How to remove duplicates from sorted linked list in java
        // sll.removeDuplicateNodes();
        // sll.display();
        // how to insert a node in a sorted singly linkrd list in java
        // sll.insertInSortedList(11);

        // To display list content
        // sll.display();

        // remove a given key from Singly Linked List
        // sll.deleteNode(11);
        // sll.display();
        // System.out.println("Length of given Linked List:"+sll.length());

        // creating a loop in SinglyLinkedList
        // sll.createLoop();
        // sll.display(); // infinite loop
        // detect a loop in a Singly Linked Listt
        // System.out.println(sll.containsLoop());
        // to find start of a loop in a singly linked list
        // System.out.println(sll.startingNodeOfLoop().data);
        // to remove loop from linked list
        // sll.removeLoop();
        // System.out.println("Loop Removed Successfully!!");
        // sll.display();
        // To merge two sorted Singly linkedLists
        // a
        SinglyLinkedList sll1 = new SinglyLinkedList();
        sll1.insertLast(1);
        sll1.insertLast(4);
        sll1.insertLast(8);
        // b
        SinglyLinkedList sll2 = new SinglyLinkedList();
        sll2.insertLast(3);
        sll2.insertLast(5);
        sll2.insertLast(8);
        sll2.insertLast(9);
        sll2.insertLast(14);
        sll2.insertLast(18);

        sll1.display();
        sll2.display();

        // to resultant merged sorted linked list
        SinglyLinkedList result = new SinglyLinkedList();
        result.head = merge(sll1.head, sll2.head);// will pass whole linked list using sll1.head
        result.display();

    }

}
