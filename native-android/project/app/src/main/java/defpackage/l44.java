package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l44 implements r72, Serializable {
    public static final AtomicReferenceFieldUpdater p = null;
    public volatile gf1 n;
    public volatile Object o;

    static {
        p = AtomicReferenceFieldUpdater.newUpdater(l44.class, Object.class, "o");
    }

    @Override // defpackage.r72
    public final Object getValue() {
        Object r0 = this.o;
        rv2 r1 = rv2.H;
        if (r0 == r1) goto L5;
        return r0;
    L5:
        gf1 r2 = this.n;
        if (r2 == null) goto L15;
        Object r3 = r2.invoke();
        AtomicReferenceFieldUpdater r4 = p;
    L9:
        if (r4.compareAndSet(this, r1, r3) == true) goto L10;
        if (r4.get(this) == r1) goto L9;
    L10:
        this.n = null;
        return r3;
    L15:
        return this.o;
    }

    public final String toString() {
        if (this.o != rv2.H) goto L5;
        return "Lazy value not initialized yet.";
    L5:
        return String.valueOf(getValue());
    }
}
