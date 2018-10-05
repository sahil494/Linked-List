import java.util.*;
class Cirnode
{
	private int data;
	private Cirnode next;
	public Cirnode insert(Cirnode head,int data)
	{
		Cirnode temp =new Cirnode();
		temp.data=data;
		temp.next=null;
		if(head==null)
		{
			head=temp;
		}
		else
		{
			Cirnode ptr=head;
			while(ptr.next!=null)
			{
				ptr=ptr.next;
			}
			ptr.next=temp;
		}
		return head;
	}
	public void display(Cirnode head)
	{
		Cirnode ptr=head;
		while(ptr.next!=null)
		{
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
		System.out.println(ptr.data);
	}
	public Cirnode remDup(Cirnode head)
	{
		Cirnode ptr=head;
		Cirnode pre=head;
		int temp=ptr.data;
		while(ptr.next!=null)
		{
			
			if(ptr.next.data==temp)
			{
				pre=ptr;
				ptr.next=ptr.next.next;
			}
			else
			{
				temp=ptr.next.data;
				pre=ptr;
				ptr=ptr.next;
			}
		}
		return head;
	}
}
public class RemoveDupLink {

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
      int size= scan.nextInt();
      Cirnode head=null;
      Cirnode l1 = new Cirnode();
      for(int i=0;i<size;i++)
      {
    	  int num=scan.nextInt();
    	  head=l1.insert(head, num);
      }
      l1.display(head);
      l1.remDup(head);
      l1.display(head);
	}

}