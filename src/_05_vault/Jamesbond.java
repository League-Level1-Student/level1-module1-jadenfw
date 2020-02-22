package _05_vault;

public class Jamesbond {
	
	
	int findCode(Vault hack)
	 {
			for (int i = 0; i < 1000000; i++) {
				if(hack.trycode(i) == true )
				{
					return i;
				}
			
			}
		return -1;
	 	}

}
