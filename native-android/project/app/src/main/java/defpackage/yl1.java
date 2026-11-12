package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yl1 extends ba5 {
    @Override // defpackage.uo0
    public final void a(uo0 r9) {
        ep r10 = (ep) this.b;
        int r0 = r10.r0;
        yo0 r8 = this.h;
        ArrayList r1 = r8.l;
        int r2 = r1.size();
        int r4 = 0;
        int r6 = -1;
        int r5 = 0;
    L3:
        if (r5 >= r2) goto L10;
        Object r7 = r1.get(r5);
        r5 = r5 + 1;
        int r11 = ((yo0) r7).g;
        if (r6 == (-1)) goto L7;
        if (r11 < r6) goto L7;
    L8:
        if (r4 >= r11) goto L3;
        r4 = r11;
    L7:
        r6 = r11;
        goto L8
    L10:
        if (r0 != 0) goto L12;
    L16:
        r8.d(r6 + r10.t0);
        return;
    L12:
        if (r0 == 2) goto L16;
        r8.d(r4 + r10.t0);
    }

    @Override // defpackage.ba5
    public final void d() {
        jc0 r0 = this.b;
        if ((r0 instanceof ep) == false) goto L72;
        yo0 r1 = this.h;
        r1.b = true;
        ArrayList r3 = r1.l;
        ep r2 = (ep) r0;
        int r4 = r2.r0;
        boolean r5 = r2.s0;
        int r7 = 0;
        if (r4 == 0) goto L48;
        if (r4 != 1) goto L8;
        r1.e = 5;
    L38:
        if (r7 >= r2.q0) goto L46;
        jc0 r6 = r2.p0[r7];
        if (r5 == false) goto L42;
    L44:
        yo0 r8 = r6.d.i;
        r8.k.add(r1);
        r3.add(r8);
    L45:
        r7 = r7 + 1;
        goto L38
    L42:
        if (r6.f0 != 8) goto L44;
    L46:
        m(this.b.d.h);
        m(this.b.d.i);
        return;
    L8:
        if (r4 != 2) goto L10;
        r1.e = 6;
    L26:
        if (r7 >= r2.q0) goto L34;
        jc0 r9 = r2.p0[r7];
        if (r5 == false) goto L30;
    L32:
        yo0 r10 = r9.e.h;
        r10.k.add(r1);
        r3.add(r10);
    L33:
        r7 = r7 + 1;
        goto L26
    L30:
        if (r9.f0 != 8) goto L32;
    L34:
        m(this.b.e.h);
        m(this.b.e.i);
        return;
    L10:
        if (r4 != 3) goto L73;
        r1.e = 7;
    L14:
        if (r7 >= r2.q0) goto L22;
        jc0 r11 = r2.p0[r7];
        if (r5 == false) goto L18;
    L20:
        yo0 r12 = r11.e.i;
        r12.k.add(r1);
        r3.add(r12);
    L21:
        r7 = r7 + 1;
        goto L14
    L18:
        if (r11.f0 != 8) goto L20;
    L22:
        m(this.b.e.h);
        m(this.b.e.i);
        return;
    L73:
        return;
    L48:
        r1.e = 4;
    L50:
        if (r7 >= r2.q0) goto L58;
        jc0 r13 = r2.p0[r7];
        if (r5 == false) goto L54;
    L56:
        yo0 r14 = r13.d.h;
        r14.k.add(r1);
        r3.add(r14);
    L57:
        r7 = r7 + 1;
        goto L50
    L54:
        if (r13.f0 != 8) goto L56;
    L58:
        m(this.b.d.h);
        m(this.b.d.i);
        return;
    }

    @Override // defpackage.ba5
    public final void e() {
        jc0 r0 = this.b;
        if ((r0 instanceof ep) == false) goto L13;
        int r1 = ((ep) r0).r0;
        yo0 r3 = this.h;
        if (r1 != 0) goto L7;
    L11:
        r0.X = r3.g;
        return;
    L7:
        if (r1 == 1) goto L11;
        r0.Y = r3.g;
        return;
    }

    @Override // defpackage.ba5
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // defpackage.ba5
    public final boolean k() {
        return false;
    }

    public final void m(yo0 r2) {
        yo0 r1 = this.h;
        r1.k.add(r2);
        r2.l.add(r1);
    }
}
