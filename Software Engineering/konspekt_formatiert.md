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

#### CASE-Werkzeuge: Programme zur Unterstützung von Softwareprozessen.

Beispiele für automatisierte Aktivitäten:

- grafische Systemmodelle entwickeln,

- Code aus Modellen erzeugen,

- Benutzeroberflächen grafisch erzeugen,

- Fehlerbehebung durch Debugging,

- automatische Übersetzung alter Programmiersprachenversionen.

### Softwarespezifikation – Zusammenfassung
Ziel: Funktionen und Einschränkungen des Systems verstehen und definieren.

Kritische Phase – Fehler führen später zu Problemen.

Ergebnis: gemeinsames Anforderungsdokument.

Zwei Ebenen:

- grobe Anforderungen für Nutzer/Kunden,
- detaillierte Spezifikation für Entwickler.

### Ablauf der Anforderungsanalyse – Übersicht
Vier Hauptaktivitäten:

1. Durchführbarkeitsstudie: Machbarkeit, Wirtschaftlichkeit und Budget prüfen.

2. Erhebung und Analyse der Anforderungen

3. Spezifikation der Anforderungen

4. Validierung der Anforderungen

#### Ergebnisse:

- Durchführbarkeitsbericht

- Systemmodelle

- Benutzer- und Systemanforderungen

- Anforderungsspezifikation

Entwurf = iterativer Prozess mit Rückmeldungen und Korrekturen.

Phasen sind nicht strikt linear, sondern stark verknüpft.

#### Plattform und Systemtyp im Entwurfsprozess
Software hat Schnittstellen zu:

- Betriebssystemen,

- Datenbanken,

- Middleware usw.

→ Softwareplattform = Ausführungsumgebung.

Plattforminfos = wichtige Eingabe im Entwurf.

Spezifikation umfasst:

- Funktionalität,

- Performance- & Verlässlichkeitsanforderungen,

- Datenbeschreibung (sofern relevant).

Systemtyp beeinflusst Entwurf:

Echtzeitsysteme → Zeitverhalten wichtig.

Kein DB-Zugriff → kein Datenbankentwurf nötig.

## 📌 V-Modell – Testphasen im plangesteuerten Softwareprozess

Plangesteuerte Softwareprozesse (z. B. für sicherheitskritische Systeme) koppeln **jede Entwicklungsphase mit einem passenden Testplan**.

Das V-Modell zeigt:
- Links: **Spezifikation & Entwurf**
- Rechts: **zugehörige Testphasen**
- Mitte: **Implementierung**

### 🔄 Übersicht – Entwicklungsphasen und zugehörige Tests

| Entwicklungsphase              | Testplan                           | Testphase                     |
|-------------------------------|------------------------------------|-------------------------------|
| Anforderungsspezifikation     | Plan für Abnahmetest               | **Abnahmetest**               |
| Systemspezifikation           | Plan für Systemintegrationstest    | **Systemintegrationstest**    |
| Systementwurf                 | Plan für Subsystemintegrationstest | **Subsystemintegrationstest** |
| Detailentwurf → Programmierung| Modulprogrammierung und -test      | **Komponententest**           |

### 🧠 Merkmale

- Testpläne werden **bereits während der Entwicklung** erstellt.
- Tests basieren **direkt auf Anforderungen & Entwürfen**.
- Besonders relevant für **verlässliche, nachvollziehbare Prozesse**.
- Wird oft als **„V-Modell“** bezeichnet (wegen des visuellen Ablaufs).

## 🧪 Abnahme- & Betatest

- **Abnahmetest = Alphatest**  
  Wird bei individuell entwickelten Systemen durchgeführt, bis Entwickler und Kunde die Umsetzung für akzeptabel halten.

- **Betatest = Realer Nutzertest**  
  Vor Marktfreigabe testen zukünftige Kunden die Software freiwillig im Alltag.
  - Ziel: Probleme entdecken, die Entwickler **nicht vorhersehen konnten**.
  - Rückmeldung → System wird angepasst
  - Danach: neue Betaphase oder Freigabe für Verkauf

---

## 🔄 2.2.4 Weiterentwicklung von Software

### 💡 Warum Software leichter weiterentwickelt wird als Hardware:

- Software ist **flexibler**:
  - Änderungen **während & nach** der Entwicklung jederzeit möglich
  - Selbst große Änderungen günstiger als bei Hardware

