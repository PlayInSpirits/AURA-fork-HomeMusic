package defpackage;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class p95 {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final be3 a = new be3();
    public final StringBuilder b = new StringBuilder();

    public static String a(be3 be3Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = be3Var.b;
        int i2 = be3Var.c;
        while (i < i2 && !z) {
            char c2 = (char) be3Var.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        be3Var.O(i - be3Var.b);
        return sb.toString();
    }

    public static String b(be3 be3Var, StringBuilder sb) {
        c(be3Var);
        if (be3Var.a() == 0) {
            return null;
        }
        String a = a(be3Var, sb);
        if (!a.isEmpty()) {
            return a;
        }
        return "" + ((char) be3Var.A());
    }

    public static void c(be3 be3Var) {
        while (true) {
            for (boolean z = true; be3Var.a() > 0 && z; z = false) {
                int i = be3Var.b;
                byte[] bArr = be3Var.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    be3Var.O(1);
                } else {
                    int i2 = be3Var.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            be3Var.O(i2 - be3Var.b);
                        }
                    }
                }
            }
            return;
        }
    }
}
