package course;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class Atualização_de_datas_no_java_8 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("-------------------------");
		System.out.println("Construindo datas com a classe LocalDate e LocalDatetime");
		System.out.println();
		System.out.println("	1-APRESENTANDO SOMENTE A DATA ATUAL (formato internacional)");
		System.out.println();
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		System.out.println();
		System.out.println("-------------------------");
		System.out.println();
		System.out.println(
				"	2-APRESENTANDO A DATA E HORA: PARA ISSO USA-SE DO LOCALDATETIME apresenta um forma exagerada, pois colocar segundos e miléssimos");
		System.out.println();
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora);
		System.out.println("-------------------------");
		System.out.println();
		System.out.println(
				"	3-COLOCANDO NO FORMATO BRASILEIRO, UTILIZANDO A CLASSE DATETIMEFORMATTTER QUE UTILIZA O MÉTODO OFPATTEERN");
		System.out.println();
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/YYYY  HH:mm");
		System.out.println("Data com horas : " + agora.format(formato1));
		System.out.println();
		DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		System.out.println("Apenas com a data: " + hoje.format(formato2));
		System.out.println();
		System.out.println("	4 - OUTRA FORMA DE USAR O DATEFORMAT C/ A UTILIZAÇÃO DO MÉTODO OFLOCALIZEDDATETIME");
		System.out.println("Observe que apresenta características, como AM e PM");
		DateTimeFormatter formatadorcurto= DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(agora.format(formatadorcurto));
		System.out.println();
		DateTimeFormatter formatadormedio= DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(agora.format(formatadormedio));
System.out.println();
System.out.println("	5-DATA E HORA COM LOCALIZAÇÃO DO CANADÁ E BRASIL");
DateTimeFormatter formatocanadá=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(Locale.CANADA);
System.out.println(agora.format(formatocanadá));
DateTimeFormatter formatadorbr=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(new Locale("pt", "br"));
System.out.println(agora.format(formatadorbr));
System.out.println();

System.out.println("	6-MANIPULANDO DATAS");
System.out.println(agora.minusHours(5));
System.out.println(agora.plusHours(10));

		sc.close();
	}
}