### 🕰️ Früher:
- **Trennung** zwischen Entwicklung & Wartung („Softwarewartung“)

### 🔁 Heute:
- Weiterentwicklung ist **kontinuierlich integriert**  
  → Software wird **von Anfang an** so geplant, dass Änderungen einfach möglich sind  
  → kein starres Konzept, sondern **iteratives Anpassen**

Ein Prototyp ist keineerste Version eines Softwaresystems. Er ist in der Regel nur begrenzt ablauffähig und soll nur die Konzepte demonstrieren.

## 🧪 2.3.1 Softwareprototypen

Ein **Prototyp** ist eine erste Version eines Softwaresystems, die genutzt wird, um:

- Konzepte zu demonstrieren
- Entwurfsideen zu testen
- Anforderungen zu klären
- frühzeitig Feedback einzuholen

### ✅ Einsatzbereiche:

1. **Requirements Engineering**  
   → zur Ermittlung und Validierung der Systemanforderungen

2. **Systementwurf**  
   → zur Analyse von Softwarelösungen und zur Unterstützung des UI-Designs

### 🎯 Vorteile:

- Benutzer erkennen früh, wie hilfreich das System ist
- neue Anforderungen und Ideen entstehen
- Schwächen und Stärken im Design werden sichtbar
- vergessene Anforderungen können entdeckt werden
- hilft, teures Rework später zu vermeiden

## 🧪 Weitere Vorteile von Prototypen

- Prototypen helfen nicht nur bei Anforderungen,  
  sondern auch beim **Vergleich von Entwurfsalternativen** und der **Machbarkeitsanalyse**.

- Beispiel: Prototyp zur Prüfung von **Datenzugriffseffizienz**

### 🖥️ Benutzeroberfläche:

- Besonders nützlich beim UI-Design
- Textbeschreibungen reichen nicht aus
- → **Rapid Prototyping** mit Einbeziehung der Endnutzer ist Pflicht

---

## 🎯 Ziele der Prototypenentwicklung

- **Ziele müssen zu Beginn klar sein**, z. B.:
  - Erprobung der UI
  - Bewertung funktionaler Anforderungen
  - Demonstration für Stakeholder

- Wenn Ziele unklar → Missverständnisse & Enttäuschung bei Stakeholdern

📌 Ein Prototyp erfüllt **nicht automatisch alle Erwartungen** – klare Zieldefinition ist entscheidend!

## 🔄 2.3.1 Der Vorgang der Prototypentwicklung (Abbildung 2.9)

### 🧭 Schritte:

1. **Prototypziele festlegen**  
   → Warum wird der Prototyp entwickelt?

2. **Prototypfunktionalität definieren**  
   → Welche Funktionen sind enthalten? Was wird bewusst ausgelassen?

3. **Prototyp entwickeln**  
   → Erstellung eines ausführbaren Prototyps

4. **Prototyp auswerten**  
   → Test mit Nutzern, Auswertungsbericht erstellen

---

### ✂️ Was kann weggelassen werden?

- Nichtfunktionale Anforderungen (z. B. Reaktionszeit, Speicher)
- Fehlerbehandlung
- Anforderungen an Zuverlässigkeit und Qualität

→ Ziel: Kosten und Aufwand bei der Prototypentwicklung senken

---

### 📊 Letzte Phase: Bewertung & Erprobung

- **Benutzerschulung notwendig**
- **Bewertungsplan erstellen**
- Benutzer testen System → Feedback führt zur Anpassung von Anforderungen

## ⚠️ Risiken bei der Verwendung von Prototypen als fertiges System

### Hauptproblem:
Ein **Prototyp wird oft anders verwendet** als das fertige System:
- andere Nutzergruppen
- wenig Einarbeitungszeit
- Verhaltensanpassung an langsam reagierende Prototypen

---

### ❌ Warum die Auslieferung von Prototypen problematisch ist:

1️⃣ **Keine Berücksichtigung nichtfunktionaler Anforderungen**  
→ Leistung, Sicherheit, Stabilität & Zuverlässigkeit wurden beim Prototyping vernachlässigt

2️⃣ **Kaum Dokumentation & Architektur**  
→ Änderungen fließen direkt in den Prototypcode  
→ Code = einzige "Spezifikation" → schlecht für Wartung

3️⃣ **Strukturelle Verschlechterung**  
→ Änderungen während der Prototypentwicklung verschlechtern die Systemstruktur  
→ spätere Wartung = teuer & kompliziert

