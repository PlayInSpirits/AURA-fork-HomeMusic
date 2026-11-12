package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k11 {
    public final cf4 a;
    public final Executor b;

    public k11(cf4 r1, Executor r2) {
        this.a = r1;
        this.b = r2;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof k11) == true) goto L5;
        return false;
    L5:
        if (this.a == ((k11) r3).a) goto L7;
        return false;
    L7:
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
