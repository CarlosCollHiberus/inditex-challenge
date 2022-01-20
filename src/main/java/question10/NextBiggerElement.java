package question10;

import java.util.ArrayList;

public class NextBiggerElement {

    public static void main(String args[]) {

        ArrayList<Integer> array1 = new ArrayList();
        ArrayList<Integer> array2 = new ArrayList();
        array1.add(4);
        array1.add(5);
        array1.add(2);
        array1.add(25);
        array2.add(13);
        array2.add(7);
        array2.add(6);
        array2.add(12);

        System.out.println("Result first array: ");
        nextBiggerElement(array1);
        System.out.println("Result second array: ");
        nextBiggerElement(array2);
    }

    public static void nextBiggerElement(ArrayList<Integer> numberArray) {

        Integer size = numberArray.size();

        for(int i = 0; i < size; i++) {
            for(int j = i+1; j < size; j++) {
                if(numberArray.get(j) > numberArray.get(i)) {
                    System.out.println(numberArray.get(i) + " --> " + numberArray.get(j));
                    break;
                }

                if(j == size-1) {
                    System.out.println(numberArray.get(i) + " --> -1");
                }
            }
        }

        System.out.println(numberArray.get(size-1) + " --> -1");
    }
}
