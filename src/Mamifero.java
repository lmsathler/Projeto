public class Mamifero extends Animal {
    private String corPelo;
    private boolean amamenta;

    public String getCorPelo () {
        return this.corPelo;
    }
    public void setCorPelo (String corPelo){
        this.corPelo = corPelo;
    }
    public boolean isAmamenta () {
        return this.amamenta;
    }
    public void setAmamenta (boolean amamenta){
        this.amamenta = amamenta;
    }

}
