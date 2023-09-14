import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String s;
        char c ;
        int counter;
        Scanner input = new Scanner(System.in);
        String decision_str;
        do {
            counter = 0;
            System.out.print("Geben sie einen Namen ein: ");
            s = input.next();
            System.out.print("Geben sie einen Buchstaben ein: ");
            c = input.next().charAt(0);

            for (int i = 0; i < s.length(); i++) {


                if (s.charAt(i) == c) {
                    counter++;


                }
            }
            System.out.print("So viele Buchstaben sind vorhanden:" + counter + '\n') ;
            System.out.print("Nochmal? (ja/nein): ");
            decision_str = input.next();
        }while (decision_str.equals("ja") || decision_str.equals("JA") || decision_str.equals("Ja") );


    }

}