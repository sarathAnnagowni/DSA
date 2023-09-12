package TescoInterview;
/*
Tesco has around 3200 stores and more than 10% of the stores have around 800 colleagues each.

In a store, a colleague can work for multiple departments. Here are shifts of a colleague in various departments:

In Bakery department: From 8 to 14
In Checkout department: From 10 to 12
In Diary department: From 14 to 19

current.start > next.start means = current is at top
current.end > next.end

To merge rule

if 10 between 8 an 14 && if 12 is between 8 and 14




Given the above split of shifts, provide an API/method to return the different shifts of a colleague for the day after merging contiguous shifts.
 This will be exposed to the colleague in different UI and help them plan their day accordingly.

His shift timings in this case are 8 to 12 and 14 to 19.

 */

//Input list ranges
//Output List Ranges after merging
//Unsorted
//List of range is dynamic

import java.util.ArrayList;
import java.util.List;

//
public class Solution {


    public static void main(String[] args) {
        List<ShiftTiming> shiftTimingList=new ArrayList<>();
        shiftTimingList.add(new ShiftTiming(8,10));
        shiftTimingList.add(new ShiftTiming(9,12));
        shiftTimingList.add(new ShiftTiming(14,19));
        System.out.println(getMergedShifts(shiftTimingList));

    }

    public static List<ShiftTiming> getMergedShifts(List<ShiftTiming> shiftTimingList){
        List<ShiftTiming> resultShiftTimings = new ArrayList<>();
        //sorttheRangesFirst

        //Merge Accordingly

        for(int i=0;i<shiftTimingList.size()-1;i++){
            ShiftTiming  currentShift =  shiftTimingList.get(i);
            ShiftTiming  nextShift =  shiftTimingList.get(i+1);

            //case 1 // 8 10  9 12
            if(nextShift.getFrom() >= currentShift.getFrom() && nextShift.getFrom() <= currentShift.getTo()){
                System.out.println("====");
                Integer end;
                if(nextShift.getTo() > currentShift.getTo()){
                    end=nextShift.getTo();
                }else{
                    end=currentShift.getTo();
                }
                Integer start= currentShift.getFrom();
                ShiftTiming shiftTiming = new ShiftTiming(start, end);

                resultShiftTimings.add(shiftTiming);
            }
            else if(nextShift.getFrom() <= currentShift.getFrom() && nextShift.getTo() >= currentShift.getFrom() ){
                Integer end;
                if(nextShift.getTo() >= currentShift.getTo()){
                     end=nextShift.getTo();
                }else{
                    end=currentShift.getTo();
                }
                Integer start=nextShift.getFrom();
                ShiftTiming shiftTiming = new ShiftTiming(start, end);
                resultShiftTimings.add(shiftTiming);
                currentShift =shiftTiming;
                i=i+2;
            }else{
                resultShiftTimings.add(currentShift);
            }

        }


        return resultShiftTimings;
    }



}
class ShiftTiming{
    int from;
    int to;

    public int getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    @Override
    public String toString() {
        return "ShiftTiming{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }

    public int getTo() {
        return to;
    }

    public void setTo(Integer to) {
        this.to = to;
    }

    ShiftTiming(Integer from , Integer to){
        this.from=from;
        this.to =to;
    }

}