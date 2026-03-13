package com.assignment_questions;

import java.util.Scanner;

public class Currency_rup_to_usd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int rup=input.nextInt();
        float usd=rup*0.011f;
        //float usd=float(rup/0.011)
        //double usd=rup/0.011
        System.out.println("Indian rupees "+rup+" in usd is "+usd);

    }
}
