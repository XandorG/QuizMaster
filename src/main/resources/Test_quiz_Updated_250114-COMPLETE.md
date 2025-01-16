# 1. Introduktion till kursen och kodkvalitet

1. Vad är huvudsyftet med att tillämpa Clean Code-principer?

A) Att göra koden estetiskt tilltalande
B) Att öka kodens prestanda
C) Att göra koden lättare att underhålla och förstå
D) Att minimera antalet rader kod

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Estetik är inte huvudsyftet, även om läsbarhet är viktigt
B) Fel - Prestanda är inte huvudfokus för Clean Code
C) Rätt - Clean Code syftar främst till att göra koden mer underhållbar och förståelig
D) Fel - Att minimera antalet rader är inte ett huvudsyfte med Clean Code
```

</details>

---

2. Vilken av följande är INTE en av de grundläggande principerna för kodkvalitet enligt materialet?

A) Läsbarhet
B) Underhållbarhet
C) Komplexitet
D) Testbarhet

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Läsbarhet är en grundläggande princip för kodkvalitet
B) Fel - Underhållbarhet är en grundläggande princip för kodkvalitet
C) Rätt - Komplexitet nämns inte som en grundläggande princip i materialet
D) Fel - Testbarhet är en grundläggande princip för kodkvalitet
```

</details>

---

3. Vad står "DRY" för i kontexten av Clean Code?

A) Do Repeat Yourself
B) Don't Repeat Yourself
C) Debug Responsibly Yourself
D) Design Robustly Yourself

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Detta är motsatsen till den korrekta betydelsen
B) Rätt - DRY står för "Don't Repeat Yourself", vilket är en viktig princip i Clean Code
C) Fel - Detta är inte betydelsen av DRY i Clean Code-sammanhang
D) Fel - Detta är inte betydelsen av DRY i Clean Code-sammanhang
```

</details>

---

4. Vilken av följande är INTE en rekommenderad praxis för att uppnå hög kodkvalitet enligt materialet?

A) Skriva tester för all funktionalitet
B) Hålla metoder korta
C) Använda så många kommentarer som möjligt
D) Använda beskrivande namn för variabler och metoder

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Att skriva tester för all funktionalitet är en rekommenderad praxis
B) Fel - Att hålla metoder korta är en rekommenderad praxis
C) Rätt - Överdriven användning av kommentarer rekommenderas inte, koden bör vara självförklarande
D) Fel - Att använda beskrivande namn är en rekommenderad praxis
```

</details>

---

5. Vad är huvudsyftet med att använda JUnit5 i samband med kodkvalitet?

A) Att automatisera kodgenerering
B) Att mäta kodens prestanda
C) Att skriva och köra enhetstester
D) Att analysera kodens komplexitet

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - JUnit5 används inte primärt för kodgenerering
B) Fel - Även om tester kan påverka prestanda, är det inte huvudsyftet med JUnit5
C) Rätt - JUnit5 är ett ramverk för att skriva och köra enhetstester
D) Fel - JUnit5 analyserar inte kodens komplexitet direkt
```

</details>

---

6. Vad är ett av huvudsyftena med Clean Code?

A) Att göra koden så komplex som möjligt
B) Att minska tiden som krävs för att förstå och modifiera kod
C) Att maximera antalet rader kod i varje funktion
D) Att eliminera behovet av kommentarer helt och hållet

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Clean Code strävar efter enkelhet, inte komplexitet
B) Rätt - Detta är ett av huvudsyftena med Clean Code enligt materialet
C) Fel - Clean Code förespråkar små, fokuserade funktioner
D) Fel - Clean Code minskar behovet av kommentarer men eliminerar dem inte helt
```

</details>

---

7. Vilken av följande är INTE en av grundprinciperna för Clean Code?

A) Läsbarhet
B) Enkelhet
C) DRY (Don't Repeat Yourself)
D) Maximal användning av globala variabler

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Läsbarhet är en grundprincip för Clean Code
B) Fel - Enkelhet är en grundprincip för Clean Code
C) Fel - DRY är en grundprincip för Clean Code
D) Rätt - Maximal användning av globala variabler är INTE en princip för Clean Code
```

</details>

---

8. Vad innebär "Single Responsibility Principle" inom Clean Code?

A) Varje funktion ska ha minst 100 rader kod
B) Alla klasser ska ärva från en gemensam basklass
C) Varje funktion eller klass bör ha ett enda, väldefinierat ansvarsområde
D) Alla metoder i en klass måste returnera samma datatyp

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Detta motsäger principen om små, fokuserade funktioner
B) Fel - Detta relaterar inte till Single Responsibility Principle
C) Rätt - Detta är definitionen av Single Responsibility Principle enligt materialet
D) Fel - Detta har inget att göra med Single Responsibility Principle
```

</details>

---

9. Vilken av följande är en vanlig missuppfattning om Clean Code?

A) Clean Code tar för lång tid att skriva
B) Clean Code är endast användbart i små projekt
C) Clean Code kräver omfattande dokumentation
D) Clean Code eliminerar behovet av testning

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Rätt - Detta nämns som en vanlig missuppfattning i materialet
B) Fel - Materialet anger att Clean Code är värdefullt för projekt av alla storlekar
C) Fel - Clean Code strävar efter självdokumenterande kod, inte omfattande dokumentation
D) Fel - Detta nämns inte som en missuppfattning och motsäger vikten av testning i Clean Code
```

</details>

---

10. Hur kan Clean Code bidra till ökad säkerhet i mjukvara?

A) Genom att göra all kod privat och otillgänglig
B) Genom tydlig felhantering och korrekt loggning av undantag
C) Genom att undvika all form av felhantering
D) Genom att alltid använda den senaste teknologin oavsett behov

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Detta är inte en princip inom Clean Code och skulle göra koden oanvändbar
B) Rätt - Materialet nämner detta som ett sätt Clean Code kan bidra till ökad säkerhet
C) Fel - God felhantering är en viktig del av Clean Code
D) Fel - Clean Code handlar om att välja rätt verktyg för uppgiften, inte alltid det senaste
```

</details>

11. Vad är ett huvudsyfte med att använda JUnit5 i Java-utveckling?

A) Att förbättra prestandan i Java-applikationer
B) Att automatiskt generera dokumentation för koden
C) Att hitta och förebygga buggar tidigt i utvecklingsprocessen
D) Att ersätta manuell kodgranskning

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - JUnit5 syftar inte primärt till att förbättra prestanda
B) Fel - Även om tester kan fungera som dokumentation är det inte huvudsyftet
C) Rätt - Detta är ett av huvudsyftena med JUnit5 enligt materialet
D) Fel - JUnit5 ersätter inte manuell kodgranskning, utan kompletterar den
```

</details>

---

12. Vilken annotation används i JUnit5 för att markera en metod som en testmetod?

A) @TestMethod
B) @Test
C) @JUnitTest
D) @RunTest

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Detta är inte en giltig JUnit5-annotation
B) Rätt - @Test används för att markera testmetoder i JUnit5
C) Fel - Detta är inte en giltig JUnit5-annotation
D) Fel - Detta är inte en giltig JUnit5-annotation
```

</details>

---

13. Vilken JUnit5-annotation används för att köra kod före varje enskilt test i en testklass?

A) @BeforeAll
B) @BeforeEach
C) @Before
D) @SetUp

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - @BeforeAll körs en gång före alla tester i klassen
B) Rätt - @BeforeEach körs före varje enskilt test
C) Fel - @Before är en JUnit4-annotation, inte JUnit5
D) Fel - Detta är inte en giltig JUnit5-annotation
```

</details>

---

14. Vad är syftet med parametriserade tester i JUnit5?

A) Att förbättra testprestandan
B) Att köra samma test med olika indata
C) Att gruppera relaterade tester
D) Att testa privata metoder

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Parametriserade tester syftar inte primärt till att förbättra prestanda
B) Rätt - Parametriserade tester används för att köra samma test med olika indata
C) Fel - Gruppering av tester görs med andra tekniker, som @Nested
D) Fel - Parametriserade tester används inte specifikt för att testa privata metoder
```

</details>

---

15. Vilken best practice rekommenderas för att skriva effektiva JUnit5-tester?

A) Att alltid sträva efter 100% kodtäckning
B) Att inkludera så många assertions som möjligt i varje test
C) Att fokusera varje test på att verifiera en specifik sak
D) Att alltid använda mocks för alla externa beroenden

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Materialet rekommenderar att fokusera på meningsfull testtäckning snarare än arbiträra mål
B) Fel - Best practice är att ha en assertion per test, inte så många som möjligt
C) Rätt - Detta är en rekommenderad best practice enligt materialet
D) Fel - Mocks bör användas vid behov, inte alltid för alla externa beroenden
```

</details>

---

16. Vad är huvudsyftet med parameteriserade tester i JUnit5?

A) Att förbättra prestandan för testkörningar
B) Att möjliggöra effektiv testning av multipla scenarier med minimal kodupprepning
C) Att ersätta vanliga JUnit-tester
D) Att automatiskt generera testfall

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Prestanda är inte huvudsyftet med parameteriserade tester
B) Rätt - Detta är det primära syftet enligt materialet
C) Fel - De ersätter inte vanliga tester utan kompletterar dem
D) Fel - Automatisk generering av testfall är inte huvudsyftet
```

</details>

---

17. Vilken annotation används för att markera en metod som ett parameteriserat test i JUnit5?

A) @Test
B) @ParameterTest
C) @ParameterizedTest
D) @TestWithParameters

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - @Test används för vanliga JUnit-tester
B) Fel - Detta är inte en giltig JUnit5-annotation
C) Rätt - @ParameterizedTest är korrekt annotation för parameteriserade tester
D) Fel - Detta är inte en giltig JUnit5-annotation
```

</details>

---

18. Vilken av följande är INTE en giltig datakälla för parameteriserade tester i JUnit5?

A) @ValueSource
B) @CsvSource
C) @MethodSource
D) @ListSource

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - @ValueSource är en giltig datakälla
B) Fel - @CsvSource är en giltig datakälla
C) Fel - @MethodSource är en giltig datakälla
D) Rätt - @ListSource är inte en giltig datakälla i JUnit5
```

</details>

---

19. Vad är en fördel med att använda @MethodSource för parameteriserade tester?

A) Det kräver mindre kodning än andra datakällor
B) Det är den enda metoden som stödjer numeriska värden
C) Det möjliggör komplexa datascenarier som kräver beräkningar eller objekt
D) Det är snabbare att exekvera än andra datakällor

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - @MethodSource kan faktiskt kräva mer kodning för komplexa scenarier
B) Fel - Andra datakällor stödjer också numeriska värden
C) Rätt - Detta är en huvudfördel med @MethodSource enligt materialet
D) Fel - Exekveringshastigheten beror på implementationen, inte datakällan
```

</details>

---

20. Vilken teknik kan användas för att skapa ett varierande antal tester baserat på vissa villkor i JUnit5?

A) Statiska testmetoder
B) Dynamisk testgenerering
C) Rekursiva testmetoder
D) Adaptiva testsviter

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Statiska testmetoder skapar inte ett varierande antal tester
B) Rätt - Dynamisk testgenerering möjliggör skapande av tester baserat på villkor
C) Fel - Rekursiva testmetoder är inte en standard JUnit5-funktion
D) Fel - Adaptiva testsviter är inte en standard JUnit5-funktion
```

</details>

---

21. Vad är huvudsyftet med test suites i JUnit5?

A) Att ersätta enskilda testklasser
B) Att förbättra prestandatestning
C) Att organisera och gruppera relaterade tester för effektiv exekvering
D) Att skapa mer komplexa testfall

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Test suites ersätter inte enskilda testklasser utan grupperar dem
B) Fel - Prestandaförbättring är en möjlig effekt men inte huvudsyftet
C) Rätt - Detta är det primära syftet med test suites enligt materialet
D) Fel - Test suites skapar inte mer komplexa testfall, de organiserar befintliga tester
```

</details>

---

22. Vilken annotation används för att markera en klass som en test suite i JUnit5?

A) @TestSuite
B) @RunWith
C) @Suite
D) @IncludeTests

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Detta är inte en giltig JUnit5-annotation för test suites
B) Fel - @RunWith används i JUnit4, inte i JUnit5 för test suites
C) Rätt - @Suite är den korrekta annotationen för att markera en test suite i JUnit5
D) Fel - Detta är inte en giltig JUnit5-annotation för test suites
```

</details>

---

23. Hur kan man inkludera specifika testklasser i en test suite?

A) Genom att använda @IncludeTests annotation
B) Genom att lista klasserna i suite-klassens konstruktor
C) Genom att använda @SelectClasses annotation
D) Genom att använda @RunClasses annotation

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Detta är inte en giltig JUnit5-annotation för att inkludera tester
B) Fel - Test suites i JUnit5 använder inte konstruktorer för att lista klasser
C) Rätt - @SelectClasses används för att specifikt välja testklasser att inkludera i en suite
D) Fel - Detta är inte en giltig JUnit5-annotation
```

</details>

---

24. Vad är en fördel med att använda nästlade test suites?

A) De kör tester snabbare än platta strukturer
B) De möjliggör mer komplexa testfall
C) De erbjuder en hierarkisk organisation av tester
D) De eliminerar behovet av individuella testklasser

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Nästlade suites påverkar inte nödvändigtvis exekveringshastigheten
B) Fel - Nästlade suites skapar inte mer komplexa testfall, de organiserar dem
C) Rätt - Nästlade suites möjliggör en hierarkisk struktur för testorganisation
D) Fel - Nästlade suites ersätter inte behovet av individuella testklasser
```

</details>

---

25. Vilken annotation kan användas för att inkludera tester baserat på namnmönster?

A) @SelectPackages
B) @IncludeClassNamePatterns
C) @IncludeTests
D) @RunWithPattern

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - @SelectPackages används för att välja hela paket, inte baserat på namnmönster
B) Rätt - @IncludeClassNamePatterns används för att inkludera tester baserat på namnmönster
C) Fel - Detta är inte en giltig JUnit5-annotation
D) Fel - Detta är inte en giltig JUnit5-annotation
```

</details>

---

26. Vad mäter cyklomatisk komplexitet?

A) Hur svår koden är att förstå för en mänsklig läsare
B) Antalet linjärt oberoende vägar genom koden
C) Antalet operatorer och operander i koden
D) Hur lång tid det tar att exekvera koden

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Detta beskriver kognitiv komplexitet, inte cyklomatisk
B) Rätt - Cyklomatisk komplexitet mäter antalet linjärt oberoende vägar genom koden
C) Fel - Detta beskriver Halstead-komplexitet
D) Fel - Exekveringstid är inte direkt kopplat till någon av de nämnda komplexitetsmåtten
```

</details>

---

27. Vilken av följande är INTE en aspekt av kodkomplexitet enligt materialet?

A) Cyklomatisk komplexitet
B) Kognitiv komplexitet
C) Halstead-komplexitet
D) Temporal komplexitet

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Cyklomatisk komplexitet är en av de nämnda aspekterna
B) Fel - Kognitiv komplexitet är en av de nämnda aspekterna
C) Fel - Halstead-komplexitet är en av de nämnda aspekterna
D) Rätt - Temporal komplexitet nämns inte som en aspekt av kodkomplexitet i materialet
```

</details>

---

28. Vilket av följande är ett effektivt sätt att reducera kodkomplexitet?

A) Öka antalet nästlade strukturer
B) Använda långa, detaljerade variabelnamn
C) Bryta ner stora metoder i mindre, mer hanterbara delar
D) Implementera all logik i en enda klass

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Ökade nästlade strukturer ökar vanligtvis komplexiteten
B) Fel - Även om beskrivande namn är bra, är detta inte en direkt metod för att reducera komplexitet
C) Rätt - Att bryta ner stora metoder är en rekommenderad strategi för att reducera komplexitet
D) Fel - Att samla all logik i en klass ökar vanligtvis komplexiteten
```

</details>

---

29. Hur beräknas cyklomatisk komplexitet för en metod?

