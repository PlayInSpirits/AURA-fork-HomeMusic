package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a00 {
    public final String a;
    public final boolean b;
    public final l61 c;

    public a00(String r4, boolean r5, boolean r6, String r7, String r8, boolean r9) {
        this.a = r4;
        this.b = r5;
        HashMap r10 = n61.a;
        monitor-enter(n61.class);
        n61.b.putIfAbsent(n61.e(1, r4), Boolean.valueOf(r5));     // Catch: Throwable -> L8
        monitor-exit(n61.class);
        this.c = n61.h(1, r4, r6, r7, !r9);
        return;
    L8:
        th = move-exception;
        throw th;
    }
}
