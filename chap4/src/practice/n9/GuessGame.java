package practice.n9;

import java.util.Scanner;
class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addScore() {
        score++;
    }
}

public class GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** 예측 게임을 시작합니다. ***");

        System.out.print("게임에 참여할 선수 수>>");
        int playerCount = scanner.nextInt();

        Player[] players = new Player[playerCount];

        for (int i = 0; i < playerCount; i++) {
            System.out.print("선수 " + i + " 이름>>");
            String name = scanner.next();
            players[i] = new Player(name);
        }

        while (true) {
            int answer = (int)(Math.random() * 100) + 1;

            System.out.println("1~100사이의 숫자가 결정되었습니다. 선수들은 맞추어 보세요.");

            int winnerIndex = 0;
            int minDifference = Integer.MAX_VALUE;

            for (int i = 0; i < playerCount; i++) {
                System.out.print(players[i].getName() + ">>");
                int guess = scanner.nextInt();

                int difference = Math.abs(answer - guess);

                if (difference < minDifference) {
                    minDifference = difference;
                    winnerIndex = i;
                }
            }

            players[winnerIndex].addScore();

            System.out.println("정답은 " + answer + ". " + players[winnerIndex].getName() + "이 이겼습니다. 승점 1점 확보!");

            System.out.print("계속하려면 yes 입력>>");
            String continueGame = scanner.next();

            if (!continueGame.equals("yes")) {
                break;
            }
        }

        for (Player player : players) {
            System.out.print(player.getName() + ":" + player.getScore() + " ");
        }
        System.out.println();

        int finalWinner = 0;

        for (int i = 1; i < playerCount; i++) {
            if (players[i].getScore() > players[finalWinner].getScore()) {
                finalWinner = i;
            }
        }

        System.out.println(players[finalWinner].getName() + "이 최종 승리하였습니다.");

        scanner.close();
    }
}