package WI_Klausur2017;

public class SanduhrFinderImpl
{
	  public SanduhrFinderImpl()
	    {
	    }
	    
	    /**
	     * Liefert fuer ein zweidimensionales Array von int-Werten 
	     * die Summe aller Sanduhren in diesem Array. Eine Sanduhr in einem Array
	     * ist eine Menge von benachbarten Zellen mit folgender Form:
	     * 
	     *  a b c      
	     *    d         
	     *  e f g       
	     * 
	     * Der Wert einer Sanduhr berechnet sich aus der Summe ihrer Zellen.
	     * Für das folgende int-Array beispielsweise:
	     * 
	     * 1 1 1 2
	     * 2 1 2 2
	     * 1 1 1 2
	     * 2 2 2 2
	     *
	     * ist der Wert der ersten Sanduhr in der linken oberen Ecke 7 (nur Einsen),
	     * die um eine Zelle nach rechts verschobene Sanduhr hat den Wert 10.
	     * Das ganze Array enthaelt vier Sanduhren, deren Summe 7+10+12+12 = 41 beträgt.
	     */
	    public int addiereSanduhren(int[][] arr)
	    {
	        int summe = 0;
	        for(int x = 0; x < arr.length;x++)
	        {
	            if(x <= arr.length - 3 && arr[x] != null && arr[x + 1] != null && arr[x + 2] != null)
	            {
	                for(int y = 0; y <= arr[x].length - 3 && y <= arr[x + 2].length - 3;y++)
	                {
	                    for(int i = y; i < y + 3; i++)
	                    {
	                        summe = summe + arr[x][i];
	                        summe = summe + arr[x + 2][i];
	                    }
	                    summe = summe + arr[x +1][y+1];
	                }
	            }
	        }
	        return summe;
	    }
}
