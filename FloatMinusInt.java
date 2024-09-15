package sprint;

public class FloatMinusInt {
    public double subtractIntFromDoubleAndReturnDouble(double floating, int integer) {
        double implicit = floating - integer;
        return implicit; // automatic casting 5.7-2 returns 3.7
    }
    public int subtractIntFromDoubleAndReturnInt(double floating, int integer) {
        int explicit = (int)floating - integer;
        return explicit; // 5.7-2 returns 3
        
}
}
