package Trabbim01;

public enum EstadoCivil {
	SOLTEIRO, CASADO, VIUVO;

	// Método que retorna o tipo ordinal da Enum
	public Integer GetOrdinal(EstadoCivil estadoCivil) {

		Integer resultado = -1;
		
		switch (estadoCivil) {
		case SOLTEIRO:
			resultado = 0;

		case CASADO:
			resultado = 1;
			
		case VIUVO:
			resultado = 2;
		}

		return resultado;
	}
}
