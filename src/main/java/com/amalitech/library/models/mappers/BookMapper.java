package com.amalitech.library.models.mappers;

import com.amalitech.library.interfaces.Mapper;
import com.amalitech.library.models.dto.BookDTO;
import com.amalitech.library.models.entities.BookEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BookMapper implements Mapper<BookEntity, BookDTO> {

    private ModelMapper modelMapper;

    public BookMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public BookDTO mapFromEntityToDto(BookEntity bookEntity){
        return modelMapper.map(bookEntity, BookDTO.class);
    }

    @Override
    public BookEntity mapFromDtoToEntity(BookDTO bookDTO){
        return modelMapper.map(bookDTO, BookEntity.class);
    }
}
