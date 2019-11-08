import org.w3c.dom.ls.LSOutput;

import java.util.LinkedList;

public class DFGroupBy implements Groupby {

    private final LinkedList<DataFrame> list;

    public DFGroupBy(LinkedList<DataFrame> list) {
        this.list = list;
    }

    @Override
    public DataFrame max() throws InstantiationException, IllegalAccessException {
        DataFrame pattern = list.getFirst();
        DataFrame newDF = new DataFrame(pattern.names, pattern.types);

        for (DataFrame smallDF : list) {
            for (int i = 0; i < newDF.numberColumns; i++) {
                newDF.columns.get(i).date.add(smallDF.columns.get(i).max());
            }
        }
        return newDF;
    }

    @Override
    public DataFrame min() throws InstantiationException, IllegalAccessException {
        DataFrame pattern = list.getFirst();
        DataFrame newDF = new DataFrame(pattern.names, pattern.types);

        for (DataFrame smallDF : list) {
            for (int i = 0; i < newDF.numberColumns; i++) {
                newDF.columns.get(i).date.add(smallDF.columns.get(i).min());
            }
        }
        return newDF;
    }

    @Override
    public DataFrame mean() throws InstantiationException, IllegalAccessException {
        DataFrame pattern = list.getFirst();
        DataFrame newDF = new DataFrame(pattern.names, pattern.types);

        for (DataFrame smallDF : list) {

////            for (int i = 0; i < newDF.numberColumns; i++) {
//            for (int i = 0; i < pattern.numberColumns; i++) {
////                wyjątek
//                if (smallDF.columns.get(i).mean() != null) {
//                    System.out.println("i: " + i);
//                    newDF.columns.get(i).date.add(smallDF.columns.get(i).mean());
//                } else {
//                    newDF.numberColumns--;
//                    newDF.columns.remove(i);
//                    System.out.println(newDF.numberColumns);
//                    System.out.println("SSS");
//
//                }
//            }
        }

        return newDF;
    }

    @Override
    public DataFrame std() {
        return null;
    }

    @Override
    public DataFrame sum() {
        DataFrame pattern = list.getFirst();
        DataFrame newDF = new DataFrame(pattern.names, pattern.types);

        for (DataFrame smallDF : list) {
            for (int i = 0; i < newDF.numberColumns; i++) {
                newDF.columns.get(i).date.add(smallDF.columns.get(i).sum());
            }
        }
        return newDF;
    }

    @Override
    public DataFrame var() {
        return null;
    }

}
