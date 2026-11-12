package defpackage;

import com.eddyizm.tempus.homemusic.HubFragment;
import com.eddyizm.tempus.homemusic.WaveOut;
import com.eddyizm.tempus.homemusic.b;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zr1 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ HubFragment o;

    public /* synthetic */ zr1(HubFragment hubFragment, int i) {
        this.n = i;
        this.o = hubFragment;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        int i = this.n;
        j15 j15Var = j15.a;
        HubFragment hubFragment = this.o;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                List list = HubFragment.y0;
                hubFragment.l0(!zBooleanValue);
                return j15Var;
            case 1:
                String str = (String) obj;
                List list2 = HubFragment.y0;
                if (str != null) {
                    k03 k03Var = js1.a;
                    if (((String) k03Var.d()) != null) {
                        k03Var.k(null);
                    }
                    hubFragment.h0(str, false);
                }
                return j15Var;
            default:
                WaveOut waveOut = (WaveOut) obj;
                List list3 = HubFragment.y0;
                waveOut.getClass();
                WeakReference weakReference = b.a;
                MainActivity mainActivity = hubFragment.m0;
                if (mainActivity != null) {
                    b.i(mainActivity, waveOut);
                    return j15Var;
                }
                h12.Q("activity");
                throw null;
        }
    }
}
