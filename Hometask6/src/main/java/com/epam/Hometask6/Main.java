package com.epam.Hometask6;
import java.util.*;

public class Main {
	    public static void main(String[] args) 
	    {
	    	CustomList<Integer> dataList = new CustomList<>();
	        boolean decision = true;
	        Scanner sc =  new Scanner(System.in);
	        dataList.addItem(1);
	        dataList.addItem(2);
	        dataList.addItem(3);
	        dataList.addItem(4);
	        dataList.addItem(5);
	        dataList.addItem(6);
	        dataList.addItem(7);
	        dataList.addItem(8);
	        dataList.addItem(9);
	        dataList.addItem(10);
	        System.out.println("The size of list is: "+dataList.size());
	        System.out.println("Your list is "+dataList);
	        System.out.println("\nDo you want to perform any other operation?");
	        while(decision) {
	        	System.out.println("\n1. Add item in to list\n2. Remove item from the list\n3. Retrieve/Access the item from the list\n4. Get the size of the list\n5. Print the list");
	        	int choice = sc.nextInt();
	        	switch(choice) {
	        	case 1 : 
	        		System.out.println("Enter elements/item to be added");
	        		dataList.addItem(sc.nextInt());
	        	System.out.println("Do you want to perform any other operation?");
	        	if(sc.next().charAt(0) == 'y'|| sc.next().charAt(0)== 'Y') {
	        		decision = true;
	        		break;
	        	} 
	        	else if(sc.next().charAt(0) == 'n' || sc.next().charAt(0) == 'N'){
	        		System.out.println("Thank you!");
	        		decision = false;
	        		break;
	        	}
	        	case 2 : 
	        		System.out.println("Enter the index of the element to be deleted.");
	        		dataList.deleteItem(sc.nextInt());
	        	System.out.println("Do you want to perform any other operation?");
	        	if(sc.next().charAt(0) == 'y'|| sc.next().charAt(0) == 'Y') {
	        		System.out.println("Thank you!");
	        		decision = true;
	        		break;
	        	} 
	        	else if(sc.next().charAt(0) == 'n' || sc.next().charAt(0) == 'N'){
	        		decision = false;
	        		break;
	        	}
	        	
	        	case 3 :
	        		System.out.println("Enter index : Index from 0");
	        		System.out.println("The element is "+dataList.getItem(sc.nextInt()));
	        	System.out.println("Do you want perform any other operation?");
	        	if(sc.next().charAt(0) == 'y'|| sc.next().charAt(0) == 'Y') {
	        		decision = true;
	        		break;
	        	} 
	        	else if(sc.next().charAt(0) == 'n' || sc.next().charAt(0) == 'N'){
	        		System.out.println("Thank you!");
	        		decision = false;
	        		break;
	        	}
	        	case 4 :
	        		System.out.println("The size of list is "+dataList.size());
	        		System.out.println("Do you want perform any other operation?");
	        		if(sc.next().charAt(0) == 'y'|| sc.next().charAt(0) == 'Y') {
	        		decision = true;
	        		break;
	        		} 
	        		else if(sc.next().charAt(0) == 'n' || sc.next().charAt(0) == 'N'){
	        		System.out.println("Thank you!");
	        		decision = false;
	        		break;
	        	}	
	        	case 5 : 
	        	System.out.println("Your list is "+dataList);
	        	System.out.println("Do you want to perform any other operation?");
	        	if(sc.next().charAt(0) == 'y'||sc.next().charAt(0) == 'Y') {
	        		decision = true;
	        		break;
	        	} 
	        	else if(sc.next().charAt(0) == 'n' || sc.next().charAt(0) == 'N'){
	        		System.out.println("Thank you!");
	        		decision = false;
	        		break;
	        	}
	        	}
	        
	        }
	  }
}

	   

	