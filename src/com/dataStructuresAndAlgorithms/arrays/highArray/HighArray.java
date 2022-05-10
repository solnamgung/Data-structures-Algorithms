package com.dataStructuresAndAlgorithms.arrays.highArray;

public class HighArray {
    private long[] a;
    private int nElements;

    public HighArray(int max) {
        a = new long[max];
        nElements = 0;
    }
    public boolean find(long searchKey) { // find specified value : Linear search
        int j;
        for(j = 0; j < nElements; j++)
            if(a[j] == searchKey)
                break;
        if(j == nElements)
            return false;
        else
            return true;
    }
    public void insert(long value) { //put element into array
        a[nElements] = value;
        nElements++;
    }

    public boolean delete(long value) {
        int i;
        for(i = 0; i < nElements; i++) // look for it
            if(value == a[i] )
                break;
        if(i == nElements)  // cannot find it
            return false;
        else {
            for(int k = i; k < nElements; k++) // move higher ones down
                a[k] = a[k+1];
            nElements--;  // decrement size
            return true;
        }
    }

    public void display() { //displays array contents
        for(int i = 0; i < nElements; i++)
            System.out.print( a[i] + ", " );
        System.out.println("");
    }
}
