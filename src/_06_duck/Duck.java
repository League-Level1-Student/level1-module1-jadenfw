package _06_duck;

public class Duck {

	int numberOfFriends = 0;
	String favoriteFood = "";
	
	
	
	Duck(String favoriteFood, int numberOfFriends)
	{
		
      	this.favoriteFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
      	
	}
	
	void quack()
	{
		System.out.println("ribbit");
	}
	
}
