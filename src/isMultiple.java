import java.util.Scanner;
public class isMultiple {

        public static boolean isMultiple(long n, long m) { //using static so we dont need to create an object to use the method
            if (n % m == 0){
                return true;
            }
            else {
                return false;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the value of n: ");
            long n = scanner.nextLong();

            System.out.print("Enter the value of m: ");
            long m = scanner.nextLong();

            //MultipleChecker checker = new MultipleChecker(); // Create an instance of the class if there was no static


            if (isMultiple(n, m)) { //would have to be checker.isMultiple if there was no static
                System.out.println(n + " is a multiple of " + m);
            } else {
                System.out.println(n + " is not a multiple of " + m);
            }

            scanner.close();
        }

}
