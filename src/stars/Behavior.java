package stars;

//�߻�Ŭ������ ����
//�߻�޼��常 ���簡��
public interface Behavior {
	//public abstract ������
	void move();
	void repair();
	void attack(Behavior unit);
	
	////////
	int getHp();
	void setHp(int i);
	
	String getName();

}