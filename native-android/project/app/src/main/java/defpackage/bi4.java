package defpackage;

import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.SongBottomSheetDialog;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bi4 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ SongBottomSheetDialog o;

    public /* synthetic */ bi4(SongBottomSheetDialog r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        SongBottomSheetDialog r1 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r1.h0();
        return;
    L6:
        r1.q0();
    }
}
