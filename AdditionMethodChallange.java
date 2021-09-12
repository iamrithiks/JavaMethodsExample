package code2rithik.github.io;

public class AdditionMethodChallange {


    public static int getAddedNumbers(int a,int b){
        int d = multiplyTwoNumbers(5,5);
        System.out.println("product of two numbers " + d);
        int c = 0;
        c = a + b;

        return c;
    }

    public static int multiplyTwoNumbers(int a, int b){
        int c = 0;
        c = a * b;
        return c;
    }

    public static boolean whichGreater(int a, int b){
        if(a > b){
            return true;
        }else{
            return false;
        }

    }

    public static void printMyName(String name){
        System.out.println("My name is " + name);
    }

    public static String sayHi(String name){
        return "Hello " + name;
    }

    public static void main(String[] args) {
        //int d = 0;
        String catchValue;
        System.out.println("Sum of two numbers is " + getAddedNumbers(1,2));
        System.out.println("Product of two numbers is " + multiplyTwoNumbers(5,6));
        printMyName("Rithik");
        System.out.println(sayHi("Rithik"));
        catchValue = sayHi("Venkat");
        System.out.println(catchValue);
        System.out.println(whichGreater(8,5));

        // System.out.println("Sum of two numbers is " + d);

    }


}