package solution;
import resources.classes.TextIO;

import java.util.ArrayList;

public class NumberEntrySorter {
    public static void main(String [] Args){
        ArrayList<Double> sortedList = sortList(getArrayFromInput());
        for (Double aDouble : sortedList) {
            System.out.println(aDouble);
        }

    }

    public static ArrayList<Double> getArrayFromInput(){
        ArrayList<Double> numberList = new ArrayList<>();
        System.out.println("Please enter a number to add to the array, or type \"0\" to finish adding numbers.");
        double currentNum = -1;
        while (currentNum!=0){
            currentNum = TextIO.getlnDouble();
            if(currentNum!=0){
                numberList.add(currentNum);
            }
        }
        return numberList;
    }

    public static ArrayList<Double> sortList(ArrayList<Double> list){
        int sortedNumStart = list.size()-1;
        double tempNum;

        do{
            tempNum  = list.get(sortedNumStart-1);

            for(int i = sortedNumStart; i<list.size(); i++){
                if(tempNum<list.get(sortedNumStart)){
                    break;
                }else if(tempNum>list.get(list.size()-1)){
                    list.add(tempNum);
                    list.remove(sortedNumStart-1);
                    break;
                } else {
                    if(tempNum<list.get(i+1)){
                        list.add(i+1, tempNum);
                        list.remove(sortedNumStart-1);
                        break;
                    }
                }
            }
            sortedNumStart--;
        }while (sortedNumStart>0);

        return list;
    }




}
