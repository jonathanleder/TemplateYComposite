package ejercicio4;

public class LogTransaction {

	String registro;

	LogTransaction(String clase) {
		this.registro = clase;
	}

	void log(String clase) {
		this.registro = clase;
	}

}
