package br.com.fiap.consumidor.service;

import java.util.Arrays;
import java.util.List;


public class TestMain {
	public static void main(String[] args) {
		List<Long> cods = Arrays.asList(1l, 2l, 3l);
		StringBuffer sb = new StringBuffer();
		
		sb.append("{ ");
		
		sb.append("\"documento\" : 123, ");
		sb.append("\"listaProdutos\": ");
		sb.append(montaJson(cods));
		sb.append(" }");
		
		System.out.println(sb.toString());
		
	}
	
	static String montaJson(List<Long> cods) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		
		for (int i = 0; i < cods.size(); i++) {
			if(cods.size() -1 == i) {
				sb.append(" { \"codigo\" : "+ cods.get(i) + "} ");
			}else {
				sb.append(" { \"codigo\" : "+ cods.get(i) + "}, ");
			}
			
		}
		
		sb.append("]");
		
		return sb.toString();
	}
	
}
