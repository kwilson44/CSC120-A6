import java.util.ArrayList;
/* This is a stub for the House class */


public class House extends Building {

//attributes to represent the residents and dinninghall (or lack their of) at Morris House
private ArrayList<String> residents;
private boolean hasDiningRoom;

//House constructor
public House(String name, String address, int nFloors, boolean hasDR) {
  //calls super class constructor
  super(name, address, nFloors); 
 //using the this keyword to indicate that I'm referring to the attribute resident... this current object :D Also initalizing it to a new arraylist
this.residents = new ArrayList<String>();
//using this keyword to set attribute to this parameter because since the attribute is private we need the parameter to change things.
this.hasDiningRoom = hasDR;
//prints out nice little statement
System.out.println("You have built a house: 🏠");
  
}

public String toString(){
  //overriding??
  return super.toString() + this.getName() + " is the best house on campus";
}

 /**
   * This returns a true or false value if a house has a dinning room or not
   * @parameter Nothing
   * @return T/F if the house has a dinning room.
   */
public boolean getDRValue() {
  return this.hasDiningRoom;
}

 /**
   * This returns the number of residents at the house
   * @parameter Nothing
   * @return the number of residents
   */
public int getNResident(){
  return residents.size();
}

 /**
   * This adds the name of the new resident to the arraylist
   * @parameter the name of a resident, the type is String
   * @return Nothing
   */
public void moveIn (String name){
  residents.add(name);
  
}

 /**
   * Removes residents name that is moving out from arraylist
   * @parameter  the name of a resident, the type is String
   * @return name/parameter
   */
public String moveOut (String name){
  residents.remove(name);
  return name;
}

/**
 * checks if person is a resident at the house
 * @param person
 * @return T/F if the name is contained in the list of all the residents
 */
public boolean isResident(String person){
  return residents.contains(person);
}

//main method
  public static void main(String[] args) {
    House morris = new House ("Morris House","Northampton, MA 01063",4,false);
    morris.moveIn("Katie Wilson");
    //prints out Morris House, aka the best house
    System.out.println(morris);

  }

}




