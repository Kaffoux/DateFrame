class MyString extends Value {
    private String val;

    public MyString(String val) {
        this.val = val;
    }

    public String toString() {
        return val;
    }
    public Value add(Value someVal) throws IllegalArgumentException{
        if (someVal instanceof MyString) {
            return new MyString(this.val + ((MyString)someVal).val);
        } else throw new IllegalArgumentException("Argument is not MyString!");
    }
    public Value sub(Value someVal) {
        return null;
    }
    public Value mul(Value someVal) {
        return null;
    }
    public Value div(Value someVal) {
        return null;
    }
    public Value pow(Value someVal) {
        return null;
    }
    public boolean eq(Value someVal) {
        if (someVal instanceof MyString) {
            return val.compareTo(((MyString) someVal).val) == 0;
        } else throw new IllegalArgumentException("Argument is not MyString!");
    }
    public boolean lte(Value someVal) {
        if (someVal instanceof MyString) {
            return val.compareTo(((MyString) someVal).val) < 0;
        } else throw new IllegalArgumentException("Argument is not MyString!");
    }
    public boolean gte(Value someVal) {
        if (someVal instanceof MyString) {
            return val.compareTo(((MyString) someVal).val) > 0;
        } else throw new IllegalArgumentException("Argument is not MyString!");
    }
    public boolean neq(Value someVal) {
        if (someVal instanceof MyString) {
            return !val.equals(((MyString) someVal).val);
        } else throw new IllegalArgumentException("Argument is not MyString!");

    }
    public boolean equals(Object other) {
        if (other instanceof MyString) {
            return val.equals(((MyString) other).val);
        } else throw new IllegalArgumentException("Argument is not MyString!");
    }
    public int hashCode() {
//        return this.hashCode();
        return 0;
    }
    public static Value create(String str) {
        return new MyString(str);
    }
    public void print() {
        System.out.println(this.val);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}