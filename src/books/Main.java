package books;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanti libri vuoi aggiungere?");
		int intBooks = sc.nextInt();
		
		Book[] books = new Book[intBooks];
		
		if ( intBooks > 0) {
			
			for ( int i = 0; i < intBooks; i++) {
				
				System.out.println("Qual'è il titolo del libro?");
				String title = sc.next();
				
				System.out.println("Quante pagine possiede?");
				int pages = sc.nextInt();
				
				System.out.println("Chi è l'autore?");
				String author = sc.next();
				
				System.out.println("Qual'è l'editore?");
				String publisher = sc.next();
				
				try {
					
					Book b = new Book ( title, pages, author, publisher );
					books[i]  = b;
				} catch(Exception e) {
					
					System.err.println("Errore nella creazioneel libro  " + e.getMessage());
				}
				
			}		
			
		}
		
		System.out.println(Arrays.asList(books));
		
	}
}
