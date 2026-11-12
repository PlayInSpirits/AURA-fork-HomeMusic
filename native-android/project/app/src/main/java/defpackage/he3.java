package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class he3 extends i35 {
    public uo b;
    public float c;
    public List d;
    public float e;
    public float f;
    public uo g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public ym4 q;
    public final nc r;
    public nc s;
    public nc t;
    public final r72 u;

    public he3() {
        this.c = 1.0f;
        int r1 = c45.a;
        this.d = u01.n;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        nc r0 = pc.a();
        this.r = r0;
        this.s = r0;
        rd2 r2 = new rd2(4);
        this.u = rr2.K(b92.n, r2);
    }

    @Override // defpackage.i35
    public final void a(sv0 r14) {
        if (this.n == false) goto L6;
        gh0.E(this.d, this.r);
        e();
    L8:
        this.n = false;
        this.p = false;
        uo r3 = this.b;
        if (r3 == null) goto L11;
        sv0 r1 = r14;
        sv0.I(r1, this.s, r3, this.c, null, 56);
    L12:
        uo r9 = this.g;
        if (r9 == null) goto L22;
        ym4 r15 = this.q;
        if (this.o == true) goto L19;
        if (r15 == null) goto L19;
    L18:
        ym4 r11 = r15;
        sv0 r7 = r1;
        sv0.I(r7, this.s, r9, this.e, r11, 48);
        return;
    L19:
        r15 = new ym4(this.f, this.j, this.h, this.i);
        this.q = r15;
        this.o = false;
        goto L18
    L22:
        return;
    L11:
        r1 = r14;
        goto L12
    L6:
        if (this.p == false) goto L8;
        e();
        goto L8
    }

    public final void e() {
        float r0 = this.k;
        nc r2 = this.r;
        if (r0 != 0.0f) goto L9;
        if (this.l != 1.0f) goto L9;
        this.s = r2;
        return;
    L9:
        if (h12.c(this.s, r2) == false) goto L11;
        this.s = pc.a();
    L20:
        r72 r1 = this.u;
        PathMeasure r5 = ((oc) r1.getValue()).a;
        if (r2 == null) goto L23;
        Path r3 = r2.a;
    L24:
        r5.setPath(r3, false);
        float r4 = ((oc) r1.getValue()).a.getLength();
        float r6 = this.k;
        float r7 = this.m;
        float r8 = ((r6 + r7) % 1.0f) * r4;
        float r9 = ((this.l + r7) % 1.0f) * r4;
        if (r8 <= r9) goto L32;
        nc r10 = this.t;
        if (r10 != null) goto L30;
        r10 = pc.a();
        this.t = r10;
    L30:
        Path r11 = r10.a;
        r11.reset();
        ((oc) r1.getValue()).a(r8, r4, r10);
        nc.a(this.s, r10);
        r11.reset();
        ((oc) r1.getValue()).a(0.0f, r9, r10);
        nc.a(this.s, r10);
        return;
    L32:
        ((oc) r1.getValue()).a(r8, r9, this.s);
        return;
    L23:
        r3 = null;
        goto L24
    L11:
        Path.FillType r12 = this.s.a.getFillType();
        Path.FillType r13 = Path.FillType.EVEN_ODD;
        if (r12 != r13) goto L14;
        boolean r14 = true;
    L15:
        this.s.a.rewind();
        Path r15 = this.s.a;
        if (r14 == true) goto L19;
        r13 = Path.FillType.WINDING;
    L19:
        r15.setFillType(r13);
        goto L20
    L14:
        r14 = false;
        goto L15
    }

    public final String toString() {
        return this.r.toString();
    }
}
