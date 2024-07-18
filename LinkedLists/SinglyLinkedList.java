//public package LinkedLists;

class SinglyLinkedList {

    private ListNode head;

    private static class ListNode{  //class
        private int data;
        private ListNode next;

        public ListNode(int data){      //constructor
        this.data=data;
        this.next=null;
    }
    }

    //Printing Elements of Singly Linked List
    public void display(){  //display() will display elts of singly Linked List
        ListNode current=head;  //temporary node current to contain value node
        while(current!=null){   /*when current =null loop break, last elt point towards null*/
            System.out.print(current.data+"-->"+" ");     //printing data stored in current
            current=current.next;   //to traverse current to next node
        }       
        System.out.println("null list is completely traversed");
    }

    public static void main(String[]args){
        SinglyLinkedList sll=new SinglyLinkedList(); //creating instance of class
        //four nodes whose each next point towards null
        sll.head=new ListNode(10);
        ListNode second=new ListNode(1);
        ListNode third=new  ListNode(8);
        ListNode fourth =new ListNode(11);
        /*connecting  nodes with each other(together) to form a chaon which is nothing but 
        our Singly Linked List  
         * 
         * now each node's next will point towards it's next node(10->1->8->11) instead of 
         * null
         */

        sll.head.next=second;
        second.next=third;
        third.next=fourth;

        //To display list content
        sll.display();
    }
    
}
