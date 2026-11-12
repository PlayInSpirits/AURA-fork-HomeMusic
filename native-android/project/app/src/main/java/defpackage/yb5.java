package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yb5 {
    public static final i03 a = null;
    public static final wb5[] b = null;

    static {
        i03 r0 = new i03(8);
        wb5.a.getClass();
        xb5 r2 = vb5.g;
        r0.i(1, r2);
        xb5 r4 = vb5.f;
        r0.i(2, r4);
        xb5 r6 = vb5.b;
        r0.i(4, r6);
        xb5 r8 = vb5.d;
        r0.i(8, r8);
        xb5 r9 = vb5.h;
        r0.i(16, r9);
        xb5 r10 = vb5.e;
        r0.i(32, r10);
        xb5 r11 = vb5.i;
        r0.i(64, r11);
        xb5 r12 = vb5.c;
        r0.i(128, r12);
        a = r0;
        b = new wb5[]{r2, r4, r6, r11, r9, r10, r8, vb5.j, r12};
    }

    public static final void a(af2 r6, jz1 r7, long r8, int r10, int r11) {
        if (te5.o(r8, -1) == true) goto L6;
        r6.a(r7.b(), (int) ((r8 >>> 48) & 65535));
        r6.a(r7.d(), (int) ((r8 >>> 32) & 65535));
        r6.a(r7.c(), r10 - ((int) ((r8 >>> 16) & 65535)));
        r6.a(r7.a(), r11 - ((int) (r8 & 65535)));
        return;
    }
}
