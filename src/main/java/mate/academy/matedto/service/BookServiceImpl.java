package mate.academy.matedto.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import mate.academy.matedto.dto.BookDto;
import mate.academy.matedto.dto.CreateBookRequestDto;
import mate.academy.matedto.mapper.BookMapper;
import mate.academy.matedto.model.Book;
import mate.academy.matedto.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{

    private BookRepository repository;
    private BookMapper bookMapper;

    @Override
    public List<BookDto> getAll() {
        return repository.findAll().stream()
                .map(bookMapper::toDto)
                .toList();
    }

    @Override
    public BookDto getById(Long id) {
        Book book = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Book not found !"));
        return bookMapper.toDto(book);
    }

    @Override
    public BookDto create(CreateBookRequestDto dto) {
        Book book = bookMapper.toModel(dto);
        book = repository.save(book);
        return bookMapper.toDto(book);
    }
}
