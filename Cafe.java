/* This is a stub for the Cafe class */
public class Cafe extends Building {


    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory
  
    //Cafe constructor
    public Cafe(String name, String address, int nFloors,int numCO, int numSP, int numCr, int numCu) {
        //calls super class constructor
        super(name,address,nFloors);

        //setting the private attributes to editable parameters
        this.nCoffeeOunces = numCO;
        this.nSugarPackets = numSP;
        this.nCreams = numCr;
        this.nCups = numCu;

        System.out.println("You have built a cafe: ☕");
    }

    /**
     * Calculates the math for Cafe stock
     * @param size
     * @param nSugarPackets
     * @param nCreams
     * @return Nothing
     */
    
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
       if (size > this.nCoffeeOunces || nSugarPackets > this.nSugarPackets || nCreams > this.nCreams || this.nCups == 0){
        this.restock(size,nSugarPackets,nCreams, nCups);
       }
       
       //I know there's a more effiecent way of doing this math but it makes my brain itchy
        this.nCoffeeOunces = this.nCoffeeOunces-size;
        this.nSugarPackets = this.nSugarPackets-nSugarPackets;
        this.nCreams = this.nCreams-nCreams;
        this.nCups = nCups-1;
    }

/**
 * restocks the Cafe's inventory
 * @param size
 * @param nSugarPackets
 * @param nCreams
 * @param nCups
 * @return Nothing
 */
    private void restock(int size, int nSugarPackets, int nCreams, int nCups){
      this.nCoffeeOunces = this.nCoffeeOunces + size;
      this.nSugarPackets = this.nSugarPackets + size;
      this.nCreams = this.nCreams + size;
      this.nCups =  this.nCups + size;
    }
    public static void main(String[] args) {
        Cafe compass = new Cafe ("Compass Cafe","Smith College", 8,9,10,22,8);
            compass.sellCoffee(12, 2, 3);
            compass.restock(10,10,10,10);
            System.out.println(compass);
    }
    
}
