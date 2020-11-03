package com.company;

public class Personage {
    int p,g;

    public Personage(int p,int g) {
        this.p = p;
        this.g = g;
    }
    public int generatePublicNum(int privateNum){
        int  secretNum = (int)Math.pow(g,privateNum)%p;
        return secretNum;
    }
    public int generateKey (int secretNum,int privateNum){
        int key = (int)Math.pow(secretNum,privateNum)%p;
        return key;
    }
}