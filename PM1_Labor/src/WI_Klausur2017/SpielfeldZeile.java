package WI_Klausur2017;

import java.util.HashMap;
import java.util.Map;

public class SpielfeldZeile
{
	private Map<Integer,Spieler> _werte;

    /**
     * Initialisiert eine neue SpielfeldZeile
     */
    public SpielfeldZeile()
    {
        _werte = new HashMap<Integer,Spieler>();
        _werte.put(Spielfeld.LINKS,Spieler.KEINER);
        _werte.put(Spielfeld.MITTE,Spieler.KEINER);
        _werte.put(Spielfeld.RECHTS,Spieler.KEINER);
    }

    /**
     * Gibt den Besitzer der angegebenen Spalte in dieser Zeile.
     * 
     * @param spalte
     *            horizontale Position (0-2)
     * @return 0 (unbesetzt), 1 (Spieler 1), 2 (Spieler 2)
     */
    public Spieler gibBesitzer(int spalte)
    {
        return _werte.get(spalte);
    }

    /**
     * Besetze die angegebene Spalte in dieser Zeile.
     * 
     * @param spalte
     *            horizontale Position (0-2)
     * @param spieler
     *            0 (leer), 1 (Spieler 1), 2 (Spieler 2)
     */
    public void besetze(int spalte, Spieler spieler)
    {
        _werte.put(spalte,spieler);
    }

    /**
     * Gibt an, ob die Zeile an allen Positionen belegt ist.
     */
    public boolean istVoll()
    {
        return (_werte.get(Spielfeld.LINKS) != Spieler.KEINER) 
            && (_werte.get(Spielfeld.MITTE) != Spieler.KEINER)
            && (_werte.get(Spielfeld.RECHTS) != Spieler.KEINER);
    }

}
