package defpackage;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class na extends ig1 implements gf1 {
    public final /* synthetic */ int n;

    public /* synthetic */ na(int r2, Object r3, Class r4, String r5, String r6, int r7, int r8) {
        this.n = r8;
        super(r2, r7, r4, r3, r5, r6);
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int r1 = this.n;
        j15 r3 = j15.a;
        switch(r1) {
            case 0: goto L101;
            case 1: goto L26;
            case 2: goto L25;
            case 3: goto L22;
            case 4: goto L20;
            case 5: goto L18;
            case 6: goto L16;
            case 7: goto L14;
            default: goto L4;
        };
    L4:
        s24 r0 = (s24) this.receiver;
        td0 r2 = r0.a;
        if (r2 == null) goto L12;
        te5.g(r2, null);
        r0.i();
        p24 r4 = r0.d;
        if (r4 == null) goto L10;
        r4.f.close();
        return r3;
    L10:
        h12.Q("connectionManager");
        throw null;
    L12:
        h12.Q("coroutineScope");
        throw null;
    L14:
        ((rr1) this.receiver).getClass();
        return Boolean.valueOf(rr1.e().contains("listening_checkpoints_v1"));
    L16:
        ((b00) this.receiver).getClass();
        return b00.a();
    L18:
        ((rr1) this.receiver).getClass();
        return Boolean.valueOf(rr1.e().contains("favorite_compensation_chains_v1"));
    L20:
        ((rr1) this.receiver).getClass();
        return Boolean.valueOf(rr1.e().contains("typed_favorites_v1"));
    L22:
        ((b00) this.receiver).getClass();
        return b00.a();
    L26:
        s91 r5 = (s91) this.receiver;
        x03 r6 = r5.c;
        x03 r7 = r5.d;
        ey r8 = r5.a;
        ba1 r9 = r8.f();
        if (r9 != null) goto L44;
        Object[] r10 = r7.b;
        long[] r11 = r7.a;
        int r12 = r11.length - 2;
        if (r12 < 0) goto L95;
        int r13 = 0;
    L31:
        long r14 = r11[r13];
        if (((((~r14) << 7) & r14) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L41;
        int r15 = 8 - ((~(r13 - r12)) >>> 31);
        int r16 = 0;
    L34:
        if (r16 >= r15) goto L40;
        if ((r14 & 255) < 128) goto L38;
        r14 = r14 >> 8;
        r16 = r16 + 1;
        goto L34
    L38:
        ((xo) r10[(r13 << 3) + r16]).r0();
        throw null;
    L40:
        if (r15 != 8) goto L95;
    L41:
        if (r13 == r12) goto L95;
        r13 = r13 + 1;
    L95:
        if (r8.f() != null) goto L97;
    L98:
        r8.c();
    L99:
        r6.b();
        r7.b();
        r5.e = false;
        return r3;
    L97:
        if (((ba1) r8.c).v0() != z91.p) goto L99;
    L44:
        if (r9.A == false) goto L95;
        if (r6.c(r9) == false) goto L48;
        r9.w0();
    L48:
        r9.v0();
        if (r9.n.A == true) goto L51;
        cz1.b("visitAncestors called on an unattached node");
    L51:
        cx2 r17 = r9.n;
        c72 r18 = j51.O(r9);
        int r19 = 0;
    L52:
        if (r18 == null) goto L79;
        if ((((cx2) r18.Q.g).q & 5120) == 0) goto L73;
    L55:
        if (r17 == null) goto L73;
        int r20 = r17.p;
        if ((r20 & 5120) == 0) goto L72;
        if ((r20 & 1024) == 0) goto L62;
        r19 = r19 + 1;
    L62:
        if ((r17 instanceof xo) == false) goto L72;
        if (r7.c(r17) == false) goto L72;
        if (r19 > 1) goto L70;
        ((xo) r17).r0();
        throw null;
    L70:
        ((xo) r17).r0();
        throw null;
    L72:
        r17 = r17.r;
    L73:
        r18 = r18.t();
        if (r18 == null) goto L78;
        w12 r21 = r18.Q;
        if (r21 == null) goto L78;
        r17 = (sq4) r21.f;
    L78:
        r17 = null;
        goto L52
    L79:
        Object[] r22 = r7.b;
        long[] r23 = r7.a;
        int r24 = r23.length - 2;
        if (r24 < 0) goto L95;
        int r25 = 0;
    L82:
        long r26 = r23[r25];
        if (((((~r26) << 7) & r26) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L92;
        int r110 = 8 - ((~(r25 - r24)) >>> 31);
        int r111 = 0;
    L85:
        if (r111 >= r110) goto L91;
        if ((r26 & 255) < 128) goto L89;
        r26 = r26 >> 8;
        r111 = r111 + 1;
        goto L85
    L89:
        ((xo) r22[(r25 << 3) + r111]).r0();
        throw null;
    L91:
        if (r110 != 8) goto L95;
    L92:
        if (r25 == r24) goto L95;
        r25 = r25 + 1;
        goto L82
    L101:
        View r27 = (View) this.receiver;
        int r28 = Build.VERSION.SDK_INT;
        if (r28 < 30) goto L105;
        p3.g(r27);
    L105:
        if (r28 < 29) goto L111;
        ContentCaptureSession r29 = yh.a(r27);
        if (r29 == null) goto L111;
        return new gp3(5, r29, r27);
    L111:
        return null;
    L25:
        return Boolean.valueOf(((ea1) this.receiver).I.y0(7));
    }
}
