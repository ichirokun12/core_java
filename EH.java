// JVM will handle thr exception 

public class EH {
    public static void main(String[] args) throws InterruptedException {
        Dostuff();
    }

    public static void Dostuff() throws InterruptedException {
        DoMoreStuff();
    }

    public static void DoMoreStuff() throws InterruptdExcepton {
        Thread.sleep(1000);
    }
}
