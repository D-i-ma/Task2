import java.util.Scanner;

public class two_four {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите вес:");
        int a = console.nextInt();
        console.close();
        System.out.println("Вес на Луне:" +a*0.17);
    }
}
