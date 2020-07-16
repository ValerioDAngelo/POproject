---


---

<h1 id="poproject">POproject</h1>
<p>L’applicazione è in grado di restituire un elenco di tweet con ingaggio presi da uno specifico utente autorizzato, e di operare delle statistiche sui suddetti tweets, tramite le apposite chiamate REST.</p>
<h2 id="use-case-diagram">Use Case Diagram</h2>
<p>L’utente può consultare il seguente file README, oppure, dopo aver avviato l’applicazione, fare una delle 4 chiamate possibili sulle rispettive rotte.</p>
<p><img src="https://github.com/ValerioDAngelo/POproject/blob/master/UML/POprojectModel%20Use%20Case%20Diagram.jpg" alt="Use Case Diagram"></p>
<h2 id="class-diagram">Class Diagram</h2>
<p>Di seguito è mostrato il diagramma delle classi, diviso per package.</p>
<p><img src="https://github.com/ValerioDAngelo/POproject/blob/master/UML/POprojectModel%20Package%20Class%20Diagram.png" alt="Package Class Diagram"><br>
<img src="https://github.com/ValerioDAngelo/POproject/blob/master/UML/POprojectModel%20Controller%20Class%20Diagram.jpg" alt="Controller Class Diagram"><br>
<img src="https://github.com/ValerioDAngelo/POproject/blob/master/UML/POprojectModel%20Data%20Class%20Diagram.png" alt="Data Class Diagram"><br>
<img src="https://github.com/ValerioDAngelo/POproject/blob/master/UML/POprojectModel%20utils%20Class%20Diagram.jpg" alt="Utils Class Diagram"><br>
<img src="https://github.com/ValerioDAngelo/POproject/blob/master/UML/POprojectModel%20statistics%20Class%20Diagram.jpg" alt="Statistics Class Diagram"><br>
<img src="https://github.com/ValerioDAngelo/POproject/blob/master/UML/POprojectModel%20exception%20Class%20Diagram.png" alt="Exception Class Diagram"></p>
<h2 id="chiamate">Chiamate</h2>
<p>Di seguito sono elencate le 4 chiamate possibili.</p>
<h2 id="rotta-data">Rotta “/Data”</h2>
<p>Sulla rotta “/Data” è possibile ottenere l’elenco completo dei tweets che hanno ricevuto ingaggio.</p>
<p><img src="https://github.com/ValerioDAngelo/POproject/blob/master/UML/Data%20Sequence%20Diagram.png" alt="Data Sequence Diagram"></p>
<h2 id="rotta-metadata">Rotta “/MetaData”</h2>
<p>Sulla rotta “/MetaData” vengono restituiti i metadati relativi al singolo tweet.</p>
<p><img src="https://github.com/ValerioDAngelo/POproject/blob/master/UML/Metadata%20Sequence%20Diagram.png" alt="Metadata Sequence Diagram"></p>
<h2 id="rotta-timestats">Rotta “/timeStats”</h2>
<p>Sulla rotta “/timeStats” vengono restituite le statistiche relative alle fasce orarie dei tweets : orario minimo e massimo di pubblicazione di un tweet, e orario medio di pubblicazione di un tweet (con relativa deviazione standard).</p>
<p><img src="https://github.com/ValerioDAngelo/POproject/blob/master/UML/timeStats%20Sequence%20Diagram.png" alt="timeStats Sequence Diagram"></p>
<h2 id="rotta-daystats">Rotta “/dayStats”</h2>
<p>Sulla rotta “/dayStats” vengono restituite le statistiche relative ai giorni della settimana di pubblicazione dei tweets, calcolate su tutto il periodo preso in esame : giorno con meno tweets pubblicati, giorno con più tweets pubblicati, e media giornaliera di tweets al giorno (con relativa deviazione standard).</p>
<p><img src="https://github.com/ValerioDAngelo/POproject/blob/master/UML/dayStats%20Sequence%20Diagram.png" alt="dayStats Sequence Diagram"></p>

