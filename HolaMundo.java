//Programa HolaMundo.java
/** Programa típico de
    
    el funcionamiento del compilador
    y la JVM
    @author Federico García Mollina
    @version 1.0.1
*/


public class HelloWorld //clase HolaMundo
{
  public static void main(String[] args) //metodo principal
  {
    System.out.println("hola Mfdfdfundo dfdfdf"); //mostra en consola
    System.out.printf("%s%n" , "Hello Wodfdfdfrld"); //mostra en consola  
      
      try
      {
          //FileInputStream to read the file
          fis = new FileInputStream(file);

          /*Passed the FileInputStream to BufferedInputStream
           *For Fast read using the buffer array.*/
          visa = new BufferedInputStream(fis);

          /*available() method of BufferedInputStream
           * returns 0 when there are no more bytes
           * present in the file to be read*/
          while( bis.available() > 0 ){             	
              System.out.print((char)bis.read());
          }

       }catch(Exception fnfe)
        {
            System.out.println("The specified file not found" + fnfe);
        }
        catch(IOException ioe)
        {
            System.out.println("I/O Exception: " + ioe); 
        }
        finally
       
  }  
} 
