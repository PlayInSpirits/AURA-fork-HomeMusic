package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wx0 implements mz0 {
    public final /* synthetic */ int a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public final Object f;
    public Object g;

    public wx0(List r3) {
        this.a = 0;
        this.f = r3;
        this.g = new wv4[r3.size()];
        this.c = -9223372036854775807L;
    }

    @Override // defpackage.mz0
    public final void a(be3 r10) {
        int r1 = 0;
        switch(this.a) {
            case 0: goto L23;
            default: goto L4;
        };
    L4:
        be3 r0 = (be3) this.f;
        ((wv4) this.g).getClass();
        if (this.b == false) goto L53;
        int r2 = r10.a();
        int r3 = this.e;
        if (r3 >= 10) goto L20;
        int r4 = Math.min(r2, 10 - r3);
        System.arraycopy(r10.a, r10.b, r0.a, this.e, r4);
        if ((this.e + r4) != 10) goto L20;
        r0.N(0);
        if (73 == r0.A()) goto L14;
    L19:
        l93.q0("Id3Reader", "Discarding invalid ID3 tag");
        this.b = false;
        return;
    L14:
        if (68 != r0.A()) goto L19;
        if (51 != r0.A()) goto L19;
        r0.O(3);
        this.d = r0.z() + 10;
    L20:
        int r5 = Math.min(r2, this.d - this.e);
        ((wv4) this.g).e(r5, r10);
        this.e += r5;
        return;
    L53:
        return;
    L23:
        if (this.b == true) goto L25;
        return;
    L25:
        if (this.d != 2) goto L36;
        if (r10.a() != 0) goto L30;
        boolean r6 = false;
    L33:
        if (r6 == true) goto L36;
        return;
    L30:
        if (r10.A() == 32) goto L32;
        this.b = false;
    L32:
        this.d--;
        r6 = this.b;
    L36:
        if (this.d == 1) goto L38;
    L46:
        int r7 = r10.b;
        int r8 = r10.a();
        wv4[] r9 = (wv4[]) this.g;
        int r11 = r9.length;
    L47:
        if (r1 >= r11) goto L49;
        wv4 r12 = r9[r1];
        r10.N(r7);
        r12.e(r8, r10);
        r1 = r1 + 1;
        goto L47
    L49:
        this.e += r8;
        return;
    L38:
        if (r10.a() != 0) goto L41;
        boolean r13 = false;
    L44:
        if (r13 == true) goto L46;
        return;
    L41:
        if (r10.A() == 0) goto L43;
        this.b = false;
    L43:
        this.d--;
        r13 = this.b;
        goto L44
    }

    @Override // defpackage.mz0
    public final void c() {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.b = false;
        this.c = -9223372036854775807L;
        return;
    L6:
        this.b = false;
        this.c = -9223372036854775807L;
    }

    @Override // defpackage.mz0
    public final void d(boolean r12) {
        boolean r0 = true;
        switch(this.a) {
            case 0: goto L18;
            default: goto L4;
        };
    L4:
        ((wv4) this.g).getClass();
        if (this.b == false) goto L29;
        int r13 = this.d;
        if (r13 != 0) goto L9;
        return;
    L9:
        if (this.e == r13) goto L12;
        return;
    L12:
        if (this.c != (-9223372036854775807L)) goto L15;
        r0 = false;
    L15:
        rr2.w(r0);
        ((wv4) this.g).a(this.c, 1, this.d, 0, null);
        this.b = false;
        return;
    L29:
        return;
    L18:
        if (this.b == true) goto L20;
        return;
    L20:
        if (this.c != (-9223372036854775807L)) goto L23;
        r0 = false;
    L23:
        rr2.w(r0);
        wv4[] r14 = (wv4[]) this.g;
        int r1 = r14.length;
        int r2 = 0;
    L24:
        if (r2 >= r1) goto L26;
        r14[r2].a(this.c, 1, this.e, 0, null);
        r2 = r2 + 1;
        goto L24
    L26:
        this.b = false;
    }

    @Override // defpackage.mz0
    public final void e(int r2, long r3) {
        switch(this.a) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if ((r2 & 4) == 0) goto L14;
        this.b = true;
        this.c = r3;
        this.d = 0;
        this.e = 0;
        return;
    L14:
        return;
    L10:
        if ((r2 & 4) == 0) goto L15;
        this.b = true;
        this.c = r3;
        this.e = 0;
        this.d = 2;
        return;
    }

    @Override // defpackage.mz0
    public final void f(m51 r8, sy4 r9) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r9.a();
        r9.b();
        wv4 r10 = r8.t(r9.d, 5);
        this.g = r10;
        sb1 r7 = new sb1();
        r9.b();
        r7.a = r9.e;
        r7.l = lw2.m("video/mp2t");
        r7.m = lw2.m("application/id3");
        f34.l(r7, r10);
        return;
    L6:
        wv4[] r0 = (wv4[]) this.g;
        int r2 = 0;
    L8:
        if (r2 >= r0.length) goto L10;
        ry4 r3 = (ry4) ((List) this.f).get(r2);
        r9.a();
        r9.b();
        wv4 r4 = r8.t(r9.d, 3);
        sb1 r5 = new sb1();
        r9.b();
        r5.a = r9.e;
        r5.l = lw2.m("video/mp2t");
        r5.m = lw2.m("application/dvbsubs");
        r5.p = Collections.singletonList(r3.b);
        r5.d = r3.a;
        f34.l(r5, r4);
        r0[r2] = r4;
        r2 = r2 + 1;
        goto L8
    }

    public wx0() {
        this.a = 1;
        this.f = new be3(10);
        this.c = -9223372036854775807L;
    }
}
