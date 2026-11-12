package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.eddyizm.tempus.homemusic.HubFragment;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class is1 implements iq4 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ is1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void d(kq4 kq4Var) {
    }

    private final void e(kq4 kq4Var) {
    }

    @Override // defpackage.hq4
    public final void a(kq4 kq4Var) {
        switch (this.a) {
            case 0:
                kq4Var.getClass();
                break;
        }
    }

    @Override // defpackage.hq4
    public final void b(kq4 kq4Var) {
        switch (this.a) {
            case 0:
                kq4Var.getClass();
                HubFragment hubFragment = (HubFragment) this.b;
                if (!hubFragment.p0) {
                    hubFragment.i0(((fs1) HubFragment.y0.get(kq4Var.b)).b);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.hq4
    public final void c(kq4 kq4Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                kq4Var.getClass();
                HubFragment hubFragment = (HubFragment) obj;
                if (!hubFragment.p0) {
                    int i2 = kq4Var.b;
                    String str = HubFragment.z0[i2];
                    if (str == null) {
                        str = ((fs1) HubFragment.y0.get(i2)).b;
                    }
                    hubFragment.i0(str);
                    break;
                }
                break;
            default:
                ((ViewPager2) obj).c(kq4Var.b, true);
                break;
        }
    }
}
