/**
 * @author jeade - jeaden
 * CIS175 - Fall 2023
 *Oct 17, 2023
 */
package jaden.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jaden.beans.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long>{}
