package ServiceMix;

public interface ServiceMix
{
	/**
	    * Gibt an, ob in einer Zeichenkette mindestens ein Zeichen, direkt aufeinander folgend,
	    * doppelt vorkommt.
	    * @param eine beliebige Zeichenkette, darf nicht null sein.
	    * @return ob in der Zeichenkette ein Zeichen doppelt vorkommt, direkt nacheinander.
	    */
	    public boolean enthaeltDoppelzeichen(String s);
	    
	   /**
	    * Gibt an, ob in einer Zeichenkette mindestens ein Zeichen, direkt aufeinander folgend,
	    * doppelt vorkommt. Diese Operation soll rekursiv implementiert werden.
	    * @param eine beliebige Zeichenkette, darf nicht null sein.
	    * @return ob in der Zeichenkette ein Zeichen doppelt vorkommt, direkt nacheinander.
	    */
	    public boolean enthaeltDoppelzeichenRekursiv(String s);
	    
	    /**
	     * Diese Methode kodiert das gegebene Wort nach dem Prinzip der
	     * Caesar-Verschluesselung. Jeder Buchstabe wird durch einen im Alphabet nachfolgenden
	     * Buchstaben ersetzt, abhängig von der gewünschten Verschiebung. Bei einer Verschiebung
	     * von 3 wird beispielsweise jedes a durch ein d ersetzt.
	     * Es werden nur Kleinbuchstaben durch Kleinbuchstaben ersetzt, alle anderen Zeichen bleiben, 
	     * wie sie waren. Verschiebungen über den letzten Buchstaben im Alphabet, das z, hinaus
	     * werden beim a fortgesetzt. Das z wird beispielsweise bei einer Verschiebung von 1
	     * durch ein a ersetzt, das y bei einer Verschiebung von 4 durch das c. 
	     * @param wort ein beliebiger String, darf nicht null sein
	     * @param verschiebung die gewünschte Verschiebung, darf nicht negativ sein
	     * @return die Kodierung des gegebenen Worts nach der Caesar-Verschluesselung 
	     */
	    public String caesarVerschluesseln(String wort, int verschiebung);
	    
	    /**
	     * Liefert für eine gegebene Zeit im 24h-Format die äquivalente Zeit im 12h-Format
	     * (mit der Angabe, ob vor oder nach Mittag).
	     * Beispiele: für "21:30" soll "9:30pm" geliefert werden, "9:30" liefert "9:30am".
	     * "24:00" und "00:00" liefern "12:00am", "12:00" liefert "12:00pm".
	     * @param eine Uhrzeit als String; darf nicht null sein und darf nur aus
	     * Ziffern und genau einem Doppelpunkt bestehen. 
	     * @return einen String mit der gleichen Uhrzeit im 12h-Format (ohne führende Nullen).
	     */
	    public String zeitformatUmwandeln(String zeitIm24hFormat);
	    
	    
	   /**
	     * Bekommt zwei Arrays von Zahlen und liefert ein neues Arrays,
	     * in dem an der n-ten Position die Summe der beiden n-ten Zahlen der
	     * Parameter-Arrays steht.
	     * Beispiel: für { 1, 2, 3 } und { 4, 5, 6 } liefert die Methode { 5, 7, 9 },
	     * denn 5 ist die Summe von 1 und 4, 7 ist die Summe von 2 und 5 und 9 ist die
	     * Summe von 3 und 6.
	     * Wenn ein Parameter-Array kürzer als das andere ist, wird ein Array der größeren
	     * Länge geliefert und für die Summen angenommen, dass das kürze Array mit Nullen
	     * aufgefüllt wäre.
	     * 
	     * @param zahlen1 ein Array von int-Werten, darf nicht null sein
	     * @param zahlen2 ein Array von int-Werten, darf nicht null sein
	     * @return ein Array mit der gleichen Anzahl an Werten wie im längeren Parameter-Array
	     */
	    public int[] addiere(int[] zahlen1, int[] zahlen2);
	    
}
