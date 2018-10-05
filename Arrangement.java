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
	public Node100 arrange(Node100 head,Node100 newhead)
	{
		Node100 ptr= head;
		Node100 ndHead=null;
		Node100 b=null;
		Node100 a=null;
		while(ptr!=null)
		{
			Node100 temp = new Node100();
			if(ptr.data%2!=0)
			{
				temp.data=ptr.data;
				temp.next=null;
				if(newhead==null)
				{
					newhead=temp;
				}
				else
				{
					Node100 pre=newhead;
					while(pre.next!=null)
					{
						pre=pre.next;
					}
					pre.next=temp;
					a=temp;
				}
			}
			else
			{
				temp.data=ptr.data;
				temp.next=null;
				if(ndHead==null)
				{
					ndHead=temp;
				}
				else
				{
					Node100 prt=ndHead;
					while(prt.next!=null)
					{
						prt=prt.next;
					}
					prt.next=temp;
				}
			}
			ptr=ptr.next;
		}
		a.next=ndHead;
		return newhead;
	}
		}
public class Arrangement {

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
    Node100 newhead=null;
    head=l1.arrange(head, newhead);
    l1.display(head);
	}

}