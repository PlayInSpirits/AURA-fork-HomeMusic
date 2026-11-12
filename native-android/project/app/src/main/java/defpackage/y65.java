package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y65 {
    public final xi4 a;
    public final LinkedHashMap b;
    public final LinkedHashSet c;
    public volatile boolean d;

    public y65() {
        this.a = new xi4(13);
        this.b = new LinkedHashMap();
        this.c = new LinkedHashSet();
    }

    public static void a(AutoCloseable r0) {
        if (r0 == null) goto L10;
        f34.m(r0);     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        er1.m(e);
        return;
    }
}
