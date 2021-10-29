package it.cryptovalue.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public class ValueEUR implements Serializable {
    private Float EUR;

    @Override
    public String toString(){
        return "{\"EUR\":" + String.format(java.util.Locale.US,"%.6f", EUR) + "}";
    }
}
