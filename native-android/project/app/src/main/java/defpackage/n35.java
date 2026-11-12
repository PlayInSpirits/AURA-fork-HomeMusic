package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n35 extends i35 {
    public final gk1 b;
    public String c;
    public boolean d;
    public final pv0 e;
    public gf1 f;
    public final zd3 g;
    public dt h;
    public final zd3 i;
    public long j;
    public float k;
    public float l;
    public final m35 m;

    public n35(gk1 r4) {
        this.b = r4;
        r4.i = new m35(this, 0);
        this.c = "";
        this.d = true;
        this.e = new pv0();
        this.f = new rd2(10);
        this.g = uc5.B(null);
        this.i = uc5.B(new qf4(0));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new m35(this, 1);
    }

    @Override // defpackage.i35
    public final void a(sv0 r3) {
        e(r3, 1.0f, null);
    }

    public final void e(sv0 r28, float r29, dt r30) {
        gk1 r2 = this.b;
        boolean r3 = r2.d;
        int r4 = 3;
        zd3 r6 = this.g;
        if (r3 == true) goto L5;
    L23:
        int r5 = 0;
    L24:
        boolean r9 = this.d;
        pv0 r11 = this.e;
        if (r9 == false) goto L27;
    L51:
        if (r5 != 1) goto L57;
        long r12 = r2.e;
        int r7 = c45.a;
        if (x40.d(r12) == 1.0f) goto L56;
        r12 = x40.b(r12, 1.0f);
    L56:
        dt r8 = new dt(5, r12);
    L58:
        this.h = r8;
        float r10 = Float.intBitsToFloat((int) (r28.P() >> 32));
        zd3 r13 = this.i;
        this.k = r10 / Float.intBitsToFloat((int) (((qf4) r13.getValue()).a >> 32));
        this.l = Float.intBitsToFloat((int) (r28.P() & 4294967295L)) / Float.intBitsToFloat((int) (((qf4) r13.getValue()).a & 4294967295L));
        long r14 = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (r28.P() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (r28.P() & 4294967295L))))) & 4294967295L);
        r62 r15 = r28.getLayoutDirection();
        cc r16 = r11.a;
        aa r17 = r11.b;
        if (r16 == null) goto L69;
        if (r17 == null) goto L69;
        int r18 = (int) (r14 >> 32);
        Bitmap r19 = r16.a;
        char r110 = ' ';
        if (r18 > r19.getWidth()) goto L68;
        r62 r20 = r15;
        if (((int) (r14 & 4294967295L)) <= r19.getHeight()) goto L66;
    L70:
        int r21 = (int) (r14 >> r110);
        int r22 = (int) (r14 & 4294967295L);
        k24 r23 = s50.e;
        Bitmap.Config r24 = fu.O(r5);
        if (Build.VERSION.SDK_INT < 26) goto L73;
        Bitmap r25 = j3.e(r21, r22, fu.O(r5), r50.a(r23));
    L74:
        r16 = new cc(r25);
        Canvas r26 = ba.a;
        r17 = new aa();
        r17.a = new Canvas(r25);
        r11.a = r16;
        r11.b = r17;
        r11.d = r5;
    L75:
        r11.c = r14;
        mz r27 = r11.e;
        long r31 = l93.o0(r14);
        lz r32 = r27.n;
        oo0 r33 = r32.a;
        r62 r111 = r32.b;
        jz r112 = r32.c;
        long r1 = r32.d;
        sv0 r113 = r28;
        r32.a = r113;
        r32.b = r20;
        r32.c = r17;
        r32.d = r31;
        r17.e();
        sv0.l(r27, x40.b, 0, 62);
        this.m.invoke(r27);
        r17.k();
        lz r34 = r27.n;
        r34.a = r33;
        r34.b = r111;
        r34.c = r112;
        r34.d = r1;
        r16.a.prepareToDraw();
        this.d = false;
        this.j = r113.P();
    L76:
        if (r30 == null) goto L79;
        dt r210 = r30;
    L83:
        cc r0 = r11.a;
        if (r0 != null) goto L87;
        cz1.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
    L87:
        sv0.p(r113, r0, r11.c, 0, r29, r210, 0, 858);
        return;
    L79:
        if (((dt) r6.getValue()) == null) goto L82;
        dt r35 = (dt) r6.getValue();
    L81:
        r210 = r35;
        goto L83
    L82:
        r35 = this.h;
        goto L81
    L73:
        r25 = Bitmap.createBitmap(null, r21, r22, r24);
        r25.setHasAlpha(true);
        goto L74
    L66:
        if (r11.d != r5) goto L70;
    L68:
        r20 = r15;
    L69:
        r110 = ' ';
        goto L68
    L57:
        r8 = null;
        goto L58
    L27:
        if (qf4.a(this.j, r28.P()) == false) goto L51;
        cc r36 = r11.a;
        if (r36 == null) goto L48;
        Bitmap.Config r37 = r36.a.getConfig();
        r37.getClass();
        if (r37 != Bitmap.Config.ALPHA_8) goto L34;
        r4 = 1;
    L49:
        if (r5 != r4) goto L51;
        r113 = r28;
        goto L76
    L34:
        if (r37 != Bitmap.Config.RGB_565) goto L37;
        r4 = 2;
        goto L49
    L37:
        if (r37 == Bitmap.Config.ARGB_4444) goto L48;
        int r114 = Build.VERSION.SDK_INT;
        if (r114 >= 26) goto L42;
    L44:
        if (r114 < 26) goto L48;
        if (r37 != j3.D()) goto L48;
        r4 = 4;
        goto L49
    L42:
        if (r37 != j3.d()) goto L44;
    L48:
        r4 = 0;
        goto L49
    L5:
        if (r2.e == 16) goto L23;
        dt r38 = (dt) r6.getValue();
        int r39 = c45.a;
        if ((r38 instanceof dt) == false) goto L13;
        int r40 = r38.c;
        if (r40 == 5) goto L15;
        if (r40 != 3) goto L23;
    L15:
        if ((r30 instanceof dt) == false) goto L21;
        int r41 = r30.c;
        if (r41 == 5) goto L22;
        if (r41 != 3) goto L23;
    L22:
        r5 = 1;
        goto L24
    L21:
        if (r30 != null) goto L23;
    L13:
        if (r38 != null) goto L23;
        goto L23
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("Params: \tname: ");
        r0.append(this.c);
        r0.append("\n\tviewportWidth: ");
        zd3 r5 = this.i;
        r0.append(Float.intBitsToFloat((int) (((qf4) r5.getValue()).a >> 32)));
        r0.append("\n\tviewportHeight: ");
        r0.append(Float.intBitsToFloat((int) (((qf4) r5.getValue()).a & 4294967295L)));
        r0.append("\n");
        return r0.toString();
    }
}
