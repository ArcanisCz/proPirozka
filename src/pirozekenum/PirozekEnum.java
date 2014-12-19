/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pirozekenum;

import java.util.logging.Level;
import java.util.logging.Logger;
import pirozekenum.Message.AbstractMessage;

/**
 *
 * @author Arcanis
 */
public class PirozekEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String code = "zprava1";

        TypEnum en = TypEnum.getByCode(code);
        try {
            AbstractMessage inst = en.getCls().newInstance();
        } catch (Exception ex) {
            Logger.getLogger(PirozekEnum.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
