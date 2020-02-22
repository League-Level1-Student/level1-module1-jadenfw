package _05_vault;

import java.util.Random;

public class Vault {

	 int vaultcode = new Random().nextInt(2000000);
	 boolean trycode(int guess)
	{
		{
			if (guess == vaultcode)
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
	}
	 
	 
	public static void main(String[] args) {
		Vault vault = new Vault();
		Jamesbond jb = new Jamesbond();
		System.out.println(jb.findCode(vault));
	}
	

	
}

