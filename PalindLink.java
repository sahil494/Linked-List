import java.util.*;
class Rotation
{
	private Rotation next;
	private int data;
	public Rotation insertion(Rotation head,int data)
	{
		Rotation temp = new Rotation();
		temp.data=data;
		temp.next=null;
		if(head==null)
		{
			head=temp;
		}
		else
		{
			Rotation ptr=head;
			while(ptr.next!=null)
			{
				ptr=ptr.next;
			}
			ptr.next=temp;
		}
		return head;
	}
	public void display(Rotation head)
	{
		Rotation ptr=head;
		while(ptr.next!=null)
		{
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
		System.out.println(ptr.data);
	}
public Boolean palindrome(Rotation head,int size)
	{
		Rotation ptr=head;
		Rotation tail=null;
		int count=0;
		while(ptr.next!=null)
		{
			Rotation pre=head;
			while(pre.next!=null)
			{
				tail=pre;
				pre=pre.next;
			}
			tail.next=null;
			if(ptr.data==pre.data)
			{
				count++;
			}
			if(ptr==tail)
				break;
			ptr=ptr.next;
		}
		if(count==size/2)
			return true;
		else
			return false;
	}
}
public class PalindLink {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size=scan.nextInt();
		Rotation head=null;
		Rotation l1=new Rotation();
		for(int i=0;i<size;i++)
		{
			int num=scan.nextInt();
			head=l1.insertion(head, num);
		}
		l1.display(head);
                             System.out.println(l1.palindrome(head, size));
	}

}