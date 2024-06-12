// Basic calculator for 2 value arithmetic

public class Calculator{
  
    // constructors
    public Calculator() {
  
    }
    
    // methods
    public double add(double a, double b) {
      return a + b;
    }
    public double subtract(double a, double b) {
      return a - b;
    }
    public double multiply(double a, double b) {
      return a * b;
    }
    public double divide(double a, double b) {
      return a / b;
    }
    public double modulo(double a, double b) {
      return a % b;
    }
  
  
    // main
    public static void main(String[] args) {
      Calculator myCalculator = new Calculator();
      System.out.println(myCalculator.add(15, 7));
      System.out.println(myCalculator.subtract(45, 11));
  
  
  
    }
  }
