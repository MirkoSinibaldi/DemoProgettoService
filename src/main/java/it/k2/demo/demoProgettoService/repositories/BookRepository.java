package it.k2.demo.demoProgettoService.repositories;

import it.k2.demo.demoProgettoService.models.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BookRepository extends JpaRepository<Book, Integer>
{

    Book findByTitle(String title);

    boolean existsById(Integer id_book);

    boolean existsByTitle(String title);



}
