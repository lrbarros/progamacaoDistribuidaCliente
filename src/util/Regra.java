package util;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;

/**
 *
 * @author Luiz
 */
public class Regra implements Serializable{
   
    private String auxiliar1;
    
    public String RetornaIP(String linha){
 //permission java.net.SocketPermission "192.168.137.171:1099-1100", "accept, resolve";
 //permission java.net.SocketPermission "192.168.137.171:1099", "accept, resolve";

        auxiliar1 = linha.substring(linha.indexOf("\""), linha.indexOf(":"));        
        auxiliar1 = auxiliar1.replace("\"", "");
        return auxiliar1;
    }
    
    public String RetornaRegra(String linha){
        auxiliar1 = linha.substring(0, linha.indexOf("\"") - 1);
        System.out.println("REGRA: " + auxiliar1);
        return auxiliar1;      
    }
    
    public String RetornaPortaInicial(String linha){
        auxiliar1 = linha.substring(linha.indexOf(":")+1, linha.indexOf("-"));
        auxiliar1 = auxiliar1.replace("\"", "");
        return auxiliar1;
    }
       public String RetornaPortaFinal(String linha){
        auxiliar1 = linha.substring(linha.indexOf("-")+1, linha.indexOf(",")-1);
        auxiliar1 = auxiliar1.replace("\"", "");
        return auxiliar1;
    }
    
    public String RetornaSulfixo(String linha){
        auxiliar1 = linha.substring(linha.indexOf(",")+3, linha.indexOf(";")-1);
        System.out.println("SULFIXO: " + auxiliar1);
        auxiliar1 = auxiliar1.replaceAll("\"", "");
        return linha;
    }
}