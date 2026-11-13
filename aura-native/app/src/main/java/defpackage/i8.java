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
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class i8 implements View.OnLongClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ i8(int i, Object obj, Object obj2) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.n;
        Object obj = this.p;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                AlbumPageFragment albumPageFragment = (AlbumPageFragment) obj2;
                ik ikVar = (ik) obj;
                if (ikVar != null) {
                    l93.t(albumPageFragment.Z(), ikVar);
                    Toast.makeText(albumPageFragment.Z(), albumPageFragment.t(R.string.asset_link_copied_toast, ikVar.d), 0).show();
                    break;
                }
                break;
            case 1:
                AlbumPageFragment albumPageFragment2 = (AlbumPageFragment) obj2;
                int year = ((AlbumID3) obj).getYear();
                ik h = year > 0 ? l93.h("year", String.valueOf(year)) : null;
                if (h != null) {
                    l93.t(albumPageFragment2.Z(), h);
                    Toast.makeText(albumPageFragment2.Z(), albumPageFragment2.t(R.string.asset_link_copied_toast, h.d), 0).show();
                    break;
                }
                break;
            case 2:
                mo1 mo1Var = (mo1) obj;
                ClickCallback clickCallback = ((q7) obj2).u;
                Bundle bundle = new Bundle();
                bundle.putParcelable("PLAYLIST_OBJECT", (Parcelable) mo1Var.x.t.get(mo1Var.c()));
                clickCallback.onPlaylistLongClick(bundle);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                PlayerControllerFragment playerControllerFragment = (PlayerControllerFragment) obj2;
                ik ikVar2 = (ik) obj;
                l93.t(playerControllerFragment.Z(), ikVar2);
                Toast.makeText(playerControllerFragment.Z(), playerControllerFragment.t(R.string.asset_link_copied_toast, ikVar2.d), 0).show();
                break;
            case 4:
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("TRACK_OBJECT", (Child) obj);
                ou3 ou3Var = new ou3();
                ou3Var.c0(bundle2);
                ou3Var.m0(((PlayerControllerFragment) obj2).X().k(), null);
                break;
            case 5:
                PlayerControllerFragment playerControllerFragment2 = (PlayerControllerFragment) obj2;
                CharSequence text = ((TextView) obj).getText();
                if (!TextUtils.isEmpty(text)) {
                    ((ClipboardManager) playerControllerFragment2.Z().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(playerControllerFragment2.s(R.string.app_name), text));
                    Toast.makeText(playerControllerFragment2.Z(), playerControllerFragment2.t(R.string.asset_link_copied_toast, text), 0).show();
                    break;
                }
                break;
            case 6:
                SongBottomSheetDialog songBottomSheetDialog = (SongBottomSheetDialog) obj2;
                ik ikVar3 = (ik) obj;
                l93.t(songBottomSheetDialog.Z(), ikVar3);
                Toast.makeText(songBottomSheetDialog.Z(), songBottomSheetDialog.t(R.string.asset_link_copied_toast, ikVar3.d), 0).show();
                break;
            default:
                uv4 uv4Var = (uv4) obj2;
                ik ikVar4 = (ik) obj;
                l93.t(uv4Var.Z(), ikVar4);
                Toast.makeText(uv4Var.Z(), uv4Var.t(R.string.asset_link_copied_toast, ikVar4.d), 0).show();
                break;
        }
        return true;
    }
}
