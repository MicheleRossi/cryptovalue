package it.cryptovalue.integration.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import it.cryptovalue.model.ValueEUR;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import java.util.HashMap;


public class CryptoCompareClient {


    public ValueEUR shibToEur(Float valueShib) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://min-api.cryptocompare.com/data/price?fsym=SHIB&tsyms=EUR";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        String jsonResponse = response.getBody();

        //ValueEUR valueEUR = restTemplate.getForObject(url, ValueEUR.class);
        //String jsonResponse = proxy.enrich(requestBody, HttpHeadersUtils.buildHTTPHeaders(true));

        ObjectMapper objMapper = new ObjectMapper();
        HashMap<String, Float> jsonMap = objMapper.readValue(jsonResponse,
                new TypeReference<>() {
                });


        ValueEUR valueEUR = new ValueEUR();
        valueEUR.setEUR(jsonMap.get("EUR")*valueShib);
        return valueEUR;
    }
}
