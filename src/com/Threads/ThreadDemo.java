package com.Threads;
import java.io.*;
import java.util.*;

public class ThreadDemo {


        public static void main(String args[])
        {
            Sender send1 = new Sender("Hi");
            Sender send2 =  new Sender("Bye");
            Sender send3 =  new Sender("Hey");
            ThreadedSend S1 =
                    new ThreadedSend( send1.msg , send1 );
            ThreadedSend S2 =
                    new ThreadedSend(  send2.msg , send1 );
            ThreadedSend S3 =
                    new ThreadedSend(  send3.msg , send1 );

            // Start two threads of ThreadedSend type
            S1.start();
            S3.start();
            S2.start();

            // wait for threads to end
            try
            {
                S1.join();
                S2.join();
                S3.join();
            }
            catch(Exception e)
            {
                System.out.println("Interrupted");
            }
        }

}
// A Java program to demonstrate working of
// synchronized.



// A Class used to send a message
class Sender extends Object
{

    String msg;

    public Sender(String msg) {
        this.msg = msg;
    }


    @Override
    public boolean equals(Object o) {
        System.out.println("equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sender sender = (Sender) o;

        return msg != null ? msg.equals(sender.msg) : sender.msg == null;
    }
    @Override
    public int hashCode() {
        System.out.println("hashcode");
        return msg != null ? msg.hashCode() : 0;
    }

    public void send(String msg)
    {
        System.out.println("Sending\t" + msg );
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println("Thread interrupted.");
        }
        System.out.println("\n" + msg + "Sent");
    }
}

// Class for send a message using Threads
class ThreadedSend extends Thread
{
    private String msg;
    Sender sender;

    // Receives a message object and a string
    // message to be sent
    ThreadedSend(String m, Sender obj)
    {
        msg = m;
        sender = obj;
    }

    public void run()
    {
        // Only one thread can send a message
        // at a time.
        synchronized(sender.msg)
        {
            // synchronizing the send object
            sender.send(msg);
        }
    }
}

// Driver class
class SyncDemo
{
}
