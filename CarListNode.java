//@author Shreyan Wankavala
//112634232
//@recitation 2114

public class CarListNode {

    private Car data;
    private CarListNode next;
    private CarListNode prev;

    /** The CarListNode constructor which wraps a node around a car object
     *
     * @param initData
     */
    public CarListNode(Car initData){
        this.data = initData;
    }

    /** A method to return the next element in the list
     *
     * @return
     */
    public CarListNode getNext(){
        return next;
    }

    /** A method to return the previous element in the list
     *
     * @return
     */
    public CarListNode getPrev(){
        return prev;
    }

    /** A method to return the data of a car with it's make and owner
     *
     * @return
     */
    public Car getData(){
        return this.data;
    }

    /** A method a set the next element in the list
     *
     * @param next = the next element in the list of type Car
     */
    public void setNext(CarListNode next){
        this.next = next;
    }

    /** A method to set the previous element in the list
     *
     * @param prev = the previous element in the list of type Car
     */
    public void setPrev(CarListNode prev){
        this.prev = prev;
    }

}
