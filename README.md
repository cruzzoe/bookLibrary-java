# bookLibrary-java

# Book Lending Library

The library contains books and represents a simplified library system where books are either:

* Manga
* Textbooks
* Poetry

Manga and Poetry can be borrowed, whereas textbooks are reference-only and cannot be borrowed. Lendable books share the `LendableBook` abstract class, which holds the borrow/return behaviour and the active `Loan`; `Textbook` extends `Book` directly, so reference-only material carries no lending state. Loan length varies by type through an overridden `getLoanLength()` — Poetry for 3 days, Manga for 7 — and each book describes its own availability via `getStatusDescription()`.

We have two types of users:

* Standard Users
* Librarians

The two roles are modelled as `User` subclasses; giving them genuinely distinct capabilities and responsibilities is still on the TODO list below.

The `Library` class represents the library as a whole and provides library-level operations such as:

* Displaying books
* Loading books into the library
* Borrowing books

## TODO

* allow the librarian User to renew books
* expand the unit tests beyond `MangaTest` (reference-only `Textbook` behaviour, per-type loan lengths, `Library`)
* allow the maximum borrowing duration to vary by user type
* Implement librarian actions, such as removing books from the library and modifying book information.
* Implement file saving and loading.

## Testing

Download the JUnit Platform Console Standalone JAR and place it in:

lib/

Then compile and run:

javac -d out src/*.java

javac -cp "lib/junit-platform-console-standalone-1.14.2.jar:out" \
      -d out test/*.java

java -jar lib/junit-platform-console-standalone-1.14.2.jar \
      execute \
      --class-path out \
      --scan-class-path
