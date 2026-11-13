/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.dk4;
import defpackage.ek4;
import defpackage.fk4;
import defpackage.ri;
import java.sql.Date;
import java.sql.Timestamp;

public abstract class gk4 {
    public static final boolean a;
    public static final fk4 b;
    public static final fk4 c;
    public static final ri d;
    public static final ri e;
    public static final ri f;

    static {
        boolean bl5;
        try {
            Class.forName("java.sql.Date");
            bl5 = true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            bl5 = false;
        }
        a = bl5;
        if (bl5) {
            b = new fk4(0, Date.class);
            c = new fk4(1, Timestamp.class);
            d = dk4.c;
            e = dk4.d;
            f = ek4.c;
        } else {
            b = null;
            c = null;
            d = null;
            e = null;
            f = null;
        }
    }
}

