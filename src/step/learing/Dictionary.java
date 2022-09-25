package step.learing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
public class Dictionary
{
   public HashMap<String,String> map;

    Dictionary()
    {
        map=new HashMap<>();
        map.put("hello","привет");
        map.put("apple","яблоко");
    }

    public void OutPut()
    {
        for(String key :map.keySet())
        {
            System.out.printf("%s--%s\n",key,map.get(key));

        }
    }
    public void TranslationEng()
    {
        Scanner kbScanner=new Scanner(System.in);
        //int UserSelection= kbScanner.nextInt();
        String str=kbScanner.nextLine();
        String translate=map.get(str);
        System.out.println((str+"-"+translate));
    }
    public void TranslationRus()
    {  String translate=null;
        Scanner kbScanner=new Scanner(System.in);
        //int UserSelection= kbScanner.nextInt();
        String str=kbScanner.nextLine();
        Collection<String> collection= map.keySet();

        Object desiredObject=str;//что хотим найти
        for (String key : collection) {
            Object obj = map.get(key);
            if (key != null) {
                if (desiredObject.equals(obj)) {
                    translate=key;// нашли наше значение и возвращаем  ключ
                }

            }
        }
        System.out.println((str+"-"+translate));
    }
    public void AddWord()
    {
        System.out.println(("Rus"+"-"));
        Scanner kbScanner=new Scanner(System.in);

        String str1=kbScanner.nextLine();
        kbScanner=new Scanner(System.in);
        System.out.println(("Eng"+"-"));
        String str2=kbScanner.nextLine();
        map.put(str2,str1);

    }
 public void UI()
    {
        for(;;)
        { System.out.println(("Показать все"+":"+"1"));
            System.out.println(("Перевод англ. слова"+":"+"2"));
            System.out.println(("Перевод укр. слова"+":"+"3"));
            System.out.println(("Добавить слово"+":"+"4"));
            System.out.println(("Выход"+":"+"0"));
            System.out.print(("Введите Выбор"+":"));
            Scanner kbScanner=new Scanner(System.in);
            String str1=kbScanner.nextLine();

            switch (str1) {
                case ("1"):
                    this.OutPut();
                    break;
                case ("2"):
                    this.TranslationEng();
                    break;
                case ("3"):
                    this.TranslationRus();
                    break;
                case ("4"):
                    this.AddWord();
                    break;
                case ("0"):

                    break;
                default:
                    //this.OutPut();
                    break;
            }
        }
    }

}
