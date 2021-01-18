/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package marjan;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author X453S
 */
public class FlightQueue {
    
    int firstSeat;
    int nextSeat;
    final int maxCapacity = 4;
    Scanner s = new Scanner(System.in);
    int userAnswer;
    int [] seatsInFlight;
    int vacancy;
    String userFileName;
    String flightName;
    String [] flightID;
    final int flightIDCap = 20;
    int flightIDCounter;
    String enterNickName;
    
    int confirmedBookingCounter;
    int waitingBookingCounter;
    
    int c1bookCounter;
    String [] c1;
    int firstSeatc1;
    int nextSeatc1;
    
    int c2bookCounter;
    String [] c2;
    int firstSeatc2;
    int nextSeatc2;
    
    int c3bookCounter;
    String [] c3;
    int firstSeatc3;
    int nextSeatc3;
    
    int c4bookCounter;
    String [] c4;
    int firstSeatc4;
    int nextSeatc4;
    
    int c5bookCounter;
    String [] c5;
    int firstSeatc5;
    int nextSeatc5;
    
    int c6bookCounter;
    String [] c6;
    int firstSeatc6;
    int nextSeatc6;
    
    int c7bookCounter;
    String [] c7;
    int firstSeatc7;
    int nextSeatc7;
    
    int c8bookCounter;
    String [] c8;
    int firstSeatc8;
    int nextSeatc8;
    
    int c9bookCounter;
    String [] c9;
    int firstSeatc9;
    int nextSeatc9;
    
    int c10bookCounter;
    String [] c10;
    int firstSeatc10;
    int nextSeatc10;
    
    int c11bookCounter;
    String [] c11;
    int firstSeatc11;
    int nextSeatc11;
    
    int w1bookCounter;
    String [] w1;
    int firstSeatw1;
    int nextSeatw1;
    
    int w2bookCounter;
    String [] w2;
    int firstSeatw2;
    int nextSeatw2;
    
    int w3bookCounter;
    String [] w3;
    int firstSeatw3;
    int nextSeatw3;
    
    int w4bookCounter;
    String [] w4;
    int firstSeatw4;
    int nextSeatw4;
    
    int w5bookCounter;
    String [] w5;
    int firstSeatw5;
    int nextSeatw5;
    
    int w6bookCounter;
    String [] w6;
    int firstSeatw6;
    int nextSeatw6;
    
    int w7bookCounter;
    String [] w7;
    int firstSeatw7;
    int nextSeatw7;
    
    int w8bookCounter;
    String [] w8;
    int firstSeatw8;
    int nextSeatw8;
    
    int w9bookCounter;
    String [] w9;
    int firstSeatw9;
    int nextSeatw9;
    
    int w10bookCounter;
    String [] w10;
    int firstSeatw10;
    int nextSeatw10;
    
    int w11bookCounter;
    String [] w11; 
    int firstSeatw11;
    int nextSeatw11;
    
    int pointerHead;
    int pointerTail;
    String [] companyName;
    int maxFlightAvailable;
    
    
    public FlightQueue(){
        flightID = new String[flightIDCap];
        seatsInFlight = new int [maxCapacity];
        this.firstSeat = 0;
        this.nextSeat = 0;
        
        
        
        w1 = new String [maxCapacity];
        w2 = new String [maxCapacity];
        w3 = new String [maxCapacity];
        w4 = new String [maxCapacity];
        w5 = new String [maxCapacity];
        w6 = new String [maxCapacity];
        w7 = new String [maxCapacity];
        w8 = new String [maxCapacity];
        w9 = new String [maxCapacity];
        w10 = new String [maxCapacity];
        w11 = new String [maxCapacity];
        
        c1 = new String [maxCapacity];
        c2 = new String [maxCapacity];
        c3 = new String [maxCapacity];
        c4 = new String [maxCapacity];
        c5 = new String [maxCapacity];
        c6 = new String [maxCapacity];
        c7 = new String [maxCapacity];
        c8 = new String [maxCapacity];
        c9 = new String [maxCapacity];
        c10 = new String [maxCapacity];
        c11 = new String [maxCapacity];
        
        this.flightIDCounter = 0;
        this.menu();
    }
    
    public boolean isFullc1(){
        return nextSeatc1 >= maxCapacity;
    }
    
    public boolean isEmptyc1(){
        return nextSeatc1 == 0;
    }
    
    public boolean isFullc2(){
        return nextSeatc2>= maxCapacity;
    }
    
    public boolean isEmptyc2(){
        return nextSeatc2 == 0;
    }
    
    public boolean isFullc3(){
        return nextSeatc3 >= maxCapacity;
    }
    
    public boolean isEmptyc3(){
        return nextSeatc3 == 0;
    }
    
