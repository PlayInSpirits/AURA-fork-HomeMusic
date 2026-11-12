package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x15 implements r72, Serializable {
    public gf1 n;
    public Object o;

    @Override // defpackage.r72
    public final Object getValue() {
        if (this.o != rv2.H) goto L6;
        gf1 r0 = this.n;
        r0.getClass();
        this.o = r0.invoke();
        this.n = null;
    L6:
        return this.o;
    }

    public final String toString() {
        if (this.o != rv2.H) goto L5;
        return "Lazy value not initialized yet.";
    L5:
        return String.valueOf(getValue());
    }
}
