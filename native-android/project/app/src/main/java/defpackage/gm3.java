package defpackage;

import android.util.Log;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gm3 implements a83 {
    public final /* synthetic */ k03 a;
    public final /* synthetic */ pz1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Child d;
    public final /* synthetic */ String e;
    public final /* synthetic */ im3 f;

    public gm3(im3 r1, k03 r2, pz1 r3, int r4, Child r5, String r6) {
        this.f = r1;
        this.a = r2;
        this.b = r3;
        this.c = r4;
        this.d = r5;
        this.e = r6;
    }

    @Override // defpackage.a83
    public final void b(Object r9) {
        List r10 = (List) r9;
        this.a.j(this);
        im3 r1 = this.f;
        if (r10 != null) goto L6;
        r1.f = null;
        this.b.g();
        return;
    L6:
        ArrayList r2 = new ArrayList(r10);
        r2.add(Math.min(this.c, r2.size()), this.d);
        ArrayList<String> r11 = new ArrayList(r2.size());
        int r3 = r2.size();
        int r5 = 0;
    L7:
        if (r5 >= r3) goto L9;
        Object r6 = r2.get(r5);
        r5 = r5 + 1;
        r11.add(((Child) r6).getId());
        goto L7
    L9:
        mm3 r4 = r1.c;
        gp3 r7 = new gp3(this, r2, false, 17);
        r4.getClass();
        rm3 r8 = App.f(false).g();
        r8.getClass();
        Log.d("BrowsingClient", "createPlaylist()");
        ((qm3) r8.o).a(((pn4) r8.n).f(), this.e, null, r11).enqueue(new hd5(r4, r7, false, 17));
    }
}
