package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.eddyizm.tempus.App;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class b11 {
    public static String a(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String b(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = str.charAt(i);
            if (!Character.isLetter(charAt)) {
                i++;
            } else if (!Character.isUpperCase(charAt)) {
                char upperCase = Character.toUpperCase(charAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static /* synthetic */ boolean c(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            return true;
        }
        throw null;
    }

    public static int d(int i, float f, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static tf0 e(nc1 nc1Var, b75 b75Var) {
        tf0 q = gh0.q(nc1Var);
        b75Var.getClass();
        q.getClass();
        return q;
    }

    public static nz3 f(String str) {
        str.getClass();
        return new nz3();
    }

    public static vz3 g(Context context, String str, int i, c04 c04Var, String str2) {
        c04Var.a(wg0.a(i, context, str));
        return c04Var.t(str2);
    }

    public static Bundle h(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    public static View i(ViewGroup viewGroup, int i, ViewGroup viewGroup2, boolean z) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup2, z);
    }

    public static String j(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String k(String str, long j) {
        return str + j;
    }

    public static String l(String str, kc1 kc1Var, String str2) {
        return str + kc1Var + str2;
    }

    public static String m(String str, String str2) {
        App.b().getClass();
        return App.c().getString(str, str2);
    }

    public static String n(String str, String str2, int i, int i2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String o(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String p(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String q(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder r(String str, float f, String str2, float f2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(f);
        sb.append(str2);
        sb.append(f2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder s(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder t(String str, String str2, int i, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder u(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void v(int i, int i2, int i3, int i4, int i5) {
        fh0.a(i);
        fh0.a(i2);
        fh0.a(i3);
        fh0.a(i4);
        fh0.a(i5);
    }

    public static void w(bl2 bl2Var, bj2 bj2Var, Handler handler) {
        f35.W(handler, new ws1(11, bl2Var, bj2Var));
    }

    public static /* synthetic */ String x(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String y(int i) {
        switch (i) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }
}
