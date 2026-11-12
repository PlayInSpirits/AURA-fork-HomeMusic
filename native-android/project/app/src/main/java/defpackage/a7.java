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

    public /* synthetic */ a7(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
        this.r = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.n;
        Object obj = this.r;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.o;
        switch (i) {
            case 0:
                AlbumBottomSheetDialog albumBottomSheetDialog = (AlbumBottomSheetDialog) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                List list = (List) obj2;
                List list2 = (List) obj;
                if (ud3.o() == null) {
                    au0.w(albumBottomSheetDialog.Z()).a(arrayList, list, false);
                } else {
                    list2.forEach(new d7(0, albumBottomSheetDialog));
                }
                albumBottomSheetDialog.h0();
                break;
            default:
                cj3 cj3Var = (cj3) obj4;
                qi3 qi3Var = (qi3) obj3;
                sv4 sv4Var = (sv4) obj2;
                lj3 lj3Var = (lj3) obj;
                if (qi3Var.S0(29)) {
                    qi3Var.M(qi3Var.E0().a().h(new yv4(sv4Var, yw1.o(Integer.valueOf(lj3Var.b)))).l(lj3Var.a.b.c, false).b());
                    String str = lj3Var.c;
                    switch (cj3Var.s) {
                        case 0:
                            cj3Var.t.z.r[1] = str;
                            break;
                    }
                    cj3Var.r.E.dismiss();
                    break;
                }
                break;
        }
    }
}
