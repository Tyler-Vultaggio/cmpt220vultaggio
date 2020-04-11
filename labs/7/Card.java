//Tyler Vultaggio
//4/10/2020
//Lab 7

public class Card 
{
	private String face;
	private String suite;
	
	public Card(String f, String s) 
	{
		face = f;
		suite = s;
	}

	public String getFace() 
	{
		return face;
	}

	public void setFace(String face) 
	{
		this.face = face;
	}

	public String getSuite()
	{
		return suite;
	}

	public void setSuite(String suite) 
	{
		this.suite = suite;
	}
	
	public String toString() 
	{
		return face +" of "+ suite;
	}
}

class Deck 
{
	private Card[] cards;
	private static final String[] suits = {"Diamonds","Hearts","Spades","Clubs"};
	private static final String[] faces = {"ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
	
	public Deck() 
	{
		cards = new Card[52];
		int count = 0;
		for(int i = 0; i<4;i++) 
		{
			for(int j = 0; j<13; j++) 
			{
				cards[count++] = new Card(faces[j],suits[i]);
			}
		}
	}
	
	public void OutPut() 
	{
		for(int i=0;i<cards.length;i++) 
		{
			System.out.println(cards[i]);
		}
	}
}


