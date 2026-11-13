package defpackage;

import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.SongBottomSheetDialog;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class bi4 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ SongBottomSheetDialog o;

    public /* synthetic */ bi4(SongBottomSheetDialog songBottomSheetDialog, int i) {
        this.n = i;
        this.o = songBottomSheetDialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        SongBottomSheetDialog songBottomSheetDialog = this.o;
        switch (i) {
            case 0:
                songBottomSheetDialog.q0();
                break;
            default:
                songBottomSheetDialog.h0();
                break;
        }
    }
}
