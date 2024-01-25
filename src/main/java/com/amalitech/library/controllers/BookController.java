package com.amalitech.library.controllers;

import com.amalitech.library.interfaces.Mapper;
import com.amalitech.library.models.dto.BookDTO;
import com.amalitech.library.services.BookService;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.*;


import com.amalitech.library.models.entities.BookEntity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/books")
@Log
public class BookController {

    private BookService bookService;

    private Mapper<BookEntity, BookDTO> bookMapper;

    public BookController(BookService bookService, Mapper<BookEntity, BookDTO> bookMapper) {
        this.bookService = bookService;
        this.bookMapper = bookMapper;
    }

    @GetMapping("/v1")
    public List<BookEntity> fetchBooks(){
        List<BookEntity> bookEntities = new ArrayList<>();
        BookEntity bookEntity = BookEntity.builder()
                .title("Journey To The West")
                .genre("Comic")
                .isbn("1903-4374-483")
                .publication_date(LocalDate.parse("2024-03-01"))
                .author("Chin Lu")
                .build();
        bookEntities.add(bookEntity);
        return bookEntities;
    }


    @PostMapping("/v1")
    public BookDTO createNewBook(@RequestBody BookDTO book){

        BookEntity bookEntity = bookMapper.mapFromDtoToEntity(book);

        BookEntity savedBook = bookService.createNewBook(bookEntity);

        return bookMapper.mapFromEntityToDto(savedBook);

    }
}
