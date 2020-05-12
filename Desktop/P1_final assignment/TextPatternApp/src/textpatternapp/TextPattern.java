
package textpatternapp;

/**
 * 
 * The TextPattern program implements an application that 
 * models an isosceles right triangle pattern of this characters.
 * 
 * @author Geon Kim
 * @since 2020-05-13
 */
public class TextPattern {

    private String text;
    private int pattern;
    
    /**
     * Initializes the object's text to given text which is "AbrAcadAbrA".
     */
    public TextPattern() // the default constructor
    {
        this.text = "AbrAcadAbrA";
    }
    
    /**
     * Initializes the object's text to supplied text.
     * @param text The supplied text.
     */
    public TextPattern (String text) // an overloaded constructor
    {
        this.text = text;
    }
    
    /**
     * Initializes both the object's text and pattern.
     * @param text The supplied text.
     * @param pattern The supplied pattern.
     */
    public TextPattern (String text, int pattern) // an overloaded constructor
    {        
        this.text = "AbrAcadAbrA";
        this.text = text;
    }  
    
    /**
     * Returns the text of this TextPattern object.
     * @return A string representation of this object.
     */
    public String getText()
    {
        return(this.text);
    }
    
    /**
     * Returns the pattern of this TextPattern object.
     * @return A string representation of this object.
     */
    public int getPattern()
    {
        return this.pattern;
    }
    
    /**
     * Sets the text of this TextPattern object.
     * @param text The supplied text.
     */
    public void setText(String text)
    {
        this.text = text;
    }
    
    /**
     * Sets the pattern of this TextPattern object.
     * @param pattern The supplied pattern.
     */
    public void setPattern(int pattern)
    {
        this.pattern = pattern;
    }
    
    /**
     * Returns Pattern1 string representation of this TextPattern object.
     * @return A string representation of this object.
     */
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
    
    /**
     * Returns Pattern2 string representation of this TextPattern object.
     * @return A string representation of this object.
     */
    public String toStringPattern2()
    {
        int length = this.text.length();
        String result = "";
	for(int row = 0; row < length; row++)
	{
            for (int space = 1; space < row; space++)
            {
		result += " ";
            }
	    for (int position = 0; position < (length - row); position++)
	    {
                result += this.text.charAt(position);
	    }
	    result += "\n ";
            }
        return result;
    }
    
    /**
    * Returns Pattern3 string representation of this TextPattern object.
     * @return A string representation of this object.
     */
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
    
    /**
     * Returns Pattern4 string representation of this TextPattern object.
     * @return A string representation of this object.
     */
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
    
    /**
     * Returns Pattern5 string representation of this TextPattern object.
     * @return A string representation of this object.
     */
    public String toStringPattern5() {  
    int length = this.text.length();
    String result = "";
    for(int row = 0; row < length; row++)
	{
            for (int space = 1; space < row; space++)
            {
		result += " ";
            }
	    for (int position = 0; position < (length - row); position++)
	    {
                result += this.text.charAt(position);
	    }
	    result += "\n ";
        }
        for(int row = 0; row <= length; row++)
            {
            for (int space = 1; space <= (length-row); space++)
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
    
    /**
     * Returns Pattern6 string representation of this TextPattern object.
     * @return A string representation of this object.
     */
    public String toStringPattern6() {
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
    
    /**
     * Returns string representation of this TextPattern object based on its current pattern and text.
     * @return A string representation of this object.
     */
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
            case 5:
                System.out.println(this.toStringPattern5());
                break;
            case 6: 
                System.out.println(this.toStringPattern6());
                break;
        }
        return result;
    }
    
    private boolean toStringPattern() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
