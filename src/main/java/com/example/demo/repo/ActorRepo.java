package com.example.demo.repo;

import com.example.demo.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepo extends JpaRepository<Actor,Integer> {

}
