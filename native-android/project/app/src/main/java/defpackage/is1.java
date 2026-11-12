package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.eddyizm.tempus.homemusic.HubFragment;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class is1 implements iq4 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ is1(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    private final void d(kq4 r1) {
    }

    private final void e(kq4 r1) {
    }

    @Override // defpackage.hq4
    public final void a(kq4 r1) {
        switch(this.a) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        r1.getClass();
    }

    @Override // defpackage.hq4
    public final void b(kq4 r2) {
        switch(this.a) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        r2.getClass();
        HubFragment r1 = (HubFragment) this.b;
        if (r1.p0 == true) goto L10;
        r1.i0(((fs1) HubFragment.y0.get(r2.b)).b);
        return;
    }

    @Override // defpackage.hq4
    public final void c(kq4 r2) {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((ViewPager2) r1).c(r2.b, true);
        return;
    L6:
        r2.getClass();
        HubFragment r3 = (HubFragment) r1;
        if (r3.p0 == true) goto L14;
        int r4 = r2.b;
        String r5 = HubFragment.z0[r4];
        if (r5 != null) goto L12;
        r5 = ((fs1) HubFragment.y0.get(r4)).b;
    L12:
        r3.i0(r5);
        return;
    }
}
