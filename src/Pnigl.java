public class Pnigl extends Person implements Fightable {
    public Pnigl() {
        this.name = "Пнигль";
    }

    public void fight() {
        Moves s = this.status;
        this.status = Moves.Fight;
    }

    public String str(String stroka) {
        return stroka;
    }

    public void endure() {
        System.out.println(this.name + " получил удар током");
    }
}
