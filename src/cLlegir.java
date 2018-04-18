import java.io.*;
/**
 * Esta clase realiza las operaciones de obternet por teclado los datos introducidos a transformarlos segúng el tipo.
 * @author Silvia
 * @version 1.0 since start 2º DAW
 */
public class cLlegir
{
   /**
    * Método que obtiene el flujo de carácteres de entrada por teclado y que devolverá en formato String
    * @return Devulve los datos introducidos por teclado en forma de String
    */
  public static String dato()
  {
    String sdato = "";
    try
    {
      // Definir un flujo de caracteres de entrada: flujoE
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader flujoE = new BufferedReader(isr);
      // Leer. La entrada finaliza al pulsar la tecla Entrar
      sdato = flujoE.readLine();
    }
    catch(IOException e)
    {
      System.err.println("Error: " + e.getMessage());
    }
    return sdato; // devolver el dato tecleado
  }
  
  /**
   * Método que obtiene el flujo de carácteres de entrada por teclado y que devolverá en formato Short.
   * @return Devulve los datos introducidos por teclado en forma de Short.
   */
  public static short datoShort()
  {
    try
    {
      return Short.parseShort(dato());
    }
    catch(NumberFormatException e)
    {
      return Short.MIN_VALUE; // valor mas pequeño
    }
  }
  
  /**
   * Método que obtiene el flujo de carácteres de entrada por teclado y que devolverá en formato Int.
   * @return Devulve los datos introducidos por teclado en forma de Int.
   */
  public static int datoInt()
  {
    try
    {
      return Integer.parseInt(dato());
    }
    catch(NumberFormatException e)
    {
      return Integer.MIN_VALUE; // valor m�s peque�o
    }
  }
  
  /**
   * Método que obtiene el flujo de carácteres de entrada por teclado y que devolverá en formato Long.
   * @return Devulve los datos introducidos por teclado en forma de Long.
   */
  public static long datoLong()
  {
    try
    {
      return Long.parseLong(dato());
    }
    catch(NumberFormatException e)
    {
      return Long.MIN_VALUE; // valor m�s peque�o
    }
  }
  
  /**
   * Método que obtiene el flujo de carácteres de entrada por teclado y que devolverá en formato Float
   * @return 
   */
  public static float datoFloat()
  {
    try
    {
      Float f = new Float(dato());
      return f.floatValue();
    }
    catch(NumberFormatException e)
    {
      return Float.NaN; // No es un N�mero; valor float.
    }
  }
  
  
  /**
   * Método que obtiene el flujo de carácteres de entrada por teclado y que devolverá en formato Double
   * @return Devulve los datos introducidos por teclado en forma de Double.
   */
  public static double datoDouble()
  {
    try
    {
      Double d = new Double(dato());
      return d.doubleValue();
    }
    catch(NumberFormatException e)
    {
      return Double.NaN; // No es un N�mero; valor double.
    }
  }
} //cLlegir
