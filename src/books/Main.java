package books;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
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
					
					i--;
					System.err.println("Errore nella creazione del libro" + e.getMessage());
				} 
				
			}		
			
			sc.close();
		}
		
		FileWriter myWriter = new FileWriter("./BookJava.txt");

        for (int i = 0; i < intBooks; i++) {

            Book l = books[i];
            myWriter.write(l.toString() + "\n");
        }

        myWriter.close();

        File bookFile = new File("./BookJava.txt");
        Scanner reader = new Scanner(bookFile);

        while (reader.hasNextLine()) {

            String line = reader.nextLine();
            System.out.println(line);

        }

        reader.close();
	}
}
