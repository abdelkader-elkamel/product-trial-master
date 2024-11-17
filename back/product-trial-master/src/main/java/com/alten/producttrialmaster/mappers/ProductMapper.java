package com.alten.producttrialmaster.mappers;

import com.alten.producttrialmaster.dtos.ProductDto;
import com.alten.producttrialmaster.models.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(source = "createdAt", target = "createdAt", qualifiedByName = "localDateTimeToLong")
    @Mapping(source = "updatedAt", target = "updatedAt", qualifiedByName = "localDateTimeToLong")
    ProductDto entityToDto(Product product);

    @Mapping(source = "createdAt", target = "createdAt", qualifiedByName = "longToLocalDateTime")
    @Mapping(source = "updatedAt", target = "updatedAt", qualifiedByName = "longToLocalDateTime")
    Product dtoToEntity(ProductDto productDto);

    @Named("localDateTimeToLong")
    default Long localDateTimeToLong(LocalDateTime localDateTime) {
        if (localDateTime != null) {
            return localDateTime.atZone(ZoneId.systemDefault()).toEpochSecond();
        }
        return null;
    }

    @Named("longToLocalDateTime")
    default LocalDateTime longToLocalDateTime(Long timestamp) {
        if (timestamp != null) {
            return LocalDateTime.ofEpochSecond(timestamp, 0, ZoneId.systemDefault().getRules().getOffset(LocalDateTime.now()));
        }
        return null;
    }

    List<ProductDto> entitiesToDtos(List<Product> products);
}
