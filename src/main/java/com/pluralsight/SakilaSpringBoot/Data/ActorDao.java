package com.pluralsight.SakilaSpringBoot.Data;

import com.pluralsight.SakilaSpringBoot.Model.Actor;

import java.util.List;

public interface ActorDao {
    List<Actor> getAll();
    Actor add(Actor actor);
}
