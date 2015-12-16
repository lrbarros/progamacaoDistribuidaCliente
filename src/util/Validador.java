package util;

import java.awt.HeadlessException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Validador {

    private Pattern patternIp;
    private Matcher matcher;

    private static final String IPADDRESS_PATTERN
            = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public Validador() {
        patternIp = Pattern.compile(IPADDRESS_PATTERN);
    }

    /**
     * Validate ip address with regular expression
     *
     * @param ip ip address for validation
     * @return true valid ip address, false invalid ip address
     */
    public boolean validate(final String ip) {
        matcher = patternIp.matcher(ip);
        return matcher.matches();
    }

    public boolean validateFormOneIp(String ip, String port1, String port2) {
        try {
            int porta1 = Integer.parseInt(port1);
            int porta2 = Integer.parseInt(port2);
            if (validate(ip) && porta1 >= 0 && porta2 <= 65535 && porta1 <= porta2) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Erro de validação por favor insira\n"
                        + "dados válido caso dúvida consulte a ajuda do Sistema");
                return false;
            }
        } catch (NumberFormatException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro de validação por favor insira\n"
                    + "dados válido caso dúvida consulte a ajuda do Sistema \n"+e.getMessage());
            return false;
        }

    }

    public boolean validateFormTwoIp(String ip1, String ip2, String port1, String port2) {
        try {
            int porta1 = Integer.parseInt(port1);
            int porta2 = Integer.parseInt(port2);
            if( validate(ip1) && validate(ip2) && porta1 >= 0 && porta2 <= 65535 && porta1 <= porta2){
                return true;
            }else{
            JOptionPane.showMessageDialog(null, "Erro de validação por favor insira\n"
                    + "dados válido caso dúvida consulte a ajuda do Sistema");
                
                return false;
            }
        } catch (NumberFormatException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro de validação por favor insira\n"
                    + "dados válido caso dúvida consulte a ajuda do Sistema\n"+e.getMessage());
            return false;
        }

    }
}
