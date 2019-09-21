public class Animal {
    private int idade;
    private String tamanho;
    private String som;
    private boolean voa;
    
     
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public boolean isVoa() {
        return voa;
    }

    public void setVoa(boolean voa) {
        this.voa = voa;
    }
    public void mostraDados (){
        System.out.println ("Este animal tem " + this.idade + " anos");
        System.out.println ("Este animal é " + this.tamanho );
    }

}
