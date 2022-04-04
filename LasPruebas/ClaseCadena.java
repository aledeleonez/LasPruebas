import java.util.StringTokenizer;

public class ClaseCadena {
    
    public String devuelveIniciales(String palabra){
        String iniciales = "";
        StringTokenizer st = new StringTokenizer(palabra);
        System.out.println("Las iniciales son: ");

        if(palabra.contains("/") || palabra.contains("-")|| palabra.contains(":")|| palabra.contains("_")){
            return " ";
        }
        
        while(st.hasMoreTokens()) {
            iniciales += st.nextToken().toUpperCase().toString().charAt(0)+".";
        }
        return iniciales;
    }
}
