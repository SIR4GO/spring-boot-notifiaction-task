package com.example.notification.Repositories;

import com.example.notification.Entities.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepo extends CrudRepository <Topic , Integer> {

      Topic findByName(String name);
}
