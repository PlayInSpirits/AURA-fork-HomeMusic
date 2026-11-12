package defpackage;

import android.os.SystemClock;
import com.eddyizm.tempus.homemusic.HubFragment;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yr1 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ HubFragment o;

    public /* synthetic */ yr1(HubFragment hubFragment, int i) {
        this.n = i;
        this.o = hubFragment;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int i = this.n;
        j15 j15Var = j15.a;
        int i2 = 1;
        HubFragment hubFragment = this.o;
        switch (i) {
            case 0:
                List list = HubFragment.y0;
                WeakReference weakReference = lr1.a;
                MainActivity mainActivity = hubFragment.m0;
                if (mainActivity == null) {
                    h12.Q("activity");
                    throw null;
                }
                bl2 bl2Var = mainActivity.P;
                if (bl2Var != null) {
                    bl2Var.f(new jr1(bl2Var, 0), ud3.w(mainActivity));
                }
                bl2 bl2Var2 = mainActivity.P;
                if (bl2Var2 != null) {
                    bl2Var2.f(new jr1(bl2Var2, i2), ud3.w(mainActivity));
                }
                return j15Var;
            default:
                List list2 = HubFragment.y0;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jElapsedRealtime - hubFragment.q0 >= 30000) {
                    hubFragment.q0 = jElapsedRealtime;
                    hw.i = null;
                    hubFragment.h0(hubFragment.o0, true);
                }
                return j15Var;
        }
    }
}
