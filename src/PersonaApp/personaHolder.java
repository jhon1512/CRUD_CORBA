package PersonaApp;

/**
* PersonaApp/personaHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from persona.idl
* lunes 23 de abril de 2018 07:34:13 PM COT
*/

public final class personaHolder implements org.omg.CORBA.portable.Streamable
{
  public PersonaApp.persona value = null;

  public personaHolder ()
  {
  }

  public personaHolder (PersonaApp.persona initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = PersonaApp.personaHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    PersonaApp.personaHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return PersonaApp.personaHelper.type ();
  }

}
