package programa7;

import java.util.Vector;

public class Visualizacoes {
 public Visualizacoes(){
}
 
 public void visualizarFuncionario(Vector t) {
	 
	 for(int i=0; i<t.size();i++) {
		 if((Trabalhador)t.elementAt(i) instanceof Funcionario) {
			 System.out.println(t.elementAt(i).toString());
		 }
	 }
 }
 
public void visualizarSeguranca(Vector t) {
	 
	 for(int i=0; i<t.size();i++) {
		 if((Trabalhador)t.elementAt(i) instanceof Seguranca) {
			 System.out.println(t.elementAt(i).toString());
		 }
	 }
 }
}
