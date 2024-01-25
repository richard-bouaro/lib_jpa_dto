package com.amalitech.library.services;

import com.amalitech.library.interfaces.BookServiceInterface;
import com.amalitech.library.models.entities.BookEntity;
import com.amalitech.library.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService implements BookServiceInterface {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookEntity createNewBook(BookEntity bookEntity) {
//        BookEntity newBookObject = BookEntity.builder()
//                .title(bookEntity.getTitle())
//                .genre(bookEntity.getGenre())
//                .isbn(bookEntity.getIsbn())
//                .publication_date(LocalDate.parse(bookEntity.getPublication_date().toString()))
//                .author(bookEntity.getAuthor())
//                .build();
        return bookRepository.save(bookEntity);
    }
}
