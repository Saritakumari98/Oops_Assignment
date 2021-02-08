package encapsulationAndInheritance;

import java.util.Scanner;

public class BookDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Book book=new Book();//it create object of Book class
		EngineeringBook engineerbook=new EngineeringBook();//it create object of EngineeringBook class
		
		System.out.println("Enter the Book Number");
		book.setBookNo(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Enter the Book Title");
		book.setTitle(sc.nextLine());
		
		System.out.println("Enter the Book Author");
		book.setAuthor(sc.nextLine());
		
		
		System.out.println("Enter the Book Price");
		book.setPrice(sc.nextFloat());
		
		
		System.out.println("Book Number is: "+book.getBookNo());
		System.out.println("Book Title is: "+book.getTitle());
		System.out.println("Book Author is: "+book.getAuthor());
		System.out.println("Book Price is: "+book.getPrice());
		
		System.out.println();
		
      //we cannot access the input entered by using base class object reference
		System.out.println("Book Number is: "+engineerbook.getBookNo());
		System.out.println("Book Title is: "+engineerbook.getTitle());
		System.out.println("Book Author is: "+engineerbook.getAuthor());
		System.out.println("Book Price is: "+engineerbook.getPrice());
		
		System.out.println();
       // Taking user input using EngineeringBook class object
		
		System.out.println("Enter the EngineeringBook Number");
		engineerbook.setBookNo(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Enter the EngineeringBook Title");
		engineerbook.setTitle(sc.nextLine());
		
		System.out.println("Enter the EngineeringBook Author");
		engineerbook.setAuthor(sc.nextLine());
		
        System.out.println("Enter the EngineeringBook Price");
		engineerbook.setPrice(sc.nextFloat());
		
		sc.nextLine();
	 //Taking input of  EngineeringBook class field
		System.out.println("Enter the EngineeringBook Category");
		engineerbook.setCategory(sc.nextLine());
		sc.close();
		
		System.out.println("EngineeringBook Number is: "+engineerbook.getBookNo());
		System.out.println("EngineeringBook Title is: "+engineerbook.getTitle());
		System.out.println("EngineeringBook Author is: "+engineerbook.getAuthor());
		System.out.println("EngineeringBook Price is: "+engineerbook.getPrice());
		System.out.println("EngineeringBook Category is: "+engineerbook.getCategory());
		

	}

}
