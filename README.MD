🇬🇧🇬🇧🇬🇧

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
<p>
The program rolls a dice with a specified number of faces for a specified number of rolls. The results of each roll are printed, with the highest number of each roll being highlighted in red. Finally, the biggest number among all the rolls is printed in green.
</p>
<h2>Usage</h2>
<p>
When the program is run, the user is prompted to specify the number of faces the dice will have and the number of rolls they want to make. The program then outputs the results of each roll and the biggest number in the results.
</p>
<h2>Implementation Details</h2>
<p>
The program uses the java.util.Scanner class to accept user input, the java.util.Random class to generate random numbers for the dice rolls, and java.util.stream.IntStream to create an array of integers representing the possible values of each roll. The program also uses the java.util.List and java.util.ArrayList classes to store the results of each roll and find the biggest number among them using java.util.Collections.max(). The program uses ANSI escape sequences to add color to the output.
</p>
<h2>Example Output</h2>
<pre>
Program started

each dice is going to be rolled three times, and the biggest one is going to be highlighted in red for each dice.

how many faces is the dice going to have? 6
how many times do you want to roll? 3
2 3 6
1 6 4
5 6 3
The biggest number in the results is: <span style="color: green;">6</span>
</pre>
    <p>The program starts by printing <span style="color: blue;">"Program started"</span>, then asks the user to input the number of faces the dice will have and the number of times the dice will be rolled.</p>
    <p>After getting the input from the user, the program generates random numbers within the range of 1 to the number of faces the user has entered. These random numbers represent the rolls of the dice. The program rolls the dice the number of times the user has specified.</p>
    <p>For each roll, the program determines the biggest number and highlights it in <span style="color: red;">red</span>. The program then stores all the biggest numbers from each roll in a list.</p>
    <p>Finally, the program calculates and displays the biggest number among all the rolls in <span style="color: green;">green</span>.</p>
    <p>This program makes use of the following Java classes:</p>
    <ul>
      <li>Scanner to get the user input</li>
      <li>Random to generate random numbers</li>
      <li>IntStream to create an array of integers</li>
      <li>Collections to find the maximum number in the list</li>
      <li>List and ArrayList to store the biggest numbers from each roll.</li>
    </ul>
    <p>The program also makes use of ANSI escape codes to change the color of the output text in the terminal.</p>


🇮🇹🇮🇹🇮🇹

<h1>App del lancio dei dadi</h1>
<p>Questa app viene utilizzata per lanciare un numero specificato dall'utente di dadi con un numero specificato dall'utente di facce. I risultati di ogni lancio vengono visualizzati, con il risultato più alto di ogni lancio evidenziato in rosso.</p>
<h2>Funzionalità:</h2>
<ul>
  <li>L'utente specifica il numero di facce su ogni dado</li>
  <li>L'utente specifica il numero di volte in cui lanciare i dadi</li>
  <li>I risultati di ogni lancio vengono visualizzati, con il risultato più alto di ogni lancio evidenziato in rosso</li>
  <li>Il risultato più alto di tutti i lanci viene visualizzato alla fine del programma</li>
</ul>
<h2>Requisiti:</h2>
<ul>
  <li>Java Development Kit (JDK) installato sul sistema</li>
  <li>Un IDE per eseguire il codice (come Eclipse, IntelliJ IDEA o NetBeans)</li>
</ul>
<h2>Come eseguire l'app:</h2>
<ol>
  <li>Clona o scarica il codice sul tuo sistema locale</li>
  <li>Apri il codice in un IDE</li>
  <li>Esegui il programma facendo clic sul pulsante "Esegui" o utilizzando la scorciatoia da tastiera (ad esempio "Ctrl + F11" in Eclipse)</li>
  <li>Inserisci il numero di facce su ogni dado quando richiesto</li>
  <li>Inserisci il numero di volte che vuoi lanciare i dadi quando richiesto</li>
  <li>I risultati dei lanci verranno visualizzati, con il risultato più alto di ogni lancio evidenziato in rosso</li>
  <li>Il risultato più alto di tutti i lanci verrà visualizzato alla fine del programma</li>
</ol>
<h2>Codice:</h2>
<p>Il codice utilizza le seguenti librerie e classi:</p>
<ul>
  <li>java.util.Scanner</li>
  <li>java.util.Random</li>
  <li>java.util.stream.IntStream</li>
  <li>java.util.Collections</li>
  <li>java.util.List</li>
  <li>java.util.ArrayList</li>
</ul>
<p>Il codice definisce i seguenti metodi:</p>
<ul>
  <li><b>main(String[] args)</b>: Questo è il metodo principale che avvia il programma. Chiede all'utente il numero di facce su ogni dado e il numero di volte per lanciare il dado. Quindi chiama il metodo <b>ThrowDice</b> con i parametri specificati dall'utente.</li>
  <li><b>ThrowDice(int facce, int tiri)</b>: Questo metodo esegue i lanci dei dadi e visualizza i risultati, con il risultato più alto di ogni lancio evidenziato in rosso. Inoltre, calcola e visualizza il risultato più alto di tutti i lanci alla fine del programma.</li>
</ul>
<p>Il codice utilizza i codici di escape ANSI per colorare il testo nella console per una migliore leggibilità e attrattiva visiva.</p>
<p>
Il programma lancia un dado con un numero specificato di facce per un numero specificato di lanci. I risultati di ogni lancio vengono stampati, con il numero più alto di ogni lancio evidenziato in rosso. Infine, il numero più grande tra tutti i lanci viene stampato in verde.
</p>
<h2>Utilizzo</h2>
<p>
Quando viene eseguito il programma, viene richiesto all'utente di specificare il numero di facce che avrà il dado e il numero di lanci che vogliono fare. Il programma quindi emette i risultati di ogni lancio e il numero più grande nei risultati.
</p>
<h2>Dettagli di implementazione</h2>
<p>
Il programma utilizza la classe java.util.Scanner per accettare l'input dell'utente, la classe java.util.Random per generare numeri casuali per i lanci dei dadi e java.util.stream.IntStream per creare un array di interi che rappresentano i possibili valori di ogni lancio. Il programma utilizza anche le classi java.util.List e java.util.ArrayList per memorizzare i risultati di ogni lancio e trovare il numero più grande tra loro utilizzando java.util.Collections.max(). Il programma utilizza le sequenze di escape ANSI per aggiungere il colore all'output.
</p>
<h2>Esempio di output</h2>
<pre>
Programma avviato

ogni dado verrà lanciato tre volte, e il più grande sarà evidenziato in rosso per ogni dado.

quante facce avrà il dado? 6
Quante volte vuoi lanciare il dado? 3

5 1 6
4 2 5
6 3 1

Il risultato più grande di tutti i lanci è: 6
</pre>
<p>Questo è un esempio di output del programma con un dado a sei facce che viene lanciato tre volte. Come si può vedere, vengono visualizzati i risultati di ogni lancio, con il più alto evidenziato in rosso, e alla fine viene visualizzato il risultato più alto di tutti i lanci in verde.</p>
<p>Questo programma fa uso delle seguenti classi Java:</p>
    <ul>
      <li>Scanner per ottenere l'input dell'utente</li>
      <li>Random per generare numeri casuali</li>
      <li>IntStream per creare un array di interi</li>
      <li>Collections per trovare il numero massimo nella lista</li>
      <li>List e ArrayList per memorizzare i numeri più grandi da ogni lancio.</li>
    </ul>
    <p>Il programma fa anche uso dei codici di escape ANSI per modificare il colore del testo di output nella console.</p>
