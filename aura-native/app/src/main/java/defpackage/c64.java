package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class c64 {
    public static final String a = cx.i("Schedulers");

    public static void a(fd5 fd5Var, xi4 xi4Var, ArrayList arrayList) {
        if (arrayList.size() > 0) {
            xi4Var.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                fd5Var.j(((dd5) obj).a, currentTimeMillis);
            }
        }
    }

    public static void b(r90 r90Var, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        fd5 A = workDatabase.A();
        workDatabase.c();
        try {
            ArrayList d = A.d();
            a(A, r90Var.d, d);
            ArrayList c = A.c(r90Var.k);
            a(A, r90Var.d, c);
            c.addAll(d);
            ArrayList b = A.b();
            workDatabase.t();
            workDatabase.o();
            if (c.size() > 0) {
                dd5[] dd5VarArr = (dd5[]) c.toArray(new dd5[c.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    a64 a64Var = (a64) it.next();
                    if (a64Var.c()) {
                        a64Var.e(dd5VarArr);
                    }
                }
            }
            if (b.size() > 0) {
                dd5[] dd5VarArr2 = (dd5[]) b.toArray(new dd5[b.size()]);
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
