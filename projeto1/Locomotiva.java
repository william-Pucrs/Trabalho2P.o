public class Locomotiva {
    
    private int idTrem;
    private double pesoMax;
    private int maxVagoes;


    public Locomotiva(int idTrem, double pesoMax, int maxVagoes) {
        this.idTrem = idTrem;
        this.pesoMax = pesoMax;
        this.maxVagoes = maxVagoes;
    }
    

    public int getIdTrem() {
        return idTrem;
    }


    public void setIdTrem(int idTrem) {
        this.idTrem = idTrem;
    }


    public double getPesoMax() {
        return pesoMax;
    }


    public void setPesoMax(double pesoMax) {
        this.pesoMax = pesoMax;
    }


    public int getMaxVagoes() {
        return maxVagoes;
    }


    public void setMaxVagoes(int maxVagoes) {
        this.maxVagoes = maxVagoes;
    }

    
    
}
