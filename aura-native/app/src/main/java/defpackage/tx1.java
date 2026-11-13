package defpackage;

import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.IndexFragment;
import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class tx1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ IndexFragment o;
    public final /* synthetic */ ArrayList p;

    public /* synthetic */ tx1(IndexFragment indexFragment, ArrayList arrayList, int i) {
        this.n = i;
        this.o = indexFragment;
        this.p = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        int i2 = 1;
        ArrayList arrayList = this.p;
        IndexFragment indexFragment = this.o;
        switch (i) {
            case 0:
                boolean isEmpty = arrayList.isEmpty();
                MainActivity mainActivity = indexFragment.m0;
                if (!isEmpty) {
                    mainActivity.runOnUiThread(new tx1(indexFragment, arrayList, i2));
                    break;
                } else {
                    mainActivity.runOnUiThread(new qa1(16, indexFragment));
                    break;
                }
            default:
                bo2.o(indexFragment.p0, arrayList, 0);
                ((au) indexFragment.m0.V.n).d(true);
                Toast.makeText(indexFragment.Z(), indexFragment.t(R.string.folder_play_playing, Integer.valueOf(arrayList.size())), 0).show();
                break;
        }
    }
}
