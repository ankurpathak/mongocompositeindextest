package com.github.ankurpathak.mongocompositeindextest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.AdditionalMatchers.not;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class MongocompositeindextestApplicationTests {

    public static final String TEST_EMAIL =  "ankurpathak@live.in";

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void contextLoads() {
        String email = restTemplate.getForObject(String.format("/api/param/%s", TEST_EMAIL), String.class);
        assertEquals(TEST_EMAIL, email);
    }

}
