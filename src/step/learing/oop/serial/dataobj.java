package step.learing.oop.serial;

import java.io.Serializable;

public class dataobj implements Serializable {
    private int privatefield;
    private  transient String transFiled;
    protected float protectedfiled;
    public String publicfiled;

    public dataobj(Object...args)
    {

        privatefield=args.length>0?(int)args[0]:-1;
        protectedfiled=args.length>1?(float)args[1]:-1;
        publicfiled=args.length>2?(String)args[2]:"-";
        transFiled=args.length>3?(String)args[3]:"-";
    }

    @Override
    public String toString() {
        return String.format("{pri:'%d',pro:'%f',pub:'%s',trans='%s'}",
        privatefield, protectedfiled,publicfiled,transFiled);

    }
}
