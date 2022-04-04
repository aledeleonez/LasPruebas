public class Main {
    public static void main(String[] args) throws Exception {
        
        ClaseCadena cadena = new ClaseCadena();
        String iniciales = cadena.devuelveIniciales("Alejandro de Leon Fernandez");
        System.out.println(iniciales);

        String iniciales2 = cadena.devuelveIniciales("Juan : Garcia");
        System.out.println(iniciales2);

        String iniciales3 = cadena.devuelveIniciales("Ana     Rosa");
        System.out.println(iniciales3);

        String iniciales4 = cadena.devuelveIniciales("Pep / Guardiola");
        System.out.println(iniciales4);
    }
}
