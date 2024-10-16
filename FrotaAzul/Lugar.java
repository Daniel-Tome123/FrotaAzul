
public class Lugar
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int identificador;
    private boolean disponibilidade;
    private Autocarro autocarroEstacionado;

    public Lugar(int identificador)
    {
        // inicializa variáveis de instância
        this.identificador = identificador;
        this.disponibilidade = true;
        this.autocarroEstacionado = null;
    }
    
    public int getIdentificador(){
        return identificador;
    }
    
    public void setIdentificador(int id){
        this.identificador = id;
    }
    
    public boolean getDisponibilidade(){
        return disponibilidade;
    }
    
    public void setDisponibilidade(boolean disp){
        this.disponibilidade = disp;
    }
    
    public void estacionarAutocarro(Autocarro autocarro){
        if(disponibilidade == true){
            this.autocarroEstacionado = autocarro;
            this.disponibilidade = false;
        } else {
            System.out.println("Lugar já ocupado");
        }
    }
    
    public void retirarAutocarro(){
         if(disponibilidade == false){
            this.autocarroEstacionado = null;
            this.disponibilidade = true;
        } else {
            System.out.println("Lugar já vazio");
        }
    }
    
    public String toString(){
        String resultado = "Id: " + this.identificador+ " Disponivel?: " + this.disponibilidade;
        
        if(disponibilidade == false){
            resultado = resultado + this.autocarroEstacionado.toString();
        }
        
        return resultado;
    }
}
