package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nq4 extends m75 {
    public final WeakReference a;
    public int c = 0;
    public int b = 0;

    public nq4(TabLayout tabLayout) {
        this.a = new WeakReference(tabLayout);
    }

    @Override // defpackage.m75
    public final void a(int i) {
        this.b = this.c;
        this.c = i;
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            tabLayout.c0 = this.c;
        }
    }

    @Override // defpackage.m75
    public final void b(int i, float f, int i2) {
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            int i3 = this.c;
            boolean z = true;
            if (i3 == 2 && this.b != 1) {
                z = false;
            }
            if (i3 == 2 && this.b == 0) {
                z = false;
            }
            tabLayout.j(i, f, z, z, false);
        }
    }

    @Override // defpackage.m75
    public final void c(int i) {
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
            return;
        }
        int i2 = this.c;
        tabLayout.i(tabLayout.f(i), i2 == 0 || (i2 == 2 && this.b == 0));
    }
}
