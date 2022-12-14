public class Skrigl extends Policeman implements Fightable{
    public Skrigl(){
        this.name = "Скригль";
    }

    public void check() throws NameException{
        if (name.length() > 3){
            System.out.print("");
        } else {
            throw new NameException(name + " - неподходящее имя! Укажите имя которое будет больше трёх букв");
        }
    }

    public void hurry(Person b){
        System.out.println(name + " Спешит к " + b);
    }

}
