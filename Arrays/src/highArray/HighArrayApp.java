package highArray;

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray arr = new HighArray(maxSize);

        arr.insert(77);
        arr.insert(11);
        arr.insert(33);
        arr.insert(22);
        arr.insert(55);
        arr.insert(44);
        arr.insert(99);
        arr.insert(00);
        arr.insert(66);
        arr.insert(88);

        arr.display();

        int searchKey = 39;
        if(arr.find(searchKey))
            System.out.println("Found " + searchKey);
        else
            System.out.println("Cannot find " + searchKey);

        arr.delete(00);
        arr.delete(11);
        arr.delete(88);

        arr.display();
    }

}
