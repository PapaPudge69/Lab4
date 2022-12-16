public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Klukva k = new Klukva();
        Bubble b = new Bubble();
        Pnigl p = new Pnigl();
        Policeman po = new Policeman();
        People pe = new People();
        Spark s = new Spark();
        Rvigl r = new Rvigl();
        Policeman.FirstSquad pf = new Policeman.FirstSquad();
        Policeman.SecondSquad ps = new Policeman.SecondSquad();
        Skrigl sk = new Skrigl();

        try {
            k.check();
            b.check();
            p.check();
            r.check();
            sk.check();
        }catch (NameException e){
            System.out.println(e.getMessage());
        }

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
        Pnigl.Baton.hit(p);
        p.endure();
        s.jump(p.name);
        b.stayOnLand();
        p.fell();
        sk.hurry(b);
        b.chuck(b);
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
