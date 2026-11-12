package defpackage;

import android.widget.TextView;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.AlbumPageFragment;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.AlbumBottomSheetDialog;
import java.util.List;
import java.util.function.Consumer;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d7 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                i51.a(((AlbumBottomSheetDialog) obj2).Z(), (Child) obj);
                break;
            case 1:
                i51.a(((AlbumPageFragment) obj2).Z(), (Child) obj);
                break;
            case 2:
                ((k03) obj2).k((List) obj);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                i51.a(((qq0) obj2).n.Z(), (Child) obj);
                break;
            case 4:
                TextView textView = (TextView) obj2;
                List list = (List) obj;
                list.getClass();
                int size = list.size();
                textView.setText(size == 0 ? textView.getResources().getString(R.string.homemusic_liked_songs_hint) : textView.getResources().getQuantityString(R.plurals.homemusic_tracks_count, size, Integer.valueOf(size)));
                break;
            case 5:
                PlayerControllerFragment playerControllerFragment = (PlayerControllerFragment) obj2;
                playerControllerFragment.L0.h(playerControllerFragment.Z(), (Child) obj);
                break;
            default:
                uv4 uv4Var = (uv4) obj2;
                String str = (String) obj;
                vp0 vp0Var = uv4Var.B0;
                if (vp0Var != null && str != null) {
                    vp0Var.n.setText(str);
                    uv4Var.B0.m.setVisibility(0);
                    break;
                }
                break;
        }
    }
}
