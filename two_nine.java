import java.util.Random;
import java.io.IOException;

public class two_nine {
    public static void main(String[] args)throws IOException{
        char t, ch;

        Random r = new Random();
        char c = (char) (r.nextInt(26) +'A');
        System.out.println(c);

        System.out.println("Введите данные в консоль: ");
        t = ' ';
        while (c != t){
            ch = (char) System.in.read();
            t = ch;
            if (t < c & t >='A'){
                System.out.println("You’re too low");
            }
            if (t > c & t <='Z'){
                System.out.println("You’re too high");
            }
        }
        System.out.println("Верно ");
    }
}
