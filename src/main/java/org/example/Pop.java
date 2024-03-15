package org.example;

public class Pop implements Music{
    private int foundationCentury;

    @Override
    public void getMusicGenre() {
            System.out.println("I am pop singer!");
    }

    public Pop(int foundationCentury) {
        this.foundationCentury = foundationCentury;
    }
public Pop(){

}
    public int getFoundationCentury() {
        return foundationCentury;
    }

    public void setFoundationCentury(int foundationCentury) {
        this.foundationCentury = foundationCentury;
    }

    @Override
    public String toString() {
        return "Pop{" +
                "foundationCentury=" + foundationCentury +
                '}';
    }
}