A) Summan av alla variabler och funktioner
B) Antalet rader kod i metoden
C) Antalet beslutspunkter plus ett
D) Antalet loopar multiplicerat med antalet if-satser

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Detta är inte relaterat till hur cyklomatisk komplexitet beräknas
B) Fel - Antalet rader kod är inte direkt kopplat till cyklomatisk komplexitet
C) Rätt - Cyklomatisk komplexitet beräknas genom att räkna antalet beslutspunkter plus ett
D) Fel - Detta är en felaktig beräkningsmetod som inte nämns i materialet
```

</details>

---

30. Vilken påstående om kodkomplexitet är INTE korrekt enligt materialet?

A) Hög komplexitet kan leda till ökad felfrekvens
B) Låg komplexitet betyder alltid bättre kod
C) Komplexitet påverkar direkt läsbarhet och underhållbarhet
D) Även små kodavsnitt kan ha hög komplexitet

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Detta påstående är korrekt enligt materialet
B) Rätt - Detta är en vanlig missuppfattning; ibland kan viss komplexitet vara nödvändig
C) Fel - Detta påstående är korrekt enligt materialet
D) Fel - Detta påstående är korrekt enligt materialet
```

</details>

---

31. Vad är det första steget i TDD-cykeln?

A) Skriv kod som implementerar funktionaliteten
B) Refaktorera existerande kod
C) Skriv ett test som definierar önskad funktionalitet
D) Kör alla existerande tester

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Att skriva kod är inte det första steget i TDD
B) Fel - Refaktorering sker efter att tester har skrivits och kod implementerats
C) Rätt - TDD börjar alltid med att skriva ett test som definierar önskad funktionalitet
D) Fel - Att köra existerande tester kommer efter att ett nytt test har skrivits
```

</details>

---

32. Vilken av följande är INTE en fördel med TDD enligt materialet?

A) Minskar antalet buggar och fel i produktionen
B) Förbättrar koddesign och moduläritet
C) Eliminerar behovet av manuell testning
D) Ökar utvecklarnas förtroende för koden

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Detta är en angiven fördel med TDD
B) Fel - Förbättrad koddesign och moduläritet nämns som en fördel
C) Rätt - TDD ersätter inte behovet av andra typer av testning, inklusive manuell
D) Fel - Ökat förtroende för koden är en av fördelarna som nämns
```

</details>

---

33. Vad menas med "Red" i Red-Green-Refactor-cykeln?

A) Koden innehåller fel och behöver korrigeras
B) Ett test har skrivits och misslyckas som förväntat
C) Projektet är i en kritisk fas
D) Refaktorering har introducerat nya buggar

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - "Red" syftar inte på fel i koden utan på ett test som misslyckas
B) Rätt - "Red" innebär att ett nytt test har skrivits och misslyckas som förväntat
C) Fel - "Red" har inget att göra med projektets fas
D) Fel - "Red" är inte relaterat till buggar introducerade av refaktorering
```

</details>

---

34. Vilket av följande påståenden om TDD är korrekt?

A) TDD kräver att man vet exakt vad man ska bygga innan man börjar
B) TDD ersätter behovet av andra typer av testning
C) TDD är ett verktyg för att utforska och definiera krav under utveckling
D) TDD garanterar att koden alltid är buggfri

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Detta är en vanlig missuppfattning; TDD kan användas för att utforska krav
B) Fel - TDD kompletterar andra testmetoder men ersätter dem inte
C) Rätt - TDD beskrivs som ett utmärkt verktyg för att utforska och definiera krav
D) Fel - Även om TDD minskar buggar, garanterar det inte helt buggfri kod
```

</details>

---

35. Vilken av följande är INTE en rekommenderad best practice för TDD enligt materialet?

A) Skriv minimala tester
B) Håll Red-fasen kort
C) Refaktorera endast när alla tester passerar
D) Kör alla tester så sällan som möjligt för att spara tid

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Att skriva minimala tester är en rekommenderad best practice
B) Fel - Att hålla Red-fasen kort nämns som en best practice
C) Fel - Refaktorering efter att tester passerar är en del av TDD-cykeln
D) Rätt - Materialet rekommenderar att köra alla tester ofta, inte sällan
```

</details>

---

36. Vad är det första steget i Red-Green-Refactor-cykeln?

A) Implementera minimal kod
B) Förbättra koden utan att ändra dess beteende
C) Skriva ett misslyckande test
D) Köra alla existerande tester

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Detta är det andra steget (Green)
B) Fel - Detta är det tredje steget (Refactor)
C) Rätt - Att skriva ett misslyckande test är det första steget (Red)
D) Fel - Detta är inte ett specifikt steg i Red-Green-Refactor-cykeln
```

</details>

---

37. Vilken av följande är INTE en fördel med Red-Green-Refactor-cykeln enligt materialet?

A) Säkerställer att varje bit kod har ett syfte
B) Uppmuntrar till inkrementell utveckling
C) Eliminerar behovet av manuell testning
D) Ger omedelbar feedback om kodens kvalitet och funktion

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Detta är en fördel som nämns i materialet
B) Fel - Detta är en fördel som nämns i materialet
C) Rätt - Detta nämns inte som en fördel och är inte korrekt, TDD ersätter inte manuell testning
D) Fel - Detta är en fördel som nämns i materialet
```

</details>

---

38. Vad är huvudsyftet med "Green"-fasen i Red-Green-Refactor-cykeln?

A) Att skriva det mest eleganta och optimerade koden
B) Att implementera minimal kod för att få testet att passera
C) Att refaktorera existerande kod
D) Att skriva fler tester

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Detta är mer relevant för refaktoreringsfasen
B) Rätt - Green-fasen handlar om att implementera minimal kod för att få testet att passera
C) Fel - Detta är syftet med Refactor-fasen
D) Fel - Detta är mer relevant för Red-fasen
```

</details>

---

39. Vilken av följande är INTE en vanlig missuppfattning om TDD enligt materialet?

A) "Grön kod betyder bra kod"
B) "TDD tar för lång tid"
C) "Jag måste skriva alla tester först"
D) "TDD garanterar felfri kod"

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Detta nämns som en vanlig missuppfattning i materialet
B) Fel - Detta nämns som en vanlig missuppfattning i materialet
C) Fel - Detta nämns som en vanlig missuppfattning i materialet
D) Rätt - Detta nämns inte som en vanlig missuppfattning i materialet
```

</details>

---

40. Vilket av följande är ett exempel på en "best practice" för TDD enligt materialet?

A) Skriva så många tester som möjligt på en gång
B) Vänta med refaktorering tills projektet är färdigt
C) Använda beskrivande testnamn
D) Fokusera enbart på positiva testfall

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - TDD handlar om att skriva ett test i taget, inte alla på en gång
B) Fel - Materialet rekommenderar att refaktorera regelbundet
C) Rätt - Att använda beskrivande testnamn nämns som en best practice i materialet
D) Fel - TDD bör inkludera både positiva och negativa testfall
```

</details>

---

41. Vilket av följande är INTE en av SOLID-principerna?

A) Single Responsibility Principle
B) Open-Closed Principle
C) Loose Coupling Principle
D) Dependency Inversion Principle

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Single Responsibility Principle är en av SOLID-principerna
B) Fel - Open-Closed Principle är en av SOLID-principerna
C) Rätt - Loose Coupling Principle är inte en av SOLID-principerna
D) Fel - Dependency Inversion Principle är en av SOLID-principerna
```

</details>

---

42. Vilken SOLID-princip säger att "klasser bör vara öppna för utökning men stängda för modifiering"?

A) Single Responsibility Principle
B) Open-Closed Principle
C) Liskov Substitution Principle
D) Interface Segregation Principle

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Single Responsibility Principle handlar om att en klass ska ha endast en anledning att ändras
B) Rätt - Open-Closed Principle säger att klasser bör vara öppna för utökning men stängda för modifiering
C) Fel - Liskov Substitution Principle handlar om utbytbarhet av objekt i en hierarki
D) Fel - Interface Segregation Principle handlar om att dela upp stora gränssnitt i mindre, mer specifika
```

</details>

---

43. Hur påverkar Single Responsibility Principle (SRP) testbarheten av kod?

A) Det gör testning överflödig
B) Det ökar komplexiteten och gör testning svårare
C) Det gör det lättare att isolera och testa enskilda ansvarsområden
D) Det har ingen påverkan på testbarhet

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - SRP eliminerar inte behovet av testning
B) Fel - SRP minskar faktiskt komplexiteten och underlättar testning
C) Rätt - SRP gör det lättare att isolera och testa enskilda ansvarsområden
D) Fel - SRP har en positiv påverkan på testbarhet
```

</details>

---

44. Vilken SOLID-princip hjälper främst till att underlätta användningen av mocks och stubs i tester?

A) Single Responsibility Principle
B) Open-Closed Principle
C) Liskov Substitution Principle
D) Dependency Inversion Principle

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - SRP fokuserar på att separera ansvarsområden, inte direkt på att underlätta mocking
B) Fel - OCP handlar om att utöka funktionalitet utan att ändra existerande kod
C) Fel - LSP handlar om utbytbarhet av objekt i en hierarki
D) Rätt - DIP underlättar användningen av mocks och stubs genom att bero på abstraktioner
```

</details>

---

45. Vilken av följande är INTE en fördel med att tillämpa SOLID-principerna i samband med TDD?

A) Det leder till mer modulär och lösare kopplad kod
B) Det minskar sidoeffekter och gör det lättare att isolera enheter för testning
C) Det eliminerar behovet av att skriva tester
D) Det förbättrar kodens flexibilitet och underhållbarhet

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Detta är en faktisk fördel med att tillämpa SOLID
B) Fel - Detta är en korrekt fördel med SOLID i samband med TDD
C) Rätt - SOLID eliminerar inte behovet av tester, utan förbättrar testbarheten
D) Fel - Förbättrad flexibilitet och underhållbarhet är fördelar med SOLID
```

</details>

---

46. Vad är huvudsyftet med mockning i enhetstester?

A) Att ersätta all annan testning
B) Att simulera beteendet hos komplexa objekt
C) Att öka testprestandan
D) Att testa användargränssnitt

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Mockning ersätter inte all annan testning, det är ett komplement
B) Rätt - Huvudsyftet med mockning är att simulera beteendet hos komplexa objekt
C) Fel - Ökad prestanda kan vara en fördel men är inte huvudsyftet
D) Fel - Mockning används främst för att isolera enheter, inte för UI-testning
```

</details>

---

47. Vilket av följande är INTE en fördel med att använda mocks i tester?

A) Isolering av enheter under test
B) Simulering av svåra scenarier
C) Ersättning av all integrationstestning
D) Snabbare och mer förutsägbara tester

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Isolering av enheter är en viktig fördel med mockning
B) Fel - Att kunna simulera svåra scenarier är en fördel med mockning
C) Rätt - Mockning ersätter inte all integrationstestning, det är en vanlig missuppfattning
D) Fel - Snabbare och mer förutsägbara tester är fördelar med mockning
```

</details>

---

48. Vilken av följande är INTE en vanlig typ av test double?

A) Dummy
B) Fake
C) Mock
D) Replica

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Dummy är en giltig typ av test double
B) Fel - Fake är en giltig typ av test double
C) Fel - Mock är en giltig och vanlig typ av test double
D) Rätt - Replica är inte en etablerad typ av test double inom området
```

</details>

---

49. Vad är det första steget när man använder Mockito för att skapa en mock?

A) Konfigurera mock-beteende
B) Verifiera interaktioner
C) Skapa mocken
D) Använda mocken i testet

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Konfigurering kommer efter skapandet av mocken
B) Fel - Verifiering sker vanligtvis i slutet av testet
C) Rätt - Det första steget är att skapa mocken med Mockito
D) Fel - Användning av mocken sker efter skapande och konfigurering
```

</details>

---

50. Vilket påstående om partiell mockning är korrekt?

A) Det används för att mocka alla metoder i en klass
B) Det tillåter mockning av vissa metoder medan andra behåller sitt ursprungliga beteende
C) Det är alltid att föredra framför full mockning
D) Det kan endast användas på gränssnitt

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Partiell mockning mockar inte alla metoder
B) Rätt - Detta beskriver korrekt vad partiell mockning gör
C) Fel - Partiell mockning är användbart i vissa fall men inte alltid att föredra
D) Fel - Partiell mockning kan användas på både klasser och gränssnitt
```

</details>

---

51. Vilken Mockito-metod används för att konfigurera en mocks beteende?

A) verify()
B) mock()
C) when()
D) assert()

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - verify() används för att verifiera interaktioner, inte konfigurera beteende
B) Fel - mock() används för att skapa en mock, inte konfigurera dess beteende
C) Rätt - when() används för att konfigurera en mocks beteende
D) Fel - assert() är inte en Mockito-metod, det är en del av JUnit
```

</details>

---

52. Vad är huvudsyftet med att använda en ArgumentCaptor i Mockito?

A) Att skapa nya argument för mocken
B) Att fånga och inspektera argument som skickas till en mockad metod
C) Att validera indata innan den skickas till mocken
D) Att generera slumpmässiga testdata

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - ArgumentCaptor skapar inte nya argument
B) Rätt - Detta beskriver korrekt huvudsyftet med ArgumentCaptor
C) Fel - Validering är inte huvudsyftet med ArgumentCaptor
D) Fel - ArgumentCaptor genererar inte testdata
```

</details>

---

53. Vilket av följande är ett tecken på att en klass kan behöva refaktoriseras för bättre testbarhet?

A) Klassen har för få metoder
B) Klassen använder dependency injection
C) Det är svårt att mocka klassens beroenden
D) Klassen har många privata metoder

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Antalet metoder är inte direkt relaterat till testbarhet
B) Fel - Dependency injection förbättrar vanligtvis testbarheten
C) Rätt - Svårigheter att mocka beroenden indikerar ofta dålig testbarhet
D) Fel - Privata metoder påverkar inte direkt den externa testbarheten
```

</details>

---

54. Vilken best practice bör följas vid användning av mocks?

A) Mocka alltid alla beroenden
B) Använd endast mocks för externa tjänster
C) Mocka gränssnitt istället för konkreta klasser när möjligt
D) Verifiera varje interaktion med en mock

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Att mocka alla beroenden är ofta onödigt och kan leda till bräckliga tester
B) Fel - Mocks kan användas för mer än bara externa tjänster
C) Rätt - Att mocka gränssnitt främjar lös koppling och bättre testbarhet
D) Fel - Överdriven verifiering kan göra tester svåra att underhålla
```

</details>

---

55. Vilket påstående om mockning i större system är korrekt?

A) Mockning bör aldrig användas i integrationstester
B) Mockfabriker kan användas för att minska upprepning och förbättra underhållbarhet
C) Alla klasser i ett stort system bör mockas
D) Mockning är endast användbart i små projekt

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Mockning kan vara användbart även i integrationstester
B) Rätt - Mockfabriker är en användbar teknik i större system
C) Fel - Att mocka alla klasser är varken praktiskt eller nödvändigt
D) Fel - Mockning är användbart i projekt av alla storlekar
```

</details>

---

56. Vad är huvudsyftet med att använda Mockito i enhetstester?

A) Att förbättra prestandan i testerna
B) Att simulera beteendet hos externa beroenden
C) Att ersätta behovet av integrationstester
D) Att automatiskt generera testfall

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Prestandaförbättring är en möjlig effekt men inte huvudsyftet
B) Rätt - Mockito används primärt för att simulera beteendet hos externa beroenden
C) Fel - Mockito ersätter inte behovet av integrationstester
D) Fel - Mockito genererar inte automatiskt testfall
```

</details>

---

57. Vilken av följande är INTE en vanlig missuppfattning om Mockito enligt materialet?

A) Mockito kan mocka allt
B) Mer mockning är alltid bättre
C) Mockito ersätter behovet av integrationstester
D) Mockito är begränsat till enhetstestning

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Detta är en vanlig missuppfattning som nämns i materialet
B) Fel - Detta är också en vanlig missuppfattning som nämns
C) Fel - Detta är ytterligare en missuppfattning som tas upp
D) Rätt - Detta är inte en missuppfattning, utan snarare en korrekt förståelse av Mockitos primära användningsområde
```

</details>

---

58. Vad är syftet med argument matchers i Mockito?

A) Att förbättra testkodskvaliteten
B) Att minska antalet mockobjekt som behövs
C) Att ge flexibilitet vid definition av metodanropsförväntningar
D) Att automatisera skapandet av testfall

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Även om detta kan vara en effekt, är det inte huvudsyftet
B) Fel - Argument matchers påverkar inte antalet mockobjekt
C) Rätt - Argument matchers ger flexibilitet när man definierar förväntningar på metodanrop
D) Fel - Argument matchers automatiserar inte skapandet av testfall
```

