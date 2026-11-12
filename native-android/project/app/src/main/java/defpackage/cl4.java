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

    public cl4(Application r2) {
        super(r2);
        new k03(null);
        this.d = new k03(null);
        this.c = new pa(12);
    }

    public final void c(List r8, xj r9) {
        if (r8 == null) goto L11;
        if (r8.isEmpty() == true) goto L11;
        ArrayList r2 = new ArrayList();
        AtomicInteger r3 = new AtomicInteger(r8.size());
        Iterator r10 = r8.iterator();
    L8:
        if (r10.hasNext() == false) goto L10;
        String r0 = ((ArtistID3) r10.next()).getId();
        xj r4 = r9;
        r20 r1 = new r20(r2, r3, r4, false, 10);
        this.c.w(r0, r1);
        r9 = r4;
        goto L8
    L10:
        return;
    L11:
        r9.e(new ArrayList());
    }
}
