
import java.net.*;
import java.io.*;
import java.util.*;
import java.net.InetAddress;
 
public class test
{
    public static void main(String args[]) throws Exception
    {
        InetAddress localhost = InetAddress.getLocalHost();
        System.out.println("System IP Address : " +
                      (localhost.getHostAddress()).trim());
 
    }
}
