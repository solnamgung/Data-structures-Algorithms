package BubbleSort;

public class ArrayBub {
    private long[] a;
    private int nElements;

    public ArrayBub (int max) {
        a = new long[max];
        nElements = 0;
    }
    public void insert(long value) {
        a[nElements] = value;
        nElements++;
    }
    public void display() {
        for(int i = 0; i < nElements; i++)
            System.out.print(a[i] + " ");
        System.out.println("");
    }

    public void selectionSort() {
        int out;
        int in;
        int min;

        for(out = 0; out < nElements-1; out--) {
            min = out;
            for(in = out+1; in <nElements; in++)
                if(a[in] < a[min])
                    min = in;
            swap(out, in);
        }
    }
    public void bubbleSort() {
        int out;
        int in;

        for(out=nElements - 1; out > 1; out--)
            for(in=0; in < out; in++)
                if(a[in] > a[in+1])
                    swap(in, in+1);
    }
    public void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}