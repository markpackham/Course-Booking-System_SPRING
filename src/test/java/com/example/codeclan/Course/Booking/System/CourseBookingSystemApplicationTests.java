package com.example.codeclan.Course.Booking.System;

import com.example.codeclan.Course.Booking.System.models.Booking;
import com.example.codeclan.Course.Booking.System.models.Course;
import com.example.codeclan.Course.Booking.System.models.Customer;
import com.example.codeclan.Course.Booking.System.respositories.IBookingRepository;
import com.example.codeclan.Course.Booking.System.respositories.ICourseRepository;
import com.example.codeclan.Course.Booking.System.respositories.ICustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
class CourseBookingSystemApplicationTests {

	@Autowired
	IBookingRepository bookingRepository;

	@Autowired
	ICourseRepository courseRepository;

	@Autowired
	ICustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void someTest(){
		Customer customer1 = new Customer("Alice","Aberdeen",10);
		Customer customer2 = new Customer("Bob","Berwick",20);
		Customer customer3 = new Customer("Charles","Coatbridge",30);
		Customer customer4 = new Customer("Dennis","Dundee",40);
		Customer customer5 = new Customer("Edgar","Edinburgh",50);
		Customer customer6 = new Customer("Frank","Falkirk",60);

		Course course1 = new Course("Algebra","Aberdeen",1);
		Course course2 = new Course("Biology","Berwick",2);
		Course course3 = new Course("Chemistry","Cardiff",3);

		Booking booking1 = new Booking("01-01-21",course1,customer1);
		Booking booking2 = new Booking("02-02-22",course2,customer2);
		Booking booking3 = new Booking("03-03-23",course3,customer3);
		Booking booking4 = new Booking("01-01-21",course1,customer4);
		Booking booking5 = new Booking("02-02-22",course2,customer5);
		Booking booking6 = new Booking("03-03-23",course3,customer6);
	}


}
