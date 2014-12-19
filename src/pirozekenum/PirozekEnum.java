/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pirozekenum;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import pirozekenum.Message.AbstractMessage;
import pirozekenum.Message.Message1;
import pirozekenum.Message.Message2;
import pirozekenum.Message.Message3;

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

        //Pomoci enumu
        try {
            TypEnum en = TypEnum.getByCode(code);
            AbstractMessage inst = en.getCls().newInstance();
            System.out.println(inst);
        } catch (Exception ex) {
            Logger.getLogger(PirozekEnum.class.getName()).log(Level.SEVERE, null, ex);
        }

        //pomoci mapy
        Map<String, Class<? extends AbstractMessage>> mapa = new HashMap<>();
        mapa.put("zprava1", Message1.class);
        mapa.put("zprava2", Message2.class);
        mapa.put("zprava3", Message3.class);

        try {
            Class<? extends AbstractMessage> cls = mapa.get(code);
            AbstractMessage inst = cls.newInstance();
            System.out.println(inst);
        } catch (Exception ex) {
            Logger.getLogger(PirozekEnum.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
