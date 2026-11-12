package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qn3 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    public qn3(long r1, long r3, long r5, long r7, boolean r9, float r10, int r11, boolean r12, ArrayList r13, long r14, float r16, long r17, long r19) {
        this.a = r1;
        this.b = r3;
        this.c = r5;
        this.d = r7;
        this.e = r9;
        this.f = r10;
        this.g = r11;
        this.h = r12;
        this.i = r13;
        this.j = r14;
        this.k = r16;
        this.l = r17;
        this.m = r19;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L5;
        return true;
    L5:
        if ((r5 instanceof qn3) == false) goto L50;
        qn3 r6 = (qn3) r5;
        if (vr1.n(this.a, r6.a) == true) goto L11;
        return false;
    L11:
        if (this.b == r6.b) goto L14;
        return false;
    L14:
        if (g83.b(this.c, r6.c) == true) goto L17;
        return false;
    L17:
        if (g83.b(this.d, r6.d) == true) goto L20;
        return false;
    L20:
        if (this.e == r6.e) goto L23;
        return false;
    L23:
        if (Float.compare(this.f, r6.f) == 0) goto L26;
        return false;
    L26:
        if (this.g == r6.g) goto L28;
        return false;
    L28:
        if (this.h == r6.h) goto L31;
        return false;
    L31:
        if (this.i.equals(r6.i) == true) goto L34;
        return false;
    L34:
        if (g83.b(this.j, r6.j) == true) goto L37;
        return false;
    L37:
        if (Float.compare(this.k, r6.k) == 0) goto L40;
        return false;
    L40:
        if (g83.b(this.l, r6.l) == true) goto L43;
        return false;
    L43:
        if (g83.b(this.m, r6.m) == false) goto L62;
        return true;
    L62:
        return false;
    L50:
        return false;
    }

    public final int hashCode() {
        int r0 = b11.d(xa3.c(xa3.b(xa3.b(xa3.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), this.f, 31);
        int r1 = xa3.c(f34.d(this.g, r0, 31), 31, this.h);
        int r2 = xa3.b(b11.d(xa3.b((this.i.hashCode() + r1) * 31, 31, this.j), this.k, 31), 31, this.l);
        return Long.hashCode(this.m) + r2;
    }

    public final String toString() {
        String r0 = vr1.H(this.a);
        String r1 = g83.g(this.c);
        String r2 = g83.g(this.d);
        String r3 = un3.a(this.g);
        String r4 = g83.g(this.j);
        String r5 = g83.g(this.l);
        String r6 = g83.g(this.m);
        StringBuilder r7 = new StringBuilder("PointerInputEventData(id=");
        r7.append(r0);
        r7.append(", uptime=");
        r7.append(this.b);
        f34.n(r7, ", positionOnScreen=", r1, ", position=", r2);
        r7.append(", down=");
        r7.append(this.e);
        r7.append(", pressure=");
        r7.append(this.f);
        r7.append(", type=");
        r7.append(r3);
        r7.append(", activeHover=");
        r7.append(this.h);
        r7.append(", historical=");
        r7.append(this.i);
        r7.append(", scrollDelta=");
        r7.append(r4);
        r7.append(", scaleGestureFactor=");
        r7.append(this.k);
        r7.append(", panGestureOffset=");
        r7.append(r5);
        r7.append(", originalEventPosition=");
        r7.append(r6);
        r7.append(")");
        return r7.toString();
    }
}
