public class ModularCounter implements Counter
{
    private int _module;
    private int _offset;

    private final Counter _lower;

    private int _count;

    public ModularCounter(int _module)
    {
        this(_module, 0, null);
    }

    public ModularCounter(int _module, int _offset)
    {
        this(_module, _offset, null);
    }

    public ModularCounter(int _module, Counter _lower)
    {
        this(_module, 0, _lower);
    }

    public ModularCounter(int _module, int _offset, Counter _lower)
    {
        assert _module >= 2;
        assert _offset >= 0;

        this._module = _module;
        this._offset = _offset;
        this._lower = _lower;
        _count = 0;
    }

    public void Reset(int _module, int _offset)
    {
        assert _module >= 2;
        assert _offset >= 0;

        this._module = _module;
        this._offset = _offset;
        _count = 0;
    }

    public boolean Pulse()
    {
        if (_lower == null || _lower.Pulse())
        {
            _count = (_count + 1) % _module;
            return _count == 0;
        }
        return false;
    }

    public String Display()
    {
        if (_lower != null)
            return Symbol() + _lower.Display();
        else
            return Symbol();
    }

    public int Value()
    {
        return _count + _offset;
    }

    public String Symbol()
    {
        return Integer.toString(Value());
    }
}
