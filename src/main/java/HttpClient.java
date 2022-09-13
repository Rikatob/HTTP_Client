import java.io.IOException;
import java.net.Socket;

public class HttpClient {



    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("httpbin.org",80);

        String request = ("GET /html HTTP/1.1\r\n" +
                "Host: httpbin.org\r\n" +
                "User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:104.0) Gecko/20100101 Firefox/104.0\r\n" +
                "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8\r\n" +
                "Accept-Language: nb-NO,nb;q=0.9,no-NO;q=0.8,no;q=0.6,nn-NO;q=0.5,nn;q=0.4,en-US;q=0.3,en;q=0.1\r\n" +
                "Connection: keep-alive\r\n" +
                "Upgrade-Insecure-Requests: 1\r\n\r\n");

        socket.getOutputStream().write(request.getBytes());


        int c;
        while ((c = socket.getInputStream().read())!=-1){
            System.out.println((char)c);
        }



    }
}
