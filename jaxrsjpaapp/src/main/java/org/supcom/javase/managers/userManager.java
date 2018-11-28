package org.supcom.javase.managers;
import org.supcom.javase.models.user;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

public class userManager extends BaseManager<Integer,user> {
    @Inject
    @PersistenceContext(name = "cachecash")
    private EntityManager entityManager;

    public userManager() {
        super(user.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return null;
    }

    public List<user> findByName(String name) {
        TypedQuery<user> query = entityManager.createNamedQuery("findByName", user.class);
        query.setParameter("name", name);
        return query.getResultList();
    }

    @Transactional
    public void edituser(user usero) {
        final user managed = entityManager.find(user.class, usero.getId());
        if (managed == null) {
            throw new IllegalArgumentException("There is no record in database");
        }
        if (!managed.equals(usero)) {
            managed.setUserName(usero.getUserName());
            managed.setUserBirthday(usero.getUserBirthday());
            managed.setUserMail(usero.getUserMail());
            managed.setUserPassword(usero.getUserPassword());
            managed.setUserGender(usero.getUserGender());
        }

    }
}
