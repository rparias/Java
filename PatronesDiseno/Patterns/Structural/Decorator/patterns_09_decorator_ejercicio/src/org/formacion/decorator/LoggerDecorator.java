package org.formacion.decorator;

import java.util.List;

public class LoggerDecorator implements BaseDatos {

	BaseDatos baseDatos;
	Logger logger;

	public LoggerDecorator(BaseDatos baseDatos, Logger logger) {
		this.baseDatos = baseDatos;
		this.logger = logger;
	}

	@Override
	public void inserta(String registro) {
		logger.add("inserta " + registro);
		baseDatos.inserta(registro);
	}

	@Override
	public List<String> registros() {
		logger.add("lectura");
		return logger.obtener();
	}

	

}
