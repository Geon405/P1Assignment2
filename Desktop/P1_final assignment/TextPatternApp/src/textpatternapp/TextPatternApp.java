
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
        }
    }
}
