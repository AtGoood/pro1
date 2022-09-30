package step.learing.oop.Threding;

import step.learing.oop.Anno.DemmoClass;
import step.learing.oop.Anno.EntryPoint;
import step.learing.oop.ConsoleColors;

@DemmoClass
public class ThreadingDemo {
    private String str;
    @EntryPoint
    public void demo()
    {
        new PrinterThread().run();
        new ArgThread("arg1").run();

        ArgThread argThread=new ArgThread();
        argThread.setArg("arg2");
        argThread.start();

        new Thread()
        {
            @Override
            public void run()
            {
                System.out.println("anon thread");
            }
        }.start();
new Thread(new PrintRunnable()).start();

new Thread(new Runnable() {
    @Override
    public void run() {
        System.out.println("anon runnable");
    }
}).start();

Runnable runnable=()->System.out.println("arrow runneable");
new Thread(runnable).start();

new Thread(()->System.out.println("Arrow in Thread"));
new Thread(this::printDemo).run();

        System.out.println("threading demo");
    }
    private void printDemo()
    {
        System.out.println("Printdemo "+ ConsoleColors.RED_BOLD+"anon thread");
    }
    static class PrintRunnable implements Runnable
    {
        @Override
        public void run()
        {
            System.out.println("printRunnable");
        }

    }
    static class PrinterThread extends Thread
    {
        @Override
        public void run()
        {
            System.out.println("Printer Thread");
        }
    }
    static class ArgThread extends Thread
    {private String arg;
        @Override
        public void run() {
            System.out.println("arg thread"+this.arg);
        }

        public ArgThread(String arg) {
            this.arg = "";
        }
        public ArgThread() {
            this.arg = "";
        }

        public void setArg(String arg) {
            this.arg = arg;
        }
    }

}

