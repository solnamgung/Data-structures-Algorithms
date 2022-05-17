package classDataArray;

public class ClassDataArray {
    private Person[] a; // reference to array
    private int numberOfElement; // number of data items

    public ClassDataArray(int max) {
        a = new Person[max];
        numberOfElement = 0;
    }
    public Person find(String searchName) { //find specified value
        int i;
        for(i = 0; i < numberOfElement; i++)
            if(a[i].getLastName().equals(searchName))
                break;

            if(i == numberOfElement)
                return null;
            else
                return a[i];
    }
    public void insert(String last, String first, int age)  {
        // put person into array
        a[numberOfElement] = new Person(last, first, age);
        numberOfElement++;
    }
    public boolean delete(String searchName) {
        // delete person from array
        int j;
        for(j=0; j < numberOfElement; j++)
            if(a[j].getLastName().equals(searchName))
                break;
        if(j==numberOfElement)
            return false;
        else {
            for(int k=j; k <numberOfElement; k++)
                a[k] = a[k+1];
            numberOfElement--;
            return true;
        }
    }
    public void displayA() { //display array contents
        for(int j=0; j<numberOfElement; j++)
            a[j].displayPerson();
    }
}
