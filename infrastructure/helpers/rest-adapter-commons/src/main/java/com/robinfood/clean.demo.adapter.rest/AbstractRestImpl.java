package com.robinfood.clean.demo.adapter.rest;

import org.modelmapper.ModelMapper;

import java.lang.reflect.Type;

public class AbstractRestImpl<D, E> {
    private final ModelMapper mapper;
    private final Type dtoType;
    private final Type entityType;

    public AbstractRestImpl(ModelMapper mapper, Type dtoType, Type entityType) {
        this.mapper = mapper;
        this.dtoType = dtoType;
        this.entityType = entityType;
    }

    public D mapToDto(E entity) {
        return this.mapper.map(entity, this.dtoType);
    }

    public E mapToEntity(D dto) {
        return this.mapper.map(dto, this.entityType);
    }
}
