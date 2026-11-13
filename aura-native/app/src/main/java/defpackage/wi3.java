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

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class wi3 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ wi3(Object obj, Object obj2, int i, int i2) {
        this.n = i2;
        this.p = obj;
        this.q = obj2;
        this.o = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Playlist playlist;
        int i = this.n;
        Object obj = this.q;
        Object obj2 = this.p;
        switch (i) {
            case 0:
                xi3 xi3Var = (xi3) ((np0) obj2).b;
                bo2.q(xi3Var.q0, ((PlayQueue) obj).getEntries(), this.o, "queue");
                ((ImageButton) ((ae1) xi3Var.o0.q).e).setVisibility(8);
                break;
            default:
                SongBottomSheetDialog songBottomSheetDialog = (SongBottomSheetDialog) obj2;
                String str = (String) obj;
                Child child = songBottomSheetDialog.D0;
                MainActivity mainActivity = (MainActivity) songBottomSheetDialog.X();
                songBottomSheetDialog.h0();
                e75 d = mainActivity.d();
                b75 r = gh0.r(mainActivity);
                tf0 q = gh0.q(mainActivity);
                r.getClass();
                q.getClass();
                bq4 bq4Var = new bq4(d, r, q);
                i30 a = kx3.a(im3.class);
                String b = a.b();
                if (b == null) {
                    kf2.n("Local and anonymous classes can not be ViewModels");
                    break;
                } else {
                    im3 im3Var = (im3) bq4Var.l(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
                    int i2 = this.o;
                    ew4 ew4Var = new ew4(mainActivity, im3Var, str, child, i2, 5);
                    k03 k03Var = im3Var.j;
                    List list = (List) k03Var.d();
                    if (im3Var.f == null && (playlist = im3Var.e) != null && playlist.getId().equals(str) && list != null && i2 >= 0 && i2 < list.size()) {
                        im3Var.f = str;
                        int i3 = im3Var.h + 1;
                        im3Var.h = i3;
                        im3Var.i = i3;
                        ArrayList arrayList = new ArrayList(list);
                        Child child2 = (Child) arrayList.remove(i2);
                        k03Var.k(arrayList);
                        mm3 mm3Var = im3Var.c;
                        hq1 hq1Var = new hq1(im3Var, arrayList, str, list, i2, ew4Var, child2);
                        mm3Var.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(i2));
                        new Thread(new t6(mm3Var, str, arrayList2, hq1Var, 27)).start();
                        break;
                    } else {
                        ew4Var.o();
                        break;
                    }
                }
        }
    }
}
