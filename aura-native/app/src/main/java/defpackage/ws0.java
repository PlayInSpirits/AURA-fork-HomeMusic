package defpackage;

import android.view.View;
import android.widget.PopupMenu;
import app.homemusic.R;
import com.eddyizm.tempus.ui.fragment.DownloadFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class ws0 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ DownloadFragment o;

    public /* synthetic */ ws0(DownloadFragment downloadFragment, int i) {
        this.n = i;
        this.o = downloadFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.n;
        DownloadFragment downloadFragment = this.o;
        switch (i) {
            case 0:
                PopupMenu popupMenu = new PopupMenu(downloadFragment.Z(), view);
                popupMenu.getMenuInflater().inflate(R.menu.download_popup_menu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new v7(4, downloadFragment));
                popupMenu.show();
                break;
            case 1:
                k03 k03Var = downloadFragment.o0.e;
                ArrayList arrayList = (ArrayList) k03Var.d();
                arrayList.remove(arrayList.size() - 1);
                k03Var.k(arrayList);
                break;
            case 2:
                bu0 bu0Var = downloadFragment.o0;
                bu0Var.getClass();
                new Thread(new a0(25, bu0Var)).start();
                break;
            default:
                List list = downloadFragment.p0.v;
                if (list != null && !list.isEmpty()) {
                    Collections.shuffle(list);
                    bo2.o(downloadFragment.q0, list, 0);
                    ((au) downloadFragment.m0.V.n).d(true);
                    break;
                }
                break;
        }
    }
}
