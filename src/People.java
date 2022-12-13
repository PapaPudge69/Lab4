public class People extends Person {
    public People() {
        this.name = "Коротышки";
    }

    public void sleep() {
        System.out.println(this.name + " спят");
    }

    public void wakeup() {
        Moves s = this.status;
        this.status = Moves.Unsleep;
        System.out.println(this.name + " проснулись и стали вырываться");
    }

    public void confuse() {
        Moves s = this.status;
        this.status = Moves.Confused;
        System.out.println(this.name + " успокаиваются");
    }
}