    public boolean isFullc4(){
        return nextSeatc4 >= maxCapacity;
    }
    
    public boolean isEmptyc4(){
        return nextSeatc4 == 0;
    }
    
    public boolean isFullc5(){
        return nextSeatc5 >= maxCapacity;
    }
    
    public boolean isEmptyc5(){
        return nextSeatc5 == 0;
    }
    
    public boolean isFullc6(){
        return nextSeatc6 >= maxCapacity;
    }
    
    public boolean isEmptyc6(){
        return nextSeatc6 == 0;
    }
    
    public boolean isFullc7(){
        return nextSeatc7 >= maxCapacity;
    }
    
    public boolean isEmptyc7(){
        return nextSeatc7 == 0;
    }
    
    public boolean isFullc8(){
        return nextSeatc8 >= maxCapacity;
    }
    
    public boolean isEmptyc8(){
        return nextSeatc8 == 0;
    }
    
    public boolean isFullc9(){
        return nextSeatc9 >= maxCapacity;
    }
    
    public boolean isEmptyc9(){
        return nextSeatc9 == 0;
    }
    
    public boolean isFullc10(){
        return nextSeatc10 >= maxCapacity;
    }
    
    public boolean isEmptyc10(){
        return nextSeatc10 == 0;
    }
    
    public boolean isFullc11(){
        return nextSeatc11 >= maxCapacity;
    }
    
    public boolean isEmptyc11(){
        return nextSeatc11 == 0;
    }
    
     public boolean isFullw1(){
        return nextSeatw1 >= maxCapacity;
    }
    
    public boolean isEmptyw1(){
        return nextSeatw1 == 0;
    }
    
    public boolean isFullw2(){
        return nextSeatw2>= maxCapacity;
    }
    
    public boolean isEmptyw2(){
        return nextSeatw2 == 0;
    }
    
    public boolean isFullw3(){
        return nextSeatw3 >= maxCapacity;
    }
    
    public boolean isEmptyw3(){
        return nextSeatw3 == 0;
    }
    
    public boolean isFullw4(){
        return nextSeatw4 >= maxCapacity;
    }
    
    public boolean isEmptyw4(){
        return nextSeatw4 == 0;
    }
    
    public boolean isFullw5(){
        return nextSeatw5 >= maxCapacity;
    }
    
    public boolean isEmptyw5(){
        return nextSeatw5 == 0;
    }
    
    public boolean isFullw6(){
        return nextSeatw6 >= maxCapacity;
    }
    
    public boolean isEmptyw6(){
        return nextSeatw6 == 0;
    }
    
    public boolean isFullw7(){
        return nextSeatw7 >= maxCapacity;
    }
    
    public boolean isEmptyw7(){
        return nextSeatw7 == 0;
    }
    
    public boolean isFullw8(){
        return nextSeatw8 >= maxCapacity;
    }
    
    public boolean isEmptyw8(){
        return nextSeatw8 == 0;
    }
    
    public boolean isFullw9(){
        return nextSeatw9 >= maxCapacity;
    }
    
    public boolean isEmptyw9(){
        return nextSeatw9 == 0;
    }
    
    public boolean isFullw10(){
        return nextSeatw10 >= maxCapacity;
    }
    
    public boolean isEmptyw10(){
        return nextSeatw10 == 0;
    }
    
    public boolean isFullw11(){
        return nextSeatw11 >= maxCapacity;
    }
    
    public boolean isEmptyw11(){
        return nextSeatw11 == 0;
    }
    
    
    public void menu(){
        this.splitSectionsOfDifferentMethods();
        System.out.println("Now in the main menu");
        System.out.println("Enter the number listed below to access the service");
        System.out.println(" 1- Display flights available on date in a week  \n 2- Choose flight \n 3- Edit info \n 4- Cancel ticket \n 5- Check status of ticket \n 6- Exit program");
        userAnswer = s.nextInt();
        
        switch (userAnswer){
                case 1 :
                    this.displayFlights();
                    break;
                    
                case 2 :
                    this.chooseFlight();
                    break;
                    
                case 3 :
                    this.editInfo();
                    break;
                    
                case 4 : 
                    this.cancelTicket();
                    break;
                    
                case 5 :
                    this.viewStatus();
                    break;
                    
                case 6 :
                    this.exit();
                    break;
                    
                default :
                    System.out.println("Wrong number entry, please try again");
                    this.menu();
        }
        
    }
    
    public void displayFlights(){
        this.makeFlightEntryForAllFlights("AirAsia,FireFly,MalindoAir,GarudaAirlines,MalaysiaAirlines");
        this.displayEveryCompanies();
    }
    
