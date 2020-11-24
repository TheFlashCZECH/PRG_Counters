public class FormatCounter implements Counter{

    private final DateCounter _date;
    private final String _format;

    public FormatCounter(String _format, int _originYear){
        if(_format.contains("M")){
            _date = new LongDateCounter(_originYear);
        }
        else{
            _date = new ShortDateCounter(_originYear);
        }

        this._format = _format;
    }

    public FormatCounter(String _format){
        this(_format, 1900);
    }


    @Override
    public boolean Pulse() {
        return _date.Pulse();
    }

    @Override
    public String Display() {

        String[] dateArgs = _date.Display().split("-");

        return _format
                .replaceFirst("y", dateArgs[0])
                .replaceFirst("[mM]", dateArgs[1])
                .replaceFirst("d", dateArgs[2]);
    }
}
