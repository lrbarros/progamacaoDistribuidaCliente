package servidorblogapsrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author hugo\\Luiz
 */
public interface FuncoesBlog extends Remote {
    
    //Interfaces para manipulação de policy
    
  
    public List<String> listarRegras() throws RemoteException;
    public boolean gravarArquivo(List<String>regras)throws RemoteException;   
    public void iniciaSeguranca() throws RemoteException;
    public void primeiroBoot() throws RemoteException;
}