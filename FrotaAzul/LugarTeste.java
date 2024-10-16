public class LugarTeste
{
  public static void main(String[] args) {
      Lugar l1 = new Lugar(1);
      Lugar l2 = new Lugar(2);
      Lugar l3 = new Lugar(3);
      
      System.out.println (l1.toString());
      System.out.println (l2.toString());
      System.out.println (l3.toString());
      
      //criar um autocarro para estacionar
      Autocarro a1 = new Autocarro("AS", 1000);
      l1.estacionarAutocarro(a1);
      System.out.println(l1.toString());
      
      Autocarro a2 = new Autocarro("ZZ", 1200);
      l2.estacionarAutocarro(a2);
      System.out.println(l2.toString());
            
  }
}
