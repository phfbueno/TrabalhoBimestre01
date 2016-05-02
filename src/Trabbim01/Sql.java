package Trabbim01;

import java.lang.reflect.Field;



public class Sql {



public Sql() {

Cliente c = new Cliente();



gravar(c);

}



private void gravar(Cliente c) {



Field[] atributos = c.getClass().getDeclaredFields();




String nomeTabela = c.getClass().getSimpleName().toUpperCase();


StringBuilder sb = new StringBuilder();

sb.append("INSERT INTO " + nomeTabela + " (");


for (int i = 0; i < atributos.length; i++) {

if (i > 0) {

sb.append(", ");

}

sb.append(atributos[i].getName().toUpperCase());


}


sb.append(") VALUES (");


for (int i = 0; i < atributos.length; i++) {

if (i > 0) {

sb.append(", ");

}

sb.append("?");

}


sb.append(")");



String sql = sb.toString();


System.out.println(sql);



}





public static void main(String[] args) {

new Sql();

}

}
