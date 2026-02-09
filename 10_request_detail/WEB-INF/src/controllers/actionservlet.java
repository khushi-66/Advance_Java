package controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
public class actionservlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
String localaddr=req.getLocalAddr();
String remoteAddr=req.getRemoteAddr();
String protocol =req.getProtocol();
int localport=req.getLocalPort();
int remoteport=req.getRemotePort();
int serverport=req.getServerPort();
String servername=req.getServerName();
boolean issecure=req.isSecure();
String scheme=req.getScheme();

System.out.println("local address ="+localaddr);
System.out.println( "Remote address = "+remoteAddr);
System.out.println(  "Protocol  = "+protocol);
System.out.println( "local port = " +localport);
System.out.println( "remote port = "+  remoteport);
System.out.println( "serverport = " +serverport);
System.out.println("server name = "+ servername);
System.out.println( "is_secure = " +issecure);
System.out.println( "Scheme = "+ scheme);

    }
}