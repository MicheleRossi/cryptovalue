package it.cryptovalue.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import it.cryptovalue.model.ValueEUR;
import it.cryptovalue.service.CryptoValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CryptoValueController {
    @Autowired
    private CryptoValueService cryptoValueService;

    @GetMapping("/shib-eur/{value}")
    public ValueEUR shib_eur(@PathVariable Float value) throws JsonProcessingException {
        return cryptoValueService.shib_eur(value);
    }
}
