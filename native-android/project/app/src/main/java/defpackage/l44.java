package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l44 implements r72, Serializable {
    public static final AtomicReferenceFieldUpdater p = AtomicReferenceFieldUpdater.newUpdater(l44.class, Object.class, "o");
    public volatile gf1 n;
    public volatile Object o;

    @Override // defpackage.r72
    public final Object getValue() {
        Object obj = this.o;
        rv2 rv2Var = rv2.H;
        if (obj != rv2Var) {
            return obj;
        }
        gf1 gf1Var = this.n;
        if (gf1Var != null) {
            Object objInvoke = gf1Var.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, rv2Var, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != rv2Var) {
                }
            }
            this.n = null;
            return objInvoke;
        }
        return this.o;
    }

    public final String toString() {
        return this.o != rv2.H ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
