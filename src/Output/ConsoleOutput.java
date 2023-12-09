package Output;

public class ConsoleOutput implements Output{
    @Override
    public void showMessage(String msg) {
        System.out.print(msg);
    }

}
