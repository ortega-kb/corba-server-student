package StudentApp;


/**
* StudentApp/StudentManagementHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from StudentManagement.idl
* lundi 8 juillet 2024 16 h 38 CEST
*/

abstract public class StudentManagementHelper
{
  private static String  _id = "IDL:StudentApp/StudentManagement:1.0";

  public static void insert (org.omg.CORBA.Any a, StudentApp.StudentManagement that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static StudentApp.StudentManagement extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (StudentApp.StudentManagementHelper.id (), "StudentManagement");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static StudentApp.StudentManagement read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_StudentManagementStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, StudentApp.StudentManagement value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static StudentApp.StudentManagement narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof StudentApp.StudentManagement)
      return (StudentApp.StudentManagement)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      StudentApp._StudentManagementStub stub = new StudentApp._StudentManagementStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static StudentApp.StudentManagement unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof StudentApp.StudentManagement)
      return (StudentApp.StudentManagement)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      StudentApp._StudentManagementStub stub = new StudentApp._StudentManagementStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}