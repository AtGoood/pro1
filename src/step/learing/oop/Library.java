package step.learing.oop;

import step.learing.oop.Anno.DemmoClass;
import step.learing.oop.serial.Serialitation;
import step.learing.oop.serial.dataobj;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@DemmoClass
public class Library {
    private final List<Literature> funds ;

    public Library() {

        funds = new ArrayList<>() ;
    }

    public void add( Literature literature ) {
        funds.add( literature ) ;
    }

    public void printFunds() {
        for( Literature literature : funds ) {
            if( literature instanceof Printable ) {
                ((Printable)literature).print() ;
            }
            else {
                System.out.println( "Unprintable: " + literature.getTitle() ) ;
            }
        }
    }

    public void run() {
        add(new Book()
                .setAuthor( "Knuth" )
                .setTitle( "Art of programming" ) ) ;
        add(new Hologram()
                .setTitle( "Pectoral" ) ) ;
        try {
            add(new Newspaper()
                    .setTitle( "Daily Planet" )
                    .setDate( "2022-09-22" ) ) ;
            add(new Newspaper()
                    .setTitle( "The Washington Post" )
                    .setDate( "2022-09-21" ) ) ;
            add(new Newspaper()
                    .setTitle( "The Daily Mail" )
                    .setDate( "2021-09-21" ) ) ;
        } catch( ParseException ex ) {
            System.out.println( "Funds creation failed: " + ex.getMessage() ) ;
            return ;
        }

        printFunds();
    }
    public void PrintPereodic()
    {
        System.out.println( ConsoleColors.GREEN + "Periodic : " + ConsoleColors.RESET ) ;

        for( Literature literature:funds  ) {
            if ( literature instanceof Periodic ) {
                if ( literature instanceof Printable ) {
                    ( (Printable) literature ).print() ;
                }
                else {
                    System.out.println( ConsoleColors.BLUE_BACKGROUND + ConsoleColors.BLACK_BOLD + "(" + literature.getClass().getSimpleName() + ")" + ConsoleColors.RESET+ "  " + literature.getTitle() ) ;
                }
            }
        }
    }
    public void PrintNonPeriodic()
    {

    }
    public void seril()
    {
        Serialitation a=new Serialitation();
        dataobj dataob;
        String b="";

        for(int j = 1; j < funds.size() ; j++)
        {System.out.println("+++++++++++++++++++");
            System.out.println(funds.get(j).getTitle());
            b+=funds.get(j).getTitle();




        }

        //dataob=new dataobj(b);
        System.out.println(b);
        a.Serilazie(b);
    }

}