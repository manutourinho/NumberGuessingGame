# 🎲 _NUMBER GUESSING GAME_ 🎲

This is a simple number guessing game implemented in Java. The objective of the game is to guess a randomly generated number within a specified range. It serves as a project to practice control flow, creation of multiple classes, and applying object-oriented programming (OOP) principles.

## 📜 RULES

1. The game will generate a random — integer — number between a specified minimum and maximum range (inclusive);
2. The player will have a limited number of attempts to guess the correct number;
3. After each guess, the game will provide tips to the player, indicating whether the guess is too high or too low;
4. If the player guesses the correct number within the allowed attempts, they win the game. Otherwise, they lose.
5. The game will display a message indicating the outcome (win or lose) at the end of the game as well as ask if the user wants to play one more round.

## 🕹️ HOW TO PLAY

1. Clone the repository to your local machine;
2. Open the project in your preferred Java IDE;
3. Build and compile the project;
4. Run the Main class to start the game.

## ✨ EXAMPLE GAMEPLAY

```
hello! 😊 
let's play a little guess the number game, shall we?✨  
you have to guess the random right number between 1 and 10 (inclusive)  
⚠ be aware that you only have up to 6 tries ⚠
4
too low!
7
too low!
9
too low!
maybe that's too hard 🤔  
enter "leave" if you want to exit the game and see the answer 
or enter "continue" if you want to keep trying, I bet you can do it!
continue
okay, let's go on then! you still have 3 more tries
10
omg!! are you a magician?! you guessed the right number! 🥳🎉🎉 
it took you 4 try/tries 🎯
let's play again? (yes/no)
no
okayy! thaks for playing tho! byebye 😚
```

## ️🃏 CUSTOMIZATION

You can customize the game by inserting the desired ranges and number of tries within the constructor or by modifying the default values assigned to the following variables in the `Game.java` class:

- `MIN_RANGE`: minimum range for the random number;
- `MAX_RANGE`: maximum range for the random number;
- `MAX_TRIES`: maximum number of attempts allowed for the player.

~Feel free to make changes to the game logic or add new features according to your preferences.

