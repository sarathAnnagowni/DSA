package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergingOverlaps {
    public static void main(String[] args){
        Intervel i1=new Intervel(1,3);
        Intervel i2=new Intervel(2,6);
        Intervel i3=new Intervel(7,10);
        Intervel i4=new Intervel(8,12);
        Intervel[] intervals={i1,i3,i2,i4};
        for (Intervel i: intervals) {
            System.out.println(i);
        }
        Arrays.sort(intervals);
        System.out.println("After sort");
        for (Intervel i: intervals) {
            System.out.println(i);
        }
        List<Intervel> merged=new ArrayList<>();
        int index = 0; // Stores index of last element
        // in output array (modified arr[])

        // Traverse all input Intervals
        for (int i=1; i<intervals.length; i++)
        {
            // If this is not first Interval and overlaps
            // with the previous one
            if (intervals[index].end >=  intervals[i].start)
            {
                // Merge previous and current Intervals
                intervals[index].end = Math.max(intervals[index].end, intervals[i].end);
            }
            else {
                index++;
                intervals[index] = intervals[i];
            }
        }

        System.out.println("After Merge");
        for (Intervel i: intervals) {
            System.out.println(i);
        }

    }




}
class Intervel implements Comparable<Intervel>{
    int start;
    int end;

    public Intervel(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Interval{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }


    @Override
    public int compareTo(Intervel o) {
        if(this.start > o.start){
            return 0;
        }else
            return -1;
    }
}