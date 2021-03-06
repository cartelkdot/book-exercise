/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Kywajn Alston
 * @version 2/4/19
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    boolean courseText = true;
    
    
    

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = 500;
        refNumber = "";
        borrowed = 0;
    }

    // Add the methods here ...
    
    
    
    /**Provide access to the string holding the author's name @return author
     * 
     */
    public String getAuthor()
    {
        
        return author;
        
    }
    
    
    
    
    
    /**
     * Provide access to the string holding the 
     * author's name @return title
     * 
     */
    public String getTitle()
    {
        
        return title;
        
    }
    
    
    /**
     * Print the Author
     */
    public void printAuthor()
    {
        
        System.out.println(" Name:" + author);
        return;
        
        
    }
    
    
    /**
     * Print the Title
     */
    public void printTitle()
    {
        
        System.out.println(" Title of the book:" + title);
        return;
        
        
    }
    
    /**
     * Able to get the pages of the book.
     * 
     */
    public int getPages()
    {
        
    
      return pages;
        
        
    }
    
    /**
     * Print the Pages
     */
    public void printPages()
    {
        
        System.out.println(" Number of pages:" + pages);
        return;
        
        
    }
    
    
    
    /**
     * 
     * Print all of the book details.
     */
    
    public void printDetails()
    {
        
        System.out.println("Title:" + title);
        System.out.println("Author:" + author);
        System.out.println("Pages:" + pages);
        System.out.println("Reference Number:" + refNumber);
        System.out.println("Number of times borrowed:" + borrowed);
        return;
        
        
        
        
    }
    
    /**
     * This is to set the reference number
     * of the book.
     * 
     */
    public void setRefNumber(String newref)
    {
        
        refNumber = newref; 
        
    }
    
    public String getrefNumber()
    {
        
     return refNumber;   
    }
    
    
    
   
    
    public void addBorrowed(int amt)
    {
        
       
        
        borrowed += amt;

    }
    
    
    /**
     * 
     * Should get the number of times the book was borrowed.
     */
    public int getBorrowed()
    {
        
        
        return borrowed;
        
        
    }
    
    
    
    /**
     * 
     * Whether or not the book is being used as a text book on a course.
     * 
     */
    public void isCourseText(){
        
        
        
        if (!courseText == true) {
System.out.println("it's true");
}
else {
System.out.println("it's false");
}
        
        
        
    
    }
    
    
    
    
    
    
    
    
    
    
    

}
