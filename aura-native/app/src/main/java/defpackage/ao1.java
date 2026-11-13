/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import com.eddyizm.tempus.homemusic.HubGoogleLogin;
import com.eddyizm.tempus.homemusic.HubMe;
import defpackage.gf1;
import defpackage.kd3;
import defpackage.lg2;
import defpackage.rr1;

public final class ao1
implements gf1 {
    public final int n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;

    public ao1(String string, String string2, String string3, int n16, String string4) {
        this.n = n16;
        this.o = string;
        this.p = string2;
        this.q = string3;
        this.r = string4;
    }

    @Override
    public final Object invoke() {
        int n16 = this.n;
        Object object = this.r;
        Object object2 = this.q;
        Object object3 = this.p;
        Object object4 = this.o;
        switch (n16) {
            default: {
                if (object4 == null) {
                    object4 = rr1.a;
                    object3 = (HubMe)rr1.s(lg2.X(new kd3("code", object3), new kd3("username", object2), new kd3("password", object)), "/api/auth/register", HubMe.class);
                    object2 = new kd3(object2, object);
                } else {
                    object = ((HubGoogleLogin)(object3 = rr1.l((String)object4, (String)object3, (String)object2))).getUsername();
                    if (object != null) {
                        object2 = object;
                    }
                    object = object3 = ((HubGoogleLogin)object3).getPassword();
                    if (object3 == null) {
                        object = "";
                    }
                    object2 = new kd3(object2, object);
                }
                return object2;
            }
            case 0: 
        }
        rr1 rr12 = rr1.a;
        object4.getClass();
        rr12 = rr1.a;
        object3 = (HubMe)rr1.s(lg2.X(new kd3("email", object4), new kd3("code", object3), new kd3("username", object2), new kd3("password", object)), "/api/auth/email/register", HubMe.class);
        return new kd3(object2, object);
    }
}

