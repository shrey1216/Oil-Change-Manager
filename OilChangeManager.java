//@author Shreyan Wankavala
//112634232
//@recitation 2114

import java.util.Scanner;

public class OilChangeManager {
    public static void main(String[]args){

        CarList joe = new CarList();
        CarList donny = new CarList();
        CarList pickup = new CarList();
        CarList merge = new CarList();


        Scanner scan = new Scanner(System.in);

        System.out.print("\nWelcome to Tony's Discount Oil Change Computer Management System! It's way better than a rolodex, cork board, post-its, and pre-chewed bubblegum!\n");

        String command = "";
        String option;
        String mechanic;

        while(!command.equals("Q")){
            System.out.print("\nMenu:" +
                    "\n" +
                    "     L) Edit Job Lists for Joe and Donny" +
                    "\n" +
                    "     M) Merge Job Lists" +
                    "\n" +
                    "     P) Print Job Lists" +
                    "\n" +
                    "     F) Paste car to end of finished car list" +
                    "\n" +
                    "     Q) Quit\n");

            System.out.print("\nPlease select an option: ");
            command = scan.nextLine();
            command = command.toUpperCase();
            if(command.equals("L")){
                System.out.print("\nPlease Select a List - Joe (J) or Donny (D):");
                mechanic = scan.nextLine();
                mechanic = mechanic.toUpperCase();
                if(!(mechanic.equals("J") || mechanic.equals("D"))){
                    System.out.print("\nThat mechanic does not work here. Sorry!\n");
                    continue;
                }
                System.out.print("\nOptions:" +
                        "\n" +
                        "     A) Add a car to the end of the list" +
                        "\n" +
                        "     F) Cursor Forward" +
                        "\n" +
                        "     H) Cursor to Head" +
                        "\n" +
                        "     T) Cursor to Tail" +
                        "\n" +
                        "     B) Cursor Backward" +
                        "\n" +
                        "     I) Insert car before cursor" +
                        "\n" +
                        "     X) Cut car at cursor" +
                        "\n" +
                        "     V) Paste before cursor" +
                        "\n" +
                        "     R) Remove cursor\n");
                System.out.print("\nPlease select an option:");
                option = scan.nextLine();
                option = option.toUpperCase();
                if(option.equals("A")){
                    System.out.print("Please enter a vehicle make (Ford, GMC, Chevy, Jeep, Dodge, Chrysler, and Lincoln):");
                    String make = scan.nextLine().toUpperCase();
                    System.out.print("Please enter the owner's name:");
                    String owner = scan.nextLine();
                    if(make.equals("FORD")) {
                        Car car = new Car(Make.FORD, owner);
                        if(mechanic.equals("J")) {
                            joe.appendToTail(car);
                            System.out.print("\n" + owner + "'s " + make + " has been scheduled for an oil change with Joe and has been added to his list!\n");
                        }
                        else{
                            donny.appendToTail(car);
                            System.out.print("\n" + owner + "'s " + make + " has been scheduled for an oil change with Donny and has been added to his list!\n");
                        }
                        //this is where we wrapped the car into the car list node
                        //the car we put in is the data of type Car that went into the constructor with the make and owner of the car.
                    }
                    else if(make.equals("GMC")) {
                        Car car = new Car(Make.GMC, owner);
                        if(mechanic.equals("J")) {
                            joe.appendToTail(car);
                            System.out.print("\n" + owner + "'s " + make + " has been scheduled for an oil change with Joe and has been added to his list!\n");
                        }
                        else{
                            donny.appendToTail(car);
                            System.out.print("\n" + owner + "'s " + make + " has been scheduled for an oil change with Donny and has been added to his list!\n");
                        }
                    }
                    else if(make.equals("CHEVY")) {
                        Car car = new Car(Make.CHEVY, owner);
                        if(mechanic.equals("J")) {
                            joe.appendToTail(car);
                            System.out.print("\n" + owner + "'s " + make + " has been scheduled for an oil change with Joe and has been added to his list!\n");
                        }
                        else{
                            donny.appendToTail(car);
                            System.out.print("\n" + owner + "'s " + make + " has been scheduled for an oil change with Donny and has been added to his list!\n");
                        }
                    }
                    else if(make.equals("JEEP")) {
                        Car car = new Car(Make.JEEP, owner);
                        if(mechanic.equals("J")) {
                            joe.appendToTail(car);
                            System.out.print("\n" + owner + "'s " + make + " has been scheduled for an oil change with Joe and has been added to his list!\n");
                        }
                        else{
                            donny.appendToTail(car);
                            System.out.print("\n" + owner + "'s " + make + " has been scheduled for an oil change with Donny and has been added to his list!\n");
                        }
                    }
                    else if(make.equals("DODGE")) {
                        Car car = new Car(Make.DODGE, owner);
                        if(mechanic.equals("J")) {
                            joe.appendToTail(car);
                            System.out.print("\n" + owner + "'s " + make + " has been scheduled for an oil change with Joe and has been added to his list!\n");
                        }
                        else{
                            donny.appendToTail(car);
                            System.out.print("\n" + owner + "'s " + make + " has been scheduled for an oil change with Donny and has been added to his list!\n");
                        }
                    }
                    else if(make.equals("CHRYSLER")) {
                        Car car = new Car(Make.CHRYSLER, owner);
                        if(mechanic.equals("J")) {
                            joe.appendToTail(car);
                            System.out.print("\n" + owner + "'s " + make + " has been scheduled for an oil change with Joe and has been added to his list!\n");
                        }
                        else{
                            donny.appendToTail(car);
                            System.out.print("\n" + owner + "'s " + make + " has been scheduled for an oil change with Donny and has been added to his list!\n");
                        }
                    }
                    else if(make.equals("LINCOLN")) {
                        Car car = new Car(Make.LINCOLN, owner);
                        if(mechanic.equals("J")) {
                            joe.appendToTail(car);
                            System.out.print("\n" + owner + "'s " + make + " has been scheduled for an oil change with Joe and has been added to his list!\n");
                        }
                        else{
                            donny.appendToTail(car);
                            System.out.print("\n" + owner + "'s " + make + " has been scheduled for an oil change with Donny and has been added to his list!\n");
                        }
                    }
                    else{
                        System.out.print("\nWe don't service " + make + "!\n");
                    }
                }
                else if(option.equals("F")){
                    if(mechanic.equals("J")){
                        if(joe.numCars() == 0){
                            System.out.print("\nThe line is empty! Add a car to interact with the cursor.\n");
                            continue;
                        }
                        else if(joe.getCursor().getNext() == null){
                            System.out.print("\nThere is no car at this location!\n");
                            continue;
                        }
                        System.out.print("\nThe cursor has been moved forward in Joe's list!\n");
                        joe.cursorForward();
                    }
                    else{
                        if(donny.numCars() == 0){
                            System.out.print("\nThe line is empty! Add a car to interact with the cursor.\n");
                            continue;
                        }
                        else if(donny.getCursor().getNext() == null){
                            System.out.print("\nThere is no car at this location!\n");
                            continue;
                        }
                        System.out.print("\nThe cursor has been moved forward in Donny's list!\n");
                        donny.cursorForward();
                    }
                }
                else if(option.equals("H")){
                    if(mechanic.equals("J")){
                        if(joe.numCars() == 0){
                            System.out.print("\nThe line is empty! Add a car to interact with the cursor.\n");
                            continue;
                        }
                        System.out.print("\nThe cursor has been moved to the front of Joe's list!\n");
                        joe.resetCursorToHead();
                    }
                    else{
                        if(donny.numCars() == 0){
                            System.out.print("\nThe line is empty! Add a car to interact with the cursor.\n");
                            continue;
                        }
                        System.out.print("\nThe cursor has been moved to the front of Donny's list!\n");
                        donny.resetCursorToHead();
                    }
                }
                else if(option.equals("T")){
                    if(mechanic.equals("J")){
                        if(joe.numCars() == 0){
                            System.out.print("\nThe line is empty! Add a car to interact with the cursor.\n");
                            continue;
                        }
                        System.out.print("\nThe cursor has been moved to the end of Joe's list!\n");
                        joe.resetCursorToTail();
                    }
                    else{
                        if(donny.numCars() == 0){
                            System.out.print("\nThe line is empty! Add a car to interact with the cursor.\n");
                            continue;
                        }
                        System.out.print("\nThe cursor has been moved to the end of Donny's list!\n");
                        donny.resetCursorToTail();
                    }
                }
                else if(option.equals("B")){
                    if(mechanic.equals("J")){
                        if(joe.numCars() == 0){
                            System.out.print("\nThe line is empty! Add a car to interact with the cursor.\n");
                            continue;
                        }
                        else if(joe.getCursor().getPrev() == null){
                            System.out.print("\nThere is no car at this location!\n");
                            continue;
                        }
                        System.out.print("\nThe cursor has been moved backward in Joe's list!\n");
                        joe.cursorBackward();
                    }
                    else{
                        if(donny.numCars() == 0){
                            System.out.print("\nThe line is empty! Add a car to interact with the cursor.\n");
                            continue;
                        }
                        else if(donny.getCursor().getPrev() == null){
                            System.out.print("\nThere is no car at this location!\n");
                            continue;
                        }
                        System.out.print("\nThe cursor has been moved backward in Donny's list!\n");
                        donny.cursorBackward();
                    }
                }
                else if(option.equals("I")){
                    System.out.print("Please enter a vehicle make (Ford, GMC, Chevy, Jeep, Dodge, Chrysler, and Lincoln):");
                    String make = scan.nextLine().toUpperCase();
                    System.out.print("Please enter the owner's name:");
                    String owner = scan.nextLine();
                    if(make.equals("FORD")) {
                        Car car = new Car(Make.FORD, owner);
                        if(mechanic.equals("J")) {
                            if(joe.numCars() == 0){
                                System.out.print("\nThe line is empty! Add a car to interact with the cursor.\n");
                                continue;
                            }
                            joe.insertBeforeCursor(car);
                            System.out.print("\n" + owner + "'s " + make + " has been scheduled for an oil change with Joe and has been added to his list before the cursor!\n");
                        }
                        else{
                            if(donny.numCars() == 0){
                                System.out.print("\nThe line is empty! Add a car to interact with the cursor.\n");
                                continue;
                            }
                            donny.insertBeforeCursor(car);
                            System.out.print("\n" + owner + "'s " + make + " has been scheduled for an oil change with Donny and has been added to his list before the cursor!\n");
                        }
                    }
                    else if(make.equals("GMC")) {
                        Car car = new Car(Make.GMC, owner);
                        if(mechanic.equals("J")) {
                            if(joe.numCars() == 0){
                                System.out.print("\nThe line is empty! Add a car to interact with the cursor.\n");
                                continue;
                            }
                            joe.insertBeforeCursor(car);
                            System.out.print("\n" + owner + "'s " + make + " has been scheduled for an oil change with Joe and has been added to his list before the cursor!\n");
                        }
                        else{
                            if(donny.numCars() == 0){
                                System.out.print("\nThe line is empty! Add a car to interact with the cursor.\n");
                                continue;
                            }
                            donny.insertBeforeCursor(car);
                            System.out.print("\n" + owner + "'s " + make + " has been scheduled for an oil change with Donny and has been added to his list before the cursor!\n");
                        }
                    }
                    else if(make.equals("CHEVY")) {
                        Car car = new Car(Make.CHEVY, owner);
                        if(mechanic.equals("J")) {
                            if(joe.numCars() == 0){
                                System.out.print("\nThe line is empty! Add a car to interact with the cursor.\n");
                                continue;
                            }
                            joe.insertBeforeCursor(car);
                            System.out.print("\n" + owner + "'s " + make + " has been scheduled for an oil change with Joe and has been added to his list before the cursor!\n");
                        }
                        else{
                            if(donny.numCars() == 0){
                                System.out.print("\nThe line is empty! Add a car to interact with the cursor.\n");
                                continue;
                            }
                            donny.insertBeforeCursor(car);
                            System.out.print("\n" + owner + "'s " + make + " has been scheduled for an oil change with Donny and has been added to his list before the cursor!\n");
                        }
                    }
                    else if(make.equals("JEEP")) {
                        Car car = new Car(Make.JEEP, owner);
                        if(mechanic.equals("J")) {
                            if(joe.numCars() == 0){
                                System.out.print("\nThe line is empty! Add a car to interact with the cursor.\n");
                                continue;
                            }
                            joe.insertBeforeCursor(car);
                            System.out.print("\n" + owner + "'s " + make + " has been scheduled for an oil change with Joe and has been added to his list before the cursor!\n");
                        }
                        else{
                            if(donny.numCars() == 0){
                                System.out.print("\nThe line is empty! Add a car to interact with the cursor.\n");
                                continue;
                            }
                            donny.insertBeforeCursor(car);
                            System.out.print("\n" + owner + "'s " + make + " has been scheduled for an oil change with Donny and has been added to his list before the cursor!\n");
                        }
                    }
                    else if(make.equals("DODGE")) {
                        Car car = new Car(Make.DODGE, owner);
                        if(mechanic.equals("J")) {
                            if(joe.numCars() == 0){
                                System.out.print("\nThe line is empty! Add a car to interact with the cursor.\n");
                                continue;
                            }
                            joe.insertBeforeCursor(car);
                            System.out.print("\n" + owner + "'s " + make + " has been scheduled for an oil change with Joe and has been added to his list before the cursor!\n");
                        }
                        else{
                            if(donny.numCars() == 0){
                                System.out.print("\nThe line is empty! Add a car to interact with the cursor.\n");
                                continue;
                            }
                            donny.insertBeforeCursor(car);
                            System.out.print("\n" + owner + "'s " + make + " has been scheduled for an oil change with Donny and has been added to his list before the cursor!\n");
                        }
                    }
                    else if(make.equals("CHRYSLER")) {
                        Car car = new Car(Make.CHRYSLER, owner);
                        if(mechanic.equals("J")) {
                            if(joe.numCars() == 0){
                                System.out.print("\nThe line is empty! Add a car to interact with the cursor.\n");
                                continue;
                            }
                            joe.insertBeforeCursor(car);
                            System.out.print("\n" + owner + "'s " + make + " has been scheduled for an oil change with Joe and has been added to his list before the cursor!\n");
                        }
                        else{
                            if(donny.numCars() == 0){
                                System.out.print("\nThe line is empty! Add a car to interact with the cursor.\n");
                                continue;
                            }
                            donny.insertBeforeCursor(car);
                            System.out.print("\n" + owner + "'s " + make + " has been scheduled for an oil change with Donny and has been added to his list before the cursor!\n");
                        }
                    }
                    else if(make.equals("LINCOLN")) {
                        Car car = new Car(Make.LINCOLN, owner);
                        if(mechanic.equals("J")) {
                            if(joe.numCars() == 0){
                                System.out.print("\nThe line is empty! Add a car to interact with the cursor.\n");
                                continue;
                            }
                            joe.insertBeforeCursor(car);
                            System.out.print("\n" + owner + "'s " + make + " has been scheduled for an oil change with Joe and has been added to his list before the cursor!\n");
                        }
                        else{
                            if(donny.numCars() == 0){
                                System.out.print("\nThe line is empty! Add a car to interact with the cursor.\n");
                                continue;
                            }
                            donny.insertBeforeCursor(car);
                            System.out.print("\n" + owner + "'s " + make + " has been scheduled for an oil change with Donny and has been added to his list before the cursor!\n");
                        }
                    }
                    else{
                        System.out.print("\nWe don't service " + make + "!\n");
                    }
                }
                else if(option.equals("X")){
                    if(mechanic.equals("J")){
                        if(joe.numCars() == 0){
                            System.out.print("\nThe line is empty! Add a car to interact with the cursor.\n");
                            continue;
                        }
                        System.out.print("\nThe car at the cursor has been cut in Joe's list!\n");
                        joe.removeCursor();
                        donny.setCopy(joe.getCopy());
                        pickup.setCopy(joe.getCopy());
                    }
                    else{
                        if(donny.numCars() == 0){
                            System.out.print("\nThe line is empty! Add a car to interact with the cursor.\n");
                            continue;
                        }
                        System.out.print("\nThe car at the cursor has been cut in Donny's list!\n");
                        donny.removeCursor();
                        joe.setCopy(donny.getCopy());
                        pickup.setCopy(donny.getCopy());
                    }
                }
                else if(option.equals("V")){
                    if(mechanic.equals("J")){
                        if(joe.numCars() == 0){
                            System.out.print("\nThe line is empty! Add a car to interact with the cursor.\n");
                            continue;
                        }
                        else if(joe.getCopy() == null){
                            System.out.print("\nYou haven't copied anything yet!\n");
                            continue;
                        }
                        System.out.print("\nCursor pasted in Joe's list!\n");
                        joe.insertBeforeCursor(joe.getCopy().getData());
                    }
                    else{
                        if(donny.numCars() == 0){
                            System.out.print("\nThe line is empty! Add a car to interact with the cursor.\n");
                            continue;
                        }
                        else if(donny.getCopy() == null){
                            System.out.print("\nYou haven't copied anything yet!\n");
                            continue;
                        }
                        System.out.print("\nCursor pasted in Donny's list!\n");
                        donny.insertBeforeCursor(donny.getCopy().getData());
                    }
                }
                else if(option.equals("R")){
                    if(mechanic.equals("J")){
                        if(joe.numCars() == 0){
                            System.out.print("\nThe line is empty! Add a car to interact with the cursor.\n");
                            continue;
                        }
                        System.out.print("\nThe car at the cursor has been removed in Joe's list!\n");
                        joe.removeCursorNew();
                    }
                    else{
                        if(donny.numCars() == 0){
                            System.out.print("\nThe line is empty! Add a car to interact with the cursor.\n");
                            continue;
                        }
                        System.out.print("\nThe car at the cursor has been removed in Donny's list!\n");
                        donny.removeCursorNew();
                    }
                }
                else{
                    System.out.print("\nPlease pick a valid option!\n");
                }
            }
            else if(command.equals("M")){
                System.out.print("\nPlease select a destination list - Joe (J) or Donny (D):");
                mechanic = scan.nextLine().toUpperCase();
                if(mechanic.equals("J")){
                    int size1 = joe.numCars();
                    int size2 = donny.numCars();

                    if(size1 == size2){
                        for(int i = 0; i < size1; i++){
                            joe.resetCursorToHead();
                            donny.resetCursorToHead();

                            merge.appendToTail(joe.getCursorCar());
                            joe.removeCursor();
                            merge.appendToTail(donny.getCursorCar());
                            donny.removeCursor();
                        }
                    }
                    else if(size1 < size2){
                        for(int i = 0; i < size1; i++){
                            joe.resetCursorToHead();
                            donny.resetCursorToHead();

                            merge.appendToTail(joe.getCursorCar());
                            joe.removeCursor();
                            merge.appendToTail(donny.getCursorCar());
                            donny.removeCursor();
                        }
                        for(int i = 0; i < size2 - size1; i++){
                            donny.resetCursorToHead();

                            merge.appendToTail(donny.getCursorCar());
                            donny.removeCursor();
                        }
                    }
                    else if(size1 > size2){
                        for(int i = 0; i < size2; i++){
                            joe.resetCursorToHead();
                            donny.resetCursorToHead();

                            merge.appendToTail(joe.getCursorCar());
                            joe.removeCursor();
                            merge.appendToTail(donny.getCursorCar());
                            donny.removeCursor();
                        }
                        for(int i = 0; i < size1 - size2; i++){
                            joe.resetCursorToHead();

                            merge.appendToTail(joe.getCursorCar());
                            joe.removeCursor();
                        }
                    }

                    System.out.print("\nDonny's list merged into Joe's!\n");
                    joe = merge;
                    merge = new CarList();

                }
                else if(mechanic.equals("D")){
                    int size1 = joe.numCars();
                    int size2 = donny.numCars();

                    if(size1 == size2){
                        for(int i = 0; i < size1; i++){
                            donny.resetCursorToHead();
                            joe.resetCursorToHead();

                            merge.appendToTail(donny.getCursorCar());
                            donny.removeCursor();
                            merge.appendToTail(joe.getCursorCar());
                            joe.removeCursor();
                        }
                    }
                    else if(size1 < size2){
                        for(int i = 0; i < size1; i++){
                            donny.resetCursorToHead();
                            joe.resetCursorToHead();

                            merge.appendToTail(donny.getCursorCar());
                            donny.removeCursor();
                            merge.appendToTail(joe.getCursorCar());
                            joe.removeCursor();
                        }
                        for(int i = 0; i < size2 - size1; i++){
                            donny.resetCursorToHead();

                            merge.appendToTail(donny.getCursorCar());
                            donny.removeCursor();
                        }
                    }
                    else if(size1 > size2){
                        for(int i = 0; i < size2; i++){
                            donny.resetCursorToHead();
                            joe.resetCursorToHead();

                            merge.appendToTail(donny.getCursorCar());
                            donny.removeCursor();
                            merge.appendToTail(joe.getCursorCar());
                            joe.removeCursor();
                        }
                        for(int i = 0; i < size1 - size2; i++){
                            joe.resetCursorToHead();

                            merge.appendToTail(joe.getCursorCar());
                            joe.removeCursor();
                        }
                    }

                    System.out.print("\nJoe's list merged into Donny's!\n");
                    donny = merge;
                    merge = new CarList();

                }
                else{
                    System.out.print("\nThat mechanic does not work here. Sorry!\n");
                }
            }
            else if(command.equals("P")){
                System.out.print("\nJoe's List: ");
                System.out.print("\nMake       Owner");
                System.out.print("\n----------------------");
                joe.printList();
                System.out.print("\n");

                System.out.print("\nDonny's List: ");
                System.out.print("\nMake       Owner");
                System.out.print("\n----------------------");
                donny.printList();
                System.out.print("\n");

                System.out.print("\nFinished List: ");
                System.out.print("\nMake       Owner");
                System.out.print("\n----------------------");
                pickup.printListFinished();
                System.out.print("\n");
            }
            else if(command.equals("F")){
                if(pickup.getCopy() == null){
                    System.out.print("\nYou haven't copied anything yet!\n");
                }
                else {
                    System.out.print("\nThe car was pasted to the finished list!\n");
                    pickup.appendToTail(pickup.getCopy().getData());
                }
            }
            else if(command.equals("Q")){
            }
            else{
                System.out.println("\nYou must enter a command from the menu! Try again.");
            }
        }

        System.out.print("\nENJOY YOUR RETIREMENT! TOODLES!\n");
        scan.close();
    }
}
