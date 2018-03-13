package it.altran.springmvc.myApp.controller.formbean;

public class ErrorBean {
	
	private String codeError;
	private String messageError;
	private String stackTraceError;
	
	public String getCodeError() {
		return codeError;
	}
	public void setCodeError(String codeError) {
		this.codeError = codeError;
	}
	public String getMessageError() {
		return messageError;
	}
	public void setMessageError(String messageError) {
		this.messageError = messageError;
	}
	public String getStackTraceError() {
		return stackTraceError;
	}
	public void setStackTraceError(String stackTraceError) {
		this.stackTraceError = stackTraceError;
	}
	
	
}
