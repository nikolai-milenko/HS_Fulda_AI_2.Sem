# Konspekt: Software-Engineering

## 1. Ursachen für Softwarefehler

### 1.1 Steigende Anforderungen

Neue Technologien ermöglichen komplexere Systeme. Dadurch steigen auch die Anforderungen:

- Systeme müssen schneller entwickelt, leistungsfähiger und komplexer werden.
- Die bisherigen SE-Methoden reichen dafür oft nicht aus – neue Techniken sind nötig.

### 1.2 Geringe Erwartungen

Viele Programme werden ohne Anwendung von SE-Methoden geschrieben. Firmen, die Software neu integrieren, nutzen SE-Methoden im Alltag kaum.

- Folge: teure und unzuverlässige Software.
- Lösung: bessere Ausbildung im Bereich SE.

## 2. Geschichte des Software-Engineerings

Der Begriff **„Software-Engineering“** wurde 1968 auf einer Konferenz geprägt, die sich mit der „Softwarekrise“ beschäftigte.

Damals zeigte sich, dass individuelle Programmieransätze für große Systeme ungeeignet waren:

- Unzuverlässig
- Teuer
- Verspätet

In den 1970er und 1980er Jahren entstanden neue Techniken:

- Strukturierte Programmierung
- Datenkapselung (Information Hiding)
- Objektorientierte Entwicklung

Werkzeuge und Notationen wurden entwickelt und sind heute weit verbreitet.

## 3. Fragen & Antworten zum Software-Engineering

**Was ist Software?**  
→ Computerprogramme und zugehörige Dokumentation für Kunden oder den Markt.

**Eigenschaften guter Software:**  
→ Funktional, performant, wartbar, zuverlässig und nützlich.

**Was versteht man unter Software-Engineering?**  
→ Technische Disziplin für alle Aspekte der Softwareherstellung.

**Grundlegende Aktivitäten:**  
→ Softwarespezifikation, -entwicklung, -validierung, -weiterentwicklung.

**Unterschied zur Informatik:**  
→ Informatik = Theorie, SE = Praxis und nutzbare Software.

**Unterschied zu Systems Engineering:**  
→ Systems Engineering = Hard-, Soft- und Prozessentwicklung.  
→ Software-Engineering ist ein Teil davon.

**Größte Herausforderungen:**  
→ Vielfältige Anforderungen, kurze Lieferzeiten, zuverlässige Softwareentwicklung.

## 4. Was gehört zur Software im SE?

Neben Programmen auch:

- zugehörige Dokumentation
- Konfigurationsdaten

**Professionelle Software umfasst:**

- mehrere Programme und Konfigurationsdateien
- System- und Benutzerdokumentation
- Update-Websites

**Unterschiede:**

- *Amateurhafte Entwicklung:* keine Doku, nur für Eigengebrauch  
- *Professionelle Entwicklung:* Doku & Quellcode erforderlich

## 5. Qualitätsmerkmale professioneller Software

Nicht nur Funktion, sondern auch:

- Verhalten
- Struktur
- Dokumentation

### 5.1 Nicht-funktionale Merkmale

- Antwortzeit
- Verständlichkeit des Codes

### 5.2 Anwendungsspezifisch

- Bank: Sicherheit
- Spiel: Reaktionsfähigkeit
- Vermittlungssystem: Zuverlässigkeit

### 5.3 Allgemeine Merkmale

- **Wartbarkeit:** leicht anpassbar
- **Verlässlichkeit & Sicherheit:** zuverlässig, bei Ausfall keine Schäden
- **Effizienz:** Ressourcenschonung (Antwortzeit, Speicherverbrauch)
- **Akzeptanz:** verständlich, nützlich, integrierbar

## 6. Definition von Software-Engineering

Technische Disziplin für alle Phasen der Softwareentwicklung — von der Spezifikation bis zur Wartung.

### 6.1 Zwei Schlüsselbegriffe

**Technische Disziplin:**  
Einsatz von Theorien, Methoden und Werkzeugen unter realistischen Bedingungen.

**Alle Aspekte der Softwareherstellung:**  
Nicht nur Technik, sondern auch Projektmanagement, Methoden- und Prozessentwicklung.

**Ziel:** Qualität, Zeit und Budget einhalten.

## 7. Softwareprozess

Systematischer Ansatz mit vier Kernaktivitäten:

1. **Softwarespezifikation** – Anforderungen definieren  
2. **Softwareentwicklung** – Entwurf und Implementierung  
3. **Softwarevalidierung** – Prüfung der Anforderungen  
4. **Softwareevolution** – Weiterentwicklung nach Bedarf  

*Hinweis:* Verschiedene Softwaretypen → unterschiedliche Prozesse.

## 8. Herausforderungen moderner Software

- **Heterogenität:** Unterschiedliche Plattformen, Geräte und Netzwerke  
- **Wandel:** Wirtschaft und Gesellschaft ändern sich schnell  
- **Sicherheit & Vertrauen:** Schutz bei verteilten Systemen und Benutzersicherheit  

## 9. Anwendungstypen

