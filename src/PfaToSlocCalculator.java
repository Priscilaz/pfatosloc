public class PfaToSlocCalculator {
    public static void main(String[] args) {
        // Valores conocidos
        int pfaTotal = 96; // PFA total obtenido del documento
        int factorConversionJava = 53; // Factor de conversión PFA a SLOC para Java

        // Conversión de PFA a SLOC
        int sloc = pfaTotal * factorConversionJava;

        // Mostrar resultados
        System.out.println("PFA Total: " + pfaTotal);
        System.out.println("Factor de Conversión (Java): " + factorConversionJava);
        System.out.println("SLOC Estimados: " + sloc);
    }
}
