package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class co2 {
    public CharSequence A;
    public Integer B;
    public Integer C;
    public CharSequence D;
    public CharSequence E;
    public CharSequence F;
    public Integer G;
    public Bundle H;
    public yw1 I;
    public CharSequence a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public Long h;
    public lu3 i;
    public lu3 j;
    public byte[] k;
    public Integer l;
    public Uri m;
    public Integer n;
    public Integer o;
    public Integer p;
    public Boolean q;
    public Boolean r;
    public Integer s;
    public Integer t;
    public Integer u;
    public Integer v;
    public Integer w;
    public Integer x;
    public CharSequence y;
    public CharSequence z;

    public co2() {
        vw1 r0 = yw1.o;
        this.I = gy3.r;
    }

    public final void a(int r3, byte[] r4) {
        if (this.k != null) goto L5;
    L10:
        this.k = (byte[]) r4.clone();
        this.l = Integer.valueOf(r3);
        return;
    L5:
        if (r3 == 3) goto L10;
        if (Objects.equals(this.l, 3) == false) goto L10;
    }

    public final void b(do2 r4) {
        if (r4 == null) goto L109;
        yw1 r0 = r4.J;
        byte[] r1 = r4.k;
        CharSequence r2 = r4.a;
        if (r2 == null) goto L7;
        this.a = r2;
    L7:
        CharSequence r3 = r4.b;
        if (r3 == null) goto L10;
        this.b = r3;
    L10:
        CharSequence r5 = r4.c;
        if (r5 == null) goto L13;
        this.c = r5;
    L13:
        CharSequence r6 = r4.d;
        if (r6 == null) goto L16;
        this.d = r6;
    L16:
        CharSequence r7 = r4.e;
        if (r7 == null) goto L19;
        this.e = r7;
    L19:
        CharSequence r8 = r4.f;
        if (r8 == null) goto L22;
        this.f = r8;
    L22:
        CharSequence r9 = r4.g;
        if (r9 == null) goto L25;
        this.g = r9;
    L25:
        Long r10 = r4.h;
        if (r10 == null) goto L28;
        d(r10);
    L28:
        lu3 r11 = r4.i;
        if (r11 == null) goto L31;
        this.i = r11;
    L31:
        lu3 r12 = r4.j;
        if (r12 == null) goto L34;
        this.j = r12;
    L34:
        Uri r13 = r4.m;
        if (r13 != null) goto L37;
        if (r1 != null) goto L37;
    L38:
        Integer r14 = r4.n;
        if (r14 == null) goto L41;
        this.n = r14;
    L41:
        Integer r15 = r4.o;
        if (r15 == null) goto L44;
        this.o = r15;
    L44:
        Integer r16 = r4.p;
        if (r16 == null) goto L47;
        this.p = r16;
    L47:
        Boolean r17 = r4.q;
        if (r17 == null) goto L50;
        this.q = r17;
    L50:
        Boolean r18 = r4.r;
        if (r18 == null) goto L53;
        this.r = r18;
    L53:
        Integer r19 = r4.s;
        if (r19 == null) goto L56;
        this.s = r19;
    L56:
        Integer r20 = r4.t;
        if (r20 == null) goto L59;
        this.s = r20;
    L59:
        Integer r21 = r4.u;
        if (r21 == null) goto L62;
        this.t = r21;
    L62:
        Integer r22 = r4.v;
        if (r22 == null) goto L65;
        this.u = r22;
    L65:
        Integer r23 = r4.w;
        if (r23 == null) goto L68;
        this.v = r23;
    L68:
        Integer r24 = r4.x;
        if (r24 == null) goto L71;
        this.w = r24;
    L71:
        Integer r25 = r4.y;
        if (r25 == null) goto L74;
        this.x = r25;
    L74:
        CharSequence r26 = r4.z;
        if (r26 == null) goto L77;
        this.y = r26;
    L77:
        CharSequence r27 = r4.A;
        if (r27 == null) goto L80;
        this.z = r27;
    L80:
        CharSequence r28 = r4.B;
        if (r28 == null) goto L83;
        this.A = r28;
    L83:
        Integer r29 = r4.C;
        if (r29 == null) goto L86;
        this.B = r29;
    L86:
        Integer r30 = r4.D;
        if (r30 == null) goto L89;
        this.C = r30;
    L89:
        CharSequence r31 = r4.E;
        if (r31 == null) goto L92;
        this.D = r31;
    L92:
        CharSequence r32 = r4.F;
        if (r32 == null) goto L95;
        this.E = r32;
    L95:
        CharSequence r33 = r4.G;
        if (r33 == null) goto L98;
        this.F = r33;
    L98:
        Integer r34 = r4.H;
        if (r34 == null) goto L101;
        this.G = r34;
    L101:
        Bundle r35 = r4.I;
        if (r35 == null) goto L105;
        this.H = r35;
    L105:
        if (r0.isEmpty() == true) goto L108;
        this.I = yw1.k(r0);
        return;
    L108:
        return;
    L37:
        this.m = r13;
        c(r1, r4.l);
        goto L38
    }

    public final void c(byte[] r1, Integer r2) {
        if (r1 != null) goto L4;
        byte[] r3 = null;
    L5:
        this.k = r3;
        this.l = r2;
        return;
    L4:
        r3 = (byte[]) r1.clone();
        goto L5
    }

    public final void d(Long r5) {
        if (r5 != null) goto L4;
    L7:
        boolean r0 = true;
    L8:
        rr2.l(r0);
        this.h = r5;
        return;
    L4:
        if (r5.longValue() >= 0) goto L7;
        r0 = false;
        goto L8
    }
}
