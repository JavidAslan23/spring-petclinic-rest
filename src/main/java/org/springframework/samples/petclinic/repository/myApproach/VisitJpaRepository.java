package org.springframework.samples.petclinic.repository.myApproach;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.samples.petclinic.model.Visit;
import org.springframework.stereotype.Repository;

/**
 * @author Cavid Aslanov
 * @time 10/03/2022 - 4:56 PM
 **/

/// Created new Repo for crud operations with help of Jpa
@Repository
public interface VisitJpaRepository extends JpaRepository<Visit,Integer> {
}
