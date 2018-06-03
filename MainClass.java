import java.util.ArrayList;

public class MainClass 
{
	public static ArrayList<Player> players = new ArrayList<Player>();
	public static ArrayList<Card> deck = new ArrayList<Card>();
	public static int numberOfPlayers = 4;
	
	public static void main(String[] args) 
	{
		for(int j = 0; j < 4; j++) 
		{	
			for(int i = 2; i < 15; i++) 
			{
				Card c = new Card(i,suiteCalculator(j));
				deck.add(c);
			}
		}
		cPlayer();
		
	}
	
	public static char suiteCalculator(int i) 
	{
		if(i == 0) 
		{
			return 'h';
		}
		else if(i == 1) 
		{
			return 's';
		}
		else if(i == 2) 
		{
			return 'c';
		}
		else 
		{
			return 'd';
		}
	}
	
	public static void cPlayer() 
	{
		
			int num = 0;
			for(int i = 52; i > 0 ; i--) 
			{
				if(i % numberOfPlayers == 0) 
				{
					num = i;
					break;
				}	
			}
		for(int i = 0; i < numberOfPlayers; i++) 
		{
			ArrayList<Card> temp = new ArrayList<Card>();
			Player p = new Player(temp);
			players.add(p);
		}
		int y = (int)num / numberOfPlayers;
		for(Player p : players) 
		{
			AssignCards(p,y);
		}
		for(Player p : players) 
		{
			addRemCards(p);
		}
	}
	
	public static void AssignCards(Player p, int number) 
	{
		for(int i = 0; i < number; i++) 
		{
			int x = (int)(Math.random() * deck.size()) + 1;
			p.addCard(deck.get(i));
			deck.remove(i);
		}
	}
	public static void addRemCards(Player p) 
	{
		p.addCard(deck.get(0));
		deck.remove(0);
	}
}
