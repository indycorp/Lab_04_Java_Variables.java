public class Lab_04_Java_Variables {
    static void main() {
        // int a number with no fraction  can be negative
        // double is a number with a fractional part (decimal)

        int age = 0;
        double salary = 23.50;
        String name = "Tom";
        String greeting = "hello world";
        boolean isRaining = false;


        IO.println("Hello World");

        IO.println(greeting);

        IO.println(isRaining);

        // * / + - %

        int intoperandA = 78;
        int intoperandB = 34;
        int intSum = 0;
        int intDifference = 0;
        int intQuotient = 0;
        int intModulo = 0;
        int intProduct = 0;

        intSum = intoperandA + intoperandB; // sum of 23 and 34
        IO.println("the sum of " + intoperandA + " + " + intoperandB + " is " + intSum);
        IO print;

        intProduct = intoperandA * intoperandB;
        IO.println("the product of " + intoperandA + " * " + intoperandB + " is " + intProduct);

        intDifference = intoperandA - intoperandB;
        IO.println("the difference of " + intoperandA + "-" + intoperandB + " is " + intDifference);

        intQuotient = intoperandA / intoperandB;
        IO.println("the Quotient of " + intoperandA + " / " + intoperandB + " is " + intQuotient);

    }
}

