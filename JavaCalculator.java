Import java.util.Scanner;

public class JavaCalculator{
    public static void main(String[] args){
        int operator, n1, n2;
        System.out.printIn(x:" 1 - Add \n 2 - Subtract \n 3 - Multiply \n 4 - Divide")
        System.out.print(s:"Choose operator: ");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();
        System.out.print(s:"Enter first number: ");
        n1 = sc.nextInt();
        System.out.print(s:"Enter second number: ");
        n2 = sc.nextInt():
        if ( input = ) {

        }

        int result = 0;
        switch (operator) {
            case 1:
                result = n1 + n2;
                break;

            case 2:
                result = n1 - n2;
                break;

            case 3:
                result = n1 * n2;
                break;

            case 4:
                result = n1 / n2;
                break;

                default:
                    System.out.printIn(x: "Entered operator is not valid")
        }
        System.out.print(" result is: " + result);
    }
}