    public void makeFlightEntryForAllFlights(String enterEveryFlightName){
        this.maxFlightAvailable = 7;
        this.pointerHead = 0;
        this.pointerTail = 0;
        this.companyName = new String [7];
        
        String [] allFlights = enterEveryFlightName.split(",");
        for(int i = 0 ; i<allFlights.length ; i++){
            if (!FlightListIsFull()){
                addFlightName(allFlights[i]);  
            }
        }
    }
    
    public boolean FlightListIsEmpty(){
        return pointerTail == 0;
    }
    
    public boolean FlightListIsFull(){
        return pointerTail >= maxFlightAvailable;
    }
    
    public void addFlightName(String companies){
        if (FlightListIsEmpty()){
            companyName[pointerHead] = companies;
            pointerTail++;
        }
        else{
            if(FlightListIsFull()){
                System.out.println("Maximum available flight listed");
            }
            else{
            companyName[pointerTail] = companies;
            pointerTail++;
        }
        }
    } 
    
    public void displayEveryCompanies(){
        this.splitSectionsOfDifferentMethods();
        System.out.println("Available flights on week 4 of December are :");
        for(int v = 0 ; v<pointerTail ; v++){
            System.out.println("*"+companyName[v]);    
        }
    }
    
    public void chooseFlight(){
        this.splitSectionsOfDifferentMethods();
        System.out.println("Enter your nickname first, what can we call you?");
        System.out.println("Call me : ");
        String gvName = s.next();
        this.enterNickName = gvName;

        System.out.println("Pick a date in week 4 of December to see available flight service");
        System.out.println("Enter any date lined below");
        System.out.println("| 24 | 25 | 26 | 27 | 28 | 29 | 30 |");
        userAnswer = s.nextInt();
        System.out.println("You have chosen the date "+this.userAnswer+" for your flight booking");
        
        if (userAnswer == 24){
            System.out.println("Type 1 to choose AirAsia");
            System.out.println("Type 2 to choose GarudaAirlines");
        }
        else if (userAnswer == 25){
            System.out.println("Type 3 to choose MalindoAir");
        }
        else if(userAnswer == 26){
            System.out.println("Type 4 to choose MalaysiaAirlines");
            System.out.println("Type 5 to choose FireFly");
        }
        else if(userAnswer == 27){
            System.out.println("Type 6 to choose Airsia");
        }
        else if(userAnswer == 28){
            System.out.println("Type 7 to choose FireFly");
        }
        else if(userAnswer == 29){
            System.out.println("Type 8 to choose MalaysiaAirlines");
        }
        else if (userAnswer == 30){
            System.out.println("Type 9 to choose AirAsia");
            System.out.println("Type 10 to choose MalaysiaAirlines");
            System.out.println("Type 11 to choose MalindoAir");
        }
        else{
            System.out.println("Wrong date input, please enter again from the given list..");
            this.chooseFlight();
        }
        userAnswer = s.nextInt();
        
        switch (userAnswer){
            case 1 :
                this.flight1();
            break;
            
            case 2 :
                this.flight2();
            break;
            
            case 3 :
                this.flight3();
            break;
            
            case 4 :
                this.flight4();
            break;
            
            case 5 :
                this.flight5();
            break;
            
            case 6 :
                this.flight6();
            break;
            
            case 7 :
                this.flight7();
            break;
            
            case 8 :
                this.flight8();
            break;
            
            case 9 :
                this.flight9();
            break;
            
            case 10 :
                this.flight10();
            break;
            
            case 11 :
                this.flight11();
            break;
           
            
        }
      this.menu();
    }
    
    public void flight1(){
        flightIDCounter++;
        if(flightIDCounter >= 20){
            System.out.println("Booking limit per person exceeded, don't book more than 20 flight trips");
            this.menu();
        }
        else{
        this.confirmedList1();
        this.flightName = "AirAsia1";
        flightID[flightIDCounter] = "AirAsia1";
        }
    }
    
    public void flight2(){
        flightIDCounter++;
        if(flightIDCounter >= 20){
            System.out.println("Booking limit per person exceeded, don't book more than 20 flight trips");
            this.menu();
        }
        else{
        this.confirmedList2();
        this.flightName = "GarudaAirlines2";
        flightID[flightIDCounter] = "GarudaAirlines2";
        }
    }
    
    public void flight3(){
        flightIDCounter++;
        if(flightIDCounter >= 20){
            System.out.println("Booking limit per person exceeded, don't book more than 20 flight trips");
            this.menu();
        }
        else{
           this.confirmedList3();
           this.flightName = "MalindoAir3";
           flightID[flightIDCounter] = "MalindoAir3";
        }
    }
    
