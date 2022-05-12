package binarySearch;

public class OrdArray {
    private long[] a;
    private int nElement;

    public OrdArray(int max) {
        a = new long[max];
        nElement = 0;
    }

    public int size() {
        return nElement;
    }
    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElement -1;
        int currentIndex;

        while(true) {
            currentIndex = (lowerBound + upperBound) / 2;
            if(a[currentIndex] == searchKey) {
                return currentIndex;
            } else if(a[currentIndex] < searchKey){
                lowerBound = currentIndex + 1;
            } else
                upperBound = currentIndex - 1;
        }
    }
    public void insert(long value) {
        int i;
        for(i = 0; i < nElement; i++)
            if(a[i] > value)
                break;
        for(int k = nElement; k > i; k--)
            a[k] = a[k-1];

        a[i] = value;
        nElement++;

    }
    public boolean delete (long value) {
        int j = find(value);
        if(j == nElement)
            return false;
        else {
            for(int k = j; k < nElement; k++)
                a[k] = a[k+1];
            nElement--;
            return true;
        }
//        int j;
//        for(j = 0; j <nElement; j++) {
//            if(a[j] == value)
//                break;
//        }
//        for(int k = j; k < nElement; k++) {
//            a[k] = a[k+1];
//        }
//        nElement--;
//        return true;
    }
    public void display() {
        for(int i = 0; i < nElement; i++)
            System.out.print(a[i] + " ");
        System.out.println(" ");
    }
}
