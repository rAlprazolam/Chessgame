public enum Coordinates {
    A,
    B,
    C,
    D,
    E,
    F,
    G,
    H;

    public int getCoordinateAsNumber() {
        return this.ordinal() + 1;
    }
}