    public void flight4(){
        flightIDCounter++;
        if(flightIDCounter >= 20){
            System.out.println("Booking limit per person exceeded, don't book more than 20 flight trips");
            this.menu();
        }
        else{
           this.confirmedList4();
           this.flightName = "MalaysiaAirlines4";
           flightID[flightIDCounter] = "MalaysiaAirlines4";
        }
    }
    
    public void flight5(){
        flightIDCounter++;
        if(flightIDCounter >= 20){
            System.out.println("Booking limit per person exceeded, don't book more than 20 flight trips");
            this.menu();
        }
        else{
           this.confirmedList5();
           this.flightName = "FireFly5";
           flightID[flightIDCounter] = "FireFly5";
        }
    }
    
    public void flight6(){
        flightIDCounter++;
        if(flightIDCounter >= 20){
            System.out.println("Booking limit per person exceeded, don't book more than 20 flight trips");
            this.menu();
        }
        else{
           this.confirmedList6();
           this.flightName = "AirAsia6";
           flightID[flightIDCounter] = "AirAsia6";
        }
    }
    
    public void flight7(){
        flightIDCounter++;
        if(flightIDCounter >= 20){
            System.out.println("Booking limit per person exceeded, don't book more than 20 flight trips");
            this.menu();
        }
        else{
           this.confirmedList7();
           this.flightName = "FireFly7";
           flightID[flightIDCounter] = "FireFly7";
        }
    }
    
    public void flight8(){
        flightIDCounter++;
        if(flightIDCounter >= 20){
            System.out.println("Booking limit per person exceeded, don't book more than 20 flight trips");
            this.menu();
        }
        else{
            this.confirmedList8();
            this.flightName = "MalaysiaAirlines8";
            flightID[flightIDCounter] = "MalaysiaAirlines8";
        }
    }
    
    public void flight9(){
        flightIDCounter++;
        if(flightIDCounter >= 20){
            System.out.println("Booking limit per person exceeded, don't book more than 20 flight trips");
            this.menu();
        }
        else{
           this.confirmedList9();
           this.flightName = "AisAsia9";
           flightID[flightIDCounter] = "AirAsia9";
        }
    }
    
    public void flight10(){
        flightIDCounter++;
        if(flightIDCounter >= 20){
            System.out.println("Booking limit per person exceeded, don't book more than 20 flight trips");
            this.menu();
        }
        else{
            this.confirmedList10();
            this.flightName = "MalaysiaAirlines10";
            flightID[flightIDCounter] = "MalaysiaAirlines10";
        }
    }
        
    public void flight11(){
        flightIDCounter++;
        if(flightIDCounter >= 20){
            System.out.println("Booking limit per person exceeded, don't book more than 20 flight trips");
            this.menu();
        }
        else{
            this.confirmedList11();
            this.flightName = "MalindoAir11";
            flightID[flightIDCounter] = "MalindoAir11";
        }
    }
    
    
    
    public void confirmedList1(){
        c1bookCounter++;
        if(!isFullc1()){
            if(isEmptyc1()){
                c1 [firstSeatc1] = this.enterNickName;
                nextSeatc1++;
            }
            else{
                c1 [nextSeatc1] = this.enterNickName;
                nextSeatc1++;
            }
            System.out.println("Now in confirmed list");
        }
        else{
            this.waitingList1();
        }    
    }
    
    public void confirmedList2(){
       c2bookCounter++;
        if(!isFullc2()){
            if(isEmptyc2()){
                c2 [firstSeatc2] = this.enterNickName;
                nextSeatc2++;
            }
            else{
                c2 [nextSeatc2] = this.enterNickName;
                nextSeatc2++;
            }
            System.out.println("Now in confirmed list");
        }
        else{
            this.waitingList2();
        }    
    }
    
    public void confirmedList3(){
        c3bookCounter++;
        if(!isFullc3()){
            if(isEmptyc3()){
                c3 [firstSeatc3] = this.enterNickName;
                nextSeatc3++;
            }
            else{
                c3 [nextSeatc3] = this.enterNickName;
                nextSeatc3++;
            }
            System.out.println("Now in confirmed list");
        }
        else{
            this.waitingList3();
        }    
    }
    
    public void confirmedList4(){
        c4bookCounter++;
        if(!isFullc4()){
            if(isEmptyc4()){
                c4 [firstSeatc4] = this.enterNickName;
                nextSeatc4++;
            }
            else{
                c4 [nextSeatc4] = this.enterNickName;
                nextSeatc4++;
            }
            System.out.println("Now in confirmed list");
        }
        else{
            this.waitingList4();
        }    
    }
    
