package no.kristiania.httpClient;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HttpClientTests {

    @Test
    void shouldGetSuccessfullResponseCode(){
        HttpClient client = new HttpClient("httpbin.org",80,"/html");
        assertEquals(200,client.getStatusCode());

    }

    @Test
    void shouldGetFailureResponseCode(){
        HttpClient client = new HttpClient("httpbin.org",80,"/status/403");
        assertEquals(403,client.getStatusCode());

    }
}
