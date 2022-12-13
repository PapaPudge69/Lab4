public class Bubble extends Person implements NotСonfusable {
    public Bubble() {
        this.name = "Пузырь";
        Moves s = this.status;
        this.status = Moves.Sleep;
    }

    public void wakeup() {
        Moves s = this.status;
        this.status = Moves.Unsleep;
    }

    public void notconfusable() {
        Moves s = this.status;
        this.status = Moves.NotConfused;
        System.out.println(this.name + " один не растерялся");
    }

    public void pullOut(Pnigl target) {
        System.out.println(this.name + " вырвал из рук " + target.name + " дубинку");
    }

    public String str(String stroka) {
        return stroka;
    }
}
