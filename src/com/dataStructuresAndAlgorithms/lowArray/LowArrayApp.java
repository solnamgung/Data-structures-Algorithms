package com.dataStructuresAndAlgorithms.lowArray;

public class LowArrayApp {
    public static void main(String[] args) {
        LowArray arr = new LowArray(100);
        int nElements = 0;
        int j;

        arr.setElement(0, 77);
        arr.setElement(1, 99);
        arr.setElement(2, 44);
        arr.setElement(3, 55);
        arr.setElement(4, 22);
        arr.setElement(5, 88);
        arr.setElement(6, 11);
        arr.setElement(7, 00);
        arr.setElement(8, 66);
        arr.setElement(9, 33);
        nElements = 10;

        for(j = 0; j < nElements; j++)
            System.out.print(arr.getElement(j) + " ");
        System.out.println(" ");

        int searchKey = 26;  // search for data item
        for(j = 0; j < nElements; j++)
            if(arr.getElement(j) == searchKey)
                break;
        if(j == nElements)
            System.out.println("Cannot find " + searchKey);
        else
            System.out.println("Found " + searchKey);


        //delete value 55
        for(j = 0; j < nElements; j++)
            if(arr.getElement(j) == 55)
                break;
        for(int i = j; i < nElements; i++)
            arr.setElement(i, arr.getElement(i+1));
        nElements--;

        for(j = 0; j < nElements; j++)
            System.out.print(arr.getElement(j) + " ");
    }
}
