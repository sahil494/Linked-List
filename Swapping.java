import java.util.*;
class Node100
{
	private int data;
	private Node100 next;
	public Node100 insert(Node100 head,int data1)
	{
		Node100 temp = new Node100();
		temp.data=data1;
		temp.next=null;
		if(head==null)
		{
			head=temp;
		}
		else
		{
			Node100 ptr=head;
			while(ptr.next!=null)
			{
				ptr=ptr.next;
			}
			ptr.next=temp;
		}
		return head;
	}
	public void display(Node100 head)
	{
		Node100 ptr=head;
		while(ptr.next!=null)
		{
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
		System.out.println(ptr.data);
	}
	public void swapping(Node100 head,int pos1,int pos2)
	{
		Node100 ptr=head;
		Node100 ptr1=head;
		Node100 ptr2=head;
		int count=1;
		while(ptr.next!=null)
		{
			if(count==pos1)
			{
				ptr1=ptr;
			}
			if(count==pos2)
			{
				ptr2=ptr;
			}
			count++;
			ptr=ptr.next;
		}
		int temp=ptr1.data;
		ptr1.data=ptr2.data;
		ptr2.data=temp;
	}
}
public class Swapping {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int size=scan.nextInt();
    Node100 head=null;
    Node100 l1=new Node100();
    for(int i=0;i<size;i++)
    {
    	int num=scan.nextInt();
    	head=l1.insert(head, num);
    }
    l1.display(head);
    int pos10,pos20;
    System.out.println("the pos should be between 1 and "+size);
    pos10=scan.nextInt();
    pos20=scan.nextInt();
    l1.swapping(head, pos10, pos20);
    l1.display(head);
	}

}