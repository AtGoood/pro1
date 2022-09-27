package step.learing.oop.files;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileD {

    public void run()
    {
      //  fsDemo();
        IoDemo();
    }

    private void fsDemo()
    {

       File file=new File("newItem");
       if(file.isDirectory())
       {
           System.out.println(file.getName()+"-is der");
      String[]list= file.list();
      if(list!=null)
      {
          for(String itemName:list)
          {
              System.out.println(itemName);
          }
      }

      System.out.print("delete directory ? (y/...");
      int sym;
      try
      {
          sym=System.in.read();
      }
      catch (IOException ex)
      {
          System.out.println("system error"+ex.getMessage());
          return;
      }

      if(sym=='y')
      { boolean res=file.delete();
          if(res)
          {
              System.out.println("conf");

          }
          else
          {
              System.out.println("cant");
          }

      }
      else
      {
          System.out.println("delete cancelled");
      }
       }

       else if (file.isFile())
       {
           System.out.println(file.getName()+"id ex");
      if(file.canRead())
      {
          System.out.println("readable");
      }
      else
      {
          System.out.println("NON-readable");

      }
           if(file.canExecute())
           {
               System.out.println("executable");
           }
           else
           {
               System.out.println("NON-readable");

           }
           if(file.canWrite())
           {
               System.out.println("Writeable");
           }
           else
           {
               System.out.println("NON-readable");

           }

       }
       else
        {
            System.out.println(file.getName()+"does not ex");
        boolean res=file.mkdir();// создаем директорию с именнем
            if(res)
            {
                System.out.printf("direcstory %s created",file.getName());

            }
            else
            {
                System.out.println("directory creation error");
            }
        }
    }
    private  void IoDemo()//НИЗКОУРОВНЕВЫЙ ВАРИАНТ
    { String fileContent;
      StringBuilder fileb=new StringBuilder();
        try(InputStream reader=new FileInputStream("pro1.iml"))

        {
            int symbol;
            while((symbol=reader.read())!=-1)
            {
             //   fileContent+=(char)symbol;

                fileb.append((char) symbol);
            }
        }


        catch (IOException ex)
        {

            System.out.println(ex.getMessage());
            return;
        }
        fileContent=fileb.toString();
        System.out.println(fileContent);
    }


}
