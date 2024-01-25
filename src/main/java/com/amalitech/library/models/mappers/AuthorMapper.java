package com.amalitech.library.models.mappers;

import com.amalitech.library.interfaces.Mapper;
import com.amalitech.library.models.dto.AuthorDTO;
import com.amalitech.library.models.entities.AuthorEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AuthorMapper implements Mapper<AuthorEntity, AuthorDTO> {

    private final ModelMapper modelMapper;

    public AuthorMapper(final ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public AuthorDTO mapFromEntityToDto(AuthorEntity authorEntity){
        return modelMapper.map(authorEntity, AuthorDTO.class);
    }

    @Override
    public AuthorEntity mapFromDtoToEntity(AuthorDTO authorDTO)
    {
        return modelMapper.map(authorDTO, AuthorEntity.class);
    }
}