    public void confirmedList5(){
        c5bookCounter++;
        if(!isFullc5()){
            if(isEmptyc5()){
                c5 [firstSeatc5] = this.enterNickName;
                nextSeatc5++;
            }
            else{
                c5 [nextSeatc5] = this.enterNickName;
                nextSeatc5++;
            }
            System.out.println("Now in confirmed list");
        }
        else{
            this.waitingList5();
        }    
    }
    
    public void confirmedList6(){
        c6bookCounter++;
        if(!isFullc6()){
            if(isEmptyc6()){
                c6 [firstSeatc6] = this.enterNickName;
                nextSeatc6++;
            }
            else{
                c6 [nextSeatc6] = this.enterNickName;
                nextSeatc6++;
            }
            System.out.println("Now in confirmed list");
        }
        else{
            this.waitingList6();
        }    
    }
    
    public void confirmedList7(){
        c7bookCounter++;
        if(!isFullc7()){
            if(isEmptyc7()){
                c7 [firstSeatc7] = this.enterNickName;
                nextSeatc7++;
            }
            else{
                c7 [nextSeatc7] = this.enterNickName;
                nextSeatc7++;
            }
            System.out.println("Now in confirmed list");
        }
        else{
            this.waitingList7();
        }    
    }
    
    public void confirmedList8(){
        c8bookCounter++;
        if(!isFullc8()){
            if(isEmptyc8()){
                c8 [firstSeatc8] = this.enterNickName;
                nextSeatc8++;
            }
            else{
                c8 [nextSeatc8] = this.enterNickName;
                nextSeatc8++;
            }
            System.out.println("Now in confirmed list");
        }
        else{
            this.waitingList8();
        }    
    }
    
    public void confirmedList9(){
        c8bookCounter++;
        if(!isFullc9()){
            if(isEmptyc9()){
                c9 [firstSeatc9] = this.enterNickName;
                nextSeatc9++;
            }
            else{
                c9 [nextSeatc9] = this.enterNickName;
                nextSeatc9++;
            }
            System.out.println("Now in confirmed list");
        }
        else{
            this.waitingList9();
        }    
    }
    
   public void confirmedList10(){
        c8bookCounter++;
        if(!isFullc10()){
            if(isEmptyc10()){
                c10 [firstSeatc10] = this.enterNickName;
                nextSeatc10++;
            }
            else{
                c10 [nextSeatc10] = this.enterNickName;
                nextSeatc10++;
            }
            System.out.println("Now in confirmed list");
        }
        else{
            this.waitingList10();
        }    
    }
   
   public void confirmedList11(){
        c8bookCounter++;
        if(!isFullc11()){
            if(isEmptyc11()){
                c11 [firstSeatc11] = this.enterNickName;
                nextSeatc11++;
            }
            else{
                c11 [nextSeatc11] = this.enterNickName;
                nextSeatc11++;
            }
            System.out.println("Now in confirmed list");
        }
        else{
            this.waitingList11();
        }    
    }
    
   
    
    public void waitingList1(){
        w1bookCounter++;
        if(!isFullw1()){
            if(isEmptyw1()){
                w1 [firstSeatw1] = this.enterNickName;
                nextSeatw1++;
            }
            else{
                w1 [nextSeatw1] = this.enterNickName;
                nextSeatw1++;
            }
            System.out.println("Now in waiting list");
        }
   
    }
    
    public void waitingList2(){
        w1bookCounter++;
        if(!isFullw2()){
            if(isEmptyw2()){
                w2 [firstSeatw2] = this.enterNickName;
                nextSeatw2++;
            }
            else{
                w2 [nextSeatw2] = this.enterNickName;
                nextSeatw2++;
            }
            System.out.println("Now in waiting list");
        }
   
    }
    
    public void waitingList3(){
        w1bookCounter++;
        if(!isFullw3()){
            if(isEmptyw3()){
                w3 [firstSeatw3] = this.enterNickName;
                nextSeatw3++;
            }
            else{
                w3 [nextSeatw3] = this.enterNickName;
                nextSeatw3++;
            }
            System.out.println("Now in waiting list");
        }
   
    }
    
    public void waitingList4(){
        w1bookCounter++;
        if(!isFullw4()){
            if(isEmptyw4()){
                w4 [firstSeatw4] = this.enterNickName;
                nextSeatw4++;
            }
            else{
                w4 [nextSeatw4] = this.enterNickName;
                nextSeatw4++;
            }
            System.out.println("Now in waiting list");
        }
   
    }
    
    public void waitingList5(){
        w1bookCounter++;
        if(!isFullw5()){
            if(isEmptyw5()){
                w5 [firstSeatw5] = this.enterNickName;
                nextSeatw5++;
            }
            else{
                w5 [nextSeatw5] = this.enterNickName;
                nextSeatw5++;
            }
            System.out.println("Now in waiting list");
        }
   
    }
    
