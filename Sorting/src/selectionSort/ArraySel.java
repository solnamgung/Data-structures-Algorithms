package selectionSort;

public class ArraySel {
    private long[] a;
    private int nElems;

    public ArraySel(int max) {
        a = new long[max];
        nElems = 0;
    }
    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }
    public void display() {
        for(int i = 0; i < nElems-1; i++) {
            System.out.print(a[i] + " ");

        }
    }
    public void selectionSort() {
            int out;
            int in;
            int min;

            for(out = 0; out < nElems-1; out++) { // out loop
                min = out; // minimum
                for(in = out+1; in < nElems; in++)  // inner loop
                    if(a[in] < a[min]) //if min greater
                        min = in; // we have a new min
                swap(out, in);
            }
        }
        public void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
