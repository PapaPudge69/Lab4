import java.io.PrintStream;

public class Baton extends Person {
    public Baton() {
        this.name = "Дубинка";
    }

    public void hit(Pnigl target) {
        PrintStream var10000 = System.out;
        String var10001 = String.valueOf(target);
        var10000.println("Ударил " + var10001 + " " + this.name);
    }
}
