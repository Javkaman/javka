package samonauka.objekt;

public class Contructor {
private int liczba;
private int number;


    public Contructor(int number) {
        this.number = number;
    }


    public Contructor() {
    }

    public Contructor(int liczba, int number) {
        this.liczba = liczba;
        this.number = number;
    }
/** getter*/

    public int getNumber() {
        return number;
    }
/** setter */
    public void setLiczba(int liczba) {
        this.liczba = liczba;
    }

    public int getLiczba() {
        return liczba;
    }
}
