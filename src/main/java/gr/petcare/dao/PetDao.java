package gr.petcare.dao;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by user on 17/4/2016.
 */
@Repository
@Transactional
public class PetDao {
    @PersistenceContext
    private EntityManager entityManager;

    public List getAll() {
        return entityManager.createQuery("from Pets").getResultList();
    }

    public Long getPetCount() {
        return ((Long)entityManager.createQuery("select count (*) from Pets").getSingleResult());
    }
}
