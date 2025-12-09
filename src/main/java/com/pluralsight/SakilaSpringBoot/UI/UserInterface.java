package com.pluralsight.SakilaSpringBoot.UI;

import com.pluralsight.SakilaSpringBoot.Data.ActorDao;
import com.pluralsight.SakilaSpringBoot.Model.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserInterface implements CommandLineRunner {
  @Autowired
   private ActorDao actorDao;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started the Generator");
        List<Actor> actors = actorDao.getAll();
        for (Actor actor: actors);
    }
}
