package programa7;

import java.util.Vector;

public class Calculos {
public Calculos() {
	
}

public void CalcularSalario(Vector t) {
	 Trabalhador tb;
	 Seguranca sg;
	 Funcionario fc;
	 for(int i=0; i<t.size();i++) {
		 tb=(Trabalhador)t.elementAt(i);
		 if(tb instanceof Seguranca) {
			 sg=(Seguranca)tb;
			 System.out.println(t.elementAt(i).toString()+", |Salario Total: "+(sg.getHoras()+sg.getExtras())*sg.getSalario());
		 }else {
			 fc=(Funcionario)tb;
			 System.out.println(t.elementAt(i).toString()+", |Salario Total: "+(fc.getHoras()*fc.getSalario())+(fc.getHoras()*fc.getSalario()*fc.getBonus()/100));
		 }
	 }
}

public byte contarCategoria(Vector t) {
	byte x=0;
	 Trabalhador tb;
	 for(int i=0; i<t.size();i++) {
		 tb=(Trabalhador)t.elementAt(i);
		 
		 if(tb.getCategoria()=='a' || tb.getCategoria()=='A') {
			
			 x++;
		 }
	 }
	 return x;
}
}
