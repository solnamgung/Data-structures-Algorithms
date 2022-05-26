package BubbleSort;

public class ArrayBubble {
    private long[] a; //ref to array a
    private int nElements; //number of data items

    public ArrayBubble(int max) {
        a = new long[max]; //create the array
        nElements = 0; //no items yet
    }

    public void insert(long value) { // put element into Array
        a[nElements] = value;
        nElements ++;
    }
    public void display() {
        for(int i=0; i < nElements; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public void bubbleSort() {
        int out;
        int in;

        for(out = nElements-1; out > 1; out--) {
            for(in = 0; in < out; in++) {
                if(a[in] > a[in+1])
                    swap(in , in+1);
            }
        }
    }
    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
