class Pair {
    protected String valA;
    protected String valB;

    public Pair(String A, String B) {
        valA = A;
        valB = B;
    }

    public String getA() {
        return valA;
    }

    public String getB() {
        return valB;
    }

    public String toString() {
        return (valA + ": " + valB);
    }
}
