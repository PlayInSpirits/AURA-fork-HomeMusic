package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Share;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.AlbumBottomSheetDialog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b7 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AlbumBottomSheetDialog b;

    public /* synthetic */ b7(AlbumBottomSheetDialog r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.a83
    public final void b(Object r5) {
        int r0 = this.a;
        AlbumBottomSheetDialog r4 = this.b;
        switch(r0) {
            case 0: goto L27;
            case 1: goto L22;
            case 2: goto L20;
            case 3: goto L18;
            case 4: goto L12;
            case 5: goto L10;
            default: goto L4;
        };
    L4:
        List r6 = (List) r5;
        if (r6 != null) goto L8;
        r6 = Collections.EMPTY_LIST;
    L8:
        r4.F0 = r6;
        r4.G0 = gi1.H(r6);
        r4.E0.setOnClickListener(new y6(r4, 2));
        r4.o0();
        return;
    L10:
        bl2 r1 = r4.I0;
        bo2.e(r1, (List) r5, false);
        ((au) ((MainActivity) r4.X()).V.n).d(true);
        r4.h0();
        return;
    L12:
        ArtistID3 r7 = (ArtistID3) r5;
        if (r7 == null) goto L15;
        Bundle r2 = new Bundle();
        r2.putParcelable("ARTIST_OBJECT", r7);
        q05.l(r4).m(R.id.artistPageFragment, r2, null);
    L16:
        r4.h0();
        return;
    L15:
        Toast.makeText(r4.Z(), r4.s(R.string.album_error_retrieving_artist), 0).show();
        goto L16
    L18:
        List r8 = (List) r5;
        Collections.shuffle(r8);
        bo2.q(r4.I0, r8, 0, "album");
        ((au) ((MainActivity) r4.X()).V.n).d(true);
        r4.h0();
        return;
    L20:
        Bundle r3 = new Bundle();
        r3.putParcelableArrayList("TRACKS_OBJECT", new ArrayList((List) r5));
        fl3 r9 = new fl3();
        r9.c0(r3);
        r9.m0(r4.X().k(), null);
        r4.h0();
        return;
    L22:
        Share r10 = (Share) r5;
        if (r10 == null) goto L25;
        ((ClipboardManager) r4.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(r4.s(R.string.app_name), r10.getUrl()));
        r4.B0.g(r4.X());
        r4.h0();
        return;
    L25:
        Toast.makeText(r4.Z(), r4.s(R.string.share_unsupported_error), 0).show();
        r4.h0();
        return;
    L27:
        bl2 r11 = r4.I0;
        bo2.e(r11, (List) r5, true);
        ((au) ((MainActivity) r4.X()).V.n).d(true);
        r4.h0();
    }
}
