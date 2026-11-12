package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nl4 extends m2 implements p81, jg1, ll4, zc4, q81 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater s = null;
    public static final /* synthetic */ long t = 0;
    private volatile /* synthetic */ Object _state$volatile;
    public int r;

    static {
        s = AtomicReferenceFieldUpdater.newUpdater(nl4.class, Object.class, "_state$volatile");
        t = dz.a.objectFieldOffset(nl4.class.getDeclaredField("_state$volatile"));
    }

    public nl4(Object r1) {
        this._state$volatile = r1;
    }

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
    @Override // defpackage.p81
    public final Object a(q81 r14, vd0 r15) {
        if ((r15 instanceof ml4) == false) goto L7;
        ml4 r0 = (ml4) r15;
        int r1 = r0.u;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.u = r1 - Integer.MIN_VALUE;
    L8:
        Object r16 = r0.s;
        ?? r2 = r0.u;
        xe0 r3 = xe0.n;
        if (r2 == 0) goto L28;
        if (r2 == 1) goto L23;
        if (r2 == 2) goto L20;
        if (r2 != 3) goto L18;
        Object r13 = r0.r;
        s22 r17 = r0.q;
        r2 = r0.p;
        q81 r7 = r0.o;
        ?? r8 = r0.n;
        kb4.X(r16);     // Catch: Throwable -> L16
    L31:
        Object r18 = s.get(r8);     // Catch: Throwable -> L16
        if (r17 != null) goto L34;
    L38:
        if (r13 == null) goto L42;
        r2 = r2;
        r8 = r8;
        if (r13.equals(r18) == false) goto L42;
    L49:
        AtomicReference r19 = r2.a;     // Catch: Throwable -> L16
        f01 r9 = ya4.d;     // Catch: Throwable -> L16
        Object r110 = r19.getAndSet(r9);     // Catch: Throwable -> L16
        r110.getClass();     // Catch: Throwable -> L16
        if (r110 == ya4.e) goto L31;
        r0.n = r8;     // Catch: Throwable -> L16
        r0.o = r7;     // Catch: Throwable -> L16
        r0.p = r2;     // Catch: Throwable -> L16
        r0.q = r17;     // Catch: Throwable -> L16
        r0.r = r13;     // Catch: Throwable -> L16
        r0.u = 3;     // Catch: Throwable -> L16
        j15 r111 = j15.a;     // Catch: Throwable -> L16
        cz r10 = new cz(1, ya4.x(r0));     // Catch: Throwable -> L16
        r10.u();     // Catch: Throwable -> L16
        AtomicReference r11 = r2.a;     // Catch: Throwable -> L16
    L54:
        if (r11.compareAndSet(r9, r10) == true) goto L59;
        if (r11.get() == r9) goto L54;
        r10.resumeWith(r111);     // Catch: Throwable -> L16
    L59:
        Object r12 = r10.q();     // Catch: Throwable -> L16
        if (r12 != r3) goto L62;
        if (r111 != r3) goto L31;
        goto L31
    L62:
        if (r12 != r3) goto L31;
    L63:
        return r3;
    L42:
        if (r18 != xl.e) goto L44;
        Object r112 = null;
    L45:
        r0.n = r8;     // Catch: Throwable -> L16
        r0.o = r7;     // Catch: Throwable -> L16
        r0.p = r2;     // Catch: Throwable -> L16
        r0.q = r17;     // Catch: Throwable -> L16
        r0.r = r18;     // Catch: Throwable -> L16
        r0.u = 2;     // Catch: Throwable -> L16
        if (r7.b(r112, r0) == r3) goto L63;
        r13 = r18;
        r2 = r2;
        r8 = r8;
        goto L49
    L44:
        r112 = r18;
        goto L45
    L34:
        if (r17.b() == true) goto L38;
        throw r17.q();     // Catch: Throwable -> L16
    L18:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L20:
        r13 = r0.r;
        r17 = r0.q;
        ol4 r4 = r0.p;
        r7 = r0.o;
        nl4 r20 = r0.n;
        kb4.X(r16);     // Catch: Throwable -> L16
        r2 = r4;
        r8 = r20;
        goto L49
    L23:
        r2 = r0.p;
        r14 = r0.o;
        nl4 this = r0.n;
        kb4.X(r16);     // Catch: Throwable -> L26
        r2 = r2;
    L29:
        r8 = this;
        r7 = r14;
        r17 = (s22) r0.getContext().K(fz0.h0);     // Catch: Throwable -> L26
        r13 = null;
    L26:
        th = move-exception;
        r8 = this;
        th = th;
    L64:
        r8.g(r2);
        throw th;
    L28:
        kb4.X(r16);
        r2 = (ol4) d();
    L16:
        th = th;
    L7:
        r0 = new ml4(this, r15);
        goto L8
    }

    @Override // defpackage.q81
    public final Object b(Object r1, vd0 r2) {
        i(r1);
        return j15.a;
    }

    @Override // defpackage.jg1
    public final p81 c(ne0 r2, int r3, wv r4) {
        if (r3 < 0) goto L7;
        if (r3 >= 2) goto L7;
    L9:
        if (r4 != wv.o) goto L12;
        return this;
    L12:
        return g12.o(this, r2, r3, r4);
    L7:
        if (r3 != (-2)) goto L12;
        goto L9
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
        f01 r0 = xl.e;
        s.getClass();
        Object r4 = dz.a.getObjectVolatile(this, t);
        if (r4 != r0) goto L6;
        return null;
    L6:
        return r4;
    }

    public final void i(Object r2) {
        if (r2 != null) goto L4;
        r2 = xl.e;
    L4:
        j(null, r2);
    }

    public final boolean j(Object r10, Object r11) {
        monitor-enter(this);
        AtomicReferenceFieldUpdater r0 = s;     // Catch: Throwable -> L9
        Object r1 = r0.get(this);     // Catch: Throwable -> L9
        if (r10 == null) goto L13;
        if (h12.c(r1, r10) == true) goto L13;
        monitor-exit(this);
        return false;
    L13:
        if (h12.c(r1, r11) == false) goto L16;
        monitor-exit(this);
        return true;
    L16:
        r0.set(this, r11);     // Catch: Throwable -> L9
        int r12 = this.r;     // Catch: Throwable -> L9
        if ((r12 & 1) != 0) goto L62;
        int r13 = r12 + 1;     // Catch: Throwable -> L9
        this.r = r13;     // Catch: Throwable -> L9
        n2[] r14 = this.n;     // Catch: Throwable -> L9
        monitor-exit(this);
    L20:
        ol4[] r15 = (ol4[]) r14;
        if (r15 == null) goto L48;
        int r2 = r15.length;
        int r3 = 0;
    L23:
        if (r3 >= r2) goto L48;
        ol4 r4 = r15[r3];
        if (r4 == null) goto L47;
        AtomicReference r5 = r4.a;
    L27:
        Object r6 = r5.get();
        if (r6 == null) goto L47;
        f01 r7 = ya4.e;
        if (r6 == r7) goto L47;
        f01 r8 = ya4.d;
        if (r6 == r8) goto L36;
    L42:
        if (r5.compareAndSet(r6, r8) == true) goto L43;
        if (r5.get() == r6) goto L42;
    L43:
        ((cz) r6).resumeWith(j15.a);
    L36:
        if (r5.compareAndSet(r6, r7) == true) goto L47;
        if (r5.get() == r6) goto L36;
    L47:
        r3 = r3 + 1;
    L48:
        monitor-enter(this);
        int r16 = this.r;     // Catch: Throwable -> L54
        if (r16 == r13) goto L51;
        n2[] r17 = this.n;     // Catch: Throwable -> L54
        monitor-exit(this);
        r14 = r17;
        r13 = r16;
        goto L20
    L51:
        this.r = r13 + 1;     // Catch: Throwable -> L54
        monitor-exit(this);
        return true;
    L54:
        th = move-exception;
        throw th;
    L62:
        this.r = r12 + 2;     // Catch: Throwable -> L9
        monitor-exit(this);
        return true;
    L9:
        th = move-exception;
        throw th;
    }
}
