package calculator;

import org.springframework.stereotype.Service;

@Service

public class CalculatorService {

    public int plus(Integer a,Integer b){
        return a+b;
    }

    public int minus(Integer a,Integer b){
        return a-b;
    }
    public int multiply(Integer a,Integer b){ return a*b;}

    public int divide(Integer a,Integer b){ return a/b;}

    public CalculatorService() {
    }
}



