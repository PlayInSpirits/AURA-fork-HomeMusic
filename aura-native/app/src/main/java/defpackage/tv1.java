package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import app.homemusic.R;
import java.io.File;
import java.security.MessageDigest;
import java.util.NoSuchElementException;
import java.util.UUID;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class tv1 implements f04, ep3, q51, xj2, qk2, kg1, m51, ex4, e63, za3, bh3, gh3 {
    public tv1() {
        super();
    }

    public static tv1 n;

    public static ge3 A(File file) {
        String str = ge3.o;
        String file2 = file.toString();
        file2.getClass();
        return z(file2);
    }

    public static boolean B(d64 d64Var) {
        int i = d64Var.b;
        return i == 6 || i == 7;
    }

    public static boolean C(d64 d64Var) {
        return d64Var.b == 1;
    }

    public static double D(ol1 ol1Var, d64 d64Var) {
        h85 a = h85.a(d64Var.c ? 30.0d : 80.0d);
        sy a2 = sy.a(ol1Var.d);
        double d = a2.c;
        double d2 = a2.b;
        double sqrt = (d2 == 0.0d || d == 0.0d) ? 0.0d : d2 / Math.sqrt(d / 100.0d);
        double d3 = a.f;
        double d4 = a.h;
        double pow = Math.pow(sqrt / Math.pow(1.64d - Math.pow(0.29d, d3), 0.73d), 1.1111111111111112d);
        double radians = Math.toRadians(a2.a);
        double cos = (Math.cos(2.0d + radians) + 3.8d) * 0.25d;
        double pow2 = Math.pow(d / 100.0d, 1.4492753623188408d / a.j) * a.a;
        double d5 = cos * 3846.153846153846d * 1.0d * a.c;
        double d6 = pow2 / a.b;
        double sin = Math.sin(radians);
        double cos2 = Math.cos(radians);
        double d7 = (((0.305d + d6) * 23.0d) * pow) / (((108.0d * pow) * sin) + (((11.0d * pow) * cos2) + (d5 * 23.0d)));
        double d8 = cos2 * d7;
        double d9 = d7 * sin;
        double d10 = d6 * 460.0d;
        double d11 = ((288.0d * d9) + ((451.0d * d8) + d10)) / 1403.0d;
        double d12 = ((d10 - (891.0d * d8)) - (261.0d * d9)) / 1403.0d;
        double d13 = ((d10 - (d8 * 220.0d)) - (d9 * 6300.0d)) / 1403.0d;
        double max = Math.max(0.0d, (Math.abs(d11) * 27.13d) / (400.0d - Math.abs(d11)));
        double signum = Math.signum(d11);
        double d14 = 100.0d / d4;
        double pow3 = Math.pow(max, 2.380952380952381d) * signum * d14;
        double pow4 = Math.pow(Math.max(0.0d, (Math.abs(d12) * 27.13d) / (400.0d - Math.abs(d12))), 2.380952380952381d) * Math.signum(d12) * d14;
        double pow5 = Math.pow(Math.max(0.0d, (Math.abs(d13) * 27.13d) / (400.0d - Math.abs(d13))), 2.380952380952381d) * Math.signum(d13) * d14;
        double[] dArr = a.g;
        double d15 = pow3 / dArr[0];
        double d16 = pow4 / dArr[1];
        double d17 = pow5 / dArr[2];
        double[][] dArr2 = sy.e;
        double[] dArr3 = dArr2[0];
        double d18 = (dArr3[2] * d17) + (dArr3[1] * d16) + (dArr3[0] * d15);
        double[] dArr4 = dArr2[1];
        double d19 = (dArr4[2] * d17) + (dArr4[1] * d16) + (dArr4[0] * d15);
        double[] dArr5 = dArr2[2];
        double[] dArr6 = {d18, d19, (d17 * dArr5[2]) + (d16 * dArr5[1]) + (d15 * dArr5[0])};
        sy b = sy.b(dArr6[0], dArr6[1], dArr6[2], h85.k);
        ol1 a3 = ol1.a(b.a, b.b, (h12.B(dArr6[1] / 100.0d) * 116.0d) - 16.0d);
        if (Math.round(ol1Var.c) >= 60 || Math.round(a3.c) <= 49) {
            double d20 = a3.c;
            if (Math.round(d20) >= 60 || Math.round(d20) <= 49) {
                return d20;
            }
            return 49.0d;
        }
        double d21 = ol1Var.c;
        if (Math.round(d21) >= 60 || Math.round(d21) <= 49) {
            return d21;
        }
        return 49.0d;
    }

    public static a23 v(Context context, r23 r23Var, Bundle bundle, r92 r92Var, j23 j23Var) {
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        r23Var.getClass();
        r92Var.getClass();
        return new a23(context, r23Var, bundle, r92Var, j23Var, uuid, null);
    }

    public static ge3 z(String str) {
        str.getClass();
        yw ywVar = f.a;
        tv tvVar = new tv();
        tvVar.d0(str);
        return f.d(tvVar, false);
    }

    public gy0 E() {
        return gy0.c(new zh2(17), new zh2(18), new bi2(this, 26), null);
    }

    public gy0 F() {
        return gy0.c(new zh2(9), new zh2(10), new bi2(this, 26), null);
    }

    public gy0 G() {
        return gy0.c(new ai2(19), new ai2(20), new bi2(this, 26), null);
    }

    @Override // defpackage.e63
    public boolean a(cx2 cx2Var) {
        return false;
    }

    @Override // defpackage.gh3
    public Typeface b(gb1 gb1Var, int i) {
        Typeface create;
        if (i == 0 && h12.c(gb1Var, gb1.p)) {
            return Typeface.DEFAULT;
        }
        if (i == 0 && h12.c(gb1Var, gb1.q)) {
            return Typeface.DEFAULT_BOLD;
        }
        create = Typeface.create(Typeface.DEFAULT, gb1Var.n, i == 1);
        return create;
    }

    @Override // defpackage.e63
    public int d() {
        return 8;
    }

    @Override // defpackage.e63
    public boolean f(cx2 cx2Var) {
        return wr1.I(hw.a(j51.O(cx2Var), false));
    }

    @Override // defpackage.q51
    public Object g() {
        return new de2();
    }

    @Override // defpackage.kg1
    public void h(Object obj) {
        ab4 ab4Var = (ab4) obj;
        if (ab4Var.a != 0) {
            Log.e("MediaManager", "insertPlayNext: play-next fixup rejected with code " + ab4Var.a);
        }
    }

    @Override // defpackage.e63
    public void i(c72 c72Var, long j, fm1 fm1Var, int i, boolean z) {
        w12 w12Var = c72Var.Q;
        f63 f63Var = (f63) w12Var.e;
        k52 k52Var = f63.h0;
        ((f63) w12Var.e).G0(f63.m0, f63Var.x0(j), fm1Var, 1, z);
    }

    @Override // defpackage.xj2
    public long j() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.e63
    public boolean k(fm1 fm1Var, c72 c72Var) {
        return false;
    }

    @Override // defpackage.e63
    public boolean m(c72 c72Var) {
        e94 v = c72Var.v();
        boolean z = false;
        if (v != null && v.q) {
            z = true;
        }
        return !z;
    }

    @Override // defpackage.xj2
    public long n() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.xj2
    public boolean next() {
        return false;
    }

    @Override // defpackage.kg1
    public void o(Throwable th) {
        Log.e("MediaManager", "insertPlayNext: play-next fixup command failed", th);
    }

    public float q(float f, float f2) {
        return 1.0f;
    }

    @Override // defpackage.ep3
    public CharSequence r(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        return TextUtils.isEmpty(listPreference.F()) ? listPreference.n.getString(R.string.not_set) : listPreference.F();
    }

    @Override // defpackage.ex4
    public cx4 s(int i) {
        return z53.n;
    }

    @Override // defpackage.m51
    public wv4 t(int i, int i2) {
        return new tq0();
    }

    public gy0 x() {
        return gy0.c(new bi2(22), new bi2(23), new bi2(this, 26), null);
    }

    @Override // defpackage.m51
    public void p() {
    }

    @Override // defpackage.m51
    public void w(m84 m84Var) {
    }

    @Override // defpackage.za3
    public void e(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