- **Eigenständige Anwendungen:** lokal, ohne Netzwerk (z. B. Office, CAD)  
- **Interaktive transaktionsbasierte Anwendungen:** client-server, web-basiert  
- **Eingebettete Steuerungssysteme:** Geräte wie Auto oder Haushalt  
- **Stapelverarbeitungssysteme:** Massendaten (z. B. Gehaltsabrechnung)  
- **Unterhaltungssysteme:** Spiele, Streaming etc.  
- **Simulation/Modellierungssysteme:** wissenschaftlich-technische Nutzung  
- **Datenerfassungssysteme:** Sensorik in rauer Umgebung  
- **Systeme von Systemen:** Integration mehrerer Teilsysteme  

## 10. Ethische Prinzipien (ACM/IEEE)

Softwareentwickler sollen Analyse, Entwurf, Test und Wartung verantwortungsvoll betreiben.

**8 Prinzipien:**

1. **Öffentlichkeit** – im öffentlichen Interesse handeln  
2. **Kunde & Arbeitgeber** – Loyalität im Rahmen des Gemeinwohls  
3. **Produkt** – höchste professionelle Standards  
4. **Beurteilung** – Integrität und Unabhängigkeit  
5. **Management** – ethisch verantwortliches Projektmanagement  
6. **Beruf** – Integrität und Ansehen fördern  
7. **Kollegen** – fairer und hilfsbereiter Umgang  
8. **Selbst** – lebenslanges Lernen und ethisches Vorbild  

## 11. Fallstudien

### 11.1 Eingebettetes System

- Software zur Steuerung eines Geräts (z. B. medizinische Pumpe)  

### 11.2 Informationssystem

- Verwaltung sensibler Patientendaten (Sicherheit, Datenschutz, Benutzerfreundlichkeit)  

## 12. Vorgehensmodelle

### 12.1 Definition

Ein Vorgehensmodell ist eine vereinfachte Darstellung eines Softwareprozesses.  

### 12.2 Wasserfallmodell

Lineare Phasen:

1. Anforderungsdefinition  
2. System- und Softwareentwurf  
3. Implementierung und Modultests  
4. Integration und Systemtests  
5. Betrieb und Wartung  

### 12.3 Inkrementelle Entwicklung

- Entwicklung in mehreren Versionen (Inkrementen)  
- Kombination aus Spezifikation, Entwicklung und Validierung  

### 12.4 Wiederverwendungsorientiertes SE

- Nutzung vorhandener Komponenten  
- Fokus auf Integration statt Neuentwicklung  

### 12.5 Modellkombination

- Wasserfallmodell für stabile Teile  
- Inkrementell für unklare oder UI-bezogene Teile  

> **Hinweis:** Modelle lassen sich kombinieren – besonders bei großen Systemen sinnvoll.  

### 12.6 Praxis und Probleme des Wasserfallmodells

- **Phasenüberlappung:** Informationsaustausch zwischen Phasen führt zu Rückkopplungen.  
- **Hohe Dokumentationskosten:** Phasen werden schnell „eingefroren“.  
- **Risiko des verfrühten Einfrierens:** Anforderungen zu früh fixiert.  
- **Problemumgehung:** Entwurfsfehler werden durch „Tricks“ im Code gelöst.  
- **Betrieb und Wartung:** Weitere Fehler und Bedarf an neuer Funktionalität.  

### 13.1 Inkrementelle Entwicklung (detailliert)

1. Erstellung einer Anfangsversion  
2. Feedback der Benutzer  
3. Zwischenversionen und iterative Verbesserungen  
4. Endversion erfüllt Anforderungen  

**Vorteile:**  

- Reduzierte Kosten für Änderungen  
- Schnellere Rückmeldung  
- Frühzeitige Auslieferung  

**Nachteile:**  

- Geringe Prozesssichtbarkeit  
- Schwächere Systemstruktur bei häufiger Änderung  
- Koordinationsaufwand in großen Systemen  
- Inkrementelle Auslieferung kann Geschäftsprozesse stören  
- Bürokratische Organisationen erschweren Iteration  

### 13.2 Wiederverwendungsorientierter Prozess (Stufen)

1. Analyse vorhandener Komponenten  
2. Anpassung der Anforderungen  
3. Systementwurf mit Wiederverwendung  
4. Entwicklung und Integration  

**Komponentenarten:**  

- Webdienste  
- Objektsammlungen (Pakete)  
- Eigenständige Systeme (z. B. COTS)  

**Vorteile:**  

- Reduzierung von Aufwand, Kosten und Risiken  
- Schnellere Lieferung  

**Nachteile:**  

- Kompromisse bei Anforderungen  
- Verlust der Kontrolle über Komponenten  

### 13.3 V-Modell

Vorgehensmodell für IT-Projekte der öffentlichen Verwaltung in Deutschland.

Phasen:

1. Definition der Anforderungen  
2. Funktionales Systemdesign  
3. Technisches Systemdesign  
4. Spezifikation der Komponenten  
5. Implementierung  
6. Komponententest  
7. Integrationstest  
8. Systemtest  
9. Akzeptanz
