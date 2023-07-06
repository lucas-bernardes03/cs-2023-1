import java.text.DateFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        Locale[] locales = {
                Locale.US,
                Locale.CANADA,
                Locale.UK,
                Locale.FRANCE,
                Locale.GERMANY,
                Locale.ITALY,
                Locale.JAPAN,
                Locale.CHINA,
                Locale.CANADA_FRENCH,
                Locale.KOREA
        };

        for (Locale locale : locales) {
            ResourceBundle bundle = ResourceBundle.getBundle("infos", locale);

            String nome = bundle.getString("nome"),
                   linguagem = bundle.getString("linguagem"),
                   dataCurta = bundle.getString("dataCurta"),
                   dataLonga = bundle.getString("dataLonga"),
                   formatoHora = bundle.getString("formatoHora"),
                   simboloMoeda = bundle.getString("simboloMoeda"),
                   separadorDecimal = bundle.getString("separadorDecimal"),
                   separadorMilhar = bundle.getString("separadorMilhar"),
                   abreviacaoMoeda = bundle.getString("abreviacaoMoeda"),
                   codigoPagina = bundle.getString("codigoPagina")
           ;

            System.out.println("----------------------------------");
            System.out.println("Nome do País: " + nome);
            System.out.println("Linguagem: " + linguagem);
            System.out.println("Data no formato curto: " + dataCurta);
            System.out.println("Data no formato longo: " + dataLonga);
            System.out.println("Formato de hora: " + formatoHora);
            System.out.println("Símbolo da moeda local: " + simboloMoeda);
            System.out.println("Separador de decimal: " + separadorDecimal);
            System.out.println("Separador de milhar: " + separadorMilhar);
            System.out.println("Código da moeda: " + abreviacaoMoeda);
            System.out.println("Código de página windows: " + codigoPagina);
            System.out.println("----------------------------------");
        }
    }
}