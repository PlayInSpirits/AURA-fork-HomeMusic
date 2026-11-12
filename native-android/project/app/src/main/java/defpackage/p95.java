package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p95 {
    public static final Pattern c = null;
    public static final Pattern d = null;
    public final be3 a;
    public final StringBuilder b;

    static {
        c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
        d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    }

    public p95() {
        this.a = new be3();
        this.b = new StringBuilder();
    }

    public static String a(be3 r5, StringBuilder r6) {
        boolean r0 = false;
        r6.setLength(0);
        int r1 = r5.b;
        int r2 = r5.c;
    L3:
        if (r1 >= r2) goto L28;
        if (r0 == true) goto L28;
        char r3 = (char) r5.a[r1];
        if (r3 < 'A') goto L10;
        if (r3 > 'Z') goto L10;
    L27:
        r1 = r1 + 1;
        r6.append(r3);
    L10:
        if (r3 < 'a') goto L14;
        if (r3 <= 'z') goto L27;
    L14:
        if (r3 < '0') goto L18;
        if (r3 <= '9') goto L27;
    L18:
        if (r3 == '#') goto L27;
        if (r3 == '-') goto L27;
        if (r3 == '.') goto L27;
        if (r3 == '_') goto L27;
        r0 = true;
    L28:
        r5.O(r1 - r5.b);
        return r6.toString();
    }

    public static String b(be3 r1, StringBuilder r2) {
        c(r1);
        if (r1.a() != 0) goto L6;
        return null;
    L6:
        String r3 = a(r1, r2);
        if (r3.isEmpty() == true) goto L10;
        return r3;
    L10:
        return "" + ((char) r1.A());
    }

    public static void c(be3 r8) {
    L3:
        boolean r1 = true;
    L5:
        if (r8.a() <= 0) goto L34;
        if (r1 == false) goto L56;
        int r2 = r8.b;
        byte[] r3 = r8.a;
        byte r4 = r3[r2];
        char r5 = (char) r4;
        if (r5 == '\t') goto L33;
        if (r5 == '\n') goto L33;
        if (r5 == '\f') goto L33;
        if (r5 == '\r') goto L33;
        if (r5 == ' ') goto L33;
        int r6 = r8.c;
        int r7 = r2 + 2;
        if (r7 > r6) goto L32;
        int r9 = r2 + 1;
        if (r4 != 47) goto L32;
        if (r3[r9] != 42) goto L32;
    L23:
        int r10 = r7 + 1;
        if (r10 >= r6) goto L31;
        if (((char) r3[r7]) != '*') goto L30;
        if (((char) r3[r10]) != '/') goto L30;
        r7 = r7 + 2;
        r6 = r7;
    L30:
        r7 = r10;
        goto L23
    L31:
        r8.O(r6 - r8.b);
    L32:
        r1 = false;
    L33:
        r8.O(1);
        goto L3
    L56:
        return;
    }
}
