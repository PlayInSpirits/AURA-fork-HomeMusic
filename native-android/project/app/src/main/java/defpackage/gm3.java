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

    public gm3(im3 im3Var, k03 k03Var, pz1 pz1Var, int i, Child child, String str) {
        this.f = im3Var;
        this.a = k03Var;
        this.b = pz1Var;
        this.c = i;
        this.d = child;
        this.e = str;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        List list = (List) obj;
        this.a.j(this);
        im3 im3Var = this.f;
        if (list == null) {
            im3Var.f = null;
            this.b.g();
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(Math.min(this.c, arrayList.size()), this.d);
        ArrayList<String> arrayList2 = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((Child) obj2).getId());
        }
        mm3 mm3Var = im3Var.c;
        gp3 gp3Var = new gp3(this, arrayList, false, 17);
        mm3Var.getClass();
        rm3 rm3VarG = App.f(false).g();
        rm3VarG.getClass();
        Log.d("BrowsingClient", "createPlaylist()");
        ((qm3) rm3VarG.o).a(((pn4) rm3VarG.n).f(), this.e, null, arrayList2).enqueue(new hd5(mm3Var, gp3Var, false, 17));
    }
}
