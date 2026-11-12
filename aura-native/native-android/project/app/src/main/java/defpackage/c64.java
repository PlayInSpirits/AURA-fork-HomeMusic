package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c64 {
    public static final String a = cx.i("Schedulers");

    public static void a(fd5 fd5Var, xi4 xi4Var, ArrayList arrayList) {
        if (arrayList.size() > 0) {
            xi4Var.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                fd5Var.j(((dd5) obj).a, jCurrentTimeMillis);
            }
        }
    }

    public static void b(r90 r90Var, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        fd5 fd5VarA = workDatabase.A();
        workDatabase.c();
        try {
            ArrayList arrayListD = fd5VarA.d();
            a(fd5VarA, r90Var.d, arrayListD);
            ArrayList arrayListC = fd5VarA.c(r90Var.k);
            a(fd5VarA, r90Var.d, arrayListC);
            arrayListC.addAll(arrayListD);
            ArrayList arrayListB = fd5VarA.b();
            workDatabase.t();
            workDatabase.o();
            if (arrayListC.size() > 0) {
                dd5[] dd5VarArr = (dd5[]) arrayListC.toArray(new dd5[arrayListC.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    a64 a64Var = (a64) it.next();
                    if (a64Var.c()) {
                        a64Var.e(dd5VarArr);
                    }
                }
            }
            if (arrayListB.size() > 0) {
                dd5[] dd5VarArr2 = (dd5[]) arrayListB.toArray(new dd5[arrayListB.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    a64 a64Var2 = (a64) it2.next();
                    if (!a64Var2.c()) {
                        a64Var2.e(dd5VarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.o();
            throw th;
        }
    }
}
