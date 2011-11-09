package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import model.Employee;
import model.Student;

public class InheritanceMain {

	public static void main(String[] args) throws
	ParseException {
		Student s = new Student();
		s.setNim("4510210009");
		s.setNama("Lusy Kusuma wardani");
		s.setAlamat("Jl.Kemiri VIII No.60");
		s.setTglLahir(new SimpleDateFormat("dd-MM-yyyy").parse("12-04-1991"));
		s.setNoHp("08568799007");
		
		Employee e = new Employee();
		e.setNip("4510210012");
		e.setNama("Billy");
		e.setAlamat("Jl.GreenBay No. 12");
		e.setTglLahir(new SimpleDateFormat("dd-MM-yyyy").parse("05-09-1990"));
		e.setNoHp("0856108962");
		
		showDate(s);
		System.out.println("\n===================\n");
		showDate(e);
	}
	
	static void showDate(Student s){
		System.out.println("Class Student");
		System.out.println("NIM	: " + s.getNim());
		System.out.println("Nama	: " + s.getNama());
		System.out.println("Alamat	: " + s.getAlamat());
		System.out.println("Tgl Lahir	: " + new SimpleDateFormat("dd MMMM yyyy").format(s.getTglLahir()));
		System.out.println("NoHP	: " + s.getNoHp());
	}
	
	static void showDate(Employee e){
		System.out.println("Class Employee");
		System.out.println("NIP : " + e.getNip());
		System.out.println("Nama : " + e.getNama());
		System.out.println("Alamat : " + e.getAlamat());
		System.out.println("Tgl Lahir : " + new SimpleDateFormat("dd MMMM yyyy").format(e.getTglLahir()));
		System.out.println("NoHP : " + e.getNoHp());
	}
}
	
		
		
		
		