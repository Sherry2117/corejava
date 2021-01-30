package arrays;

public class ArrayReturnTest {

    public static void main(String[] args) {
        int arrayName[] = getNumbersByLimit(100);
        for (int i = 0; i < arrayName.length; i++) {
            System.out.println("value at position" + i + "is ==>" + arrayName[i]);
        }
    }

    private static int[] getNumbersByLimit(int limit) {
        int a[] = new int[limit];

        for(int i =0; i<limit; i++){
            a[i] = i;
        }

        return a;
    }
}
