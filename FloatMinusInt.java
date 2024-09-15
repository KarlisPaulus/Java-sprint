package sprint;

public class FloatMinusInt {
    public double subtractIntFromDoubleAndReturnDouble(double floating, int integer) {
        double implicit = floating - integer;
        return implicit;
    }
    public int subtractIntFromDoubleAndReturnInt(double floating, int integer) {
        int explicit = (int)floating - integer;
        return explicit;
}
}
