package kalykhan.JavaFundamentals.OptionalTask1;

import java.util.ArrayList;
import java.util.Comparator;

public class numberHandler {
    ArrayList<Integer> numList = new ArrayList<Integer>();
    ArrayList<Integer> numSizeList = new ArrayList<Integer>();

    public void arraySort(ArrayList<Integer> numList, boolean naturalOrder){
        if(naturalOrder){
            numList.sort(Comparator.naturalOrder());
        }else {
            numList.sort(Comparator.reverseOrder());
        }
    }

    public int findMax(ArrayList<Integer> numList){
        int max = numList.get(0);
        for(int num : numList){
            if (max < num){
                max = num;
            }
        }
        return max;
    }
    public int findMin(ArrayList<Integer> numList){
        int min = numList.get(0);
        for(int num : numList){
            if (min > num){
                min = num;
            }
        }
        return min;
    }
}
