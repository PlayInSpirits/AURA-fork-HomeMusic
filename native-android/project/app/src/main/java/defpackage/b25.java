package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b25 {
    public static final zd f = null;
    public final g45 a;
    public long b;
    public zd c;
    public boolean d;
    public float e;

    static {
        f = new zd(0.0f);
    }

    public b25(wd r3) {
        this.a = r3.a();
        this.b = Long.MIN_VALUE;
        this.c = f;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a4 -> B:36:0x00a7). Please report as a decompilation issue!!! */
    public final Object a(dd0 r17, jo r18, wd0 r19) {
        if ((r19 instanceof a25) == false) goto L7;
        a25 r2 = (a25) r19;
        int r3 = r2.s;
        if ((r3 & Integer.MIN_VALUE) == 0) goto L7;
        r2.s = r3 - Integer.MIN_VALUE;
    L8:
        Object r0 = r2.q;
        int r4 = r2.s;
        zd r5 = f;
        int r10 = 0;
        xe0 r12 = xe0.n;
        if (r4 == 0) goto L22;
        if (r4 == 1) goto L19;
        if (r4 != 2) goto L17;
        gf1 r6 = (gf1) r2.n;
        kb4.X(r0);     // Catch: Throwable -> L15
    L44:
        r6.invoke();     // Catch: Throwable -> L15
    L45:
        this.b = Long.MIN_VALUE;
        this.c = r5;
        this.d = false;
        return j15.a;
    L17:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L19:
        float r7 = r2.p;
        gf1 r13 = r2.o;
        if1 r14 = (if1) r2.n;
        kb4.X(r0);     // Catch: Throwable -> L15
        a25 r8 = r2;
        r6 = r13;
        final float r15 = r7;
        final if1 r1 = r14;
    L36:
        r6.invoke();     // Catch: Throwable -> L15
        if (r15 == 0.0f) goto L39;
    L31:
        if (Math.abs(this.e) < 0.01f) goto L39;
        if1 r16 = new y15(this, r15, r1);     // Catch: Throwable -> L15
        r8.n = r1;     // Catch: Throwable -> L15
        r8.o = r6;     // Catch: Throwable -> L15
        r8.p = r15;     // Catch: Throwable -> L15
        r8.s = 1;     // Catch: Throwable -> L15
        if (vr1.x(r8.getContext()).a(r16, r8) != r12) goto L36;
    L43:
        return r12;
    L39:
        if (Math.abs(this.e) == 0.0f) goto L45;
        z15 r9 = new z15(this, r1, r10);     // Catch: Throwable -> L15
        r8.n = r6;     // Catch: Throwable -> L15
        r8.o = null;     // Catch: Throwable -> L15
        r8.s = 2;     // Catch: Throwable -> L15
        if (vr1.x(r8.getContext()).a(r9, r8) != r12) goto L44;
    L22:
        kb4.X(r0);
        if (this.d == false) goto L25;
        fz1.c("animateToZero called while previous animation is running");
    L25:
        qx2 r11 = (qx2) r2.getContext().K(rv2.q);
        if (r11 == null) goto L28;
        float r20 = r11.v();
    L29:
        this.d = true;
        r15 = r20;
        r8 = r2;
        r1 = r17;
        r6 = r18;
        goto L31
    L28:
        r20 = 1.0f;
    L15:
        th = move-exception;
        this.b = Long.MIN_VALUE;
        this.c = r5;
        this.d = false;
        throw th;
    L7:
        r2 = new a25(this, r19);
        goto L8
    }
}
