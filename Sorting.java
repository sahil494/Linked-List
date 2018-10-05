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
	public Node100 merging(Node100 head,Node100 head1)
	{
		Node100 ptr=head;
		while(ptr.next!=null)
		{
			ptr=ptr.next;
		}
		ptr.next=head1;
		Node100 ptr1=head;
		Node100 pre=ptr1;
		while(ptr1.next!=null)
		{
			pre=ptr1;
			while(pre!=null)
			{
				if(ptr1.data>pre.data)
				{
					int temp=ptr1.data;
					ptr1.data=pre.data;
					pre.data=temp;
					pre=pre.next;
				}
				pre=pre.next;
			}
			ptr1=ptr1.next;
		}
		return head;
	}
	}
public class Sorting {

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
    Node100 head1=null;
    Node100 l2=new Node100();
    for(int i=0;i<size;i++)
    {
    	int num=scan.nextInt();
    	head1=l2.insert(head1, num);
    }
    l2.display(head1);
    head=l1.merging(head, head1);
    l1.display(head);
	}

}