package com.aheavenx.p6;

import java.util.Scanner;

/**
 * @author Skovorodnikov
 *         Created on 22.05.2017 10:51
 */
public class FloorTileCalc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the total tile parameters in format WxH,\n" +
        "where W = width, H = height");
        String[] dataTotal = sc.next().split("x");
        int widthTotal = Integer.parseInt(dataTotal[0]), heightTotal = Integer.parseInt(dataTotal[1]);
        System.out.println("Please enter the single tile size and cost in format WxHxP,\n" +
        "where P = price for one tile");
        String[] dataSingle = sc.next().split("x");
        int widthSingle = Integer.parseInt(dataSingle[0]), heightSingle = Integer.parseInt(dataSingle[1]);
        double price = Double.parseDouble(dataSingle[2]);
        int singleBlockSize = widthSingle * heightSingle, totalBlockSize = widthTotal * heightTotal;
        double neededBlocks = (.0 + totalBlockSize) / singleBlockSize;
        double totalPrice = neededBlocks * price;

        System.out.println("Your price is: " + totalPrice);


    }
}
