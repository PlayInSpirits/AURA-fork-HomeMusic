package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k72 implements vi2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi2 b;
    public final /* synthetic */ o72 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ vi2 e;

    public /* synthetic */ k72(vi2 r1, o72 r2, int r3, vi2 r4, int r5) {
        this.a = r5;
        this.c = r2;
        this.d = r3;
        this.e = r4;
        this.b = r1;
    }

    @Override // defpackage.vi2
    public final Map a() {
        switch(this.a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.b.a();
    L7:
        return this.b.a();
    }

    @Override // defpackage.vi2
    public final int b() {
        switch(this.a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.b.b();
    L7:
        return this.b.b();
    }

    @Override // defpackage.vi2
    public final void c() {
        int r1 = this.a;
        vi2 r2 = this.e;
        int r3 = this.d;
        o72 r0 = this.c;
        switch(r1) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        r0.q = r3;
        r2.c();
        if (r0.n.u != null) goto L39;
        r0.g(r0.q);
        return;
    L39:
        return;
    L8:
        r0.r = r3;
        r2.c();
        f13 r4 = r0.z;
        w03 r5 = r0.y;
        long[] r6 = r5.a;
        int r7 = r6.length - 2;
        if (r7 < 0) goto L31;
        int r8 = 0;
    L11:
        long r9 = r6[r8];
        if (((((~r9) << 7) & r9) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L29;
        int r10 = 8 - ((~(r8 - r7)) >>> 31);
        int r11 = 0;
    L14:
        if (r11 >= r10) goto L28;
        if ((255 & r9) >= 128) goto L27;
        int r12 = (r8 << 3) + r11;
        Object r13 = r5.b[r12];
        jn4 r14 = (jn4) r5.c[r12];
        int r15 = r4.i(r13);
        if (r15 >= 0) goto L20;
    L21:
        if (r15 < 0) goto L24;
        Object[] r16 = r4.n;
        Object r17 = r16[r15];
        r16[r15] = gn4.b;
    L24:
        if (r0.w.b(r13) == false) goto L26;
        r14.a();
    L26:
        r5.k(r12);
        goto L27
    L20:
        if (r15 >= r0.r) goto L21;
    L27:
        r9 = r9 >> 8;
        r11 = r11 + 1;
        goto L14
    L28:
        if (r10 != 8) goto L31;
    L29:
        if (r8 == r7) goto L31;
        r8 = r8 + 1;
    L31:
        r0.g(r0.q);
    }

    @Override // defpackage.vi2
    public final int d() {
        switch(this.a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.b.d();
    L7:
        return this.b.d();
    }

    @Override // defpackage.vi2
    public final if1 e() {
        switch(this.a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.b.e();
    L7:
        return this.b.e();
    }

    @Override // defpackage.vi2
    public final wf1 f() {
        switch(this.a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.b.f();
    L7:
        return this.b.f();
    }

    @Override // defpackage.vi2
    public final if1 g() {
        switch(this.a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.b.g();
    L7:
        return this.b.g();
    }
}
