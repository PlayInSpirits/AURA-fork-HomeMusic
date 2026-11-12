package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cb1 {
    public static final float[] a = null;
    public static volatile mj4 b;
    public static final Object[] c = null;

    static {
        a = new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
        b = new mj4(0);
        Object[] r1 = new Object[0];
        c = r1;
        monitor-enter(r1);
        b.d(115, new db1(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));     // Catch: Throwable -> L11
        b.d(130, new db1(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));     // Catch: Throwable -> L11
        b.d(150, new db1(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));     // Catch: Throwable -> L11
        b.d(180, new db1(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));     // Catch: Throwable -> L11
        b.d(200, new db1(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));     // Catch: Throwable -> L11
        monitor-exit(r1);
        if (((b.c(0) / 100.0f) - 0.01f) <= 1.03f) goto L9;
        return;
    L9:
        ez1.b("You should only apply non-linear scaling to font scales > 1");
        return;
    L11:
        th = move-exception;
        throw th;
    }

    public static bb1 a(float r9) {
        float[] r0 = a;
        if (r9 < 1.03f) goto L30;
        int r3 = (int) (r9 * 100.0f);
        bb1 r1 = (bb1) b.b(r3);
        if (r1 == null) goto L7;
        return r1;
    L7:
        mj4 r2 = b;
        if (r2.n == false) goto L10;
        su3.f(r2);
    L10:
        int r4 = su3.h(r2.q, r3, r2.o);
        if (r4 >= 0) goto L13;
        int r5 = -(r4 + 1);
        int r6 = r5 - 1;
        int r7 = 0;
        if (r5 < b.e()) goto L18;
        db1 r8 = new db1(new float[]{1.0f}, new float[]{r9});
        b(r9, r8);
        return r8;
    L18:
        if (r6 >= 0) goto L20;
        bb1 r10 = new db1(r0, r0);
        float r11 = 1.0f;
    L21:
        float r12 = b.c(r5) / 100.0f;
        if (r11 != r12) goto L24;
        float r13 = 0.0f;
    L25:
        float r14 = (Math.max(0.0f, Math.min(1.0f, r13)) * 1.0f) + 0.0f;
        bb1 r15 = (bb1) b.f(r5);
        float[] r16 = new float[9];
    L26:
        if (r7 >= 9) goto L28;
        float r17 = r0[r7];
        float r18 = r10.b(r17);
        r16[r7] = ((r15.b(r17) - r18) * r14) + r18;
        r7 = r7 + 1;
        goto L26
    L28:
        db1 r19 = new db1(r0, r16);
        b(r9, r19);
        return r19;
    L24:
        r13 = (r9 - r11) / (r12 - r11);
        goto L25
    L20:
        r11 = b.c(r6) / 100.0f;
        r10 = (bb1) b.f(r6);
        goto L21
    L13:
        return (bb1) b.f(r4);
    L30:
        return null;
    }

    public static void b(float r3, db1 r4) {
        Object[] r0 = c;
        monitor-enter(r0);
        mj4 r1 = b.a();     // Catch: Throwable -> L7
        r1.d((int) (r3 * 100.0f), r4);     // Catch: Throwable -> L7
        b = r1;     // Catch: Throwable -> L7
        monitor-exit(r0);
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
