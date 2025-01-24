package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    Scanner scan = new Scanner(System.in);
    ArrayList<String> typeList = new ArrayList<>();
    ArrayList<String> departureList = new ArrayList<>(); 
    ArrayList<String> destinationList = new ArrayList<>();
    ArrayList<String> date1List = new ArrayList<>();
    ArrayList<String> date2List = new ArrayList<>();
    ArrayList<String> nameList = new ArrayList<>();
    ArrayList<String> class1List = new ArrayList<>();
    ArrayList<Integer> ticketList = new ArrayList<>();
    
    
    int choose = -1;
    String flightType = "";
    String airPort = "";
    String airPort2 = "";
    String date = "";
    String date2 = "";
    String flightClass = "";
    int ticket = 0;
    int basePrice;
    String name ="";
    int totalPrice = 0;
    
    
    public void Menu () {
    	
    	System.out.println();
		System.out.println("Sistem Created By Admin Group 2 !");
		System.out.println();
		String anonymousSymbol = "   /$$$$$$        /$$       /$$  /$$$$$$   /$$$$$$  /$$$$$$$$ /$$$$$$$\n" +
                "  /$$__  $$      | $$      |__/ /$$__  $$ /$$__  $$|__  $$__/| $$__  $$\n" +
                " | $$  \\__/      | $$       /$$| $$  \\ $$| $$  \\__/   | $$   | $$  \\ $$\n" +
                " | $$ /$$$$      | $$      | $$| $$$$$$$$| $$         | $$   | $$$$$$$/\n" +
                " | $$|_  $$      | $$      | $$| $$__  $$| $$         | $$   | $$__  $$\n" +
                " | $$  \\ $$      | $$      | $$| $$  | $$| $$    $$   | $$   | $$  \\ $$\n" +
                "  \\$$$$$$/      | $$$$$$$$| $$| $$  | $$|  $$$$$$/   | $$   | $$  | $$\n" +
                "   \\______/       |________/|__/|__/  |__/ \\______/    |__/   |__/  |__/\n";
		System.out.println(anonymousSymbol);
		
		do {
			System.out.println("\n\n");
			System.out.println("Welcome to Govel ");
			System.out.println("Let's Travel ");
			System.out.println("=================== ");
			System.out.println("1. Buy Tickets ");
			System.out.println("2. View Tickets ");
			System.out.println("3. Exit ");
			System.out.println();
			System.out.print("Choose Menu : ");
			choose = scan.nextInt();scan.nextLine();
			
			switch (choose){
			
			case 1 : 
				buyTickets();
				break;
			
			case 2 :
				viewTickets ();
				break;
				
			default :
				
				System.out.println("Thank you for using this apps :> ");
				
				
			
			}
			
			
		}while(choose !=3);
    }

    	public void buyTickets (){
    		
    		System.out.print("Input your name : ");
    		name = scan.nextLine();
    		nameList.add(name);
    		
    	do {
    		System.out.print("Input Flight Type [Domestic] | [International]: ");
    		flightType = scan.nextLine();
    		
    		if (!(flightType.equals("Domestic")|| flightType.equals("International"))) {
    			System.out.println("Flight Type Invalid ! ");
    		}
    	}while (!(flightType.equals("Domestic")|| flightType.equals("International")));
    	typeList.add(flightType);
    	
    	
    	do {
    		System.out.print("Input Departure City [3 - 20 Characters]: ");
    		airPort = scan.nextLine();
    		
    		if (!(airPort.length() > 2 && airPort.length() < 21 )) {
    			System.out.println("Departure City Invalid ");
    		}
    	}while (!(airPort.length() > 2 && airPort.length() < 21 ));
    	departureList.add(airPort);
    	
    	

    	do {
    		System.out.print("Input Destination City [3 - 20 Characters]: ");
    		airPort2 = scan.nextLine();
    		
    		if (!(airPort2.length() > 2 && airPort2.length() < 21 )) {
    			System.out.println("Destination City Invalid ");
    		}
    	}while (!(airPort2.length() > 2 && airPort2.length() < 21 ));
    	destinationList.add(airPort2);
    	
    	

    	do {
    		System.out.println("Input Departure Date [8 Characters - 31] : ");
    		date = scan.nextLine();
    		
    		if (!(date.length() > 7 && date.length() < 32 )) {
    			System.out.println("Departure City Invalid ");
    		}
    	}while (!(date.length() > 7 && date.length() < 32));
    	date1List.add(date);
    	
    	do {
    		System.out.println("Input Return Flight Date [8 Characters - 31] : ");
    		date2 = scan.nextLine();
    		
    		if (!(date2.length() > 7 && date2.length() < 32 )) {
    			System.out.println("Destination City Invalid ");
    		}
    	}while (!(date2.length() > 7 && date2.length() < 32));
    	date2List.add(date);
    	
    	do {
    		System.out.print("Select Flight Class : [Eco] | [Business] | [FirstClass] : ");
    		flightClass = scan.nextLine();
    		
    		if (!(flightClass.equals("Eco") || flightClass.equals("Business") || flightClass.equals("FirstClass"))) {
    			System.out.println("Flight Claas Invalid ");
    		}
    		
    	}while (!(flightClass.equals("Eco") || flightClass.equals("Business") || flightClass.equals("FirstClass")));
    	class1List.add(flightClass);
    	
    	
    	do {
    		System.out.print("Ticket Purchasing [1-10]: ");
    		ticket = scan.nextInt();
    		
    		if(!(ticket > 0 && ticket < 11)) {
    			System.out.println("Ticket Invalid");
    		}
    		
    	}while (!(ticket > 0 && ticket < 11));
    	ticketList.add(ticket);
    	
    	if (flightClass.equals("Eco")) {
    		basePrice = 800000;
    	}else {
    		if (flightClass.equals("Business")){
    		basePrice = 1000000;
    		}
    		if (flightClass.equals("FirstClass")) { 
    		basePrice = 1500000;
    		}
    		
    	}
    	}
    	
    	
    	
    	public void viewTickets () {
    		if (nameList.isEmpty()) {
    			System.out.println("PLEASE INPUT YOUR DATA FIRST! ");
    			System.out.println("Enter to continue..... ");
    			scan.nextLine();
    		}else {
    		
    	System.out.println("========================================================================================================================================================================================================" );
    	System.out.printf("%-5s| %-15s | %-5s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s\n" , " No ", " Name"," Qty"," Flight Type ", " Departure ", " Destination ", " Departure Date ", "Return Flight Date ", "Flight Class");
    	System.out.println("========================================================================================================================================================================================================" );
    	
    	for(int i = 0; i < nameList.size();i++) {
    		System.out.println (("|" + (i + 1) + "   |   " + nameList.get(i)+ "   |   " + ticketList.get(i) +"  |  "+ typeList.get(i)+"     |     " + departureList.get(i) + "    |    " + destinationList.get(i) + "      |      " + date1List.get(i) + "    |      " 
    	+ date2List.get(i) + "    |       " + class1List.get(i)));
    		
    
    	}
    	
    		
    	}
    	
    	System.out.println("\n\n\n");	
    	totalPrice = basePrice * ticket;
    	System.out.println("Payment Invoice ");
    	System.out.println("======================");
    	System.out.println("Name                 : " + name);
    	System.out.println("Flight Type          : " + flightType);
		System.out.println("Departure City       : " + airPort);
		System.out.println("Destination City     : " + airPort2);
		System.out.println("Arrived Date         : " + date);
		System.out.println("Return Date          : " + date2);
		System.out.println("Flight Class         : " + flightClass);
		System.out.println("Ticket               : " + ticket);
    	System.out.println("Price                : " + "Rp" + totalPrice);
    	
    	
    	
    }		
    		
    		
    		
    public Main() {

            Menu();

        

    }

    public static void main(String[] args) {
        new Main();
    }
}