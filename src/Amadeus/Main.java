package Amadeus;


/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
frequencies = [5,3,11,13,18,19,23,25,28,33,31,32,35,45,66,88,89,83,89,96,91,101,110,220]



width: n (example 10)
bucket number:(example 10)



frequency(array, width, nb_buckets)
*/
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        int[] arr ={5,3,11,13,18,19,23,25,28,33,31,32,35,45,66,88,89,83,89,96,91,101,110,220};
        System.out.println(frequency(arr,10,10));
    }

    static  Map<Integer,Integer>  frequency(int[] array ,int width , int nb_buckets){
        Map<Integer,Integer> map = new HashMap<>();

        for(int a : array){

            int bucketNo = a / width;

            if(bucketNo >= nb_buckets){
                bucketNo = nb_buckets - 1;
            }

            if( map.get(bucketNo) != null){
                int count = map.get(bucketNo);
                count++;
                map.put(bucketNo,count);
            }else{
                map.put(bucketNo,1);
            }
        }
        return map;
    }
}
