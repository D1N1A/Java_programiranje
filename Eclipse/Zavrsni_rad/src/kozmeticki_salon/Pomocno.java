package kozmeticki_salon;

import java.util.Scanner;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pomocno {

	public static Scanner ulaz;
	public static boolean dev;
	private static final String FORMAT_DATUMA="dd. MM. yyyy.";
	private static final String FORMAT_VREMENA = null;
	private static SimpleDateFormat df = new SimpleDateFormat(FORMAT_DATUMA);

	public static int unosRasponBroja(String poruka, String greska, double d, double f) {
		int i;
		while (true) {
			try {
				System.out.print(poruka);
				i = Integer.parseInt(ulaz.nextLine());
				if (i >=d  && i <= f) {
					return i;
				}
				System.out.println(greska);
			} catch (Exception e) {
				System.out.println(greska);
			}
		}

	}

	public static String unosString(String poruka, String greska) {
		String s = "";
		while (true) {
			System.out.print(poruka);
			s = ulaz.nextLine();
			if (s.trim().length() > 0) {
				return s;
			}
			System.out.println(greska);
		}
	}

	public static float unosFloat(String poruka, String greska) {
		while (true) {
			try {
				System.out.print(poruka);
				return Float.parseFloat(ulaz.nextLine());
			} catch (Exception e) {
				System.out.println(greska);
			}
		}

	}

	public static boolean unosBoolean(String poruka) {

		System.out.print(poruka);
		return ulaz.nextLine().trim().toLowerCase().equals("da") ? true : false;

	}
	
	public static Date unosDatum(String poruka) {
		while (true) {
			try {
				System.out.print(poruka);
				return df.parse(ulaz.nextLine());
			} catch (Exception e) {
				System.out.println("Obavezan unos datuma u formatu " + FORMAT_DATUMA + ", npr. " + df.format(new Date()) + " za danas.");
			}
		}
	

	}
	

	public static Date unosVrijeme(String poruka, String string, double d, double f) {
		while (true) {
			try {
				System.out.print(poruka);
				return df.parse(ulaz.nextLine());
			} catch (Exception e) {
				System.out.println("Obavezan unos vremena u formatu " + FORMAT_VREMENA + ", npr. " + df.format(new Time(0)) + " za danas.");
			}
		}
	

	}
	}


