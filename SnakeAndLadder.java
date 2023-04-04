package com.bridgelabz.Day4PP1;

public class SnakeAndLadder {
    static int playerPosition = 0;
    public static void main(String[] args) {
        System.out.println("Snake and Ladder Game");
        System.out.println("Initial position : " + playerPosition);

        int diceValue = (int)(Math.random()*10)%6+1;
        System.out.println("Dice Value = " + diceValue);

        int option = (int)(Math.random()*10%3);
        System.out.println("Choice = " + option);

        switch (option) {
            case 0:
                System.out.println("no play");
                break;
            case 1:
                //ladder
                playerPosition = playerPosition + diceValue;
                System.out.println(playerPosition);
                break;
            case 2:
                //snake
                playerPosition = playerPosition - diceValue;
                System.out.println(playerPosition);
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
