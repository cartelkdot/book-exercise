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
    
    

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
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
        
        System.out.println("Name:" + author);
        
        
        
    }
    
    
    /**
     * Print the Title
     */
    public void printTitle()
    {
        
        System.out.println("Title of the book:" + title);
        
        
        
    }
    
    /**
     * 
     */
    
    
    
    
    
    
}
