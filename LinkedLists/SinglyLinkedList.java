//public package LinkedLists;

class SinglyLinkedList {

    private ListNode head;  /*head is instance variable of type ListNode 
    initially pointing towards null head-->null*/

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

    //finding length of Singly Linked List
    public int length(){    //it will return length of linked list
        if(head==null){
            return 0;
        }
        int count=0;
        ListNode current=head;
        while (current!=null) {
            count++;
            current=current.next;            
        }
        return count;
    }    

    //to INSERT node at the BEGINING of singly linked list
    public void insertFirst(int value){
        ListNode newNode=new ListNode(value);//constructor with passed value to be added
        newNode.next=head;
        head=newNode;
    }

    //to INSERT node at the END of singly linked list
    public void insertLast(int value){
        ListNode newNode=new ListNode(value);   //cretaing node with given value to be added
        if(head==null){
            head=newNode;
            return;
        }
        ListNode current=head;  //temporary node current pointing towards head
        while(current.next!=null){  /*iterate till current.next=null(end of th list) it will
            be last element of list*/
            current=current.next;
        }
        current.next=newNode;
        }

    /*to insert node in a singly linked list at a given position assuming position to
    be valid and starting from 1*/
    public void insert(int position, int value){
        ListNode node=new ListNode(value);  /*to create new listnode ex node=7 
        node.next=null also initially head points towards nulltherfore->*/
        if(position==1){
            node.next=head;;
            head=node;
        }
        else{
            ListNode previous = head;
            int count=1;    /*to keep track and traverse till (given position-1) node */
            while(count<position-1){
                previous=previous.next; /*to accomodate newly created node inside list */
                count++;
            }
            ListNode current=previous.next; /*to have reference of node to be moved 
                due to adding of new node in between, to make rest of the node of singly linked
                list instact    */  
            previous.next=node;
            node.next=current;     
        }
        System.out.println("newly added node is "+ value + " at position " + position);
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

        //to insert node at BEGINING of the singly linked list
        sll.insertFirst(2);

        //to insert node at END of the singly linked list
        sll.insertLast(5);

        /*to insert node in a singly linked list at a given position assuming position to
        be valid and starting from 1*/
        sll.insert(3,24);
        

        //To display list content
        sll.display();
        System.out.println("Length of given Linked List:"+sll.length());
    }
    
}
