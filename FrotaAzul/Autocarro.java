public class Autocarro
{
    private String matricula;
    private int quilometros;
    
    public Autocarro(String matricula, int quilometros)
    {
        this.matricula = matricula;
        this.quilometros = quilometros;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    
    public void setMatricula(String m){
        this.matricula = m;
    }
    
    public int getQuilometros(){
        return quilometros;
    }
    
    public void setQuilometros(int q){
        this.quilometros = q;
    }
    
    public void mostarDados(){
        System.out.println("matrícula:" + matricula + " quilometros percorridos:" + quilometros); 
    }
    
}
