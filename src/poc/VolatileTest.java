package poc;

import java.util.ArrayList;

public class VolatileTest {
    private final static int noOfThreads = 5;
    public static void main(String[] args) throws InterruptedException
    {
        VolatileData volatileData = new VolatileData();     //object of VolatileData class
        Thread[] threads = new Thread[noOfThreads];     //creating Thread array
        for(int i = 0; i < noOfThreads; ++i)
            threads[i] = new VolatileThread(volatileData);
        for(int i = 0; i < noOfThreads; ++i)
            threads[i].start();                 //starts all reader threads
        for(int i = 0; i < noOfThreads; ++i)
            threads[i].join();                  //wait for all threads

        volatileData.testVolatile();
        System.out.println(volatileData.getCounter());
    }


}

class VolatileData
{
    private  volatile int counter = 0;
    public int getCounter()
    {
        return counter;
    }
    public void increaseCounter()
    {
        ++counter;      //increases the value of counter by 1
    }

    public void testVolatile(){
        ArrayList<String> nAr=new ArrayList<>();
        nAr.add("3213");
        nAr.add("3213");
        nAr.add("3213");
        nAr.add("3213");
        nAr.add("3213");
        nAr.add("3213");

        nAr.add("3213");
        nAr.add("3213");
        nAr.add("3213");
        nAr.add("3213");
        nAr.add("3213");
        nAr.add("3213");


        nAr.add("3213");
        nAr.add("3213");
        nAr.add("3213");
        nAr.add("3213");
        nAr.add("3213");
        nAr.add("3213");

        nAr.parallelStream().forEach(t->{
            increaseCounter();
        });





    }


}
class VolatileThread extends Thread
{
    private final VolatileData data;
    public VolatileThread(VolatileData data)
    {
        this.data = data;
    }
    @Override
    public void run()
    {
        int oldValue = data.getCounter();
        System.out.println("[Thread " + Thread.currentThread().getId() + "]: Old value = " + oldValue);
        data.increaseCounter();
        int newValue = data.getCounter();
        System.out.println("[Thread " + Thread.currentThread().getId() + "]: New value = " + newValue);
    }
}
