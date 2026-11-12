package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ev3 {
    public final bv3 a;
    public final ArrayList b;
    public final int c;
    public final y10 d;
    public final oz3 e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public ev3(bv3 r1, ArrayList r2, int r3, y10 r4, oz3 r5, int r6, int r7, int r8) {
        r5.getClass();
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
        this.h = r8;
    }

    public static ev3 a(ev3 r9, int r10, y10 r11, oz3 r12, int r13) {
        if ((r13 & 1) == 0) goto L5;
        r10 = r9.c;
    L5:
        int r3 = r10;
        if ((r13 & 2) == 0) goto L8;
        r11 = r9.d;
    L8:
        y10 r4 = r11;
        if ((r13 & 4) == 0) goto L11;
        r12 = r9.e;
    L11:
        oz3 r5 = r12;
        int r6 = r9.f;
        int r7 = r9.g;
        int r8 = r9.h;
        r5.getClass();
        return new ev3(r9.a, r9.b, r3, r4, r5, r6, r7, r8);
    }

    public final k14 b(oz3 r10) {
        r10.getClass();
        ArrayList r0 = this.b;
        int r1 = r0.size();
        int r3 = this.c;
        if (r3 >= r1) goto L28;
        this.i++;
        y10 r5 = this.d;
        if (r5 != null) goto L7;
    L15:
        int r7 = r3 + 1;
        ev3 r9 = a(this, r7, null, r10, 58);
        r02 r11 = (r02) r0.get(r3);
        k14 r4 = r11.a(r9);
        if (r4 == null) goto L27;
        if (r5 != null) goto L19;
    L25:
        return r4;
    L19:
        if (r7 >= r0.size()) goto L25;
        if (r9.i == 1) goto L25;
        nz2.z(r11, " must call proceed() exactly once", "network interceptor ");
        return null;
    L27:
        throw new NullPointerException("interceptor " + r11 + " returned null");
    L7:
        if (((s21) r5.e).d().f(r10.a) == true) goto L9;
        nz2.z(r0.get(r3 - 1), " must retain the same host and port", "network interceptor ");
        return null;
    L9:
        if (this.i == 1) goto L15;
        nz2.z(r0.get(r3 - 1), " must call proceed() exactly once", "network interceptor ");
        return null;
    L28:
        kf2.o("Check failed.");
        return null;
    }
}
