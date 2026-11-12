package defpackage;

import android.view.View;
import android.widget.PopupMenu;
import app.homemusic.R;
import com.eddyizm.tempus.ui.fragment.DownloadFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ws0 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ DownloadFragment o;

    public /* synthetic */ ws0(DownloadFragment r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r4) {
        int r0 = this.n;
        DownloadFragment r3 = this.o;
        switch(r0) {
            case 0: goto L14;
            case 1: goto L12;
            case 2: goto L10;
            default: goto L4;
        };
    L4:
        List r5 = r3.p0.v;
        if (r5 != null) goto L7;
        return;
    L7:
        if (r5.isEmpty() == true) goto L17;
        Collections.shuffle(r5);
        bo2.o(r3.q0, r5, 0);
        ((au) r3.m0.V.n).d(true);
        return;
    L17:
        return;
    L10:
        bu0 r6 = r3.o0;
        r6.getClass();
        new Thread(new a0(25, r6)).start();
        return;
    L12:
        k03 r7 = r3.o0.e;
        ArrayList r8 = (ArrayList) r7.d();
        r8.remove(r8.size() - 1);
        r7.k(r8);
        return;
    L14:
        PopupMenu r1 = new PopupMenu(r3.Z(), r4);
        r1.getMenuInflater().inflate(R.menu.download_popup_menu, r1.getMenu());
        r1.setOnMenuItemClickListener(new v7(4, r3));
        r1.show();
    }
}
