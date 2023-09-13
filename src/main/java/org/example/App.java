package org.example;

import org.entity.Librarian;
import org.entity.Reader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Librarian firstLibrarian=new Librarian(
                1,
                "kkofo&&rhk123",
                "elouardy",
                "Abderrahim",
                "email@email.com",
                "113&ABDE");
        Reader firstReader=new Reader(
                2,
                "kkofo&&rhk123",
                "elouardy",
                "Abderrahim",
                "email@email.com",
                "113&ABDE");

        System.out.println("---------------------------------");
        System.out.println(firstReader.toString());
        System.out.println("---------------------------------");
        System.out.println(firstLibrarian.toString());


    }
}
