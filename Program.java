public class Program
{
    public static void main(String[] args) throws Exception
    {
        final int count = 5000;
        final int duration = 500;

        Counter c = new FormatCounter("D.m.y");
        System.out.print(c.Display());
        Thread.sleep(duration);

        for (int i = 0; i < count; i++)
        {
            c.Pulse();

            System.out.print('\r' + c.Display());
            Thread.sleep(duration);
        }
    }
}
