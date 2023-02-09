<h1>Dice Roller App</h1>
<p>This app is used to roll a user-specified number of dice with a user-specified number of faces. The results of each roll are displayed, with the highest result of each roll highlighted in red.</p>
<h2>Features:</h2>
<ul>
  <li>User specifies the number of faces on each dice</li>
  <li>User specifies the number of times to roll the dice</li>
  <li>Results of each roll are displayed, with the highest result of each roll highlighted in red</li>
  <li>The highest result of all rolls is displayed at the end of the program</li>
</ul>
<h2>Requirements:</h2>
<ul>
  <li>Java Development Kit (JDK) installed on the system</li>
  <li>An IDE to run the code (such as Eclipse, IntelliJ IDEA, or NetBeans)</li>
</ul>
<h2>How to run the app:</h2>
<ol>
  <li>Clone or download the code to your local system</li>
  <li>Open the code in an IDE</li>
  <li>Run the program by clicking the "Run" button or by using the keyboard shortcut (e.g. "Ctrl + F11" in Eclipse)</li>
  <li>Enter the number of faces on each dice when prompted</li>
  <li>Enter the number of times you want to roll the dice when prompted</li>
  <li>The results of the rolls will be displayed, with the highest result of each roll highlighted in red</li>
  <li>The highest result of all rolls will be displayed at the end of the program</li>
</ol>
<h2>Code:</h2>
<p>The code uses the following libraries and classes:</p>
<ul>
  <li>java.util.Scanner</li>
  <li>java.util.Random</li>
  <li>java.util.stream.IntStream</li>
  <li>java.util.Collections</li>
  <li>java.util.List</li>
  <li>java.util.ArrayList</li>
</ul>
<p>The code defines the following methods:</p>
<ul>
  <li><b>main(String[] args)</b>: This is the main method that starts the program. It prompts the user for the number of faces on each dice and the number of times to roll the dice. It then calls the <b>ThrowDice</b> method with the user-specified parameters.</li>
  <li><b>ThrowDice(int faces, int rolls)</b>: This method performs the dice rolls and displays the results, with the highest result of each roll highlighted in red. It also calculates and displays the highest result of all rolls at the end of the program.</li>
</ul>
<p>The code uses ANSI escape codes to color the text in the console for improved readability and visual appeal.</p>