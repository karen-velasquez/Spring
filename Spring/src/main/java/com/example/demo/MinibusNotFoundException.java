package com.example.demo;


class MinibusNotFoundException extends RuntimeException {

	  MinibusNotFoundException(Long id) {
	    super("No se encontro el minibus" + id);
	  }
}
