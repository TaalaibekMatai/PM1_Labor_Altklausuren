package Ticketautomat;


	/**
	 * Ein Interface für einfache Ticketautomaten. Diese Ticketautomaten
	 * können (E)inzeltickets, (T)agestickets und (W)ochentickets verkaufen.
	 * Die Preise in Eurocent für diese drei Ticketarten müssen einer
	 * implementierenden Klasse als Konstruktorparameter vom Typ int übergeben
	 * werden, in der Reihenfolge E-T-W. 
	 * Zusätzlich kann ein Konstruktor angeboten werden, der eine dreielementige
	 * Map von allen Ticketarten auf ihre Ticketpreise als Parameter erhält.
	 * 
	 * @author Axel Schmolitzky
	 * @version SoSe 2016
	 */
	interface Ticketautomat
	{
	    /**
	     * Geld in den Automaten einwerfen. 
	     * Negative Geldbeträge führen zu einer IllegalArgumentException.
	     * @param der eingeworfene Betrag in Eurocent, muss größer Null sein.
	     * @throws IllegalArgumentException
	     */
	    void geldEinwerfen(int eurocent);
	    
	    /**
	     * Liefert die Info, wieviel eingeworfenes Geld für Ticketkäufe zur Verfügung steht.
	     * Ein neu erzeugter Automat liefert 0.
	     */
	    int gibBisherBezahltenBetrag();
	    
	    /**
	     * Der Aufruf dieser Operation ist erfolgreich und liefert true, wenn genügend Geld
	     * für die gegebene Ticketart eingeworfen wurde, false sonst.
	     * Der Preis für das gedruckte Ticket wird vom eingeworfenen Geld abgezogen.
	     */
	    boolean einTicketDrucken(Ticketart art);
	    
	    /**
	     * Eingeworfenes Geld, das noch nicht für Ticketkäufe verwendet wurde, 
	     * wird ausgezahlt.
	     * @return das ausgezahlte Wechselgeld
	     */
	    int zahleWechselgeldAus();
	    
	    
	    /**
	     * Liefert den Preis für die übergebene Ticketart.
	     * @return den Preis
	     */
	    int gibPreis(Ticketart art);    
	    
	}


