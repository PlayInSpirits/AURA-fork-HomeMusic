package defpackage;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hn2 {
    public static final HashSet a = null;
    public static String b;

    static {
        a = new HashSet();
        b = "media3.common";
    }

    public static synchronized void a(String r3) {
        monitor-enter(hn2.class);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (a.add(r3) == false) goto L10;
        b += ", " + r3;     // Catch: Throwable -> L8
    L10:
        monitor-exit(hn2.class);
    }
}
