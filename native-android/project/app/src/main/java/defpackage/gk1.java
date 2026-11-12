package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gk1 extends i35 {
    public float[] b;
    public final ArrayList c;
    public boolean d;
    public long e;
    public List f;
    public boolean g;
    public nc h;
    public if1 i;
    public final x j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public gk1() {
        this.c = new ArrayList();
        this.d = true;
        this.e = x40.g;
        int r1 = c45.a;
        this.f = u01.n;
        this.g = true;
        this.j = new x(15, this);
        this.k = "";
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    @Override // defpackage.i35
    public final void a(sv0 r24) {
        int r2 = 0;
        if (this.s == false) goto L18;
        float[] r1 = this.b;
        if (r1 != null) goto L7;
        r1 = ya4.h();
        this.b = r1;
    L8:
        ya4.N(r1, this.q + this.m, this.r + this.n);
        float r3 = this.l;
        if (r1.length < 16) goto L12;
        double r4 = ((double) r3) * 0.017453292519943295d;
        float r13 = (float) Math.sin(r4);
        float r5 = (float) Math.cos(r4);
        float r6 = r1[0];
        float r14 = r1[4];
        float r16 = r13 * r14;
        float r17 = r16 + (r5 * r6);
        float r15 = -r13;
        float r18 = r14 * r5;
        float r19 = r18 + (r6 * r15);
        float r7 = r1[1];
        float r110 = r1[5];
        float r111 = r13 * r110;
        float r112 = r111 + (r5 * r7);
        float r113 = r110 * r5;
        float r114 = r113 + (r7 * r15);
        float r8 = r1[2];
        float r115 = r1[6];
        float r21 = r13 * r115;
        float r22 = r21 + (r5 * r8);
        float r116 = r115 * r5;
        float r117 = r116 + (r8 * r15);
        float r9 = r1[3];
        float r20 = r1[7];
        float r118 = r13 * r20;
        float r119 = r118 + (r5 * r9);
        float r10 = r5 * r20;
        r1[0] = r17;
        r1[1] = r112;
        r1[2] = r22;
        r1[3] = r119;
        r1[4] = r19;
        r1[5] = r114;
        r1[6] = r117;
        r1[7] = r10 + (r15 * r9);
    L12:
        float r11 = this.o;
        float r12 = this.p;
        if (r1.length < 16) goto L16;
        r1[0] = r1[0] * r11;
        r1[1] = r1[1] * r11;
        r1[2] = r1[2] * r11;
        r1[3] = r1[3] * r11;
        r1[4] = r1[4] * r12;
        r1[5] = r1[5] * r12;
        r1[6] = r1[6] * r12;
        r1[7] = r1[7] * r12;
        r1[8] = r1[8] * 1.0f;
        r1[9] = r1[9] * 1.0f;
        r1[10] = r1[10] * 1.0f;
        r1[11] = r1[11] * 1.0f;
    L16:
        ya4.N(r1, -this.m, -this.n);
        this.s = false;
        goto L18
    L7:
        ya4.G(r1);
    L18:
        if (this.g == true) goto L20;
    L26:
        i61 r23 = r24.O();
        long r25 = r23.j();
        r23.g().e();
        i61 r26 = (i61) ((zg5) r23.o).n;     // Catch: Throwable -> L38
        float[] r27 = this.b;     // Catch: Throwable -> L38
        if (r27 == null) goto L30;
        r26.g().h(r27);     // Catch: Throwable -> L38
    L30:
        nc r28 = this.h;     // Catch: Throwable -> L38
        if (this.f.isEmpty() == true) goto L34;
        if (r28 == null) goto L34;
        r26.g().i(r28);     // Catch: Throwable -> L38
    L34:
        ArrayList r0 = this.c;     // Catch: Throwable -> L38
        int r29 = r0.size();     // Catch: Throwable -> L38
    L35:
        if (r2 >= r29) goto L40;
        ((i35) r0.get(r2)).a(r24);     // Catch: Throwable -> L38
        r2 = r2 + 1;
        goto L35
    L40:
        r23.g().k();
        r23.t(r25);
        return;
    L38:
        th = move-exception;
        r23.g().k();
        r23.t(r25);
        throw th;
    L20:
        if (this.f.isEmpty() == true) goto L25;
        nc r30 = this.h;
        if (r30 != null) goto L24;
        r30 = pc.a();
        this.h = r30;
    L24:
        gh0.E(this.f, r30);
    L25:
        this.g = false;
        goto L26
    }

    @Override // defpackage.i35
    public final if1 b() {
        return this.i;
    }

    @Override // defpackage.i35
    public final void d(x r1) {
        this.i = r1;
    }

    public final void e(int r3, i35 r4) {
        ArrayList r0 = this.c;
        if (r3 >= r0.size()) goto L5;
        r0.set(r3, r4);
    L6:
        g(r4);
        r4.d(this.j);
        c();
        return;
    L5:
        r0.add(r4);
        goto L6
    }

    public final void f(long r5) {
        if (this.d == true) goto L6;
        return;
    L6:
        if (r5 == 16) goto L20;
        long r2 = this.e;
        if (r2 != 16) goto L11;
        this.e = r5;
        return;
    L11:
        int r0 = c45.a;
        if (x40.g(r2) == x40.g(r5)) goto L14;
    L18:
        this.d = false;
        this.e = x40.g;
        return;
    L14:
        if (x40.f(r2) != x40.f(r5)) goto L18;
        if (x40.e(r2) != x40.e(r5)) goto L18;
        return;
    }

    public final void g(i35 r5) {
        if ((r5 instanceof he3) == false) goto L23;
        he3 r6 = (he3) r5;
        uo r0 = r6.b;
        if (this.d == false) goto L12;
        if (r0 == null) goto L12;
        if ((r0 instanceof zh4) == false) goto L11;
        f(((zh4) r0).u);
        goto L12
    L11:
        this.d = false;
        this.e = x40.g;
    L12:
        uo r7 = r6.g;
        if (this.d == false) goto L34;
        if (r7 != null) goto L17;
        return;
    L17:
        if ((r7 instanceof zh4) == false) goto L20;
        f(((zh4) r7).u);
        return;
    L20:
        this.d = false;
        this.e = x40.g;
        return;
    L34:
        return;
    L23:
        if ((r5 instanceof gk1) == false) goto L33;
        gk1 r8 = (gk1) r5;
        if (r8.d == true) goto L27;
    L30:
        this.d = false;
        this.e = x40.g;
        return;
    L27:
        if (this.d == false) goto L30;
        f(r8.e);
        return;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("VGroup: ");
        r0.append(this.k);
        ArrayList r5 = this.c;
        int r1 = r5.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L6;
        i35 r3 = (i35) r5.get(r2);
        r0.append("\t");
        r0.append(r3.toString());
        r0.append("\n");
        r2 = r2 + 1;
        goto L3
    L6:
        return r0.toString();
    }
}
