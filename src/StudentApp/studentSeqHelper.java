package StudentApp;


/**
* StudentApp/studentSeqHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from StudentManagement.idl
* lundi 8 juillet 2024 16 h 38 CEST
*/

abstract public class studentSeqHelper
{
  private static String  _id = "IDL:StudentApp/studentSeq:1.0";

  public static void insert (org.omg.CORBA.Any a, StudentApp.Student[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static StudentApp.Student[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = StudentApp.StudentHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (StudentApp.studentSeqHelper.id (), "studentSeq", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static StudentApp.Student[] read (org.omg.CORBA.portable.InputStream istream)
  {
    StudentApp.Student value[] = null;
    int _len0 = istream.read_long ();
    value = new StudentApp.Student[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = StudentApp.StudentHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, StudentApp.Student[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      StudentApp.StudentHelper.write (ostream, value[_i0]);
  }

}
