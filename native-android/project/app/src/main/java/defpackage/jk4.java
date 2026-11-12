package defpackage;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jk4 {
    public static final Pattern a = null;
    public static final Pattern b = null;
    public static final Pattern c = null;
    public static final Pattern d = null;

    static {
        a = Pattern.compile("\\{([^}]*)\\}");
        String r2 = f35.a;
        Locale r3 = Locale.US;
        b = Pattern.compile(String.format(r3, "\\\\pos\\((%1$s),(%1$s)\\)", new Object[]{"\\s*\\d+(?:\\.\\d+)?\\s*"}));
        c = Pattern.compile(String.format(r3, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", new Object[]{"\\s*\\d+(?:\\.\\d+)?\\s*"}));
        d = Pattern.compile("\\\\an(\\d+)");
    }

    public static PointF a(String r6) {
        Matcher r0 = b.matcher(r6);
        Matcher r1 = c.matcher(r6);
        boolean r2 = r0.find();
        boolean r3 = r1.find();
        if (r2 == false) goto L7;
        if (r3 == false) goto L6;
        l93.K("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + r6 + "'");
    L6:
        String r7 = r0.group(1);
        String r4 = r0.group(2);
    L9:
        r7.getClass();
        float r8 = Float.parseFloat(r7.trim());
        r4.getClass();
        return new PointF(r8, Float.parseFloat(r4.trim()));
    L7:
        if (r3 == false) goto L11;
        r7 = r1.group(1);
        r4 = r1.group(2);
        goto L9
    L11:
        return null;
    }
}
