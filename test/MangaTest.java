

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MangaTest {

    @Test
    void reborrowingBorrowedMangaThrows() {
        Manga manga = new Manga("One Piece");
        User u1 = new StandardUser("Steve Jobs");
        User u2 = new StandardUser("Bill Gates");
        manga.borrow(u1);
        assertThrows(IllegalStateException.class, () -> manga.borrow(u2));
    }

    @Test
    void borrowedMangaIsUnavailable() {
        Manga manga = new Manga("One Piece");
        User u1 = new StandardUser("Steve Jobs");
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
        User u1 = new StandardUser("Steve Jobs");
        manga.borrow(u1);
        assertEquals(u1, manga.getLoan().getBorrower());
    }
}
