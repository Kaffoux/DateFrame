import java.sql.SQLOutput;
import java.util.ArrayList;

class Column {
    protected String name;
    protected Class<? extends Value> type;
    protected Integer numberItems;
    protected ArrayList<Value> date;

    public Column (String name, Class<? extends Value> type) {
        this.name = name;
        this.type = type;
        this.numberItems = 0;
        this.date = new ArrayList<Value>();
    }

    public Integer size() {
        return date.size();
    }

    public void addValue(Value value) {
        this.numberItems++;
        date.add(value);
    }

    public void addValue(String value) throws IllegalAccessException, InstantiationException {
        this.numberItems++;
        date.add(type.newInstance().create(value));
    }



    public void removeLastValue() {
        this.numberItems--;
        date.remove(date.size()-1);
    }

    public void print() {
        System.out.printf("name: %s, numItems: %d\n", this.name, this.numberItems);
        for (Object item : date) {
            System.out.println(item + " ");
        }
        System.out.println("----------");
    }

    public Value max() {
        Value valMax = (Value) this.date.get(0);
        for (int i = 0; i < this.numberItems; i++) {
            if (this.date.get(i).gte(valMax)) {
                valMax = this.date.get(i);
            }
        }
        return valMax;
    }

    public Value min() {
        Value valMin = (Value) this.date.get(0);
        for (int i = 0; i < this.numberItems; i++) {
            if (this.date.get(i).lte(valMin)) {
                valMin = this.date.get(i);
            }
        }
        return valMin;
    }


    public Value mean() {
        Value Total = this.date.get(0);
        for (int i = 1; i < this.numberItems; i++) {
            Total = Total.add(this.date.get(i));
        }
        return Total.div((new MyInteger(this.numberItems)));
    }

    public Value sum() {
        Value Total = this.date.get(0);

        for (int i = 1; i < this.numberItems; i++) {
            Total = Total.add(this.date.get(i));
        }
        return Total;
    }
}
