package WI_Klausur2017;

import java.util.ArrayList;
import java.util.List;

public class ServiceMixImpl
{
	 public ServiceMixImpl()
	    {
	        // Diesen Konstruktor unbedingt stehen lassen!
	    }
	 
	      /**
	     * Bekommt eine Liste mit Woertern und liefert die Anzahl der Duplikate darin.<br>
	     * Beispiel: [ "a", "b", "c", "d", "c", "b", "a", "c" ] liefert 4 <br>
	     * Die Parameter-Liste darf nicht veraendert werden!
	     * @param woerter eine Liste mit Woertern
	     * @return die Anzahl der Duplikate in der Parameterliste
	     */
	    
	    public int anzahlDuplikate(List<String> woerter)
	    {
	       List<String> _list1 =  new ArrayList<String>();
	       List<String> _list2 = new ArrayList<String>();
	       for(String s: woerter)
	       {
	           if(_list1.contains(s))
	           {
	               _list2.add(s);
	            }
	            else
	            {
	                _list1.add(s);
	            }
	        }
	        return _list2.size();
	    }

	     /**
	     * Liefert fuer einen uebergebenen String die Anzahl der Auftreten
	     * des ebenfalls uebergebenen Zeichens innerhalb des Strings.
	     * @param vonChar das Zeichen, dessen Auftreten gezaehlt werden soll
	     * @param inString der String, in dem gezaehlt werden soll
	     * @return 
	     */
	    
	    public int anzahlAuftreten(char vonChar, String inString)
	    {
	        int result = 0;
	        if(inString.length() == 0)
	        {
	            result = 0;
	        }
	        else
	        {
	            if(inString.charAt(0) == vonChar)
	            {
	                result = 1 + anzahlAuftreten(vonChar,inString.substring(1));
	            }
	            else
	            {
	                result = anzahlAuftreten(vonChar, inString.substring(1));
	            }
	        }
	        return result;
	       
	    }

	    /**
	     * Verbindet die in einer String-Liste gegebenen Worte zu einem einzigen String.
	     * Der String enthaelt als Trennzeichen zwischen den Worten ein Semikolon. Am 
	     * Anfang oder am Schluss soll kein Semikolon stehen.
	     * Beispiel: fuer eine Liste der Laenge 2 mit den Worten "Hallo" und "Welt" liefert
	     * diese Methode als Ergebnis den String "Hallo;Welt".
	     * @param worte eine Liste von nicht-leeren Strings, darf nicht null sein
	     * @return einen String, der die in der Liste gegebenen Worte verbindet,
	     * Trennzeichen: Semikolon.
	     */
	    
	    public String worteVerbinden(List<String> worte)
	    {
	        String result = "";
	        for(int i = 0; i < worte.size(); i++)
	        {
	            if(i == 0)
	            {
	                result = worte.get(i);
	            }
	            else
	            {
	                result += ";" + worte.get(i);
	            }
	        }
	        return result;
	    }

	    /**
	     * Bekommt zwei Arrays von Strings und liefert ein neues Array,
	     * in dem an der n-ten Position die Verkettung der beiden Strings an Position n der
	     * Parameter-Arrays steht. Dabei wird immer der laengere String an den kuerzeren
	     * gehaengt. Sind die Strings gleich lang, wird der String aus dem zweiten Array
	     * an den String aus dem ersten Array gehaengt.<br>
	     * Beispiel: fuer { "A", "BB", "CCC" } und { "DDD", "EE", "F" }
	     * liefert die Methode { "ADDD", "BBEE", "FCCC" } <br>
	     * Wenn ein Array kuerzer ist als das andere, sollen die "freien" Zellen fuer die 
	     * Konkatenation logisch mit leeren Strings aufgefuellt werden. <br>
	     * Beispiel: fuer { "1", "2" } und { "3", "4", "5" }
	     * liefert die Methode { "13", "24", "5" } <br>
	     * Die Parameter-Arrays duerfen nicht veraendert werden!
	     * @param werte1 ein Array von Strings, darf nicht null sein
	     * @param werte2 ein Array von Strings, darf nicht null sein
	     * @return ein Array mit der gleichen Laenge wie das laengere der Parameter-Arrays.
	     */
	    
	    public String[] konkateniere(String[] s1, String[] s2)
	    {
	        int max = Math.max(s1.length, s2.length);
	        String[] result = new String[max];
	        if(s1.length < s2.length)
	        {
	            for(int i = 0; i < s1.length; i++)
	            {
	                if(s1[i].length() > s2[i].length())
	                {
	                    result[i] = s2[i] + s1[i];
	                }
	                else
	                {
	                    result[i] = s1[i] + s2[i];
	                }
	            }
	            for(int i = s1.length; i < s2.length; i++)
	            {
	                result[i] = s2[i];
	            }
	        }
	        else if(s1.length > s2.length)
	        {
	            for(int i = 0; i < s2.length; i++)
	            {
	                if(s1[i].length() >= s2[i].length())
	                {
	                    result[i] = s2[i] + s1[i];
	                }
	                else
	                {
	                    result[i] = s1[i] + s2[i];
	                }
	            }
	            for(int i = s2.length; i < s1.length; i++)
	            {
	                result[i] = s1[i];
	            }
	        }
	        else
	        {
	            for(int i = 0; i < max; i++)
	            {
	                if(s1[i].length() > s2[i].length())
	                {
	                    result[i] = s2[i] + s1[i];
	                }
	                else
	                {
	                    result[i] = s1[i] + s2[i];
	                }
	            }
	        }
	        return result;
	    }

	    /**
	     * Liefert fuer einen uebergebenen Namen im Snake-Case-Format
	     * den entsprechenden Namen im Camel-Case-Format.
	     * Die Konvention fuer zusammengesetzte Namen (fuer Klassen, Methoden
	     * oder Variablen) in Java-Quelltexten ist, dass sie Camel-Case befolgen.
	     * Eine Alternative ist "Snake-Case" in C-ähnlichen Sprachen, dabei
	     * werden Namensbestandteile voneinander durch Unterstriche getrennt
	     * und alle Bestandteile ausser dem ersten bestehen nur aus Kleinbuchstaben.
	     * Beispiel:
	     * fuer "anzahl_duplikate" soll "anzahlDuplikate" geliefert werden.
	     * fuer "_anzahl_ziffern" soll "_anzahlZiffern" geliefert werden.
	     * fuer "Linked_list" soll "LinkedList" geliefert werden.
	     * @param name ein zulaessiger Name in Snake-Case, garantiert nicht null
	     * @return den Namen in Camel-Case 
	     */
	    
	    public String snakeCaseToCamelCase(String name)
	    {
	      
	        String result = "";
	        boolean anfang = false;
	        boolean mitte = false;
	        for(int i = 0; i < name.length(); i++)
	        {
	            if(i == 0 && name.charAt(i) == '_' &&  name.charAt(i + 1) == '_')
	            {
	                result += "_";
	                i++;
	            }
	            else if(i == 0 && name.charAt(i) == '_' &&  name.charAt(i + 1) != '_')
	            {
	                anfang = true;
	            }
	            else if(i != 0 && name.charAt(i) == '_' && name.charAt(i + 1) != '_')
	            {
	                result += (name.charAt(i + 1) + "").toUpperCase();
	                mitte = true;
	                i++;
	            }
	            else if(name.charAt(i) != '_')
	            {
	                result += name.charAt(i);
	            }
	        }
	        if(anfang && mitte)
	        {
	            result = "_" + result;
	        }
	        return result;
	    }
}
