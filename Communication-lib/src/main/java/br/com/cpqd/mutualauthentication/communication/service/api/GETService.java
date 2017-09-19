package br.com.cpqd.mutualauthentication.communication.service.api;

import br.com.cpqd.mutualauthentication.communication.exceptions.InvalidResponseException;

public interface GETService {
	
	String get(String server, String path) throws InvalidResponseException;
}
