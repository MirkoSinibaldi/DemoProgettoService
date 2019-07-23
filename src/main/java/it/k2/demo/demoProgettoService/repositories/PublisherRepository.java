package it.k2.demo.demoProgettoService.repositories;

import it.k2.demo.demoProgettoService.models.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublisherRepository  extends JpaRepository<Publisher, Integer>
{

    Publisher findByName(String name);

    List<Publisher> findAll();

    boolean existsByName(String name);

    boolean existsById(Integer id_publisher);
}
