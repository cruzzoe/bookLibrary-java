

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MangaTest {

    @Test
    void reborrowingBorrowedMangaThrows() {
        Manga manga = new Manga("One Piece");
        User u1 = new StandardUser(1, "Steve Jobs");
        User u2 = new StandardUser(2, "Bill Gates");
        manga.borrow(u1);
        manga.borrow(u2);
    }

    @Test
    void borrowedMangaIsUnavailable() {
        Manga manga = new Manga("One Piece");
        User u1 = new StandardUser(1, "Steve Jobs");
        manga.borrow(u1);
        assertFalse(manga.isAvailable());
    }

    @Test
    void newMangaIsAvailable() {
        Manga manga = new Manga("One Piece");

        assertTrue(manga.isAvailable());
    }

    @Test
    void loanBelongsToBorrowingUser() {
        Manga manga = new Manga("One Piece");
        User u1 = new StandardUser(1, "Steve Jobs");
        manga.borrow(u1);
        assertEquals(u1, manga.getLoan().getBorrower());
    }
}
