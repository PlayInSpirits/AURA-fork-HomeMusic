package defpackage;

import android.app.Application;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class bl4 extends hd {
    public final rv2 c;
    public final k03 d;

    public bl4(Application r2) {
        super(r2);
        new k03(null);
        this.d = new k03(null);
        this.c = new rv2(27);
    }

    public final void c(List r5, xj r6) {
        ArrayList r0 = new ArrayList();
        CountDownLatch r1 = new CountDownLatch(r5.size());
        Iterator r7 = r5.iterator();
    L4:
        if (r7.hasNext() == false) goto L6;
        String r2 = ((AlbumID3) r7.next()).getId();
        this.c.getClass();
        k03 r3 = rv2.l(r2);
        r3.f(new al4(r0, r1, r6, r3));
        goto L4
    }
}
