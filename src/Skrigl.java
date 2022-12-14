public class Skrigl extends Policeman implements Fightable{
    public Skrigl(){
        this.name = "Скригль";
    }

    public void hurry(Person b){
        System.out.println(name + " Спешит к " + b);
    }

}
