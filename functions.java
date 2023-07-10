package tamagoshi;
	
import java.util.Scanner;

public class functions {
	private int happiness;
	private int hunger;
	private String emoji;

	public functions() {
		happiness = 100;
		hunger = 0;
		emoji = "😀";
	}

	public void feed() {
		hunger -= 10;
		if (hunger < 0)
			hunger = 0;
		happiness += 5;
		if (happiness > 100)
			happiness = 100;
		System.out.println("Você alimentou o bichinho.");
	}

	public void play() {
		happiness += 10;
		if (happiness > 100)
			happiness = 100;
		hunger += 5;
		if (hunger > 100)
			hunger = 100;
		System.out.println("Você brincou com o bichinho.");
	}

	public void walk() {
		happiness += 5;
		if (happiness > 100)
			happiness = 100;
		hunger += 10;
		if (hunger > 100)
			hunger = 100;
		System.out.println("Você levou o bichinho para passear.");
	}

	public void changeEmoji(String newEmoji) {
		emoji = newEmoji;
		System.out.println("Você mudou o emoji do bichinho para: " + emoji);
	}

	public void showStatus() {
		System.out.println("Felicidade: " + happiness);
		System.out.println("Fome: " + hunger);
		System.out.println("Emoji: " + emoji);
	}

	public boolean isAlive() {
		return (happiness > 0 && hunger < 100);
	}

}
