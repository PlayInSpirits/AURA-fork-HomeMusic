package defpackage;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class wz {
    public final k2 a;
    public final nk1 b;
    public List c;

    public wz(t5 t5Var, k2 k2Var) {
        this.a = k2Var;
        nk1 nk1Var = new nk1();
        this.b = nk1Var;
        Type type = new TypeToken<List<? extends vz>>() { // from class: com.eddyizm.tempus.homemusic.CatalogCommandQueue$type$1
        }.getType();
        String str = (String) t5Var.invoke();
        List list = str != null ? (List) nk1Var.f(str, type) : null;
        this.c = list == null ? u01.n : list;
    }

    public final synchronized ArrayList a(String str) {
        ArrayList arrayList;
        str.getClass();
        List list = this.c;
        arrayList = new ArrayList();
        for (Object obj : list) {
            if (h12.c(((vz) obj).a, str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final synchronized void b(vz vzVar) {
        try {
            List list = this.c;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                vz vzVar2 = (vz) obj;
                if (!h12.c(vzVar2.a, vzVar.a) || !vzVar2.f.equals(vzVar.f)) {
                    arrayList.add(obj);
                }
            }
            c(arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(ArrayList arrayList) {
        String j = this.b.j(arrayList);
        j.getClass();
        if (((Boolean) this.a.invoke(j)).booleanValue()) {
            this.c = arrayList;
        } else {
            mj0.i("Cannot save favorite commands");
        }
    }
}
