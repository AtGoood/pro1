package step.learing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class complex {
    private void arraysD()
    {
        int[]arr1=new int[4];
        int[]arr2=new int[]{5,4,3,2,1};
        int[]arr3={5,4,3,2,1};

        for(int i=0;i<4;i++)
        {
            System.out.println(arr1[i]);
        }//d
        int j=0;
        for(;j<arr2.length;j++)
        {
            System.out.println(arr2[j]);
        }
        int [][]arr5= {
                {1,2,3},{4,5,6},{1,2,3},{4,2,5}
        };



    }
    private void collectoinsD()
    {
        ArrayList<Integer>arr1=new ArrayList<>();
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        arr1.add(40);
        for(Integer x:arr1)
        {
            System.out.println(x+" ");

        }
        System.out.println();
        System.out.println("-----------------------");
        HashMap<String,String>map=new HashMap<>();
        map.put("hello","привет");
        map.put("apple","яблоко");
        for(String key :map.keySet())
        {
            System.out.printf("%s--%s\n",key,map.get(key));

        }
        System.out.println("-----------------------");
    }
    private void dictonaryUI()
    {  HashMap<String,String>map=new HashMap<>();
        map.put("hello","привет");
        map.put("apple","яблоко");
        for(String key :map.keySet())
        {
            System.out.printf("%s--%s\n",key,map.get(key));

        }
        Scanner kbScanner=new Scanner(System.in);
        int UserSelection= kbScanner.nextInt();
                String str=kbScanner.nextLine();
                String translate=map.get(str);
                System.out.println((str+"-"+translate));
    }

    public void Run()
    {
        arraysD();
        //collectoinsD();
        dictonaryUI();
    }
}
