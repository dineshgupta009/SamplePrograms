package org.example.Other;

import java.util.Scanner;

public class AverageCalculator {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
        System.out.print("Enter Initial quantity :  ");
        float quantity = sc.nextInt();
        float totalBuyAmt;
        System.out.print("Enter Initial Price :  ");
        float initialPrice = sc.nextInt();
        System.out.print("Enter Reduced Price :  ");
        float reducedPrice = sc.nextInt();
        System.out.print("Enter Second Reduced Price :  ");
        float newReducedPrice = sc.nextInt();
//        ========================================================

        float amount = (quantity * initialPrice);
        System.out.println("Initial Amount need to Buy = " + amount);
        float secAmount = (quantity * reducedPrice);
        System.out.println("secAmount =" + secAmount);
        float difInPrice = amount - secAmount;
        //++++++++++++++++++++++++++++++++++++++++++++++++++++++

        float redPec= (difInPrice/secAmount)*100;
        System.out.println("redPec % change = "+redPec);

        float amountNeed = reducedPrice*redPec;
        System.out.println(" Amount Needed for second Buy = " + amountNeed);


        //+++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("difInPrice =" + difInPrice);
        float sq = Math.round(difInPrice / reducedPrice);
        System.out.println(" increased Quantity " + sq);

        float secBuyQnt = quantity + sq;

        System.out.println("secBuyQnt = " + secBuyQnt);
        float firRedBuy = secBuyQnt * reducedPrice;
        System.out.println("firRedBuy = " + firRedBuy);
        totalBuyAmt = amount + firRedBuy;
        System.out.println("totalBuyAmt =" + totalBuyAmt);
        float avgRedPrice = (reducedPrice * (secBuyQnt + quantity)) / (secBuyQnt + quantity);
        float avlQnt = secBuyQnt + quantity;
        System.out.println("avlQnt = " + avlQnt);

        float secAvgBuyAmt = (reducedPrice * (secBuyQnt + quantity));
        System.out.println("secAvgBuyAmt = " + secAvgBuyAmt);
        System.out.println("avgRedPrice =" + avgRedPrice);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        //==============================================================

        float newInitialQnt = avlQnt;
        System.out.println(newInitialQnt);
        secAmount = newReducedPrice * newInitialQnt;
        System.out.println("Amount for second reduced price =" + secAmount);

        difInPrice = secAvgBuyAmt - secAmount;
        System.out.println("difInPrice second time =" + difInPrice);

        sq = Math.round(difInPrice / reducedPrice);
        System.out.println(sq);
        secBuyQnt = newInitialQnt + sq;

        System.out.println("secBuyQnt = " + secBuyQnt);
        firRedBuy = secBuyQnt * reducedPrice;
        System.out.println("firRedBuy = " + firRedBuy);
        totalBuyAmt = amount + firRedBuy;
        System.out.println("totalBuyAmt =" + totalBuyAmt);
        float avgRedPrice1 = (newReducedPrice * (secBuyQnt + newInitialQnt)) / (secBuyQnt + newInitialQnt);
        avlQnt = secBuyQnt + newInitialQnt;
        System.out.println("avlQnt = " + avlQnt);

        secAvgBuyAmt = (reducedPrice * (secBuyQnt + newInitialQnt));
        System.out.println("secAvgBuyAmt = " + secAvgBuyAmt);
        System.out.println("avgRedPrice =" + avgRedPrice1);


    }
}
