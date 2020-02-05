package org.formacion.facade;

public class PreferenciasComunicacion {

	private final boolean emailDiario;
	private final boolean emailSemanal;
	private final boolean emailHtml;
	
	public PreferenciasComunicacion(boolean emailDiario, boolean emailSemanal, boolean emailHtml) {
		this.emailDiario = emailDiario;
		this.emailSemanal = emailSemanal;
		this.emailHtml = emailHtml;
	}

	public boolean isEmailDiario() {
		return emailDiario;
	}

	public boolean isEmailSemanal() {
		return emailSemanal;
	}

	public boolean isEmailHtml() {
		return emailHtml;
	}
	
}
