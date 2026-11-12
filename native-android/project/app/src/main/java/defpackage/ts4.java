package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ts4 extends kq implements Handler.Callback {
    public final i80 F;
    public final cj0 G;
    public kg0 H;
    public final sn4 I;
    public boolean J;
    public int K;
    public rn4 L;
    public vn4 M;
    public wn4 N;
    public wn4 O;
    public int P;
    public final Handler Q;
    public final rs4 R;
    public final gp3 S;
    public boolean T;
    public boolean U;
    public tb1 V;
    public long W;
    public long X;

    public ts4(rs4 r3, Looper r4) {
        om1 r0 = sn4.l;
        super(3);
        this.R = r3;
        if (r4 != null) goto L5;
        Handler r5 = null;
    L6:
        this.Q = r5;
        this.I = r0;
        this.F = new i80(19);
        this.G = new cj0(1, 0);
        this.S = new gp3(9, false);
        this.X = -9223372036854775807L;
        this.W = -9223372036854775807L;
        return;
    L5:
        String r6 = f35.a;
        r5 = new Handler(r4, this);
        goto L6
    }

    @Override // defpackage.kq
    public final void A(long r20, long r22) {
        if (this.A == false) goto L10;
        long r5 = this.X;
        if (r5 == (-9223372036854775807L)) goto L10;
        if (r20 < r5) goto L10;
        L();
        this.U = true;
    L10:
        if (this.U == true) goto L157;
        tb1 r0 = this.V;
        r0.getClass();
        boolean r1 = Objects.equals(r0.n, "application/x-media3-cues");
        rs4 r6 = this.R;
        Handler r7 = this.Q;
        int r8 = 4;
        gp3 r9 = this.S;
        boolean r10 = false;
        r10 = false;
        int r11 = 0;
        r10 = false;
        if (r1 == false) goto L46;
        this.H.getClass();
        if (this.T == true) goto L28;
        cj0 r2 = this.G;
        if (z(r9, r2, 0) != (-4)) goto L28;
        if (r2.d(4) == false) goto L23;
        this.T = true;
        goto L28
    L23:
        r2.u();
        ByteBuffer r12 = r2.r;
        r12.getClass();
        long r13 = r2.t;
        byte[] r14 = r12.array();
        int r15 = r12.arrayOffset();
        int r16 = r12.limit();
        this.F.getClass();
        Parcel r17 = Parcel.obtain();
        r17.unmarshall(r14, r15, r16);
        r17.setDataPosition(0);
        Bundle r18 = r17.readBundle(Bundle.class.getClassLoader());
        r17.recycle();
        ArrayList r19 = r18.getParcelableArrayList("c");
        r19.getClass();
        uw1 r21 = yw1.j();
    L25:
        if (r11 >= r19.size()) goto L27;
        Bundle r110 = (Bundle) r19.get(r11);
        r110.getClass();
        r21.c(ig0.a(r110));
        r11 = r11 + 1;
        goto L25
    L27:
        lg0 r111 = new lg0(r13, r18.getLong("d"), r21.f());
        r2.r();
        r10 = this.H.b(r111, r20);
    L28:
        long r23 = this.H.a(this.W);
        if (r23 == Long.MIN_VALUE) goto L31;
    L34:
        if (r23 != Long.MIN_VALUE) goto L36;
    L38:
        if (r10 == false) goto L44;
        yw1 r3 = this.H.c(r20);
        long r24 = this.H.d(r20);
        jg0 r25 = new jg0(J(r24), r3);
        if (r7 == null) goto L42;
        r7.obtainMessage(1, r25).sendToTarget();
    L43:
        this.H.e(r24);
        goto L44
    L42:
        r6.n(r25.a);
        r6.e(r25);
    L44:
        this.W = r20;
        return;
    L36:
        if (r23 > r20) goto L38;
        r10 = true;
        goto L38
    L31:
        if (this.T == false) goto L34;
        if (r10 == true) goto L34;
        this.U = true;
        goto L34
    L46:
        H();
        this.W = r20;
        if (this.O != null) goto L58;
        rn4 r4 = this.L;
        r4.getClass();
        r4.c(r20);
        rn4 r26 = this.L;     // Catch: SubtitleDecoderException -> L51
        r26.getClass();     // Catch: SubtitleDecoderException -> L51
        this.O = (wn4) r26.d();     // Catch: SubtitleDecoderException -> L51
    L51:
        e = move-exception;
        l93.G("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.V, e);
        jg0 r27 = new jg0(J(this.W), gy3.r);
        if (r7 == null) goto L55;
        r7.obtainMessage(1, r27).sendToTarget();
    L56:
        L();
        rn4 r28 = this.L;
        r28.getClass();
        r28.a();
        this.L = null;
        this.K = 0;
        K();
        return;
    L55:
        r6.n(r27.a);
        r6.e(r27);
    L58:
        if (this.u == 2) goto L61;
        return;
    L61:
        if (this.N == null) goto L66;
        long r112 = I();
        boolean r29 = false;
    L64:
        if (r112 > r20) goto L67;
        this.P++;
        r112 = I();
        r29 = true;
    L67:
        wn4 r113 = this.O;
        if (r113 != null) goto L70;
    L77:
        gp3 r114 = r9;
        boolean r30 = r29;
    L85:
        if (r30 == false) goto L101;
        this.N.getClass();
        int r31 = this.N.e(r20);
        if (r31 != 0) goto L89;
    L95:
        long r32 = this.N.p;
    L96:
        jg0 r33 = new jg0(J(r32), this.N.m(r20));
        if (r7 == null) goto L99;
        r7.obtainMessage(1, r33).sendToTarget();
        goto L101
    L99:
        r6.n(r33.a);
        r6.e(r33);
        goto L101
    L89:
        if (this.N.n() == 0) goto L95;
        wn4 r34 = this.N;
        if (r31 != (-1)) goto L94;
        r32 = r34.k(r34.n() - 1);
        goto L96
    L94:
        r32 = r34.k(r31 - 1);
    L101:
        if (this.K == 2) goto L159;
    L140:
    L111:
        e = move-exception;
        l93.G("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.V, e);
        jg0 r35 = new jg0(J(this.W), gy3.r);
        if (r7 == null) goto L137;
        r7.obtainMessage(1, r35).sendToTarget();
    L138:
        L();
        rn4 r36 = this.L;
        r36.getClass();
        r36.a();
        this.L = null;
        this.K = 0;
        K();
        return;
    L137:
        r6.n(r35.a);
        r6.e(r35);
        goto L138
    L104:
        if (this.T == true) goto L161;
        vn4 r37 = this.M;     // Catch: SubtitleDecoderException -> L111
        if (r37 != null) goto L114;
        rn4 r38 = this.L;     // Catch: SubtitleDecoderException -> L111
        r38.getClass();     // Catch: SubtitleDecoderException -> L111
        r37 = (vn4) r38.e();     // Catch: SubtitleDecoderException -> L111
        if (r37 == null) goto L155;
        this.M = r37;     // Catch: SubtitleDecoderException -> L111
        goto L114
    L155:
        return;
    L114:
        if (this.K == 1) goto L115;
        gp3 r39 = r114;
        int r40 = z(r39, r37, 0);     // Catch: SubtitleDecoderException -> L111
        if (r40 != (-4)) goto L131;
        if (r37.d(r8) == false) goto L122;
        this.T = true;     // Catch: SubtitleDecoderException -> L111
        this.J = false;     // Catch: SubtitleDecoderException -> L111
    L127:
        if (this.J == true) goto L133;
        rn4 r41 = this.L;     // Catch: SubtitleDecoderException -> L111
        r41.getClass();     // Catch: SubtitleDecoderException -> L111
        r41.f(r37);     // Catch: SubtitleDecoderException -> L111
        this.M = null;     // Catch: SubtitleDecoderException -> L111
    L133:
        r114 = r39;
        r8 = 4;
        goto L140
    L122:
        tb1 r42 = (tb1) r39.p;     // Catch: SubtitleDecoderException -> L111
        if (r42 == null) goto L156;
        r37.x = r42.s;     // Catch: SubtitleDecoderException -> L111
        r37.u();     // Catch: SubtitleDecoderException -> L111
        this.J &= !r37.d(1);     // Catch: SubtitleDecoderException -> L111
        goto L127
    L156:
        return;
    L131:
        if (r40 != (-3)) goto L133;
        return;
    L115:
        r37.o = r8;     // Catch: SubtitleDecoderException -> L111
        rn4 r43 = this.L;     // Catch: SubtitleDecoderException -> L111
        r43.getClass();     // Catch: SubtitleDecoderException -> L111
        r43.f(r37);     // Catch: SubtitleDecoderException -> L111
        this.M = null;     // Catch: SubtitleDecoderException -> L111
        this.K = 2;     // Catch: SubtitleDecoderException -> L111
        return;
    L161:
        return;
    L159:
        return;
    L70:
        if (r113.d(4) == false) goto L79;
        if (r29 == true) goto L77;
        if (I() != Long.MAX_VALUE) goto L77;
        if (this.K != 2) goto L78;
        L();
        rn4 r115 = this.L;
        r115.getClass();
        r115.a();
        this.L = null;
        this.K = 0;
        K();
        goto L77
    L78:
        L();
        this.U = true;
        goto L77
    L79:
        r114 = r9;
        r30 = r29;
        if (r113.p > r20) goto L85;
        wn4 r44 = this.N;
        if (r44 == null) goto L84;
        r44.s();
    L84:
        this.P = r113.e(r20);
        this.N = r113;
        this.O = null;
        r30 = true;
        goto L85
    L66:
        r29 = false;
        goto L67
    }

    @Override // defpackage.kq
    public final int E(tb1 r4) {
        boolean r0 = Objects.equals(r4.n, "application/x-media3-cues");
        String r1 = r4.n;
        if (r0 == true) goto L20;
        om1 r3 = (om1) this.I;
        r3.getClass();
        if (((om0) r3.o).n(r4) == true) goto L20;
        if (Objects.equals(r1, "application/cea-608") == true) goto L20;
        if (Objects.equals(r1, "application/x-mp4-cea-608") == true) goto L20;
        if (Objects.equals(r1, "application/cea-708") == true) goto L20;
        if (lw2.k(r1) == false) goto L18;
        return kq.a(1, 0, 0, 0);
    L18:
        return kq.a(0, 0, 0, 0);
    L20:
        if (r4.O != 0) goto L22;
        int r5 = 4;
    L24:
        return kq.a(r5, 0, 0, 0);
    L22:
        r5 = 2;
        goto L24
    }

    public final void H() {
        if (Objects.equals(this.V.n, "application/cea-608") == false) goto L5;
    L10:
        boolean r0 = true;
    L11:
        String r2 = this.V.n;
        if (r0 == false) goto L14;
        return;
    L14:
        kf2.o(gh0.s("Legacy decoding is disabled, can't handle %s samples (expected %s).", new Object[]{r2, "application/x-media3-cues"}));
        return;
    L5:
        if (Objects.equals(this.V.n, "application/x-mp4-cea-608") == true) goto L10;
        if (Objects.equals(this.V.n, "application/cea-708") == true) goto L10;
        r0 = false;
        goto L11
    }

    public final long I() {
        if (this.P != (-1)) goto L5;
        return Long.MAX_VALUE;
    L5:
        this.N.getClass();
        if (this.P < this.N.n()) goto L9;
        return Long.MAX_VALUE;
    L9:
        return this.N.k(this.P);
    }

    public final long J(long r3) {
        if (r3 == (-9223372036854775807L)) goto L5;
        boolean r0 = true;
    L6:
        rr2.w(r0);
        return r3 - this.x;
    L5:
        r0 = false;
        goto L6
    }

    public final void K() {
        byte r0 = 1;
        this.J = true;
        tb1 r1 = this.V;
        r1.getClass();
        om0 r2 = (om0) ((om1) this.I).o;
        String r3 = r1.n;
        int r4 = r1.K;
        if (r3 == null) goto L23;
        switch(r3.hashCode()) {
            case 930165504: goto L15;
            case 1566015601: goto L12;
            case 1566016562: goto L8;
            default: goto L6;
        };
    L6:
        r0 = -1;
    L18:
        switch(r0) {
            case 0: goto L21;
            case 1: goto L21;
            case 2: goto L20;
            default: goto L23;
        };
    L20:
        rn4 r5 = new i00(r1.q, r4);
    L25:
        this.L = r5;
        r5.b(this.y);
        return;
    L21:
        r5 = new e00(r4, r3);
        goto L25
    L8:
        if (r3.equals("application/cea-708") == false) goto L29;
        r0 = 2;
        goto L18
    L29:
        r0 = -1;
        goto L18
    L12:
        if (r3.equals("application/cea-608") == true) goto L18;
        r0 = -1;
        goto L18
    L15:
        if (r3.equals("application/x-mp4-cea-608") == false) goto L31;
        r0 = 0;
        goto L18
    L31:
        r0 = -1;
    L23:
        if (r2.n(r1) == false) goto L27;
        zn4 r6 = r2.C(r1);
        r5 = new ho0(r6.getClass().getSimpleName().concat("Decoder"), r6);
        goto L25
    L27:
        kf2.n(xa3.g("Attempted to create decoder for unsupported MIME type: ", r3));
    }

    public final void L() {
        this.M = null;
        this.P = -1;
        wn4 r1 = this.N;
        if (r1 == null) goto L5;
        r1.s();
        this.N = null;
    L5:
        wn4 r2 = this.O;
        if (r2 == null) goto L9;
        r2.s();
        this.O = null;
        return;
    }

    @Override // defpackage.kq
    public final String h() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message r3) {
        if (r3.what != 1) goto L6;
        jg0 r4 = (jg0) r3.obj;
        gy3 r0 = r4.a;
        rs4 r2 = this.R;
        r2.n(r0);
        r2.e(r4);
        return true;
    L6:
        tb4.a();
        return false;
    }

    @Override // defpackage.kq
    public final boolean m() {
        return this.U;
    }

    @Override // defpackage.kq
    public final boolean o() {
        tb1 r0 = this.V;
        if (r0 != null) goto L6;
    L32:
        return true;
    L6:
        if (Objects.equals(r0.n, "application/x-media3-cues") == false) goto L13;
        kg0 r1 = this.H;
        r1.getClass();
        if (r1.a(this.W) != Long.MIN_VALUE) goto L32;
        q44 r6 = this.v;     // Catch: IOException -> L35
        r6.getClass();     // Catch: IOException -> L35
        r6.s();     // Catch: IOException -> L35
        return true;
    L39:
        return false;
    L13:
        if (this.U == false) goto L15;
        return false;
    L15:
        if (this.T == false) goto L32;
        wn4 r2 = this.N;
        long r3 = this.W;
        if (r2 != null) goto L19;
    L23:
        wn4 r4 = this.O;
        long r5 = this.W;
        if (r4 == null) goto L31;
        if (r4.n() <= 0) goto L31;
        if (r4.k(r4.n() - 1) > r5) goto L32;
    L31:
        if (this.M == null) goto L32;
        return false;
    L19:
        if (r2.n() <= 0) goto L23;
        if (r2.k(r2.n() - 1) <= r3) goto L23;
        goto L23
    }

    @Override // defpackage.kq
    public final void p() {
        this.V = null;
        this.X = -9223372036854775807L;
        gy3 r4 = gy3.r;
        jg0 r3 = new jg0(J(this.W), r4);
        Handler r5 = this.Q;
        if (r5 == null) goto L5;
        r5.obtainMessage(1, r3).sendToTarget();
    L6:
        this.W = -9223372036854775807L;
        if (this.L == null) goto L10;
        L();
        rn4 r1 = this.L;
        r1.getClass();
        r1.a();
        this.L = null;
        this.K = 0;
        return;
    L10:
        return;
    L5:
        gy3 r6 = r3.a;
        rs4 r7 = this.R;
        r7.n(r6);
        r7.e(r3);
        goto L6
    }

    @Override // defpackage.kq
    public final void r(long r1, boolean r3, boolean r4) {
        this.W = r1;
        kg0 r2 = this.H;
        if (r2 == null) goto L5;
        r2.clear();
    L5:
        gy3 r5 = gy3.r;
        jg0 r6 = new jg0(J(this.W), r5);
        Handler r7 = this.Q;
        if (r7 == null) goto L8;
        r7.obtainMessage(1, r6).sendToTarget();
    L9:
        this.T = false;
        this.U = false;
        this.X = -9223372036854775807L;
        tb1 r8 = this.V;
        if (r8 != null) goto L12;
        return;
    L12:
        if (Objects.equals(r8.n, "application/x-media3-cues") == false) goto L14;
        return;
    L14:
        if (this.K == 0) goto L17;
        L();
        rn4 r9 = this.L;
        r9.getClass();
        r9.a();
        this.L = null;
        this.K = 0;
        K();
        return;
    L17:
        L();
        rn4 r10 = this.L;
        r10.getClass();
        r10.flush();
        r10.b(this.y);
        return;
    L8:
        gy3 r11 = r6.a;
        rs4 r12 = this.R;
        r12.n(r11);
        r12.e(r6);
        goto L9
    }

    @Override // defpackage.kq
    public final void x(tb1[] r1, long r2, long r4, mt2 r6) {
        tb1 r3 = r1[0];
        this.V = r3;
        if (Objects.equals(r3.n, "application/x-media3-cues") == true) goto L11;
        H();
        if (this.L == null) goto L8;
        this.K = 1;
        return;
    L8:
        K();
        return;
    L11:
        if (this.V.L != 1) goto L13;
        kg0 r5 = new kv2();
    L14:
        this.H = r5;
        return;
    L13:
        r5 = new xv1(1);
        goto L14
    }
}
