//https://www.devmedia.com.br/artigo-java-magazine-46-refactoring-da-teoria-a-pratica/10169
package org.example._05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CartaoUtilOriginal {
    public static final int VISA = 1;
    public static final int MASTERCARD = 2;
    public static final int AMEX = 3;
    public static final int DINERS = 4;
    public static final String CARTAO_OK = "Cartão válido";
    public static final String CARTAO_ERRO = "Cartão inválido";

    public String validar(int bandeira, String numero, String validade) {
        if (validaVencimento(validade)) {
            String formatado = numero.replaceAll("[^0-9]", "");

            if (validaBandeira(formatado, bandeira)) {
                return validaNumeroCartao(formatado);
            }
        } 
        return CARTAO_ERRO;
    }

    private static boolean validaVencimento(String validade){
        Date dataValidade = null;
        try {
            dataValidade = new SimpleDateFormat("MM/yyyy").parse(validade);
        }catch (ParseException e) {
            return false;
        }

        Calendar calValidade = new GregorianCalendar();
        calValidade.setTime(dataValidade);

        // apenas mês e ano são utilizados na validação
        Calendar calTemp = new GregorianCalendar();
        Calendar calHoje = (GregorianCalendar) calValidade.clone();
        calHoje.set(Calendar.MONTH, calTemp.get(Calendar.MONTH));
        calHoje.set(Calendar.YEAR, calTemp.get(Calendar.YEAR));

        return calHoje.before(calValidade);
    }

    private static boolean validaBandeira(String formatado, int bandeira){
        switch (bandeira) {
            case VISA: // tamanhos 13 ou 16, prefixo 4.
                return (formatado.startsWith("4") && (formatado.length() == 13 || formatado.length() == 16 ));

            case MASTERCARD: // tamanho 16, prefixos 51 a 55
                return ((formatado.startsWith("51") || formatado.startsWith("52") || formatado.startsWith("53") || formatado.startsWith("54") || formatado.startsWith("55") && formatado.length() == 16));
 
            case  AMEX: // tamanho 15, prefixos 34 e 37.
                return ((formatado.startsWith("34") || formatado.startsWith("37") && formatado.length() == 15));
        
            case  DINERS: // tamanho 14, prefixos 300  305, 36 e38.
               return ((formatado.startsWith("300") || formatado.startsWith("301") || formatado.startsWith("302") || formatado.startsWith("303") || formatado.startsWith("304") ||
                       formatado.startsWith("305") || formatado.startsWith("36") || formatado.startsWith("38") && formatado.length() == 14));                        

            default:
               return false;
        }
    }

    private static String validaNumeroCartao(String numero){
                int soma = 0;
                
                for (int i = numero.length() - 1; i >= 0; i--) {
                    int digit = Integer.parseInt(numero.substring(i, i + 1));
                
                    if ((numero.length() - i) % 2 == 0) {
                        digit = doubleAndSumDigits(digit);
                    }
                
                    soma += digit;
                }

                return soma % 10 == 0 ? CARTAO_OK:CARTAO_ERRO;
    }

    private static int doubleAndSumDigits(int digit) {
        int ret = digit * 2;
    
        if (ret > 9) {
            ret = digit - 9;
        }
    
        return ret;
    }
}

