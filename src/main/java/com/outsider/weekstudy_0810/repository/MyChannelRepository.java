package com.outsider.weekstudy_0810.repository;

import com.outsider.weekstudy_0810.entity.MyChannel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MyChannelRepository {

    @PersistenceContext
    private EntityManager manager;

    public void save(MyChannel myChannel) {
        manager.persist(myChannel);
    }
}
