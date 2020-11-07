package singleton;

public class SingletonDemonstration {

	public static void main(String[] args) {

		//Singleton singleton = new Singleton();
		//Singleton singleton2 = new Singleton();
		
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		Integer i = 10;
		Integer i2 = 20;
		
		singleton.setNum(10);
		singleton2.setNum(20);

		// Gera uma nova instância
		// singleton = new Singleton();

		System.out.println("Singleton1: " + singleton.getNum());
		System.out.println("Singleton2: " + singleton2.getNum());
		
		System.out.println(singleton.equals(singleton2));
		System.out.println(i.equals(i2));

	}
}
