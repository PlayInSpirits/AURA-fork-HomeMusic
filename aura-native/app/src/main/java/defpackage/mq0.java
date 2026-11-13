package defpackage;

import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.DirectoryFragment;
import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class mq0 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ DirectoryFragment o;
    public final /* synthetic */ ArrayList p;

    public /* synthetic */ mq0(DirectoryFragment directoryFragment, ArrayList arrayList, int i) {
        this.n = i;
        this.o = directoryFragment;
        this.p = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        int i2 = 1;
        ArrayList arrayList = this.p;
        DirectoryFragment directoryFragment = this.o;
        switch (i) {
            case 0:
                boolean isEmpty = arrayList.isEmpty();
                MainActivity mainActivity = directoryFragment.m0;
                if (!isEmpty) {
                    mainActivity.runOnUiThread(new mq0(directoryFragment, arrayList, i2));
                    break;
                } else {
                    mainActivity.runOnUiThread(new a0(22, directoryFragment));
                    break;
                }
            default:
                bo2.o(directoryFragment.p0, arrayList, 0);
                ((au) directoryFragment.m0.V.n).d(true);
                Toast.makeText(directoryFragment.Z(), directoryFragment.t(R.string.folder_play_playing, Integer.valueOf(arrayList.size())), 0).show();
                break;
        }
    }
}
