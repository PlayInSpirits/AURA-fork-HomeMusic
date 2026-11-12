package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.eddyizm.tempus.App;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b11 {
    public static String a(String r5, char r6) {
        StringBuilder r0 = new StringBuilder();
        int r1 = r5.length();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L11;
        char r3 = r5.charAt(r2);
        if (Character.isUpperCase(r3) == false) goto L9;
        if (r0.length() == 0) goto L9;
        r0.append(r6);
    L9:
        r0.append(r3);
        r2 = r2 + 1;
        goto L3
    L11:
        return r0.toString();
    }

    public static String b(String r5) {
        int r0 = r5.length();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L16;
        char r3 = r5.charAt(r2);
        if (Character.isLetter(r3) == true) goto L7;
        r2 = r2 + 1;
        goto L3
    L7:
        if (Character.isUpperCase(r3) == true) goto L16;
        char r1 = Character.toUpperCase(r3);
        if (r2 != 0) goto L14;
        return r1 + r5.substring(1);
    L14:
        return r5.substring(0, r2) + r1 + r5.substring(r2 + 1);
    L16:
        return r5;
    }

    public static /* synthetic */ boolean c(int r3) {
        if (r3 != 1) goto L5;
    L16:
        return false;
    L5:
        if (r3 == 2) goto L16;
        if (r3 == 3) goto L16;
        if (r3 != 4) goto L11;
        return true;
    L11:
        if (r3 != 5) goto L14;
        return true;
    L14:
        throw null;
    }

    public static int d(int r0, float r1, int r2) {
        return (Float.hashCode(r1) + r0) * r2;
    }

    public static tf0 e(nc1 r0, b75 r1) {
        tf0 r2 = gh0.q(r0);
        r1.getClass();
        r2.getClass();
        return r2;
    }

    public static nz3 f(String r0) {
        r0.getClass();
        return new nz3();
    }

    public static vz3 g(Context r0, String r1, int r2, c04 r3, String r4) {
        r3.a(wg0.a(r2, r0, r1));
        return r3.t(r4);
    }

    public static Bundle h(String r1, String r2) {
        Bundle r0 = new Bundle();
        r0.putString(r1, r2);
        return r0;
    }

    public static View i(ViewGroup r0, int r1, ViewGroup r2, boolean r3) {
        return LayoutInflater.from(r0.getContext()).inflate(r1, r2, r3);
    }

    public static String j(int r1, String r2, String r3) {
        return r2 + r1 + r3;
    }

    public static String k(String r1, long r2) {
        return r1 + r2;
    }

    public static String l(String r1, kc1 r2, String r3) {
        return r1 + r2 + r3;
    }

    public static String m(String r1, String r2) {
        App.b().getClass();
        return App.c().getString(r1, r2);
    }

    public static String n(String r1, String r2, int r3, int r4, String r5) {
        return r1 + r3 + r2 + r4 + r5;
    }

    public static String o(String r1, String r2, String r3) {
        return r1 + r2 + r3;
    }

    public static String p(StringBuilder r0, long r1, String r3) {
        r0.append(r1);
        r0.append(r3);
        return r0.toString();
    }

    public static String q(StringBuilder r0, String r1, String r2) {
        r0.append(r1);
        r0.append(r2);
        return r0.toString();
    }

    public static StringBuilder r(String r1, float r2, String r3, float r4, String r5) {
        StringBuilder r0 = new StringBuilder(r1);
        r0.append(r2);
        r0.append(r3);
        r0.append(r4);
        r0.append(r5);
        return r0;
    }

    public static StringBuilder s(String r1, String r2) {
        StringBuilder r0 = new StringBuilder();
        r0.append(r1);
        r0.append(r2);
        return r0;
    }

    public static StringBuilder t(String r1, String r2, int r3, int r4, String r5) {
        StringBuilder r0 = new StringBuilder(r1);
        r0.append(r3);
        r0.append(r2);
        r0.append(r4);
        r0.append(r5);
        return r0;
    }

    public static StringBuilder u(String r1, String r2, String r3, String r4, String r5) {
        StringBuilder r0 = new StringBuilder(r1);
        r0.append(r2);
        r0.append(r3);
        r0.append(r4);
        r0.append(r5);
        return r0;
    }

    public static void v(int r0, int r1, int r2, int r3, int r4) {
        fh0.a(r0);
        fh0.a(r1);
        fh0.a(r2);
        fh0.a(r3);
        fh0.a(r4);
    }

    public static void w(bl2 r2, bj2 r3, Handler r4) {
        f35.W(r4, new ws1(11, r2, r3));
    }

    public static /* synthetic */ String x(int r0) {
        switch(r0) {
            case 1: goto L23;
            case 2: goto L21;
            case 3: goto L19;
            case 4: goto L17;
            case 5: goto L15;
            case 6: goto L13;
            case 7: goto L11;
            case 8: goto L9;
            case 9: goto L7;
            case 10: goto L5;
            default: goto L3;
        };
    L3:
        return "null";
    L5:
        return "END_DOCUMENT";
    L7:
        return "NULL";
    L9:
        return "BOOLEAN";
    L11:
        return "NUMBER";
    L13:
        return "STRING";
    L15:
        return "NAME";
    L17:
        return "END_OBJECT";
    L19:
        return "BEGIN_OBJECT";
    L21:
        return "END_ARRAY";
    L23:
        return "BEGIN_ARRAY";
    }

    public static /* synthetic */ String y(int r0) {
        switch(r0) {
            case 1: goto L15;
            case 2: goto L13;
            case 3: goto L11;
            case 4: goto L9;
            case 5: goto L7;
            case 6: goto L5;
            default: goto L3;
        };
    L3:
        return "null";
    L5:
        return "TEMPORARILY_UNMETERED";
    L7:
        return "METERED";
    L9:
        return "NOT_ROAMING";
    L11:
        return "UNMETERED";
    L13:
        return "CONNECTED";
    L15:
        return "NOT_REQUIRED";
    }
}
