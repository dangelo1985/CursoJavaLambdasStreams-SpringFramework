package br.com.scream.service;

public interface IConverterDados {
	
	<T> T obterDados(String Json, Class<T> classe);

}
