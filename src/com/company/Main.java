package com.company;

public class Main {


    public static void main(String[] args) {
        // write your code here
        double[] numbers = {23.45, 6.64, 56.2, 7.8, 31.56, -5.7, 4.06, 0.007, 9.3, 2.305, -5.5, -1.5, 63.5, 794.888, -67.98};
        double nam  = 0.0;
        int red = 0;
        boolean eee= false;
        for (double n:numbers) {
            if (n<0){
                eee=true;
            } else if (eee){
                red ++;
                nam +=n;
            }

        }
        System.out.println(nam/red);
        }
        public static void digits(){
        int[] num1 = {-4,-2,2,3,6,8};
            for (int i = 0; i < num1.length ; i++) {
                int google= num1[i];
                int aple = i;
                for (int j = 0; j < num1.length; j++) {
                    if (num1[j] < google) {
                    google=num1[j];
                    aple = j;
                    }
                    if (i !=aple){
                        int qqq =num1[i];
                        num1[i]=num1[aple];
                        num1[aple]=qqq;

                    }
                    }

                }

            }
        }

