package burazer_paveskovic.terminal;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class Pomocno {

	public static Scanner ulaz;

	public static int unos(String poruka, int min, int max) {
		int i;

		while (true) {
			try {
				System.out.print(poruka);
				i = Integer.parseInt(ulaz.nextLine());

				if (i > max || i < min) {

					System.out.println("Unesite broj između " + min + " i " + max);
					continue;

				}

				return i;

			} catch (Exception e) {
				System.out.println("Mora biti broj!!!");
			}

		}

	}

	public static String unosTeksta(String poruka) {
		String s;

		while (true) {

			System.out.print(poruka);
			s = ulaz.nextLine();
			if (s.trim().isEmpty()) {

				System.out.println("Obavezan unos");
				continue;
			}
			return s;

		}

	}

	public static String unosoiba(String poruka) {

		String s;

		while (true) {

			System.out.print(poruka);

			s = ulaz.next();

			if (s.length() == 11 && provjeraslova(s) == true) {

				return s;
			} else {

				System.out.println("Ponovno upisati mora imati 11 znakova i bez slova");

			}

		}

	}

	private static boolean provjeraslova(String s) {

		boolean nemaSlovo = true;

		for (int i = 0; i <= s.length() - 1; i++) {

			if (Character.isLetter(s.charAt(i))) {

				nemaSlovo = false;

			}

		}

		return nemaSlovo;

	}

	public static BigDecimal unosdecimala(String poruka) {
		System.out.println(poruka);
		BigDecimal d = ulaz.nextBigDecimal();

		return d;
	}

	public static Date unosDolazakPolazak(String poruka) {
		Date datum = null;
		
		try {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println(poruka);

		String date = ulaz.nextLine();

		 datum = df.parse(date);

		
		} catch(Exception e) {
			
			
		}
		return datum;
		
		
	}
}
