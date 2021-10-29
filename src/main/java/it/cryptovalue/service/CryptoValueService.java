package it.cryptovalue.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import it.cryptovalue.integration.client.CryptoCompareClient;
import it.cryptovalue.model.ValueEUR;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Service
public class CryptoValueService {


    public ValueEUR shib_eur(Float value) throws JsonProcessingException {
        return new CryptoCompareClient().shibToEur(value);
    }
}
