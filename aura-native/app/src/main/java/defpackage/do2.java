package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.eddyizm.tempus.homemusic.WaveRetry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class do2 {
    public static final do2 K = new do2(new co2());
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public static final String o0;
    public static final String p0;
    public static final String q0;
    public static final String r0;
    public static final String s0;
    public static final String t0;
    public final CharSequence A;
    public final CharSequence B;
    public final Integer C;
    public final Integer D;
    public final CharSequence E;
    public final CharSequence F;
    public final CharSequence G;
    public final Integer H;
    public final Bundle I;
    public final yw1 J;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final Long h;
    public final lu3 i;
    public final lu3 j;
    public final byte[] k;
    public final Integer l;
    public final Uri m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Boolean q;
    public final Boolean r;
    public final Integer s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final Integer x;
    public final Integer y;
    public final CharSequence z;

    static {
        String str = f35.a;
        L = Integer.toString(0, 36);
        M = Integer.toString(1, 36);
        N = Integer.toString(2, 36);
        O = Integer.toString(3, 36);
        P = Integer.toString(4, 36);
        Q = Integer.toString(5, 36);
        R = Integer.toString(6, 36);
        S = Integer.toString(8, 36);
        T = Integer.toString(9, 36);
        U = Integer.toString(10, 36);
        V = Integer.toString(11, 36);
        W = Integer.toString(12, 36);
        X = Integer.toString(13, 36);
        Y = Integer.toString(14, 36);
        Z = Integer.toString(15, 36);
        a0 = Integer.toString(16, 36);
        b0 = Integer.toString(17, 36);
        c0 = Integer.toString(18, 36);
        d0 = Integer.toString(19, 36);
        e0 = Integer.toString(20, 36);
        f0 = Integer.toString(21, 36);
        g0 = Integer.toString(22, 36);
        h0 = Integer.toString(23, 36);
        i0 = Integer.toString(24, 36);
        j0 = Integer.toString(25, 36);
        k0 = Integer.toString(26, 36);
        l0 = Integer.toString(27, 36);
        m0 = Integer.toString(28, 36);
        n0 = Integer.toString(29, 36);
        o0 = Integer.toString(30, 36);
        p0 = Integer.toString(31, 36);
        q0 = Integer.toString(32, 36);
        r0 = Integer.toString(33, 36);
        s0 = Integer.toString(34, 36);
        t0 = Integer.toString(1000, 36);
    }

    public do2(co2 co2Var) {
        Boolean bool = co2Var.q;
        Integer num = co2Var.p;
        Integer num2 = co2Var.G;
        int i = 1;
        int i2 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 1:
                        case 2:
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case WaveRetry.MAX_FAILURES /* 16 */:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i2 = i;
                }
                num = Integer.valueOf(i2);
            }
        } else if (num != null) {
            boolean z = num.intValue() != -1;
            bool = Boolean.valueOf(z);
            if (z && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                num2 = Integer.valueOf(i2);
            }
        }
        this.a = co2Var.a;
        this.b = co2Var.b;
        this.c = co2Var.c;
        this.d = co2Var.d;
        this.e = co2Var.e;
        this.f = co2Var.f;
        this.g = co2Var.g;
        this.h = co2Var.h;
        this.i = co2Var.i;
        this.j = co2Var.j;
        this.k = co2Var.k;
        this.l = co2Var.l;
        this.m = co2Var.m;
        this.n = co2Var.n;
        this.o = co2Var.o;
        this.p = num;
        this.q = bool;
        this.r = co2Var.r;
        Integer num3 = co2Var.s;
        this.s = num3;
        this.t = num3;
        this.u = co2Var.t;
        this.v = co2Var.u;
        this.w = co2Var.v;
        this.x = co2Var.w;
        this.y = co2Var.x;
        this.z = co2Var.y;
        this.A = co2Var.z;
        this.B = co2Var.A;
        this.C = co2Var.B;
        this.D = co2Var.C;
        this.E = co2Var.D;
        this.F = co2Var.E;
        this.G = co2Var.F;
        this.H = num2;
        this.J = co2Var.I;
        this.I = co2Var.H;
    }

    public static do2 b(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        co2 co2Var = new co2();
        co2Var.a = bundle.getCharSequence(L);
        co2Var.b = bundle.getCharSequence(M);
        co2Var.c = bundle.getCharSequence(N);
        co2Var.d = bundle.getCharSequence(O);
        co2Var.e = bundle.getCharSequence(P);
        co2Var.f = bundle.getCharSequence(Q);
        co2Var.g = bundle.getCharSequence(R);
        byte[] byteArray = bundle.getByteArray(U);
        String str = n0;
        co2Var.c(byteArray, bundle.containsKey(str) ? Integer.valueOf(bundle.getInt(str)) : null);
        co2Var.m = (Uri) bundle.getParcelable(V);
        co2Var.y = bundle.getCharSequence(g0);
        co2Var.z = bundle.getCharSequence(h0);
        co2Var.A = bundle.getCharSequence(i0);
        co2Var.D = bundle.getCharSequence(l0);
        co2Var.E = bundle.getCharSequence(m0);
        co2Var.F = bundle.getCharSequence(o0);
        co2Var.H = f35.n(bundle.getBundle(t0));
        String str2 = S;
        if (bundle.containsKey(str2) && (bundle3 = bundle.getBundle(str2)) != null) {
            co2Var.i = lu3.a(bundle3);
        }
        String str3 = T;
        if (bundle.containsKey(str3) && (bundle2 = bundle.getBundle(str3)) != null) {
            co2Var.j = lu3.a(bundle2);
        }
        String str4 = r0;
        if (bundle.containsKey(str4)) {
            co2Var.d(Long.valueOf(bundle.getLong(str4)));
        }
        String str5 = W;
        if (bundle.containsKey(str5)) {
            co2Var.n = Integer.valueOf(bundle.getInt(str5));
        }
        String str6 = X;
        if (bundle.containsKey(str6)) {
            co2Var.o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            co2Var.p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = q0;
        if (bundle.containsKey(str8)) {
            co2Var.q = Boolean.valueOf(bundle.getBoolean(str8));
        }
        String str9 = Z;
        if (bundle.containsKey(str9)) {
            co2Var.r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = a0;
        if (bundle.containsKey(str10)) {
            co2Var.s = Integer.valueOf(bundle.getInt(str10));
        }
        String str11 = b0;
        if (bundle.containsKey(str11)) {
            co2Var.t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = c0;
        if (bundle.containsKey(str12)) {
            co2Var.u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = d0;
        if (bundle.containsKey(str13)) {
            co2Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = e0;
        if (bundle.containsKey(str14)) {
            co2Var.w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f0;
        if (bundle.containsKey(str15)) {
            co2Var.x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = j0;
        if (bundle.containsKey(str16)) {
            co2Var.B = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = k0;
        if (bundle.containsKey(str17)) {
            co2Var.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = p0;
        if (bundle.containsKey(str18)) {
            co2Var.G = Integer.valueOf(bundle.getInt(str18));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(s0);
        if (stringArrayList != null) {
            co2Var.I = yw1.k(stringArrayList);
        }
        return new do2(co2Var);
    }

    public final co2 a() {
        co2 co2Var = new co2();
        co2Var.a = this.a;
        co2Var.b = this.b;
        co2Var.c = this.c;
        co2Var.d = this.d;
        co2Var.e = this.e;
        co2Var.f = this.f;
        co2Var.g = this.g;
        co2Var.h = this.h;
        co2Var.i = this.i;
        co2Var.j = this.j;
        co2Var.k = this.k;
        co2Var.l = this.l;
        co2Var.m = this.m;
        co2Var.n = this.n;
        co2Var.o = this.o;
        co2Var.p = this.p;
        co2Var.q = this.q;
        co2Var.r = this.r;
        co2Var.s = this.t;
        co2Var.t = this.u;
        co2Var.u = this.v;
        co2Var.v = this.w;
        co2Var.w = this.x;
        co2Var.x = this.y;
        co2Var.y = this.z;
        co2Var.z = this.A;
        co2Var.A = this.B;
        co2Var.B = this.C;
        co2Var.C = this.D;
        co2Var.D = this.E;
        co2Var.E = this.F;
        co2Var.F = this.G;
        co2Var.G = this.H;
        co2Var.I = this.J;
        co2Var.H = this.I;
        return co2Var;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(L, charSequence);
        }
        CharSequence charSequence2 = this.b;
        if (charSequence2 != null) {
            bundle.putCharSequence(M, charSequence2);
        }
        CharSequence charSequence3 = this.c;
        if (charSequence3 != null) {
            bundle.putCharSequence(N, charSequence3);
        }
        CharSequence charSequence4 = this.d;
        if (charSequence4 != null) {
            bundle.putCharSequence(O, charSequence4);
        }
        CharSequence charSequence5 = this.e;
        if (charSequence5 != null) {
            bundle.putCharSequence(P, charSequence5);
        }
        CharSequence charSequence6 = this.f;
        if (charSequence6 != null) {
            bundle.putCharSequence(Q, charSequence6);
        }
        CharSequence charSequence7 = this.g;
        if (charSequence7 != null) {
            bundle.putCharSequence(R, charSequence7);
        }
        Long l = this.h;
        if (l != null) {
            bundle.putLong(r0, l.longValue());
        }
        byte[] bArr = this.k;
        if (bArr != null) {
            bundle.putByteArray(U, bArr);
        }
        Uri uri = this.m;
        if (uri != null) {
            bundle.putParcelable(V, uri);
        }
        CharSequence charSequence8 = this.z;
        if (charSequence8 != null) {
            bundle.putCharSequence(g0, charSequence8);
        }
        CharSequence charSequence9 = this.A;
        if (charSequence9 != null) {
            bundle.putCharSequence(h0, charSequence9);
        }
        CharSequence charSequence10 = this.B;
        if (charSequence10 != null) {
            bundle.putCharSequence(i0, charSequence10);
        }
        CharSequence charSequence11 = this.E;
        if (charSequence11 != null) {
            bundle.putCharSequence(l0, charSequence11);
        }
        CharSequence charSequence12 = this.F;
        if (charSequence12 != null) {
            bundle.putCharSequence(m0, charSequence12);
        }
        CharSequence charSequence13 = this.G;
        if (charSequence13 != null) {
            bundle.putCharSequence(o0, charSequence13);
        }
        lu3 lu3Var = this.i;
        if (lu3Var != null) {
            bundle.putBundle(S, lu3Var.c());
        }
        lu3 lu3Var2 = this.j;
        if (lu3Var2 != null) {
            bundle.putBundle(T, lu3Var2.c());
        }
        Integer num = this.n;
        if (num != null) {
            bundle.putInt(W, num.intValue());
        }
        Integer num2 = this.o;
        if (num2 != null) {
            bundle.putInt(X, num2.intValue());
        }
        Integer num3 = this.p;
        if (num3 != null) {
            bundle.putInt(Y, num3.intValue());
        }
        Boolean bool = this.q;
        if (bool != null) {
            bundle.putBoolean(q0, bool.booleanValue());
        }
        Boolean bool2 = this.r;
        if (bool2 != null) {
            bundle.putBoolean(Z, bool2.booleanValue());
        }
        Integer num4 = this.t;
        if (num4 != null) {
            bundle.putInt(a0, num4.intValue());
        }
        Integer num5 = this.u;
        if (num5 != null) {
            bundle.putInt(b0, num5.intValue());
        }
        Integer num6 = this.v;
        if (num6 != null) {
            bundle.putInt(c0, num6.intValue());
        }
        Integer num7 = this.w;
        if (num7 != null) {
            bundle.putInt(d0, num7.intValue());
        }
        Integer num8 = this.x;
        if (num8 != null) {
            bundle.putInt(e0, num8.intValue());
        }
        Integer num9 = this.y;
        if (num9 != null) {
            bundle.putInt(f0, num9.intValue());
        }
        Integer num10 = this.C;
        if (num10 != null) {
            bundle.putInt(j0, num10.intValue());
        }
        Integer num11 = this.D;
        if (num11 != null) {
            bundle.putInt(k0, num11.intValue());
        }
        Integer num12 = this.l;
        if (num12 != null) {
            bundle.putInt(n0, num12.intValue());
        }
        Integer num13 = this.H;
        if (num13 != null) {
            bundle.putInt(p0, num13.intValue());
        }
        yw1 yw1Var = this.J;
        if (!yw1Var.isEmpty()) {
            bundle.putStringArrayList(s0, new ArrayList<>(yw1Var));
        }
        Bundle bundle2 = this.I;
        if (bundle2 != null) {
            bundle.putBundle(t0, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && do2.class == obj.getClass()) {
            do2 do2Var = (do2) obj;
            if (TextUtils.equals(this.a, do2Var.a) && TextUtils.equals(this.b, do2Var.b) && TextUtils.equals(this.c, do2Var.c) && TextUtils.equals(this.d, do2Var.d) && TextUtils.equals(this.e, do2Var.e) && TextUtils.equals(this.f, do2Var.f) && TextUtils.equals(this.g, do2Var.g) && Objects.equals(this.h, do2Var.h) && Objects.equals(this.i, do2Var.i) && Objects.equals(this.j, do2Var.j) && Arrays.equals(this.k, do2Var.k) && Objects.equals(this.l, do2Var.l) && Objects.equals(this.m, do2Var.m) && Objects.equals(this.n, do2Var.n) && Objects.equals(this.o, do2Var.o) && Objects.equals(this.p, do2Var.p) && Objects.equals(this.q, do2Var.q) && Objects.equals(this.r, do2Var.r) && Objects.equals(this.t, do2Var.t) && Objects.equals(this.u, do2Var.u) && Objects.equals(this.v, do2Var.v) && Objects.equals(this.w, do2Var.w) && Objects.equals(this.x, do2Var.x) && Objects.equals(this.y, do2Var.y) && TextUtils.equals(this.z, do2Var.z) && TextUtils.equals(this.A, do2Var.A) && TextUtils.equals(this.B, do2Var.B) && Objects.equals(this.C, do2Var.C) && Objects.equals(this.D, do2Var.D) && TextUtils.equals(this.E, do2Var.E) && TextUtils.equals(this.F, do2Var.F) && TextUtils.equals(this.G, do2Var.G) && Objects.equals(this.H, do2Var.H) && Objects.equals(this.J, do2Var.J)) {
                if ((this.I == null) == (do2Var.I == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, Integer.valueOf(Arrays.hashCode(this.k)), this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, Boolean.valueOf(this.I == null), this.J);
    }
}
