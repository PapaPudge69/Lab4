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
        Rvigl r = new Rvigl();
        Policeman.FirstSquad pf = new Policeman.FirstSquad();
        Policeman.SecondSquad ps = new Policeman.SecondSquad();
        Skrigl sk = new Skrigl();

        po.separation();
        pf.goDownToLeft();
        ps.doDownToRight();
        r.wentDown();
        r.tol.turnOnLantern();
        r.hiss();
        System.out.println("\"" + r.say("Идём тихо и аккуратно.") + "\"");
        po.turnOnLantern();
        po.shine();
        po.moved();
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
        b.stayOnLand();
        p.fell();
        sk.hurry(b);
        b.chuck(ba,sk);
        b.take();
        b.jumpToWaterStatus();
        try {
            b.jumpTo();
            b.fastSwiming();
            po.watch(b);
            po.drag(pe,p);
            p.beUnconscious(s);
        } catch (JumpToWaterException e) {
            System.out.println(e.getMessage());
        }


    }
}
