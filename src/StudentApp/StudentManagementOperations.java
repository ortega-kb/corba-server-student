package StudentApp;


import java.util.List;

/**
* StudentApp/StudentManagementOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from StudentManagement.idl
* lundi 8 juillet 2024 16 h 38 CEST
*/

public interface StudentManagementOperations 
{
  List<Student> students ();
  List<Student> getStudentsByPromotion (String promotion);
  void add (String matricule, String promotion, String naissance, String nom);
  void changePromotion (String matricule, String promotion);
  void changeDate (String matricule, String date);
} // interface StudentManagementOperations
