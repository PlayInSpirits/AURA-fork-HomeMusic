package defpackage;

import android.content.Context;
import android.view.View;
import com.eddyizm.tempus.homemusic.SmartContexts;
import com.eddyizm.tempus.homemusic.SmartSession;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.SongBottomSheetDialog;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class et1 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ et1(Object r1, Object r2, Object r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r8) {
        int r9 = this.n;
        final int r0 = 1;
        Object r2 = this.q;
        Object r3 = this.p;
        Object r7 = this.o;
        final int r4 = 0;
        switch(r9) {
            case 0: goto L16;
            case 1: goto L10;
            case 2: goto L8;
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        zk4 r10 = (zk4) r7;
        final Context r5 = (Context) r3;
        final f9 r6 = (f9) r2;
        dl4 r11 = (dl4) r10.C0;
        nc1 r1 = r10.X();
        r11.c.getClass();
        k03 r12 = xi4.s(-1, false, false);
        k03 r13 = r11.d;
        Objects.requireNonNull(r13);
        r12.e(r1, new g7(r13, 0));
        final int r14 = 2;
        r13.e(r10.X(), new yk4(r5, r6, r14));
        return;
    L6:
        zk4 r15 = (zk4) r7;
        final Context r16 = (Context) r3;
        final f9 r17 = (f9) r2;
        cl4 r18 = (cl4) r15.C0;
        r18.c.y(-1, false).e(r15.X(), new d8(26, r18));
        r18.d.e(r15, new yk4(r16, r17, r0));
        return;
    L8:
        zk4 r19 = (zk4) r7;
        final Context r20 = (Context) r3;
        final f9 r21 = (f9) r2;
        bl4 r22 = (bl4) r19.C0;
        nc1 r23 = r19.X();
        r22.c.getClass();
        rv2.o(-1, false).e(r23, new d8(25, r22));
        r22.d.e(r19, new yk4(r20, r21, r4));
        return;
    L10:
        SongBottomSheetDialog r24 = (SongBottomSheetDialog) r7;
        String r25 = (String) r3;
        String r26 = (String) r2;
        if (ud3.o() != null) goto L13;
        Download r27 = new Download(r24.D0);
        r27.setPlaylistId(r25);
        r27.setPlaylistName(r26);
        au0.w(r24.Z()).b(gi1.G(r24.D0), r27, false);
    L14:
        r24.h0();
        return;
    L13:
        i51.b(r24.Z(), r24.D0, r25, r26, false);
        goto L14
    L16:
        d7 r28 = (d7) r3;
        View r29 = (View) r2;
        Child r30 = (Child) ((ad2) r7).d();
        if (r30 == null) goto L40;
        SmartSession r31 = a.b;
        if (r31 == null) goto L22;
        String r32 = r31.getContext();
    L24:
        if (h12.c(r32, SmartContexts.LIKED) == false) goto L32;
        String r33 = r30.getId();
        if (r30.getStarred() == null) goto L28;
        boolean r34 = true;
    L30:
        if (n61.f(1, r33, r34) == true) goto L32;
        r28.accept(r30);
        goto L32
    L28:
        r34 = false;
    L32:
        Context r35 = r29.getContext();
        r35.getClass();
        String r36 = r30.getId();
        r36.getClass();
        SmartSession r37 = a.b;
        if (r37 != null) goto L36;
        return;
    L36:
        if (r37.isRec(r36) == false) goto L42;
        io1.a.execute(new ct1(r37, r36, r35.getApplicationContext(), r4));
        return;
    L42:
        return;
    L22:
        r32 = null;
        goto L24
    }
}
