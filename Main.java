//Programa da anta

public class Main{
    public static void main(String[] args) {
        //ISSO EST� ERRADO, N�O � PARA FUNCIONAR
//        new Data(8,8,2023).setDia(15);       //Uma vez feito isso n�o d� para mudar mais nada
//        new Data(8,8,2023).setMes(15);

        Data clone = new Data(8,8,2023);
        //Objeto � s� um nome para usar e fazer
        //N�o chamar uma inst�ncia por um nome que � foi instanciado ANTA
        clone.setDia(15);
        clone.setMes(9);
        // clone.dia = -90; -> N�o seria poss�vel fazer j� que o atributo � private
    }
}