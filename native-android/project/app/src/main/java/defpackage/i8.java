package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.AlbumPageFragment;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.SongBottomSheetDialog;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i8 implements View.OnLongClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ i8(int r1, Object r2, Object r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View r6) {
        int r7 = this.n;
        ik r0 = null;
        Object r4 = this.p;
        Object r5 = this.o;
        switch(r7) {
            case 0: goto L25;
            case 1: goto L18;
            case 2: goto L16;
            case 3: goto L14;
            case 4: goto L12;
            case 5: goto L8;
            case 6: goto L6;
            default: goto L4;
        };
    L4:
        uv4 r8 = (uv4) r5;
        ik r9 = (ik) r4;
        l93.t(r8.Z(), r9);
        Toast.makeText(r8.Z(), r8.t(R.string.asset_link_copied_toast, new Object[]{r9.d}), 0).show();
        return true;
    L6:
        SongBottomSheetDialog r10 = (SongBottomSheetDialog) r5;
        ik r11 = (ik) r4;
        l93.t(r10.Z(), r11);
        Toast.makeText(r10.Z(), r10.t(R.string.asset_link_copied_toast, new Object[]{r11.d}), 0).show();
        return true;
    L8:
        PlayerControllerFragment r12 = (PlayerControllerFragment) r5;
        CharSequence r13 = ((TextView) r4).getText();
        if (TextUtils.isEmpty(r13) == true) goto L11;
        ((ClipboardManager) r12.Z().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(r12.s(R.string.app_name), r13));
        Toast.makeText(r12.Z(), r12.t(R.string.asset_link_copied_toast, new Object[]{r13}), 0).show();
    L11:
        return true;
    L12:
        Bundle r14 = new Bundle();
        r14.putParcelable("TRACK_OBJECT", (Child) r4);
        ou3 r1 = new ou3();
        r1.c0(r14);
        r1.m0(((PlayerControllerFragment) r5).X().k(), null);
        return true;
    L14:
        PlayerControllerFragment r15 = (PlayerControllerFragment) r5;
        ik r16 = (ik) r4;
        l93.t(r15.Z(), r16);
        Toast.makeText(r15.Z(), r15.t(R.string.asset_link_copied_toast, new Object[]{r16.d}), 0).show();
        return true;
    L16:
        mo1 r17 = (mo1) r4;
        ClickCallback r18 = ((q7) r5).u;
        Bundle r19 = new Bundle();
        r19.putParcelable("PLAYLIST_OBJECT", (Parcelable) r17.x.t.get(r17.c()));
        r18.onPlaylistLongClick(r19);
        return true;
    L18:
        AlbumPageFragment r20 = (AlbumPageFragment) r5;
        int r21 = ((AlbumID3) r4).getYear();
        if (r21 <= 0) goto L22;
        r0 = l93.h("year", String.valueOf(r21));
    L22:
        if (r0 == null) goto L24;
        l93.t(r20.Z(), r0);
        Toast.makeText(r20.Z(), r20.t(R.string.asset_link_copied_toast, new Object[]{r0.d}), 0).show();
    L24:
        return true;
    L25:
        AlbumPageFragment r22 = (AlbumPageFragment) r5;
        ik r23 = (ik) r4;
        if (r23 == null) goto L29;
        l93.t(r22.Z(), r23);
        Toast.makeText(r22.Z(), r22.t(R.string.asset_link_copied_toast, new Object[]{r23.d}), 0).show();
        return true;
    L29:
        return false;
    }
}
