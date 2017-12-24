package org.soujava.microprofile.demo.heroes;


import org.jnosql.artemis.Repository;

import java.util.List;
import java.util.Optional;

public interface HeroRepository extends Repository<Hero, String> {

    Optional<Hero> findByName(String name);

    List<Hero> findAll();

    List<Hero> findByAgeGreaterThan(Integer age);

    List<Hero> findByAgeLessThan(Integer age);

    void deleteByName(String name);
}
