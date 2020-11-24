public class LongDateCounter extends DateCounter {

    private final ModularCounter _y, _m, _d;

    public LongDateCounter(){
        this(1900);
    }

    public LongDateCounter(int _originYear) {
        _y = new YearCounter(_originYear, new StaticCounter("-",
                _m = new MonthNameCounter(new StaticCounter("-",
                        _d = new DayCounter(this)
                ))
        ));
    }

    public boolean Pulse() { return _y.Pulse(); }

    public String Display() { return _y.Display(); }

    public int Year(){
        return _y.Value();
    }

    public int Month(){
        return _m.Value();
    }

    public int Day(){
        return _d.Value();
    }
}
