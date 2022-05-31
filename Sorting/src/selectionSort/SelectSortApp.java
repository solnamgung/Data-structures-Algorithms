package selectionSort;

public class SelectSortApp {
    public static void main(String[] args) {
        int maxsize = 100;
        ArraySel arr;
        arr = new ArraySel(maxsize);

        arr.insert(77);
        arr.insert(88);
        arr.insert(66);
        arr.insert(88);
        arr.insert(100);
        arr.insert(22);
        arr.insert(33);
        arr.insert(11);
        arr.insert(55);

        arr.display();
        arr.selectionSort();

        System.out.println("");
        arr.display();


    }
}
