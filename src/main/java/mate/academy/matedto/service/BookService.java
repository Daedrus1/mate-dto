package mate.academy.matedto.service;

import mate.academy.matedto.dto.BookDto;
import mate.academy.matedto.dto.CreateBookRequestDto;

import java.util.List;

public interface BookService {
    List<BookDto> getAll();

    BookDto getById(Long id);

    BookDto create(CreateBookRequestDto dto);
}
