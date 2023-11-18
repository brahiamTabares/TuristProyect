package bases.repositorio;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

public abstract class AbstractRepositorio<T> implements Repositorio<T>{
    @PersistenceContext
    protected EntityManager entityManager;


    @Transactional
    @Override
    public T save(T record) {
        var stored = find( extractIdFromEntity(record) );
        if(  stored.isPresent()  ){
            entityManager.merge( record );
        } else {
            entityManager.persist(record);
        }
        return record;
    }

    @Override
    public Optional<T> find(String key) {
        return Optional.ofNullable(entityManager.find(getClazz(),key));
    }

    @Override
    public List<T> get() {
        return entityManager.createQuery(
                entityManager.getCriteriaBuilder().createQuery(getClazz())
        ).getResultList();
    }

    @Transactional
    @Override
    public void delete(T record) {
        find( extractIdFromEntity(record) ).ifPresent(entityManager::remove);
    }

    protected abstract Class<T> getClazz();
    protected abstract String extractIdFromEntity(T record);
}
