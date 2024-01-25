package com.amalitech.library.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDTO {

    private String title;

    private LocalDate publication_date;

    private String isbn;

    private String genre;

    private String author;
}
