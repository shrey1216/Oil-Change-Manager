//@author Shreyan Wankavala

public class CarList {

    private CarListNode head;
    private CarListNode tail;
    private CarListNode cursor;
    private CarListNode copy;
    private int num;


    /** The constructor for CarList which initializes head, tail, cursor, and copy to null, and num to 0
     *
     */
    public CarList(){
        this.head = null;
        this.tail = null;
        this.cursor = null;
        this.copy = null;
        this.num = 0;
    }

    /** A method to return the number of cars in a given list
     *
     * @return the int value of cars
     */
    public int numCars(){
        return num;
    }

    /** A method to return the car at a given cursor
     *
     * @return the car at the cursor
     */
    public Car getCursorCar(){
        return cursor.getData();
    }

    /** A method to access the cursor using a getter
     *
     * @return the value of the cursor
     */
    public CarListNode getCursor(){
        return this.cursor;
    }

    /** A method to set the value of the copy variable
     *
     * @param copy = the value of copy which is of type CarListNode
     */
    public void setCopy(CarListNode copy){
        this.copy = copy;
    }

    /** A method to access the copy using a getter
     *
     * @return the value of copy
     */
    public CarListNode getCopy(){
        return this.copy;
    }

    /** A method to reset the position of the cursor to the head
     *
     */
    public void resetCursorToHead(){
        cursor = head;
    }

    /** A method to reset the position of the cursor to the tail
     *
     */
    public void resetCursorToTail(){
        cursor = tail;
    }

    /** A method to move the cursor forward to the next node in the list
     *
     */
    public void cursorForward(){
        cursor = cursor.getNext();
    }

    /** A method to move the cursor backward to the previous node in the list
     *
     */
    public void cursorBackward(){
        cursor = cursor.getPrev();
    }

    /** A method to allow a car to be inserted into the list before the position of the cursor
     *
     * @param newCar = the car that is to be inserted
     */
    public void insertBeforeCursor(Car newCar){
        CarListNode newNode = new CarListNode(newCar);
        if(cursor.equals(head)){
            head.setPrev(newNode);
            newNode.setNext(head);
           head = newNode;
        }
        else{
            CarListNode temp = cursor.getPrev();
            cursor.getPrev().setNext(newNode);
            cursor.setPrev(newNode);
            newNode.setNext(cursor);
            newNode.setPrev(temp);
        }
        num++;
    }

    /** A method which adds a new car at the end of the list
     *
     * @param newCar = the car that is to be added to the end of the list
     */
    public void appendToTail(Car newCar){
        CarListNode newNode = new CarListNode(newCar);
        if(num == 0){
            head = newNode;
            cursor = head;
        }
        else{
            tail.setNext(newNode);
            newNode.setPrev(tail);
        }
        tail = newNode;
        num++;
    }

    /** A method to remove the node at a given cursor's location.
     *
     * @return the car which was removed
     */
    public Car removeCursor(){
        copy = cursor;
        if(num == 1){
           head = null;
           tail = null;
           cursor = null;
            num--;
        }
        else if(cursor.equals(head)){
            head = cursor.getNext();
            cursor.getNext().setPrev(null);
            cursor = head;
            num--;
        }
        else if(cursor.equals(tail)){
            tail = cursor.getPrev();
            cursor.getPrev().setNext(null);
            cursor = tail;
            num--;
        }
        else{
            cursor.getPrev().setNext(cursor.getNext());
            cursor.getNext().setPrev(cursor.getPrev());
            cursor = cursor.getNext();
            num--;
        }
        return copy.getData();
    }

    /** A method to remove the node at a given cursor's location without setting a value to copy.
     *
     */
    public void removeCursorNew(){
        if(num == 1){
            head = null;
            tail = null;
            cursor = null;
            num--;
        }

        else if(cursor.equals(head)){
            head = cursor.getNext();
            cursor.getNext().setPrev(null);
            cursor = head;
            num--;
        }
        else if(cursor.equals(tail)){
            tail = cursor.getPrev();
            cursor.getPrev().setNext(null);
            cursor = tail;
            num--;
        }
        else{
            cursor.getPrev().setNext(cursor.getNext());
            cursor.getNext().setPrev(cursor.getPrev());
            cursor = cursor.getNext();
            num--;
        }
    }

    /** A method to print Joe and Donny's lists
     *
     */
    public void printList(){
        CarListNode temp = head;
        if(num == 0){
            System.out.print("\n[EMPTY]");
        }
        while(temp != null){
            if(cursor.equals(temp)) {
                System.out.print("\n->" + temp.getData().toString());
            }
            else{
                System.out.print("\n" + temp.getData().toString());
            }
            temp = temp.getNext();
        }
    }

    /** A method to print the finished cars' list
     *
     */
    public void printListFinished(){
        CarListNode temp = head;
        if(num == 0){
            System.out.print("\n[EMPTY]");
        }
        while(temp != null){
            System.out.print("\n" + temp.getData().toString());
            temp = temp.getNext();
        }
    }
}
