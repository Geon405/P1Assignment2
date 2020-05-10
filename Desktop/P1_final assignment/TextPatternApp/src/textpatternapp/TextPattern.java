
package textpatternapp;

/**
 *
 * @author geonkim
 */
public class TextPattern {

    private String text;
    private int Pattern;
    
    public TextPattern() // the default constructor
    {
        this.text = "AbrAcadAbrA";
    }
    
    public TextPattern (String text) // an overloaded constructor
    {
        this.text = text;
    }
    
    public TextPattern (String text, int pattern) // an overloaded constructor
    {        
        this.text = "AbrAcadAbrA";
        this.text = text;
    }  
}
