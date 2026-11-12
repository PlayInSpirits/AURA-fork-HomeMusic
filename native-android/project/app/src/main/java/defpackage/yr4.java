package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yr4 {
    public static final Pattern d = null;
    public static final jx1 e = null;
    public static final jx1 f = null;
    public static final jx1 g = null;
    public static final jx1 h = null;
    public final int a;
    public final int b;
    public final int c;

    static {
        d = Pattern.compile("\\s+");
        e = jx1.j(2, new Object[]{"auto", "none"});
        f = jx1.j(3, new Object[]{"dot", "sesame", "circle"});
        g = jx1.j(2, new Object[]{"filled", "open"});
        h = jx1.j(3, new Object[]{"after", "before", "outside"});
    }

    public yr4(int r1, int r2, int r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }
}
