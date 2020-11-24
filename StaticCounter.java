public class StaticCounter implements Counter
{
    private final String text;
    private final Counter lower;

    public StaticCounter(String text)
    {
        this(text, null);
    }

    public StaticCounter(String text, Counter lower)
    {
        assert text != null;

        this.text = text;
        this.lower = lower;
    }

    public boolean Pulse()
    {
        if (lower != null)
            return lower.Pulse();
        else
            return true;
    }

    public String Display()
    {
        if (lower != null)
            return text + lower.Display();
        else
            return text;
    }
}
