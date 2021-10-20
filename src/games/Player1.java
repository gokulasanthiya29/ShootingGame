package games;

public class Player1 {
	
	private String name;
	private String weapon;
	private int health;
	
	public Player1(String name, String weapon, int health) {
		
		this.name = name;
		this.weapon = weapon;
		
		// Encapsulation is being used here.
		if(health < 0 || health > 100) {
			this.health = 100;
		}
		else {
			this.health = health;
		}
	
	}
	
	public void damageByGun1() {
		
		this.health -= 40;
		if(this.health <= 0) {
			this.health = 0;
		}
		
		System.put.println(getName() + " is hit by Gun1 and his/her health is reduced by 40 with health status of " + this.health);
		
		if(this.health == 0) {
			System.out.println(getName() + " is dead");
		}
		
	}
	
	public void damageByGun2() {
		
		this.health -= 50;
		if(this.health <= 0) {
			this.health = 0;
		}
		
		System.put.println(getName() + " is hit by Gun2, his/her health is reduced by 50 with health status of " + this.health);
		
		if(this.health == 0) {
			System.out.println(getName() + " is dead");
		}
		
	}
	
	public void heal() {
		
        if(this.health <= 0 ) {
        	System.out.println("Player is dead. It's impossible to heal");
        }
        else {
            this.health = 100;
            System.out.println("Health is " + this.health);
        }
	
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getWeapon() {
		return weapon;
	}
	
	public void setWeapon(String Weapon) {
		this.weapon = weapon;
	}
	
	public int hetHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}

}
