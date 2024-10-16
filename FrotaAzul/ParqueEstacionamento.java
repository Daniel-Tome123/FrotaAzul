public class ParqueEstacionamento
{
    private String nome;
    private int numLugares;
    private Lugar[] lugares;
    
    public ParqueEstacionamento(String nome, int numLugares){
        this.nome = nome;
        this.numLugares = numLugares;
        this.lugares = new Lugar[this.numLugares];
        this.buildLugares();
    }
    
    public void buildLugares(){
        for(int i = 0; i < numLugares; i++){
            this.lugares[i] = new Lugar(i+1); 
        }
    }

    public void estacionar(int indiceDoLugar,Autocarro autocarro){
        if(indiceDoLugar >= 0 && indiceDoLugar < this.numLugares){
            this.lugares[indiceDoLugar].estacionarAutocarro(autocarro);
        } else {
            System.out.println("Lugar inválido");
        }
    }
    
    //incompleto
    public void retirar(int indiceDoLugar,Autocarro autocarro){
        if(indiceDoLugar >= 1 && indiceDoLugar < this.numLugares){
            this.lugares[indiceDoLugar].retirarAutocarro();
        } else {
            System.out.println("");
        }
    }
    
    public String toString(){
        String resultado = "nome:" + this.nome + " número de lugares:" 
        + this.numLugares;
        for(int i = 0; i < lugares.length; i++){
            resultado = resultado + this.lugares[i].toString();
        }
        
        return resultado;
    }
}
