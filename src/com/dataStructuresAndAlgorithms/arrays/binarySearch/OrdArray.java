package com.dataStructuresAndAlgorithms.arrays.binarySearch;

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
        int lowBound = 0;
        int upperBound = nElement - 1;
        int currentIndex = (lowBound + upperBound) / 2;

        while(true) {
            if(a[currentIndex] == searchKey)
                return currentIndex;
            else if(lowBound > upperBound)
                return nElement;
            else {
                if(a[currentIndex] < searchKey)
                    lowBound = currentIndex + 1; //it's in upper half
                else
                    upperBound = currentIndex - 1; //it's in lower half
            }
        }
    }
    public void insert(long value) { //put element into array
        int j;
        for(j = 0; j <nElement; j++)
            if(a[j] > value)
                break;
            for(int k = nElement; k > j; k--) //moves bigger ones down.
                a[k] = a[k-1];
            a[j] = value;
            nElement++;
    }
    public boolean delete(long value) {
        int j = find(value);
        if(j == nElement)
            return false;
        else
            for(int k = j; k < nElement; k++)
                a[k] = a[k+1];
            nElement--;
            return true;
    }
    public void display() {  //display array contents
        for(int i = 0; i < nElement; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
