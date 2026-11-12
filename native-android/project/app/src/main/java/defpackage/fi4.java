package defpackage;

import android.view.View;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.SongBottomSheetDialog;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fi4 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ SongBottomSheetDialog o;
    public final /* synthetic */ ik p;

    public /* synthetic */ fi4(SongBottomSheetDialog r1, ik r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r4) {
        int r5 = this.n;
        ik r1 = this.p;
        SongBottomSheetDialog r3 = this.o;
        switch(r5) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((MainActivity) r3.X()).F(r1, true);
        return;
    L6:
        ((MainActivity) r3.X()).F(r1, !"song".equals(r1.c));
    }
}
