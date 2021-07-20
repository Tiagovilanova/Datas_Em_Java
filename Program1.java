package course;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program1 {

	public static void main(String[] args) throws ParseException {

		// DEFINI��O DO PADR�O PARA TRABALHAR COM DATAS;
		SimpleDateFormat data1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat data2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		// ARMAZENAMENTO MANUAL DA DATA;
		Date y1 = data1.parse("19/07/2021");
		Date y2 = data2.parse("19/07/2021 20:02:02");
		// IMPRESS�O DA DATA;
		System.out.println(y1);
		System.out.println(y2);

		System.out.println("----------------------------------------------------");
		System.out.println("Agora vamos fazer da forma que a variavel o valor de y1 seja impressa na forma y2 OU SEJA"
				+ "DA FORMA 19/07/2021 20:02:02");
		System.out.println("y1: " + data2.format(y1));
		System.out.println();
		System.out.println();
		System.out.println("Trabalhar com a data atual");
		/*
		 * Para isso vamos instanciar uma nova variavel do tipo Date e podois do
		 * par�ntesis vamos colocar apenas "new Date()" Vamos observar o exemplo abaixo
		 * :
		 */
		Date y3 = new Date();
		System.out.println("Utilizando o System.currentTimeMillis()");
		System.out.println(data2.format(y3));
		System.out.println(data1.format(y3));
		Date y4 = new Date(System.currentTimeMillis()); // � uma outra forma de trabalhar com data atual

		System.out.println(data2.format(y4));
		System.out.println(data1.format(y4));
		/*
		 * essa formma representa o n�mero de milissegundos de de 1� de janeiro de 1970;
		 */
		/*
		 * se o n�mero de milissegundos for zero? O pensanmento � simples: o milisegundo
		 * zero � igual a data 1� de janeiro de 1970; mas no brasil, esse hor�rio ta
		 * atrasado, veja a impress�o;
		 */
		System.out.println("Inserindo manualmente o valor de milissegundos");
		Date y5 = new Date(0L);
		System.out.println(data2.format(y5));
		System.out.println(data1.format(y5));

		System.out.println();
		System.out.println();
		/*
		 * criar data a 5 da manha de 1� de janeiro;
		 */
		System.out.println();
		System.out.println();
		System.out.println("Criando um data que corresponda a 5 da manha de 1 � de janeiro");
		Date y6 = new Date(1000L * 60L * 60L * 5);
		System.out.println(data2.format(y6));
		System.out.println(data1.format(y6));
		/*
		 * NO PADR�O ISO 8601 Observe que nessa forma o hor�rio � definido, no entanto,
		 * no Brasil o hor�rio possui tr�s horas de atraso;:
		 */
		System.out.println();
		System.out.println();
		System.out.println("UTILIZANDO O PADR�O ISO 8601");
		
		SimpleDateFormat data3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		data3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date y7 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println("Observe que saiu no formato do hor�rio do Brasil");
		System.out.println(data1.format(y7)); 
		System.out.println(data2.format(y7));
		System.out.println("AGORA OBSERVE QUE SAIU NO HORARIO UTC");
		System.out.println(data3.format(y7));
		System.out.println(data3.format(y7));
		
		/*
		 * OBSERVER APENAS ESSA AREA:
		 * 
		 */

	}

}
