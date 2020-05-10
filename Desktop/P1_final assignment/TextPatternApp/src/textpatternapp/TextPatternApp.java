
package textpatternapp;

/**
 *
 * @author geonkim
 */
import java.util.Scanner;

public class TextPatternApp {
    
    public static void main(String[] args){
        Scanner kb = new Scanner (System.in);
        TextPattern text_pattern = new TextPattern();
        
        boolean user_wants_to_repeat = true;
        
        while (user_wants_to_repeat) {
            System.out.println("Choose from these options");
            System.out.println("-------------------------");
            System.out.println("1: Text Pattern 1");
            System.out.println("2: Text Pattern 2");
            System.out.println("3: Text Pattern 3");
            System.out.println("4: Text Pattern 4");
            System.out.println("5: Text Pattern 5");
            System.out.println("6: Text Pattern 6");
            System.out.println("7: Reset Text");
            System.out.println("8: Quit");
            System.out.print (" " + " " + " " + "Your Choice?");
            
            int choice = kb.nextInt();
            kb.nextLine(); // extract the newline character (\n)
            // only if kb.nextLine() is to be used next
        
        switch (choice) {
            case 1:
                text_pattern.setPattern(1);
                System.out.println(text_pattern);
                break;
            case 2:
                text_pattern.setPattern(2);
                System.out.println(text_pattern);
                break;
            case 3:
                text_pattern.setPattern(3);
                System.out.println(text_pattern);
                break;
            case 4:
                text_pattern.setPattern(4);
                System.out.println(text_pattern);
                break;
            case 5:
                text_pattern.setPattern(5);
                System.out.println(text_pattern);
                break;
            case 6:
                text_pattern.setPattern(6);
                System.out.println(text_pattern);
                break;
            case 7:                
                System.out.print("Enter a string of characters: ");
            //  Scanner keyboard = new Scanner(System.in);
                String inputString = kb.nextLine();
                text_pattern.setText(inputString);
            // TextPattern newTp = new TextPattern(inputString);
            // text_pattern = newTp;
                System.out.println("Text Reset");
                break;                           
                
            default:
                    System.out.println("Wrong choice");
                    break;
            }
        } // end while
    }
}
