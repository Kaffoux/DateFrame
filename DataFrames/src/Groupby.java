public interface Groupby {
    DataFrame max() throws InstantiationException, IllegalAccessException;
    DataFrame min() throws InstantiationException, IllegalAccessException;
    DataFrame mean() throws InstantiationException, IllegalAccessException;
    DataFrame std();
    DataFrame sum();
    DataFrame var();
    /* DataFrame apply(Applayable); */
}
