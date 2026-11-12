package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.DownloadFragment;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class et0 extends cx3 {
    public final lv4 u;
    public final /* synthetic */ ft0 v;

    public et0(ft0 r4, lv4 r5) {
        this.v = r4;
        ConstraintLayout r6 = (ConstraintLayout) r5.n;
        super(r6);
        this.u = r5;
        final int r1 = 1;
        ((TextView) r5.s).setSelected(true);
        ((TextView) r5.r).setSelected(true);
        final int r2 = 0;
        r6.setOnClickListener(new dt0(this, r2));
        r6.setOnLongClickListener(new q6(9, this));
        ((FrameLayout) r5.q).setOnClickListener(new dt0(this, r1));
    }

    public final boolean s() {
        ArrayList r0 = new ArrayList();
        Bundle r1 = new Bundle();
        ft0 r2 = this.v;
        DownloadFragment r3 = r2.q;
        if ("download_type_track".equals(r2.r) == false) goto L6;
        r1.putParcelable("TRACK_OBJECT", (Parcelable) r2.w.get(c()));
        r3.onMediaLongClick(r1);
        return true;
    L6:
        String r4 = r2.r;
        r4.getClass();
        byte r14 = -1;
        switch(r4.hashCode()) {
            case -2125974859: goto L30;
            case -940056789: goto L26;
            case 155496896: goto L22;
            case 901055809: goto L18;
            case 906399829: goto L14;
            case 918779933: goto L10;
            default: goto L33;
        };
    L33:
        switch(r14) {
            case 0: goto L42;
            case 1: goto L41;
            case 2: goto L39;
            case 3: goto L37;
            case 4: goto L36;
            case 5: goto L35;
            default: goto L44;
        };
    L35:
        r0.add((Child) r2.w.get(c()));
        goto L44
    L36:
        r0.addAll(ft0.q("download_type_genre", ((Child) r2.w.get(c())).getGenre(), r2.u));
        goto L44
    L37:
        r0.addAll(ft0.q("download_type_album", ((Child) r2.w.get(c())).getAlbumId(), r2.u));
        goto L44
    L41:
        r0.addAll(ft0.q("download_type_year", ((Child) r2.w.get(c())).getYear().toString(), r2.u));
        goto L44
    L42:
        r0.addAll(ft0.q("download_type_artist", ((Child) r2.w.get(c())).getArtistId(), r2.u));
        goto L44
    L39:
        if ((r2.w.get(c()) instanceof Download) == false) goto L44;
        r0.addAll(ft0.q("download_type_playlist", ((Download) r2.w.get(c())).getPlaylistId(), r2.u));
    L44:
        if (r0.isEmpty() == false) goto L46;
        return false;
    L46:
        r1.putParcelableArrayList("download_group", new ArrayList(r0));
        lv4 r15 = this.u;
        r1.putString("download_group_title", ((TextView) r15.s).getText().toString());
        r1.putString("download_group_subtitle", ((TextView) r15.r).getText().toString());
        r3.onDownloadGroupLongClick(r1);
        return true;
    L10:
        if (r4.equals("download_type_track") == false) goto L33;
        r14 = 5;
        goto L33
    L14:
        if (r4.equals("download_type_genre") == false) goto L33;
        r14 = 4;
        goto L33
    L18:
        if (r4.equals("download_type_album") == false) goto L33;
        r14 = 3;
        goto L33
    L22:
        if (r4.equals("download_type_playlist") == false) goto L33;
        r14 = 2;
        goto L33
    L26:
        if (r4.equals("download_type_year") == false) goto L33;
        r14 = 1;
        goto L33
    L30:
        if (r4.equals("download_type_artist") == false) goto L33;
        r14 = 0;
        goto L33
    }
}
