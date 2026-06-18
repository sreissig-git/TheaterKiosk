import java.util.Scanner;
//Class TheaterKiosk
//  main()
//      num personAge = 0
//      output "Please enter your age: "
//      input personAge
//      if (personAge >= 21)
//          output "Here is your paper wristband"
//      endif
//  return
//EndClass
public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int personAge = 0;
        System.out.println("Please enter your age: ");
        if (in.hasNextInt()) {
            personAge = in.nextInt();
            if (personAge >= 21) {
                System.out.println("Here is your paper wristband");
            }
        }
    }
}
