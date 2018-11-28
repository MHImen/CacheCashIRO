package org.supcom.javase.managers;
import org.supcom.javase.models.budget;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class budgetManager extends BaseManager<Integer,budget> {
    @Inject
    @PersistenceContext(name = "cachecash")
    private EntityManager entityManager;

    public budgetManager() {
        super(budget.class);
    }
    @Override
    public EntityManager getEntityManager() {
        return null;
    }
    public List<budget> findById( int budgetID){
        TypedQuery<budget> query = entityManager.createNamedQuery("findById",budget.class);
        query.setParameter("id",budgetID);
        return query.getResultList();
    }


}
