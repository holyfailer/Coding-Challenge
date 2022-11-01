package com.springboot.first.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PatientController {
	
	
	
	@GetMapping("/getpatient")
	public String checkDoctorAccess(@RequestParam(value="doctorId") Integer doctorId,
									@RequestParam(value="patientId") String patientId) {
		
		
		Boolean check = false;
		
		Department department1 = new Department("blodtest");
		Department department2 = new Department("baby");
		Department department3 = new Department("skadestue");
		Department department4 = new Department("indlæggelse");
		
		Patient patient1 = new Patient("julie", "1111111111" );
		Patient patient2 = new Patient("Anna", "2222222222" );
		
		Doctor doctor1 = new Doctor("john", 1, department1);
		Doctor doctor2 = new Doctor("steve", 2, department2);
		Doctor doctor3 = new Doctor("brian", 3, department2);
		Doctor doctor4 = new Doctor("isabella", 4, department2);
		
		
		ArrayList<Admission>  allAdmissions = new ArrayList<Admission>();
		allAdmissions.add(new Admission(department1, doctor1, patient1 ));
		allAdmissions.add(new Admission(department2, doctor2, patient1 ));
		allAdmissions.add(new Admission(department2, doctor3, patient2 ));
		
		
		for(int i = 0 ; i < allAdmissions.size(); i++) {
			if(allAdmissions.get(i).doctor.getDoctorID().equals(doctorId) && allAdmissions.get(i).patient.getPatientId().equals(patientId) ) {
				check = true;
			} 
		}
		if(check) {
			return "Doctor have access to patient";
		}else {
			return "Doctor do not have access to patient";
		}
		
	
	}
}