</details>

---

59. Vad är huvudfunktionen av en argument captor i Mockito?

A) Att mocka metoder som tar komplexa argument
B) Att fånga och inspektera argument som skickas till mockade metoder
C) Att automatiskt generera testdata för metodanrop
D) Att verifiera antalet gånger en metod anropas

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Argument captors används inte för att mocka metoder
B) Rätt - Huvudfunktionen av argument captors är att fånga och inspektera argument
C) Fel - Argument captors genererar inte testdata
D) Fel - Detta är snarare en funktion av verify(), inte argument captors
```

</details>

---

60. Vad är en partial mock (eller spy) i Mockito?

A) En mock som bara delvis implementerar ett gränssnitt
B) En mock som används för att testa privata metoder
C) En mock där vissa metoder behåller sitt ursprungliga beteende
D) En mock som automatiskt genererar stubbar för alla metoder

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - En partial mock implementerar hela gränssnittet
B) Fel - Partial mocks används inte specifikt för att testa privata metoder
C) Rätt - En partial mock (eller spy) låter vissa metoder behålla sitt ursprungliga beteende
D) Fel - Partial mocks genererar inte automatiskt stubbar för alla metoder
```

</details>

---

61. Vilken Mockito-funktion introducerades för att hantera statiska metoder?

A) mockStatic()
B) whenStatic()
C) staticMock()
D) mockStaticMethod()

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Rätt - mockStatic() introducerades för att hantera statiska metoder
B) Fel - Detta är inte en korrekt Mockito-metod
C) Fel - Detta är inte en korrekt Mockito-metod
D) Fel - Detta är inte en korrekt Mockito-metod
```

</details>

---

62. Vad är en potentiell risk med överdriven användning av mockning?

A) Det kan leda till långsammare tester
B) Det kan göra testerna mer komplexa
C) Det kan resultera i bräckliga tester som inte speglar verkligt systembeteende
D) Det kan orsaka kompileringsfel i produktionskoden

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Överdriven mockning påverkar vanligtvis inte testernas hastighet negativt
B) Fel - Även om detta kan vara sant, är det inte huvudrisken som nämns i materialet
C) Rätt - Överdriven mockning kan leda till tester som inte korrekt speglar verkligt systembeteende
D) Fel - Mockning i tester påverkar inte kompileringen av produktionskod
```

</details>

---
63. Vilket av följande är ett bra användningsområde för custom argument matchers?

A) Att ersätta alla inbyggda matchers i Mockito
B) Att förenkla verifiering av komplexa objektargument
C) Att förbättra prestandan i tester
D) Att automatiskt generera testdata

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Custom matchers är ett komplement till, inte en ersättning för, inbyggda matchers
B) Rätt - Custom matchers är särskilt användbara för att förenkla verifiering av komplexa objektargument
C) Fel - Custom matchers är primärt för att förbättra läsbarhet och flexibilitet, inte prestanda
D) Fel - Custom matchers genererar inte testdata
```

</details>

---

64. Vad är huvudsyftet med @InjectMocks-annotationen i Mockito?

A) Att skapa en ny instans av testklassen
B) Att automatiskt injicera mockobjekt i objektet som testas
C) Att mocka alla metoder i en klass
D) Att markera vilka klasser som ska testas

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - @InjectMocks skapar inte en ny instans av testklassen
B) Rätt - Huvudsyftet med @InjectMocks är att automatiskt injicera mockobjekt i objektet som testas
C) Fel - @InjectMocks mockar inte metoder, det injicerar mockar
D) Fel - @InjectMocks används inte för att markera testklasser
```

</details>

---

65. Vilken Mockito-teknik är lämplig för att testa asynkrona operationer?

A) Användning av timeout() i verify()
B) Implementering av custom matchers
C) Användning av spy() istället för mock()
D) Användning av doAnswer() för att simulera asynkront beteende

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Rätt - Användning av timeout() i verify() är en lämplig teknik för att testa asynkrona operationer
B) Fel - Custom matchers är inte specifikt relaterade till testning av asynkrona operationer
C) Fel - Att använda spy() istället för mock() är inte specifikt relaterat till asynkron testning
D) Fel - Även om doAnswer() kan användas i vissa scenarier, är det inte den primära tekniken för asynkron testning som nämns i materialet
```

</details>

---


66. Vad är huvudsyftet med integrationstestning?

A) Att testa individuella komponenter isolerat
B) Att verifiera att olika systemkomponenter fungerar korrekt tillsammans
C) Att ersätta enhetstestning
D) Att testa användargränssnittet

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Detta beskriver enhetstestning, inte integrationstestning
B) Rätt - Huvudsyftet med integrationstestning är att verifiera att komponenter fungerar tillsammans
C) Fel - Integrationstestning ersätter inte enhetstestning, de kompletterar varandra
D) Fel - Detta beskriver UI-testning, inte integrationstestning
```

</details>

---

67. Vilken av följande är INTE en vanlig strategi för integrationstestning?

A) Big Bang
B) Top-down
C) Bottom-up
D) Vattenfallsmetoden

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Big Bang är en vanlig strategi för integrationstestning
B) Fel - Top-down är en vanlig strategi för integrationstestning
C) Fel - Bottom-up är en vanlig strategi för integrationstestning
D) Rätt - Vattenfallsmetoden är en utvecklingsmetodik, inte en integrationsteststrategi
```

</details>

---

68. Vilket av följande påståenden om integrationstestning är korrekt?

A) Integrationstestning ersätter enhetstestning
B) Alla integrationstester måste vara end-to-end
C) Integrationstestning fokuserar på interaktionen mellan komponenter
D) Integrationstestning är alltid långsamt och resurskrävande

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Detta är en vanlig missuppfattning; integrationstestning kompletterar enhetstestning
B) Fel - Integrationstester kan fokusera på specifika gränssnitt mellan komponenter
C) Rätt - Detta är en korrekt beskrivning av integrationstestning
D) Fel - Med rätt strategi och verktyg kan integrationstester vara effektiva
```

</details>

---

69. Vilken typ av databas rekommenderas ofta för integrationstester i Java?

A) Oracle
B) MySQL
C) H2
D) MongoDB

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Oracle används ofta i produktion men är inte typiskt för integrationstester
B) Fel - MySQL är en produktionsdatabas, inte optimerad för integrationstester
C) Rätt - H2 rekommenderas som en in-memory databas för integrationstester
D) Fel - MongoDB är en NoSQL-databas, inte typiskt använd för Java integrationstester
```

</details>

---

70. Vad är syftet med att använda transaktioner eller rensa databasen mellan integrationstester?

A) Att öka prestandan för testerna
B) Att isolera testerna och säkerställa deras oberoende
C) Att simulera produktionsmiljön bättre
D) Att minska antalet nödvändiga tester

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Detta kan faktiskt minska prestandan något
B) Rätt - Detta säkerställer att varje test är oberoende och inte påverkas av tidigare tester
C) Fel - Detta simulerar inte nödvändigtvis produktionsmiljön bättre
D) Fel - Detta påverkar inte antalet nödvändiga tester
```

</details>

---

71. Vilken av följande är INTE en rekommenderad best practice för integrationstestning?

A) Använda realistiska data
B) Testa gränsfall
C) Mocka alla externa beroenden
D) Begränsa omfattningen av varje test

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Att använda realistiska data är en rekommenderad best practice
B) Fel - Att testa gränsfall är en viktig del av integrationstestning
C) Rätt - Att mocka alla externa beroenden motverkar syftet med integrationstestning
D) Fel - Att begränsa omfattningen av varje test är en rekommenderad best practice
```

</details>

---

72. Vad är huvudsyftet med att använda Testcontainers i integrationstester?

A) Att ersätta enhetstester
B) Att möjliggöra mer realistiska testmiljöer
C) Att förbättra testprestandan
D) Att automatisera UI-tester

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Testcontainers ersätter inte enhetstester
B) Rätt - Testcontainers används för att skapa mer realistiska testmiljöer med Docker
C) Fel - Huvudsyftet är inte prestandaförbättring, även om det kan vara en bieffekt
D) Fel - Testcontainers är inte primärt avsett för UI-testautomatisering
```

</details>

---

73. Vilken typ av testning fokuserar specifikt på gränssnitten mellan tjänster i en mikroservicearkitektur?

A) Enhetstestning
B) Systemtestning
C) Contract testing
D) Prestandatestning

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Enhetstestning fokuserar på enskilda komponenter, inte gränssnitt mellan tjänster
B) Fel - Systemtestning testar hela systemet, inte specifikt gränssnitt mellan tjänster
C) Rätt - Contract testing fokuserar specifikt på gränssnitten mellan tjänster i en mikroservicearkitektur
D) Fel - Prestandatestning handlar om systemets prestanda, inte specifikt om gränssnitt
```

</details>

---

74. Vad är en rekommenderad praxis när man kör integrationstester i en CI/CD-pipeline?

A) Köra dem mer frekvent än enhetstester
B) Alltid använda produktionsdata i testerna
C) Integrera dem tidigt för att fånga integrationsproblem
D) Köra dem endast i produktionsmiljön

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Integrationstester körs vanligtvis mindre frekvent än enhetstester
B) Fel - Att använda produktionsdata i tester är en säkerhetsrisk och bör undvikas
C) Rätt - Att integrera testerna tidigt hjälper till att fånga integrationsproblem snabbt
D) Fel - Integrationstester bör köras i en dedikerad testmiljö, inte i produktion
```

</details>

---
75. Vilket verktyg används ofta i Java för att skapa mock-objekt i integrationstester?

A) JUnit
B) Mockito
C) Selenium
D) Maven

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - JUnit är ett testramverk, inte ett mockverktyg
B) Rätt - Mockito är ett populärt verktyg för att skapa mock-objekt i Java
C) Fel - Selenium är ett verktyg för webbläsarautomatisering, inte för att skapa mocks
D) Fel - Maven är ett byggverktyg, inte ett mockverktyg
```

</details>

---

76. Vad är det primära syftet med prestandatestning?

A) Att säkerställa att applikationer kan hantera verkliga användarscenarion och belastningar
B) Att identifiera buggar i koden
C) Att förbättra användarupplevelsen genom att ändra gränssnittet
D) Att optimera databasstrukturen

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Rätt - Prestandatestning syftar till att säkerställa att applikationer klarar verkliga användarscenarier och belastningar
B) Fel - Detta är syftet med funktionell testning, inte prestandatestning
C) Fel - Detta är mer relaterat till UX-design än prestandatestning
D) Fel - Databasoptimering kan vara en del av prestandaförbättring, men är inte huvudsyftet med prestandatestning
```

</details>

---

77. Vilket av följande är INTE en typ av prestandatest som nämns i materialet?

A) Lasttest
B) Stresstest
C) Uthållighetstest
D) Regressiontest

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Lasttest är en av de nämnda typerna av prestandatest
B) Fel - Stresstest är en av de nämnda typerna av prestandatest
C) Fel - Uthållighetstest är en av de nämnda typerna av prestandatest
D) Rätt - Regressiontest nämns inte som en typ av prestandatest i materialet
```

</details>

---

78. Vilken metrik mäter antalet transaktioner som kan hanteras per tidsenhet?

A) Svarstid
B) Genomströmning
C) Resursanvändning
D) Samtidiga användare

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Svarstid mäter tiden det tar för systemet att svara på en förfrågan
B) Rätt - Genomströmning mäter antalet transaktioner som kan hanteras per tidsenhet
C) Fel - Resursanvändning mäter CPU, minne, disk I/O och nätverksanvändning
D) Fel - Samtidiga användare mäter maximalt antal användare som kan hanteras samtidigt
```

</details>

---

79. Vilket steg i prestandatestningsprocessen involverar att skapa testskript som simulerar användaraktiviteter?

A) Planering
B) Exekvering
C) Skriptning
D) Analys

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Planering handlar om att definiera testmål och krav
B) Fel - Exekvering handlar om att köra testerna med olika belastningsnivåer
C) Rätt - Skriptning involverar att skapa testskript som simulerar användaraktiviteter
D) Fel - Analys innebär att granska resultaten och identifiera prestandaproblem
```

</details>

---

80. Vilket verktyg introduceras i materialet för prestandatestning?

A) Selenium
B) JUnit
C) Postman
D) JMeter

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Selenium är ett verktyg för automatiserad webbläsartestning, inte specifikt för prestandatestning
B) Fel - JUnit är ett ramverk för enhetstestning, inte för prestandatestning
C) Fel - Postman är primärt ett verktyg för API-testning, inte specifikt för prestandatestning
D) Rätt - JMeter introduceras som ett verktyg för prestandatestning
```

</details>

---

81. Vad är en vanlig missuppfattning om prestandatestning enligt materialet?

A) Att det bara behövs för små system
B) Att det alltid kräver specialiserad hårdvara
C) Att det kan vänta till slutet av utvecklingscykeln
D) Att det endast är nödvändigt för webbapplikationer

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Tvärtom, materialet påpekar att även mindre system kan dra nytta av prestandatestning
B) Fel - Detta nämns inte som en vanlig missuppfattning i materialet
C) Rätt - Materialet nämner detta som en myt och betonar vikten av tidig och kontinuerlig prestandatestning
D) Fel - Detta nämns inte som en vanlig missuppfattning i materialet
```

</details>

---

82. Vilken teknik rekommenderas för att optimera prestandaproblem relaterade till databasåtkomst?

A) Connection Pooling
B) Lazy Loading
C) Multithreading
D) Komprimering av data

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Rätt - Connection Pooling nämns specifikt för effektiv databasanslutningshantering
B) Fel - Lazy Loading nämns för att ladda endast nödvändig data vid behov, men är inte specifikt för databasoptimering
C) Fel - Multithreading nämns inte specifikt i materialet för databasoptimering
D) Fel - Datakomprimering nämns inte som en teknik för databasoptimering i materialet
```

</details>

---

83. Vad är syftet med distribuerad prestandatestning?

A) Att generera högre belastning för storskaliga applikationer
B) Att testa applikationer på olika operativsystem
C) Att simulera olika nätverkshastigheter
D) Att testa applikationer på olika webbläsare

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Rätt - Distribuerad testning används för att generera högre belastning för storskaliga applikationer
B) Fel - Detta är mer relaterat till kompatibilitetstestning
C) Fel - Simulering av nätverkshastigheter är en annan aspekt av prestandatestning, inte huvudsyftet med distribuerad testning
D) Fel - Webbläsartestning är en separat typ av testning, inte relaterad till distribuerad prestandatestning
```

</details>

---

84. Vilken säkerhetsaspekt bör man vara särskilt uppmärksam på vid prestandatestning?

A) Att testa för SQL-injektioner
B) Att informera relevanta parter innan tester i produktionslika miljöer
C) Att använda krypterade anslutningar
D) Att implementera tvåfaktorsautentisering

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - SQL-injektioner är relaterade till säkerhetstestning, inte prestandatestning
B) Rätt - Materialet betonar vikten av att informera relevanta parter innan man kör tester i produktionslika miljöer
C) Fel - Krypterade anslutningar är viktiga för säkerhet men nämns inte specifikt i kontexten av prestandatestning
D) Fel - Tvåfaktorsautentisering är en säkerhetsfunktion, inte direkt relaterad till prestandatestning
```

</details>

---
85. Vad är en viktig aspekt att tänka på när man skalar upp prestandatester?

