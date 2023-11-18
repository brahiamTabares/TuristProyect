package bases.repositorio;

import java.util.List;
import java.util.Optional;

public interface Repositorio<T> {
    T save(T record);
    Optional<T> find(String key);
    List<T> get();

    void delete(T record);
}
