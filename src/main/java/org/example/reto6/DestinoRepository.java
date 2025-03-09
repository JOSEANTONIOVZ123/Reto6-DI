package org.example.reto6;
import org.example.reto6.Destino;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinoRepository extends MongoRepository<Destino, String> {
}
