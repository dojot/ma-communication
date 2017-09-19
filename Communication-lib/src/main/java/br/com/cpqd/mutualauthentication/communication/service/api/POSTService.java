package br.com.cpqd.mutualauthentication.communication.service.api;

import java.util.LinkedHashMap;

import br.com.cpqd.mutualauthentication.communication.exceptions.InvalidResponseException;

public interface POSTService {
	
	String post(String server, String path, LinkedHashMap<String, Object> parameters) throws InvalidResponseException;
}
