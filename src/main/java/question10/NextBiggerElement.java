package question10;

import java.util.ArrayList;

public class NextBiggerElement {

    public static void main(String args[]) {

        ArrayList<Double> array = new ArrayList();
        array.add(13.0);
        array.add(7.0);
        array.add(6.0);
        array.add(12.0);

        nextBiggerElement(array);
    }

    public static void nextBiggerElement(ArrayList<Double> numberArray) {

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
