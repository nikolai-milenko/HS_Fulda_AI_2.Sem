## Woche 2025-04-14
- Datum der Vorlesung: 2025-04-14

### Lernziel

- Überblick über die Prüfungsstruktur (20% Lerntagebuch, 65% Gruppenprojekt, 20% Zusatzpunkte)  
- Unterschiede zwischen Laien und Profis verstehen und reflektieren  
- Vergleich von Softwareentwickler:innen mit Künstler:innen und Handwerker:innen  
- Einführung in die Clean Code Developer-Tugenden (CCD)  
- Bedeutung von Prinzipien, Disziplin und Qualität in der Softwareentwicklung  
- Technische Einrichtung: Registrierung bei GitLab (RWTH Aachen), Gruppenbeitritt, Setup des eigenen Repositories inkl. `README.md` und Matrikelnummer-Datei  
- Persönliche Vorstellungsrunde in der Übung (Lieblingssprache, erstes Projekt, Hobbys)  

### Erkenntnis

Was hängen geblieben ist: Softwareentwicklung ist kein reines Tippen, sondern ein Mix aus Verantwortung, Struktur und kreativem Denken. Der Vergleich mit Kunst und Handwerk war ungewohnt, aber treffend. Besonders stark fand ich das Beispiel mit Semmelweis – kleine Prinzipien, konsequent umgesetzt, machen langfristig den Unterschied. Gleiches gilt für Codequalität.

### Wiederholung

**Clean Code Developer (CCD)** ist eine Initiative, die Grundprinzipien für professionelle Softwareentwicklung vermittelt. Statt nur "funktionierender Code" geht’s um Verständlichkeit, Wartbarkeit und Nachhaltigkeit. Wichtige Tugenden:  
- **Nur das Nötigste tun** – unnötiger Overhead vermeiden  
- **Abhängigkeiten minimieren** – weniger Kopplung, mehr Flexibilität  
- **Aspekte isolieren** – jede Komponente soll nur eine Aufgabe haben  
- **Variation schätzen** – offen bleiben für verschiedene Lösungen  
- **Versprechen einhalten** – saubere, verlässliche Arbeit im Team  

### Feedback (optional)

Die Einbindung praktischer Beispiele wie Semmelweis war top. Die Folien im Moodle waren allerdings noch von 2022. Es wäre hilfreich, wenn die aktuelle Version vor der Vorlesung verfügbar wäre.

## Woche 2025-04-28
- Datum der Vorlesung: 2025-04-28

### Lernziel

- Verstehen des imperativen Paradigmas und seiner Definition  
- Unterschiede zwischen deklarativer, prozeduraler und funktionaler Programmierung herausarbeiten  
- Vorteile typisierter vs. typenloser Sprachen evaluieren  
- Grundprinzipien SOLID, STUPID und KISS kennenlernen und abgrenzen

### Erkenntnis

In der Vorlesung fand ich das Konzept der deklarativen Programmierung am spannendsten, weil hier der Fokus auf der Beschreibung des Problems liegt und der Lösungsweg automatisch ermittelt wird – das minimiert Seiteneffekte und erhöht die Vorhersagbarkeit des Codes.  
In der Übung wurde deutlich, wie SOLID‑Prinzipien (z. B. Single Responsibility, Open/Closed) im Gegensatz zu STUPID‑Prinzipien stehen: SOLID erfordert anfänglich mehr Architekturaufwand, verbessert jedoch langfristig die Wartbarkeit erheblich.

### Wiederholung

**Fachbegriff:** Open/Closed Principle (OCP)  
**Erklärung:**
Ein Software‑Modul soll für Erweiterungen offen, für Änderungen geschlossen sein. Neue Funktionalität wird über Erweiterungen (z. B. Vererbung oder Composition) hinzugefügt, ohne bestehenden Quellcode zu verändern. So lassen sich Regressionen verhindern.

### Feedback (optional)

- **Vorlesung:** Sehr klar strukturiert, aber mehr Code‑Beispiele wären hilfreich gewesen.

## Woche 2025-05-05
- Datum der Vorlesung: 2025-05-05

### Lernziel

- Verstehen, was Entwurfsmuster (Design Patterns) sind und warum sie eingesetzt werden  
- Einordnung der Muster in Erzeugungs‑, Struktur‑ und Verhaltensmuster  
- Kennenlernen ausgewählter GoF‑Muster: Builder, Factory Method, Singleton
- Vor‑ und Nachteile von Entwurfsmustern erkennen (z. B. Einstiegshürde vs. Kommunikationserleichterung)  
- Überblick zur Geschichte von Programmierwerkzeugen und Entwicklung moderner IDEs  
- Verständnis wichtiger IDE‑Funktionen: Syntax‑Highlighting, Refactorings, Debugging  
- SOLID‑ und STUPID‑Prinzipien wiederholen (Übung)  
- Setup und Nutzung einer Java‑IDE (Eclipse/Maven) für Debugging‑Aufgaben (Übung)  

