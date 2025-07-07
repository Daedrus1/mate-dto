package mate.academy.matedto.repository;

import mate.academy.matedto.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
