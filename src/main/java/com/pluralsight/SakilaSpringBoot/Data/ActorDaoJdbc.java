package com.pluralsight.SakilaSpringBoot.Data;

import com.pluralsight.SakilaSpringBoot.Model.Actor;

import java.util.List;

public class ActorDaoJdbc implements ActorDao {
    @Override
    public List<Actor> getAll() {
        return List.of();
    }

    @Override
    public Actor add(Actor actor) {
        return null;
    }
}

