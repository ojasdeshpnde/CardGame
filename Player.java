import java.util.ArrayList;
import java.util.Stack;

public class Player 
{
	public ArrayList<Card> cards;
	
	public Player(ArrayList<Card> myCards) 
	{
		cards = myCards;
	}
	
	public void addCard(Card a) 
	{
		this.cards.add(a);
	}
	public void remCard(Card b) 
	{
		for(int i = 0; i < cards.size(); i++) 
		{
			if((b.suite == cards.get(i).suite) && b.value == cards.get(i).value) 
			{
				cards.remove(i);
			}
		}
	}
	public ArrayList<Card> getCard() 
	{
		return this.cards;
	}
}
