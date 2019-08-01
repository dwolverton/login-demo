package co.grandcircus.logindemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.logindemo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
