public class Bubble extends Person implements NotСonfusable {
    public Bubble() {
        this.name = "Пузырь";
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
    }

    public void notconfusable() {
        Moves s = this.status;
        this.status = Moves.NotConfused;
        System.out.println(this.name + " один не растерялся");
    }

    public void pullOut(Pnigl target) {
        System.out.println(this.name + " вырвал из рук " + target.name + " дубинку");
    }

    public void chuck(Person ba, Person sk){
        System.out.println(name + " швырнул электрическую " + ba + " в спешившего к нему полицейского " + sk);
    }

    public String str(String stroka) {
        return stroka;
    }

    public void take(){
        System.out.println(name + " схватил свою надувную подушку");
    }
    public void stayOnLand(){
        this.status = Moves.LocatedOnLand;
    }


    public void jumpToWaterStatus(){
        this.status = Moves.SwimInWater;
    }
    public void jumpTo() throws JumpToWaterException{
        if (this.status == Moves.SwimInWater){
            System.out.println(", одним прыжком подскочил к берегу и прыгнул в воду.");
        }
        else {
            throw new JumpToWaterException(this.name + " должен прыгнуть в воду, иначе другие действия невозможны");
        }
    }

    public void fastSwiming(){
        System.out.println(name + " плыл по воде, быстро удаляясь от берега.");
    }

}
