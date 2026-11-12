package defpackage;

import android.view.View;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.AlbumBottomSheetDialog;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a7 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ a7(Object r1, Object r2, Object r3, Object r4, int r5) {
        this.n = r5;
        this.o = r1;
        this.p = r2;
        this.q = r3;
        this.r = r4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r7) {
        int r8 = this.n;
        Object r0 = this.r;
        Object r1 = this.q;
        Object r2 = this.p;
        Object r6 = this.o;
        switch(r8) {
            case 0: goto L13;
            default: goto L4;
        };
    L4:
        cj3 r9 = (cj3) r6;
        qi3 r3 = (qi3) r2;
        sv4 r4 = (sv4) r1;
        lj3 r5 = (lj3) r0;
        if (r3.S0(29) == false) goto L19;
        r3.M(r3.E0().a().h(new yv4(r4, yw1.o(Integer.valueOf(r5.b)))).l(r5.a.b.c, false).b());
        String r10 = r5.c;
        switch(r9.s) {
            case 0: goto L10;
            default: goto L11;
        };
    L10:
        r9.t.z.r[1] = r10;
    L11:
        r9.r.E.dismiss();
        return;
    L19:
        return;
    L13:
        AlbumBottomSheetDialog r11 = (AlbumBottomSheetDialog) r6;
        ArrayList r12 = (ArrayList) r2;
        List r13 = (List) r1;
        List r14 = (List) r0;
        if (ud3.o() != null) goto L16;
        au0.w(r11.Z()).a(r12, r13, false);
    L17:
        r11.h0();
        return;
    L16:
        r14.forEach(new d7(0, r11));
        goto L17
    }
}
