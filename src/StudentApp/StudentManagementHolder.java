package StudentApp;

/**
* StudentApp/StudentManagementHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from StudentManagement.idl
* lundi 8 juillet 2024 16 h 38 CEST
*/

public final class StudentManagementHolder implements org.omg.CORBA.portable.Streamable
{
  public StudentApp.StudentManagement value = null;

  public StudentManagementHolder ()
  {
  }

  public StudentManagementHolder (StudentApp.StudentManagement initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = StudentApp.StudentManagementHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    StudentApp.StudentManagementHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return StudentApp.StudentManagementHelper.type ();
  }

}