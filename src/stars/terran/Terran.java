package stars.terran;

import stars.Behavior;

public abstract class Terran implements Behavior{
	public void move() {
		System.out.println("�̵�");
	}
	public void repair() {
		System.out.println("SCV ġ��");
	}
	public abstract void attack(Behavior b);
	
	public static void upgrade() {
		Marine.attack++;
		Tank.attack++;
	}
}

