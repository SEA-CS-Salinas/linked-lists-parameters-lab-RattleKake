[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=18002154&assignment_repo_type=AssignmentRepo)
# LinkedList_Parameters

## Lab Description :   Use   ListNode   to write some basic LinkedList methods.  

- PART 1 – Open the   ListFunHouse.java   file and complete the methods in this class.   
- PART 2 – Use   ListFunHouseRunner.java   to test your ListFunHouse class.

  
### ListNode 
– stores a value and a reference to the next node

```
public class ListNode implements Linkable
{
   private Comparable listNodeValue;
   private ListNode nextListNode;

   public ListNode(){
      listNodeValue = null;
      nextListNode = null;
   }

   public ListNode(Comparable value, ListNode next){
      listNodeValue=value;
      nextListNode=next;
   }

   public Comparable getValue(){
      return listNodeValue;
   }

   public ListNode getNext(){
      return nextListNode;
   }

   public void setValue(Comparable value){
      listNodeValue = value;
   }
 
   public void setNext(Linkable next){
      nextListNode = (ListNode)next;
   }
}
```

### Sample Data : 
See the main method / runner code

### Sample Output :
```
go on at 34 2.1 -a-2-1 up over

num nodes = 8

List values after calling nodeCount

go on at 34 2.1 -a-2-1 up over

List values after calling doubleFirst

go go on at 34 2.1 -a-2-1 up over

List values after calling doubleLast

go go on at 34 2.1 -a-2-1 up over over

List values after calling removeXthNode(2)

go on 34 -a-2-1 over

List values after calling setXthNode(2,one)

go one 34 one over

```

### Additional help with linked lists
https://www.youtube.com/watch?v=R9PTBwOzceo

