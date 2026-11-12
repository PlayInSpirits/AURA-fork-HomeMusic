package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ua1 implements xc0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ua1(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.xc0
    public final void accept(Object r4) {
        switch(this.a) {
            case 0: goto L21;
            default: goto L4;
        };
    L4:
        va1 r5 = (va1) r4;
        Object r0 = wa1.c;
        monitor-enter(r0);
        yd4 r1 = wa1.d;     // Catch: Throwable -> L10
        ArrayList r2 = (ArrayList) r1.get((String) this.b);     // Catch: Throwable -> L10
        if (r2 != null) goto L12;
        monitor-exit(r0);     // Catch: Throwable -> L10
        return;
    L12:
        r1.remove((String) this.b);     // Catch: Throwable -> L10
        monitor-exit(r0);     // Catch: Throwable -> L10
        int r3 = 0;
    L16:
        if (r3 >= r2.size()) goto L28;
        ((xc0) r2.get(r3)).accept(r5);
        r3 = r3 + 1;
        goto L16
    L28:
        return;
    L10:
        th = move-exception;
        throw th;
    L21:
        va1 r6 = (va1) r4;
        if (r6 != null) goto L24;
        r6 = new va1(-3);
    L24:
        ((wo0) this.b).H(r6);
    }
}
