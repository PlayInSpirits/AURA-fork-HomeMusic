package defpackage;

import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.PlaylistRowBottomSheetDialog;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xd0 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xd0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        long j;
        int i = this.a;
        int i2 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                yd0 yd0Var = (yd0) obj3;
                sp3 sp3Var = (sp3) obj2;
                List list = (List) obj;
                if (list == null || list.isEmpty()) {
                    yd0Var.s(sp3Var);
                } else {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        if (sp3Var.a.equals(((Child) list.get(i3)).getId())) {
                            j = sp3Var.b;
                            ((Child) list.get(i3)).setType(sp3Var.h);
                            i2 = i3;
                            bo2.p((bl2) yd0Var.v.s, list, i2, j);
                        }
                        break;
                    }
                    j = 0;
                    bo2.p((bl2) yd0Var.v.s, list, i2, j);
                }
                break;
            case 1:
                ((BiConsumer) obj3).accept((MainActivity) obj2, (List) obj);
                break;
            default:
                PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog = (PlaylistRowBottomSheetDialog) obj3;
                i51.b((MainActivity) obj2, (Child) obj, playlistRowBottomSheetDialog.C0.getId(), playlistRowBottomSheetDialog.C0.getName(), false);
                break;
        }
    }
}
