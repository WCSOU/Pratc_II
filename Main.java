//Programa da anta

public class Main{
    public static void main(String[] args) {
        //ISSO ESTÁ ERRADO, NÃO É PARA FUNCIONAR
//        new Data(8,8,2023).setDia(15);       //Uma vez feito isso não dá para mudar mais nada
//        new Data(8,8,2023).setMes(15);

        Data clone = new Data(8,8,2023);
        //Objeto é só um nome para usar e fazer
        //Não chamar uma instância por um nome que ñ foi instanciado ANTA
        clone.setDia(15);
        clone.setMes(9);
        // clone.dia = -90; -> Não seria possível fazer já que o atributo é private
    }
}