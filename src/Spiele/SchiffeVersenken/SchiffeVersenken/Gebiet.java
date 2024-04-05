package Spiele.SchiffeVersenken.SchiffeVersenken;

public class Gebiet {
private  boolean istSchiff;
private boolean istGetroffen;

    public Gebiet() {
        this.istSchiff = istSchiff;
        this.istGetroffen = istGetroffen;
        istSchiff=false;
        istGetroffen=false;
    }

    public void setzeSchiff(){
        istSchiff=true;
    }
    public boolean istGetroffen(){
        return istGetroffen;
    }
    public void markiereAlsGetroffen(){
        istGetroffen=true;
    }

    public boolean istSchiff() {
        return istSchiff;
    }

    @Override
    public String toString() {
        return ""+ istGetroffen;
    }
}
