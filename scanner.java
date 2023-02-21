import java.util.Scanner;
public class scanner{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("name?");
        String name = myScanner.next();
        System.out.println("age?");
        int age = myScanner.nextInt();
        System.out.println("salary?");
        double salary = myScanner.nextDouble();
        System.out.println("name =" + name + "; age =" + age + "; salary =" + salary + ";");
    }
}