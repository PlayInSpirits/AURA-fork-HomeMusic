package defpackage;

import android.app.Application;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.model.DownloadStack;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class bu0 extends hd {
    public final hg3 c;
    public final k03 d;
    public final k03 e;
    public final k03 f;

    public bu0(Application r5) {
        super(r5);
        this.d = new k03(null);
        k03 r6 = new k03(null);
        this.e = r6;
        this.f = new k03();
        this.c = new hg3(15);
        App.b().getClass();
        String r1 = App.c().getString("default_download_view_type", "download_type_track");
        r1.getClass();
        DownloadStack r4 = new DownloadStack(r1, null);
        ArrayList r0 = new ArrayList();
        r0.add(r4);
        r6.k(r0);
    }

    public final void c(DownloadStack r2) {
        k03 r1 = this.e;
        ArrayList r0 = (ArrayList) r1.d();
        r0.add(r2);
        r1.k(r0);
    }
}
