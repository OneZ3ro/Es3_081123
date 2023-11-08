package angelomoreno.Es3_081123.repositories;

import angelomoreno.Es3_081123.entities.Autore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoreRepository extends JpaRepository<Autore, Long> {
}
