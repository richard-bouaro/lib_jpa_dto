package com.amalitech.library.interfaces;

public interface Mapper<Entity, DTO>{
    DTO mapFromEntityToDto(Entity entity);
    Entity mapFromDtoToEntity(DTO dto);
}
