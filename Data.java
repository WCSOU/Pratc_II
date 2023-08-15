//Nossa classe

public class Data {
    private byte dia,mes; // "INT" que só vai até 127
    private short ano; // "INT" que só vai até 32.755

    private static boolean isBissexto(short ano){
		/*Só por causa do Julio cezar*/
        if (ano<1583)
            if (ano%4 == 0 )
                return true;
            else
                return false;

         //Padre Gregório

        if (ano%400 ==0)
            return true;

        if (ano%4==0 && ano%100!=0)
        	return true;
    	return false
    }

    private static boolean isValida(byte dia,byte mes, short ano){
        if (ano < -45) return false;
        if (ano == 0)  return false;
        if (ano ==1582 && mes==10 && dia>= 5 && dia<= 14) return false;

        // verificações groceiras
        if (dia<1 || dia>31) return false;
        if (mes< 1 || mes >12) return false;
        if (dia >30 && (mes ==4 || mes ==6 || mes==9||mes==11)) return false;//Fazer uma verificação multiplica que depende do valor primeiro
        if (dia>29 && mes ==2) return false;
        if (dia >28 && mes ==2 !isBissexto(ano)) /* é igual a isBissexto == false*/ return false;
        return true; /* Se não entrar em nada disso vai cair na nessa linha*/

    }

    public  /*void*/ Data (byte dia,byte mes, short ano){ /*--> é um construtor de java*/

        //Fazer as validações para previnir absurdos

        this.dia=dia; /* Esse é o "self." de python */
        this.mes=mes;
        this.ano=ano;

        //Fazer os Getters e Setters
    }
}