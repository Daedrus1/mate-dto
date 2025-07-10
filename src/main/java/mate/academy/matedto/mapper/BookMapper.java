package mate.academy.matedto.mapper;

import mate.academy.matedto.dto.BookDto;
import mate.academy.matedto.dto.CreateBookRequestDto;
import mate.academy.matedto.model.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {

    BookDto toDto(Book book);

    Book toModel(CreateBookRequestDto dto);
}
