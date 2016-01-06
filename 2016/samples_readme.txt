Unter workspaces/samples befinden sich zwei Workspaces
"xtext_test1" enthält die Projekte ("sample1", "sample2"), in denen wir die Grammatiken
definiert haben.
"runtime-EclipseApplication" enthält die Projekte, die wir im DSL-Editor verwendet haben.

==

Die Beispielprojekte können einach via "Import", "General / Existing Projects into Workspace"
importiert werden und sollten dann wie im Workshop ausführbar sein.

Projekt sample1 war das Beispiel mit den Services und der Codegenerierung
Projekt sample2 war das Beispiel mit den Hello-Worlds aus dem Workshop

Und immer daran denken: Nach jeder Änderung folgendes ausführen:
- "run as MWE2 workflow" auf der .mwe2-Datei um die Grammatik-Artefakte und den DSL-Editor neu zu generieren
- "run as Eclipse-Application" auf dem Basis-Projekt um den DSL-Editor zu starten

==

Die Hauptprojekte (in denen die Grammatik definiert wird) sind im Wesentlichen gleich. Im
sample1 wird lediglich noch der Code-Generator verwendet (unihh.sample1.generator.MyDslGenerator.xtend)
mit dem die Java-Dateien generiert werden, wenn später im DSL-Editor das Modell gespeichert wird.

Im DSL-Editor kann mit einfachen Java-Projekte gearbeitet werden. Wenn der Editor eine Datei mit der
Endung "mydsl" erkennt, so wird unsere Grammatikprüfung aktiv.

Das Services-Projekt ist ein Maven-Projekt weil noch zusätzliche Spring-Dependencies benötigt werden.
Es kann von der Kommandozeile aus gestartet werden:
-> mvn clean compile spring-boot:run
Danach kann beispielsweise über den Browser auf "http://localhost:8080/api/v1/KundeUndKonto/Kunde/18"
zugegriffen werden und es sollte folgender angezeigt werden "value for Kunde with id '18' from database".

Besonderheiten im Vergleich zum einfachen "Hello World"-Projekt:
- Maven pom.xml mit Spring-Dependencies und build-helper-plugin. Letzteres wird benötigt, weil der
DSL-Editor die generierten Java-Dateien unter "gen-src" ablegt und Maven diesen Ordner als 
Source-Folder erkennen muss.
- Eine Klasse App.java, die für das Bootstrapping der Spring-Anwendung zuständig ist

==

Im Ordner Snippets sind nochmals alle wichtigen Dateien einzeln hinterlegt.

==

Bei Fragen stehe ich gerne zur Verfügung: ralph.winzinger@senacor.com