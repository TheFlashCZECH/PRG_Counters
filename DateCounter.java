public abstract class DateCounter implements Counter {

//    YearCounter _year;
//    MonthCounter _month;

    public abstract boolean Pulse();
    public abstract String Display();

    public abstract int Year();
    public abstract int Month();
    public abstract int Day();
}
