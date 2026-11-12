package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sw2 {
    public static final ArrayDeque b = null;
    public Object a;

    static {
        b = new ArrayDeque(0);
    }

    public static sw2 a(Object r2) {
        ArrayDeque r0 = b;
        monitor-enter(r0);
        sw2 r1 = (sw2) r0.poll();     // Catch: Throwable -> L10
        monitor-exit(r0);     // Catch: Throwable -> L10
        if (r1 != null) goto L8;
        r1 = new sw2();
    L8:
        r1.a = r2;
        return r1;
    L10:
        th = move-exception;
        throw th;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof sw2) == true) goto L5;
        return false;
    L5:
        if (this.a.equals(((sw2) r2).a) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
