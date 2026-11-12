package defpackage;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import app.homemusic.AURAWavePlaybackListener;
import com.eddyizm.tempus.homemusic.HubFragment;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wt extends ut {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wt(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    private final void d(View r1, float r2) {
    }

    private final void e(View r1, float r2) {
    }

    private final void f(View r1, float r2) {
    }

    private final void g(View r1, float r2) {
    }

    @Override // defpackage.ut
    public final void b(View r1, float r2) {
        switch(this.a) {
            case 0: goto L8;
            case 1: goto L8;
            case 2: goto L8;
            case 3: goto L8;
            default: goto L4;
        };
    L4:
        MainActivity r0 = (MainActivity) this.b;
        ((au) r0.V.n).a(r2);
        if (r0.X == true) goto L9;
        MainActivity.p(r0, r2);
        return;
    L9:
        return;
    }

    @Override // defpackage.ut
    public final void c(View r6, int r7) {
        int r8 = this.a;
        boolean r3 = false;
        Object r5 = this.b;
        switch(r8) {
            case 0: goto L50;
            case 1: goto L46;
            case 2: goto L44;
            case 3: goto L39;
            default: goto L4;
        };
    L4:
        MainActivity r9 = (MainActivity) r5;
        xi3 r10 = (xi3) r9.k().D("PlayerBottomSheet");
        if (r7 == 3) goto L35;
        if (r7 == 4) goto L12;
        if (r7 != 5) goto L64;
        u52.f();
        AURAWavePlaybackListener.resetWaveState();
        bl2 r11 = r9.P;
        WeakReference r12 = bo2.a;
        if (r11 == null) goto L53;
        r11.f(new jr1(r11, 2), gq0.n);
        return;
    L53:
        return;
    L64:
        return;
    L12:
        ((au) r9.V.n).a(0.0f);
        if (r9.X == true) goto L15;
        MainActivity.p(r9, 0.0f);
    L15:
        if (r10 != null) goto L17;
        return;
    L17:
        if (r10.n() != null) goto L19;
        return;
    L19:
        if (r10.y() == true) goto L21;
        return;
    L21:
        if (r10.T == null) goto L65;
        ((ViewPager2) ((om1) r10.o0.p).o).c(0, false);
        if (r10.n() != null) goto L26;
        return;
    L26:
        if (r10.y() == true) goto L28;
        return;
    L28:
        if (r10.T == null) goto L66;
        ck3 r13 = (ck3) ((ViewPager2) ((om1) r10.o0.p).o).getAdapter();
        if (r13 == null) goto L60;
        PlayerControllerFragment r14 = (PlayerControllerFragment) ((kc1) r13.z.get(0));
        if (r14 == null) goto L61;
        r14.o0.c(0, false);
        return;
    L61:
        return;
    L60:
        return;
    L66:
        return;
    L65:
        return;
    L35:
        ((au) r9.V.n).a(1.0f);
        if (r9.X == true) goto L63;
        MainActivity.p(r9, 1.0f);
        return;
    L63:
        return;
    L39:
        bd1 r15 = (bd1) r5;
        if (r7 != 3) goto L42;
        r3 = true;
    L42:
        r15.c(r3);
        return;
    L44:
        List r16 = HubFragment.y0;
        ((HubFragment) r5).n0();
        return;
    L46:
        if (r7 == 4) goto L48;
        if (r7 == 5) goto L48;
        return;
    L48:
        ((au) r5).a = false;
        return;
    L50:
        if (r7 != 5) goto L68;
        ((yt) r5).cancel();
        return;
    }
}
