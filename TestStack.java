
class TestStack
{

     public static void main ( String args[])
     {

          Stack mystack1 = new Stack();

 

     for (int i=0; i<10; i++) mystack1.push(i);

 

     System.out.println("Stacks:");

     for (int i=0; i<10; i++)

          System.out.print(mystack1.pop() + " ");
     }

}
