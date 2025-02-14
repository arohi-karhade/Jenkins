class Calculator
{
  public void add(int a, int b)
  {
    System.out.println("Addition result is : "+(a+b));
  }
  public void sub(int a, int b)
  {
    System.out.println("Subtraction result is : "+(a-b));
  }
  public void mul(int a, int b)
  {
    System.out.println("Multiplication result is : "+(a*b));
  }
  public void div(int a, int b)
  {
    System.out.println("Division result is : "+(a/b));
  }
  public void mod(int a, int b)
  {
    System.out.println("Modulus result is : "+(a%b));
  }
}

public class CalculatorMain
{
  public static void main(String[] args)
  {
    System.out.println("Calculator Operations ->");

    Calculator c1 = new Calculator();
    c1.add(10, 20);
    c1.sub(10, 20);
    c1.mul(10, 20);
    c1.div(20, 10);
    c1.mod(20, 10);
  }
}
