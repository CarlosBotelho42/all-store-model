package br.com.allstore.repositories;

import br.com.allstore.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    boolean existsByDocument(String document);

    Client getReferenceByDocument(String document);

    Client findByDocument(String document);
}
