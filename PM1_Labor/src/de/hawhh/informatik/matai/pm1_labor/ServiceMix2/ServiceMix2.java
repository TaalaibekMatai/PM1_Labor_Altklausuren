package de.hawhh.informatik.matai.pm1_labor.ServiceMix2;

public interface ServiceMix2
{
	/**
     * Diese Operation bekommt ein zweidimensionales Array von int-Werten, bei dem
     * alle Zeilen die Länge 3 haben und die Anzahl der Zeilen beliebig ist,
     * mindestens jedoch 1. Ein korrekter Parameter hat also immer drei Spalten.
     * Beispielsweise wäre die Variable myArray der
     * folgenden Deklaration ein gültiger aktueller Parameter für diese Operation:<br>
     * int[][] myArray = { { 1, 2, 3 } , { 4, 5, 6 } };  // Array von Zeilen <br>
     * Genauso gültig wäre aber auch die folgende Deklaration:<br>
     * int[][] myArray = { { 1, 4 } , { 2, 5 } , { 3, 6 } }; // Array von Spalten <br>
     * Die Operation soll ein zweidimensionales Array mit gleicher Spaltenanzahl,
     * aber einer Zeile mehr liefern. Alle int-Werte des Parameter-Arrays werden
     * in das Ergebnis übernommen, die zusätzliche Zeile soll die Summe
     * der übergebenen Spalten enthalten.
     * Für beide(!) obigen Beispiele soll also folgendes geliefert werden: <br>
     *  1 2 3 <br>
     *  4 5 6 <br>
     *  5 7 9 <br>
     * Wenn ein Array mit falscher Zeilenlänge übergeben wird, soll eine
     * IllegalArgumentException geworfen werden. Ein Array mit drei Zeilen
     * (also der Fall 3x3) soll als ein Array von Spalten aufgefasst werden.
     * @param matrix ein Array, in dem alle Zeilen die Länge 3 haben.
     * @throws IllegalArgumentException
     * @return das fast gleiche Array, lediglich ergänzt um eine Zeile mit 
     * den Summen der Spalten. 
     */
    public int[][] ergaenzeUmSummenzeile(int[][] matrix);
}
