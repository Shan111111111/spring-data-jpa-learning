package com.shantesh.springdatajpalearning.service;

import com.shantesh.springdatajpalearning.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDAOService {

    @PersistenceContext //will monitor all objects' states if changes if they are part if they are saved or operated by this entitymanager --? these all objects fall into the persistance context
    private EntityManager entityManager;

    public long insert(User user){

        entityManager.persist(user);
        return user.getId();
    }
}
