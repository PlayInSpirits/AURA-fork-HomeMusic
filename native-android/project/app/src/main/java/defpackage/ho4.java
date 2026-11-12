package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ho4 implements go4, Serializable {
    public final transient Object n;
    public final go4 o;
    public volatile transient boolean p;
    public transient Object q;

    public ho4(go4 r2) {
        this.n = new Object();
        this.o = r2;
    }

    @Override // defpackage.go4
    public final Object get() {
        if (this.p == true) goto L18;
        Object r0 = this.n;
        monitor-enter(r0);
    L11:
        th = move-exception;
        throw th;
    L7:
        if (this.p == true) goto L13;
        Object r1 = this.o.get();     // Catch: Throwable -> L11
        this.q = r1;     // Catch: Throwable -> L11
        this.p = true;     // Catch: Throwable -> L11
        monitor-exit(r0);     // Catch: Throwable -> L11
        return r1;
    L13:
        monitor-exit(r0);     // Catch: Throwable -> L11
    L18:
        return this.q;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("Suppliers.memoize(");
        if (this.p == false) goto L5;
        Object r3 = "<supplier that returned " + this.q + ">";
    L6:
        r0.append(r3);
        r0.append(")");
        return r0.toString();
    L5:
        r3 = this.o;
        goto L6
    }
}
