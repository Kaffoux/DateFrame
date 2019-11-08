import javax.xml.crypto.Data;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//
        DataFrame df = new DataFrame(new String[] {"kol1","kol2", "kol3"}, new Class[] {MyString.class, MyInteger.class, MyInteger.class});
        df.addRow(new String[] {"a","2","1"});
        df.addRow(new String[] {"b","4","2"});
        df.addRow(new String[] {"c","6","3"});
        df.addRow(new String[] {"a","8","4"});
        df.addRow(new String[] {"c","9","5"});
        df.addRow(new String[] {"b","8","6"});
        df.addRow(new String[] {"a","6","7"});
        df.addRow(new String[] {"c","4","8"});
//        df.print();

//        a 2 1
//        a 8 4
//        a 6 7

//        b 4 2
//        b 8 6

//        c 6 3
//        c 9 5
//        c 4 8

        // działa i jest okej
//        System.out.println("--------------------------------------------------------");
//        df.groupBy("kol1").mean().print();



/*      TEST
        DataFrame dftest = new DataFrame();
        dftest.columns.add(new Column("kol1", MyInteger.class));
        dftest.columns.add(new Column("kol2", MyString.class));

        dftest.columns.get(0).addValue(new MyInteger(6));
        dftest.columns.get(0).addValue(new MyInteger(3));
        dftest.columns.get(1).addValue(new MyString("kot"));
        dftest.columns.get(1).addValue(new MyString("ala"));

        dftest.names = new String[2];
        dftest.names[0] = dftest.columns.get(0).name;
        dftest.names[1] = dftest.columns.get(1).name;

//        NIE DZIAŁA
//        dftest.types = new Class<? extends Value>[2];
//        dftest.types[0] = dftest.columns.get(0).type;
//        dftest.types[1] = dftest.columns.get(1).type;
//        for (int i = 0; i < dftest.types.length; i++) {
//            System.out.println(dftest.types[i]);
//        }*/









    }
}
