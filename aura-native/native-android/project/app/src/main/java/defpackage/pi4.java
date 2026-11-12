package defpackage;

import android.view.View;
import android.widget.PopupMenu;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.SmartContexts;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.ui.fragment.SongListPageFragment;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pi4 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ SongListPageFragment o;

    public /* synthetic */ pi4(SongListPageFragment songListPageFragment, int i) {
        this.n = i;
        this.o = songListPageFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.n;
        SongListPageFragment songListPageFragment = this.o;
        switch (i) {
            case 0:
                songListPageFragment.h0(view);
                songListPageFragment.m0.T.o();
                break;
            case 1:
                ArrayList arrayList = new ArrayList(songListPageFragment.p0.u);
                qo2 qo2Var = new qo2(songListPageFragment, arrayList, v13.c(songListPageFragment.n0.e), 15);
                if (!"MEDIA_STARRED".equals(songListPageFragment.n0.e)) {
                    qo2Var.run();
                } else {
                    a.m(songListPageFragment.m0, SmartContexts.LIKED, null, arrayList, qo2Var);
                }
                break;
            default:
                PopupMenu popupMenu = new PopupMenu(songListPageFragment.Z(), view);
                popupMenu.getMenuInflater().inflate(R.menu.sort_song_popup_menu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new v7(9, songListPageFragment));
                popupMenu.show();
                break;
        }
    }
}
