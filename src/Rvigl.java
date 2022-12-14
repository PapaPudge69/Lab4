public class Rvigl extends Person {
    public Rvigl() {
        this.name = "Рвигль";
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
