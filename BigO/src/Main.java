public class Main {

    //O(N) time. the fact that we iterate through the array twice doesn't matter.
    public void foo(int[] array) {
        int sum = 0;
        int product = 1;

        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        for(int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        System.out.println(sum + ", " + product);
    }

    //N(0^2) : the inner for loop has 0(N) iterations.
    public void printPairs(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                System.out.println(array[i] + "," + array[j]);
            }
        }
    }

    public void printUnorderedPairs(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                System.out.println(array[i] +"," + array[j]);
            }
        }
    }

    public void printUnorderedPairs2(int[] arrayA, int[] arrayB) {
        for(int i = 0; i < arrayA.length; i++) {
            for(int j = 0; j < arrayB.length; j++) {
                if(arrayA[i] < arrayB[j]) // 0(1)
                    System.out.println(arrayA[i] + ", " + arrayB[j]);
            }
        }
    }

    //0(ab)
   public void printUnorderedPairs3(int[] arrayA, int[] arrayB) {
        for(int i = 0; i < arrayA.length; i++) {
            for(int j = 0; j < arrayB.length; j++) {
                for(int k = 0; k < 100000; k++) {
                    System.out.println(arrayA[i] + ", " + arrayB[j]);
                }
            }
        }
   }
   public void reverse(int[] array) {

        for(int i = 0; i < array.length / 2; i++) {
            int other = array.length - i -1;
            int temp = array[i];
            array[i] = array[other];
            array[other] = temp;
        }
   }

   boolean isPrime(int n) {
        for(int x = 2; x * x <= n; x++ ) {
            if(n % x == 0) {
                return false;
            }
        }
        return true;
   }

    int factorial(int n) {
        if(n < 0) {
            return -1;
        } else if(n == 0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
    public void TimeComplexity(int[] numbers) {
        //0(2+n) -> 0(n)
        System.out.println(); //0(1)
        for(int number : numbers) {
            System.out.println(number); //0(n)
        }
        System.out.println(); //0(1)
    }
    public void TimeComplexity2(int[] numbers, String[] names) {
        //0(n+m) -> 0(n)
        for(int number : numbers) {
            System.out.println(number); //0(n)
        }
        for(String name : names) {
            System.out.println(name); //0(n)
        }
    }
    public void log(int[] numbers) {
        //O(n^3)
        for(int first : numbers)
            for(int second : numbers)
                for(int third : numbers)
                    System.out.println(first + " " + second + " " + third);

    }
}
