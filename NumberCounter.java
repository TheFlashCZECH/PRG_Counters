public class NumberCounter implements Counter
{
    private final int module;
    private final Counter lower;
    private final char padding;

    private int count;

    public NumberCounter(int module)
    {
        this(module, (char)0, null);
    }

    public NumberCounter(int module, char padding)
    {
        this(module, padding, null);
    }

    public NumberCounter(int module, Counter lower)
    {
        this(module, (char)0, lower);
    }

    public NumberCounter(int module, char padding, Counter lower)
    {
        assert module > 1;

        this.module = module;
        this.padding = padding;
        this.lower = lower;
        count = 0;
    }

    public boolean Pulse()
    {
        if (lower == null || lower.Pulse()) {
            count = (count + 1) % module;
            return count == 0;
        }
        return false;
    }

    public String Display()
    {
        String s = Integer.toString(count);

        if (padding != 0) {
            int n = (int)Math.ceil(Math.log10(module)) - s.length();
            String p = "";
            while (n-- > 0) {
                p += padding;
            }
            s = p + s;
        }

        if (lower != null)
            return s + lower.Display();
        else
            return s;
    }
}
