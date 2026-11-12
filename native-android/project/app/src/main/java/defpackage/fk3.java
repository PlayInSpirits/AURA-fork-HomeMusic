package defpackage;

import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;
import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fk3 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ hk3 o;

    public /* synthetic */ fk3(hk3 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r7) {
        int r8 = this.n;
        xi3 r0 = null;
        hk3 r6 = this.o;
        switch(r8) {
            case 0: goto L25;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        r6.l0(true);
        return;
    L6:
        r6.l0(false);
        return;
    L8:
        kc1 r9 = r6.X().k().D("PlayerBottomSheet");
        if ((r9 instanceof xi3) == false) goto L11;
        r0 = (xi3) r9;
    L11:
        if (r0 != null) goto L13;
        return;
    L13:
        if (r0.n() != null) goto L15;
        return;
    L15:
        if (r0.y() == true) goto L17;
        return;
    L17:
        if (r0.T == null) goto L51;
        ck3 r10 = (ck3) ((ViewPager2) ((om1) r0.o0.p).o).getAdapter();
        if (r10 == null) goto L49;
        PlayerControllerFragment r11 = (PlayerControllerFragment) ((kc1) r10.z.get(0));
        if (r11 == null) goto L50;
        r11.o0.c(1, true);
        return;
    L50:
        return;
    L49:
        return;
    L51:
        return;
    L25:
        aj3 r12 = r6.m0;
        if (r12 == null) goto L44;
        vs3 r1 = r12.f;
        if (u52.c().a == false) goto L35;
        v52 r13 = u52.c();
        String r2 = r13.x;
        if (u52.k() == true) goto L32;
        return;
    L32:
        if (r2.isEmpty() == true) goto L54;
        List r3 = (List) u52.l().stream().map(new m7(17)).collect(Collectors.toList());
        long r4 = r13.b(SystemClock.elapsedRealtime());
        r1.getClass();
        vs3.d(r3, r2, r4);
    L42:
        View r14 = r6.a0();
        int[] r15 = qg4.E;
        qg4.h(r14, r14.getResources().getText(R.string.player_queue_save_queue_success), 0).j();
        return;
    L54:
        return;
    L35:
        Child r16 = (Child) r12.n.d();
        List r5 = (List) r1.b().stream().map(new m7(17)).collect(Collectors.toList());
        if (r16 == null) goto L53;
        String r17 = r16.getId();
        r17.getClass();
        sp3 r18 = (sp3) ud3.A().get(r17);
        if (r18 == null) goto L40;
        long r19 = r18.b;
    L41:
        Log.d("PlayerBottomSheetViewModel", "Saving play queue - Current: " + r16.getId() + ", Items: " + r5.size() + ", Position: " + r19);
        vs3.d(r5, r16.getId(), r19);
        goto L42
    L40:
        r19 = 0;
        goto L41
    L53:
        return;
    L44:
        h12.Q("playerBottomSheetViewModel");
        throw null;
    }
}
