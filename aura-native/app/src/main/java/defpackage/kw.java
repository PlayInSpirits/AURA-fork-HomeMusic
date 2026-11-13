/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.eg1;
import defpackage.gb3;
import java.io.Serializable;
import java.util.Arrays;

public final class kw
extends gb3
implements Serializable {
    public final eg1 n;
    public final gb3 o;

    public kw(eg1 eg12, gb3 gb32) {
        this.n = eg12;
        this.o = gb32;
    }

    public final int compare(Object object, Object object2) {
        eg1 eg12 = this.n;
        object = eg12.apply(object);
        object2 = eg12.apply(object2);
        return this.o.compare(object, object2);
    }

    @Override
    public final boolean equals(Object object) {
        block3: {
            block2: {
                if (object == this) break block2;
                if (!(object instanceof kw)) break block3;
                object = (kw)object;
                if (!this.n.equals(((kw)object).n) || !this.o.equals(((kw)object).o)) break block3;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n, this.o});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.o);
        stringBuilder.append(".onResultOf(");
        stringBuilder.append(this.n);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