    public void waitingList6(){
        w1bookCounter++;
        if(!isFullw6()){
            if(isEmptyw6()){
                w6 [firstSeatw6] = this.enterNickName;
                nextSeatw6++;
            }
            else{
                w6 [nextSeatw6] = this.enterNickName;
                nextSeatw6++;
            }
            System.out.println("Now in waiting list");
        }
   
    }
    
    public void waitingList7(){
        w1bookCounter++;
        if(!isFullw7()){
            if(isEmptyw7()){
                w7 [firstSeatw7] = this.enterNickName;
                nextSeatw7++;
            }
            else{
                w7 [nextSeatw7] = this.enterNickName;
                nextSeatw7++;
            }
            System.out.println("Now in waiting list");
        }
   
    }
    
    public void waitingList8(){
        w1bookCounter++;
        if(!isFullw8()){
            if(isEmptyw8()){
                w8 [firstSeatw8] = this.enterNickName;
                nextSeatw8++;
            }
            else{
                w8 [nextSeatw8] = this.enterNickName;
                nextSeatw8++;
            }
            System.out.println("Now in waiting list");
        }
   
    }
    
    public void waitingList9(){
        w1bookCounter++;
        if(!isFullw9()){
            if(isEmptyw9()){
                w9 [firstSeatw9] = this.enterNickName;
                nextSeatw9++;
            }
            else{
                w9 [nextSeatw9] = this.enterNickName;
                nextSeatw9++;
            }
            System.out.println("Now in waiting list");
        }
   
    }
    
    public void waitingList10(){
        w1bookCounter++;
        if(!isFullw10()){
            if(isEmptyw10()){
                w10 [firstSeatw10] = this.enterNickName;
                nextSeatw10++;
            }
            else{
                w10 [nextSeatw10] = this.enterNickName;
                nextSeatw10++;
            }
            System.out.println("Now in waiting list");
        }
   
    }
    
    public void waitingList11(){
        w1bookCounter++;
        if(!isFullw11()){
            if(isEmptyw11()){
                w11 [firstSeatw11] = this.enterNickName;
                nextSeatw11++;
            }
            else{
                w11 [nextSeatw11] = this.enterNickName;
                nextSeatw11++;
            }
            System.out.println("Now in waiting list");
        }
   
    }
    
