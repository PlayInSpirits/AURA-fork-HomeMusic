package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zq4 implements z92 {
    public final Set n;

    public zq4() {
        this.n = Collections.newSetFromMap(new WeakHashMap());
    }

    @Override // defpackage.z92
    public final void h() {
        ArrayList r3 = e35.B(this.n);
        int r0 = r3.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        Object r2 = r3.get(r1);
        r1 = r1 + 1;
        ((wq4) r2).h();
        goto L3
    }

    @Override // defpackage.z92
    public final void j() {
        ArrayList r3 = e35.B(this.n);
        int r0 = r3.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        Object r2 = r3.get(r1);
        r1 = r1 + 1;
        ((wq4) r2).j();
        goto L3
    }

    @Override // defpackage.z92
    public final void n() {
        ArrayList r3 = e35.B(this.n);
        int r0 = r3.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        Object r2 = r3.get(r1);
        r1 = r1 + 1;
        ((wq4) r2).n();
        goto L3
    }
}
