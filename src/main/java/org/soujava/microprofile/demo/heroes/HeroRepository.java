package org.soujava.microprofile.demo.heroes;


import org.jnosql.artemis.Repository;

import java.util.List;

public interface HeroRepository extends Repository<Hero, String> {

    List<Hero> findAll();

    List<Hero> findByAgeGreaterThan(Integer age);

    List<Hero> findByAgeLessThan(Integer age);
}
