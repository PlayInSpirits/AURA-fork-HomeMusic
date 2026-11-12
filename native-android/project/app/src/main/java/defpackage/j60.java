package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j60 {
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public final va4 a;
    public final int b;
    public final int c;
    public final int d;
    public final Uri e;
    public final CharSequence f;
    public final Bundle g;
    public final tw1 h;
    public final boolean i;
    public final Object j;

    static {
        String str = f35.a;
        k = Integer.toString(0, 36);
        l = Integer.toString(1, 36);
        m = Integer.toString(2, 36);
        n = Integer.toString(3, 36);
        o = Integer.toString(4, 36);
        p = Integer.toString(5, 36);
        q = Integer.toString(6, 36);
        r = Integer.toString(7, 36);
        s = Integer.toString(8, 36);
        t = Integer.toString(9, 36);
    }

    public j60(va4 va4Var, int i, int i2, int i3, Uri uri, CharSequence charSequence, Bundle bundle, boolean z, tw1 tw1Var, Object obj) {
        this.a = va4Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = uri;
        this.f = charSequence;
        this.g = new Bundle(bundle);
        this.i = z;
        this.h = tw1Var;
        this.j = obj;
    }

    public static Object a(int i, Object obj) {
        if (obj == null) {
            return null;
        }
        switch (i) {
            case 1:
                if (obj instanceof Integer) {
                    obj = Long.valueOf(((Integer) obj).longValue());
                }
                rr2.k("Parameter has incorrect type.", obj instanceof Long);
                return obj;
            case 2:
                rr2.k("Parameter has incorrect type.", obj instanceof Integer);
                return obj;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                rr2.k("Parameter has incorrect type.", obj instanceof Boolean);
                return obj;
            case 4:
                if (obj instanceof Double) {
                    obj = Float.valueOf(((Double) obj).floatValue());
                }
                rr2.k("Parameter has incorrect type.", obj instanceof Float);
                return obj;
            case 5:
                rr2.k("Parameter has incorrect type.", obj instanceof lu3);
                return obj;
            case 6:
                rr2.k("Parameter has incorrect type.", obj instanceof gn2);
                return obj;
            case 7:
                rr2.k("Parameter has incorrect type.", obj instanceof do2);
                return obj;
            case 8:
                rr2.k("Parameter has incorrect type.", obj instanceof cw4);
                return obj;
            default:
                return null;
        }
    }

    public static boolean c(List list, int i) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((j60) list.get(i2)).h.a(0) == i) {
                return true;
            }
        }
        return false;
    }

    public static j60 d(va4 va4Var) {
        String str = va4Var.b;
        Bundle bundle = va4Var.c;
        if (!str.startsWith("androidx.media3.session.PLAYER_COMMAND_")) {
            int i = Integer.parseInt(str.substring(40));
            Object objL = l("androidx.media3.session.CUSTOM_COMMAND_PARAMETER", i == 40010 ? 5 : 0, bundle);
            i60 i60Var = new i60(0);
            i60Var.e(new va4(i), objL);
            return i60Var.a();
        }
        int i2 = Integer.parseInt(str.substring(39));
        Object objL2 = l("androidx.media3.session.CUSTOM_COMMAND_PARAMETER", m(i2), bundle);
        i60 i60Var2 = new i60(0);
        rr2.k("sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.", i60Var2.b == null);
        i60Var2.c = i2;
        i60Var2.j = a(m(i2), objL2);
        return i60Var2.a();
    }

    public static gy3 g(List list, wa4 wa4Var, mi3 mi3Var) {
        int i;
        uw1 uw1Var = new uw1(4);
        for (int i2 = 0; i2 < list.size(); i2++) {
            j60 j60Var = (j60) list.get(i2);
            va4 va4Var = j60Var.a;
            if ((va4Var == null || !wa4Var.a.contains(va4Var)) && ((i = j60Var.b) == -1 || !mi3Var.a(i))) {
                if (j60Var.i) {
                    j60Var = new j60(j60Var.a, j60Var.b, j60Var.c, j60Var.d, j60Var.e, j60Var.f, new Bundle(j60Var.g), false, j60Var.h, j60Var.j);
                }
                uw1Var.c(j60Var);
            } else {
                uw1Var.c(j60Var);
            }
        }
        return uw1Var.f();
    }

    public static j60 i(int i, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(k);
        va4 va4VarA = bundle2 == null ? null : va4.a(bundle2);
        int i2 = bundle.getInt(l, -1);
        int i3 = bundle.getInt(m, 0);
        CharSequence charSequence = bundle.getCharSequence(n, "");
        Bundle bundleN = f35.n(bundle.getBundle(o));
        boolean z = i < 3 || bundle.getBoolean(p, true);
        Uri uri = (Uri) bundle.getParcelable(q);
        int i4 = bundle.getInt(r, 0);
        int[] intArray = bundle.getIntArray(s);
        i60 i60Var = new i60(i4, i3);
        String str = t;
        if (va4VarA != null) {
            i60Var.e(va4VarA, l(str, va4VarA.a == 40010 ? 5 : 0, bundle));
        }
        if (i2 != -1) {
            Object objL = l(str, m(i2), bundle);
            rr2.k("sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.", i60Var.b == null);
            i60Var.c = i2;
            i60Var.j = a(m(i2), objL);
        }
        if (uri != null && (Objects.equals(uri.getScheme(), "content") || Objects.equals(uri.getScheme(), "android.resource"))) {
            i60Var.b(uri);
        }
        i60Var.f = charSequence;
        if (bundleN == null) {
            bundleN = Bundle.EMPTY;
        }
        i60Var.g = new Bundle(bundleN);
        i60Var.h = z;
        if (intArray == null) {
            intArray = new int[]{6};
        }
        i60Var.f(intArray);
        return i60Var.a();
    }

    public static gy3 j(List list, boolean z, boolean z2) {
        int iA;
        if (list.isEmpty()) {
            vw1 vw1Var = yw1.o;
            return gy3.r;
        }
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            j60 j60Var = (j60) list.get(i3);
            boolean z3 = j60Var.i;
            tw1 tw1Var = j60Var.h;
            if (z3 && j60Var.b()) {
                for (int i4 = 0; i4 < tw1Var.o && (iA = tw1Var.a(i4)) != 6; i4++) {
                    if (z && i == -1 && iA == 2) {
                        i = i3;
                        break;
                    }
                    if (z2 && i2 == -1 && iA == 3) {
                        i2 = i3;
                        break;
                    }
                }
            }
        }
        uw1 uw1VarJ = yw1.j();
        if (i != -1) {
            uw1VarJ.c(((j60) list.get(i)).e(2));
        }
        if (i2 != -1) {
            uw1VarJ.c(((j60) list.get(i2)).e(3));
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            j60 j60Var2 = (j60) list.get(i5);
            if (j60Var2.i && j60Var2.b() && i5 != i && i5 != i2) {
                tw1 tw1Var2 = j60Var2.h;
                tw1Var2.getClass();
                int i6 = 0;
                while (true) {
                    if (i6 >= tw1Var2.o) {
                        i6 = -1;
                        break;
                    }
                    if (tw1Var2.n[i6] == 6) {
                        break;
                    }
                    i6++;
                }
                if (i6 >= 0) {
                    uw1VarJ.c(j60Var2.e(6));
                }
            }
        }
        return uw1VarJ.f();
    }

    public static gy3 k(List list, mi3 mi3Var, Bundle bundle) {
        if (list.isEmpty()) {
            vw1 vw1Var = yw1.o;
            return gy3.r;
        }
        boolean zA = mi3Var.a.a(7, 6);
        boolean zA2 = mi3Var.a.a(9, 8);
        boolean z = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z2 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        int i = (zA || z) ? -1 : 0;
        int i2 = (zA2 || z2) ? -1 : i == 0 ? 1 : 0;
        uw1 uw1VarJ = yw1.j();
        for (int i3 = 0; i3 < list.size(); i3++) {
            j60 j60Var = (j60) list.get(i3);
            if (i3 == i) {
                if (i2 == -1) {
                    uw1VarJ.c(j60Var.f(new tw1(new int[]{2, 6})));
                } else {
                    uw1VarJ.c(j60Var.f(new tw1(new int[]{2, 3, 6})));
                }
            } else if (i3 == i2) {
                uw1VarJ.c(j60Var.f(new tw1(new int[]{3, 6})));
            } else {
                uw1VarJ.c(j60Var.f(new tw1(new int[]{6})));
            }
        }
        return uw1VarJ.f();
    }

    public static Object l(String str, int i, Bundle bundle) {
        if (!bundle.containsKey(str)) {
            return null;
        }
        switch (i) {
            case 1:
                return Long.valueOf(bundle.getLong(str));
            case 2:
                return Integer.valueOf(bundle.getInt(str));
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return Boolean.valueOf(bundle.getBoolean(str));
            case 4:
                return Float.valueOf(bundle.getFloat(str));
            case 5:
                Bundle bundle2 = bundle.getBundle(str);
                bundle2.getClass();
                return lu3.a(bundle2);
            case 6:
                Bundle bundle3 = bundle.getBundle(str);
                bundle3.getClass();
                return gn2.b(bundle3);
            case 7:
                Bundle bundle4 = bundle.getBundle(str);
                bundle4.getClass();
                return do2.b(bundle4);
            case 8:
                Bundle bundle5 = bundle.getBundle(str);
                bundle5.getClass();
                return cw4.b(bundle5);
            default:
                return null;
        }
    }

    public static int m(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 5) {
            return 1;
        }
        if (i == 10) {
            return 2;
        }
        if (i == 19) {
            return 7;
        }
        if (i == 24) {
            return 4;
        }
        if (i == 29) {
            return 8;
        }
        if (i == 31) {
            return 6;
        }
        switch (i) {
            case 13:
                return 4;
            case 14:
                return 3;
            case 15:
                return 2;
            default:
                return 0;
        }
    }

    public static boolean n(String str) {
        return str.startsWith("androidx.media3.session.PLAYER_COMMAND_") || str.startsWith("androidx.media3.session.SESSION_COMMAND_");
    }

    public final boolean b() {
        Object obj = this.j;
        va4 va4Var = this.a;
        if (va4Var != null) {
            int i = va4Var.a;
            if (i != 0) {
                return i == 40010 && obj != null;
            }
            return true;
        }
        int i2 = this.b;
        if (i2 != 19) {
            if (i2 != 24) {
                if (i2 != 29 && i2 != 31) {
                    switch (i2) {
                        case 1:
                        case 2:
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 11:
                        case 12:
                        case 14:
                            break;
                        case 5:
                        case 10:
                        case 13:
                        case 15:
                            break;
                        default:
                            return false;
                    }
                }
            }
            return true;
        }
        return obj != null;
    }

    public final j60 e(int i) {
        String str;
        va4 va4Var = this.a;
        if (va4Var != null && va4Var.a == 0) {
            return f(new tw1(new int[]{i}));
        }
        Bundle bundle = Bundle.EMPTY;
        if (this.j != null) {
            bundle = new Bundle();
            p("androidx.media3.session.CUSTOM_COMMAND_PARAMETER", bundle);
        }
        if (va4Var != null) {
            str = "androidx.media3.session.SESSION_COMMAND_" + va4Var.a;
        } else {
            str = "androidx.media3.session.PLAYER_COMMAND_" + this.b;
        }
        return new j60(new va4(str, bundle), -1, this.c, this.d, this.e, this.f, this.g, this.i, new tw1(new int[]{i}), null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j60)) {
            return false;
        }
        j60 j60Var = (j60) obj;
        return Objects.equals(this.a, j60Var.a) && this.b == j60Var.b && this.c == j60Var.c && this.d == j60Var.d && Objects.equals(this.e, j60Var.e) && TextUtils.equals(this.f, j60Var.f) && this.i == j60Var.i && this.h.equals(j60Var.h) && Objects.equals(this.j, j60Var.j);
    }

    public final j60 f(tw1 tw1Var) {
        if (this.h.equals(tw1Var)) {
            return this;
        }
        return new j60(this.a, this.b, this.c, this.d, this.e, this.f, new Bundle(this.g), this.i, tw1Var, this.j);
    }

    public final void h(qi3 qi3Var) {
        if (this.i) {
            Object obj = this.j;
            int i = this.b;
            if (i == 19) {
                if (obj != null) {
                    qi3Var.l0((do2) obj);
                    return;
                }
                return;
            }
            if (i == 24) {
                if (obj != null) {
                    qi3Var.R(((Float) obj).floatValue());
                    return;
                } else if (qi3Var.B() == 0.0f) {
                    qi3Var.a0();
                    return;
                } else {
                    qi3Var.A0();
                    return;
                }
            }
            if (i == 29) {
                if (obj != null) {
                    qi3Var.M((cw4) obj);
                    return;
                }
                return;
            }
            if (i == 31) {
                if (obj != null) {
                    qi3Var.s0((gn2) obj);
                    return;
                }
                return;
            }
            switch (i) {
                case 1:
                    if (obj == null) {
                        qi3Var.V(!qi3Var.q());
                    } else {
                        qi3Var.V(((Boolean) obj).booleanValue());
                    }
                    break;
                case 2:
                    qi3Var.b();
                    break;
                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                    qi3Var.stop();
                    break;
                case 4:
                    qi3Var.C();
                    break;
                case 5:
                    if (obj != null) {
                        qi3Var.O(((Long) obj).longValue());
                    }
                    break;
                case 6:
                    qi3Var.A();
                    break;
                case 7:
                    qi3Var.S();
                    break;
                case 8:
                    qi3Var.c0();
                    break;
                case 9:
                    qi3Var.H0();
                    break;
                case 10:
                    if (obj != null) {
                        qi3Var.W(((Integer) obj).intValue());
                    }
                    break;
                case 11:
                    qi3Var.J0();
                    break;
                case 12:
                    qi3Var.I0();
                    break;
                case 13:
                    if (obj != null) {
                        qi3Var.e(((Float) obj).floatValue());
                    }
                    break;
                case 14:
                    if (obj == null) {
                        qi3Var.s(!qi3Var.D0());
                    } else {
                        qi3Var.s(((Boolean) obj).booleanValue());
                    }
                    break;
                case 15:
                    if (obj != null) {
                        qi3Var.p0(((Integer) obj).intValue());
                    }
                    break;
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.f, Boolean.valueOf(this.i), this.e, this.h, this.j);
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        va4 va4Var = this.a;
        if (va4Var != null) {
            bundle.putBundle(k, va4Var.b());
        }
        int i = this.b;
        if (i != -1) {
            bundle.putInt(l, i);
        }
        int i2 = this.c;
        if (i2 != 0) {
            bundle.putInt(r, i2);
        }
        int i3 = this.d;
        if (i3 != 0) {
            bundle.putInt(m, i3);
        }
        CharSequence charSequence = this.f;
        if (charSequence != "") {
            bundle.putCharSequence(n, charSequence);
        }
        Bundle bundle2 = this.g;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(o, bundle2);
        }
        Uri uri = this.e;
        if (uri != null) {
            bundle.putParcelable(q, uri);
        }
        boolean z = this.i;
        if (!z) {
            bundle.putBoolean(p, z);
        }
        tw1 tw1Var = this.h;
        if (tw1Var.o != 1 || tw1Var.a(0) != 6) {
            bundle.putIntArray(s, Arrays.copyOfRange(tw1Var.n, 0, tw1Var.o));
        }
        if (this.j != null) {
            p(t, bundle);
        }
        return bundle;
    }

    public final void p(String str, Bundle bundle) {
        int iM;
        va4 va4Var = this.a;
        if (va4Var != null) {
            iM = va4Var.a == 40010 ? 5 : 0;
        } else {
            iM = m(this.b);
        }
        Object obj = this.j;
        switch (iM) {
            case 1:
                bundle.putLong(str, ((Long) obj).longValue());
                break;
            case 2:
                bundle.putInt(str, ((Integer) obj).intValue());
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                break;
            case 4:
                bundle.putFloat(str, ((Float) obj).floatValue());
                break;
            case 5:
                bundle.putBundle(str, ((lu3) obj).c());
                break;
            case 6:
                bundle.putBundle(str, ((gn2) obj).c(false));
                break;
            case 7:
                bundle.putBundle(str, ((do2) obj).c());
                break;
            case 8:
                bundle.putBundle(str, ((cw4) obj).c());
                break;
        }
    }
}