A) Att öka antalet testfall
B) Att använda mer komplexa algoritmer
C) Att vara uppmärksam på JMeter-resursanvändning på testmaskiner
D) Att minska testtiden för att spara resurser

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Att öka antalet testfall är inte nödvändigtvis relaterat till att skala upp prestandatester
B) Fel - Komplexiteten i algoritmerna är inte en primär faktor vid uppskalning av prestandatester
C) Rätt - Materialet nämner specifikt att man bör vara uppmärksam på JMeter-resursanvändning på testmaskiner när man skalar upp tester
D) Fel - Att minska testtiden kan motverka syftet med att skala upp testerna
```

</details>

---

86. Vad är huvudskillnaden mellan lasttest och stresstestning?

A) Lasttest fokuserar på normal belastning, stresstestning på extrem belastning
B) Lasttest är kortvarigt, stresstestning är långvarigt
C) Lasttest mäter svarstider, stresstestning mäter endast fel
D) Lasttest används för webbapplikationer, stresstestning för desktopapplikationer

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Rätt - Lasttest verifierar beteende under förväntad belastning, stresstestning fokuserar på extrema förhållanden
B) Fel - Lasttest är ofta längre, stresstestning kortare men intensivare
C) Fel - Båda mäter olika aspekter, inte bara svarstider eller fel
D) Fel - Båda kan användas för olika typer av applikationer
```

</details>

---

87. Vilket verktyg nämns specifikt i materialet för att utföra last- och stresstester?

A) LoadRunner
B) Gatling
C) JMeter
D) Apache Bench

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - LoadRunner nämns inte i materialet
B) Fel - Gatling nämns inte i materialet
C) Rätt - JMeter nämns specifikt som verktyg för last- och stresstestning
D) Fel - Apache Bench nämns inte i materialet
```

</details>

---

88. Vad är syftet med att använda "think times" i lasttest-scenarier?

A) Att öka belastningen på servern
B) Att simulera mänskligt beteende
C) Att mäta svarstider mer exakt
D) Att undvika nätverksöverbelastning

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Think times minskar snarare belastningen
B) Rätt - Think times används för att efterlikna mänskligt beteende mellan aktioner
C) Fel - Det påverkar inte mätningen av svarstider direkt
D) Fel - Det är inte huvudsyftet, även om det kan ha den effekten
```

</details>

---

89. Vilken typ av JMeter-element används för att simulera en gradvis ökning av användare?

A) Constant Timer
B) Gaussian Random Timer
C) Stepping Thread Group
D) Ultimate Thread Group

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Constant Timer används för konstanta fördröjningar, inte för att öka användare
B) Fel - Gaussian Random Timer används för slumpmässiga fördröjningar
C) Rätt - Stepping Thread Group nämns specifikt för att simulera gradvis ökning av användare
D) Fel - Ultimate Thread Group nämns för stresstestning, inte för gradvis ökning
```

</details>

---

90. Vad är ett viktigt övervägande vid prestandatestning i molnmiljöer?

A) Att alltid testa med maximal belastning
B) Att ignorera kostnader associerade med storskaliga tester
C) Att fokusera enbart på applikationskoden
D) Att vara medveten om kostnaderna för storskaliga tester

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Maximal belastning är inte alltid nödvändig eller realistisk
B) Fel - Kostnader är en viktig faktor att beakta
C) Fel - Man bör beakta hela infrastrukturen, inte bara applikationskoden
D) Rätt - Materialet nämner specifikt att man ska vara medveten om kostnaderna för storskaliga tester i molnet
```

</details>

---

91. Vilken metod rekommenderas för att hantera testdata i JMeter?

A) Hårdkoda all testdata i skripten
B) Använd CSV Data Set Config för att ladda testdata
C) Generera slumpmässig data för varje test
D) Använd produktionsdata direkt i testerna

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Hårdkodning av data rekommenderas inte för flexibla tester
B) Rätt - CSV Data Set Config nämns specifikt för att ladda testdata
C) Fel - Även om slumpmässig data kan vara användbar, är det inte den primära rekommendationen
D) Fel - Att använda produktionsdata direkt kan vara riskabelt och nämns inte som rekommendation
```

</details>

---

92. Vad är huvudsyftet med att använda Response Assertions i JMeter?

A) Att mäta svarstider
B) Att simulera användarinteraktioner
C) Att identifiera oväntade svar
D) Att öka belastningen på servern

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Response Assertions används inte primärt för att mäta svarstider
B) Fel - De simulerar inte användarinteraktioner
C) Rätt - Response Assertions används specifikt för att identifiera oväntade svar
D) Fel - De ökar inte belastningen på servern
```

</details>

---

93. Vilken är en rekommenderad best practice för prestandatestning enligt materialet?

A) Alltid testa i produktionsmiljön
B) Fokusera enbart på applikationsservern
C) Börja med komplexa tester och förenkla gradvis
D) Använd en isolerad testmiljö som speglar produktionen

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Att testa direkt i produktion rekommenderas inte och kan vara riskabelt
B) Fel - Man bör övervaka alla systemkomponenter, inte bara applikationsservern
C) Fel - Materialet rekommenderar att börja enkelt och öka komplexiteten gradvis
D) Rätt - Detta nämns specifikt som en best practice i materialet
```

</details>

---

94. Hur hanteras falska flaskhalsar enligt felsökningsguiden i materialet?

A) Genom att granska och justera användarscenarier för bättre realism
B) Genom att öka antalet simulerade användare
C) Genom att ignorera långsamma svarstider
D) Genom att fokusera enbart på serverresurser

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Rätt - Materialet rekommenderar att granska och justera scenarier för bättre realism
B) Fel - Att öka antalet användare inte löser problemet med falska flaskhalsar
C) Fel - Att ignorera problem är inte en rekommenderad lösning
D) Fel - Att enbart fokusera på serverresurser kan missa andra viktiga aspekter
```

</details>

---
95. Vad rekommenderas för att testa auto-skalning i molnmiljöer?

A) Köra korta, intensiva tester
B) Gradvis öka belastningen och observera systemets anpassning
C) Endast testa under låg belastning
D) Stänga av alla auto-skalningsfunktioner under test

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Korta, intensiva tester kanske inte ger tillräcklig tid för auto-skalning att aktiveras
B) Rätt - Materialet rekommenderar att gradvis öka belastningen för att observera auto-skalning
C) Fel - Låg belastning aktiverar vanligtvis inte auto-skalning
D) Fel - Att stänga av auto-skalning skulle motverka syftet med testet
```

</details>

---

96. Vad är huvudsyftet med säkerhetstestning i mjukvaruutveckling?

A) Att öka systemets prestanda
B) Att identifiera och åtgärda sårbarheter
C) Att förbättra användarupplevelsen
D) Att optimera kodstrukturen

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Säkerhetstestning fokuserar primärt på att hitta säkerhetsbrister, inte förbättra prestanda
B) Rätt - Huvudsyftet med säkerhetstestning är att identifiera och åtgärda sårbarheter
C) Fel - Användarupplevelse är inte det primära målet med säkerhetstestning
D) Fel - Kodoptimering är inte huvudfokus för säkerhetstestning
```

</details>

---

97. Vilken av följande är INTE en av de fyra huvudtyperna av säkerhetstester som nämns i materialet?

A) Sårbarhetsskanning
B) Penetrationstestning
C) Riskbedömning
D) Prestandatestning

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Sårbarhetsskanning är en av de nämnda huvudtyperna
B) Fel - Penetrationstestning är en av de nämnda huvudtyperna
C) Fel - Riskbedömning är en av de nämnda huvudtyperna
D) Rätt - Prestandatestning nämns inte som en av huvudtyperna av säkerhetstester i materialet
```

</details>

---

98. Vad representerar OWASP Top 10?

A) De tio mest lönsamma säkerhetsföretagen
B) De tio svåraste programmeringsspråken att säkra
C) De tio mest kritiska säkerhetsriskerna för webbapplikationer
D) De tio bästa verktygen för säkerhetstestning

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - OWASP Top 10 handlar inte om företag
B) Fel - Det handlar inte om programmeringsspråk
C) Rätt - OWASP Top 10 representerar de mest kritiska säkerhetsriskerna för webbapplikationer
D) Fel - Det är inte en lista över testverktyg
```

</details>

---

99. Vilken av följande är INTE ett steg i den typiska säkerhetstestningsprocessen enligt materialet?

A) Exploatering
B) Planering och omfattning
C) Kodoptimering
D) Omtestning

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Fel - Exploatering är ett steg där man försöker utnyttja identifierade sårbarheter
B) Fel - Planering och omfattning är ett steg i processen
C) Rätt - Kodoptimering nämns inte som ett specifikt steg i säkerhetstestningsprocessen
D) Fel - Omtestning är ett steg för att verifiera att sårbarheter har åtgärdats
```

</details>

---

100. Vilken teknik används för att förhindra SQL-injektionsattacker i exemplet från materialet?

A) Kryptering av databaskopplingar
B) Användning av parametriserade frågor
C) Begränsning av databasåtkomst
D) Implementering av tvåfaktorsautentisering

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Kryptering förhindrar inte SQL-injektion
B) Rätt - Parametriserade frågor används specifikt för att förhindra SQL-injektionsattacker
C) Fel - Begränsning av åtkomst förhindrar inte själva injektionen
D) Fel - Tvåfaktorsautentisering är inte relaterat till att förhindra SQL-injektion
```

</details>

---

101. Vad är syftet med att implementera input-validering i exemplet?

A) Att öka systemets prestanda
B) Att förbättra användarupplevelsen
C) Att ytterligare förstärka säkerheten
D) Att minska databasens storlek

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Input-validering är primärt en säkerhetsåtgärd, inte för prestandaförbättring
B) Fel - Även om det kan påverka användarupplevelsen, är det inte huvudsyftet
C) Rätt - Input-validering implementeras för att ytterligare förstärka säkerheten
D) Fel - Input-validering påverkar inte databasens storlek
```

</details>

---

102. Vilken av följande är INTE en av de listade "best practices" för säkerhet i materialet?

A) Maximal loggning av all användaraktivitet
B) Djupförsvar
C) Princip om minsta privilegium
D) Säker standardkonfiguration

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Rätt - Maximal loggning av all användaraktivitet nämns inte som en best practice och kan strida mot dataminimeringsprinciper
B) Fel - Djupförsvar är en listad best practice
C) Fel - Princip om minsta privilegium är en listad best practice
D) Fel - Säker standardkonfiguration är en listad best practice
```

</details>

---

103. Vad är huvudsyftet med att integrera säkerhetstestning i CI/CD-pipeline?

A) Att minska utvecklingskostnaderna
B) Att fånga sårbarheter tidigt i utvecklingsprocessen
C) Att eliminera behovet av manuell testning
D) Att öka systemets prestanda

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Även om det kan leda till kostnadsbesparingar är det inte huvudsyftet
B) Rätt - Huvudsyftet är att identifiera och åtgärda sårbarheter tidigt i utvecklingsprocessen
C) Fel - Det ersätter inte helt behovet av manuell testning
D) Fel - Säkerhetstestning i CI/CD fokuserar inte primärt på prestandaförbättringar
```

</details>

---

104. Vad är Threat Modeling?

A) En teknik för att öka systemets prestanda
B) En metod för att identifiera potentiella säkerhetshot mot ett system
C) Ett verktyg för automatiserad kodsäkerhetsanalys
D) En strategi för att minska utvecklingskostnader

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Threat Modeling handlar inte om prestandaoptimering
B) Rätt - Threat Modeling är en strukturerad process för att identifiera potentiella säkerhetshot
C) Fel - Även om det kan leda till analys, är det inte ett automatiserat verktyg
D) Fel - Det primära syftet är inte att minska utvecklingskostnader
```

</details>

---

105. Vad är huvudsyftet med Fuzzing i säkerhetstestning?

A) Att optimera kodprestanda
B) Att automatiskt generera användardokumentation
C) Att förbättra användargränssnittet
D) Att hitta sårbarheter genom att mata in ogiltiga eller oväntade data

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Fuzzing fokuserar på att hitta säkerhetsbrister, inte optimera prestanda
B) Fel - Fuzzing genererar inte dokumentation
C) Fel - Fuzzing är inte relaterat till förbättring av användargränssnitt
D) Rätt - Huvudsyftet med Fuzzing är att hitta sårbarheter genom att testa med oväntade indata
```

</details>

---

106. Vad är huvudsyftet med att använda Docker för testning av Java-applikationer?

A) Att skapa isolerade och reproducerbara testmiljöer
B) Att förbättra prestandan för Java-applikationer
C) Att eliminera behovet av enhetstester
D) Att ersätta traditionella virtuella maskiner helt

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Rätt - Huvudsyftet är att skapa isolerade och reproducerbara testmiljöer
B) Fel - Förbättrad prestanda är inte huvudsyftet med Docker för testning
C) Fel - Docker ersätter inte behovet av enhetstester
D) Fel - Docker ersätter inte helt traditionella virtuella maskiner
```

</details>

---

107. Vilken av följande är INTE en fördel med att använda Docker för testning?

A) Snabbare onboarding av nya teammedlemmar
B) Ökad tillförlitlighet i testresultaten
C) Enklare felsökning och reproduktion av buggar
D) Eliminering av behov för manuell testning

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Snabbare onboarding är en fördel med Docker för testning
B) Fel - Ökad tillförlitlighet i testresultaten är en fördel
C) Fel - Enklare felsökning och reproduktion av buggar är en fördel
D) Rätt - Docker eliminerar inte behovet för manuell testning
```

</details>

---

108. Vad är en Docker image?

A) En körbar instans av en container
B) Ett verktyg för att definiera multi-container applikationer
C) En läsbar mall för att skapa en Docker-container
D) Ett system för att orkestrera containrar

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Detta beskriver en Docker container, inte en image
B) Fel - Detta beskriver Docker Compose, inte en Docker image
C) Rätt - En Docker image är en läsbar mall för att skapa en container
D) Fel - Detta beskriver en orkestreringslösning, inte en Docker image
```

</details>

---

109. Vilken fil används för att definiera instruktioner för att bygga en Docker image?

A) docker-compose.yml
B) Dockerfile
C) pom.xml
D) Containerfile

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - docker-compose.yml används för att definiera multi-container applikationer
B) Rätt - Dockerfile används för att definiera instruktioner för att bygga en Docker image
C) Fel - pom.xml är en konfigurationsfil för Maven, inte för Docker
D) Fel - Containerfile är inte en standardiserad Docker-fil
```

</details>

---

110. Vad är syftet med att använda multi-stage builds i en Dockerfile?

A) Att öka säkerheten i Docker-containrar
B) Att möjliggöra parallell exekvering av containrar
C) Att förbättra nätverksprestandan mellan containrar
D) Att minska storleken på den slutliga Docker-imagen

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Multi-stage builds är primärt för att optimera image-storlek, inte säkerhet
B) Fel - Multi-stage builds påverkar inte direkt parallell exekvering
C) Fel - Multi-stage builds påverkar inte direkt nätverksprestandan
D) Rätt - Huvudsyftet med multi-stage builds är att minska storleken på den slutliga imagen
```

</details>

---

111. Vilken av följande är INTE en best practice vid användning av Docker för testning?

A) Använda officiella base images
B) Hårdkoda konfigurationsvärdena i Dockerfile
C) Minimera image-storlek
D) Versionshantera Docker images

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Att använda officiella base images är en best practice
B) Rätt - Att hårdkoda konfigurationsvärden är INTE en best practice, man bör använda miljövariabler istället
C) Fel - Att minimera image-storlek är en best practice
D) Fel - Att versionshantera Docker images är en best practice
```

</details>

---

112. Vad är huvudsyftet med att använda Docker Compose i en testmiljö?

A) Att orkestrera multi-container applikationer
B) Att bygga Docker images
C) Att köra enhetstester
D) Att skanna Docker images för sårbarheter

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Rätt - Huvudsyftet med Docker Compose är att orkestrera multi-container applikationer
B) Fel - Docker Compose används primärt inte för att bygga images
C) Fel - Docker Compose är inte specifikt designat för att köra enhetstester
D) Fel - Docker Compose används inte primärt för att skanna images för sårbarheter
```

</details>

---

113. Vilken teknik används för att integrera Docker-containrar med JUnit 5-tester?

