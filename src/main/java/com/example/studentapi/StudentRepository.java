package com.example.studentapi;

public interface StudentRepository {

    void save(Student student);
    Student get(String id);
    void delete(String id);
    Student update(Student Student);
}
