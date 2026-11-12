package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zs4 {
    public final ij4 a;
    public final sd3 b;
    public final eh3 c;

    static {
        new zs4(16777215, 0, 0);
    }

    public zs4(int r22, long r23, long r25) {
        if ((r22 & 1) == 0) goto L5;
        long r3 = x40.g;
    L7:
        if ((r22 & 2) == 0) goto L9;
        long r5 = bt4.c;
    L10:
        long r10 = bt4.c;
        long r17 = x40.g;
        if ((r22 & 32768) == 0) goto L13;
        int r0 = 0;
    L14:
        this(new ij4(r3, r5, null, null, null, null, null, r10, null, null, null, r17, null, null), new sd3(r0, 0, r10, null, null, null, 0, 0, null), null);
        return;
    L13:
        r0 = 3;
        goto L14
    L9:
        r5 = r25;
        goto L10
    L5:
        r3 = r23;
        goto L7
    }

    public static zs4 a(zs4 r23, long r24) {
        long r4 = bt4.c;
        long r18 = x40.g;
        ij4 r12 = jj4.a(r23.a, r24, null, Float.NaN, r4, null, null, null, null, null, r4, null, null, null, r18, null, null, null);
        sd3 r1 = td3.a(r23.b, 0, 0, r4, null, null, null, 0, 0, null);
        if (r23.a != r12) goto L8;
        if (r23.b != r1) goto L8;
        return r23;
    L8:
        return new zs4(r12, r1);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof zs4) == true) goto L8;
        return false;
    L8:
        zs4 r6 = (zs4) r5;
        ij4 r1 = r6.a;
        if (h12.c(this.a, r1) == true) goto L12;
        return false;
    L12:
        if (h12.c(this.b, r6.b) == true) goto L15;
        return false;
    L15:
        if (h12.c(this.c, r6.c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        int r1 = (this.b.hashCode() + r0) * 31;
        eh3 r2 = this.c;
        if (r2 == null) goto L5;
        int r3 = r2.hashCode();
    L7:
        return r1 + r3;
    L5:
        r3 = 0;
        goto L7
    }

    public final String toString() {
        ij4 r1 = this.a;
        String r2 = x40.h(r1.a.c());
        uo r3 = r1.a.f();
        float r4 = r1.a.b();
        String r5 = bt4.d(r1.b);
        gb1 r6 = r1.c;
        eb1 r7 = r1.d;
        fb1 r8 = r1.e;
        vk0 r9 = r1.f;
        String r10 = r1.g;
        String r11 = bt4.d(r1.h);
        hr r12 = r1.i;
        bs4 r13 = r1.j;
        vd2 r14 = r1.k;
        String r15 = x40.h(r1.l);
        sr4 r16 = r1.m;
        xb4 r17 = r1.n;
        q05 r18 = r1.o;
        sd3 r19 = this.b;
        String r0 = mr4.a(r19.a);
        String r20 = ur4.a(r19.b);
        String r110 = bt4.d(r19.c);
        cs4 r111 = r19.d;
        ra2 r112 = r19.f;
        String r113 = ma2.a(r19.g);
        String r114 = du1.a(r19.h);
        qs4 r21 = r19.i;
        StringBuilder r22 = new StringBuilder("TextStyle(color=");
        r22.append(r2);
        r22.append(", brush=");
        r22.append(r3);
        r22.append(", alpha=");
        r22.append(r4);
        r22.append(", fontSize=");
        r22.append(r5);
        r22.append(", fontWeight=");
        r22.append(r6);
        r22.append(", fontStyle=");
        r22.append(r7);
        r22.append(", fontSynthesis=");
        r22.append(r8);
        r22.append(", fontFamily=");
        r22.append(r9);
        r22.append(", fontFeatureSettings=");
        f34.n(r22, r10, ", letterSpacing=", r11, ", baselineShift=");
        r22.append(r12);
        r22.append(", textGeometricTransform=");
        r22.append(r13);
        r22.append(", localeList=");
        r22.append(r14);
        r22.append(", background=");
        r22.append(r15);
        r22.append(", textDecoration=");
        r22.append(r16);
        r22.append(", shadow=");
        r22.append(r17);
        r22.append(", drawStyle=");
        r22.append(r18);
        r22.append(", textAlign=");
        r22.append(r0);
        r22.append(", textDirection=");
        f34.n(r22, r20, ", lineHeight=", r110, ", textIndent=");
        r22.append(r111);
        r22.append(", platformStyle=");
        r22.append(this.c);
        r22.append(", lineHeightStyle=");
        r22.append(r112);
        r22.append(", lineBreak=");
        r22.append(r113);
        r22.append(", hyphens=");
        r22.append(r114);
        r22.append(", textMotion=");
        r22.append(r21);
        r22.append(")");
        return r22.toString();
    }

    public zs4(ij4 r3, sd3 r4) {
        r3.getClass();
        zg3 r0 = r4.e;
        if (r0 != null) goto L5;
        eh3 r1 = null;
    L6:
        this(r3, r4, r1);
        return;
    L5:
        r1 = new eh3(r0);
        goto L6
    }

    public zs4(ij4 r1, sd3 r2, eh3 r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }
}
