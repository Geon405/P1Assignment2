
package textpatternapp;

/**
 *
 * @author geonkim
 */
public class TextPattern {

    private String text;
    private int pattern;
    
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
    
    public String getText()
    {
        return(this.text);
    }
    
    public int getPattern()
    {
        return this.pattern;
    }
    
    public void setText(String text)
    {
        this.text = text;
    }
    
    public void setPattern(int pattern)
    {
        this.pattern = pattern;
    }
}
