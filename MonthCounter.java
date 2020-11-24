public abstract class MonthCounter extends ModularCounter{

    public MonthCounter(){
        super(12, 1);
    }

    public MonthCounter(Counter _lower){
        super(12, 1, _lower);
    }

    public abstract String Symbol();
}
