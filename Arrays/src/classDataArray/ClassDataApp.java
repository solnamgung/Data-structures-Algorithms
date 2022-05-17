package classDataArray;

/*
insert() method creates a new Person object and inserts it in the array, instead of inserting a long value.
we'll insert 10 items, display them, search for 1 item, delete 3 items and display them all again.
 */

//Data items as class objects
public class ClassDataApp {

    public static void main(String[] args) {
        int maxSize=100;
        ClassDataArray arr;
        arr = new ClassDataArray(maxSize);

        arr.insert("sol", "namgung", 33);
        arr.insert("song", "namgung", 30);
        arr.insert("pyeong", "namguung", 25);
        arr.insert("hina", "chang", 15);

        arr.displayA();

        String searchKey = "Stimson";
        Person found;
        found = arr.find(searchKey);

        if(found != null) {
            System.out.println("Found " + searchKey );
            found.displayPerson();
        } else
            System.out.println("Cannot find " + searchKey);

        System.out.println("Deleting sol");

        arr.delete("sol");

        arr.displayA();
    }
}
