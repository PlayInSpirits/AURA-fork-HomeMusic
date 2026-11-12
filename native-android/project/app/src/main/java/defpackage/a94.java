package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a94 {
    public static final t84 a = new t84(new byte[0], 0, 0, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(t84 t84Var) {
        t84Var.getClass();
        if (t84Var.f != null || t84Var.g != null) {
            kf2.n("Failed requirement.");
            return;
        }
        if (t84Var.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        t84 t84Var2 = a;
        t84 t84Var3 = (t84) atomicReference.getAndSet(t84Var2);
        if (t84Var3 == t84Var2) {
            return;
        }
        int i = t84Var3 != null ? t84Var3.c : 0;
        if (i >= 65536) {
            atomicReference.set(t84Var3);
            return;
        }
        t84Var.f = t84Var3;
        t84Var.b = 0;
        t84Var.c = i + 8192;
        atomicReference.set(t84Var);
    }

    public static final t84 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        t84 t84Var = a;
        t84 t84Var2 = (t84) atomicReference.getAndSet(t84Var);
        if (t84Var2 == t84Var) {
            return new t84();
        }
        if (t84Var2 == null) {
            atomicReference.set(null);
            return new t84();
        }
        atomicReference.set(t84Var2.f);
        t84Var2.f = null;
        t84Var2.c = 0;
        return t84Var2;
    }
}
