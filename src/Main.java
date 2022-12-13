public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Klukva k = new Klukva();
        Bubble b = new Bubble();
        Pnigl p = new Pnigl();
        Policeman po = new Policeman();
        People pe = new People();
        Baton ba = new Baton();
        Spark s = new Spark();
        pe.sleep();
        po.grab();
        k.wakeup();
        k.scream();
        System.out.println("\"" + k.say("Aaaaaa, меня схватили, помогите!") + "\"");
        po.fight();
        k.confuse();
        pe.wakeup();
        po.fight();
        pe.confuse();
        b.notconfusable();
        b.pullOut(p);
        ba.hit(p);
        p.endure();
        s.jump(p.name, ba.name);
    }
}