## 📝 Nicht-ausführbare Prototypen

- Prototypen müssen nicht lauffähig sein
- Papiermodelle der UI helfen beim Feedback & Design
- 💡 **Wizard-of-Oz-Prototyp**:
  - UI ist echt, aber Eingaben werden manuell von einer Person beantwortet
  - Nutzer merkt nichts – ideal zum Testen von UI-Ideen ohne funktionales Backend

---

## 2.3.2 🔁 Inkrementelle Auslieferung

- Ein Ansatz, bei dem das System **stückweise** (inkrementell) ausgeliefert wird
- Kunde entscheidet:
  - Was ist wichtig?
  - Was kann warten?
- → Jedes Inkrement = ein Teilsystem / Dienst

📌 Dienste mit **höchster Priorität** → zuerst implementiert & ausgeliefert

## 🔁 Abbildung 2.10 – Inkrementelle Auslieferung

### 📌 Ablauf:

1. Grobe Definition der Anforderungen
2. Zuordnung der Anforderungen zu Inkrementen
3. Entwurf der Systemarchitektur
4. Entwicklung eines Systeminkrements
5. Validierung des Inkrements
6. Integration des Inkrements
7. Validierung des Systems
8. Installation des Inkrements

🔄 Wenn nicht vollständig → nächstes Inkrement  
✅ Wenn vollständig → fertiges System

---

### ✅ Vorteile:

- Frühe Nutzung von Teilsystemen durch den Kunden
- Feedback kann direkt in spätere Inkremente einfließen
- System wird kontinuierlich verbessert
- Anforderungen können während der Entwicklung präzisiert werden
- Integration neuer Inkremente verbessert schrittweise die Gesamtlösung

## ⚠️ Probleme bei der inkrementellen Entwicklung

1️⃣ **Verteilte Kernfunktionen**  
→ Viele Basisfunktionen werden von mehreren Systemteilen genutzt  
→ Ohne vollständige Anforderungen ist es schwer, sinnvolle Inkremente zu planen

2️⃣ **Nutzererwartung: Alles oder nichts**  
→ Bei Ersatzsystemen wollen Nutzer die volle Funktionalität des alten Systems  
→ Unvollständige Systeme werden schlecht akzeptiert → kaum Feedback

3️⃣ **Spezifikation vs. Vertragslogik**  
→ In vielen Unternehmen ist die vollständige Spezifikation Teil des Vertrags  
→ Inkrementelle Entwicklung widerspricht diesem Modell  
→ Besonders kritisch bei Großkunden (z. B. Behörden)

---

📌 Fazit: Nicht jedes Projekt eignet sich für inkrementelle Entwicklung  
→ z. B. bei Hardwarekopplung, sicherheitskritischen Systemen oder fixen Verträgen

## 🌀 2.3.3 Das Spiralmodell nach Boehm

- Vorgeschlagen von Barry Boehm (1988)
- Darstellung: **Spirale statt linearer Abfolge**
- Jede **Spiralschleife = eine Entwicklungsphase**

### 🔁 Beispiel für Schleifen:

- Innerste: Machbarkeit analysieren
- Danach: Anforderungen definieren
- Weiter außen: Entwurf, Implementierung, Validierung usw.

---

### ✅ Vorteile des Spiralmodells:

- Kombination aus:
  - **Vermeidung von Änderungen** (Planung)
  - **Toleranz für Änderungen** (Anpassbarkeit)
- Fokus auf **Risiken**
  - Jede Phase beinhaltet **Risikomanagementaktivitäten**
  - Änderungen gelten als **Folge von Risiken**, nicht als Störung

📌 Besonders geeignet für komplexe, risikoreiche Projekte mit vielen Unbekannten.

## 🔍 Hauptunterschied des Spiralmodells: Risikobetrachtung

- Jeder Spiralzyklus beginnt mit der **Festlegung von Zielen**
- Danach:
  - Alternativen zur Zielerreichung definieren
  - Beschränkungen & Risiken identifizieren
  - Alternativen bewerten

📌 Methoden zur Risikoanalyse:
- Detaillierte Analysen
- Prototypen
- Simulationen

---

## 🧠 Was ist ein Risiko?

→ Etwas, das schiefgehen kann  
Beispiel: neue Sprache → Compiler sind instabil oder ineffizient

---

## 📌 Ablauf:

