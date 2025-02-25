//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ayyub Reese

public class ListFunHouse
{
	//this method will print the entire list on the screen
	public static void print(ListNode list)
	{
		ListNode currentList = list;
		while (currentList != null)
		{
			System.out.print(currentList.getValue() + " ");
			currentList = currentList.getNext();
		}
	}

	//this method will return the number of nodes present in list
	public static int nodeCount(ListNode list)
	{
		int count = 0;
		ListNode currentList = list;
		while (currentList != null)
		{
			count++;
			currentList = currentList.getNext();
		}
		return count;
	}

	//this method will create a new node with the same value as the first node and add this
	//new node to the list.  Once finished, the first node will occur twice.
	public static void doubleFirst(ListNode list)
	{
		if (list != null)
		{
			ListNode newNode = new ListNode(list.getValue(), list.getNext());
			list.setNext(newNode);
		}
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public static void doubleLast(ListNode list)
	{
		ListNode currentList = list;
		ListNode prev = null;
		while (currentList != null)
		{
			prev = currentList;
			currentList = currentList.getNext();
		}
		if (prev != null)
		{
			ListNode newNode = new ListNode(prev.getValue(), null);
			prev.setNext(newNode);
		}
	}

	//method skipEveryOther will remove every other node
	public static void skipEveryOther(ListNode list)
	{
		ListNode currentList = list;
		while (currentList != null && currentList.getNext() != null)
		{
			currentList.setNext(currentList.getNext().getNext());
			currentList = currentList.getNext();
		}
	}

	//this method will set the value of every xth node in the list
	public static void setXthNode(ListNode list, int x, Comparable value)
	{
		int count = 1;
		ListNode currentList = list;
		while (currentList != null)
		{
			if (count % x == 0)
			{
				currentList.setValue(value);
			}
			count++;
			currentList = currentList.getNext();
		}
	}

	//this method will remove every xth node in the list
	public static void removeXthNode(ListNode list, int x)
	{
		int count = 1;
		ListNode currentList = list;
		ListNode prev = null;
		while (currentList != null)
		{
			if (count % x == 0)
			{
				if (prev != null)
				{
					prev.setNext(currentList.getNext());
				}
			}
			else
			{
				prev = currentList;
			}
			count++;
			currentList = currentList.getNext();
		}
	}
}
