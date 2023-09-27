import java.util.Scanner;

public class isOdd {

    public static boolean isOdd(int i){
        if (i % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter the number you want to check is odd");
        int i = scanner.nextInt();

        if (isOdd(i)){
            System.out.printf(i+" is not odd");
        }
        else{
            System.out.print(i+" is odd");
        }


        scanner.close();
    }


}
