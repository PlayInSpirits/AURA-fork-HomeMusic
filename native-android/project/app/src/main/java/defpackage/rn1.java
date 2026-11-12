package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.HubAppRelease;
import com.eddyizm.tempus.homemusic.HubUpdatePatch;
import com.eddyizm.tempus.homemusic.HubUpdater;
import com.eddyizm.tempus.lan.LanReceiverService;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.LibraryFragment;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rn1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ rn1(Object r1, Object r2, Object r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface r7, int r8) {
        int r1 = 0;
        FrameLayout r2 = null;
        switch(this.n) {
            case 0: goto L26;
            case 1: goto L12;
            case 2: goto L10;
            default: goto L4;
        };
    L4:
        SharedPreferences r9 = (SharedPreferences) this.o;
        h62 r10 = (h62) this.p;
        String r6 = (String) this.q;
        SharedPreferences.Editor r11 = r9.edit();
        boolean r0 = LanReceiverService.y;
        Context r3 = r10.t0;
        if (r3 == null) goto L8;
        r11.putStringSet("trusted", kb4.K(kb4.a0(r3), r6)).remove("peer-" + r6).apply();
        r10.o0();
        return;
    L8:
        h12.Q("app");
        throw null;
    L10:
        HubUpdater.c((Activity) this.o, (HubAppRelease) this.p, (HubUpdatePatch) this.q, r7, r8);
        return;
    L12:
        Context r12 = (Context) this.o;
        ArrayList r13 = (ArrayList) this.p;
        rm3 r14 = (rm3) this.q;
        r12.getClass();
        if (r13.isEmpty() == false) goto L16;
    L24:
        r14.z();
        return;
    L16:
        if (ud3.o() != null) goto L21;
        eu0 r15 = au0.w(r12);
        ArrayList r4 = gi1.H(r13);
        ArrayList r5 = new ArrayList(r40.k0(r13, 10));
        int r16 = r13.size();
    L18:
        if (r1 >= r16) goto L20;
        Object r17 = r13.get(r1);
        r1 = r1 + 1;
        r5.add(new Download((Child) r17));
        goto L18
    L20:
        r15.f(r4, r5);
        goto L24
    L21:
        int r18 = r13.size();
    L22:
        if (r1 >= r18) goto L24;
        Object r19 = r13.get(r1);
        r1 = r1 + 1;
        g51.b((Child) r19);
        goto L22
    L26:
        l92 r20 = (l92) this.o;
        LibraryFragment r21 = (LibraryFragment) this.p;
        l92 r22 = (l92) this.q;
        App.b().getClass();
        App.c().edit().putBoolean("music_directory_section_visibility", false).apply();
        r20.run();
        View r23 = r21.T;
        if (r23 == null) goto L40;
        nc1 r24 = r21.l();
        if ((r24 instanceof MainActivity) == false) goto L32;
        MainActivity r25 = (MainActivity) r24;
    L33:
        int[] r26 = qg4.E;
        qg4 r27 = qg4.h(r23, r23.getResources().getText(R.string.homemusic_folders_hidden), 0);
        if (r25 == null) goto L36;
        r2 = r25.u();
    L36:
        r27.e(r2);
        r27.i(R.string.homemusic_undo, new p6(17, r22));
        r27.j();
        return;
    L32:
        r25 = null;
        goto L33
    }
}
