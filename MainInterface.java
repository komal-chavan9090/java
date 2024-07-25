import java.io.*;

interface In1{
    final int a=1;

    void display();
}

class MainInterface implements In1{
    public void display() {
        System.out.println("In1 interface method");
    }

    public static void main(String[] args) {
        MainInterface obj=new Mainvnterface();
        obj.display();
    }
}