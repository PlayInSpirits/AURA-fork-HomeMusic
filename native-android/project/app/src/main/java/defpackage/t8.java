package defpackage;

import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.PlaylistRowBottomSheetDialog;
import java.util.HashMap;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t8 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t8(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object r2) {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L11;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        PlaylistRowBottomSheetDialog r3 = (PlaylistRowBottomSheetDialog) r1;
        Download r4 = new Download((Child) r2);
        r4.setPlaylistId(r3.C0.getId());
        r4.setPlaylistName(r3.C0.getName());
        return r4;
    L8:
        d64 r5 = (d64) r2;
        return (gy0) r1;
    L5:
        return (Double) ((HashMap) ((ss0) r1).B()).get((ol1) r2);
    L11:
        return Boolean.valueOf(!((v8) r1).u.contains((String) r2));
    }
}
