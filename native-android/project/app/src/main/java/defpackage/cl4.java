package defpackage;

import android.app.Application;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class cl4 extends hd {
    public final pa c;
    public final k03 d;

    public cl4(Application application) {
        super(application);
        new k03(null);
        this.d = new k03(null);
        this.c = new pa(12);
    }

    public final void c(List list, xj xjVar) {
        if (list == null || list.isEmpty()) {
            xjVar.e(new ArrayList());
            return;
        }
        ArrayList arrayList = new ArrayList();
        AtomicInteger atomicInteger = new AtomicInteger(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xj xjVar2 = xjVar;
            this.c.w(((ArtistID3) it.next()).getId(), new r20(arrayList, atomicInteger, xjVar2, false, 10));
            xjVar = xjVar2;
        }
    }
}
