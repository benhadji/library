package org.WebService.business.contract.manager;

import org.WebService.model.Author;
import org.WebService.model.Book;

import java.util.List;

public interface BookManager {

    Book getBook(long id);

    List<Book> getAllBooks();
    List<Book> getBookByName(String name);

    void createBook(Book book);


    List<Book> getBooksByAuthor(Author author);
}
