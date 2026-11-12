package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eb3 extends im4 {
    public static final byte[] o = null;
    public static final byte[] p = null;
    public boolean n;

    static {
        o = new byte[]{79, 112, 117, 115, 72, 101, 97, 100};
        p = new byte[]{79, 112, 117, 115, 84, 97, 103, 115};
    }

    public static boolean e(be3 r4, byte[] r5) {
        if (r4.a() >= r5.length) goto L5;
        return false;
    L5:
        int r0 = r4.b;
        byte[] r1 = new byte[r5.length];
        r4.k(r1, 0, r5.length);
        r4.N(r0);
        return Arrays.equals(r1, r5);
    }

    @Override // defpackage.im4
    public final long b(be3 r5) {
        byte[] r6 = r5.a;
        byte r0 = 0;
        byte r1 = r6[0];
        if (r6.length <= 1) goto L5;
        r0 = r6[1];
    L5:
        long r2 = su3.t(r1, r0);
        return (((long) this.i) * r2) / 1000000;
    }

    @Override // defpackage.im4
    public final boolean c(be3 r2, long r3, rf2 r5) {
        if (e(r2, o) == false) goto L10;
        byte[] r1 = Arrays.copyOf(r2.a, r2.c);
        int r4 = r1[9] & 255;
        ArrayList r6 = su3.j(r1);
        if (((tb1) r5.n) != null) goto L16;
        sb1 r7 = new sb1();
        r7.l = lw2.m("audio/ogg");
        r7.m = lw2.m("audio/opus");
        r7.E = r4;
        r7.F = 48000;
        r7.p = r6;
        r5.n = new tb1(r7);
        return true;
    L16:
        return true;
    L10:
        if (e(r2, p) == false) goto L19;
        ((tb1) r5.n).getClass();
        if (this.n == true) goto L16;
        this.n = true;
        r2.O(8);
        qv2 r8 = zz1.w(yw1.l((String[]) zz1.C(r2, false, false).n));
        if (r8 == null) goto L16;
        sb1 r9 = ((tb1) r5.n).a();
        r9.k = r8.b(((tb1) r5.n).l);
        r5.n = new tb1(r9);
        return true;
    L19:
        ((tb1) r5.n).getClass();
        return false;
    }

    @Override // defpackage.im4
    public final void d(boolean r1) {
        super.d(r1);
        if (r1 == false) goto L6;
        this.n = false;
        return;
    }
}
