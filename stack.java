import java.util.Arrays;

public class stack
{
    private int top;
    int size;
    int[] stack ;

    public stack(int arraySize)
    {
        size=arraySize;
        stack= new int[size];
        top=-1;
    }

    public void push(int value)
    {
        if(top==size-1)
        {
            System.out.println("Stack is full");
        }
        else
        {

            top=top+1;
            stack[top]=value;
        }
    }

    public void pop()
    {
        if(!isEmpty())
            top=top-1;
        else
        {
            System.out.println("stack is empty");
        }
    }

    public boolean isEmpty()
    {
        return top==-1;
    }

    public void display()
    {

        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+ " ");
        }
        System.out.println();
    }
}
