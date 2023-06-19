package Seminar4;
//Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
//1) Умножьте два числа и верните произведение в виде связанного списка.
  
public class hw4_1{
  
    
    static class Node
    {
        int data;
        Node next;
          
        Node(int data){
            this.data = data;
            next = null;
        }
    }
  
    
    static long multiplyTwoLists(Node first, Node second)
    {
        long N = 1000000007;
        long num1 = 0, num2 = 0;
  
        while (first != null || second !=  null){
              
            if(first != null){
                num1 = ((num1)*10)%N + first.data;
                first = first.next;
            }
              
            if(second != null)
            {
                num2 = ((num2)*10)%N + second.data;
                second = second.next;
            }
              
        }
        return ((num1%N)*(num2%N))%N;
    }
  
    
    static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data);
            if(node.next != null)
                System.out.print("->");
            node = node.next;
        }
        System.out.println();
    }
  
    
    public static void main(String args[])
    {
        
        Node first = new Node(9);
        first.next = new Node(4);
        first.next.next = new Node(6);
        System.out.print("First List is: ");
        printList(first);
  
        
        Node second = new Node(8);
        second.next = new Node(4);
        System.out.print("Second List is: ");
        printList(second);
  
        
        System.out.print("Result is: ");
        System.out.println(multiplyTwoLists(first, second));
    }
}
  