A) Docker Swarm
B) Kubernetes
C) Testcontainers
D) Docker Compose

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Docker Swarm är en orkestreringslösning, inte ett testintegrationsverktyg
B) Fel - Kubernetes är en orkestreringslösning, inte ett testintegrationsverktyg
C) Rätt - Testcontainers används för att integrera Docker-containrar med JUnit 5-tester
D) Fel - Docker Compose används för att definiera och köra multi-container applikationer, inte primärt för testintegration
```

</details>

---

114. Vilket av följande är ett exempel på en avancerad användning av Docker för testning?

A) Att använda Docker för att simulera olika nätverksförhållanden i prestandatester
B) Att köra en enskild Java-applikation i en container
C) Att bygga en Docker image
D) Att starta en Docker container

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Rätt - Att simulera olika nätverksförhållanden är ett exempel på avancerad användning av Docker för testning
B) Fel - Att köra en enskild applikation är en grundläggande användning av Docker
C) Fel - Att bygga en Docker image är en grundläggande Docker-operation
D) Fel - Att starta en Docker container är en grundläggande Docker-operation
```

</details>

---

115. Vilken säkerhetsaspekt bör man särskilt beakta vid användning av Docker för testning?

A) Att alltid köra containrar som root-användare
B) Att ignorera image-scanning för testsyften
C) Att exponera alla portar för enkel åtkomst
D) Att köra containrar med minsta möjliga behörigheter

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Att köra som root ökar säkerhetsrisken och är inte rekommenderat
B) Fel - Image-scanning är viktigt även för testmiljöer
C) Fel - Att exponera alla portar ökar säkerhetsrisken och är inte rekommenderat
D) Rätt - Att köra containrar med minsta möjliga behörigheter är en viktig säkerhetsaspekt
```

</details>

---

116. Vad är en av huvudanledningarna till att använda isolerade testmiljöer?

A) Att förbättra prestandan i mikroservicearkitekturer
B) Att garantera att tester körs i identiska miljöer varje gång
C) Att eliminera behovet av enhetstester
D) Att minska kostnaderna för molninfrastruktur

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Prestanda är inte ett primärt syfte med isolerade testmiljöer
B) Rätt - Konsistens är en av huvudanledningarna enligt materialet
C) Fel - Isolerade testmiljöer ersätter inte enhetstester
D) Fel - Kostnadsminskning nämns inte som en huvudanledning
```

</details>

---

117. Vilket verktyg används primärt för att orkestrera multi-container testmiljöer?

A) Kubernetes
B) Jenkins
C) Docker Compose
D) Maven

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Kubernetes nämns som en avancerad lösning, inte primär för detta syfte
B) Fel - Jenkins är ett CI/CD-verktyg, inte för orkestrering av containrar
C) Rätt - Docker Compose används för att orkestrera multi-container miljöer
D) Fel - Maven är ett byggverktyg, inte för containerorkestrering
```

</details>

---

118. Vilken princip handlar om att varje container bör ha ett specifikt syfte?

A) Immutability
B) Portabilitet
C) Orkestrering
D) Separation of Concerns

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Immutability handlar om oföränderlighet, inte specifikt syfte
B) Fel - Portabilitet handlar om att kunna köras på olika maskiner
C) Fel - Orkestrering handlar om hantering av multi-container miljöer
D) Rätt - Separation of Concerns innebär att varje container har ett specifikt syfte
```

</details>

---

119. Vad är syftet med att använda namngivna volymer i Docker?

A) Att bevara data mellan körningar och förbättra prestanda
B) Att förbättra nätverksprestandan
C) Att förenkla container-orkestrering
D) Att automatisera skalning av tjänster

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Rätt - Namngivna volymer används för att bevara data och förbättra prestanda
B) Fel - Namngivna volymer påverkar inte direkt nätverksprestandan
C) Fel - De förenklar inte primärt orkestrering
D) Fel - Volymer hanterar inte automatisk skalning
```

</details>

---

120. Vilket påstående om Docker-miljöer är korrekt?

A) Docker-miljöer är alltid långsammare än nativa installationer
B) Docker eliminerar alla miljöskillnader
C) Man behöver alltid en container för varje mikroservice
D) Docker kan minska miljöskillnader men eliminerar inte alla

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Detta är en vanlig missuppfattning; Docker-miljöer kan vara nästan lika snabba
B) Fel - Detta är en missuppfattning; skillnader kan fortfarande finnas
C) Fel - Detta är en missuppfattning; ibland kan tjänster grupperas
D) Rätt - Docker minskar skillnader men eliminerar inte alla enligt materialet
```

</details>

---

121. Vilken funktion har `depends_on` i en Docker Compose-fil?

A) Att definiera nätverksrelationer mellan containrar
B) Att specificera resursbegränsningar för containrar
C) Att säkerställa korrekt uppstartsordning av containrar
D) Att automatiskt skala containrar baserat på last

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - `depends_on` hanterar inte primärt nätverksrelationer
B) Fel - Det används inte för att specificera resursbegränsningar
C) Rätt - `depends_on` används för att säkerställa korrekt uppstartsordning
D) Fel - Det hanterar inte automatisk skalning
```

</details>

---

122. Vad är ett huvudsyfte med att använda Testcontainers i Java?

A) Att integrera Docker-miljöer med JUnit-tester
B) Att ersätta Docker Compose
C) Att automatisera byggprocessen av Docker-images
D) Att förbättra prestandan i Docker-nätverk

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Rätt - Testcontainers används för att integrera Docker-miljöer med JUnit-tester
B) Fel - Testcontainers ersätter inte Docker Compose
C) Fel - Det automatiserar inte primärt byggprocessen av images
D) Fel - Det förbättrar inte direkt nätverksprestandan
```

</details>

---

123. Vilken strategi rekommenderas för att hantera hemligheter i Docker-miljöer?

A) Lagra dem direkt i Dockerfile
B) Använda miljövariabler för all konfiguration
C) Implementera Docker secrets eller externa lösningar som HashiCorp Vault
D) Spara dem i plaintext i Docker Compose-filen

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Detta är inte en säker metod för hantering av hemligheter
B) Fel - Miljövariabler är inte alltid säkra för känslig information
C) Rätt - Användning av Docker secrets eller externa lösningar rekommenderas
D) Fel - Att spara hemligheter i plaintext är inte säkert
```

</details>

---

124. Vad är ett primärt syfte med att använda hälsokontroller i Docker-miljöer?

A) Att mäta CPU-användning
B) Att säkerställa att tjänster är redo innan beroende tjänster eller tester startar
C) Att automatiskt återstarta kraschade containrar
D) Att övervaka nätverkstrafik mellan containrar

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Hälsokontroller mäter inte primärt CPU-användning
B) Rätt - Detta är ett huvudsyfte med hälsokontroller enligt materialet
C) Fel - Automatisk omstart är en separat funktion
D) Fel - Övervakning av nätverkstrafik är inte huvudsyftet med hälsokontroller
```

</details>

---

125. Vilken teknik kan användas för att förbättra prestandan för I/O-intensiva operationer i Docker?

A) Öka antalet CPU-kärnor allokerade till containern
B) Använda Docker's overlay-nätverk
C) Implementera lastbalansering mellan containrar
D) Använda tmpfs-volymer eller host-volymer

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Fler CPU-kärnor förbättrar inte direkt I/O-prestanda
B) Fel - Overlay-nätverk påverkar inte primärt I/O-prestanda
C) Fel - Lastbalansering förbättrar inte direkt I/O-prestanda för en enskild container
D) Rätt - Användning av tmpfs-volymer eller host-volymer kan förbättra I/O-prestanda
```

</details>

---

126. Vad är ett huvudsyfte med att använda Docker-containrar för databastestning?

A) Att förbättra databasernas prestanda
B) Att eliminera behovet av databasmigreringar
C) Att garantera isolering mellan olika testkörningar
D) Att automatiskt optimera databasscheman

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Prestanda är inte ett huvudsyfte, även om det kan vara en fördel
B) Fel - Docker eliminerar inte behovet av databasmigreringar
C) Rätt - Isolering mellan testkörningar är ett huvudsyfte enligt materialet
D) Fel - Automatisk schemaoptimering är inte en funktion av Docker-containrar
```

</details>

---

127. Vilken av följande är INTE en av de grundläggande principerna för effektiv konfigurering av Docker-containrar för databastestning?

A) Datapersistens
B) Konfigurationshantering
C) Initialiseringsstrategier
D) Automatisk skalning

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Datapersistens är en grundläggande princip enligt materialet
B) Fel - Konfigurationshantering är en grundläggande princip
C) Fel - Initialiseringsstrategier är en grundläggande princip
D) Rätt - Automatisk skalning nämns inte som en grundläggande princip i materialet
```

</details>

---

128. Vad är syftet med att använda Docker volumes i databastestning?

A) Att förbättra nätverksprestandan
B) Att persistera data mellan containernedstängningar och uppstarter
C) Att automatisera databasmigreringar
D) Att generera testdata

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Docker volumes är inte primärt för att förbättra nätverksprestanda
B) Rätt - Volumes används för att persistera data mellan containeromstarter
C) Fel - Volumes automatiserar inte migreringar, även om de kan användas i processen
D) Fel - Volumes genererar inte testdata, de lagrar data
```

</details>

---

129. Vilken teknik rekommenderas i materialet för att integrera Docker-baserade databaser med JUnit 5?

A) Testcontainers
B) Docker Compose
C) Kubernetes
D) Spring Boot Test

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Rätt - Testcontainers rekommenderas specifikt för integration med JUnit 5
B) Fel - Docker Compose nämns men inte specifikt för JUnit 5-integration
C) Fel - Kubernetes nämns inte i materialet för detta syfte
D) Fel - Spring Boot Test nämns inte i materialet för detta ändamål
```

</details>

---

130. Vad är en vanlig missuppfattning om Docker-databaser enligt materialet?

A) De kräver alltid persistenta volymer
B) De är alltid snabbare än nativa installationer
C) De är omöjliga att skala
D) De är alltid mer säkra än traditionella databaser

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Rätt - Materialet nämner detta som en vanlig missuppfattning
B) Fel - Detta är inte en nämnd missuppfattning; tvärtom nämns att de kan vara nästan lika snabba
C) Fel - Skalbarhet nämns inte som en vanlig missuppfattning
D) Fel - Säkerhet nämns inte som en vanlig missuppfattning på detta sätt
```

</details>

---

131. Vilket verktyg rekommenderas i materialet för att hantera databasmigreringar i Docker-miljöer?

A) Docker Swarm
B) Docker Secrets
C) Kubernetes
D) Liquibase

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Docker Swarm nämns inte för databasmigreringar
B) Fel - Docker Secrets är för säker hantering av hemligheter, inte migreringar
C) Fel - Kubernetes nämns inte för databasmigreringar i detta sammanhang
D) Rätt - Liquibase nämns som ett rekommenderat verktyg för databasmigreringar
```

</details>

---

132. Vilken strategi rekommenderas för att optimera I/O-prestanda i Docker-baserade databastester?

A) Använda tmpfs för temporära filer
B) Öka antalet CPU-kärnor
C) Implementera databasreplikering
D) Minska mängden RAM tilldelad till containern

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Rätt - Användning av tmpfs för temporära filer rekommenderas för I/O-optimering
B) Fel - Ökning av CPU-kärnor nämns inte specifikt för I/O-optimering
C) Fel - Replikering nämns för andra ändamål, inte specifikt I/O-optimering
D) Fel - Minskning av RAM rekommenderas inte för prestandaoptimering
```

</details>

---

133. Vilken säkerhetsaspekt betonas INTE i materialet för Docker-baserad databastestning?

A) Secrets management
B) Nätverksisolering
C) Minsta möjliga behörigheter
D) Kryptering av data i vila

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Secrets management nämns som en viktig säkerhetsaspekt
B) Fel - Nätverksisolering betonas i materialet
C) Fel - Minsta möjliga behörigheter nämns som en viktig princip
D) Rätt - Kryptering av data i vila nämns inte specifikt i materialet
```

</details>

---

134. Vilket av följande är INTE ett rekommenderat användningsområde för Docker-baserade databastester enligt materialet?

A) Continuous Integration pipelines
B) Multi-version databastestning
C) Prestandatestning
D) Produktionsdatabaser

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - CI pipelines nämns som ett reellt användningsfall
B) Fel - Multi-version testning rekommenderas i materialet
C) Fel - Prestandatestning nämns som ett användningsområde
D) Rätt - Produktionsdatabaser nämns inte som ett rekommenderat användningsområde för Docker-baserade tester
```

</details>

---
135. Vilken strategi rekommenderas för att hantera stora datamängder i Docker-baserade databastester?

A) Alltid använda persistenta volymer
B) Implementera databassharding
C) Öka container-storlek obegränsat
D) Undvika stora datamängder i tester

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Persistenta volymer rekommenderas inte alltid, särskilt inte för testmiljöer
B) Rätt - Databassharding nämns som en strategi för att hantera stora datamängder
C) Fel - Obegränsad ökning av containerstorlek rekommenderas inte
D) Fel - Att undvika stora datamängder helt är inte en rekommenderad strategi för alla scenarier
```

</details>

---
136. Vad är ett av de fyra kärnvärdena i det Agila manifestet?

A) Individer och interaktioner framför processer och verktyg
B) Omfattande dokumentation framför fungerande programvara
C) Kontraktsförhandling framför kundsamarbete
D) Att följa en plan framför anpassning till förändring

<details>
<summary>Svar:</summary>
Rätt svar: A

</details>

---

137. Hur lång är en typisk sprint i SCRUM?

A) 6-8 veckor
B) 1-4 veckor
C) 2-6 månader
D) 1-2 dagar

<details>
<summary>Svar:</summary>
Rätt svar: B

</details>

---

138. Vilken är en vanlig missuppfattning om agila metoder?

A) Att de kräver mycket dokumentation
B) Att de kräver daglig kommunikation
C) Att de eliminerar all dokumentation
D) Att de fungerar bäst för stora team

<details>
<summary>Svar:</summary>
Rätt svar: C

</details>

---

139. Hur många medlemmar bör ett SCRUM-team bestå av?

A) 15-20 medlemmar
B) 10-15 medlemmar
C) 1-2 medlemmar
D) 3-9 medlemmar

<details>
<summary>Svar:</summary>
Rätt svar: D

</details>

---

140. Vilket verktyg används ofta för att estimera uppgifter i agil utveckling?

A) Story Points
B) Tidrapporter
C) Gantt-scheman
D) Detaljerade tidsplaner

<details>
<summary>Svar:</summary>
Rätt svar: A

</details>

---

141. Vad är huvudsyftet med dagliga stand-up möten?

A) Att utvärdera färdiga uppgifter
B) Att koordinera dagens arbete och identifiera hinder
C) Att ha långa tekniska diskussioner
D) Att planera kommande sprints

<details>
<summary>Svar:</summary>
Rätt svar: B

</details>

---

142. Vilken är en av huvudprinciperna i Kanban?

A) Att maximera antal parallella uppgifter
B) Att ha långa utvecklingscykler
C) Att begränsa arbete i process (WIP)
D) Att undvika visualisering av arbetsflödet

<details>
<summary>Svar:</summary>
Rätt svar: C

</details>

---

143. Vad är ett viktigt kännetecken för agil utveckling?

A) Vattenfallsbaserad utveckling
B) Minimal kundinteraktion
C) Omfattande förhandsplanering
D) Iterativ och inkrementell utveckling

<details>
<summary>Svar:</summary>
Rätt svar: D

</details>

---

144. Vilken roll spelar retrospektiv i SCRUM?

A) Att demonstrera ny funktionalitet
B) Att skriva teknisk dokumentation
C) Att utvärdera och förbättra teamets process
D) Att planera nästa sprint

<details>
<summary>Svar:</summary>
Rätt svar: C

</details>

---

145. Vilket påstående om agil dokumentation är korrekt?

A) Dokumentation ska vara omfattande och detaljerad
B) Värdefull dokumentation prioriteras över onödig paperwork
C) All dokumentation ska elimineras
D) Dokumentation ska alltid vara statisk

<details>
<summary>Svar:</summary>
Rätt svar: B

</details>

---

146. Vad är en av huvuduppgifterna för en Produktägare i Scrum?

A) Att hantera och prioritera produktbackloggen
B) Att facilitera de dagliga Scrum-mötena
C) Att utföra kodgranskning
D) Att undanröja hinder för utvecklingsteamet

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Rätt - Produktägaren ansvarar för att hantera och prioritera produktbackloggen
B) Fel - Detta är Scrum Masterns roll
C) Fel - Detta är en del av utvecklingsteamets ansvar
D) Fel - Detta är Scrum Masterns uppgift
```