    public void editInfo(){
        this.splitSectionsOfDifferentMethods();
    
        System.out.println("Please create a username for the purpose of file preservation");
        String fillUserName = s.next();
        this.userFileName = fillUserName;
        
    try{
            // Create new file
            String path=this.userFileName+".txt";
            File file = new File(path);

            // If file doesn't exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            // Write in file
            
            String [] infos = new String [3];
            
            System.out.println("Enter your information below : ");
            
            System.out.println("Name :");
            String data1 = s.next();
            infos[0] = data1;
            
            System.out.println("Age : ");
            String data2 = s.next();
            infos[1] = data2;
            
            System.out.println("Passport number :");
            String data3 = s.next();
            infos[2] = data3;
                    
        
            String data4 = this.getFlightName();
            if(data4 == null ){
                System.out.println("No flight trip ticket booked yet");
            }
            
            bw.write("Name : " + data1 + "\t\nAge : " + data2 + "\t\nPassport No. : " + data3 + "\t\nFlightName : " + data4 );
       

            // Close connection
            bw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    
    this.menu();
    }
    
    public void cancelTicket(){
        System.out.println("The tickets booked by you are :");
        System.out.println("0 : "+flightID[0]);
        System.out.println("1 : "+flightID[1]);
        System.out.println("2 : "+flightID[2]);
        System.out.println("3 : "+flightID[3]);
        System.out.println("4 : "+flightID[4]);
        System.out.println("5 : "+flightID[5]);
        System.out.println("6 : "+flightID[6]);
        System.out.println("7 : "+flightID[7]);
        System.out.println("8 : "+flightID[8]);
        System.out.println("9 : "+flightID[9]);
        System.out.println("10 : "+flightID[10]);
        System.out.println("11 : "+flightID[11]);

        System.out.println("Enter the number listed to cancel your booking");
        int b= s.nextInt();
        System.out.println("You have chosen the number "+b+" for your booking cancellation");
        
        if(flightID[b] == "AirAsia1"){
            flightID[b] = "null";
            this.cancelc1();
        }
        else if(flightID[b] == "GarudaAirlines2"){
            flightID[b] = "null";
            this.cancelc2();
        }
        else if(flightID[b] == "MalindoAir3"){
            flightID[b] = "null";
            this.cancelc3();
        }
        else if(flightID[b] == "MalaysiaAirlines4"){
            flightID[b] = "null";
            this.cancelc4();
        }
        else if(flightID[b] == "FireFly5"){
            flightID[b] = "null";
            this.cancelc5();
        }
        else if(flightID[b] == "AirAsia6"){
            flightID[b] = "null";
            this.cancelc6();
        }
        else if(flightID[b] == "FireFly7"){
            flightID[b] = "null";
            this.cancelc7();
        }
        else if(flightID[b] == "MalaysiaAirlines8"){
            flightID[b] = "null";
            this.cancelc8();
        }
        else if(flightID[b] == "AirAsia9"){
            flightID[b] = "null";
            this.cancelc9();
        }
        else if(flightID[b] == "MalaysiaAirlines10"){
            flightID[b] = "null";
            this.cancelc10();
        }
        else if(flightID[b] == "MalindoAir11"){
            flightID[b] = "null";
            this.cancelc11();
        }      
        System.out.println("Booking cancelled...");
        this.menu();
    }
    
    public void cancelc1(){
        c1[nextSeatc1-1] = "null";
        if(isEmptyc1()){
            System.out.println("");
        }
        else{
            c1[nextSeatc1-1] = w1[0];
            for(int p = 0; p<maxCapacity ; p++){
                w1[p] = w1[p+1];
            }
        }
    }
    
    public void cancelc2(){
        c2[nextSeatc2-1] = "null";
        if(isEmptyc2()){
            System.out.println("All bookings in this flight trip is empty");
        }
        else{
            c2[nextSeatc2-1] = w2[0];
            for(int p = 0; p<maxCapacity ; p++){
                w2[p] = w2[p+1] ;
            }
        }
    }
    
    public void cancelc3(){
        c3[nextSeatc3-1] = "null";
        if(isEmptyc3()){
            System.out.println("All bookings in this flight trip is empty");
        }
        else{
            c3[nextSeatc3-1] = w3[0];
            for(int p = 0; p<maxCapacity ; p++){
                w3[p] = w3[p+1];
            }
        }
    }
    
    public void cancelc4(){
        c4[nextSeatc4-1] = "null";
        if(isEmptyc4()){
            System.out.println("All bookings in this flight trip is empty");
        }
        else{
            c4[nextSeatc4-1] = w4[0];
            for(int p = 0; p<maxCapacity ; p++){
                w4[p] = w4[p+1];
            }
        }
    }
    
    public void cancelc5(){
        c5[nextSeatc5-1] = "null";
        if(isEmptyc5()){
            System.out.println("All bookings in this flight trip is empty");
        }
        else{
            c5[nextSeatc5-1] = w5[0];
            for(int p = 0; p<maxCapacity ; p++){
                w5[p] = w5[p+1];
            }
        }
    }
    
    public void cancelc6(){
        c6[nextSeatc6-1] = "null";
        if(isEmptyc6()){
            System.out.println("All bookings in this flight trip is empty");
        }
        else{
            c6[nextSeatc6-1] = w6[0];
            for(int p = 0; p<maxCapacity ; p++){
                w6[p] = w6[p+1];
            }
        }
    }
    
    public void cancelc7(){
        c7[nextSeatc7-1] = "null";
        if(isEmptyc7()){
            System.out.println("All bookings in this flight trip is empty");
        }
        else{
            c7[nextSeatc7-1] = w7[0];
            for(int p = 0; p<maxCapacity ; p++){
                w7[p] = w7[p+1];
            }
        }
    }
    
    public void cancelc8(){
        c8[nextSeatc8-1] = "null";
        if(isEmptyc8()){
            System.out.println("All bookings in this flight trip is empty");
        }
        
        else{
            c8[nextSeatc8-1] = w8[0];
            for(int p = 0; p<maxCapacity ; p++){
                w8[p] = w8[p+1];
            }
        }
    }
    
    public void cancelc9(){
        c9[nextSeatc9-1] = "null";
        if(isEmptyc9()){
            System.out.println("All bookings in this flight trip is empty");
        }
        else{
            c9[nextSeatc9-1] = w9[0];
            for(int p = 0; p<maxCapacity ; p++){
                w9[p] = w9[p+1];
            }
        }
    }
    
    public void cancelc10(){
        c10[nextSeatc10-1] = "null";
        if(isEmptyc10()){
            System.out.println("All bookings in this flight trip is empty");
        }
        else{
            c10[nextSeatc10-1] = w10[0];
            for(int p = 0; p<maxCapacity ; p++){
                w10[p] = w10[p+1];
            }
        }
    }
    
    public void cancelc11(){
        c11[nextSeatc11-1] = "null";
        if(isEmptyc11()){
            System.out.println("All bookings in this flight trip is empty");
        }
        else{
            c11[nextSeatc11-1] = w11[0];
            for(int p = 0; p<maxCapacity ; p++){
                w11[p] = w11[p+1];
            }
        }
    }
    
    public void displayAllConfirmedBooking(){
        
        System.out.println("AirAsia1 Booking Display :");
        for(int j = 0 ; j<maxCapacity ; j++ ){
        System.out.println(c1[j]);
        }
        
        System.out.println("GarudaAirlines2 Booking Display :");
        for(int j = 0 ; j<maxCapacity ; j++ ){
        System.out.println(c2[j]);
        }
        
        System.out.println("MalindoAir3 Booking Display :");
        for(int j = 0 ; j<maxCapacity ; j++ ){
        System.out.println(c3[j]);
        }
        
        System.out.println("MalaysiaAirlines4 Booking Display :");
        for(int j = 0 ; j<maxCapacity ; j++ ){
        System.out.println(c4[j]);
        }
        
        System.out.println("FireFly5 Booking Display :");
        for(int j = 0 ; j<maxCapacity ; j++ ){
        System.out.println(c5[j]);
        }
        
        System.out.println("AirAsia6 Booking Display :");
        for(int j = 0 ; j<maxCapacity ; j++ ){
        System.out.println(c6[j]);
        }
        
        System.out.println("FireFly7 Booking Display :");
        for(int j = 0 ; j<maxCapacity ; j++ ){
        System.out.println(c7[j]);
        }
        
        System.out.println("MalaysiaAirlines8 Booking Display :");
        for(int j = 0 ; j<maxCapacity ; j++ ){
        System.out.println(c8[j]);
        }
        
        System.out.println("AirAsia9 Booking Display :");
        for(int j = 0 ; j<maxCapacity ; j++ ){
        System.out.println(c9[j]);
        }
        
        System.out.println("MalaysiaAirlines10 Booking Display :");
        for(int j = 0 ; j<maxCapacity ; j++ ){
        System.out.println(c10[j]);
        }
        
        System.out.println("MalindoAir11 Booking Display :");
        for(int j = 0 ; j<maxCapacity ; j++ ){
        System.out.println(c11[j]);
        }
        
    }
    
    public void displayAllWaitingBooking(){
        
        System.out.println("AirAsia1 Waiting Display :");
        for(int j = 0 ; j<maxCapacity ; j++ ){
        System.out.println(w1[j]);
        }
        
        System.out.println("GarudaAirlines2 Waiting Display :");
        for(int j = 0 ; j<maxCapacity ; j++ ){
        System.out.println(w2[j]);
        }
        
        System.out.println("MalindoAir3 Waiting Display :");
        for(int j = 0 ; j<maxCapacity ; j++ ){
        System.out.println(w3[j]);
        }
        
        System.out.println("MalaysiaAirlines4 Waiting Display :");
        for(int j = 0 ; j<maxCapacity ; j++ ){
        System.out.println(w4[j]);
        }
        
        System.out.println("FireFly5 Waiting Display :");
        for(int j = 0 ; j<maxCapacity ; j++ ){
        System.out.println(w5[j]);
        }
        
        System.out.println("AirAsia6 Waiting Display :");
        for(int j = 0 ; j<maxCapacity ; j++ ){
        System.out.println(w6[j]);
        }
        
        System.out.println("FireFly7 Waiting Display :");
        for(int j = 0 ; j<maxCapacity ; j++ ){
        System.out.println(w7[j]);
        }
        
        System.out.println("MalaysiaAirlines8 Waiting Display :");
        for(int j = 0 ; j<maxCapacity ; j++ ){
        System.out.println(w8[j]);
        }
        
        System.out.println("AirAsia9 Waiting Display :");
        for(int j = 0 ; j<maxCapacity ; j++ ){
        System.out.println(w9[j]);
        }
        
        System.out.println("MalaysiaAirlines10 Waiting Display :");
        for(int j = 0 ; j<maxCapacity ; j++ ){
        System.out.println(w10[j]);
        }
        
        System.out.println("MalindoAir11 Waiting Display :");
        for(int j = 0 ; j<maxCapacity ; j++ ){
        System.out.println(w11[j]);
        }
    }
    
    public void viewStatus(){
        System.out.println("Booking list displayed");
        this.displayAllConfirmedBooking();
        System.out.println("---------------------------------------------------------------");
        System.out.println("Waiting list displayed");
        this.displayAllWaitingBooking();
        System.out.println("---------------------------------------------------------------");
        
        
        this.menu();
    }
    
    
    public String getFlightName(){
     return this.flightName;   
    }
    
    public void splitSectionsOfDifferentMethods(){
        System.out.println("----------------------------------------------------------------------");
    }
    
    public void exit(){
        System.out.println("Thanks for using our flight booking system...");
    }
    
    
    
    
    
}