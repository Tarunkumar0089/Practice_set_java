public class ll{
     Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.data=null;
        }
    }
    // add first,last
    public void addFirst(String data){
        Node newNode=new Node(data);
            if(head == null){
            head=newNode;
            return;
        }
      newNode.next=head;
      head=newNode;
    }
    public void addlast(String data){
        Node newNode=new Node(data);
        if(head == null){
        head=newNode;
        return;
    }
    Node currnode=head;
    while(currnode!=null){
        currnode=currnode.next;
    }
    currnode.next=newNode;
    }
    public void printlist(){
        if(head==null){
            System.out.println("LIST IS EMPTY");
            return;
        }
        Node currnode=head;
    while(currnode.next!=null){
        System.out.print(currnode.data + " -->");
        currnode=currnode.next;
    }
    System.out.println("NULL");
    }
    public static void main(String[] args) {
        ll list=new ll();
        list.addFirst("a");
        list.addFirst("tarun");
        list.printlist();
    }
}