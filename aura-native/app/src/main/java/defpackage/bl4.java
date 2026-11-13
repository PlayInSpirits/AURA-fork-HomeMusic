package defpackage;

import android.app.Application;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class bl4 extends hd {
    public final rv2 c;
    public final k03 d;

    public bl4(Application application) {
        super(application);
        new k03(null);
        this.d = new k03(null);
        this.c = new rv2(27);
    }

    public final void c(List list, xj xjVar) {
        ArrayList arrayList = new ArrayList();
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String id = ((AlbumID3) it.next()).getId();
            this.c.getClass();
            k03 l = rv2.l(id);
            l.f(new al4(arrayList, countDownLatch, xjVar, l));
        }
    }
}
