package WI_Klausur2017;

import java.util.HashMap;
import java.util.Map;

public class SpielfeldGeflecht implements Spielfeld
{
	private Map<Integer,SpielfeldZeile> _zeilen;
    

    public SpielfeldGeflecht()
    {
        _zeilen = new HashMap<Integer,SpielfeldZeile>();
        _zeilen.put(0,new SpielfeldZeile());
        _zeilen.put(1, new SpielfeldZeile());
        _zeilen.put(2, new SpielfeldZeile());
    }
    
     private Spieler intZuSpieler(int a)
    {
        if(a == 0)
        return Spieler.KEINER;
        if(a==1)
        return Spieler.SPIELER1;
        if(a == 2)
        return Spieler.SPIELER2;
        
        return Spieler.KEINER;
    }
    
    private int spielerZuInt(Spieler a)
    {
        if(a==Spieler.KEINER)
        return 0;
        if(a==Spieler.SPIELER1)
        return 1;
        if(a==Spieler.SPIELER2)
        return 2;
        
        return 0;
       
    }

   /**
     * Gibt den Besitzer der angegebenen Position auf dem Spielfeld.
     * 
     * @param zeile vertikale Position (0-2)
     * @param spalte horizontale Position (0-2)
     * @return 0 (unbesetzt), 1 (Spieler 1), 2 (Spieler 2)
     * @throws IllegalArgumentException bei ungueltigen Parametern
     */
    public int gibBesitzer(int zeile, int spalte)
    {
        if(zeile < 0 || zeile >2 || spalte < 0 || spalte > 2)
        {
            throw new IllegalArgumentException();
        }
        return spielerZuInt(_zeilen.get(zeile).gibBesitzer(spalte));
    }

    /**
     * Besetzt die angegebene Position auf dem Spielfeld fuer einen Spieler.
     * 
     * @param zeile vertikale Position (0-2)
     * @param spalte horizontale Position (0-2)
     * @param spieler 0 (leer), 1 (Spieler 1), 2 (Spieler 2)
     * @throws IllegalArgumentException bei ungueltigen Parametern
     */
    public void besetzePosition(int zeile, int spalte, int spieler)
    {
        if(zeile < 0 || zeile >2 || spalte < 0 || spalte > 2 || spieler < 0 || spieler > 2)
        {
            throw new IllegalArgumentException();
        }
        _zeilen.get(zeile).besetze(spalte, intZuSpieler(spieler));
    }
    
    /**
     * Gibt an, ob das Spielfeld an allen Positionen belegt ist.
     */
    public boolean istVoll()
    {
        return (_zeilen.get(0).istVoll() && _zeilen.get(1).istVoll() && _zeilen.get(2).istVoll());
        
    }
}