</details>

---

147. Hur många medlemmar bör ett utvecklingsteam i Scrum vanligtvis bestå av?

A) 10-15 medlemmar
B) 3-9 medlemmar
C) 15-20 medlemmar
D) 1-2 medlemmar

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Detta överskrider det rekommenderade antalet
B) Rätt - Ett Scrum-team bör bestå av 3-9 medlemmar för optimal effektivitet
C) Fel - Detta är för många medlemmar för ett effektivt Scrum-team
D) Fel - Detta är för få medlemmar för att vara tvärfunktionellt
```

</details>

---

148. Vad är ett Inkrement i Scrum?

A) Ett verktyg för att mäta teamets hastighet
B) En lista över alla planerade funktioner
C) Summan av alla färdiga produktbackloggsposter under en sprint
D) En plan för kommande sprintar

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Detta beskriver velocity-mätning
B) Fel - Detta beskriver snarare produktbackloggen
C) Rätt - Ett inkrement är summan av alla färdiga produktbackloggsposter under en sprint
D) Fel - Detta är relaterat till release planning
```

</details>

---

149. Vilken påstående är korrekt om Scrum Master?

A) Bestämmer vilka funktioner som ska utvecklas
B) Ska mikrohantera utvecklingsteamets arbete
C) Är en traditionell projektledare som styr teamet
D) Är en faciliterande roll som stödjer Scrum-processen

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Detta är Produktägarens ansvar
B) Fel - Mikrohantering strider mot Scrums principer
C) Fel - Scrum Master är inte en traditionell projektledare
D) Rätt - Scrum Master är en facilitator som stödjer processen
```

</details>

---

150. Vad är produktbackloggen i Scrum?

A) En lista över tekniska buggar
B) Ett schema över teamets semesterdagar
C) En dynamisk lista över allt som kan behövas i produkten
D) En statisk lista över krav som inte kan ändras

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Detta är för begränsat, produktbackloggen innehåller mer än bara buggar
B) Fel - Detta är inte relaterat till produktbackloggen
C) Rätt - Produktbackloggen är en dynamisk lista över allt som kan behövas i produkten
D) Fel - Produktbackloggen är inte statisk utan dynamisk
```

</details>

---

151. Vad är huvudsyftet med dagliga Scrum-möten?

A) Att planera kommande sprint
B) Att synkronisera teamets arbete och identifiera hinder
C) Att utvärdera teamets prestanda
D) Att presentera färdigt arbete för intressenter

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Detta görs under sprintplanering
B) Rätt - Dagliga Scrum-möten används för att synkronisera arbetet och identifiera hinder
C) Fel - Detta görs under sprintåterblick
D) Fel - Detta är syftet med sprintgranskning
```

</details>

---

152. Hur lång bör ett dagligt Scrum-möte vara?

A) 45 minuter
B) 60 minuter
C) 15 minuter
D) 30 minuter

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Detta är längre än rekommenderat
B) Fel - Detta är för långt för ett dagligt möte
C) Rätt - Dagliga Scrum-möten ska vara korta och fokuserade, 15 minuter
D) Fel - Detta är längre än rekommenderat
```

</details>

---

153. Vad är "Definition of Done" i Scrum?

A) En beskrivning av sprintmålet
B) Ett schema för releaser
C) En lista över framtida funktioner
D) En formell beskrivning av kvalitetskraven för färdiga uppgifter

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Detta är en annan del av Scrum-processen
B) Fel - Detta är relaterat till release planning
C) Fel - Detta beskriver snarare produktbackloggen
D) Rätt - Definition of Done beskriver kvalitetskraven som måste uppfyllas
```

</details>

---

154. Vad är sprintbackloggen i Scrum?

A) En komplett lista över alla produktkrav
B) En delmängd av produktbackloggen för aktuell sprint
C) En lista över framtida sprintar
D) En lista över alla buggar i systemet

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Detta beskriver snarare produktbackloggen
B) Rätt - Sprintbackloggen är en delmängd av produktbackloggen för aktuell sprint
C) Fel - Detta är relaterat till release planning
D) Fel - Detta är för begränsat
```

</details>

---

155. Vilket påstående om estimering i Scrum är korrekt?

A) Endast Scrum Master får göra estimeringar
B) Estimering måste alltid göras i exakta timmar
C) Estimering behövs inte i Scrum
D) Estimering handlar mer om relativ storlek än exakt tid

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Hela teamet deltar i estimering
B) Fel - Scrum föredrar relativ estimering framför exakt tid
C) Fel - Estimering är en viktig del av Scrum
D) Rätt - Estimering i Scrum fokuserar på relativ storlek
```

</details>

---

156. Vad är huvudsyftet med Sprintåterblick i Scrum?

A) Reflektera över processen och identifiera förbättringsområden
B) Presentera färdigt arbete för intressenter
C) Planera kommande sprint
D) Synkronisera teamets dagliga aktiviteter

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Rätt - Sprintåterblick fokuserar på att reflektera över processen och hitta förbättringsområden
B) Fel - Detta är syftet med Sprintgranskning
C) Fel - Detta görs under Sprintplanering
D) Fel - Detta är syftet med dagligt Scrum-möte
```

</details>

---

157. Vilket är det korrekta syftet med dagligt Scrum-möte?

A) Ett möte för att rapportera till produktägaren
B) En detaljerad genomgång av tekniska problem
C) Ett planeringsmöte för utvecklingsteamet
D) Ett tillfälle för Scrum Master att få statusuppdateringar

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Mötet är primärt för utvecklingsteamet, inte för rapportering
B) Fel - Detaljerade tekniska diskussioner ska tas utanför dagligt Scrum
C) Rätt - Det är ett planeringsmöte för utvecklingsteamet
D) Fel - Detta är en vanlig missuppfattning enligt materialet
```

</details>

---

158. Vilket nyckelord i Gherkin används för att beskriva systemets ursprungliga tillstånd?

A) Then
B) Given
C) When
D) And

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Then används för att specificera det förväntade resultatet
B) Rätt - Given används för att definiera systemets ursprungliga tillstånd
C) Fel - When används för att beskriva en händelse eller aktion
D) Fel - And används för att lägga till ytterligare steg
```

</details>

---

159. Vilken är den rekommenderade maxlängden för ett dagligt Scrum-möte?

A) 45 minuter
B) 60 minuter
C) 30 minuter
D) 15 minuter

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Detta är för långt för ett dagligt möte
B) Fel - Detta är alldeles för långt för ett dagligt möte
C) Fel - Detta är för långt för ett dagligt möte
D) Rätt - Dagligt Scrum ska vara tidsbegränsat till 15 minuter
```

</details>

---

160. Vad är huvudsyftet med Gherkin-syntax i Scrum?

A) Att dokumentera tekniska specifikationer
B) Att tydligt definiera användarberättelser och acceptanskriterier
C) Att mäta teamets prestanda
D) Att skapa automatiserade tester

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Gherkin fokuserar på beteende, inte tekniska detaljer
B) Rätt - Huvudsyftet är att tydligt definiera användarberättelser och acceptanskriterier
C) Fel - Detta är inte syftet med Gherkin
D) Fel - Detta är en möjlig användning men inte huvudsyftet
```

</details>

---

161. Vad är korrekt ordning för Scrum-events i en sprint?

A) Sprintåterblick -> Sprintplanering -> Dagligt Scrum -> Sprintgranskning
B) Dagligt Scrum -> Sprintplanering -> Sprintgranskning -> Sprintåterblick
C) Sprintplanering -> Dagligt Scrum -> Sprintgranskning -> Sprintåterblick
D) Sprintplanering -> Dagligt Scrum -> Sprintåterblick -> Sprintgranskning

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Sprintplanering måste komma först i sprinten
B) Fel - Sprintplanering måste komma först i sprinten
C) Rätt - Detta är den korrekta ordningen enligt Scrum-ramverket
D) Fel - Sprintgranskning kommer före Sprintåterblick
```

</details>

---

162. Hur lång är den rekommenderade tidsboxen för Sprintplanering i en månads sprint?

A) 8 timmar
B) 2 timmar
C) 6 timmar
D) 4 timmar

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Rätt - 8 timmar är den rekommenderade tidsboxen för Sprintplanering i en månads sprint
B) Fel - Detta är för kort tid för Sprintplanering i en månads sprint
C) Fel - Detta är inte en standard tidsbox för något Scrum-event
D) Fel - Detta är tidsboxen för Sprintgranskning
```

</details>

---

163. Vilket påstående om Sprintgranskning är korrekt?

A) Den är primärt för Scrum Master
B) Den presenterar färdigt arbete för intressenter
C) Den hålls i början av sprinten
D) Den fokuserar på processförbättringar

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Den involverar hela teamet och intressenter
B) Rätt - Sprintgranskning är där teamet presenterar färdigt arbete för intressenter
C) Fel - Sprintgranskning hålls i slutet av sprinten
D) Fel - Detta är syftet med Sprintåterblick
```

</details>

---

164. Vilka är de tre standardfrågorna som besvaras under dagligt Scrum?

A) Hur mår teamet?, Vad är status?, Vilka risker finns?
B) Vad är klart?, Vad återstår?, När blir det klart?
C) Vad är blockerande?, Vad behöver vi hjälp med?, Hur ligger vi till tidsmässigt?
D) Vad gjorde jag igår?, Vad ska jag göra idag?, Finns det några hinder?

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Dessa frågor fokuserar för mycket på status och inte på planering
B) Fel - Detta liknar mer en statusrapport än dagligt Scrum-frågor
C) Fel - Detta är inte de standardfrågor som används i dagligt Scrum
D) Rätt - Detta är de tre standardfrågorna som ska besvaras under dagligt Scrum
```

</details>

---

165. Vad är det huvudsakliga syftet med "Background" i Gherkin?

A) Att dokumentera tekniska krav
B) Att beskriva användarberättelser
C) Att sätta upp gemensamma förutsättningar för flera scenarion
D) Att definiera testdata

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Gherkin fokuserar på beteende, inte tekniska krav
B) Fel - Användarberättelser beskrivs i Feature-delen
C) Rätt - Background används för att definiera gemensamma förutsättningar för flera scenarion
D) Fel - Testdata kan inkluderas men är inte huvudsyftet
```

</details>

---

166. Vad är det huvudsakliga syftet med User Stories?

A) Att beskriva tekniska implementationsdetaljer
B) Att ersätta teknisk dokumentation
C) Att fånga användarens behov och önskad funktionalitet
D) Att definiera systemarkitekturen

<details>
<summary>Svar:</summary>
Rätt svar: C
</details>

---

167. Vilket format följer en korrekt strukturerad User Story?

A) Problem - Lösning - Implementation
B) Krav - Design - Test
C) Vem - Vad - När - Var
D) Som [roll] - Vill jag [funktion] - Så att [nytta]

<details>
<summary>Svar:</summary>
Rätt svar: D
</details>

---

168. Vad står I:et för i INVEST-kriterierna för User Stories?

A) Independent
B) Integrated
C) Important
D) Innovative

<details>
<summary>Svar:</summary>
Rätt svar: A
</details>

---

169. Vilken är den korrekta ordningen i Gherkin-syntax?

A) When - Then - Given
B) Given - When - Then
C) Then - Given - When
D) When - Given - Then

<details>
<summary>Svar:</summary>
Rätt svar: B
</details>

---

170. Vad är huvudsyftet med acceptanskriterier?

A) Att beskriva tekniska implementationsdetaljer
B) Att definiera när en User Story anses vara uppfylld
C) Att ersätta användarmanual
D) Att dokumentera kodstrukturen

<details>
<summary>Svar:</summary>
Rätt svar: B
</details>

---

171. Vad är Behavior-Driven Development (BDD)?

A) Ett verktyg för kodgranskning
B) En metod för att skriva teknisk dokumentation
C) Ett system för versionshantering
D) En utvecklingsmetodik fokuserad på beteende och användarnytta

<details>
<summary>Svar:</summary>
Rätt svar: D
</details>

---

172. Hur bör en User Story brytas ned när den blir för komplex?

A) Genom att ta bort acceptanskriterier
B) Genom att skriva om den som teknisk specifikation
C) Genom att dela upp den i mindre, oberoende stories
D) Genom att lägga till fler tekniska detaljer

<details>
<summary>Svar:</summary>
Rätt svar: C
</details>

---

173. Vilket påstående är sant om User Stories?

A) De fungerar som samtalsstartare för vidare diskussion
B) De måste innehålla all teknisk information
C) De ska vara långa och detaljerade
D) De ersätter all annan dokumentation

<details>
<summary>Svar:</summary>
Rätt svar: A
</details>

---

174. Vad är best practice för att hålla User Stories uppdaterade?

A) Bara låta utvecklare uppdatera dem
B) Låsa dem när de är skrivna
C) Uppdatera dem vid projektets slut
D) Hålla regelbundna "backlog grooming"-sessioner

<details>
<summary>Svar:</summary>
Rätt svar: D
</details>

---

175. Vilken är den viktigaste aspekten när man skriver acceptanskriterier?

A) De ska innehålla tekniska detaljer
B) De ska vara mätbara och verifierbara
C) De ska vara svåra att testa
D) De ska vara så få som möjligt

<details>
<summary>Svar:</summary>
Rätt svar: B
</details>

---

176. Vad är det primära syftet med acceptanskriterier?

A) Att definiera tekniska specifikationer
B) Att automatisera all testning
C) Att specificera exakt när en User Story anses vara uppfylld
D) Att ersätta User Stories

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Acceptanskriterier fokuserar på beteende, inte teknisk implementation
B) Fel - Automatisering är en möjlig följd, men inte huvudsyftet
C) Rätt - Detta är det huvudsakliga syftet enligt materialet
D) Fel - Acceptanskriterier kompletterar User Stories, ersätter dem inte
```

</details>

---

177. Vilken är den korrekta ordningen för nyckelorden i ett Gherkin-scenario?

A) When, Given, Then
B) Then, Given, When
C) Given, Then, When
D) Given, When, Then

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Fel ordning som inte följer logiskt flöde
B) Fel - Helt omvänd ordning från det korrekta
C) Fel - Then kommer före When vilket inte är logiskt
D) Rätt - Detta är den korrekta ordningen enligt Gherkin-syntax
```

</details>

---

178. Vilket påstående är korrekt angående Gherkin-syntax?

A) Den kan endast användas av utvecklare
B) Den ska kunna förstås av både tekniska och icke-tekniska intressenter
C) Den måste innehålla kodexempel
D) Den är endast till för teknisk dokumentation

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Gherkin är designad för alla intressenter, inte bara utvecklare
B) Rätt - Gherkin ska vara förståelig för alla projektdeltagare
C) Fel - Gherkin beskriver beteende, inte implementation
D) Fel - Gherkin är ett kommunikationsverktyg för alla intressenter
```

</details>

---

179. Vad är en "Background" i Gherkin?

A) En teknisk specifikation
B) Ett sätt att definiera gemensamma förutsättningar för alla scenarion
C) En beskrivning av projektets bakgrund
D) En lista över kända buggar

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Background är inte en teknisk specifikation
B) Rätt - Background definierar gemensamma förutsättningar för scenarion
C) Fel - Background används inte för projektbeskrivning
D) Fel - Background används inte för att lista buggar
```

</details>

---

180. Vad är huvudsyftet med taggning i Gherkin?

A) Att dokumentera kodändringar
B) Att markera buggfixar
C) Att kategorisera och filtrera scenarion
D) Att versionshantera dokument

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - Taggning används inte primärt för att dokumentera kod
B) Fel - Taggning är inte avsett för bugghantering
C) Rätt - Taggar används för att organisera och filtrera scenarion
D) Fel - Versionshantering är inte syftet med taggning
```

