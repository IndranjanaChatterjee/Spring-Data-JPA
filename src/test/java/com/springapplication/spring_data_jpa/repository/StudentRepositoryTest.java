package com.springapplication.spring_data_jpa.repository;

import com.springapplication.spring_data_jpa.entity.Guardian;
import com.springapplication.spring_data_jpa.entity.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent() {
        Student student = Student.builder()
                .emailId("shabbira@gmail.com")
                .firstName("Shabbir")
                .lastName("Dawoodi")
                //.guardianName("Nikhil")
                //.guardianEmail("nikhil@gmail.com")
                //.guardianMobile("9999999999")
                .build();

        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian() {

        Guardian guardian = Guardian.builder()
                .email("nikhill@gmail.com")
                .name("Nikhil")
                .mobile("9999956324")
                .build();

        Student student = Student.builder()
                .firstName("Shivam")
                .emailId("shivami@gmail.com")
                .lastName("Kumar")
                .guardian(guardian)
                .build();

        studentRepository.save(student);

    }


}