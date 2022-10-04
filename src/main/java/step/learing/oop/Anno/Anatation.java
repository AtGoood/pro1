package step.learing.oop.Anno;

public class Anatation
{public void run()
{
    Class<?>type= WithAN.class;
       Class<?> thisType=this.getClass();
       try {
           Class<?> nameType = Class.forName("WithAN");
       }
       catch (ClassNotFoundException ex)
       {
           System.out.println(ex.getMessage());
           return;
       }
 MarkerAN marker= type.getAnnotation(MarkerAN.class);
       if(marker!=null)
           System.out.printf("Class '%s'has marker ",type.getName());
       else
           System.out.printf("Class '%s'has no marker ",type.getName());


    marker= thisType.getAnnotation(MarkerAN.class);
    if(marker!=null)
        System.out.printf("Class '%s' has marker ",type.getName());
    else
        System.out.printf("Class '%s' has no marker ",type.getName());


 //   Filed[]fileds=type.getDeclaredField();

}
}
