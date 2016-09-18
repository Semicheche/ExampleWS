package br.semicheche;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class Calc {
	
	@WebMethod(operationName = "operacaoSomar")
	@WebResult(name = "resultadoSoma")
	public float somar(@WebParam(name = "parA") float a, @WebParam(name = "parB") float b) {
	return a + b;
	}

	public float subtrair(float a, float b) {
	return a - b;
	}

	public float multiplicar(float a, float b) {
	return a * b;
	}

	public float dividir(float a, float b) {
	return a / b;
	}

}
