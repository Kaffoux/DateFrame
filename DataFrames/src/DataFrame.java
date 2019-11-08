import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

class DataFrame {
    protected String[] names;
    protected Class<? extends Value>[] types;
    protected Integer numberColumns;
    protected Integer numberRows;
    protected ArrayList<Column> columns;

    public DataFrame(){
        this.numberColumns = 0;
        this.numberRows = 0;
        this.columns = new ArrayList<Column>();
    }

    public DataFrame(String[] names, Class<? extends Value>[] types) {
        this.numberColumns = names.length;
        this.numberRows = 0;
        this.names = names;
        this.types = types;
        this.columns = new ArrayList<Column>();

        // create empty columns
        for (int i = 0; i < numberColumns; i++) {
            columns.add(new Column(names[i], types[i]));
        }
    }

    public Integer size() {
        return numberRows;
    }

    public void addRow(String[] Values) throws InstantiationException, IllegalAccessException {
        for (int i = 0; i < this.numberColumns; i++) {
            columns.get(i).addValue(Values[i]);
        }
        this.numberRows++;
    }

    public void removeRow() {
        for (int i = 0; i < this.numberColumns; i++) {
            columns.get(i).removeLastValue();
        }
    }

    public void print() {
        for (Column column : columns) {
            column.print();
        }
    }

    // metoda zwracająca dataframe od STARTowego wiersza do ENDowego wiersza
    public DataFrame getRowsAB(Integer start, Integer end) throws InstantiationException, IllegalAccessException {
        DataFrame newDF = new DataFrame(this.names, this.types);

        for (int i = 0; i < this.numberColumns; i++) {
            for (int j = start; j <= end; j++) {
                Value value = columns.get(i).date.get(j);
                newDF.columns.get(i).addValue(value);
            }
        }
        return newDF;
    }
    // metoda zwracająca dataframe od STARTowej kolumny do ENDowej kolumny
    public DataFrame getColumnsAB(Integer start, Integer end) throws InstantiationException, IllegalAccessException {
        DataFrame newDF = new DataFrame();
        newDF.numberColumns = end - start + 1;
        newDF.numberRows = newDF.numberRows;
        Integer iteratorColumn = 0;

        for (int i = start; i <= end; i++) {
            // nazwa i typ kolumny
            String name = this.columns.get(i).name;
            Class<? extends Value> type = this.columns.get(i).type;
            newDF.columns.add(new Column(name, type));

            for (int j = 0; j < this.numberRows; j++) {
                Value value = this.columns.get(i).date.get(j);
                newDF.columns.get(iteratorColumn).addValue(value);
            }
            iteratorColumn++;
        }
        return newDF;
    }

    public DFGroupBy groupBy(String name) throws IllegalAccessException, InstantiationException {
        // ustalam numer kolumny względem której grupuję
        int groupCol = 0;
        for (int i = 0; i < this.numberColumns; i++) {
            if (this.names[i] == name) {
                groupCol = i;
                break;
            }
        }

        HashMap<String, DataFrame> collection = new HashMap<>();

        for (int i = 0; i < this.numberRows; i++) {
            String[] Values = new String[this.numberColumns];
            for (int k = 0; k < this.numberColumns; k++) {
                Values[k] = this.columns.get(k).date.get(i).toString();
            }
            DataFrame smallDF = new DataFrame(this.names, this.types);

            if (collection.get(this.columns.get(groupCol).date.get(i).toString()) == null) {
                smallDF.addRow(Values);
                collection.put(this.columns.get(groupCol).date.get(i).toString(), smallDF);
            } else {
                collection.get(this.columns.get(groupCol).date.get(i).toString()).addRow(Values);
            }
        }

        LinkedList<DataFrame> list = new LinkedList<>();

        for (String i : collection.keySet()) {
            list.add(collection.get(i));
        }

        return new DFGroupBy(list);
    }


    public Integer indexGroupCol (String name){
        int groupCol = 0;
        for (int i = 0; i < this.numberColumns; i++) {
            if (this.names[i] == name) {
                groupCol = i;
                break;
            }
        }
        return groupCol;
    }



}


