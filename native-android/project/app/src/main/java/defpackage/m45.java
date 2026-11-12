package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m45 {
    public final boolean a;
    public final l45 b;
    public final int c;
    public final vh0[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public m45(boolean r3, l45 r4) {
        this.a = r3;
        this.b = r4;
        if (r3 == true) goto L5;
    L9:
        int r5 = r4.ordinal();
        if (r5 != 0) goto L12;
        int r6 = 3;
    L17:
        this.c = r6;
        this.d = new vh0[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
        return;
    L12:
        if (r5 != 1) goto L14;
        r6 = 2;
        goto L17
    L14:
        er1.n();
        throw null;
    L5:
        if (r4.equals(l45.n) == false) goto L9;
        kf2.o("Lsq2 not (yet) supported for differential axes");
        throw null;
    }

    public final void a(long r3, float r5) {
        int r0 = (this.e + 1) % 20;
        this.e = r0;
        vh0[] r2 = this.d;
        vh0 r1 = r2[r0];
        if (r1 != null) goto L6;
        vh0 r4 = new vh0();
        r4.a = r3;
        r4.b = r5;
        r2[r0] = r4;
        return;
    L6:
        r1.a = r3;
        r1.b = r5;
    }

    public final float b(float r20) {
        float r2 = 0.0f;
        if (r20 > 0.0f) goto L6;
        cz1.b("maximumVelocity should be a positive value. You specified=" + r20);
    L6:
        int r3 = this.e;
        vh0[] r4 = this.d;
        vh0 r5 = r4[r3];
        if (r5 != null) goto L9;
        float r0 = 0.0f;
        float r16 = 0.0f;
    L59:
        if (r0 == r16) goto L84;
        if (Float.isNaN(r0) == true) goto L84;
        if (r0 > r16) goto L67;
        float r1 = -r20;
        if (r0 < r1) goto L73;
    L85:
        return r0;
    L73:
        return r1;
    L67:
        if (r0 <= r20) goto L85;
        r0 = r20;
    L84:
        return r16;
    L9:
        int r6 = 0;
        vh0 r7 = r5;
    L10:
        vh0 r8 = r4[r3];
        boolean r10 = this.a;
        l45 r11 = this.b;
        float[] r12 = this.f;
        float[] r13 = this.g;
        if (r8 == null) goto L12;
        long r14 = r5.a;
        r16 = r2;
        int r17 = r3;
        long r9 = r8.a;
        float r15 = r14 - r9;
        boolean r18 = r10;
        int r19 = 1;
        float r21 = Math.abs(r9 - r7.a);
        if (r11 == l45.n) goto L18;
        if (r18 == true) goto L18;
        r7 = r5;
    L20:
        if (r15 > 100.0f) goto L33;
        if (r21 > 40.0f) goto L33;
        r12[r6] = r8.b;
        r13[r6] = -r15;
        if (r17 != 0) goto L27;
        int r22 = 20;
    L28:
        r3 = r22 - 1;
        r6 = r6 + 1;
        if (r6 >= 20) goto L33;
        r2 = r16;
        goto L10
    L27:
        r22 = r17;
    L33:
        if (r6 < this.c) goto L57;
        int r23 = r11.ordinal();
        if (r23 == 0) goto L74;
        if (r23 != r19) goto L51;
        int r24 = r6 - r19;
        float r25 = r13[r24];
        int r26 = r24;
        float r27 = r16;
    L39:
        if (r26 <= 0) goto L50;
        int r28 = r26 - 1;
        float r29 = r13[r28];
        if (r25 == r29) goto L49;
        if (r18 == false) goto L45;
        float r30 = -r12[r28];
    L46:
        float r31 = r30 / (r25 - r29);
        r27 = r27 + (Math.abs(r31) * (r31 - (Math.signum(r27) * ((float) Math.sqrt(Math.abs(r27) * 2.0f)))));
        if (r26 != r24) goto L49;
        r27 = r27 * 0.5f;
        goto L49
    L45:
        r30 = r12[r26] - r12[r28];
    L49:
        r26 = r26 - 1;
        r25 = r29;
        goto L39
    L50:
        float r32 = Math.signum(r27) * ((float) Math.sqrt(Math.abs(r27) * 2.0f));
    L56:
        r0 = r32 * 1000.0f;
        goto L59
    L51:
        er1.n();
        return r16;
    L74:
        float[] r33 = this.h;     // Catch: IllegalArgumentException -> L55
        xl.G(r13, r12, r6, r33);     // Catch: IllegalArgumentException -> L55
        r32 = r33[1];     // Catch: IllegalArgumentException -> L55
    L55:
        r32 = r16;
        goto L56
    L57:
        r0 = r16;
    L18:
        r7 = r8;
        goto L20
    L12:
        r16 = r2;
        r18 = r10;
        r19 = 1;
        goto L33
    }

    public /* synthetic */ m45() {
        this(false, l45.n);
    }

    public m45(int r2) {
        this(true, l45.o);
    }
}
