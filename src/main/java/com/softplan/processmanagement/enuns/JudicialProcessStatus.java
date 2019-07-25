package com.softplan.processmanagement.enuns;

public enum JudicialProcessStatus {

	EM_ANDAMENTO("Em andamento", false),
	DESMEMBRADO("Desmembrado", false),
	EM_RECURSO("Em recurso", false ),
	FINALIZADO("Finalizado", true),
	ARQUIVADO("Arquivado", true);

	private String status;
	private boolean closed;

	JudicialProcessStatus(String status, boolean closed) {
		this.status = status;
		this.closed = closed;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isClosed() {
		return closed;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
	}
}
