
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
    
    public String toStringPattern1()
    {
        int length = this.text.length();
        String result = "";
        for (int row = 1; row <= length; row++)
        {
            for (int position = 0; position < row; position++)
            {
                result += this.text.charAt(position);
            }
            result += "\n";
        }
        return result;
    }
    
    public String toStringPattern2()
    {
	int length = this.text.length();
	String result = "";
	for(int row = 0; row < length; row++)
	{
            for (int space = 1; space <= row; space++)
            {
		result += " ";
            }
	    for (int position = 0; position < (length - row); position++)
	    {
                result += this.text.charAt(position);
	    }
	    //length--;
	    result += "\n ";
        }
        return result;
    }
    
    public String toStringPattern3()
    {
        int length = this.text.length();
	String result = "";
	for(int row = 1; row <= length; row++)
	{
        for (int space = 1; space <= length-row; space++)
	{
            result += " ";
	}
        for (int position = 0; position < row; position++)
	{
            result += this.text.charAt(position);
        }
            result += "\n";
	}
        return result;
    }
    
    public String toStringPattern4() {
    int length = this.text.length();
    String result = "";
    for(int row = 0; row < length; row++)
    {
    for (int position = row; position < length; position++)
    {
	result += this.text.charAt(position);
    }
        result += "\n";
    }
    return result;
    }
    
    public String toStringPattern5() {  
    int length = this.text.length();
    String result = "";
    for(int row = 5; row >= 0; row--)
    {
    for(int space = 0; space <= row; space++)
    {
        result += " ";
    }
    for(int position = row; position >= 0; position--)
    {
        result += this.text.charAt(position);
    }
        result += "\n";
    }
        return result;
    }
    
    @Override
    public String toString()
    {
        String result = "";
    //  result += String.format(text, pattern);
        switch(this.pattern)
        {
            case 1:
                System.out.println(this.toStringPattern1());
                break;
            case 2:
                System.out.println(this.toStringPattern2());
                break;
            case 3:
                System.out.println(this.toStringPattern3());
                break;
            case 4:
                System.out.println(this.toStringPattern4());
                break;            
        }
        return result;
    }
}
