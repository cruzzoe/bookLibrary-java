# bookLibrary-java

# Book Lending Library

The library contains books and represents a simplified library system where books are either:

* Manga
* Textbooks
* Poetry

Manga books can be borrowed, whereas textbooks are reference-only and cannot be borrowed. This distinction is represented using the `Lendable` interface, which defines the behaviour required for a book to be borrowed and returned. Poetry is very popular so it can only be borrowed for 3 days as opposed to Manga which gets 7 days.

We have two types of users:

* Standard Users
* Librarians

The two user types have different capabilities and responsibilities within the library.

The `Library` class represents the library as a whole and provides library-level operations such as:

* Displaying books
* Loading books into the library
* Borrowing books

## TODO

* allow the librarian User to renew books
* finish off unit test for Manga class
* Implement return-date tracking and allow the maximum borrowing duration to vary by user type.
* Implement librarian actions, such as removing books from the library and modifying book information.
* Implement file saving and loading.
* Remove UserID from User class constructor
