package com.example.notification.Repositories;

import com.example.notification.Entities.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MessageRepo extends CrudRepository<Message, Integer> {

}
