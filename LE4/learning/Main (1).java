/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    try{
	        Filereader fr = new FileReader("ajax.txt");
	    }
	catch(Exception e){
	    System.out.println(e.getMessage());
	    }
		System.out.println("Hello World");
	}
}
