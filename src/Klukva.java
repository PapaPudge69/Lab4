public class Klukva extends Person {
    public Klukva() {
        this.name = "Клюква";
        Moves s = this.status;
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
        Moves s = this.status;
        this.status = Moves.Unsleep;
        System.out.println(this.name + "  проснулся первым");
    }

    public void scream() {
        Moves s = this.status;
        this.status = Moves.Scream;
        System.out.println(this.name + " увидев себя схваченным закричал:");
    }

    public void confuse() {
        Moves s = this.status;
        this.status = Moves.Confused;
        System.out.println(this.name + " теряет сознание");
    }

    public String say(String stroka) {
        return stroka;
    }
}
