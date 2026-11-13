package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.eddyizm.tempus.ui.fragment.EqualizerFragment;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class y11 implements ServiceConnection {
    public final /* synthetic */ int n;
    public final /* synthetic */ kc1 o;

    public /* synthetic */ y11(int i, kc1 kc1Var) {
        this.n = i;
        this.o = kc1Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i = this.n;
        kc1 kc1Var = this.o;
        switch (i) {
            case 0:
                componentName.getClass();
                iBinder.getClass();
                EqualizerFragment equalizerFragment = (EqualizerFragment) kc1Var;
                wo0 wo0Var = ((xp) iBinder).e.A;
                if (wo0Var == null) {
                    h12.Q("equalizerManager");
                    throw null;
                }
                equalizerFragment.n0 = wo0Var;
                EqualizerFragment.h0(equalizerFragment);
                EqualizerFragment.i0(equalizerFragment);
                return;
            case 1:
                ((PlayerControllerFragment) kc1Var).N0 = true;
                return;
            default:
                vb4 vb4Var = (vb4) kc1Var;
                vb4Var.x0 = (xp) iBinder;
                vb4Var.y0 = true;
                vb4Var.n0();
                vb4Var.l0();
                return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = this.n;
        kc1 kc1Var = this.o;
        switch (i) {
            case 0:
                componentName.getClass();
                ((EqualizerFragment) kc1Var).n0 = null;
                break;
            case 1:
                ((PlayerControllerFragment) kc1Var).N0 = false;
                break;
            default:
                vb4 vb4Var = (vb4) kc1Var;
                vb4Var.x0 = null;
                vb4Var.y0 = false;
                break;
        }
    }
}
