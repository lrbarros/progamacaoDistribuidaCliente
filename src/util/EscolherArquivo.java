/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.FileChooserUI;
import servidorblogapsrmi.FuncoesBlog;

/**
 *
 * @author Luiz
 */
public class EscolherArquivo {

    private List<String> regras = new ArrayList();
    private FuncoesBlog canal;

    public EscolherArquivo(FuncoesBlog canal) {
        this.canal = canal;
    }

    public void restaurarArquivo() {

        FileNameExtensionFilter fileNameExtensionFilter = new FileNameExtensionFilter("policy", "policy");

        JFileChooser fc = new JFileChooser();

        fc.setFileFilter(fileNameExtensionFilter);

        fc.setDialogTitle("Escolha de arquivo");

        int response = fc.showOpenDialog(null);

        if (response == JFileChooser.APPROVE_OPTION) {
            File file = new File(fc.getSelectedFile().getAbsolutePath());
            FileReader reader;
            try {
                reader = new FileReader(file);
                BufferedReader bReader = new BufferedReader(reader);
                while (bReader.ready()) {
                    regras.add(bReader.readLine());
                }

                bReader.close();
                reader.close();
                canal.gravarArquivo(regras);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(fc, "Erro ao Ler Arquivo.\n Problema na estrutura do arquivo !!\n"
                        + "Retire as linhas em branco e confira se ao fim de cada regra há ponto e virgula\";\"\n"
                        + "\n\n Exemplo de regra VALIDA:\n\n"
                        + "permission java.net.SocketPermission \"127.0.0.1:1099\", \"accept, resolve\";\n"
                        + "permission java.net.SocketPermission \"127.0.0.1:1024-\", \"accept, resolve\";\n\n" + e.getMessage());
            }
        }

    }

    public void bkpArquivo() throws RemoteException {
        FileNameExtensionFilter fileNameExtensionFilter = new FileNameExtensionFilter("policy", "policy");

        JFileChooser fc = new JFileChooser();

        fc.setFileFilter(fileNameExtensionFilter);

        fc.setDialogTitle("Escolha de arquivo");
        fc.setApproveButtonText("Salvar");
        int response = fc.showOpenDialog(null);

        if (response == JFileChooser.APPROVE_OPTION) {

            try {
                File file = new File(fc.getSelectedFile().getAbsolutePath() + ".policy");
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                regras = canal.listarRegras();
                
                //Retira o cabeçalho e footer para ficar somente as regras adicionais que 
                //foram adicionadas pelo usuario
                regras.remove(0);
                regras.remove(regras.size() - 1);
                for (String r : regras) {
                    writer.write(r);
                    writer.newLine();
                }

                writer.flush();
                writer.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(fc, "Erro ao Ler Arquivo.\n Problema na estrutura do arquivo !!\n"
                        + "Retire as linhas em branco e confira se ao fim de cada regra há ponto e virgula\";\"\n"
                        + "\n\n Exemplo de regra VALIDA:\n\n"
                        + "permission java.net.SocketPermission \"127.0.0.1:1099\", \"accept, resolve\";\n"
                        + "permission java.net.SocketPermission \"127.0.0.1:1024-\", \"accept, resolve\";\n\n"
                        + "VERIFIQUE O STATUS DO SERVIDOR \n\n" + e.getMessage());
            }
        }

    }

}
