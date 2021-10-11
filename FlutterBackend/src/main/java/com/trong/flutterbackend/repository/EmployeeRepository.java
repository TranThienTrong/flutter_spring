package com.trong.flutterbackend.repository;

import com.trong.flutterbackend.entity.Employee;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Repository(value = "employeeRepository")
@RepositoryRestResource(path = "employee")
@Transactional
public class EmployeeRepository implements JpaRepository<Employee, Integer> {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public EmployeeRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    /*___________________________ INSERT ___________________________*/
    public void addEmployee(Employee employee) {
        entityManager.merge(employee);
    }


    /*___________________________ RETRIEVE ___________________________*/
    @Override
    public List<Employee> findAll() {
        Query<Employee> query = (Query<Employee>) entityManager.createQuery("from Employee");
        return query.getResultList();
    }

    @Override
    public Employee getById(Integer id) {
        return entityManager.find(Employee.class, id);
    }


    /*___________________________ DELETE ___________________________*/
    @Override
    public void deleteById(Integer id) {
        Query<Employee> query = (Query<Employee>) entityManager.createQuery("DELETE FROM Employee WHERE id=:personId");
        query.setParameter("personId", id);
        query.executeUpdate();
    }


    /*___________________________ UPDATE ___________________________*/


    @Override
    public <S extends Employee> S save(S register) {
        Employee newRegister = entityManager.merge(register);
        register.setId(newRegister.getId());
        return register;
    }

    @Override
    public <S extends Employee> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Employee> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Employee> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public <S extends Employee> List<S> saveAllAndFlush(Iterable<S> iterable) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Employee> iterable) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Employee getOne(Integer integer) {
        return null;
    }


    @Override
    public <S extends Employee> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Employee> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Employee> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Employee> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Employee> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Employee> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public List<Employee> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Employee> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Employee register) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> iterable) {

    }

    @Override
    public void deleteAll(Iterable<? extends Employee> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}

