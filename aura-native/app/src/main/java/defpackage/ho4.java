package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ho4 implements go4, Serializable {
    public final transient Object n = new Object();
    public final go4 o;
    public volatile transient boolean p;
    public transient Object q;

    public ho4(go4 go4Var) {
        this.o = go4Var;
    }

    @Override // defpackage.go4
    public final Object get() {
        if (!this.p) {
            synchronized (this.n) {
                try {
                    if (!this.p) {
                        Object obj = this.o.get();
                        this.q = obj;
                        this.p = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.q;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.p) {
            obj = "<supplier that returned " + this.q + ">";
        } else {
            obj = this.o;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
