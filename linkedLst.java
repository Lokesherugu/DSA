class Node{
    int data;
    Node next;
    public Node(int data){
        this.data =data;
    }
}
class Linkedlist{
     Node head,tail;
    public void insert(int data){
        Node n = new Node(data);
        if(head==null){
            head = n;
            tail = n;
        }
        else{
            tail.next = n;
            tail = n;
        }
        
    }
    public void insertatbegin(int data){
        Node n = new Node(data);
        n.next = head;
        head = n;
    }
    public void insertatspecific(int pos,int data){
        Node n = new Node(data);
        Node temp=head;
        for(int i=1;i<pos-1;i++){
            temp = temp.next;
        }
        n.next = temp.next;
        temp.next = n;
    }
    public void deleteatbegin(){
        head = head.next;
    }
    public void deleteatspecific(int pos){
        Node temp=head;
        for(int i=1;i<pos-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public void deleteatend(){
        Node temp = head;
        while(temp.next!=tail){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
}
public class linkedLst
{
	public static void main(String[] args) {
		Linkedlist l = new Linkedlist();
		l.insert(10);
		l.insert(20);
		l.insert(30);
		System.out.println("After insertion :");
		l.display();
		l.insertatbegin(5);
		System.out.println("After insertion at begin :");
		l.display();
		l.insertatspecific(3,12);
		//5 10 20 30
		System.out.println("After insertion at specific pos:");
		l.display();
		l.deleteatbegin();
		System.out.println("After deletion at begin :");
		l.display();
		l.deleteatspecific(3);
		System.out.println("After deletion at specific pos :");
		l.display();
		l.deleteatend();
		System.out.println("After deletion at end :");
		l.display();
		
		
	}
}