/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cis1056.n.worksheet.pkg02.pkgif.conditions;

import java.util.Scanner;

/**
 *
 * @author hariri
 */
public class CIS1056NWorksheet02IfConditions {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {      
        
//          1
           //calculateCharge(); 
           
//           2
           //oddOrEven()
           
//           3
           //employeeManager2();
           
//           4
           //leapYear();
           
//           6
           //bankWithdrawal();
           
//           7
           //commission();
           
//           8
           //temperatureConversion();
           
//           9
           //calculatePostage();
    }
    
    //1 + 5
    public static void calculateCharge (){
         System.out.println("Enter your age!");
        int age = keyboard.nextInt();
        double charge = age < 18 ? 0.6 * 30 : age > 65 ? 0.8 * 30 : 30;
        System.out.println("Your charge is : " + charge);
    }
    
    //2
    public static void oddOrEven(){
         System.out.println("Enter a number to check if it's even or odd!");
        int numberToBeChecked = keyboard.nextInt();
        String result  = numberToBeChecked % 2 == 0 ? "even" : "odd";
        System.out.println("The number you entered is " + result);
    }
    
    //3
    public static void employeeManager2 (){
        int hoursWorked = 35;
        double hourlyRate = 9.75;
        System.out.println("Enter the hourse you have worked this week!");
         hoursWorked = keyboard.nextInt();
          double total = hourlyRate * hoursWorked;
         if (hoursWorked > 40){
            double additionalPay = 4.75;
            int add = hoursWorked - 40;
            double addedRate = add * additionalPay;
            total += addedRate;
            System.out.println(total);
         }else{
                System.out.println(total);
         }

    }
    
    //4 
    public static void leapYear(){
        System.out.println("Enter a year to check if is it a leap year or not!");
        int yearToBeChecked = keyboard.nextInt();
        if(((yearToBeChecked % 4 == 0) && (yearToBeChecked % 100!= 0)) || (yearToBeChecked %400 == 0)){
            System.out.println("The year you entered is a leap year :)");
        }else{
            System.out.println("The year you entered NOT a leap year :(");
        }
        
    }
    
    //6
    public static void bankWithdrawal(){
        int currentBalance = 40;
        int overdraftLimit = 60;
        String message ="";
        int charge = 0;
        for(int i = 0 ; i <= 100; i++){
        System.out.println("Your palance is £"+ currentBalance + message+ " \n Enter the amount to withdraw!");
        int withdraw = keyboard.nextInt();
        if(withdraw <= currentBalance ){
            currentBalance -= withdraw;
            if(currentBalance < 60){
                charge = -5;
            }
            System.out.println("WithDraw: " + withdraw + "New Balance: " + currentBalance +charge);
        }else{
        currentBalance -= withdraw;
        withdraw = currentBalance - withdraw;
            System.out.println(withdraw);
        }
        }
    }
    
    //7
    public static void commission(){
        System.out.println(" Enter total sales!");
        int sales = keyboard.nextInt();
        System.out.println(" Enter items sold!");
        int items = keyboard.nextInt();
        double added = 0;
        double total = 0;
        double commission = sales * 0.1;
        String message = "Commission "+commission;
        if (items > 50){
            added = commission * 0.25;
            total = commission + added;
            message = "Commission: "+commission+"  \nBonus Commission: " + added +"\nTotal Commission: "+ total;
        }
        System.out.println(message);
    }
    
    //8 
    public static void temperatureConversion(){
    System.out.println("Whagt would you like to convert (write 1 , 2 or 3) \n1- Celsius TO Fahrenheit ! \n2- Fahrenheit TO Celsius! \n3- Exit!");
        int choise = keyboard.nextInt();
        switch (choise ) {
            case 1:
                System.out.println("1- you have chosen to convert from C to F");
                System.out.println("Enter the Celsius degree!");
                int celsius = keyboard.nextInt();
                int fahr = celsius * 9 / 5 + 32;
                  System.out.println(celsius +" Celsius degrees is equal to "+ fahr+ " degrees in Fahrenheit");

                break;
            case 2:
                System.out.println("1- you have chosen to convert from C to F");
                System.out.println("Enter the Celsius degree!");
                int fahrenheit = keyboard.nextInt();
                int cel = (fahrenheit -32 ) * 5 / 9;
                System.out.println(fahrenheit +" Fahrenheit degrees is equal to "+ cel+ " degrees in Celsius");

                break;
            case 3:
                System.out.println("I'll exit !");
                System.exit(0);
            default:
                break;
        }
    }
    
    //9
    public static void calculatePostage(){
        System.out.println("Enter the wight in Kilogram of you parcel!");
        int wight = keyboard.nextInt();
        double charge = wight < 1 ? 3.50 :wight < 2 && wight >= 1 ? 3.00: wight < 3 && wight >= 2 ? 2.50 : wight >= 3 && wight < 4 ? 2.00 : 1.50;
        System.out.println("Your charge is: " + charge);
    }
}

