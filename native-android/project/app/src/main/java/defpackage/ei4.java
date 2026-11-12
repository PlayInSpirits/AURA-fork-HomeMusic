package defpackage;

import com.eddyizm.tempus.ui.fragment.SongListPageFragment;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.SongBottomSheetDialog;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ei4 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc1 b;

    public /* synthetic */ ei4(int r1, kc1 r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int r0 = this.a;
        kc1 r1 = this.b;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((SongListPageFragment) r1).q0;
    L7:
        return ((SongBottomSheetDialog) r1).C0.h;
    }
}
