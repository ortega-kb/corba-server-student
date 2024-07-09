package StudentApp;


/**
* StudentApp/StudentManagementPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from StudentManagement.idl
* lundi 8 juillet 2024 16 h 38 CEST
*/

public abstract class StudentManagementPOA extends org.omg.PortableServer.Servant
 implements StudentApp.StudentManagementOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("students", new java.lang.Integer (0));
    _methods.put ("getStudentsByPromotion", new java.lang.Integer (1));
    _methods.put ("add", new java.lang.Integer (2));
    _methods.put ("changePromotion", new java.lang.Integer (3));
    _methods.put ("changeDate", new java.lang.Integer (4));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // StudentApp/StudentManagement/students
       {
         StudentApp.Student $result[] = null;
         $result = this.students().toArray(new Student[0]);
         out = $rh.createReply();
         StudentApp.studentSeqHelper.write (out, $result);
         break;
       }

       case 1:  // StudentApp/StudentManagement/getStudentsByPromotion
       {
         String promotion = in.read_string ();
         StudentApp.Student $result[] = null;
         $result = this.getStudentsByPromotion(promotion).toArray(new Student[0]);
         out = $rh.createReply();
         StudentApp.studentSeqHelper.write (out, $result);
         break;
       }

       case 2:  // StudentApp/StudentManagement/add
       {
         String matricule = in.read_string ();
         String promotion = in.read_string ();
         String naissance = in.read_string ();
         String nom = in.read_string ();
         this.add (matricule, promotion, naissance, nom);
         out = $rh.createReply();
         break;
       }

       case 3:  // StudentApp/StudentManagement/changePromotion
       {
         String matricule = in.read_string ();
         String promotion = in.read_string ();
         this.changePromotion (matricule, promotion);
         out = $rh.createReply();
         break;
       }

       case 4:  // StudentApp/StudentManagement/changeDate
       {
         String matricule = in.read_string ();
         String date = in.read_string ();
         this.changeDate (matricule, date);
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:StudentApp/StudentManagement:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public StudentManagement _this() 
  {
    return StudentManagementHelper.narrow(
    super._this_object());
  }

  public StudentManagement _this(org.omg.CORBA.ORB orb) 
  {
    return StudentManagementHelper.narrow(
    super._this_object(orb));
  }


} // class StudentManagementPOA
