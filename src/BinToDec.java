public class BinToDec {
    private String estado = "normal";
    public BinToDec() {

    }

    public String getEstado(){
        return this.estado;
    }
    public String converter(String binario){
        char[] cadeiaBits = binario.toCharArray();

        if(!isvalid(cadeiaBits)){
            this.estado = "erro";
            return "Os caracteres informados não são compatíveis com um número binário.";
        }
        return "Decimal: " + convBinToDec(cadeiaBits);

    }

    private boolean isvalid(char[] cadeiaBits){
        for (char bit: cadeiaBits) {
            if (bit != '0' && bit != '1'){
                return false;
            }
        }
        return true;
    }


    private int convBinToDec(char[] cadeiaBits){
        int size = cadeiaBits.length - 1;
        int decimal = 0;
        for (char bit:cadeiaBits) {
            if (bit != '0'){
                decimal += Math.pow(2, size);
                size--;
                System.out.println("Bit: " + bit + " decimal: " + decimal);
            }
        }
        return decimal;
    }
}
