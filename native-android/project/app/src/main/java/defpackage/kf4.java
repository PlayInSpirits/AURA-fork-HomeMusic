package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kf4 implements ta0 {
    public final /* synthetic */ mf4 a;

    public kf4(mf4 r1) {
        this.a = r1;
    }

    @Override // defpackage.ta0
    public final void a(boolean r4) {
        e35.m();
        mf4 r0 = this.a;
        monitor-enter(r0);
        ArrayList r1 = new ArrayList((HashSet) this.a.q);     // Catch: Throwable -> L10
        monitor-exit(r0);     // Catch: Throwable -> L10
        int r3 = r1.size();
        int r2 = 0;
    L7:
        if (r2 >= r3) goto L9;
        Object r5 = r1.get(r2);
        r2 = r2 + 1;
        ((ta0) r5).a(r4);
        goto L7
    L9:
        return;
    L10:
        th = move-exception;
        throw th;
    }
}