1. Risiken bewerten
2. Ein Stück Software entwickeln
3. Nächste Phase planen (mit neuem Risikobewusstsein)

---

## 🎯 Ziel:

- Risiken reduzieren
- Änderungen frühzeitig erkennen & absichern
- Projektprobleme (Kosten, Zeit, Qualität) minimieren

📚 → Mehr dazu in Kapitel 22 (Risikomanagement im Projekt)

## 2.4 Der Rational Unified Process (RUP)

### 🔧 Was ist RUP?

- Modernes, hybrides Vorgehensmodell
- Entstanden aus der Arbeit an UML & Unified Software Development Process
- Kombiniert:
  - klassische Modelle (z. B. Wasserfall, Spiralmodell)
  - Prototyping
  - inkrementelle Auslieferung

---

## 🔭 RUP = 3 Perspektiven

1️⃣ **Dynamische Perspektive**  
→ zeitliche Darstellung der Projektphasen

2️⃣ **Statische Perspektive**  
→ zeigt alle Prozessaktivitäten

3️⃣ **Praxisbezogene Perspektive**  
→ gibt konkrete methodische Empfehlungen pro Prozessphase

---

📌 Hinweis:  
Viele Quellen vermischen Perspektiven → unübersichtlich.  
Hier werden sie **separat beschrieben**, um Klarheit zu schaffen.

## 🔍 Darstellung der RUP-Perspektiven

- Üblicherweise: alle Perspektiven in einer Diagrammform vereint
- Kritik: erschwert das Verständnis
- Lösung: getrennte Beschreibung von:
  - dynamischer
  - statischer
  - praxisbezogener Perspektive

---

## 📌 Phasenorientiertes Modell

- RUP unterscheidet **vier Phasen**
- Anders als beim Wasserfall:
  - Phasen ≠ Prozessaktivitäten
  - Phasen sind **geschäftsorientiert** (Business-Fokus)

📊 → Abbildung 2.12 zeigt die RUP-Phasen

## 🔄 Die vier Phasen des RUP

1️⃣ **Konzeption**
- Ziel: Business-Case erstellen
- Externe Akteure & Interaktionen definieren
- Beitrag des Systems bewerten
- ❗ Projekt kann hier abgebrochen werden

2️⃣ **Entwurf**
- Problem verstehen & Architektur planen
- Risiken identifizieren
- Ergebnis: UML-Modelle, Architektur, Entwicklungsplan

3️⃣ **Konstruktion**
- Programmierung & Tests (parallel & inkrementell)
- Am Ende: funktionsfähige Software mit Dokumentation

4️⃣ **Übergabe**
- Übergabe an reale Benutzerumgebung
- Schulung, Einführung, Support
- Oft unterschätzt, aber teuer & kritisch

## 🔧 Praxisbezogene Perspektive im RUP – empfohlene Vorgehensweisen (Teil 1)

1️⃣ **Software iterativ entwickeln**  
→ Schrittweise Entwicklung nach Kundenprioritäten  
→ Funktionen mit höchster Priorität frühzeitig umsetzen

2️⃣ **Anforderungen verwalten**  
→ Klare Dokumentation der Anforderungen  
→ Nachverfolgbarkeit von Änderungen  
→ Analyse der Auswirkungen vor Umsetzung

3️⃣ **Komponentenbasierte Architekturen verwenden**  
→ Architektur in wiederverwendbare Komponenten aufteilen  
→ Erleichtert Wartung, Skalierung und parallele Entwicklung

## 🔧 Praxisbezogene Perspektive im RUP – empfohlene Vorgehensweisen (Teil 2)

4️⃣ **Software visuell modellieren**  
→ Einsatz von UML zur Darstellung statischer & dynamischer Aspekte

5️⃣ **Softwarequalität verifizieren**  
→ Sicherstellen, dass Qualitätsstandards des Unternehmens erfüllt werden

6️⃣ **Änderungen der Software steuern**  
→ Verwaltung von Änderungen mit:
  - Änderungsmanagementsystem
  - Konfigurationsmanagement
  - passender Tool-Unterstützung

---

## 📌 Fazit:

- RUP ist **nicht für alle Projekte geeignet** (z. B. eingebettete Systeme)
- Kombiniert:
  - **Phasen (dynamisch)**
  - **Arbeitsabläufe (statisch)**
  - **Best Practices (praxisbezogen)**
- Trennung von Phase ≠ Aktivität:  
  Aktivitäten können phasenübergreifend genutzt werden