</details>

---

181. Vilken är den mest lämpliga användningen av Scenario Outline i Gherkin?

A) För att dokumentera projektmål
B) För att testa samma scenario med olika datapunkter
C) För att beskriva tekniska detaljer
D) För att definiera projektroller

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel - Det är inte ett verktyg för projektdokumentation
B) Rätt - Scenario Outline används för att testa olika datapunkter
C) Fel - Scenario Outline används inte för tekniska detaljer
D) Fel - Det används inte för att definiera roller
```

</details>

---

182. Vad kännetecknar bra acceptanskriterier?

A) De fokuserar på implementationsdetaljer
B) De är mycket tekniskt detaljerade
C) De är vaga och generella
D) De är specifika och mätbara

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel - Implementation är inte fokus för acceptanskriterier
B) Fel - Acceptanskriterier ska inte vara tekniskt detaljerade
C) Fel - Vaga kriterier är inte effektiva
D) Rätt - Specifika och mätbara kriterier är en grundläggande egenskap
```

</details>

---

183. Hur bör man hantera prestandakrav i acceptanskriterier?

A) Inkludera specifika, mätbara prestandamål
B) Endast fokusera på funktionella krav
C) Behandla dem som mindre viktiga
D) Ignorera dem helt

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Rätt - Prestandakrav ska vara specifika och mätbara
B) Fel - Både funktionella och icke-funktionella krav är viktiga
C) Fel - Prestandakrav är lika viktiga som andra krav
D) Fel - Prestandakrav är viktiga och ska inte ignoreras
```

</details>

---

184. Hur ofta bör acceptanskriterier uppdateras?

A) Endast vid projektslut
B) Endast vid projektstart
C) Kontinuerligt när krav förändras
D) Aldrig efter första versionen

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel - För sent att uppdatera vid projektslut
B) Fel - Kriterier behöver uppdateras under projektets gång
C) Rätt - Kontinuerlig uppdatering är nödvändig när krav ändras
D) Fel - Kriterier är levande dokument som behöver uppdateras
```

</details>

---

185. Vilken roll spelar Gherkin i testautomatisering?

A) Den fungerar som grund för automatiserade tester
B) Den har ingen koppling till testautomatisering
C) Den ersätter behovet av testare
D) Den genererar automatiskt all testkod

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Rätt - Gherkin-scenarion kan användas som bas för automatiserade tester
B) Fel - Gherkin har en direkt koppling till testautomatisering
C) Fel - Gherkin ersätter inte testare utan är ett verktyg
D) Fel - Gherkin genererar inte automatiskt kod
```

</details>

---

186. Vad är det primära syftet med Behavior-Driven Development (BDD)?

A) Att fokusera på teknisk implementation
B) Att ersätta alla andra testmetoder
C) Att definiera systemets beteende ur ett användarperspektiv
D) Att endast automatisera enhetstester

<details>
<summary>Svar:</summary>
Rätt svar: C
</details>

---

187. Vilken är den huvudsakliga skillnaden mellan BDD och TDD?

A) TDD är helt manuellt medan BDD är automatiserat
B) BDD fokuserar på acceptanstester medan TDD fokuserar på enhetstester
C) BDD är endast för testare medan TDD är för utvecklare
D) TDD använder Gherkin medan BDD använder JUnit

<details>
<summary>Svar:</summary>
Rätt svar: B
</details>

---

188. Vilket verktyg används för att skriva beteendebeskrivningar i BDD?

A) Gherkin
B) Maven
C) JUnit
D) Jenkins

<details>
<summary>Svar:</summary>
Rätt svar: A
</details>

---

189. Vilka roller bör vara involverade i BDD-processen?

A) Endast utvecklare
B) Utvecklare och testare
C) Utvecklare, testare och affärsintressenter
D) Endast testare och affärsintressenter

<details>
<summary>Svar:</summary>
Rätt svar: C
</details>

---

190. Vad är ett viktigt första steg i BDD-processen?

A) Skriva kod
B) Köra automatiserade tester
C) Implementera continuous integration
D) Definiera User Stories och acceptanskriterier

<details>
<summary>Svar:</summary>
Rätt svar: D
</details>

---

191. Hur bör scenarion i BDD skrivas?

A) Från användarens perspektiv
B) Med fokus på tekniska detaljer
C) Från systemets perspektiv
D) Med fokus på databasstrukturer

<details>
<summary>Svar:</summary>
Rätt svar: A
</details>

---

192. Vad är bästa praxis för att hantera gemensamma förutsättningar i flera scenarion?

A) Duplicera koden i varje scenario
B) Använda Backgrounds i Gherkin
C) Skapa separata testklasser
D) Ignorera gemensamma förutsättningar

<details>
<summary>Svar:</summary>
Rätt svar: B
</details>

---

193. Vilken typ av tester är mest lämpade att köra parallellt i BDD?

A) Scenarion som delar samma data
B) Alla typer av scenarion
C) Scenarion som är oberoende av varandra
D) Scenarion med databaskopplingar

<details>
<summary>Svar:</summary>
Rätt svar: C
</details>

---

194. Hur bör BDD-tester integreras i utvecklingsprocessen?

A) Endast vid större releaser
B) Kontinuerligt i CI/CD-pipeline
C) Efter att all utveckling är klar
D) Köras manuellt vid behov

<details>
<summary>Svar:</summary>
Rätt svar: B
</details>

---

195. Vad är syftet med custom parameter types i BDD?

A) Att göra testerna långsammare
B) Att öka antalet tester
C) Att förenkla databasanrop
D) Att göra scenarion mer läsbara och robusta

<details>
<summary>Svar:</summary>
Rätt svar: D
</details>

---

196. Vilket av följande är INTE en typ av testtäckning som diskuteras i materialet?

A) Radtäckning
B) Grentäckning
C) Funktionstäckning
D) Villkorstäckning

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Felaktigt. Radtäckning nämns specifikt som en typ av testtäckning i materialet.
B) Felaktigt. Grentäckning är en av de typer som diskuteras i materialet.
C) Korrekt. Funktionstäckning nämns inte som en specifik typ av testtäckning i materialet.
D) Felaktigt. Villkorstäckning tas upp som en av typerna av testtäckning.
```

</details>

---

197. Vad är huvudsyftet med att mäta testtäckning?

A) Att ersätta manuell kodgranskning
B) Att kvantifiera hur omfattande testsviten är
C) Att garantera att koden är helt bugfri
D) Att öka kodens prestanda

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Felaktigt. Testtäckning är inte avsett att ersätta manuell kodgranskning.
B) Korrekt. Huvudsyftet med testtäckning är att ge en kvantitativ indikation på testsvitens omfattning.
C) Felaktigt. Testtäckning garanterar inte att koden är bugfri.
D) Felaktigt. Att mäta testtäckning påverkar inte direkt kodens prestanda.
```

</details>

---

198. Vilket verktyg nämns i materialet för att mäta testtäckning i Java-projekt?

A) JaCoCo
B) Maven
C) JUnit
D) Gradle

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Korrekt. JaCoCo nämns specifikt som ett verktyg för att mäta testtäckning i Java.
B) Felaktigt. Maven är ett byggverktyg, inte primärt för att mäta testtäckning.
C) Felaktigt. JUnit är ett ramverk för att skriva tester, inte för att mäta täckning.
D) Felaktigt. Gradle nämns inte i materialet för att mäta testtäckning.
```

</details>

---

199. Vilken påstående om 100% testtäckning är korrekt enligt materialet?

A) Det garanterar inte att koden är bugfri
B) Det garanterar att koden är helt felfri
C) Det är alltid det optimala målet för alla projekt
D) Det tar hänsyn till alla möjliga indata och scenarier

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Korrekt. Materialet klargör att 100% täckning inte garanterar att koden är bugfri.
B) Felaktigt. Materialet betonar att 100% täckning inte garanterar felfri kod.
C) Felaktigt. Materialet antyder att fokus bör ligga på testernas kvalitet snarare än enbart täckning.
D) Felaktigt. Testtäckning tar inte hänsyn till alla möjliga indata eller scenarier.
```

</details>

---

200. Vad mäter cyclomatic complexity primärt?

A) Antalet funktioner i en klass
B) Antalet linjärt oberoende vägar genom koden
C) Antalet rader kod
D) Tiden det tar att exekvera koden

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Felaktigt. Det mäter inte antalet funktioner i en klass.
B) Korrekt. Cyclomatic complexity mäter antalet linjärt oberoende vägar genom koden.
C) Felaktigt. Cyclomatic complexity mäter inte antalet rader kod.
D) Felaktigt. Cyclomatic complexity är inte ett tidsmått för kodexekvering.
```

</details>

---

201. Vad är huvudsyftet med mutation testing?

A) Att öka kodtäckningen
B) Att minska antalet kodrader
C) Att automatiskt fixa buggar i koden
D) Att utvärdera testernas kvalitet och effektivitet

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Felaktigt. Mutation testing syftar inte primärt till att öka kodtäckningen.
B) Felaktigt. Det handlar inte om att minska antalet kodrader.
C) Felaktigt. Mutation testing fixar inte automatiskt buggar.
D) Korrekt. Huvudsyftet med mutation testing är att utvärdera testernas kvalitet och effektivitet.
```

</details>

---

202. Vilket av följande är en vanlig missuppfattning om testtäckning enligt materialet?

A) Testtäckning mäter endast exekverad kod
B) Låg testtäckning indikerar alltid dålig kodkvalitet
C) Hög testtäckning garanterar högkvalitativa tester
D) Testtäckning är oviktigt för kodkvalitet

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Felaktigt. Detta är faktiskt en korrekt beskrivning av vad testtäckning mäter.
B) Felaktigt. Denna missuppfattning nämns inte specifikt i materialet.
C) Korrekt. Detta nämns specifikt som en vanlig missuppfattning i materialet.
D) Felaktigt. Materialet betonar vikten av testtäckning, men som ett verktyg snarare än ett mål.
```

</details>

---

203. Vilken är en rekommenderad best practice för användning av testtäckning enligt materialet?

A) Enbart fokusera på radtäckning
B) Använda täckning som guide för att identifiera områden som behöver mer testning
C) Alltid sträva efter 100% täckning oavsett kostnad
D) Ignorera täckningssiffror helt och hållet

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Felaktigt. Materialet rekommenderar inte att enbart fokusera på en typ av täckning.
B) Korrekt. Detta nämns specifikt som en best practice i materialet.
C) Felaktigt. Materialet rekommenderar inte att alltid sträva efter 100% täckning.
D) Felaktigt. Att helt ignorera täckningssiffror rekommenderas inte.
```

</details>

---

204. Vilket påstående om relationen mellan cyclomatic complexity och testtäckning är korrekt?

A) Komplexitet och täckning är helt orelaterade koncept
B) Låg komplexitet garanterar hög testtäckning
C) Högre komplexitet kräver ofta färre tester
D) Högre komplexitet indikerar ofta behov av fler tester för fullständig täckning

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Felaktigt. Materialet beskriver en relation mellan dessa koncept.
B) Felaktigt. Låg komplexitet garanterar inte automatiskt hög testtäckning.
C) Felaktigt. Högre komplexitet tenderar att kräva fler, inte färre, tester.
D) Korrekt. Detta påstående reflekterar korrekt relationen som beskrivs i materialet.
```

</details>

---

205. Vad är en potentiell nackdel med att mäta testtäckning enligt materialet?

A) Det ökar alltid utvecklingstiden markant
B) Det kan leda till falsk säkerhet
C) Det gör koden långsammare att exekvera
D) Det kräver manuell kodgranskning

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Felaktigt. Även om det kan påverka byggprocessen, nämns inte detta som en betydande ökning av utvecklingstiden.
B) Korrekt. Materialet varnar för att hög testtäckning kan leda till falsk säkerhet.
C) Felaktigt. Att mäta täckning påverkar inte direkt kodens exekveringshastighet.
D) Felaktigt. Testtäckningsmätning kräver inte manuell kodgranskning.
```

</details>

---

206. Vad är huvudsyftet med mutation testing?

A) Att utvärdera testernas kvalitet och effektivitet
B) Att öka antalet tester i en testsvit
C) Att mäta kodtäckning
D) Att automatiskt generera nya tester

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Korrekt. Mutation testing introducerar små förändringar för att utvärdera hur väl testerna upptäcker dessa, vilket ger insikt i testernas kvalitet.
B) Fel. Mutation testing syftar inte primärt till att öka antalet tester.
C) Fel. Att mäta kodtäckning är en annan teknik, inte huvudsyftet med mutation testing.
D) Fel. Även om detta kan vara en bieffekt, är det inte huvudsyftet med mutation testing.
```

</details>

---

207. Vilken av följande är inte en grundläggande princip för mutation testing?

A) Köra tester mot muterad kod
B) Analysera överlevande mutationer
C) Generera nya testfall automatiskt
D) Introducera små förändringar i koden

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel. Att köra tester mot muterad kod är en central del av processen.
B) Fel. Analys av överlevande mutationer är en viktig del av mutation testing.
C) Korrekt. Automatisk generering av nya testfall är inte en grundläggande princip för mutation testing, även om det kan vara en följdåtgärd.
D) Fel. Detta är en grundläggande princip för mutation testing.
```

</details>

---

208. Vilket påstående om mutation score är korrekt?

A) Den mäter procentandelen av koden som täcks av tester
B) Den ersätter traditionell testtäckning
C) En låg mutation score indikerar alltid bra tester
D) Den beräknas som andelen dödade mutationer

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel. Detta beskriver traditionell kodtäckning, inte mutation score.
B) Fel. Mutation score kompletterar traditionell testtäckning snarare än ersätter den.
C) Fel. En hög mutation score indikerar vanligtvis bättre tester, inte en låg.
D) Korrekt. Mutation score beräknas som procentandelen dödade mutationer av det totala antalet introducerade mutationer.
```

</details>

---

209. Vilken är den primära fördelen med mutation testing jämfört med traditionell testtäckning?

A) Det eliminerar behovet av manuell testning
B) Det ger djupare insikt i testernas kvalitet
C) Det är snabbare att utföra
D) Det kräver färre tester

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel. Mutation testing ersätter inte behovet av manuell testning.
B) Korrekt. Mutation testing ger en djupare förståelse för hur effektiva testerna är på att upptäcka faktiska förändringar i koden.
C) Fel. Mutation testing är ofta mer tidskrävande än traditionell testtäckning.
D) Fel. Mutation testing kräver inte nödvändigtvis färre tester.
```

</details>

---

210. Vad menas med en "överlevande mutation" i kontexten av mutation testing?

A) En mutation som genererar nya testfall
B) En mutation som orsakar kompileringsfel
C) En mutation som inte upptäcks av testerna
D) En mutation som förbättrar kodens prestanda

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Fel. Överlevande mutationer genererar inte automatiskt nya testfall.
B) Fel. Mutationer som orsakar kompileringsfel räknas vanligtvis inte som giltiga mutationer.
C) Korrekt. En överlevande mutation är en förändring i koden som inte upptäcks av de befintliga testerna.
D) Fel. Överlevande mutationer handlar inte om prestandaförbättringar.
```

</details>

---

211. Vilket av följande är ett vanligt verktyg för att utföra mutation testing i Java-projekt?

A) JUnit
B) PIT
C) Selenium
D) Mockito

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel. JUnit är ett ramverk för enhetstestning, inte specifikt för mutation testing.
B) Korrekt. PIT (PIT Mutation Testing) är ett populärt verktyg för mutation testing i Java-projekt.
C) Fel. Selenium är ett verktyg för webbläsarautomatisering, inte för mutation testing.
D) Fel. Mockito är ett mockramverk, inte ett verktyg för mutation testing.
```

</details>

---

212. Vilken strategi rekommenderas inte för att hantera prestandaproblem vid mutation testing av stora projekt?

A) Selektiv mutation
B) Öka antalet mutationer
C) Inkrementell mutation testing
D) Parallell exekvering

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel. Selektiv mutation är en giltig strategi för att förbättra prestandan.
B) Korrekt. Att öka antalet mutationer skulle förvärra prestandaproblemen, inte lösa dem.
C) Fel. Inkrementell mutation testing är en rekommenderad strategi för att hantera stora projekt.
D) Fel. Parallell exekvering kan effektivt minska körningstiden för mutation testing.
```

