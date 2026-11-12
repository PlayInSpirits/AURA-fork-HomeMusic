package defpackage;

import android.util.Log;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import retrofit2.Call;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wi4 {
    public final /* synthetic */ xi4 a;
    public final /* synthetic */ k03 b;
    public final /* synthetic */ HashSet c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    public /* synthetic */ wi4(xi4 r1, k03 r2, HashSet r3, int r4, String r5) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
    }

    public final void a(List r6) {
        k03 r0 = this.b;
        List r1 = (List) r0.d();
        if (r1 == null) goto L21;
        Iterator r7 = r6.iterator();
    L5:
        boolean r2 = r7.hasNext();
        HashSet r3 = this.c;
        if (r2 == false) goto L10;
        Child r4 = (Child) r7.next();
        if (r3.contains(r4.getId()) == true) goto L5;
        r1.add(r4);
        r3.add(r4.getId());
        goto L5
    L10:
        int r8 = r1.size();
        int r5 = this.d;
        if (r8 >= (r5 / 2)) goto L14;
        eg0 r9 = new eg0(r3, r1, r0, 11);
        gp3 r10 = App.f(false).c();
        r10.getClass();
        Log.d("BrowsingClient", "getSimilarSongs()");
        Call<ApiResponse> r11 = ((ov) r10.p).g(((pn4) r10.o).f(), this.e, r5);
        xi4 r12 = this.a;
        r11.enqueue(new ue1(r12, r5, r9, 14));
        return;
    L14:
        r0.i(r1);
        return;
    }
}
