package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pk {
    public static final ok h = new ok();
    public final hg3 a;
    public final rm3 b;
    public final ok c;
    public final CopyOnWriteArrayList d;
    public List e;
    public List f;
    public int g;

    public pk(ni4 ni4Var, hh3 hh3Var) {
        hg3 hg3Var = new hg3(4, ni4Var);
        synchronized (j51.a) {
            try {
                if (j51.b == null) {
                    j51.b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        rm3 rm3Var = new rm3(j51.b, hh3Var, false);
        this.d = new CopyOnWriteArrayList();
        this.f = Collections.EMPTY_LIST;
        this.a = hg3Var;
        this.b = rm3Var;
        this.c = h;
    }

    public final void a(Runnable runnable) {
        Iterator it = this.d.iterator();
        if (it.hasNext()) {
            throw xa3.d(it);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b(List list, jq3 jq3Var) {
        int i = this.g + 1;
        this.g = i;
        List list2 = this.e;
        if (list == list2) {
            if (jq3Var != null) {
                jq3Var.run();
                return;
            }
            return;
        }
        hg3 hg3Var = this.a;
        if (list == null) {
            int size = list2.size();
            this.e = null;
            this.f = Collections.EMPTY_LIST;
            hg3Var.r(0, size);
            a(jq3Var);
            return;
        }
        if (list2 != null) {
            ((Executor) this.b.n).execute(new nk(this, list2, list, i, jq3Var));
            return;
        }
        this.e = list;
        this.f = Collections.unmodifiableList(list);
        hg3Var.k(0, list.size());
        a(jq3Var);
    }
}
