public class Rvigl extends Person {
    public Rvigl() {
        this.name = "Рвигль";
    }

    public void check() throws NameException{
        if (name.length() > 3){
            System.out.print("");
        } else {
            throw new NameException(name + " - неподходящее имя! Укажите имя которое будет больше трёх букв");
        }
    }

    public void wentDown(){
        System.out.print("Очутившись внизу, ");
    }

    TurnOnLantern tol = new TurnOnLantern() {
        @Override
        public void turnOnLantern() {
            System.out.print(name + " включил потайной электрический фонарь ");
        }
    };

    public void hiss(){
        System.out.print("и прошипел: ");
    }
    public String say(String stroka) {
        return stroka;
    }
}
