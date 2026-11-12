package defpackage;

import com.eddyizm.tempus.ui.fragment.SongListPageFragment;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.SongBottomSheetDialog;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ei4 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc1 b;

    public /* synthetic */ ei4(int i, kc1 kc1Var) {
        this.a = i;
        this.b = kc1Var;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.a;
        kc1 kc1Var = this.b;
        switch (i) {
            case 0:
                return ((SongBottomSheetDialog) kc1Var).C0.h;
            default:
                return ((SongListPageFragment) kc1Var).q0;
        }
    }
}
