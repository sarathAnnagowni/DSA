package com;

public class dummyString {

    public static void main(String[] args){
       String secretName="projects/355015854726/secrets/TM61/versions/4";
       System.out.println(secretName.substring(secretName.lastIndexOf("/") +1));
    }
}
