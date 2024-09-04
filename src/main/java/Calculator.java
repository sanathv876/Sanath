import java.util.Scanner;

public class Calculator {
    int number1;
    int number2;
    String operator;

    public Calculator(int num1,int num2,String opperator){
        this.number1=num1;
        this.number2=num2;
        this.operator = opperator;
    }

    public int getSum(){
        return number1+number2;
    }

    public int getDifference(){
        return number1-number2;
    }

    public int getProduct(){
        return number1*number2;
    }

    public double getQuotient(){
        return (double)number1 / number2;
    }
    public void calculate(){
        if (operator.equals("+")){
            System.out.println("The sum is " + getSum());
        }
        else if (operator.equals("-")){
            System.out.println("The difference is " + getDifference());
        }
        else if (operator.equals("*")){
            System.out.println("The product is " + getProduct());
        }
        else if (operator.equals("/")){
            System.out.println("The quotient is " + getQuotient());
        }
        else{
            System.out.println("Invalid");
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num1 = input.nextInt();
        input.nextLine();
        System.out.print("Enter another number : ");
        int num2 = input.nextInt();
        input.nextLine();
        System.out.print("What operation?(+ for add, - for subtract, * for multiply, / for divide) : ");
        String opperator = input.nextLine();
        Calculator calculator = new Calculator(num1,num2,opperator);
        calculator.calculate();



    }
}


