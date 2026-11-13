/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import com.eddyizm.tempus.subsonic.models.Child;
import defpackage.if1;
import defpackage.q40;
import java.util.List;

public final class z63
implements if1 {
    public final boolean n;
    public final List o;

    public z63(List list, boolean bl5) {
        this.n = bl5;
        this.o = list;
    }

    @Override
    public final Object invoke(Object object) {
        CharSequence charSequence;
        int n16;
        block5: {
            block4: {
                n16 = (Integer)object;
                if (this.n) {
                    return "radio";
                }
                object = (Child)q40.y0(this.o, n16);
                if (object == null) break block4;
                charSequence = ((Child)object).getId();
                object = charSequence;
                if (charSequence != null) break block5;
            }
            object = "loading";
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append("_");
        ((StringBuilder)charSequence).append(n16);
        return ((StringBuilder)charSequence).toString();
    }
}

