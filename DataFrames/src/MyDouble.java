//class MyDouble extends Value {
//   private double val;
//
//   public MyDouble() {}
//
//   public MyDouble(double val) {
//       this.val = val;
//   }
//
//   public String toString() {
//       return Double.toString(val);
//   }
//
//   public Value add(Value someVal) throws IllegalArgumentException{
//       if (someVal instanceof MyDouble) {
//           return new MyDouble(this.val + ((MyDouble)someVal).val);
//       } else throw new IllegalArgumentException("Argument is not MyDouble!");
//   }
//
//    public Value sub(Value someVal) throws IllegalArgumentException{
//        if (someVal instanceof MyDouble) {
//            return new MyDouble(this.val - ((MyDouble)someVal).val);
//        } else throw new IllegalArgumentException("Argument is not MyDouble!");
//    }
//
//    public Value mul(Value someVal) throws IllegalArgumentException{
//        if (someVal instanceof MyDouble) {
//            return new MyDouble(this.val * ((MyDouble)someVal).val);
//        } else throw new IllegalArgumentException("Argument is not MyDouble!");
//    }
//
//    public Value div(Value someVal) throws IllegalArgumentException{
//        if (someVal instanceof MyDouble) {
//            return new MyDouble(this.val / ((MyDouble)someVal).val);
//        } else throw new IllegalArgumentException("Argument is not MyDouble!");
//    }
//
//    public Value pow(Value someVal) {
//        if (someVal instanceof MyDouble) {
//            MyDouble newDobl = new MyDouble(val);
//            double temp = (double) Math.pow(val, ((MyDouble) someVal).val);
//            newDobl.val = new Double(temp);
//            return newDobl;
//        } else throw new IllegalArgumentException("Argument is not MyDouble!");
//    }
//
//
//
//    public boolean eq(Value someVal) {
//        if (someVal instanceof MyDouble) {
//            return val.equals(((MyDouble)someVal).val);
//        } else throw new IllegalArgumentException("Argument is not MyDouble!");
//    }
//
//    public boolean lte(Value someVal) {
//        if (someVal instanceof MyDouble) {
//            return val.compareTo(((MyDouble)someVal).val) < 0;
//        } else throw new IllegalArgumentException("Argument is not MyDouble!");
//    }
//    public boolean gte(Value someVal) {
//        if (someVal instanceof MyDouble) {
//            return val.compareTo(((MyDouble)someVal).val) > 0;
//        } else throw new IllegalArgumentException("Argument is not MyDouble!");
//    }
//    public boolean neq(Value someVal) {
//        if (someVal instanceof MyDouble) {
//            return !val.equals(((MyDouble)someVal).val);
//        } else throw new IllegalArgumentException("Argument is not IntValue!");
//
//    }
//    public boolean equals(Object other) {
//        if (other instanceof MyDouble) {
//            return val.equals(other);
//        } else throw new IllegalArgumentException("Argument is not IntValue!");
//
//    }
//    //    public abstract int hashCode();
//    public Value create(String str) {
//        return new MyDouble(Double.valueOf(str));
//    }
//    public void print() {
//        System.out.println(this.val);
//    }
//}
