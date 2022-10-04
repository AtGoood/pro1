package step.learing.oop.Threding;

import step.learing.oop.Anno.DemmoClass;
import step.learing.oop.Anno.EntryPoint;
import step.learing.oop.ConsoleColors;

import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@DemmoClass
public class SyncDemo {
    @EntryPoint
    public void Demo()
    {
        System.out.println("Synchronization demo");
        sum=100;
        threads=12;
        for(int i=0;i<threads;++i
        )
        {
            new Thread(plus10percent3).start();
        }
        ExecutorService pool= Executors.newFixedThreadPool(3);

        pool.submit(()-> System.out.println("pool works"));
        pool.submit(()-> System.out.println("pool works"));
        pool.submit(()-> System.out.println("pool works"));
        pool.submit(()-> System.out.println("pool works"));
        pool.submit(()-> System.out.println("pool works"));

    }
    private double sum;
    private  int threads;
    private final Object sumLocker=new Object();
    private final Object locker=new Object();
    private Runnable plus10percent=()->
    {
        synchronized (locker) {
            double tmp = sum;
            tmp *= 1.10;
            System.out.println("current sum=" + tmp);
            sum = tmp;
        }
    };
    private Runnable plus10percent2=()->
    {
        synchronized (locker) {
          sum*=1.10;
        }
        System.out.println("current="+sum);
    };
    private Runnable plus10percent3=()->
    {double tmp;
        boolean isLast;
        synchronized (sumLocker) {
            tmp=sum=sum*=1.10;
            threads--;
           isLast=threads==0;

             //   System.out.println((isLast ?)+"curren sum"+tmp+(isLast?""));

        }
        System.out.println("current="+tmp);
    };
}
