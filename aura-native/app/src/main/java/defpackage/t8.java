package defpackage;

import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.PlaylistRowBottomSheetDialog;
import java.util.HashMap;
import java.util.function.Function;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class t8 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(!((v8) obj2).u.contains((String) obj));
            case 1:
                return (gy0) obj2;
            case 2:
                PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog = (PlaylistRowBottomSheetDialog) obj2;
                Download download = new Download((Child) obj);
                download.setPlaylistId(playlistRowBottomSheetDialog.C0.getId());
                download.setPlaylistName(playlistRowBottomSheetDialog.C0.getName());
                return download;
            default:
                return (Double) ((HashMap) ((ss0) obj2).B()).get((ol1) obj);
        }
    }
}
