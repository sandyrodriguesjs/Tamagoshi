package tamagoshi;
import java.util.Scanner;

public class Tamagochi {
    private int happiness;
    private int hunger;
    private String emoji;

    public Tamagochi() {
        happiness = 100;
        hunger = 0;
        emoji = "😀";
    }

    public void feed() {
        hunger -= 10;
        if (hunger < 0) hunger = 0;
        happiness += 5;
        if (happiness > 100) happiness = 100;
        System.out.println("Você alimentou o bichinho.");
    }

    public void play() {
        happiness += 10;
        if (happiness > 100) happiness = 100;
        hunger += 5;
        if (hunger > 100) hunger = 100;
        System.out.println("Você brincou com o bichinho.");
    }

    public void walk() {
        happiness += 5;
        if (happiness > 100) happiness = 100;
        hunger += 10;
        if (hunger > 100) hunger = 100;
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

    // Getter para o campo happiness
    public int getHappiness() {
        return happiness;
    }

    // Getter para o campo hunger
    public int getHunger() {
        return hunger;
    }

    public static void main(String[] args) {
        Tamagochi tamagotchi = new Tamagochi();
        Scanner scanner = new Scanner(System.in);

        while (tamagotchi.isAlive()) {
            tamagotchi.showStatus();
            System.out.println("O que você quer fazer?");
            System.out.println("1 - Alimentar");
            System.out.println("2 - Brincar");
            System.out.println("3 - Levar para passear");
            System.out.println("4 - Mudar o emoji");
            System.out.println("0 - Sair");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (choice) {
                case 1:
                    tamagotchi.feed();
                    break;
                case 2:
                    tamagotchi.play();
                    break;
                case 3:
                    tamagotchi.walk();
                    break;
                case 4:
                    System.out.println("Digite o novo emoji: ");
                    String newEmoji = scanner.nextLine();
                    tamagotchi.changeEmoji(newEmoji);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            tamagotchi.hunger += 10;
            tamagotchi.happiness -= 10;
        }

        System.out.println("O bichinho morreu. Fim de jogo!");
    }
}
