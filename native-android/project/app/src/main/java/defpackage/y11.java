package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.eddyizm.tempus.ui.fragment.EqualizerFragment;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y11 implements ServiceConnection {
    public final /* synthetic */ int n;
    public final /* synthetic */ kc1 o;

    public /* synthetic */ y11(int r1, kc1 r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName r3, IBinder r4) {
        int r0 = this.n;
        kc1 r2 = this.o;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        vb4 r5 = (vb4) r2;
        r5.x0 = (xp) r4;
        r5.y0 = true;
        r5.n0();
        r5.l0();
        return;
    L6:
        xp r6 = (xp) r4;
        ((PlayerControllerFragment) r2).N0 = true;
        return;
    L8:
        r3.getClass();
        r4.getClass();
        EqualizerFragment r7 = (EqualizerFragment) r2;
        wo0 r8 = ((xp) r4).e.A;
        if (r8 == null) goto L12;
        r7.n0 = r8;
        EqualizerFragment.h0(r7);
        EqualizerFragment.i0(r7);
        return;
    L12:
        h12.Q("equalizerManager");
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName r4) {
        int r0 = this.n;
        kc1 r3 = this.o;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        vb4 r5 = (vb4) r3;
        r5.x0 = null;
        r5.y0 = false;
        return;
    L6:
        ((PlayerControllerFragment) r3).N0 = false;
        return;
    L8:
        r4.getClass();
        ((EqualizerFragment) r3).n0 = null;
    }
}
