package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qg5 implements le {
    public static final qg5 p;
    public final boolean n;
    public final String o;

    static {
        rf2 rf2Var = new rf2();
        rf2Var.n = Boolean.FALSE;
        p = new qg5(rf2Var);
    }

    public qg5(rf2 rf2Var) {
        this.n = ((Boolean) rf2Var.n).booleanValue();
        this.o = (String) rf2Var.o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qg5)) {
            return false;
        }
        qg5 qg5Var = (qg5) obj;
        return au0.n(null, null) && this.n == qg5Var.n && au0.n(this.o, qg5Var.o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.n), this.o});
    }
}
