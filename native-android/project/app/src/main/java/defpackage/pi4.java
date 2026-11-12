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

    public /* synthetic */ pi4(SongListPageFragment r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r4) {
        int r0 = this.n;
        SongListPageFragment r3 = this.o;
        switch(r0) {
            case 0: goto L11;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        PopupMenu r1 = new PopupMenu(r3.Z(), r4);
        r1.getMenuInflater().inflate(R.menu.sort_song_popup_menu, r1.getMenu());
        r1.setOnMenuItemClickListener(new v7(9, r3));
        r1.show();
        return;
    L6:
        ArrayList r5 = new ArrayList(r3.p0.u);
        qo2 r2 = new qo2(r3, r5, v13.c(r3.n0.e), 15);
        if ("MEDIA_STARRED".equals(r3.n0.e) == false) goto L9;
        a.m(r3.m0, SmartContexts.LIKED, null, r5, r2);
        return;
    L9:
        r2.run();
        return;
    L11:
        r3.h0(r4);
        r3.m0.T.o();
    }
}