</details>

---

213. Vilket påstående om ekvivalenta mutationer är korrekt?

A) De kan inte dödas av några tester
B) De bör alltid elimineras från mutation testing
C) De indikerar alltid fel i koden
D) De förbättrar kodens prestanda

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Korrekt. Ekvivalenta mutationer ändrar koden utan att påverka dess beteende, vilket gör att de inte kan dödas av tester.
B) Fel. Även om de kan vara utmanande, bör ekvivalenta mutationer inte nödvändigtvis elimineras helt från mutation testing.
C) Fel. Ekvivalenta mutationer indikerar inte nödvändigtvis fel i koden.
D) Fel. Ekvivalenta mutationer påverkar inte kodens prestanda.
```

</details>

---

214. Vilken är en lämplig åtgärd om mutation score är oväntat låg?

A) Öka kodtäckningen till 100%
B) Granska och förbättra testernas kvalitet
C) Ignorera resultaten
D) Minska antalet tester

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Fel. Även om ökad kodtäckning kan hjälpa, är 100% täckning inte alltid möjlig eller nödvändig, och garanterar inte hög mutation score.
B) Korrekt. Att granska och förbättra testernas kvalitet är en lämplig åtgärd för att höja mutation score.
C) Fel. Att ignorera resultaten missar möjligheten att förbättra testsviten.
D) Fel. Att minska antalet tester skulle troligen försämra situationen ytterligare.
```

</details>

---

215. Hur kan mutation testing bidra till att förbättra kodens säkerhet?

A) Genom att blockera alla externa anslutningar
B) Genom att automatiskt laga säkerhetsbrister
C) Genom att kryptera känslig data
D) Genom att identifiera svagheter i testningen av säkerhetskritiska delar

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Fel. Att blockera externa anslutningar är inte en funktion av mutation testing.
B) Fel. Mutation testing lagar inte automatiskt några brister.
C) Fel. Kryptering av data är inte en direkt funktion av mutation testing.
D) Korrekt. Mutation testing kan hjälpa till att identifiera svagheter i testningen av säkerhetskritiska delar av koden.
```

</details>

---

216. Vilket av följande är ett huvudsyfte med att använda mutation testing-verktyg i Java-projekt?

A) Att ersätta traditionella enhetstester
B) Att automatisera processen att generera mutanter och köra tester
C) Att optimera kompileringsprocessen
D) Att öka prestandan i Java-applikationer

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Felaktigt. Mutation testing kompletterar traditionella enhetstester snarare än ersätter dem.
B) Korrekt. Mutation testing-verktyg automatiserar processen att generera mutanter, köra tester och analysera resultaten.
C) Felaktigt. Mutation testing påverkar inte direkt kompileringsprocessen.
D) Felaktigt. Mutation testing fokuserar på att förbättra testkvaliteten, inte applikationens prestanda.
```

</details>

---

217. Vilken påstående är korrekt angående integrationen av mutation testing-verktyg i Java-projekt?

A) Det fungerar endast med specifika JDK-versioner
B) Det kan enkelt integreras med byggverktyg som Maven eller Gradle
C) Det är omöjligt att integrera i CI/CD-pipelines
D) Det kräver alltid omfattande omstrukturering av existerande kod

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Felaktigt. Mutation testing-verktyg är generellt kompatibla med olika JDK-versioner.
B) Korrekt. Verktyg som PIT kan enkelt integreras med populära byggverktyg som Maven och Gradle.
C) Felaktigt. Mutation testing kan integreras i CI/CD-pipelines för kontinuerlig kvalitetsövervakning.
D) Felaktigt. Moderna mutation testing-verktyg är designade för enkel integration utan omfattande kodändringar.
```

</details>

---

218. Vad är huvudsyftet med att använda inkrementell mutation testing?

A) Att eliminera behovet av manuell kodgranskning
B) Att minska körtiden genom att fokusera på nyligen ändrad kod
C) Att öka antalet genererade mutanter
D) Att förbättra precisionen i testresultaten

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Felaktigt. Mutation testing ersätter inte behovet av manuell kodgranskning.
B) Korrekt. Inkrementell mutation testing fokuserar på nyligen ändrad kod för att minska körtiden.
C) Felaktigt. Inkrementell testing minskar snarare antalet mutanter som behöver testas.
D) Felaktigt. Syftet är inte primärt att förbättra precisionen, utan att effektivisera processen.
```

</details>

---

219. Vilken av följande är en vanlig missuppfattning om mutation testing?

A) Det kan endast användas för små projekt
B) Det kan bara användas för backend-kod
C) Det tar för lång tid för att vara praktiskt användbart
D) Det kräver specialiserad hårdvara för att köras

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Felaktigt. Mutation testing kan användas för projekt av olika storlekar.
B) Felaktigt. Mutation testing kan användas för både backend- och frontend-kod.
C) Korrekt. Detta är en vanlig missuppfattning, men moderna verktyg använder optimeringar för att minska körtiden.
D) Felaktigt. Specialiserad hårdvara är inte ett krav för mutation testing.
```

</details>

---

220. Vilket av följande är ett rekommenderat sätt att hantera prestandautmaningar i mutation testing för stora projekt?

A) Att endast köra mutation testing vid stora releaser
B) Att implementera distribuerad exekvering på flera maskiner
C) Att helt undvika mutation testing
D) Att manuellt granska varje genererad mutant

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Felaktigt. Regelbunden körning rekommenderas för kontinuerlig kvalitetsövervakning.
B) Korrekt. Distribuerad exekvering på flera maskiner kan avsevärt förbättra prestandan för stora projekt.
C) Felaktigt. Att helt undvika mutation testing är inte rekommenderat, då det kan ge värdefulla insikter.
D) Felaktigt. Manuell granskning av varje mutant skulle vara mycket tidskrävande och opraktiskt.
```

</details>

---

221. Vad är huvudsyftet med att använda "mutation sampling" i mutation testing?

A) Att eliminera falska positiva resultat
B) Att öka antalet genererade mutanter
C) Att testa en representativ delmängd av mutationer för att spara tid
D) Att förbättra precisionen i enskilda tester

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Felaktigt. Även om det kan minska antalet falska positiva, är det inte huvudsyftet.
B) Felaktigt. Mutation sampling minskar snarare än ökar antalet testade mutanter.
C) Korrekt. Mutation sampling används för att testa en representativ delmängd och därmed spara tid.
D) Felaktigt. Det påverkar inte direkt precisionen i enskilda tester.
```

</details>

---

222. Vilket av följande är en rekommenderad strategi för att införa mutation testing i ett stort, etablerat projekt?

A) Gradvis öka omfattningen av mutation testing över tid
B) Endast tillämpa det på nya funktioner
C) Implementera det omedelbart för hela kodbasen
D) Ignorera mutation testing helt för stora projekt

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Korrekt. En gradvis ökning av omfattningen är en effektiv strategi för stora projekt.
B) Felaktigt. Att begränsa det till endast nya funktioner missar möjligheter att förbättra existerande kod.
C) Felaktigt. Detta kan vara överväldigande och ineffektivt för stora projekt.
D) Felaktigt. Stora projekt kan fortfarande dra nytta av mutation testing.
```

</details>

---

223. Vilken av följande är inte en typisk fas i mutation testing-processen?

A) Exekvering av tester mot mutanter
B) Manuell kodoptimering baserad på mutationsresultat
C) Generering av mutanter
D) Kompilering av muterad kod

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Felaktigt. Att köra tester mot mutanter är en central del av mutation testing.
B) Korrekt. Manuell kodoptimering är inte en typisk fas i själva mutation testing-processen.
C) Felaktigt. Detta är en viktig fas i mutation testing.
D) Felaktigt. Kompilering av muterad kod är en del av processen.
```

</details>

---

224. Vad är huvudsyftet med att använda "historikbaserad optimering" i mutation testing?

A) Att minska körtiden genom att fokusera på tidigare problematiska områden
B) Att automatisera skapandet av nya tester
C) Att förbättra precision i testresultaten
D) Att öka antalet genererade mutanter

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Korrekt. Historikbaserad optimering används för att minska körtiden genom att fokusera på tidigare problematiska områden.
B) Felaktigt. Automatiserad skapande av nya tester är inte huvudsyftet med denna teknik.
C) Felaktigt. Huvudsyftet är inte att förbättra precisionen.
D) Felaktigt. Det ökar inte antalet mutanter, utan optimerar vilka som testas.
```

</details>

---

225. Vilket av följande är ett rekommenderat sätt att integrera mutation testing i utvecklarens dagliga arbetsflöde?

A) Begränsa mutation testing till endast seniora utvecklare
B) Använda IDE-plugins för att köra mutation tester direkt från utvecklingsmiljön
C) Kräva att utvecklare manuellt granskar varje mutant
D) Köra fullständig mutation testing före varje commit

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Felaktigt. Att begränsa det till endast seniora utvecklare missar möjligheter för hela teamet att dra nytta av tekniken.
B) Korrekt. IDE-plugins gör mutation testing mer tillgängligt och integrerat i utvecklarens dagliga arbete.
C) Felaktigt. Manuell granskning av varje mutant skulle vara mycket tidskrävande och opraktiskt.
D) Felaktigt. Fullständig mutation testing före varje commit skulle vara ineffektivt och tidskrävande.
```

</details>

---

226. Vad är huvudsyftet med property-based testing?

A) Att generera en mängd olika testfall baserat på definierade egenskaper
B) Att ersätta all manuell testning
C) Att skapa visuella representationer av testresultat
D) Att automatisera kodgranskning

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Korrekt. Huvudsyftet är att generera olika testfall baserat på definierade egenskaper.
B) Felaktigt. Property-based testing ersätter inte all manuell testning, utan kompletterar den.
C) Felaktigt. Detta är inte huvudsyftet med property-based testing.
D) Felaktigt. Även om det kan bidra till kodkvalitet, är detta inte huvudsyftet.
```

</details>

---

227. Vilket av följande är inte ett steg i property-based testing processen?

A) Egenskapsdefinition
B) Datagenerering
C) Manuell kodgranskning
D) Felhantering

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Felaktigt. Egenskapsdefinition är ett viktigt steg i property-based testing.
B) Felaktigt. Datagenerering är en central del av processen.
C) Korrekt. Manuell kodgranskning är inte en del av property-based testing processen.
D) Felaktigt. Felhantering, inklusive "krympning" av exempel, är en del av processen.
```

</details>

---

228. Vilken påstående är korrekt angående property-based testing och exempel-baserad testning?

A) Property-based testing kompletterar exempel-baserad testning
B) Property-based testing ersätter helt exempel-baserad testning
C) Exempel-baserad testning är alltid mer effektiv än property-based testing
D) Property-based testing och exempel-baserad testning kan inte användas tillsammans

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Korrekt. Property-based testing kompletterar exempel-baserad testning.
B) Felaktigt. Detta är en vanlig missuppfattning; de kompletterar varandra.
C) Felaktigt. Effektiviteten beror på sammanhanget och testningsbehoven.
D) Felaktigt. De kan och bör ofta användas tillsammans för bästa täckning.
```

</details>

---

229. Vad är en fördel med property-based testing jämfört med traditionell testning?

A) Det kräver mindre tid att skriva tester
B) Det hittar alltid alla möjliga buggar
C) Det eliminerar behovet av manuell testning helt
D) Det kan avslöja buggar som traditionella tester ofta missar

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Felaktigt. Det kan faktiskt kräva mer tid initialt att definiera robusta egenskaper.
B) Felaktigt. Ingen testmetod kan garantera att hitta alla buggar.
C) Felaktigt. Manuell testning har fortfarande sin plats i en omfattande teststrategi.
D) Korrekt. Property-based testing är särskilt bra på att hitta edge cases och oväntade fel.
```

</details>

---

230. Vad menas med "krympning" i kontexten av property-based testing?

A) Att reducera exekveringstiden för tester
B) Att minska storleken på testsviten
C) Att hitta det minsta exemplet som fortfarande producerar ett fel
D) Att begränsa antalet genererade testfall

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Felaktigt. Detta är inte huvudsyftet med krympning.
B) Felaktigt. Krympning handlar inte om att minska testsviterna.
C) Korrekt. Krympning syftar till att hitta det minsta exemplet som fortfarande orsakar felet.
D) Felaktigt. Detta handlar mer om att konfigurera testgeneratorn, inte om krympning.
```

</details>

---

231. Vilken är en vanlig utmaning vid implementering av property-based testing?

A) Att definiera meningsfulla egenskaper för komplexa funktioner
B) Att generera slumpmässiga testdata
C) Att köra tester parallellt
D) Att integrera med byggsystem

<details>
<summary>Svar:</summary>
Rätt svar: A

```text
A) Korrekt. Att definiera robusta och meningsfulla egenskaper kan vara utmanande, särskilt för komplexa system.
B) Felaktigt. Testramverk hanterar vanligtvis datagenerering automatiskt.
C) Felaktigt. Detta är sällan en huvudutmaning specifik för property-based testing.
D) Felaktigt. Integration med byggsystem är vanligtvis inte en stor utmaning för property-based testing.
```

</details>

---

232. Vilken teknik används ofta i property-based testing för att hantera ogiltiga inputs?

A) Manuell filtrering av testdata
B) Användning av @When annotationen
C) Ökning av antalet genererade testfall
D) Implementering av felhanteringsrutiner i produktionskoden

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Felaktigt. Manuell filtrering används vanligtvis inte i property-based testing.
B) Korrekt. @When annotationen används ofta för att filtrera bort ogiltiga inputs.
C) Felaktigt. Att öka antalet testfall löser inte problemet med ogiltiga inputs.
D) Felaktigt. Detta är en generell god praxis men inte specifikt för property-based testing.
```

</details>

---

233. Vad är en fördel med att använda property-based testing för säkerhetstestning?

A) Det ersätter behovet av säkerhetsgranskningar
B) Det eliminerar behovet av penetrationstestning
C) Det garanterar att inga säkerhetshål finns
D) Det kan generera oväntade eller potentiellt skadliga inputs

<details>
<summary>Svar:</summary>
Rätt svar: D

```text
A) Felaktigt. Säkerhetsgranskningar är fortfarande viktiga i en omfattande säkerhetsstrategi.
B) Felaktigt. Penetrationstestning är fortfarande värdefullt för säkerhetstestning.
C) Felaktigt. Ingen testmetod kan garantera total säkerhet.
D) Korrekt. Property-based testing kan generera oväntade inputs som kan avslöja säkerhetsproblem.
```

</details>

---

234. Vilken av följande är inte en rekommenderad best practice för property-based testing?

A) Använd annotations för att begränsa genererade värden när det behövs
B) Börja med enkla egenskaper och bygg gradvis upp till mer komplexa
C) Fokusera enbart på property-based tester och undvik exempel-baserade tester
D) Använd domänspecifik kunskap för att definiera meningsfulla egenskaper

<details>
<summary>Svar:</summary>
Rätt svar: C

```text
A) Felaktigt. Att använda annotations för att begränsa värden är en användbar teknik.
B) Felaktigt. Detta är en rekommenderad best practice.
C) Korrekt. Det rekommenderas att kombinera property-based och exempel-baserade tester.
D) Felaktigt. Att använda domänkunskap är en viktig best practice.
```

</details>

---

235. Vad är huvudsyftet med statistisk property-based testing?

A) Att generera testrapporter
B) Att upptäcka subtila fel eller prestandaproblem
C) Att automatisera all testning
D) Att ersätta traditionell enhetstestning

<details>
<summary>Svar:</summary>
Rätt svar: B

```text
A) Felaktigt. Även om det kan bidra till rapportering, är detta inte huvudsyftet.
B) Korrekt. Huvudsyftet är att upptäcka subtila fel eller prestandaproblem genom statistisk analys.
C) Felaktigt. Statistisk property-based testing automatiserar inte all testning.
D) Felaktigt. Det ersätter inte traditionell enhetstestning utan kompletterar den.
```

</details>