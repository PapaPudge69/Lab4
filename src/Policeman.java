public class Policeman extends Person implements Fightable {
    public Policeman() {
        this.name = "Полицейские";
    }

    public void grab() {
        System.out.println(this.name + " бросились хватать");
    }

    public void fight() {
        Moves s = this.status;
        this.status = Moves.Fight;
        System.out.println(this.name + " бьют током");
    }
}
