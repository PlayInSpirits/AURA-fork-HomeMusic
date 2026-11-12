package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mz implements sv0 {
    public final lz n;
    public final i61 o;
    public gc p;
    public gc q;

    public mz() {
        ro0 r1 = gb.b;
        lz r0 = new lz();
        r0.a = r1;
        r0.b = r62.n;
        r0.c = p01.a;
        r0.d = 0;
        this.n = r0;
        this.o = new i61(this);
    }

    public static gc a(mz r2, long r3, q05 r5, int r6) {
        gc r4 = r2.c(r5);
        Paint r7 = (Paint) r4.b;
        if (x40.c(r4.a(), r3) == true) goto L6;
        r4.f(r3);
    L6:
        if (((Shader) r4.c) == null) goto L9;
        r4.c = null;
        r7.setShader(null);
    L9:
        if (h12.c((dt) r4.d, null) == true) goto L12;
        r4.g(null);
    L12:
        if (r4.a == r6) goto L16;
        r4.e(r6);
    L16:
        if (r7.isFilterBitmap() != true) goto L18;
        return r4;
    L18:
        r7.setFilterBitmap(true);
        return r4;
    }

    @Override // defpackage.sv0
    public final void H(long r8, long r10, long r12, q05 r14, int r15) {
        jz r0 = this.n.c;
        int r2 = (int) (r10 >> 32);
        float r9 = Float.intBitsToFloat(r2);
        int r11 = (int) (r10 & 4294967295L);
        float r13 = Float.intBitsToFloat(r11);
        float r16 = Float.intBitsToFloat(r2);
        float r1 = Float.intBitsToFloat((int) (r12 >> 32)) + r16;
        float r17 = Float.intBitsToFloat(r11);
        r0.g(r9, r13, r1, Float.intBitsToFloat((int) (r12 & 4294967295L)) + r17, a(this, r8, r14, r15));
    }

    @Override // defpackage.oo0
    public final float J() {
        return this.n.a.J();
    }

    @Override // defpackage.sv0
    public final i61 O() {
        return this.o;
    }

    @Override // defpackage.sv0
    public final void U(cc r13, long r14, long r16, long r18, float r20, dt r21, int r22) {
        c71 r2 = c71.d;
        this.n.c.b(r13, r14, r16, r18, b(null, r2, r20, r21, r22));
    }

    public final gc b(uo r4, q05 r5, float r6, dt r7, int r8) {
        gc r9 = c(r5);
        Paint r0 = (Paint) r9.b;
        if (r4 == null) goto L6;
        r4.d(P(), r9, r6);
    L16:
        if (h12.c((dt) r9.d, r7) == true) goto L19;
        r9.g(r7);
    L19:
        if (r9.a == 3) goto L23;
        r9.e(3);
    L23:
        if (r0.isFilterBitmap() != r8) goto L26;
        return r9;
    L26:
        if (r8 != 0) goto L28;
        boolean r10 = true;
    L29:
        r0.setFilterBitmap(true ^ r10);
        return r9;
    L28:
        r10 = false;
        goto L29
    L6:
        if (((Shader) r9.c) == null) goto L8;
        r9.c = null;
        r0.setShader(null);
    L8:
        long r3 = r9.a();
        long r1 = x40.b;
        if (x40.c(r3, r1) == true) goto L12;
        r9.f(r1);
    L12:
        if ((r0.getAlpha() / 255.0f) == r6) goto L16;
        r9.d(r6);
        goto L16
    }

    public final gc c(q05 r9) {
        int r1 = 0;
        if (h12.c(r9, c71.d) == false) goto L9;
        gc r10 = this.p;
        if (r10 != null) goto L68;
        gc r11 = fh0.b();
        r11.h(0);
        this.p = r11;
        return r11;
    L68:
        return r10;
    L9:
        if ((r9 instanceof ym4) == false) goto L66;
        gc r0 = this.q;
        if (r0 != null) goto L13;
        r0 = fh0.b();
        r0.h(1);
        this.q = r0;
    L13:
        Paint r8 = (Paint) r0.b;
        float r3 = r8.getStrokeWidth();
        ym4 r12 = (ym4) r9;
        float r4 = r12.d;
        if (r3 == r4) goto L17;
        r8.setStrokeWidth(r4);
    L17:
        Paint.Cap r5 = r8.getStrokeCap();
        int r6 = -1;
        if (r5 != null) goto L20;
        int r7 = -1;
    L22:
        if (r7 == 1) goto L28;
        if (r7 == 2) goto L27;
        if (r7 != 3) goto L28;
        int r13 = 2;
    L29:
        int r14 = r12.f;
        if (r13 == r14) goto L40;
        if (r14 != 2) goto L34;
        Paint.Cap r15 = Paint.Cap.SQUARE;
    L39:
        r8.setStrokeCap(r15);
        goto L40
    L34:
        if (r14 != 1) goto L36;
        r15 = Paint.Cap.ROUND;
        goto L39
    L36:
        if (r14 != 0) goto L38;
        r15 = Paint.Cap.BUTT;
        goto L39
    L38:
        r15 = Paint.Cap.BUTT;
    L40:
        float r16 = r8.getStrokeMiter();
        float r17 = r12.e;
        if (r16 == r17) goto L44;
        r8.setStrokeMiter(r17);
    L44:
        Paint.Join r18 = r8.getStrokeJoin();
        if (r18 == null) goto L48;
        r6 = hc.b[r18.ordinal()];
    L48:
        if (r6 == 1) goto L54;
        if (r6 == 2) goto L53;
        if (r6 != 3) goto L54;
        r1 = 1;
        goto L54
    L53:
        r1 = 2;
    L54:
        int r19 = r12.g;
        if (r1 != r19) goto L57;
        return r0;
    L57:
        if (r19 != 0) goto L59;
        Paint.Join r20 = Paint.Join.MITER;
    L64:
        r8.setStrokeJoin(r20);
        return r0;
    L59:
        if (r19 != 2) goto L61;
        r20 = Paint.Join.BEVEL;
        goto L64
    L61:
        if (r19 != 1) goto L63;
        r20 = Paint.Join.ROUND;
        goto L64
    L63:
        r20 = Paint.Join.MITER;
        goto L64
    L27:
        r13 = 1;
    L28:
        r13 = 0;
        goto L29
    L20:
        r7 = hc.a[r5.ordinal()];
        goto L22
    L66:
        er1.n();
        return null;
    }

    @Override // defpackage.sv0
    public final void d(nc r8, uo r9, float r10, q05 r11) {
        this.n.c.c(r8, b(r9, r11, r10, null, 1));
    }

    @Override // defpackage.oo0
    public final float g() {
        return this.n.a.g();
    }

    @Override // defpackage.sv0
    public final r62 getLayoutDirection() {
        return this.n.b;
    }
}
