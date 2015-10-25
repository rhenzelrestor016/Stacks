
    class Stack
    {

     int stck[] = new int[10];

     int put;

 

Stack()
{

     put = -1;

}

 

void push (int item)
{

     if (put==9)

          System.out.println("The Stack is full.");

     else

          stck[++put]=item;

}

 

int pop()
{

     if(put<0)
     {

          System.out.println("The Stack is ...");

          return 0;

     }

     else

          return stck [put--];

     }
    
}
