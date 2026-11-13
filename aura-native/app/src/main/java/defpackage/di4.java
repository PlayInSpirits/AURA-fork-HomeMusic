/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Share;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.SongBottomSheetDialog;
import defpackage.a83;
import defpackage.au;
import defpackage.q05;

public final class di4
implements a83 {
    public final int a;
    public final SongBottomSheetDialog b;

    public di4(SongBottomSheetDialog songBottomSheetDialog, int n16) {
        this.a = n16;
        this.b = songBottomSheetDialog;
    }

    @Override
    public final void b(Object object) {
        int n16 = this.a;
        SongBottomSheetDialog songBottomSheetDialog = this.b;
        switch (n16) {
            default: {
                object = (ArtistID3)object;
                if (object != null) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("ARTIST_OBJECT", (Parcelable)object);
                    if (songBottomSheetDialog.E0) {
                        ((au)((MainActivity)songBottomSheetDialog.X()).V.n).d(true);
                    }
                    q05.l(songBottomSheetDialog).m(2131362018, bundle, null);
                } else {
                    Toast.makeText(songBottomSheetDialog.Z(), songBottomSheetDialog.s(2131952955), 0).show();
                }
                songBottomSheetDialog.h0();
                return;
            }
            case 1: {
                object = (AlbumID3)object;
                if (object != null) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("ALBUM_OBJECT", (Parcelable)object);
                    if (songBottomSheetDialog.E0) {
                        ((au)((MainActivity)songBottomSheetDialog.X()).V.n).d(true);
                    }
                    q05.l(songBottomSheetDialog).m(2131361951, bundle, null);
                } else {
                    Toast.makeText(songBottomSheetDialog.Z(), songBottomSheetDialog.s(2131952954), 0).show();
                }
                songBottomSheetDialog.h0();
                return;
            }
            case 0: 
        }
        object = (Share)object;
        if (object != null) {
            ((ClipboardManager)((Context)songBottomSheetDialog.X()).getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog.s(2131951702), ((Share)object).getUrl()));
            songBottomSheetDialog.B0.g(songBottomSheetDialog.X());
            songBottomSheetDialog.h0();
        } else {
            Toast.makeText(songBottomSheetDialog.Z(), songBottomSheetDialog.s(2131952934), 0).show();
            songBottomSheetDialog.h0();
        }
    }
}

