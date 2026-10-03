

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MangaTest {

    @Test
    void borrowedMangaIsUnavailable() { ... }

    @Test
    void borrowingMangaCreatesLoan() { ... }

    @Test
    void loanBelongsToBorrowingUser() { ... }

    @Test
    void mangaLoanPeriodIsSevenDays() { ... }

    @Test
    void returnedMangaIsAvailable() { ... }

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
}
