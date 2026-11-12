package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rp4 implements r72, Serializable {
    public gf1 n;
    public volatile Object o;
    public final Object p;

    public rp4(gf1 r1) {
        this.n = r1;
        this.o = rv2.H;
        this.p = this;
    }

    @Override // defpackage.r72
    public final Object getValue() {
        Object r0 = this.o;
        rv2 r1 = rv2.H;
        if (r0 == r1) goto L5;
        return r0;
    L5:
        Object r2 = this.p;
        monitor-enter(r2);
        Object r3 = this.o;     // Catch: Throwable -> L13
        if (r3 != r1) goto L11;
        gf1 r4 = this.n;     // Catch: Throwable -> L13
        r4.getClass();     // Catch: Throwable -> L13
        r3 = r4.invoke();     // Catch: Throwable -> L13
        this.o = r3;     // Catch: Throwable -> L13
        this.n = null;     // Catch: Throwable -> L13
    L11:
        monitor-exit(r2);
        return r3;
    L13:
        th = move-exception;
        throw th;
    }

    public final String toString() {
        if (this.o != rv2.H) goto L5;
        return "Lazy value not initialized yet.";
    L5:
        return String.valueOf(getValue());
    }
}
