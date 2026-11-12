package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b04 implements ta0 {
    public final mf4 a;
    public final /* synthetic */ c04 b;

    public b04(c04 r1, mf4 r2) {
        this.b = r1;
        this.a = r2;
    }

    @Override // defpackage.ta0
    public final void a(boolean r6) {
        if (r6 == false) goto L20;
        c04 r7 = this.b;
        monitor-enter(r7);
        mf4 r5 = this.a;     // Catch: Throwable -> L17
        ArrayList r0 = e35.B((Set) r5.p);     // Catch: Throwable -> L17
        int r1 = r0.size();     // Catch: Throwable -> L17
        int r2 = 0;
    L6:
        if (r2 >= r1) goto L15;
        Object r3 = r0.get(r2);     // Catch: Throwable -> L17
        r2 = r2 + 1;     // Catch: Throwable -> L17
        pz3 r4 = (pz3) r3;     // Catch: Throwable -> L17
        if (r4.d() == true) goto L6;
        if (r4.j() == true) goto L6;
        r4.clear();     // Catch: Throwable -> L17
        if (r5.o == false) goto L13;
        ((HashSet) r5.q).add(r4);     // Catch: Throwable -> L17
        goto L6
    L13:
        r4.k();     // Catch: Throwable -> L17
        goto L6
    L15:
        monitor-exit(r7);     // Catch: Throwable -> L17
        return;
    L17:
        th = move-exception;
        throw th;
    }
}
