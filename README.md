<b>Word Guessing Game (Hangman)</b>

Java Swing implementation of the classic childhood game Hangman. The game secretly selects a word based on the player's difficulty setting. The player tries to guess one letter at a time. Each correct guess will reveal the respective letter. The player is allowed six incorrect guesses. Incorrect guesses will be listed. Each wrong guess will decrement their remaining guesses by one. If the player uses up all six incorrect guesses before they can figure out the word then the game is over. The entire word is revealed at the end.

<b>Game rules</b>
- At the start of the game the computer/secret-keeper will choose a dictionary word
- The guesser loses the game if they guess 6 letters that are not in the secret word
- The guesser wins the game if they guess all letters in the secret word correctly and have not already lost the game per the conditions above

<b>User Interface</b>
- The length of the secret word is displayed to the guesser (as a set of underscores)
- As the guesser makes correct guesses, occurrences of the guessed letter in the word are shown while unknown letters are still hidden
- The number of guesses remaining is displayed
- A list of incorrect guesses are displayed
