package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x15 implements r72, Serializable {
    public gf1 n;
    public Object o;

    @Override // defpackage.r72
    public final Object getValue() {
        if (this.o == rv2.H) {
            gf1 gf1Var = this.n;
            gf1Var.getClass();
            this.o = gf1Var.invoke();
            this.n = null;
        }
        return this.o;
    }

    public final String toString() {
        return this.o != rv2.H ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
