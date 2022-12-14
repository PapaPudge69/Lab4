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


    public void fell(){
        System.out.println(name + " упал словно подкошенный");
    }

    public void beUnconscious(Person s){
        System.out.println(name + " никак не мог прийти в себя, после того как ему в нос попала " + s);
    }
}
