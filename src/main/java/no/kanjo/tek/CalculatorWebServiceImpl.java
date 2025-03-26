package no.kanjo.tek;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class CalculatorWebServiceImpl implements CalculatorWebService {

    @WebMethod
    public int add(
            @WebParam(name = "num1") int num1,
            @WebParam(name = "num2") int num2
    ) {
        return num1 + num2;
    }

    @WebMethod
    public int subtract(
            @WebParam(name = "num1") int num1,
            @WebParam(name = "num2") int num2
    ) {
        return num1 - num2;
    }

}