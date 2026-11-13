package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class d44 implements vd0, ye0 {
    public static final AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(d44.class, Object.class, "result");
    public final vd0 n;
    private volatile Object result;

    public d44(vd0 vd0Var) {
        xe0 xe0Var = xe0.n;
        this.n = vd0Var;
        this.result = xe0Var;
    }

    @Override // defpackage.ye0
    public final ye0 getCallerFrame() {
        vd0 vd0Var = this.n;
        if (vd0Var instanceof ye0) {
            return (ye0) vd0Var;
        }
        return null;
    }

    @Override // defpackage.vd0
    public final ne0 getContext() {
        return this.n.getContext();
    }

    @Override // defpackage.vd0
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            xe0 xe0Var = xe0.o;
            if (obj2 == xe0Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, xe0Var, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != xe0Var) {
                        break;
                    }
                }
                return;
            }
            xe0 xe0Var2 = xe0.n;
            if (obj2 != xe0Var2) {
                kf2.o("Already resumed");
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = o;
            xe0 xe0Var3 = xe0.p;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, xe0Var2, xe0Var3)) {
                if (atomicReferenceFieldUpdater2.get(this) != xe0Var2) {
                    break;
                }
            }
            this.n.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.n;
    }
}
