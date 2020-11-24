public interface Counter
{
    public boolean Pulse();
    public String Display();

    public static Counter Numeric(int base, int precision)
    {
        Counter c = null;
        while (precision-- > 0)
            c = new DigitCounter(base, c);
        return c;
    }
}
