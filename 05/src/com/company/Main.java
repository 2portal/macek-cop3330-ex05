package com.company;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        System.out.print("What is the first number ");
        Scanner firstinput = new Scanner (System.in);
        String Firstval = firstinput.next();

        System.out.print("What is the second number ");
        Scanner secondinput = new Scanner (System.in);
        String Secondval = secondinput.next();

        float fir = Integer.parseInt(Firstval);
        float sec = Integer.parseInt(Secondval);
        float sum = fir + sec;
        float product = fir*sec;
        float difference = fir-sec;
        float quotient =fir/sec;

        System.out.print(fir+"+"+sec+"="+sum+"\n");

        System.out.print(fir+"-"+sec+"="+difference+"\n");

        System.out.print(fir+"*"+sec+"="+product+"\n");

        System.out.print(fir+"/"+sec+"="+quotient+"\n");
    }
}