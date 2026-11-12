package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fh4 extends r14 implements wf1 {
    public long[] o;
    public int p;
    public int q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ gh4 t;

    public fh4(gh4 r1, vd0 r2) {
        this.t = r1;
        super(r2);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r2, vd0 r3) {
        fh4 r0 = new fh4(this.t, r3);
        r0.s = r2;
        return r0;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r1, Object r2) {
        return ((fh4) create((ba4) r1, (vd0) r2)).invokeSuspend(j15.a);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007e -> B:26:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bc -> B:37:0x00be). Please report as a decompilation issue!!! */
    @Override // defpackage.jp
    public final Object invokeSuspend(Object r23) {
        gh4 r1 = this.t;
        long r2 = r1.n;
        long r4 = r1.p;
        long r6 = r1.o;
        int r8 = this.r;
        xe0 r11 = xe0.n;
        if (r8 == 0) goto L12;
        if (r8 == 1) goto L11;
        if (r8 == 2) goto L10;
        if (r8 != 3) goto L8;
        int r3 = this.p;
        ba4 r7 = (ba4) this.s;
        kb4.X(r23);
    L37:
        int r15 = r3 + 1;
    L31:
        if (r15 >= 64) goto L39;
        if (((1 << r15) & r2) == 0) goto L36;
        Long r5 = new Long((r4 + ((long) r15)) + 64);
        this.s = r7;
        this.o = null;
        this.p = r15;
        this.r = 3;
        r7.b(this, r5);
        return r11;
    L36:
        r3 = r15;
    L39:
        return j15.a;
    L8:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L10:
        int r9 = this.p;
        ba4 r10 = (ba4) this.s;
        kb4.X(r23);
    L26:
        r9 = r9 + 1;
    L21:
        if (r9 < 64) goto L23;
        ba4 r13 = r10;
    L29:
        if (r2 == 0) goto L39;
        r7 = r13;
        r15 = 0;
        goto L31
    L23:
        if ((r6 & (1 << r9)) == 0) goto L26;
        Long r12 = new Long(r4 + ((long) r9));
        this.s = r10;
        this.o = null;
        this.p = r9;
        this.r = 2;
        r10.b(this, r12);
        return r11;
    L11:
        int r14 = this.q;
        int r16 = this.p;
        long[] r17 = this.o;
        r13 = (ba4) this.s;
        kb4.X(r23);
        int r18 = r16 + 1;
    L15:
        if (r18 >= r14) goto L19;
        Long r19 = new Long(r17[r18]);
        this.s = r13;
        this.o = r17;
        this.p = r18;
        this.q = r14;
        this.r = 1;
        r13.b(this, r19);
        return r11;
    L19:
        if (r6 == 0) goto L29;
        r10 = r13;
        r9 = 0;
        goto L21
    L12:
        kb4.X(r23);
        r13 = (ba4) this.s;
        r17 = r1.q;
        if (r17 == null) goto L19;
        r14 = r17.length;
        r18 = 0;
        goto L15
    }
}
