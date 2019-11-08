public class MyInteger extends Value{
    private Integer val;

    public MyInteger() {

    }

    public MyInteger(Integer val) {
        this.val = val;
    }

    public String toString() {
        return Integer.toString(val);
    }

    public Value add(Value someVal) throws IllegalArgumentException{
        if (someVal instanceof MyInteger) {
            return new MyInteger(this.val + ((MyInteger)someVal).val);
        } else throw new IllegalArgumentException("Argument is not IntValue!");
    }

    public Value sub(Value someVal) throws IllegalArgumentException{
        if (someVal instanceof MyInteger) {
            return new MyInteger(this.val - ((MyInteger)someVal).val);
        } else throw new IllegalArgumentException("Argument is not IntValue!");
    }

    public Value mul(Value someVal) throws IllegalArgumentException{
        if (someVal instanceof MyInteger) {
            return new MyInteger(this.val * ((MyInteger)someVal).val);
        } else throw new IllegalArgumentException("Argument is not IntValue!");
    }

    public Value div(Value someVal) throws IllegalArgumentException{
        if (someVal instanceof MyInteger) {
            return new MyInteger(this.val / ((MyInteger)someVal).val);
        } else throw new IllegalArgumentException("Argument is not IntValue!");
    }

    public Value pow(Value someVal) {
        if (someVal instanceof MyInteger) {
            MyInteger newInt = new MyInteger(val);
            int temp = (int) Math.pow(val, ((MyInteger) someVal).val);
            newInt.val = new Integer(temp);
            return newInt;
        } else throw new IllegalArgumentException("Argument is not IntValue!");

    }
    public boolean eq(Value someVal) {
        if (someVal instanceof MyInteger) {
            return val.equals(((MyInteger)someVal).val);
        } else throw new IllegalArgumentException("Argument is not IntValue!");
    }

    public boolean lte(Value someVal) {
        if (someVal instanceof MyInteger) {
            return val.compareTo(((MyInteger)someVal).val) < 0;
        } else throw new IllegalArgumentException("Argument is not IntValue!");
    }
    public boolean gte(Value someVal) {
        if (someVal instanceof MyInteger) {
            return val.compareTo(((MyInteger)someVal).val) > 0;
        } else throw new IllegalArgumentException("Argument is not IntValue!");
    }
    public boolean neq(Value someVal) {
        if (someVal instanceof MyInteger) {
            return !val.equals(((MyInteger)someVal).val);
        } else throw new IllegalArgumentException("Argument is not IntValue!");

    }
    public boolean equals(Object other) {
        if (other instanceof MyInteger) {
            return val.equals(other);
        } else throw new IllegalArgumentException("Argument is not IntValue!");

    }
    //    public abstract int hashCode();
    public Value create(String str) {
        return new MyInteger(Integer.valueOf(str));
    }
    public void print() {
        System.out.println(this.val);
    }
}
