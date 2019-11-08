public abstract class Value {
    public abstract String toString();
    public abstract Value add(Value someVal);
    public abstract Value sub(Value someVal);
    public abstract Value mul(Value someVal);
    public abstract Value div(Value someVal);
    public abstract Value pow(Value someVal);
    public abstract boolean eq(Value someVal);
    public abstract boolean lte(Value someVal);
    public abstract boolean gte(Value someVal);
    public abstract boolean neq(Value someVal);
    public abstract boolean equals(Object other);
    //    public abstract int hashCode();
//    public static Value create(String str) {
//        return null;
//    }
    public abstract Value create(String str);
    public abstract void print();
}