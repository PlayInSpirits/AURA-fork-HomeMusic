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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class tv1 implements f04, ep3, q51, xj2, qk2, kg1, m51, ex4, e63, za3, bh3, gh3 {
    public static tv1 n;

    public static ge3 A(File r1) {
        String r0 = ge3.o;
        String r2 = r1.toString();
        r2.getClass();
        return z(r2);
    }

    public static boolean B(d64 r1) {
        int r2 = r1.b;
        if (r2 != 6) goto L5;
        return true;
    L5:
        if (r2 == 7) goto L11;
        return false;
    L11:
        return true;
    }

    public static boolean C(d64 r1) {
        if (r1.b != 1) goto L5;
        return true;
    L5:
        return false;
    }

    public static double D(ol1 r25, d64 r26) {
        if (r26.c == false) goto L5;
        double r1 = 30.0d;
    L6:
        h85 r2 = h85.a(r1);
        sy r3 = sy.a(r25.d);
        double r4 = r3.c;
        double r5 = r3.b;
        if (r5 != 0.0d) goto L9;
    L12:
        double r6 = 0.0d;
    L13:
        double r12 = r2.f;
        double r14 = r2.h;
        double r7 = Math.pow(r6 / Math.pow(1.64d - Math.pow(0.29d, r12), 0.73d), 1.1111111111111112d);
        double r9 = Math.toRadians(r3.a);
        double r11 = (Math.cos(2.0d + r9) + 3.8d) * 0.25d;
        double r8 = Math.pow(r4 / 100.0d, 1.4492753623188408d / r2.j) * r2.a;
        double r13 = ((r11 * 3846.153846153846d) * 1.0d) * r2.c;
        double r10 = r8 / r2.b;
        double r15 = Math.sin(r9);
        double r16 = Math.cos(r9);
        double r17 = (((0.305d + r10) * 23.0d) * r7) / (((108.0d * r7) * r15) + (((11.0d * r7) * r16) + (r13 * 23.0d)));
        double r18 = r16 * r17;
        double r19 = r17 * r15;
        double r20 = r10 * 460.0d;
        double r110 = ((288.0d * r19) + ((451.0d * r18) + r20)) / 1403.0d;
        double r111 = ((r20 - (891.0d * r18)) - (261.0d * r19)) / 1403.0d;
        double r21 = ((r20 - (r18 * 220.0d)) - (r19 * 6300.0d)) / 1403.0d;
        double r22 = Math.max(0.0d, (Math.abs(r110) * 27.13d) / (400.0d - Math.abs(r110)));
        double r23 = Math.signum(r110);
        double r112 = 100.0d / r14;
        double r24 = Math.pow(r22, 2.380952380952381d) * (r23 * r112);
        double r27 = Math.pow(Math.max(0.0d, (Math.abs(r111) * 27.13d) / (400.0d - Math.abs(r111))), 2.380952380952381d) * (Math.signum(r111) * r112);
        double r28 = Math.pow(Math.max(0.0d, (Math.abs(r21) * 27.13d) / (400.0d - Math.abs(r21))), 2.380952380952381d) * (Math.signum(r21) * r112);
        double[] r29 = r2.g;
        double r30 = r24 / r29[0];
        double r31 = r27 / r29[1];
        double r32 = r28 / r29[2];
        double[][] r33 = sy.e;
        double[] r113 = r33[0];
        double r114 = (r113[2] * r32) + ((r113[1] * r31) + (r113[0] * r30));
        double[] r115 = r33[1];
        double r116 = (r115[2] * r32) + ((r115[1] * r31) + (r115[0] * r30));
        double[] r34 = r33[2];
        double[] r35 = {r114, r116, (r32 * r34[2]) + ((r31 * r34[1]) + (r30 * r34[0]))};
        sy r36 = sy.b(r35[0], r35[1], r35[2], h85.k);
        ol1 r37 = ol1.a(r36.a, r36.b, (h12.B(r35[1] / 100.0d) * 116.0d) - 16.0d);
        if (Math.round(r25.c) < 60) goto L16;
    L25:
        double r0 = r37.c;
        if (Math.round(r0) < 60) goto L28;
    L31:
        return r0;
    L28:
        if (Math.round(r0) <= 49) goto L31;
        return 49.0d;
    L16:
        if (Math.round(r37.c) <= 49) goto L25;
        double r38 = r25.c;
        if (Math.round(r38) < 60) goto L21;
    L24:
        return r38;
    L21:
        if (Math.round(r38) <= 49) goto L24;
        return 49.0d;
    L9:
        if (r4 == 0.0d) goto L12;
        r6 = r5 / Math.sqrt(r4 / 100.0d);
        goto L13
    L5:
        r1 = 80.0d;
        goto L6
    }

    public static a23 v(Context r9, r23 r10, Bundle r11, r92 r12, j23 r13) {
        String r7 = UUID.randomUUID().toString();
        r7.getClass();
        r10.getClass();
        r12.getClass();
        return new a23(r9, r10, r11, r12, r13, r7, null);
    }

    public static ge3 z(String r1) {
        r1.getClass();
        yw r0 = f.a;
        tv r2 = new tv();
        r2.d0(r1);
        return f.d(r2, false);
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
    public boolean a(cx2 r1) {
        return false;
    }

    @Override // defpackage.gh3
    public Typeface b(gb1 r2, int r3) {
        if (r3 == 0) goto L4;
    L7:
        if (r3 == 0) goto L9;
    L12:
        Typeface r1 = Typeface.DEFAULT;
        int r4 = r2.n;
        boolean r0 = true;
        if (r3 == 1) goto L17;
        r0 = false;
    L17:
        return sr0.g(r1, r4, r0);
    L9:
        if (h12.c(r2, gb1.q) == false) goto L12;
        return Typeface.DEFAULT_BOLD;
    L4:
        if (h12.c(r2, gb1.p) == false) goto L7;
        return Typeface.DEFAULT;
    }

    @Override // defpackage.e63
    public int d() {
        return 8;
    }

    @Override // defpackage.za3
    public void e(byte[] r1, Object r2, MessageDigest r3) {
    }

    @Override // defpackage.e63
    public boolean f(cx2 r1) {
        return wr1.I(hw.a(j51.O(r1), false));
    }

    @Override // defpackage.q51
    public Object g() {
        return new de2();
    }

    @Override // defpackage.kg1
    public void h(Object r2) {
        ab4 r3 = (ab4) r2;
        if (r3.a == 0) goto L6;
        Log.e("MediaManager", "insertPlayNext: play-next fixup rejected with code " + r3.a);
        return;
    }

    @Override // defpackage.e63
    public void i(c72 r8, long r9, fm1 r11, int r12, boolean r13) {
        w12 r7 = r8.Q;
        f63 r10 = (f63) r7.e;
        k52 r14 = f63.h0;
        long r2 = r10.x0(r9);
        ((f63) r7.e).G0(f63.m0, r2, r11, 1, r13);
    }

    @Override // defpackage.xj2
    public long j() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.e63
    public boolean k(fm1 r1, c72 r2) {
        return false;
    }

    @Override // defpackage.e63
    public boolean m(c72 r2) {
        e94 r1 = r2.v();
        boolean r3 = false;
        if (r1 == null) goto L8;
        if (r1.q != true) goto L8;
        r3 = true;
    L8:
        return !r3;
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
    public void o(Throwable r2) {
        Log.e("MediaManager", "insertPlayNext: play-next fixup command failed", r2);
    }

    @Override // defpackage.m51
    public void p() {
    }

    public float q(float r1, float r2) {
        return 1.0f;
    }

    @Override // defpackage.ep3
    public CharSequence r(Preference r1) {
        ListPreference r2 = (ListPreference) r1;
        if (TextUtils.isEmpty(r2.F()) == false) goto L7;
        return r2.n.getString(R.string.not_set);
    L7:
        return r2.F();
    }

    @Override // defpackage.ex4
    public cx4 s(int r1) {
        return z53.n;
    }

    @Override // defpackage.m51
    public wv4 t(int r1, int r2) {
        return new tq0();
    }

    @Override // defpackage.m51
    public void w(m84 r1) {
    }

    public gy0 x() {
        return gy0.c(new bi2(22), new bi2(23), new bi2(this, 26), null);
    }
}
