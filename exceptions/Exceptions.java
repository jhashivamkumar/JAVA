import java.util.ArrayList;

public class Exceptions{
    // Part 1: Make an ArrayList with both numbers and strings in it. Loop through the list and try assigning each item to an int variable. It should throw a ClassCastException if there's an error. Utilize exception handling to print out either the number or the string ERROR ON INDEX {#}. The program should continue after printing this to the console.

    // public void testing(){
        // ArrayList<Object> myList = new ArrayList<>();
        // myList.add("13");
        // myList.add("hello world");
        // myList.add(48);
        // myList.add("Goodbye World");
        // for(int i=0; i<myList.size(); i++){
        //     try {
        //         Integer castedValue = (Integer) myList.get(i);
        //         System.out.println(castedValue);
        //     } catch(ClassCastException e) {
        //         System.err.println("ERROR ON INDEX "+i);
        //     }
        // }

        // Part 2: Remove the exception handling and write code that the compiler will catch. Utilize generics so that you cannot compile the code while you are trying to add mixed types to the list.

    public ArrayList<String> testing(){
        ArrayList<String> myList = new ArrayList<>();
        // Specified that myList will be an ArrayList of Strings only
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        // remove line 28 and complier will run
        myList.add("Goodbye World");
        return myList;
    }
}
