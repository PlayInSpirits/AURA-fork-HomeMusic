package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nq4 extends m75 {
    public final WeakReference a;
    public int b;
    public int c;

    public nq4(TabLayout r2) {
        this.a = new WeakReference(r2);
        this.c = 0;
        this.b = 0;
    }

    @Override // defpackage.m75
    public final void a(int r2) {
        this.b = this.c;
        this.c = r2;
        TabLayout r3 = (TabLayout) this.a.get();
        if (r3 == null) goto L6;
        r3.c0 = this.c;
        return;
    }

    @Override // defpackage.m75
    public final void b(int r7, float r8, int r9) {
        TabLayout r0 = (TabLayout) this.a.get();
        if (r0 == null) goto L18;
        int r10 = this.c;
        boolean r3 = true;
        if (r10 != 2) goto L11;
        if (this.b == 1) goto L11;
        r3 = false;
    L11:
        if (r10 == 2) goto L13;
    L16:
        r0.j(r7, r8, r3, r3, false);
        return;
    L13:
        if (this.b != 0) goto L16;
        r3 = false;
        goto L16
    }

    @Override // defpackage.m75
    public final void c(int r4) {
        TabLayout r0 = (TabLayout) this.a.get();
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.getSelectedTabPosition() != r4) goto L7;
        return;
    L7:
        if (r4 >= r0.getTabCount()) goto L21;
        int r1 = this.c;
        if (r1 != 0) goto L11;
    L16:
        boolean r3 = true;
    L17:
        r0.i(r0.f(r4), r3);
        return;
    L11:
        if (r1 == 2) goto L13;
    L15:
        r3 = false;
        goto L17
    L13:
        if (this.b != 0) goto L15;
    }
}
