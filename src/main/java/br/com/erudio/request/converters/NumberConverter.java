package br.com.erudio.request.converters;

public class NumberConverter {

    public static Double convertToDouble(String strNumber) {
        if (strNumber == null) return 0D;
        // trocando virgula por ponto, para manter o padrão de formatação de moeda americano.
        String number = strNumber.replaceAll(",", ".");

        if (isNumeric(number)) return Double.parseDouble(number);

        return 0D;
    }

    public static boolean isNumeric(String strNumber) {
        if (strNumber == null) return false;
        String number = strNumber.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
