import java.util.Scanner;
public class two_two {
    public static void main(String[] args) {

        boolean  sleep = true;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите weekday или vocation:");
        String str = in.nextLine();
        in.close();
        if (str.equals("weekday") ) {
            System.out.println("False");
        }else
            System.out.println("True");
    }
}
