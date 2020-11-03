
package com.company;

public class Main {
    public static int g = 7;
    public static int  p = 11;
    public static int  AlicePrivateNum = 3;
    public  static int BobPrivateNum = 6;




    public static void main(String[] args) {
        Personage Alice = new Personage(p,g);
        Personage Bob = new Personage(p,g);

        System.out.println(Bob.generateKey(Alice.generatePublicNum(AlicePrivateNum),BobPrivateNum));
        System.out.println(Alice.generateKey(Bob.generatePublicNum(BobPrivateNum),AlicePrivateNum));

    }
}

