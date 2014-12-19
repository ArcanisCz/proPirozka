/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pirozekenum;

import pirozekenum.Message.AbstractMessage;
import pirozekenum.Message.Message1;
import pirozekenum.Message.Message2;
import pirozekenum.Message.Message3;

/**
 *
 * @author Arcanis
 */
public enum TypEnum {

    ZPRAVA_1("zprava1", Message1.class),
    ZPRAVA_2("zprava2", Message2.class),
    ZPRAVA_3("zprava3", Message3.class);
    private String code;
    private Class<? extends AbstractMessage> cls;

    private TypEnum(String code, Class<? extends AbstractMessage> cls) {
        this.code = code;
        this.cls = cls;
    }

    public String getCode() {
        return code;
    }

    public Class<? extends AbstractMessage> getCls() {
        return cls;
    }

    public static TypEnum getByCode(String code) {
        for (TypEnum item : TypEnum.values()) {
            if (item.getCode().equals(code)) {
                return item;
            }
        }
        return null;
    }
}
