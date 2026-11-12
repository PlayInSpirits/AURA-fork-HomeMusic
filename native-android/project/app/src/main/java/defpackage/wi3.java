package defpackage;

import android.view.View;
import android.widget.ImageButton;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.PlayQueue;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.SongBottomSheetDialog;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wi3 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ wi3(Object r1, Object r2, int r3, int r4) {
        this.n = r4;
        this.p = r1;
        this.q = r2;
        this.o = r3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r11) {
        int r12 = this.n;
        Object r0 = this.q;
        Object r1 = this.p;
        switch(r12) {
            case 0: goto L21;
            default: goto L4;
        };
    L4:
        SongBottomSheetDialog r2 = (SongBottomSheetDialog) r1;
        String r5 = (String) r0;
        Child r6 = r2.D0;
        MainActivity r3 = (MainActivity) r2.X();
        r2.h0();
        e75 r13 = r3.d();
        b75 r4 = gh0.r(r3);
        tf0 r7 = gh0.q(r3);
        r4.getClass();
        r7.getClass();
        bq4 r8 = new bq4(r13, r4, r7);
        i30 r14 = kx3.a(im3.class);
        String r9 = r14.b();
        if (r9 == null) goto L19;
        im3 r10 = (im3) r8.l(r14, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r9));
        int r15 = this.o;
        ew4 r16 = new ew4(r3, r10, r5, r6, r15, 5);
        k03 r17 = r10.j;
        List r18 = (List) r17.d();
        if (r10.f != null) goto L18;
        Playlist r19 = r10.e;
        if (r19 == null) goto L18;
        if (r19.getId().equals(r5) == false) goto L18;
        if (r18 == null) goto L18;
        if (r15 < 0) goto L18;
        if (r15 >= r18.size()) goto L18;
        r10.f = r5;
        int r110 = r10.h + 1;
        r10.h = r110;
        r10.i = r110;
        ArrayList r20 = new ArrayList(r18);
        Child r21 = (Child) r20.remove(r15);
        r17.k(r20);
        mm3 r111 = r10.c;
        hq1 r22 = new hq1(r10, r20, r5, r18, r15, r16, r21);
        r111.getClass();
        ArrayList r23 = new ArrayList();
        r23.add(Integer.valueOf(r15));
        new Thread(new t6(r111, r5, r23, r22, 27)).start();
        return;
    L18:
        r16.o();
        return;
    L19:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return;
    L21:
        xi3 r112 = (xi3) ((np0) r1).b;
        bo2.q(r112.q0, ((PlayQueue) r0).getEntries(), this.o, "queue");
        ((ImageButton) ((ae1) r112.o0.q).e).setVisibility(8);
    }
}
