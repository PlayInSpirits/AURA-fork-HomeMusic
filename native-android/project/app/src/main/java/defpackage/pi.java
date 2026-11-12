package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class pi {
    public ai4 a;
    public float b;
    public final ArrayList c;
    public final ji d;
    public boolean e;

    public pi(yc5 r2) {
        this.a = null;
        this.b = 0.0f;
        this.c = new ArrayList();
        this.e = false;
        this.d = new ji(this, r2);
    }

    public final void a(eb2 r3, int r4) {
        ai4 r0 = r3.j(r4);
        ji r2 = this.d;
        r2.g(r0, 1.0f);
        r2.g(r3.j(r4), -1.0f);
    }

    public final void b(ai4 r3, ai4 r4, ai4 r5, int r6) {
        boolean r0 = false;
        if (r6 == 0) goto L7;
        if (r6 >= 0) goto L6;
        r6 = r6 * (-1);
        r0 = true;
    L6:
        this.b = r6;
    L7:
        ji r2 = this.d;
        if (r0 == true) goto L11;
        r2.g(r3, -1.0f);
        r2.g(r4, 1.0f);
        r2.g(r5, 1.0f);
        return;
    L11:
        r2.g(r3, 1.0f);
        r2.g(r4, -1.0f);
        r2.g(r5, -1.0f);
    }

    public final void c(ai4 r3, ai4 r4, ai4 r5, int r6) {
        boolean r0 = false;
        if (r6 == 0) goto L7;
        if (r6 >= 0) goto L6;
        r6 = r6 * (-1);
        r0 = true;
    L6:
        this.b = r6;
    L7:
        ji r2 = this.d;
        if (r0 == true) goto L11;
        r2.g(r3, -1.0f);
        r2.g(r4, 1.0f);
        r2.g(r5, -1.0f);
        return;
    L11:
        r2.g(r3, 1.0f);
        r2.g(r4, -1.0f);
        r2.g(r5, 1.0f);
    }

    public ai4 d(boolean[] r2) {
        return f(r2, null);
    }

    public boolean e() {
        if (this.a == null) goto L5;
        return false;
    L5:
        if (this.b == 0.0f) goto L7;
        return false;
    L7:
        if (this.d.d() != 0) goto L13;
        return true;
    L13:
        return false;
    }

    public final ai4 f(boolean[] r10, ai4 r11) {
        ji r9 = this.d;
        int r0 = r9.d();
        ai4 r2 = null;
        int r3 = 0;
        float r4 = 0.0f;
    L3:
        if (r3 >= r0) goto L19;
        float r5 = r9.f(r3);
        if (r5 >= 0.0f) goto L18;
        ai4 r6 = r9.e(r3);
        if (r10 != null) goto L9;
    L10:
        if (r6 == r11) goto L18;
        int r7 = r6.y;
        if (r7 == 3) goto L16;
        if (r7 != 4) goto L18;
    L16:
        if (r5 >= r4) goto L18;
        r4 = r5;
        r2 = r6;
        goto L18
    L9:
        if (r10[r6.o] == false) goto L10;
    L18:
        r3 = r3 + 1;
        goto L3
    L19:
        return r2;
    }

    public final void g(ai4 r6) {
        ai4 r0 = this.a;
        ji r2 = this.d;
        if (r0 == null) goto L5;
        r2.g(r0, -1.0f);
        this.a.p = -1;
        this.a = null;
    L5:
        float r1 = r2.h(r6, true) * (-1.0f);
        this.a = r6;
        if (r1 != 1.0f) goto L8;
        return;
    L8:
        this.b /= r1;
        int r5 = r2.h;
        int r7 = 0;
    L9:
        if (r5 == (-1)) goto L13;
        if (r7 >= r2.a) goto L16;
        float[] r3 = r2.g;
        r3[r5] = r3[r5] / r1;
        r5 = r2.f[r5];
        r7 = r7 + 1;
        goto L9
    L16:
        return;
    }

    public final void h(eb2 r5, ai4 r6, boolean r7) {
        if (r6.s == false) goto L13;
        ji r0 = this.d;
        float r1 = r0.c(r6);
        float r2 = this.b;
        this.b = (r6.r * r1) + r2;
        r0.h(r6, r7);
        if (r7 == false) goto L9;
        r6.b(this);
    L9:
        if (r0.d() != 0) goto L12;
        this.e = true;
        r5.b = true;
        return;
    L12:
        return;
    }

    public void i(eb2 r8, pi r9, boolean r10) {
        ji r0 = this.d;
        r0.getClass();
        float r1 = r0.c(r9.a);
        r0.h(r9.a, r10);
        ji r2 = r9.d;
        int r3 = r2.d();
        int r4 = 0;
    L3:
        if (r4 >= r3) goto L5;
        ai4 r5 = r2.e(r4);
        r0.a(r5, r2.c(r5) * r1, r10);
        r4 = r4 + 1;
        goto L3
    L5:
        float r6 = this.b;
        this.b = (r9.b * r1) + r6;
        if (r10 == false) goto L9;
        r9.a.b(this);
    L9:
        if (this.a != null) goto L11;
        return;
    L11:
        if (r0.d() != 0) goto L16;
        this.e = true;
        r8.b = true;
        return;
    }

    public String toString() {
        if (this.a != null) goto L5;
        String r0 = "0";
    L6:
        String r1 = r0.concat(" = ");
        int r3 = 0;
        if (this.b == 0.0f) goto L9;
        StringBuilder r2 = xa3.i(r1);
        r2.append(this.b);
        r1 = r2.toString();
        boolean r4 = true;
    L10:
        ji r10 = this.d;
        int r5 = r10.d();
    L11:
        if (r3 >= r5) goto L33;
        ai4 r6 = r10.e(r3);
        if (r6 == null) goto L32;
        float r7 = r10.f(r3);
        if (r7 == 0.0f) goto L32;
        String r8 = r6.toString();
        if (r4 == false) goto L21;
        if (r7 <= 0.0f) goto L26;
        r1 = r1.concat(" + ");
    L28:
        if (r7 != 1.0f) goto L30;
        r1 = r1.concat(r8);
    L31:
        r4 = true;
        goto L32
    L30:
        r1 = r1 + r7 + " " + r8;
        goto L31
    L26:
        r1 = r1.concat(" - ");
    L23:
        r7 = r7 * (-1.0f);
        goto L28
    L21:
        if (r7 >= 0.0f) goto L28;
        r1 = r1.concat("- ");
    L32:
        r3 = r3 + 1;
        goto L11
    L33:
        if (r4 == false) goto L35;
        return r1;
    L35:
        return r1.concat("0.0");
    L9:
        r4 = false;
        goto L10
    L5:
        r0 = "" + this.a;
        goto L6
    }
}
