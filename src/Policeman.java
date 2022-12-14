public class Policeman extends Person implements Fightable,TurnOnLantern {
    public Policeman() {
        this.name = "Полицейские";
    }

    public void grab() {
        System.out.println(this.name + " бросились хватать");
    }

    public void fight() {
        Moves s = this.status;
        this.status = Moves.Fight;
        System.out.println(name + " бьют током");
    }

    public void separation(){
        System.out.println(name + " безмолвно разделились на два отряда.");
    }

    static class FirstSquad{
        public void goDownToLeft(){
            System.out.print("Первый отряд стал спускаться под мост с левой стороны дороги,");
        }
    }

    static class SecondSquad{
        public void doDownToRight(){
            System.out.println(" а второй -- с правой.");
        }
    }

    public void turnOnLantern(){
        System.out.print(name + " тоже зажгли фонари и,");
    }

    public void shine(){
        System.out.print(" освещая перед собой путь,");
    }

    public void watch(Person b){
        System.out.println("Растерявшиеся " + name + " смотрели на " + b);
    }

    public void drag(Person pe,Person p){
        System.out.println(name + " потащили вверх по откосу слабо сопротивлявшихся " + pe + ", а также полицейского " + p);
    }

    public void moved(){
        System.out.println(" двинулись с обеих сторон под мост.");
    }
}
