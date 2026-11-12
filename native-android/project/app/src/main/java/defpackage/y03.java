package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y03 extends r14 implements wf1 {
    public bh1 o;
    public z03 p;
    public long[] q;
    public int r;
    public int s;
    public int t;
    public int u;
    public long v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ z03 y;
    public final /* synthetic */ bh1 z;

    public y03(z03 r1, bh1 r2, vd0 r3) {
        this.y = r1;
        this.z = r2;
        super(r3);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r3, vd0 r4) {
        y03 r0 = new y03(this.y, this.z, r4);
        r0.x = r3;
        return r0;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r1, Object r2) {
        return ((y03) create((ba4) r1, (vd0) r2)).invokeSuspend(j15.a);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:19:0x0094). Please report as a decompilation issue!!! */
    @Override // defpackage.jp
    public final Object invokeSuspend(Object r21) {
        int r1 = this.w;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L6;
        int r2 = this.u;
        int r5 = this.t;
        long r6 = this.v;
        int r8 = this.s;
        int r9 = this.r;
        long[] r10 = this.q;
        z03 r11 = this.p;
        bh1 r12 = this.o;
        ba4 r13 = (ba4) this.x;
        kb4.X(r21);
    L19:
        r6 = r6 >> 8;
        r2 = r2 + 1;
    L14:
        if (r2 < r5) goto L16;
        if (r5 != 8) goto L25;
        int r7 = r9;
        long[] r14 = r10;
        z03 r15 = r11;
        ba4 r3 = r13;
        int r16 = r8;
        bh1 r17 = r12;
    L22:
        if (r16 == r7) goto L25;
        r16 = r16 + 1;
    L11:
        long r18 = r14[r16];
        if (((((~r18) << 7) & r18) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L22;
        r13 = r3;
        r2 = 0;
        r11 = r15;
        r10 = r14;
        r5 = 8 - ((~(r16 - r7)) >>> 31);
        r12 = r17;
        r8 = r16;
        r9 = r7;
        r6 = r18;
    L25:
        return j15.a;
    L16:
        if ((255 & r6) >= 128) goto L19;
        int r4 = (r8 << 3) + r2;
        r12.o = r4;
        Object r19 = r11.o.b[r4];
        this.x = r13;
        this.o = r12;
        this.p = r11;
        this.q = r10;
        this.r = r9;
        this.s = r8;
        this.v = r6;
        this.t = r5;
        this.u = r2;
        this.w = 1;
        r13.b(this, r19);
        return xe0.n;
    L6:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L8:
        kb4.X(r21);
        r3 = (ba4) this.x;
        r15 = this.y;
        r14 = r15.o.a;
        r7 = r14.length - 2;
        if (r7 < 0) goto L25;
        r17 = this.z;
        r16 = 0;
        goto L11
    }
}
