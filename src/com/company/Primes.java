package com.company;

public class Primes {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 2; i <= n; i++) {
            if (IsPrime(i)) System.out.println(i);
        }
    }
    public static boolean IsPrime(int l1){
        for (int i = 2; i <= l1/2;i++){
            if(l1%i==0)return false;
        }
        return true;
    }
}
