class Helper 
{
    int multiply(int a, int b)
    {
        return a*b;
    }
    double multiply(double a, double b)
    {
        return a*b;
    }
}

public class MethodOver
{
    public static void main(String[] args)
    {
        Helper helper = new Helper();
        int result1 = helper.multiply(5, 10);
        double result2 = helper.multiply(5.5, 10.5);
        System.out.println("Integer Result: " + result1);
        System.out.println("Double Result: " + result2);
    }
}