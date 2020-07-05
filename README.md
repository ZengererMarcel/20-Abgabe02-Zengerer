# 20-Abgabe02-Zengerer

Grundsätzlich handelt es sich bei diesem Projekt um eine Queue, in der Daten vom Typ String gespeichert werden können. In der Implementierung sind allerding 3 Fehler eingebaut, welche von uns gefunden und korregiert werden müssen. Darauffolgend ist es unsere Aufgabe eine weitere Queue zu implementieren, die Daten, egal von welchem Typ entgegennimmt. Beide Implementierungen sollen dann mit einer Testabdeckung von 100% getestet werden. Das gesamte Projekt sollte gut dokumentiert werden.

## Tasklist

- [x] Projekt (Queue) einfügen
- [x] Testcases für StringQueue hinzufügen
- [x] Fehler im Projekt finden und korrigieren
- [x] JavaDoc hinzufügen
- [x] Queue Klasse hinzufügen die Generic ist
- [x] Testcases für Queue hinzufügen (Generic Queue, mit der Klasse String testen)
- [X] MavenSite Dokumentation
- [x] LabReport erstellen

## Fehler

- Im StringQueue Konstruktor wurde die falsche Variable benutzt, statt der globalen Variable maxSize wurde die lokale Variable maxize benutzt
- In der poll Methode wurde statt auf ungleichheit zu prüfen auf gleichheit geprüft
- In der remove Methode war die Zuweisung element=" " wodurch das element durch " " ersetzt wurde.


