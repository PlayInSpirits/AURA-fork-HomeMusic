package defpackage;

import androidx.media3.common.ParserException;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y95 {
    public static final Pattern a = null;

    static {
        a = Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static boolean a(be3 r1) {
        r1.getClass();
        String r2 = r1.n(StandardCharsets.UTF_8);
        if (r2 != null) goto L5;
        return false;
    L5:
        if (r2.startsWith("WEBVTT") == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static float b(String r2) {
        if (r2.endsWith("%") == false) goto L7;
        return Float.parseFloat(r2.substring(0, r2.length() - 1)) / 100.0f;
    L7:
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String r11) {
        String r0 = f35.a;
        String[] r12 = r11.split("\\.", 2);
        int r1 = 0;
        String[] r2 = r12[0].split(":", -1);
        int r3 = r2.length;
        long r6 = 0;
    L3:
        if (r1 >= r3) goto L5;
        r6 = (r6 * 60) + Long.parseLong(r2[r1]);
        r1 = r1 + 1;
        goto L3
    L5:
        long r7 = r6 * 1000;
        if (r12.length != 2) goto L13;
        String r13 = r12[1].trim();
        if (r13.length() != 3) goto L10;
        r7 = r7 + Long.parseLong(r13);
        goto L13
    L10:
        kf2.n("Expected 3 decimal places, got: ".concat(r13));
        return 0;
    L13:
        return r7 * 1000;
    }

    public static void d(be3 r2) {
        int r0 = r2.b;
        if (a(r2) == false) goto L5;
        return;
    L5:
        r2.N(r0);
        throw ParserException.a(null, "Expected WEBVTT. Got " + r2.n(StandardCharsets.UTF_8));
    }
}
