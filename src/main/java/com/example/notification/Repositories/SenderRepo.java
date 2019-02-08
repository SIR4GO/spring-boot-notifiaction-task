package com.example.notification.Repositories;

import com.example.notification.Entities.Sender;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SenderRepo extends CrudRepository<Sender , Integer> {


}
