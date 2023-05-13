//@author Shreyan Wankavala
//112634232
//@recitation 2114

public class Car {

    private Make make;
    private String owner;

    /** A constructor method for Car which takes in two parameters
     *
     * @param make = the make of the car from the enum
     * @param owner = the owner of the car in String
     */
    public Car(Make make,String owner){
        this.make = make;
        this.owner = owner;
    }

    /** A method to return the make of the car
     *
     * @return the make of the car
     */
    public Make getMake(){
        return make;
    }

    /** A method to return the owner of the car
     *
     * @return the owner's name
     */
    public String getOwner(){
        return owner;
    }

    /** A method to set the make of the car after it has been initialized
     *
     * @param make = the make of the car
     */
    public void setMake(Make make){
        this.make = make;
    }

    /** A method to set the owner of the car after he/she has already been set
     *
     * @param owner = the owner of the car
     */
    public void setOwner(String owner){
        this.owner = owner;
    }

    /** A toString method which prints out the make and owner of the car
     *
     * @return the make and owner in a String
     */
    public String toString(){
        return make + "       " + owner + "";
    }
}
