package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nl4 extends m2 implements p81, jg1, ll4, zc4, q81 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(nl4.class, Object.class, "_state$volatile");
    public static final /* synthetic */ long t = dz.a.objectFieldOffset(nl4.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public int r;

    public nl4(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00e3 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:31:0x0079, B:33:0x0081, B:36:0x0088, B:37:0x008c, B:39:0x008f, B:49:0x00b0, B:52:0x00c0, B:53:0x00dc, B:59:0x00ec, B:56:0x00e3, B:58:0x00e9, B:41:0x0095, B:45:0x009c, B:21:0x004b), top: B:66:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[LOOP:0: B:53:0x00dc->B:73:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [ol4] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [n2] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [ol4] */
    /* JADX WARN: Type inference failed for: r1v7, types: [ol4] */
    /* JADX WARN: Type inference failed for: r1v8, types: [ol4] */
    /* JADX WARN: Type inference failed for: r8v1, types: [m2] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [nl4] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, nl4] */
    /* JADX WARN: Type inference failed for: r8v7, types: [nl4] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00bf -> B:31:0x0079). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // defpackage.p81
    public final java.lang.Object a(defpackage.q81 r14, defpackage.vd0 r15) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nl4.a(q81, vd0):java.lang.Object");
    }

    @Override // defpackage.q81
    public final Object b(Object obj, vd0 vd0Var) {
        i(obj);
        return j15.a;
    }

    @Override // defpackage.jg1
    public final p81 c(ne0 ne0Var, int i, wv wvVar) {
        return (((i < 0 || i >= 2) && i != -2) || wvVar != wv.o) ? g12.o(this, ne0Var, i, wvVar) : this;
    }

    @Override // defpackage.m2
    public final n2 e() {
        return new ol4();
    }

    @Override // defpackage.m2
    public final n2[] f() {
        return new ol4[2];
    }

    @Override // defpackage.ll4
    public final Object getValue() {
        f01 f01Var = xl.e;
        s.getClass();
        Object objectVolatile = dz.a.getObjectVolatile(this, t);
        if (objectVolatile == f01Var) {
            return null;
        }
        return objectVolatile;
    }

    public final void i(Object obj) {
        if (obj == null) {
            obj = xl.e;
        }
        j(null, obj);
    }

    public final boolean j(Object obj, Object obj2) {
        int i;
        n2[] n2VarArr;
        f01 f01Var;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !h12.c(obj3, obj)) {
                return false;
            }
            if (h12.c(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.r;
            if ((i2 & 1) != 0) {
                this.r = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.r = i3;
            n2[] n2VarArr2 = this.n;
            while (true) {
                ol4[] ol4VarArr = (ol4[]) n2VarArr2;
                if (ol4VarArr != null) {
                    for (ol4 ol4Var : ol4VarArr) {
                        if (ol4Var != null) {
                            AtomicReference atomicReference = ol4Var.a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 == null || obj4 == (f01Var = ya4.e)) {
                                    break;
                                }
                                f01 f01Var2 = ya4.d;
                                if (obj4 != f01Var2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, f01Var2)) {
                                            ((cz) obj4).resumeWith(j15.a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, f01Var)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.r;
                    if (i == i3) {
                        this.r = i3 + 1;
                        return true;
                    }
                    n2VarArr = this.n;
                }
                n2VarArr2 = n2VarArr;
                i3 = i;
            }
        }
    }
}
