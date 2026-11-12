package defpackage;

import android.content.Context;
import android.widget.TextView;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.AlbumPageFragment;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.AlbumBottomSheetDialog;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d7 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d7(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object r4) {
        int r0 = this.a;
        Object r3 = this.b;
        switch(r0) {
            case 0: goto L24;
            case 1: goto L22;
            case 2: goto L20;
            case 3: goto L18;
            case 4: goto L12;
            case 5: goto L10;
            default: goto L4;
        };
    L4:
        uv4 r5 = (uv4) r3;
        String r6 = (String) r4;
        vp0 r1 = r5.B0;
        if (r1 == null) goto L26;
        if (r6 == null) goto L27;
        r1.n.setText(r6);
        r5.B0.m.setVisibility(0);
        return;
    L27:
        return;
    L26:
        return;
    L10:
        PlayerControllerFragment r7 = (PlayerControllerFragment) r3;
        aj3 r2 = r7.L0;
        Context r8 = r7.Z();
        r2.h(r8, (Child) r4);
        return;
    L12:
        TextView r9 = (TextView) r3;
        List r10 = (List) r4;
        r10.getClass();
        int r11 = r10.size();
        if (r11 != 0) goto L15;
        String r12 = r9.getResources().getString(R.string.homemusic_liked_songs_hint);
    L16:
        r9.setText(r12);
        return;
    L15:
        r12 = r9.getResources().getQuantityString(R.plurals.homemusic_tracks_count, r11, new Object[]{Integer.valueOf(r11)});
        goto L16
    L18:
        Context r13 = ((qq0) r3).n.Z();
        i51.a(r13, (Child) r4);
        return;
    L20:
        ((k03) r3).k((List) r4);
        return;
    L22:
        Context r14 = ((AlbumPageFragment) r3).Z();
        i51.a(r14, (Child) r4);
        return;
    L24:
        Context r15 = ((AlbumBottomSheetDialog) r3).Z();
        i51.a(r15, (Child) r4);
    }
}
