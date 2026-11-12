package defpackage;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class xm3 extends hd {
    public final hh3 c;
    public final k03 d;
    public final k03 e;

    public xm3(Application r2) {
        super(r2);
        this.d = new k03(Boolean.FALSE);
        this.e = new k03();
        this.c = new hh3(1);
    }

    public final void c(String r3) {
        Application r0 = this.b;
        r0.getClass();
        Toast.makeText(r0, r3, 1).show();
        this.e.k(r3);
        Log.e("PodcastChannelEditorViewModel", "Error shown: " + r3);
    }
}
