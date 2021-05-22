package Ticketautomat;

import java.util.Map;

public class TicketautomatImpl implements Ticketautomat
{

	private int _et;
	private int _tt;
	private int _wt;
	private int _geworfen;
	private Map<Ticketart, Integer> _map;

	public TicketautomatImpl(int e, int t, int w)
	{
		_et = e;
		_tt = t;
		_wt = w;

	}

	public TicketautomatImpl(Map<Ticketart, Integer> map)
	{
		_map = map;
	}

	/**
	 * Geld in den Automaten einwerfen. Negative Geldbeträge führen zu einer
	 * IllegalArgumentException.
	 * 
	 * @param der eingeworfene Betrag in Eurocent, muss größer Null sein.
	 * @throws IllegalArgumentException
	 */
	public void geldEinwerfen(int eurocent)

	{
		if (eurocent <= 0)
		{
			throw new IllegalArgumentException("muss größer Null sein.");
		}
		_geworfen += eurocent;
	}

	/**
	 * Liefert die Info, wieviel eingeworfenes Geld für Ticketkäufe zur Verfügung
	 * steht. Ein neu erzeugter Automat liefert 0.
	 */

	public int gibBisherBezahltenBetrag()
	{
		return _geworfen;
	}

	/**
	 * Der Aufruf dieser Operation ist erfolgreich und liefert true, wenn genügend
	 * Geld für die gegebene Ticketart eingeworfen wurde, false sonst. Der Preis für
	 * das gedruckte Ticket wird vom eingeworfenen Geld abgezogen.
	 */
	public boolean einTicketDrucken(Ticketart art)
	{
		boolean result = false;
		switch (art)
		{
		case EINZEL:
			if (_geworfen >= _et)
			{
				_geworfen -= _et;
				result = true;
			}

			break;
		case TAG:
			if (_geworfen >= _tt)
			{
				_geworfen -= _tt;
				result = true;
			}
			break;
		case WOCHE:
			if (_geworfen >= _wt)
			{
				_geworfen -= _wt;
				result = true;
			}

		}
		return result;
	}

	/**
	 * Eingeworfenes Geld, das noch nicht für Ticketkäufe verwendet wurde, wird
	 * ausgezahlt.
	 * 
	 * @return das ausgezahlte Wechselgeld
	 */
	public int zahleWechselgeldAus()
	{
		int wechselgeld;
		wechselgeld = _geworfen;
		_geworfen = 0;
		return wechselgeld;
	}

	/**
	 * Liefert den Preis für die übergebene Ticketart.
	 * 
	 * @return den Preis
	 */
	public int gibPreis(Ticketart art)
	{
		switch (art)
		{
		case EINZEL:
			return _et;
		case TAG:
			return _tt;
		case WOCHE:
			return _wt;
		default:
			return 0;
		}
	}
}
