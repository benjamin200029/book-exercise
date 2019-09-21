
/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 * Book Exercise
 * @author (Ben Adelson.)
 * @version (9/21/2019.)
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber = "";
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author,title,courseText and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean isCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        courseText = isCourseText;
    }//end
    
    // Add the methods here ...
    
    /**
    * returns the value of author
    */
   
    public String getAuthor(){
        return author;
    }//end
    
    /**
    * returns the value of title
    */
    
    public String getTitle(){
        return title;
    }//end 
    
    /**
    * returns the number of pages from 'pages' value
    */
    
    public int getPages(){
        return pages;
    }//end
    
    /**
    * returns the value of refNumber
    */
    
    public String getRefNumber(){
        return refNumber;
    }//end string
    
    /**
    * sets the value of reference number
    */
    
    public void setRefNumber(String ref){
          if(ref.length() >= 3){
              refNumber = ref;
            }else {
                System.out.println("Error!Sorry but the reference number "
                + "must be less than three characters.");
            }
    }//end void
    
    /**
    * keeps count of the number of times a book has been borrowed
    */
    
    public void borrow(){
        borrowed++;
    }//end void
    
    /**
    * returns the value of the new field number of the times a book has been borrowed
    */
    
    public int getBorrowed(){
        return borrowed;
    }//end int
    
    /**
    * records whether or not a book is beign used as a text book on a course
    */
    
    public boolean isCourseText(){
        return courseText;
    }//end boolean
    
    /**
    * Prints the name of author and title in the terminal window.
    */
   
    public void printAuthor(){
        System.out.println("Author: " + author);
    }//end void
    
    public void printTitle(){
        System.out.println("Title: " + title);
    }//end void
    
    /**
    * displays formatted output for all private fields
    */
    
    public void printDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        
        String refNumberResult;
        if(refNumber.length() > 0 ){
            refNumberResult = refNumber;

        }else{
           refNumberResult = "ZZZ";
        }
           System.out.println("Borrowed Info: " + borrowed);
           System.out.println("Reference Number: " + refNumberResult);

        
    }//end printDetails()
}//end class
