package step.learing;

import step.learing.Services.*;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {

  /*  public static void main(String[] args) {
        // new DataTypes().Run();
        // new Complex().Run();
        // new Library().run();
        //    new Serialitation().run();
        //new FileD().run();
        // new Anatation().run();

        // Library a=new Library();
        // a.run();

        //  a.seril();
        //  new ThreadingDemo().demo();
        //  new complex().Run();
        new SyncDemo().Demo();

         /*   // Определяем текущий класс
            Class<?> currentClass = Main.class ;
            // Извлечь из имени класса имя пакета
            String packageName = currentClass.getPackage().getName() ;
            // Получаем перечень имен классов из пакета и его под-пакетов (1 уровень вложенности)
            List<String> classNames = getClassNames( packageName ) ;
            if( classNames == null ) {
                System.out.println( "Error scanning package" ) ;
                return ;
            }

            // region выбрать только те классы, которые аннотированы как "DemoClass"
            List<Class<?>> demoClasses = new ArrayList<>() ;
            for( String className : classNames ) {
                Class<?> theClass ;
                try {
                    theClass = Class.forName( className ) ;
                }
                catch( Exception ignored ) {  // ignored - спец. имя для неиспользуемой переменной
                    continue ;
                }
                if( theClass.isAnnotationPresent( DemmoClass.class ) ) {
                    demoClasses.add( theClass ) ;
                }
                // System.out.println( className ) ;
            }
            // endregion

            // region Вывести меню и предложить выбор
            System.out.println( "Demo classes:" ) ;
            int i = 1 ;
            for( Class<?> theClass : demoClasses ) {
                System.out.printf( "%d. %s %n", i++, theClass.getName() ) ;
            }
            System.out.println( "0. Exit" ) ;
            System.out.print( "Make your choice: " ) ;
            // endregion

            // region Получить выбор, обработать (на ошибки) и запустить (EntryPoint)
            Scanner kbScanner = new Scanner( System.in ) ;
            int userChoice = -1 ;
            try {
                userChoice = kbScanner.nextInt() ;
            }
            catch( InputMismatchException ignored ) {
                System.out.println( "Incorrect choice" ) ;
            }

            if( userChoice == 0 ) {
                System.out.println( "Bye" ) ;
                return ;
            }
            int index = userChoice - 1 ;
            if( index >= demoClasses.size() || index < 0 ) {
                System.out.println( "Incorrect choice" ) ;
            }
            else {
                Class<?> exeClass = demoClasses.get( index ) ;
                // сканнируем методы на аннотацию EntryPoint и запускаем первый найденный
                Method[] methods = exeClass.getDeclaredMethods() ;
                for( Method method : methods ) {
                    if( method.isAnnotationPresent( EntryPoint.class ) ) {
                        try {
                            method.invoke(
                                    exeClass.getDeclaredConstructor().newInstance()
                            ) ;
                        }
                        catch( Exception ex ) {
                            System.out.println( "Execution error: " + ex.getMessage() ) ;
                        }

                        break ;
                    }
                }
            }

            System.out.println( "Choice: " + userChoice ) ;



        Class<?>curentclass= Main.class;
        String packageName= curentclass.getPackage().getName();
        List <String>classNames= GetClassNames(packageName);
        if(classNames==null)
        {
            return;
        }
        for(String className:classNames)
        {
            //System.out.println(className);
        }

        List<Class<?>>demoClass=new ArrayList<>();
        for(String className:classNames)
        {
            Class<?>theclass;
            try
            {
                theclass =Class.forName(className);

            }
            catch (Exception ignored)
            {
                continue;

            }
            if(theclass.isAnnotationPresent(DemmoClass.class))
            {
                demoClass.add(theclass);
            }
            System.out.println(className);

        }
        for(Class<?>theclass:demoClass)
        {
            System.out.println(theclass.getName());
        }

        System.out.println("demo");
        int i=1;
        for(Class<?>theClass:demoClass)
        {
            System.out.printf("%d. %s %n",i++,theClass.getName());
        }
        System.out.println("0. Exit");
        System.out.print("Make your chose");
        Scanner kbScanner =new Scanner(System.in);
        int userChose=0;
        try{
            userChose=kbScanner.nextInt();
        }
        catch (InputMismatchException ignored)
        {
            System.out.println("incorect");
        }

        if(userChose==0)
        {
            System.out.println("bye");
            return;

        }
        int index=userChose-1;
        if(index>=demoClass.size()||index<0)
        {
            System.out.println("incorect");
        }
        else
        {
            Class<?>exeClass=demoClass.get(index);
        }


        System.out.println("cose"+ userChose);


*/
  @Inject  // ссылка на объект будет инициализирована контейнером (иньектором)
  private StringService stringService ;


    // @Inject @Named("ten")

    /*
    private final RandomProvider randomProvider ;
    @Inject
    public App(@Named("Ten") RandomProvider randomProvider)
    {
        // иньекция через конструктор лучше тем, что позволяет использовать final поля
        this.randomProvider = randomProvider;
    }
*/

/*
    @Inject @Named("128")
    private HashService hash128 ;
    @Inject @Named("160")
    private HashService hash160 ;



    @Inject @Named("MsConnectionString")
    private String msConnectionString ;
    @Inject @Named("OracleConnectionString")
    private String oracleConnectionString ;


    */

    @Inject
    TimeService timeService;
    public void run()
{

    // new DataTypes().Run();
    // new Complex().Run();
    // new Library().run();
    //    new Serialitation().run();
    //new FileD().run();
    // new Anatation().run();

    // Library a=new Library();
    // a.run();

    //  a.seril();
    //  new ThreadingDemo().demo();
    //  new complex().Run();
    System.out.println("run");
    System.out.println("StringService"+stringService.getString());
   // System.out.println("Random"+ rabdomProvider.getN());
   // System.out.println("java"+ Sy.getChar());
    System.out.println("Date:"+timeService.getDate());
    System.out.println("time:"+timeService.getTime());
    //  new SyncDemo().Demo();

         /*   // Определяем текущий класс
            Class<?> currentClass = Main.class ;
            // Извлечь из имени класса имя пакета
            String packageName = currentClass.getPackage().getName() ;
            // Получаем перечень имен классов из пакета и его под-пакетов (1 уровень вложенности)
            List<String> classNames = getClassNames( packageName ) ;
            if( classNames == null ) {
                System.out.println( "Error scanning package" ) ;
                return ;
            }

            // region выбрать только те классы, которые аннотированы как "DemoClass"
            List<Class<?>> demoClasses = new ArrayList<>() ;
            for( String className : classNames ) {
                Class<?> theClass ;
                try {
                    theClass = Class.forName( className ) ;
                }
                catch( Exception ignored ) {  // ignored - спец. имя для неиспользуемой переменной
                    continue ;
                }
                if( theClass.isAnnotationPresent( DemmoClass.class ) ) {
                    demoClasses.add( theClass ) ;
                }
                // System.out.println( className ) ;
            }
            // endregion

            // region Вывести меню и предложить выбор
            System.out.println( "Demo classes:" ) ;
            int i = 1 ;
            for( Class<?> theClass : demoClasses ) {
                System.out.printf( "%d. %s %n", i++, theClass.getName() ) ;
            }
            System.out.println( "0. Exit" ) ;
            System.out.print( "Make your choice: " ) ;
            // endregion

            // region Получить выбор, обработать (на ошибки) и запустить (EntryPoint)
            Scanner kbScanner = new Scanner( System.in ) ;
            int userChoice = -1 ;
            try {
                userChoice = kbScanner.nextInt() ;
            }
            catch( InputMismatchException ignored ) {
                System.out.println( "Incorrect choice" ) ;
            }

            if( userChoice == 0 ) {
                System.out.println( "Bye" ) ;
                return ;
            }
            int index = userChoice - 1 ;
            if( index >= demoClasses.size() || index < 0 ) {
                System.out.println( "Incorrect choice" ) ;
            }
            else {
                Class<?> exeClass = demoClasses.get( index ) ;
                // сканнируем методы на аннотацию EntryPoint и запускаем первый найденный
                Method[] methods = exeClass.getDeclaredMethods() ;
                for( Method method : methods ) {
                    if( method.isAnnotationPresent( EntryPoint.class ) ) {
                        try {
                            method.invoke(
                                    exeClass.getDeclaredConstructor().newInstance()
                            ) ;
                        }
                        catch( Exception ex ) {
                            System.out.println( "Execution error: " + ex.getMessage() ) ;
                        }

                        break ;
                    }
                }
            }

            System.out.println( "Choice: " + userChoice ) ;



        Class<?>curentclass= Main.class;
        String packageName= curentclass.getPackage().getName();
        List <String>classNames= GetClassNames(packageName);
        if(classNames==null)
        {
            return;
        }
        for(String className:classNames)
        {
            //System.out.println(className);
        }

        List<Class<?>>demoClass=new ArrayList<>();
        for(String className:classNames)
        {
            Class<?>theclass;
            try
            {
                theclass =Class.forName(className);

            }
            catch (Exception ignored)
            {
                continue;

            }
            if(theclass.isAnnotationPresent(DemmoClass.class))
            {
                demoClass.add(theclass);
            }
            System.out.println(className);

        }
        for(Class<?>theclass:demoClass)
        {
            System.out.println(theclass.getName());
        }

        System.out.println("demo");
        int i=1;
        for(Class<?>theClass:demoClass)
        {
            System.out.printf("%d. %s %n",i++,theClass.getName());
        }
        System.out.println("0. Exit");
        System.out.print("Make your chose");
        Scanner kbScanner =new Scanner(System.in);
        int userChose=0;
        try{
            userChose=kbScanner.nextInt();
        }
        catch (InputMismatchException ignored)
        {
            System.out.println("incorect");
        }

        if(userChose==0)
        {
            System.out.println("bye");
            return;

        }
        int index=userChose-1;
        if(index>=demoClass.size()||index<0)
        {
            System.out.println("incorect");
        }
        else
        {
            Class<?>exeClass=demoClass.get(index);
        }


        System.out.println("cose"+ userChose);


*/
}

    private static List<String> getClassNames(String packageName )
    {
        // class loader
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader() ;
        URL packageResource =
                classLoader.getResource(
                        packageName.replace(
                                ".",
                                "/" )
                ) ;
        if( packageResource == null ) {
            System.out.println( "Resource identification error" ) ;
            return null ;
        }
        String packagePath = packageResource.getPath() ;
        // System.out.println( packagePath ) ;
        // Сканнируем как папку, определяем содержимое
        File packageBase = new File( packagePath ) ;
        File[] list = packageBase.listFiles() ;
        if( list == null ) {
            System.out.println( "Error scanning directory " + packageBase ) ;
            return null ;
        }
        List<String> classNames = new ArrayList<>() ;
        for( File file : list ) {
            // задание: если имеем директорию, вывести ее состав (один уровень вложенности)
            // задание: нас интересуют только файлы типа ".class", собираем информацию о них
            //  в коллекцию; для работы с классом нужно только имя, но с учетом пакета
            // System.out.println( file.getName() + " " + ( file.isFile() ? "file" : "dir" ) ) ;
            if( file.isFile() ) {
                String filename = file.getName() ;
                if( filename.endsWith( ".class" ) ) {
                    classNames.add(
                            packageName + "." +
                                    filename.substring( 0, filename.lastIndexOf( '.' ) )
                    ) ;
                }
            }
            else if( file.isDirectory() ) {
                File[] subList = file.listFiles() ;
                if( subList != null ) {
                    for (File sub : subList) {

                        if( sub.isFile() ) {
                            String filename = sub.getName() ;
                            if( filename.endsWith( ".class" ) ) {
                                classNames.add(
                                        packageName + "." + file.getName() + "." +
                                                filename.substring( 0, filename.lastIndexOf( '.' ) )
                                ) ;
                            }
                        }
                    }
                }
            }
        }
        return classNames ;
    }
}
