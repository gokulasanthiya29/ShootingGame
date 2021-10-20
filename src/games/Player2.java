package games;

public class Player2 extends Player1 {
	
	private int health;
	private boolean armour;
	
	public Player2(String name, String weapon, int health, boolean armour) {
		
		super(name, weapon);
		this.health = health;
		this.armour = armour;

	}
	
	@Override
	public void damageByGun1() {
		
		if(armour) {
			this.health -= 30;
			if(this.health <= 0) {
				this.health = 0;
			}
		
		
		    System.out.println(getName() + " is hit by Gun1 and his/her health is reduced by 30 with health status of " + this.health);
		
		    if(this.health == 0) {
		        System.out.println(getName() + " is dead");
		    }
		}
		
		if(!armour) {
			
			this.health -= 40;
			if(this.health <= 0) {
				this.health = 0;
			}
			
			System.out.println(getName() + " is hit by Gun1 and his/her health is reduced by 40 with health status of " + this.health);
			
		}
		
		if(this.health == 0) {
				System.out.println(getName() + " is dead");
			}
		}
	}

	@Override
	public void damageByGun1() {
			
		if(armour) {
			this.health -= 50;
			if(this.health <= 0) {
				this.health = 0;
			}
	
		    System.out.println(getName() + " is hit by Gun1 and his/her health is reduced by 50 with health status of " + this.health);
		
		}
		
        if(!armour) {
			
			this.health -= 60;
			if(this.health <= 0) {
				this.health = 0;
			}
			System.out.println(getName() + " is hit by Gun2, his/her health is reduced by 60 with health status of " + this.health);
        }
		
        if(this.health == 0) {
			System.out.println(getName() + " is dead");
		}
	}
	
	@Override
	public void heal() {
	    super.heal();
	}
			
}
