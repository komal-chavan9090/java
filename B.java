class A {
    protected void display()
    {
        System.out.println("GeeksforGeeks");
    }
}

// Class B is subclass of A
public class B extends A {
    public static void main(String args[])
    {
        B obj = new B();
        obj.display();
    }
}
