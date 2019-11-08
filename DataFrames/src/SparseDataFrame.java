//class SparseDataFrame extends DataFrame {
//    protected String hide;
//
//    public SparseDataFrame(String[] names, Class<? extends Value>[] types, String hide) {
//        super(names, types);
//        this.hide = "0";
//
//        for (int i = 0; i < names.length; i++) {
//            this.columns.add(new Column(names[i], types[i]));
//        }
//    }
//
//    public Integer maxNumRow () {
//        Integer index = -1;
//        for (int i = 0; i < this.numberColumns; i++) {
//            for (int j = 0; j < this.columns.get(i).size(); j++) {
//                index = Math.max(index, Integer.valueOf(((Pair)this.columns.get(i).date.get(j)).getA()));
//            }
//        }
//        return index;
//    }
//
//    public void toSpare(DataFrame df) {
////        SparseDataFrame sdf = new SparseDataFrame(df.names, df.types, hide);
//
//        for (Integer i = 0; i < df.numberColumns; i++) {
//            for (Integer j = 0; j < df.numberRows; j++) {
//                Object value = df.columns.get(i).date.get(j);
//                if (value != hide) {
//                    Pair pair = new Pair(j.toString(), value.toString());
//                    this.columns.get(i).addValue(pair);
//
//                }
//            }
//        }
//    }
//
////    public void toDense() {
////        DataFrame df = new DataFrame(this.names, this.types);
////
////        System.out.println(this.size());
////
////        for (int i = 0; i < this.numberColumns; i++) {
////            for (int j = 0; j < this.maxNumRow(); j++) {
////
////            }
////        }
////    }
//
//    public void print() {
//        for (int i = 0; i < this.numberColumns; i++) {
//            String name = this.columns.get(i).name;
//            Integer numItems = this.columns.get(i).size();
//
//            System.out.printf("%s: %d\n", name, numItems);
//            for (int j = 0; j < this.columns.get(i).date.size(); j++) {
////   DRAMAT             String a = ((Pair)this.columns.get(i).date.get(j)).getA();
//                System.out.println(this.columns.get(i).date.get(j).toString());
//            }
//            System.out.println("------");
//        }
//    }
//
//}
