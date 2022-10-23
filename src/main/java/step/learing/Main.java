package step.learing;

import com.google.inject.Guice;
import com.google.inject.Injector;
import step.learing.Services.ConfigModule;
import step.learing.oop.Anno.DemmoClass;
import step.learing.oop.Anno.EntryPoint;
import step.learing.oop.Threding.SyncDemo;
import step.learing.oop.Threding.ThreadingDemo;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

public static void main(String[]args)
{
  //  new App().run();

    Injector injector= Guice.createInjector(new ConfigModule());
    App app=injector.getInstance(App.class);
    app.run();
}//d
}
