package com.dataStructuresAndAlgorithms;

public class Array {

    public static void main(String[] args) {
	long[] arr;
    arr = new long[100];
    int nElements = 9;
    int j;
    long searchKey;

    arr[0] = 7;
    arr[1] = 99;
    arr[2] = 44;
    arr[3] = 55;
    arr[4] = 22;
    arr[5] = 88;
    arr[6] = 11;
    arr[7] = 00;
    arr[8] = 66;
    arr[9] = 33;
    nElements = 10;

    for(j=0; j<nElements; j++)
        System.out.print(arr[j] + " ");
        System.out.println("");

        searchKey = 66; // find item with key 66
        for(j=0; j <nElements; j++)
            if(arr[j] == searchKey)
                break;
        if(j == nElements)
            System.out.println("Cannot find " + searchKey);
        else
            System.out.println("Found " + searchKey );

        searchKey = 55; //delete item with key 55
        for(j = 0; j <nElements; j++)
            if(arr[j] == searchKey)
                break;
        for(int k = j; k < nElements -1; k++)
            arr[k] = arr[k + 1];
        nElements--;

        for(j=0; j < nElements; j++)
            System.out.print(arr[j] + " ");
        System.out.println("");
    }
}
