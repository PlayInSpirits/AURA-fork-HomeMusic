package defpackage;

import android.util.Log;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class wi4 {
    public final /* synthetic */ xi4 a;
    public final /* synthetic */ k03 b;
    public final /* synthetic */ HashSet c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    public /* synthetic */ wi4(xi4 xi4Var, k03 k03Var, HashSet hashSet, int i, String str) {
        this.a = xi4Var;
        this.b = k03Var;
        this.c = hashSet;
        this.d = i;
        this.e = str;
    }

    public final void a(List list) {
        HashSet hashSet;
        k03 k03Var = this.b;
        List list2 = (List) k03Var.d();
        if (list2 != null) {
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashSet = this.c;
                if (!hasNext) {
                    break;
                }
                Child child = (Child) it.next();
                if (!hashSet.contains(child.getId())) {
                    list2.add(child);
                    hashSet.add(child.getId());
                }
            }
            int size = list2.size();
            int i = this.d;
            if (size >= i / 2) {
                k03Var.i(list2);
                return;
            }
            eg0 eg0Var = new eg0(hashSet, list2, k03Var, 11);
            gp3 c = App.f(false).c();
            c.getClass();
            Log.d("BrowsingClient", "getSimilarSongs()");
            ((ov) c.p).g(((pn4) c.o).f(), this.e, i).enqueue(new ue1(this.a, i, eg0Var, 14));
        }
    }
}
