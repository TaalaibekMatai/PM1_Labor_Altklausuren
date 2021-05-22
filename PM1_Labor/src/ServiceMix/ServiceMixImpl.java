package ServiceMix;

public class ServiceMixImpl implements ServiceMix
{
	public ServiceMixImpl()
	{
		// Diesen Konstruktor unbedingt stehen lassen!
	}

	public boolean enthaeltDoppelzeichen(String s)
	{
		for (int i = 0; i < s.length() - 1; i++)
		{
			if (s.charAt(i) == s.charAt(i + 1))
			{
				return true;
			}
		}
		return false;
	}

	public boolean enthaeltDoppelzeichenRekursiv(String s)
	{
		boolean result = false;
		if (s.length() > 1)
		{
			if (s.charAt(0) == s.charAt(1))
			{
				// result = enthaeltDoppelzeichenRekursiv(s.substring(1));
				return true;
			}
			result = enthaeltDoppelzeichenRekursiv(s.substring(1));
		}
		return result;
	}

	public String caesarVerschluesseln(String wort, int verschiebung)
	{
		String result = "";
		for (int i = 0; i < wort.length(); i++)
		{
			if (wort.charAt(i) >= 'a' && wort.charAt(i) <= 'z')
			{
				if ((wort.charAt(i) + verschiebung) > 'z')
				{
					int x = 'a' + (wort.charAt(i) + verschiebung) - 'z' - 1;
					char c = (char) x;
					result += c;
				} else
				{
					int x = wort.charAt(i) + verschiebung;
					char c = (char) x;
					result += c;
				}
			} else
			{
				result += wort.charAt(i);
			}
		}
		return result;
	}

	/**
	 * Liefert für eine gegebene Zeit im 24h-Format die äquivalente Zeit im
	 * 12h-Format (mit der Angabe, ob vor oder nach Mittag). Beispiele: für "21:30"
	 * soll "9:30pm" geliefert werden, "9:30" liefert "9:30am". "24:00" und "00:00"
	 * liefern "12:00am", "12:00" liefert "12:00pm".
	 * 
	 * @param eine Uhrzeit als String; darf nicht null sein und darf nur aus Ziffern
	 *             und genau einem Doppelpunkt bestehen.
	 * @return einen String mit der gleichen Uhrzeit im 12h-Format (ohne führende
	 *         Nullen).
	 */
	public String zeitformatUmwandeln(String zeitIm24hFormat)
	{
		String s = zeitIm24hFormat;
		if (s.equals("24:00") || s.equals("00:00"))
		{
			s = "12:00am";
		} else if (s.equals("12:00"))
		{
			s = "12:00pm";
		} else if (s.length() == 4)// 9:30
		{
			s += "am";
		} else if (s.length() == 5 && s.charAt(0) == '0' && s.charAt(1) == '0'
				&& (s.charAt(s.length() - 1) != '0' || s.charAt(s.length() - 2) != '0'))
		{
			s = "12" + s.substring(2) + "am";
		} else if (s.length() == 5 && (s.charAt(0) == '0'))
		{
			s = s.substring(1) + "am";
		} else if (s.length() == 5 && s.charAt(0) == '0' && s.charAt(1) != '0')
		{
			s = s.substring(1) + "am";
		} else if (s.length() == 5 && s.charAt(0) == '1' && s.charAt(1) < '2') // 10:30
		{
			s += "am";
		} else if (s.length() == 5 && s.charAt(0) == '1' && s.charAt(1) == '2') // 10:30
		{
			s += "pm";
		} else if (s.length() == 5 && s.charAt(0) == '2')
		{
			int r = s.charAt(0) + s.charAt(1) - 90;
			s = r + s.substring(2) + "pm";
		} else
		{
			int r = s.charAt(0) + s.charAt(1) - 99;
			s = r + s.substring(2) + "pm";
		}
		return s;
	}

	/**
	 * Bekommt zwei Arrays von Zahlen und liefert ein neues Arrays, in dem an der
	 * n-ten Position die Summe der beiden n-ten Zahlen der Parameter-Arrays steht.
	 * Beispiel: für { 1, 2, 3 } und { 4, 5, 6 } liefert die Methode { 5, 7, 9 },
	 * denn 5 ist die Summe von 1 und 4, 7 ist die Summe von 2 und 5 und 9 ist die
	 * Summe von 3 und 6. Wenn ein Parameter-Array kürzer als das andere ist, wird
	 * ein Array der größeren Länge geliefert und für die Summen angenommen, dass
	 * das kürze Array mit Nullen aufgefüllt wäre.
	 * 
	 * @param zahlen1 ein Array von int-Werten, darf nicht null sein
	 * @param zahlen2 ein Array von int-Werten, darf nicht null sein
	 * @return ein Array mit der gleichen Anzahl an Werten wie im längeren
	 *         Parameter-Array
	 */
	public int[] addiere(int[] zahlen1, int[] zahlen2)
	{
		int[] result;
		if (zahlen1.length > zahlen2.length)
		{
			result = new int[zahlen1.length];
			for (int i = 0; i < zahlen1.length; i++)
			{
				result[i] = zahlen1[i];
			}
			for (int i = 0; i < zahlen2.length; i++)
			{
				result[i] += zahlen2[i];
			}
		} else if (zahlen1.length < zahlen2.length)
		{
			result = new int[zahlen2.length];
			for (int i = 0; i < zahlen2.length; i++)
			{
				result[i] = zahlen2[i];
			}
			for (int i = 0; i < zahlen1.length; i++)
			{
				result[i] += zahlen1[i];
			}
		} else
		{
			result = new int[zahlen1.length];
			for (int i = 0; i < zahlen1.length; i++)
			{
				result[i] = zahlen1[i] + zahlen2[i];
			}
		}
		return result;
	}

}
