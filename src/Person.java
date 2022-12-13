public abstract class Person {
    public String name;
    public Moves status;

    public Person() {
    }

    public boolean equals(Person p) {
        return this.name == p.name;
    }

    public String toString() {
        return this.name;
    }

    public int hashCode() {
        return this.name.length();
    }
}
