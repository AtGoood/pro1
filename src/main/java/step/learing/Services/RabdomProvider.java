package step.learing.Services;

import java.util.Random;

public class RabdomProvider {
    private final int n=new Random().nextInt();
    public int getN()
    {
        return n;
    }
    public String getString()
    {
        return "String";
    }

}
