/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classroster.dao;

import com.sg.classroster.dto.Student;
import java.io.FileWriter;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Jose
 */
public class ClassRosterDaoFileImplTest {

    ClassRosterDao testDao;

    public ClassRosterDaoFileImplTest() {
    }

    @BeforeEach
    public void setUp() throws Exception {
        String testFile = "testroster.txt";
        // Use the FileWriter to quickly blank the file
        new FileWriter(testFile);
        testDao = new ClassRosterDaoFileImpl(testFile);
    }

    @Test
    public void testAddGetStudent() throws Exception {
        // Create our method test inputs
        String studentId = "0001";
        Student student = new Student(studentId);
        student.setFirstName("Ada");
        student.setLastName("Lovelace");
        student.setCohort("Java-May-1845");

        //  Add the student to the DAO
        testDao.addStudent(studentId, student);
        // Get the student from the DAO
        Student retrievedStudent = testDao.getStudent(studentId);

        // Check the data is equal
        assertEquals(student.getStudentId(), retrievedStudent.getStudentId());
        assertEquals(student.getFirstName(), retrievedStudent.getFirstName());
        assertEquals(student.getLastName(), retrievedStudent.getLastName());
        assertEquals(student.getCohort(), retrievedStudent.getCohort());
    }

    @Test
    public void testAddGetAllStudents() throws Exception {
        // Create our first student
        Student firstStudent = new Student("0001");
        firstStudent.setFirstName("Ada");
        firstStudent.setLastName("Lovelace");
        firstStudent.setCohort("Java-May-1845");

        // Create our second student
        Student secondStudent = new Student("0002");
        secondStudent.setFirstName("Charles");
        secondStudent.setLastName("Babbage");
        secondStudent.setCohort(".NET-May-1845");

        // Add both our students to the DAO
        testDao.addStudent(firstStudent.getStudentId(), firstStudent);
        testDao.addStudent(secondStudent.getStudentId(), secondStudent);

        // Retrieve the list of all students within the DAO
        List<Student> allStudents = testDao.getAllStudents();

        // First check the general contents of the list
        assertNotNull(allStudents);
        assertEquals(2, allStudents.size());

        // Then the specifics
        assertTrue(testDao.getAllStudents().contains(firstStudent));
        assertTrue(testDao.getAllStudents().contains(secondStudent));

    }

    @Test
    public void testRemoveStudent() throws Exception {
        // Create two new students
        Student firstStudent = new Student("0001");
        firstStudent.setFirstName("Ada");
        firstStudent.setLastName("Lovelace");
        firstStudent.setCohort("Java-May-1945");

        Student secondStudent = new Student("0002");
        secondStudent.setFirstName("Charles");
        secondStudent.setLastName("Babbage");
        secondStudent.setCohort(".NET-May-1945");

        // Add both to the DAO
        testDao.addStudent(firstStudent.getStudentId(), firstStudent);
        testDao.addStudent(secondStudent.getStudentId(), secondStudent);

        // remove the first student - Ada
        Student removedStudent = testDao.removeStudent(firstStudent.getStudentId());

        // Check that the correct object was removed.
        assertEquals(removedStudent, firstStudent);

        // Get all the students
        List<Student> allStudents = testDao.getAllStudents();

        // First check the general contents of the list
        assertNotNull(allStudents);
        assertEquals(1, allStudents.size());

        // Then the specifics
        assertFalse(allStudents.contains(firstStudent));
        assertTrue(allStudents.contains(secondStudent));

        // Remove the second student
        removedStudent = testDao.removeStudent(secondStudent.getStudentId());
        // Check that the correct object was removed.
        assertEquals(removedStudent, secondStudent);

        // retrieve all of the students again, and check the list.
        allStudents = testDao.getAllStudents();

        // Check the contents of the list - it should be empty
        assertTrue(allStudents.isEmpty());

        // Try to 'get' both students by their old id - they should be null!
        Student retrievedStudent = testDao.getStudent(firstStudent.getStudentId());
        assertNull(retrievedStudent);

        retrievedStudent = testDao.getStudent(secondStudent.getStudentId());
        assertNull(retrievedStudent);

    }

}
