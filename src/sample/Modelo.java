package sample;

public class Modelo {
    public float calcular(long numero1, long numero2, String operacion){
        switch (operacion){
            case "+":
                return numero1 + numero2;
            case "-":
                return numero1 - numero2;
            case "/":
                if(numero2 == 0)
                    return 0;
                return numero1 / numero2;
            case "*":
                return numero1 * numero2;
            default:
                break;
        }
        return 0;
    }
}
