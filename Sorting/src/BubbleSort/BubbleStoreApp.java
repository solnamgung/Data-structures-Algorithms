package BubbleSort;

public class BubbleStoreApp {

    public static void main(String[] args ) {
         int mazSize = 100;
         ArrayBubble arr;
         arr = new ArrayBubble(mazSize);

         arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(33);
        arr.display();

        arr.bubbleSort();
        System.out.println("");
        arr.display();




    }
}