### Erkenntnis

- **Design Patterns**: Entwurfsmuster dienen als gemeinsame Sprache im Team – wenn ich „Observer“ sage, weiß jeder sofort, dass es um Publish/Subscribe geht.  
- **IDE‑Features**: Automatisches Refactoring und Live‑Debugging ermöglichen schnelle, sichere Code‑Modifikationen über mehrere Dateien hinweg.  
- **Debugging‑Übung**: Durch das Setzen von Breakpoints und das Ein‑/Überschreiten von Codezeilen im Debug‑Modus habe ich verstanden, wie sich Variablenwerte während der Programmausführung verändern und wie man Fehler systematisch eingrenzt.  

### Wiederholung

**Fachbegriff:** Breakpoint  
**Erklärung:**  
Ein Breakpoint ist ein Haltepunkt im Quellcode, an dem der Debugger die Programmausführung anhält, sodass man den aktuellen Zustand (z. B. Variablenwerte, Call Stack) inspizieren kann. So lassen sich Fehlerursachen leichter nachvollziehen.

## Woche 2025-05-12
- Datum der Vorlesung: 2025-05-12  
- Halten Sie sich an dieses Muster damit der Eintrag von meinen Scripten gefunden werden kann!

### Lernziel

- Die Rolle von Git als verteiltes Versionskontrollsystem nachvollziehen  
- Unterschiede zwischen zentralisierten und verteilten SCM-Ansätzen charakterisieren  
- Die Maxime „Commit early, commit often“ in der eigenen Praxis umsetzen  
- Verschiedene Branch-Typen (Feature, Develop, Release, Hotfix) und ihren Einsatz kennenlernen  
- Merge- und Rebase-Workflows verstehen und ihre Vor- und Nachteile abwägen  
- Praktische Handgriffe mit Staging Area, Branch-Befehlen und Reset in einer Java-IDE üben  

### Erkenntnis

Mir wurde deutlich, wie Git durch klar definierte Branch-Strukturen Teamarbeit erleichtert: Jeder Entwickler kann in seinem Feature-Branch isoliert arbeiten, während der Develop-Branch stets stabil bleibt. Besonders interessant fand ich, dass ein Rebase die Historie aufräumt und lineare Abläufe erzeugt, allerdings an Transparenz einbüßt. Die Merge-Übung hat mir gezeigt, wie wichtig saubere Konfliktlösungen sind, um den Projektverlauf nachvollziehbar zu halten.

### Wiederholung

**Begriff:** Rebase  
**Erklärung in eigenen Worten:**  
Beim Rebase „versetze“ ich die Commits meines aktuellen Branches auf einen anderen Zweig. Das ordnet alle Änderungen hintereinander in einer geraden Linie an und erzeugt so eine übersichtliche Historie. Konflikte, die dabei auftreten, bearbeite ich Commit für Commit, was eine präzise Kontrolle jeder Änderung ermöglicht.  

## Woche 2025-05-19
- Datum der Vorlesung: 2025-05-19  
- Halten Sie sich an dieses Muster damit der Eintrag von meinen Scripten gefunden werden kann!

### Lernziel

- Einrichtung und Initialisierung eines bare Repositories für Remote-Zwecke  
- Konfiguration und Nutzung von `origin` als Datei-basiertes Remote-Repository  
- Unterschied zwischen einfachem Push und `--mirror` beim Aktualisieren aller Referenzen  
- Einrichten von Upstream/Tracking für Branches und Auswirkungen auf `git push` und `git status`  
- Verhalten und Risiko von `git push --force` vs. `--force-with-lease` verstehen  
- Klonen eines Remote-Repositories und Synchronisation mit `pull` und `fetch`  
- Umgang mit Fork-Workflows: Hinzufügen eines weiteren Remotes (`upstream`) und Unterscheidung zu `origin`  

### Erkenntnis

Die Übung hat mir verdeutlicht, dass ein bare Repository die zentrale Rolle eines Servers übernimmt, ohne Arbeitskopie, und dass man durch die gesicherte Historie jederzeit feststellen kann, welche Commits aktuell sind. Der Unterschied zwischen `--force` und `--force-with-lease` ist essenziell: Letzteres schützt vor versehentlichem Überschreiben von fremden Änderungen, indem es vor dem Push prüft, ob das Remote-Repository seit dem letzten Fetch verändert wurde.

### Wiederholung

**Begriff:** bare Repository  
**Erklärung:**  
Ein bare Repository ist eine Git-Struktur ohne Arbeitsverzeichnis, die ausschließlich die Git-Daten (Objekte und Referenzen) enthält. Es dient als zentrales Remote, auf das Entwickler ihre lokalen Repositories pushen und von dem sie pullen. Da keine Arbeitskopie existiert, kann man im bare Repository nicht direkt editieren oder bauen — es ist rein für den Datenaustausch konzipiert.  
