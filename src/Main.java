import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int bilangan;
        System.out.print("Masukkan bilangan : ");
        bilangan = input.nextInt();

        if ((bilangan>0) && (bilangan % 3 == 0) && (bilangan % 5 == 0))
            System.out.println("Bilangan " +bilangan+ " memenuhi kondisi");
        else
            System.out.println("Bilangan " +bilangan+ " tidak memenuhi kondisi");
    }
}