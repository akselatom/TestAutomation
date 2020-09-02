package kalykhan.java.fundamentals.optional.task1;

import java.util.ArrayList;
import java.util.Collections;
import kalykhan.java.fundamentals.ConsoleUI;



public class NumberHandler {

  private final ArrayList<Integer> numSizeList = new ArrayList<>();
  private final ConsoleUI console = new ConsoleUI();

  public ArrayList<Integer> fillArrayList() {
    System.out.println("Input numbers in console, when done type 'end': ");
    ArrayList<Integer> inputInt = new ArrayList<>();
    while (true) {
      String input = console.consoleInput();
      if (input.equals("end")) {
        return inputInt;
      }
      if (ConsoleUI.performIntParse(input) != -1) {
        inputInt.add(ConsoleUI.performIntParse(input));
      } else {
        System.out.println("Can't parse input to int.");
      }
    }
  }

  public void sortArrayByNumLength(final ArrayList<Integer> numList,
      final boolean naturalOrder) {
    getLengthNum(numList);
    if (naturalOrder) {
      for (int i = 1; i < this.numSizeList.size(); i++) {
        if (this.numSizeList.get(i) < this.numSizeList.get(i - 1)) {
          Collections.swap(this.numSizeList, i, i - 1);
          Collections.swap(numList, i, i - 1);
          for (int z = i - 1; (z - 1) >= 0; z--) {
            if (this.numSizeList.get(z) < this.numSizeList.get(z - 1)) {
              Collections.swap(this.numSizeList, z, z - 1);
              Collections.swap(numList, z, z - 1);
            } else {
              break;
            }
          }
        }
      }
    } else {

      for (int i = 1; i < this.numSizeList.size(); i++) {
        if (this.numSizeList.get(i) > this.numSizeList.get(i - 1)) {
          Collections.swap(this.numSizeList, i, i - 1);
          Collections.swap(numList, i, i - 1);
          for (int z = i - 1; (z - 1) >= 0; z--) {
            if (this.numSizeList.get(z) > this.numSizeList.get(z - 1)) {
              Collections.swap(this.numSizeList, z, z - 1);
              Collections.swap(numList, z, z - 1);
            } else {
              break;
            }
          }
        }
      }
    }
  }

  public ArrayList<Integer> findMinLength(final ArrayList<Integer> numList) {
    getLengthNum(numList);
    int minLengthIndex = 0;
    int min = this.numSizeList.get(minLengthIndex);

    for (int i = 0; i < this.numSizeList.size(); i++) {

      if (this.numSizeList.get(i) < min) {
        min = this.numSizeList.get(i);
        minLengthIndex = i;
      }
    }
    ArrayList<Integer> shortestNum = new ArrayList<>();
    shortestNum.add(numList.get(minLengthIndex));
    shortestNum.add(min);
    return shortestNum;
  }

  public ArrayList<Integer> findMaxLength(final ArrayList<Integer> numList) {
    getLengthNum(numList);
    int maxLengthIndex = 0;
    int max = this.numSizeList.get(maxLengthIndex);
    for (int i = 0; i < this.numSizeList.size(); i++) {
      if (this.numSizeList.get(i) > max) {
        max = this.numSizeList.get(i);
        maxLengthIndex = i;
      }
    }
    ArrayList<Integer> longestNum = new ArrayList<>();
    longestNum.add(numList.get(maxLengthIndex));
    longestNum.add(max);
    return longestNum;
  }

  public ArrayList<Integer> getNumLongerThanAvgLength(
      final ArrayList<Integer> numList) {
    getLengthNum(numList);
    int avgLength = 0;
    for (int num : this.numSizeList) {
      avgLength += num;
    }
    ArrayList<Integer> longerThanAvg = new ArrayList<>();
    avgLength = avgLength / this.numSizeList.size();
    for (int i = 0; i < this.numSizeList.size(); i++) {
      if (this.numSizeList.get(i) > avgLength) {
        longerThanAvg.add(numList.get(i));
      }
    }
    return longerThanAvg;
  }

  public Integer findUniqueNum(final ArrayList<Integer> arrayList) {
    for (Integer num : arrayList) {
      String numString = num.toString();
      boolean uniqueFlag = true;
      for (int i = 0; i < numString.toCharArray().length - 1; i++) {
        for (int j = i + 1; j < numString.toCharArray().length; j++) {
          if (numString.toCharArray()[i] == numString.toCharArray()[j]) {
            uniqueFlag = false;
            break;
          }
        }
        if (!uniqueFlag) {
          break;
        }
      }
      if (uniqueFlag) {
        return num;
      }
    }
    return null;
  }

  public Integer getLengthNum(final Integer num) {
    return num.toString().length();
  }

  private void getLengthNum(final ArrayList<Integer> array) {
    this.numSizeList.clear();
    for (Integer integer : array) {
      this.numSizeList.add(getLengthNum(integer));
    }
  }
}
