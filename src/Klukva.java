public class Klukva extends Person {
    public Klukva() {
        this.name = "Клюква";
        this.status = Moves.Sleep;
    }

    public void check() throws NameException{
        if (name.length() > 3){
            System.out.print("");
        } else {
            throw new NameException(name + " - неподходящее имя! Укажите имя которое будет больше трёх букв");
        }
    }

    public void wakeup() {
        this.status = Moves.Unsleep;
        System.out.println(this.name + "  проснулся первым");
    }

    public void scream() {
        this.status = Moves.Scream;
        System.out.println(this.name + " увидев себя схваченным закричал:");
    }

    public void confuse() {
        this.status = Moves.Confused;
        System.out.println(this.name + " теряет сознание");
    }

    public String say(String stroka) {
        return stroka;
    }
}
