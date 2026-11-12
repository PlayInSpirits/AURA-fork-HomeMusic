package defpackage;

import com.eddyizm.tempus.homemusic.CatalogCommandQueue$type$1;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wz {
    public final k2 a;
    public final nk1 b;
    public List c;

    public wz(t5 r2, k2 r3) {
        this.a = r3;
        nk1 r4 = new nk1();
        this.b = r4;
        Type r0 = new CatalogCommandQueue$type$1().getType();
        String r5 = (String) r2.invoke();
        if (r5 == null) goto L5;
        List r6 = (List) r4.f(r5, r0);
    L6:
        if (r6 != null) goto L8;
        r6 = u01.n;
    L8:
        this.c = r6;
        return;
    L5:
        r6 = null;
        goto L6
    }

    public final synchronized ArrayList a(String r5) {
        monitor-enter(this);
        r5.getClass();     // Catch: Throwable -> L10
        List r0 = this.c;     // Catch: Throwable -> L10
        ArrayList r1 = new ArrayList();     // Catch: Throwable -> L10
        Iterator r2 = r0.iterator();     // Catch: Throwable -> L10
    L5:
        if (r2.hasNext() == false) goto L12;
        Object r3 = r2.next();     // Catch: Throwable -> L10
        if (h12.c(((vz) r3).a, r5) == false) goto L5;
        r1.add(r3);     // Catch: Throwable -> L10
        goto L5
    L12:
        monitor-exit(this);
        return r1;
    L10:
        th = move-exception;
        throw th;
    }

    public final synchronized void b(vz r7) {
        monitor-enter(this);
        List r0 = this.c;     // Catch: Throwable -> L11
        ArrayList r1 = new ArrayList();     // Catch: Throwable -> L11
        Iterator r2 = r0.iterator();     // Catch: Throwable -> L11
    L5:
        if (r2.hasNext() == false) goto L14;
        Object r3 = r2.next();     // Catch: Throwable -> L11
        vz r4 = (vz) r3;     // Catch: Throwable -> L11
        if (h12.c(r4.a, r7.a) == false) goto L13;
        if (r4.f.equals(r7.f) == true) goto L5;
    L13:
        r1.add(r3);     // Catch: Throwable -> L11
        goto L5
    L14:
        c(r1);     // Catch: Throwable -> L11
        monitor-exit(this);
        return;
    L11:
        th = move-exception;
        throw th;
    }

    public final void c(ArrayList r3) {
        String r0 = this.b.j(r3);
        r0.getClass();
        if (((Boolean) this.a.invoke(r0)).booleanValue() == false) goto L6;
        this.c = r3;
        return;
    L6:
        mj0.i("Cannot save favorite commands");
    }
}
