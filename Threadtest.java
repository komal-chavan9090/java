class Stack{
    private int[] array;
    private int stackTop;


    public Stack(int capacity)
    {
        array=new int[capacity];
        stackTop=-1;
    }

    public boolean isEmpty(){
        return stackTop<0;
    }

    public boolean push(int element)
    {
        if(isFull()) return false;
        ++stackTop;

        try{
            Thread.sleep(1000);
        }
        catch(Exception e){}

        array[stackTop]=element;
        return true;
    }

    public int pop(){
        if(isEmpty()) return Integer.MIN_VALUE;

        int obj = array[stackTop];

        array[stackTop]=Integer.MIN_VALUE;

         try{
            Thread.sleep(1000);
        }
        catch(Exception e){}

        stackTop--;
        return obj;
    }

    public boolean isFull()
    {
        return stackTop >= array.length-1;
    }
}


public class Threadtest{
    public static void main(String args[])
    {
        System.out.println("main is starting..");

        Stack st=new Stack(50);

        new Thread(()->{
            int counter=0;
            while(++counter<10)
            {
                System.out.println("Pushed:"+st.push(counter));
            }
        },"Pusher").start();

        new Thread(()->{
            int counter=0;
            while(++counter<10)
            {
                System.out.println("Popped:"+st.pop());
            }
        },"Popper").start();

        System.out.println("main is existing");
    }
}