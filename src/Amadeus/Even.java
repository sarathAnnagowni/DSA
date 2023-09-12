package Amadeus;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//xyz = 10,15,8,49,25,98,32

//maximum three consecutive



public class Even {

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(10,15,8,49,25,98,32);
        System.out.println(numberList.get(1));
        List<Integer> evenList = numberList.stream().sorted().
                filter(integer -> integer % 2 == 0).collect(Collectors.toList());
        System.out.println(maximumOrderSequence(numberList,3));

    }

    static Integer maximumOrderSequence(List<Integer> numberList , int lenght){
        int sum =0;
        if(lenght > numberList .size() || lenght <= 0){
            return -1;
        }
        sum = getTemp(numberList,lenght,0);
        System.out.println(":: "+sum);
        for(int i=1 ; i < numberList.size()- lenght; i++){
            int temp = getTemp(numberList, lenght,i);
            if(temp > sum){
                sum = temp;
            }
        }
        return sum;
    }

    private static int getTemp(List<Integer> numberList, int length ,int startIndex) {
        int sum =0;
        for(int i = startIndex ; i < startIndex + length ; i++){
            sum += numberList.get(i);
        }
        return sum;
    }


}



interface weather{
    int temparature(int longitude,int latitude);
}

class USAdapter implements  weather{
     US us;

    @Override
    public int temparature(int longitude, int latitude) {
        return 0;
    }

}
class Asian implements  weather{

    @Override
    public int temparature(int longitude, int latitude) {
        return 0;
    }
}

class Europe implements weather {


    @Override
    public int temparature(int longitude, int latitude) {
        return 0;
    }
}



class US {



    public int temparature(int longitude, int latitude) {
        return 0;
    }

}