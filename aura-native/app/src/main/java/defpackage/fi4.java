package defpackage;

import android.view.View;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.SongBottomSheetDialog;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class fi4 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ SongBottomSheetDialog o;
    public final /* synthetic */ ik p;

    public /* synthetic */ fi4(SongBottomSheetDialog songBottomSheetDialog, ik ikVar, int i) {
        this.n = i;
        this.o = songBottomSheetDialog;
        this.p = ikVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.n;
        ik ikVar = this.p;
        SongBottomSheetDialog songBottomSheetDialog = this.o;
        switch (i) {
            case 0:
                ((MainActivity) songBottomSheetDialog.X()).F(ikVar, !"song".equals(ikVar.c));
                break;
            default:
                ((MainActivity) songBottomSheetDialog.X()).F(ikVar, true);
                break;
        }
    }
}
