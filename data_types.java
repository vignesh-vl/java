/*
  two types of data types :
   - primitive ( int , char , float , double )
   - non-primitive ( classes , interfaces , arrays  )

 There are eight types of primitive data types :
   
   boolean data type
    byte data type
    char data type
    short data type
    int data type
    long data type
    float data type
    double data type


 */
import java .util.*;
class DataTypes 
{
    public static void main (String args [])
    {
      Scanner sc = new Scanner(System.in);
      boolean variable = true ;
      // 1 bit size
      // System.out.println(variable);
      byte variable_1 = 120;
      // value ranges from -128 - 127
      // size = 1 byte 
      //  4 times smaller than  an integer 
      //default value is zero
      short varaible_2 = 1000;
      //size 2 bytes = 16 bits 
      // value ranges from -32768 to 32767
      //default value is 0
      // 2 times smaller than int 
      int varaible_3 = 10000;
      // size 4 bytes 
      // default value is 0
      // value ranges from -2^31 to +2^31 -1 
      long varaible_4 = 10000L;
      // size 8 bytes 
      // default value os 0
      // value ranges from -2^63 to 2^63 -1
      float varaiable_5 = 21.1f;
      //size 4 bytes
      // default value 0.0f
      double d1 = 1.21;
      //size 8 bytes
      //default value 0.0d
      char variable_6 = 'A';
      // size 2 bytes
      // \u0000 to \uffff
      /*
       Why char uses 2 byte in java and what is \u0000 ?
       
       It is because java uses Unicode system not ASCII code system. The \u0000 is the lowest range of Unicode system.
       
       */

     


    }
}