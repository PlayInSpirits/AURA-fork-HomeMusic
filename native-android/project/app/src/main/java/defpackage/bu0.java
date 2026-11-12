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

    public bu0(Application application) {
        super(application);
        this.d = new k03(null);
        k03 k03Var = new k03(null);
        this.e = k03Var;
        this.f = new k03();
        this.c = new hg3(15);
        App.b().getClass();
        String string = App.c().getString("default_download_view_type", "download_type_track");
        string.getClass();
        DownloadStack downloadStack = new DownloadStack(string, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(downloadStack);
        k03Var.k(arrayList);
    }

    public final void c(DownloadStack downloadStack) {
        k03 k03Var = this.e;
        ArrayList arrayList = (ArrayList) k03Var.d();
        arrayList.add(downloadStack);
        k03Var.k(arrayList);
    }
}
