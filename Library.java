/* This is a stub for the Library class */
import java.util.Hashtable;

public class Library extends Building {
  //attribute hashtable for the library collection
  private Hashtable<String, Boolean> theCollection;
  //Library constructor
    public Library(String name, String address, int nFloors) {
      //calls super class constructor
      super(name,address,nFloors);
      //sets attribute for the librarys collection to a hashtable that can be edited
      this.theCollection = new Hashtable<String, Boolean>();
      //prints out neat little statement
      System.out.println("You have built a library: 📖");
    }
  
/**
 * adds title to collection
 * @param title
 * @return Nothing
 */
    public void addTitle (String title){
      theCollection.put(title,true);
    }

    /**
     * removes title from collection
     * @param title
     * @return title
     */
    public String removeTitle(String title){
      theCollection.remove(title);
      return title;

    }

    /**
     * checks out(like temporarily removing) a title from the collection
     * @param title
     * @return Nothing
     */
    public void checkOut(String title){
      theCollection.replace(title + " has been checked out", true, false);
    }

    /**
     * returns as in returning the book to the collection
     * @param title
     * @return Nothing
     */
    public void Return(String title){
      theCollection.replace(title + " has been returned", false, true);
    }

    /**
     * checks if the collection contains a title
     * @param title
     * @return T/F if theCollection contains a title
     */
    public boolean containsTitle(String title){
    
      return theCollection.containsKey(title);
    }

    /**
     * checks if a title is avaiable
     * @param title
     * @return T/F depending on if a title is avaible
     */
    public boolean isAvailable(String title){

      if (theCollection.contains(title + "has been checked out")){
        return false;
      } else {
        return true;
      }
    }

    /**
     * prints out the entire collection
     * @param Nothing
     * @return also nothing
     */
    public void printCollection(){
    System.out.println(theCollection.toString());
    }

    //main method
    public static void main(String[] args) {

      Library josten = new Library("Werner Josten Performing Arts Library","Mendenhall Center, 122 Green St, Northampton, MA 01063", 3);
      josten.addTitle("Percy Jackson and the Lightning Thief");
      josten.addTitle("Legendborn");
      josten.checkOut("Legendborn");
      josten.removeTitle("The Most Boring Book Ever Written");
      josten.Return("Legendborn");
      josten.printCollection();

      System.out.println(josten);
    }
  
  }

  