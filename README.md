# Projekt: BookAPI

## Opis Projektu

Projekt "BookAPI" to aplikacja webowa umożliwiająca zarządzanie książkami poprzez interfejs API. Aplikacja została zbudowana z wykorzystaniem frameworka Spring oraz technologii RESTful API, zapewniając pełne CRUD (Create, Read, Update, Delete) operacje na książkach. Projekt ma na celu praktyczne zastosowanie technologii Spring, wstrzykiwania zależności, oraz zarządzania danymi w aplikacji webowej.

## Funkcjonalności Aplikacji

### Metody API

#### Wyświetlanie Wszystkich Książek
- **Adres URL:** `/books/books`
- **Metoda HTTP:** GET
- **Opis:** Zwraca listę wszystkich książek dostępnych w systemie.

#### Wyświetlanie Wybranej Książki
- **Adres URL:** `/books/{id}`
- **Metoda HTTP:** GET
- **Opis:** Zwraca szczegółowe informacje o książce o podanym identyfikatorze.

#### Dodawanie Książki
- **Adres URL:** `/books`
- **Metoda HTTP:** POST
- **Opis:** Tworzy nową książkę na podstawie przekazanych danych. Książka jest dodawana do listy książek w systemie.

#### Edytowanie Książki
- **Adres URL:** `/books`
- **Metoda HTTP:** PUT
- **Opis:** Zmienia informacje o książce o podanym identyfikatorze na nowe. Aktualizuje istniejącą książkę w systemie.

#### Usuwanie Książki
- **Adres URL:** `/books/{id}`
- **Metoda HTTP:** DELETE
- **Opis:** Usuwa książkę o podanym identyfikatorze z systemu.

## Technologie

- **Framework:** Spring
- **Architektura:** Spring MVC
- **Język Programowania:** Java
- **Zarządzanie Zależnościami:** Maven

## Testowanie

1. **Wyświetlanie wszystkich książek:**
   -  `http://localhost:8080/books/books`
   -  `curl http://localhost:8080/books/books`

2. **Wyświetlanie wybranej książki:**
   -  `http://localhost:8080/books/1`
   -  `curl http://localhost:8080/books/1`

3. **Dodawanie książki:**
   -  `curl -X POST -i -H "Content-Type: application/json" -d '{"isbn":"34321","title":"Thinking in Java", "publisher":"Helion","type":"programming", "author":"Bruce Eckel"}' http://localhost:8080/books`

4. **Edycja książki:**
   -  `curl -X PUT -i -H "Content-Type: application/json" -d '{"id":1,"isbn":"32222","title":"Thinking in C#", "publisher":"IT Books","type":"programming", "author":"Bruce Eckel"}' http://localhost:8080/books`

5. **Usuwanie książki:**
   -  `curl -X DELETE -i http://localhost:8080/books/1`
