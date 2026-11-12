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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts4(rs4 rs4Var, Looper looper) {
        Handler handler;
        super(3);
        om1 om1Var = sn4.l;
        this.R = rs4Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = f35.a;
            handler = new Handler(looper, this);
        }
        this.Q = handler;
        this.I = om1Var;
        this.F = new i80(19);
        this.G = new cj0(1, 0);
        this.S = new gp3(9, false);
        this.X = -9223372036854775807L;
        this.W = -9223372036854775807L;
    }

    @Override // defpackage.kq
    public final void A(long j, long j2) {
        boolean z;
        gp3 gp3Var;
        boolean z2;
        long jK;
        if (this.A) {
            long j3 = this.X;
            if (j3 != -9223372036854775807L && j >= j3) {
                L();
                this.U = true;
            }
        }
        if (this.U) {
            return;
        }
        tb1 tb1Var = this.V;
        tb1Var.getClass();
        boolean zEquals = Objects.equals(tb1Var.n, "application/x-media3-cues");
        rs4 rs4Var = this.R;
        Handler handler = this.Q;
        int i = 4;
        gp3 gp3Var2 = this.S;
        boolean zB = false;
        zB = false;
        zB = false;
        if (zEquals) {
            this.H.getClass();
            if (!this.T) {
                cj0 cj0Var = this.G;
                if (z(gp3Var2, cj0Var, 0) == -4) {
                    if (cj0Var.d(4)) {
                        this.T = true;
                    } else {
                        cj0Var.u();
                        ByteBuffer byteBuffer = cj0Var.r;
                        byteBuffer.getClass();
                        long j4 = cj0Var.t;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.F.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        uw1 uw1VarJ = yw1.j();
                        for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i2);
                            bundle2.getClass();
                            uw1VarJ.c(ig0.a(bundle2));
                        }
                        lg0 lg0Var = new lg0(j4, bundle.getLong("d"), uw1VarJ.f());
                        cj0Var.r();
                        zB = this.H.b(lg0Var, j);
                    }
                }
            }
            long jA = this.H.a(this.W);
            if (jA == Long.MIN_VALUE && this.T && !zB) {
                this.U = true;
            }
            if (jA != Long.MIN_VALUE && jA <= j) {
                zB = true;
            }
            if (zB) {
                yw1 yw1VarC = this.H.c(j);
                long jD = this.H.d(j);
                jg0 jg0Var = new jg0(J(jD), yw1VarC);
                if (handler != null) {
                    handler.obtainMessage(1, jg0Var).sendToTarget();
                } else {
                    rs4Var.n(jg0Var.a);
                    rs4Var.e(jg0Var);
                }
                this.H.e(jD);
            }
            this.W = j;
            return;
        }
        H();
        this.W = j;
        if (this.O == null) {
            rn4 rn4Var = this.L;
            rn4Var.getClass();
            rn4Var.c(j);
            try {
                rn4 rn4Var2 = this.L;
                rn4Var2.getClass();
                this.O = (wn4) rn4Var2.d();
            } catch (SubtitleDecoderException e) {
                l93.G("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.V, e);
                jg0 jg0Var2 = new jg0(J(this.W), gy3.r);
                if (handler != null) {
                    handler.obtainMessage(1, jg0Var2).sendToTarget();
                } else {
                    rs4Var.n(jg0Var2.a);
                    rs4Var.e(jg0Var2);
                }
                L();
                rn4 rn4Var3 = this.L;
                rn4Var3.getClass();
                rn4Var3.a();
                this.L = null;
                this.K = 0;
                K();
                return;
            }
        }
        if (this.u != 2) {
            return;
        }
        if (this.N != null) {
            long jI = I();
            z = false;
            while (jI <= j) {
                this.P++;
                jI = I();
                z = true;
            }
        } else {
            z = false;
        }
        wn4 wn4Var = this.O;
        if (wn4Var == null) {
            gp3Var = gp3Var2;
            z2 = z;
        } else if (wn4Var.d(4)) {
            if (!z && I() == Long.MAX_VALUE) {
                if (this.K == 2) {
                    L();
                    rn4 rn4Var4 = this.L;
                    rn4Var4.getClass();
                    rn4Var4.a();
                    this.L = null;
                    this.K = 0;
                    K();
                } else {
                    L();
                    this.U = true;
                }
            }
            gp3Var = gp3Var2;
            z2 = z;
        } else {
            gp3Var = gp3Var2;
            if (wn4Var.p <= j) {
                wn4 wn4Var2 = this.N;
                if (wn4Var2 != null) {
                    z2 = z;
                    wn4Var2.s();
                }
                z2 = z;
                this.P = wn4Var.e(j);
                this.N = wn4Var;
                this.O = null;
                z2 = true;
            }
        }
        if (z2) {
            this.N.getClass();
            int iE = this.N.e(j);
            if (iE == 0 || this.N.n() == 0) {
                jK = this.N.p;
            } else {
                wn4 wn4Var3 = this.N;
                jK = iE == -1 ? wn4Var3.k(wn4Var3.n() - 1) : wn4Var3.k(iE - 1);
            }
            jg0 jg0Var3 = new jg0(J(jK), this.N.m(j));
            if (handler != null) {
                handler.obtainMessage(1, jg0Var3).sendToTarget();
            } else {
                rs4Var.n(jg0Var3.a);
                rs4Var.e(jg0Var3);
            }
        }
        if (this.K == 2) {
            return;
        }
        while (!this.T) {
            try {
                vn4 vn4Var = this.M;
                if (vn4Var == null) {
                    rn4 rn4Var5 = this.L;
                    rn4Var5.getClass();
                    vn4Var = (vn4) rn4Var5.e();
                    if (vn4Var == null) {
                        return;
                    } else {
                        this.M = vn4Var;
                    }
                }
                if (this.K == 1) {
                    vn4Var.o = i;
                    rn4 rn4Var6 = this.L;
                    rn4Var6.getClass();
                    rn4Var6.f(vn4Var);
                    this.M = null;
                    this.K = 2;
                    return;
                }
                gp3 gp3Var3 = gp3Var;
                int iZ = z(gp3Var3, vn4Var, 0);
                if (iZ == -4) {
                    if (vn4Var.d(i)) {
                        this.T = true;
                        this.J = false;
                    } else {
                        tb1 tb1Var2 = (tb1) gp3Var3.p;
                        if (tb1Var2 == null) {
                            return;
                        }
                        vn4Var.x = tb1Var2.s;
                        vn4Var.u();
                        this.J &= !vn4Var.d(1);
                    }
                    if (!this.J) {
                        rn4 rn4Var7 = this.L;
                        rn4Var7.getClass();
                        rn4Var7.f(vn4Var);
                        this.M = null;
                    }
                } else if (iZ == -3) {
                    return;
                }
                gp3Var = gp3Var3;
                i = 4;
            } catch (SubtitleDecoderException e2) {
                l93.G("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.V, e2);
                jg0 jg0Var4 = new jg0(J(this.W), gy3.r);
                if (handler != null) {
                    handler.obtainMessage(1, jg0Var4).sendToTarget();
                } else {
                    rs4Var.n(jg0Var4.a);
                    rs4Var.e(jg0Var4);
                }
                L();
                rn4 rn4Var8 = this.L;
                rn4Var8.getClass();
                rn4Var8.a();
                this.L = null;
                this.K = 0;
                K();
                return;
            }
        }
    }

    @Override // defpackage.kq
    public final int E(tb1 tb1Var) {
        boolean zEquals = Objects.equals(tb1Var.n, "application/x-media3-cues");
        String str = tb1Var.n;
        if (!zEquals) {
            om1 om1Var = (om1) this.I;
            om1Var.getClass();
            if (!((om0) om1Var.o).n(tb1Var) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return lw2.k(str) ? kq.a(1, 0, 0, 0) : kq.a(0, 0, 0, 0);
            }
        }
        return kq.a(tb1Var.O == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void H() {
        boolean z = Objects.equals(this.V.n, "application/cea-608") || Objects.equals(this.V.n, "application/x-mp4-cea-608") || Objects.equals(this.V.n, "application/cea-708");
        String str = this.V.n;
        if (z) {
            return;
        }
        kf2.o(gh0.s("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
    }

    public final long I() {
        if (this.P == -1) {
            return Long.MAX_VALUE;
        }
        this.N.getClass();
        if (this.P >= this.N.n()) {
            return Long.MAX_VALUE;
        }
        return this.N.k(this.P);
    }

    public final long J(long j) {
        rr2.w(j != -9223372036854775807L);
        return j - this.x;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    public final void K() {
        rn4 ho0Var;
        byte b = 1;
        this.J = true;
        tb1 tb1Var = this.V;
        tb1Var.getClass();
        om0 om0Var = (om0) ((om1) this.I).o;
        String str = tb1Var.n;
        int i = tb1Var.K;
        if (str != null) {
            switch (str.hashCode()) {
                case 930165504:
                    b = !str.equals("application/x-mp4-cea-608") ? (byte) -1 : (byte) 0;
                    break;
                case 1566015601:
                    if (!str.equals("application/cea-608")) {
                        b = -1;
                    }
                    break;
                case 1566016562:
                    b = !str.equals("application/cea-708") ? (byte) -1 : (byte) 2;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                    ho0Var = new e00(i, str);
                    break;
                case 2:
                    ho0Var = new i00(tb1Var.q, i);
                    break;
                default:
                    if (om0Var.n(tb1Var)) {
                        kf2.n(xa3.g("Attempted to create decoder for unsupported MIME type: ", str));
                        return;
                    } else {
                        zn4 zn4VarC = om0Var.C(tb1Var);
                        ho0Var = new ho0(zn4VarC.getClass().getSimpleName().concat("Decoder"), zn4VarC);
                    }
                    break;
            }
        } else if (om0Var.n(tb1Var)) {
            kf2.n(xa3.g("Attempted to create decoder for unsupported MIME type: ", str));
            return;
        } else {
            zn4 zn4VarC2 = om0Var.C(tb1Var);
            ho0Var = new ho0(zn4VarC2.getClass().getSimpleName().concat("Decoder"), zn4VarC2);
        }
        this.L = ho0Var;
        ho0Var.b(this.y);
    }

    public final void L() {
        this.M = null;
        this.P = -1;
        wn4 wn4Var = this.N;
        if (wn4Var != null) {
            wn4Var.s();
            this.N = null;
        }
        wn4 wn4Var2 = this.O;
        if (wn4Var2 != null) {
            wn4Var2.s();
            this.O = null;
        }
    }

    @Override // defpackage.kq
    public final String h() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            tb4.a();
            return false;
        }
        jg0 jg0Var = (jg0) message.obj;
        gy3 gy3Var = jg0Var.a;
        rs4 rs4Var = this.R;
        rs4Var.n(gy3Var);
        rs4Var.e(jg0Var);
        return true;
    }

    @Override // defpackage.kq
    public final boolean m() {
        return this.U;
    }

    @Override // defpackage.kq
    public final boolean o() {
        tb1 tb1Var = this.V;
        if (tb1Var != null) {
            if (Objects.equals(tb1Var.n, "application/x-media3-cues")) {
                kg0 kg0Var = this.H;
                kg0Var.getClass();
                if (kg0Var.a(this.W) == Long.MIN_VALUE) {
                    try {
                        q44 q44Var = this.v;
                        q44Var.getClass();
                        q44Var.s();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (this.U) {
                    return false;
                }
                if (this.T) {
                    wn4 wn4Var = this.N;
                    long j = this.W;
                    if (wn4Var == null || wn4Var.n() <= 0 || wn4Var.k(wn4Var.n() - 1) <= j) {
                        wn4 wn4Var2 = this.O;
                        long j2 = this.W;
                        if ((wn4Var2 == null || wn4Var2.n() <= 0 || wn4Var2.k(wn4Var2.n() - 1) <= j2) && this.M != null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // defpackage.kq
    public final void p() {
        this.V = null;
        this.X = -9223372036854775807L;
        jg0 jg0Var = new jg0(J(this.W), gy3.r);
        Handler handler = this.Q;
        if (handler != null) {
            handler.obtainMessage(1, jg0Var).sendToTarget();
        } else {
            gy3 gy3Var = jg0Var.a;
            rs4 rs4Var = this.R;
            rs4Var.n(gy3Var);
            rs4Var.e(jg0Var);
        }
        this.W = -9223372036854775807L;
        if (this.L != null) {
            L();
            rn4 rn4Var = this.L;
            rn4Var.getClass();
            rn4Var.a();
            this.L = null;
            this.K = 0;
        }
    }

    @Override // defpackage.kq
    public final void r(long j, boolean z, boolean z2) {
        this.W = j;
        kg0 kg0Var = this.H;
        if (kg0Var != null) {
            kg0Var.clear();
        }
        jg0 jg0Var = new jg0(J(this.W), gy3.r);
        Handler handler = this.Q;
        if (handler != null) {
            handler.obtainMessage(1, jg0Var).sendToTarget();
        } else {
            gy3 gy3Var = jg0Var.a;
            rs4 rs4Var = this.R;
            rs4Var.n(gy3Var);
            rs4Var.e(jg0Var);
        }
        this.T = false;
        this.U = false;
        this.X = -9223372036854775807L;
        tb1 tb1Var = this.V;
        if (tb1Var == null || Objects.equals(tb1Var.n, "application/x-media3-cues")) {
            return;
        }
        if (this.K == 0) {
            L();
            rn4 rn4Var = this.L;
            rn4Var.getClass();
            rn4Var.flush();
            rn4Var.b(this.y);
            return;
        }
        L();
        rn4 rn4Var2 = this.L;
        rn4Var2.getClass();
        rn4Var2.a();
        this.L = null;
        this.K = 0;
        K();
    }

    @Override // defpackage.kq
    public final void x(tb1[] tb1VarArr, long j, long j2, mt2 mt2Var) {
        tb1 tb1Var = tb1VarArr[0];
        this.V = tb1Var;
        if (Objects.equals(tb1Var.n, "application/x-media3-cues")) {
            this.H = this.V.L == 1 ? new kv2() : new xv1(1);
            return;
        }
        H();
        if (this.L != null) {
            this.K = 1;
        } else {
            K();
        }
    }
}
