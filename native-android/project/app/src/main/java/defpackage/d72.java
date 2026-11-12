package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d72 {
    public final k9 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public k9 f;
    public final HashMap g;
    public final /* synthetic */ int h;

    public d72(k9 r1, int r2) {
        this.h = r2;
        this.a = r1;
        this.b = true;
        this.g = new HashMap();
    }

    public final void a(pp1 r9, int r10, f63 r11) {
        float r12 = r10;
        long r0 = Float.floatToRawIntBits(r12) << 32;
        long r2 = ((long) Float.floatToRawIntBits(r12)) & 4294967295L;
    L3:
        long r1 = r0 | r2;
    L5:
        switch(this.h) {
            case 0: goto L7;
            default: goto L6;
        };
    L6:
        ef2 r3 = r11.y0();
        r3.getClass();
        long r4 = r3.I;
        long r6 = Float.floatToRawIntBits((int) (r4 >> 32));
        r1 = g83.e((((long) Float.floatToRawIntBits((int) (r4 & 4294967295L))) & 4294967295L) | (r6 << 32), r1);
    L14:
        r11 = r11.J;
        r11.getClass();
        if (r11.equals(this.a.c()) == true) goto L20;
        if (b(r11).containsKey(r9) == false) goto L5;
        float r5 = c(r11, r9);
        long r7 = Float.floatToRawIntBits(r5);
        long r8 = Float.floatToRawIntBits(r5);
        r0 = r7 << 32;
        r2 = r8 & 4294967295L;
        goto L3
    L20:
        if ((r9 instanceof pp1) == false) goto L22;
        float r13 = Float.intBitsToFloat((int) (r1 & 4294967295L));
    L23:
        int r14 = Math.round(r13);
        HashMap r15 = this.g;
        if (r15.containsKey(r9) == false) goto L26;
        int r16 = ((Number) lg2.V(r9, r15)).intValue();
        pp1 r17 = j9.a;
        r14 = ((Number) r9.a.invoke(Integer.valueOf(r16), Integer.valueOf(r14))).intValue();
    L26:
        r15.put(r9, Integer.valueOf(r14));
        return;
    L22:
        r13 = Float.intBitsToFloat((int) (r1 >> 32));
        goto L23
    L7:
        tb3 r18 = r11.g0;
        if (r18 == null) goto L13;
        vj1 r19 = (vj1) r18;
        float[] r20 = r19.b();
        if (r19.F == true) goto L13;
        r1 = ya4.A(r1, r20);
    L13:
        r1 = ji2.z(r1, r11.S);
        goto L14
    }

    public final Map b(f63 r1) {
        switch(this.h) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        ef2 r0 = r1.y0();
        r0.getClass();
        return r0.h0().a();
    L7:
        return r1.h0().a();
    }

    public final int c(f63 r1, pp1 r2) {
        switch(this.h) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        ef2 r0 = r1.y0();
        r0.getClass();
        return r0.c0(r2);
    L7:
        return r1.c0(r2);
    }

    public final boolean d() {
        if (this.c == false) goto L5;
        return true;
    L5:
        if (this.d == false) goto L7;
        return true;
    L7:
        if (this.e == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final boolean e() {
        h();
        if (this.f == null) goto L6;
        return true;
    L6:
        return false;
    }

    public final void f() {
        this.b = true;
        k9 r0 = this.a;
        k9 r1 = r0.e();
        if (r1 != null) goto L6;
        return;
    L6:
        if (this.c == false) goto L10;
        r1.requestLayout();
    L10:
        if (this.d == false) goto L13;
        r0.E();
    L13:
        if (this.e == false) goto L15;
        r0.requestLayout();
    L15:
        r1.a().f();
    }

    public final void g() {
        HashMap r0 = this.g;
        r0.clear();
        x r1 = new x(2, this);
        k9 r2 = this.a;
        r2.s(r1);
        r0.putAll(b(r2.c()));
        this.b = false;
    }

    public final void h() {
        boolean r0 = d();
        k9 r1 = this.a;
        if (r0 == true) goto L29;
        k9 r2 = r1.e();
        if (r2 == null) goto L32;
        r1 = r2.a().f;
        if (r1 != null) goto L11;
    L13:
        k9 r3 = this.f;
        if (r3 != null) goto L16;
        return;
    L16:
        if (r3.a().d() == true) goto L33;
        k9 r4 = r3.e();
        if (r4 == null) goto L23;
        d72 r5 = r4.a();
        if (r5 == null) goto L23;
        r5.h();
    L23:
        k9 r6 = r3.e();
        if (r6 == null) goto L28;
        d72 r7 = r6.a();
        if (r7 == null) goto L28;
        r1 = r7.f;
    L28:
        r1 = null;
        goto L29
    L33:
        return;
    L11:
        if (r1.a().d() == false) goto L13;
    L32:
        return;
    L29:
        this.f = r1;
    }
}
