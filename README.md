# Java Wall Structure Project

## Opis
Projekt *Java Wall Structure* jest aplikacją Java demonstrującą zastosowanie obiektowo zorientowanego programowania do modelowania struktury ściany. Projekt zawiera implementację klasy ściany (`Wall`), która składa się z bloków (`Block` oraz `CompositeBlock`) i oferuje funkcjonalności takie jak wyszukiwanie bloków według koloru i materiału oraz zliczanie bloków.

## Funkcjonalności
- Wyszukiwanie bloku o określonym kolorze.
- Wyszukiwanie wszystkich bloków wykonanych z określonego materiału.
- Zliczanie całkowitej liczby bloków w strukturze.

## Struktura Projektu
- `Block`: Interfejs reprezentujący pojedynczy blok.
- `CompositeBlock`: Interfejs rozszerzający `Block` o możliwość przechowywania innych bloków.
- `Wall`: Klasa implementująca interfejs `Structure` do zarządzania kolekcją bloków.
- `Main`: Klasa główna z przykładem użycia.
- `WallTest`: Klasa testowa zawierająca testy jednostkowe dla klasy `Wall`.

### Wymagania wstępne
- Zainstalowana Java w wersji 11 lub nowszej.
- Zainstalowane narzędzie do zarządzania zależnościami jak Maven lub Gradle.
- Zainstalowane IDE wspierające Java, np. IntelliJ IDEA, Eclipse lub NetBeans.

## Instalacja i Uruchamianie w IDE

### Klonowanie Repozytorium
- Aby sklonować repozytorium na swoje lokalne środowisko, otwórz terminal i wpisz poniższe polecenie:

```git clone https://github.com/LukaszSwor/Horus.git```

### Konfiguracja Maven
- Plik pom.xml zawiera konfigurację projektu Maven, w tym zależności niezbędne do działania aplikacji oraz do przeprowadzenia testów jednostkowych.

### Uruchamianie Aplikacji
- Aby uruchomić aplikację, znajdź klasę Main w swoim IDE i uruchom ją jako aplikację Java.

### Uruchamianie Testów
- Testy możesz uruchomić bezpośrednio z poziomu IDE.

## Aby uruchomić projekt w systemie Linux za pomocą terminala, wykonaj następujące kroki:

1. Otwórz terminal.
2. Skonfiguruj Java Development Kit (JDK):
   Upewnij się, że masz zainstalowaną odpowiednią wersję JDK. Możesz sprawdzić wersję Javy, wpisując:
   ```java -version ```
   Jeśli potrzebujesz zainstalować Java JDK, możesz to zrobić za pomocą menedżera pakietów w twojej dystrybucji, na przykład:
   ```sudo apt install openjdk-11-jdk```  # Dla systemów opartych na Debianie/Ubuntu
3. Upewnij się, że masz zainstalowaną odpowiednią wersję Maven wpisując:
   ```mvn -version ```
   Zainstaluj Mavena (jeśli jeszcze tego nie zrobiłeś):
   Mavena również możesz zainstalować za pomocą menedżera pakietów:
   ```sudo apt install maven```  # Dla systemów opartych na Debianie/Ubuntu
3. Klonowanie repozytorium:
Przejdź do katalogu, w którym chcesz umieścić projekt, i sklonuj repozytorium git za pomocą polecenia:
```git clone https://github.com/LukaszSwor/Horus.git```
4. Przejdź do katalogu projektu:
Po sklonowaniu repozytorium, przejdź do nowo utworzonego katalogu projektu:
```cd Horus```
5. Budowanie projektu:
Uruchom Mavena, aby zbudować projekt i przeprowadzić testy:
```mvn clean install```
6. Uruchomienie aplikacji:
Po zbudowaniu projektu możesz uruchomić aplikację, używając Mavena lub Java. Załóżmy, że główna klasa nazywa się Main i znajduje się w pakiecie org.LukaszSwor, uruchom ją za pomocą:
```mvn exec:java -Dexec.mainClass="org.LukaszSwor.Main"```
7. Uruchomienie testów:
Aby uruchomić testy jednostkowe, użyj:
```mvn test```
Wyniki testów zostaną wyświetlone w terminalu.

### Licencja
Projekt udostępniany bez licencji.

### Autor
Łukasz Sworacki




