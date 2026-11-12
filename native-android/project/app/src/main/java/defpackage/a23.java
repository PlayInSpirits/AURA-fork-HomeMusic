package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a23 implements ba2, f75, ml1, j54 {
    public final Context n;
    public r23 o;
    public final Bundle p;
    public r92 q;
    public final j23 r;
    public final String s;
    public final Bundle t;
    public final ea2 u;
    public final gp3 v;
    public boolean w;
    public r92 x;
    public final k54 y;

    static {
    }

    public a23(Context r1, r23 r2, Bundle r3, r92 r4, j23 r5, String r6, Bundle r7) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        this.s = r6;
        this.t = r7;
        this.u = new ea2(this, true);
        this.v = new gp3(new xm2(this, new wc(22, this)));
        rp4 r8 = new rp4(new zf0(2, this));
        this.x = r92.o;
        this.y = (k54) r8.getValue();
    }

    @Override // defpackage.ml1
    public final b75 a() {
        return this.y;
    }

    @Override // defpackage.ml1
    public final f03 b() {
        f03 r0 = new f03(0);
        Context r1 = this.n.getApplicationContext();
        if ((r1 instanceof Application) == false) goto L5;
        Application r2 = (Application) r1;
    L6:
        LinkedHashMap r3 = r0.a;
        if (r2 == null) goto L9;
        r3.put(a75.d, r2);
    L9:
        r3.put(e54.a, this);
        r3.put(e54.b, this);
        Bundle r4 = c();
        if (r4 == null) goto L12;
        r3.put(e54.c, r4);
    L12:
        return r0;
    L5:
        r2 = null;
        goto L6
    }

    public final Bundle c() {
        Bundle r1 = this.p;
        if (r1 != null) goto L7;
        return null;
    L7:
        return new Bundle(r1);
    }

    @Override // defpackage.f75
    public final e75 d() {
        if (this.w == true) goto L5;
        kf2.o("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        return null;
    L5:
        if (this.u.h == r92.n) goto L14;
        j23 r0 = this.r;
        if (r0 == null) goto L12;
        String r3 = this.s;
        r3.getClass();
        LinkedHashMap r1 = r0.b;
        e75 r2 = (e75) r1.get(r3);
        if (r2 != null) goto L18;
        e75 r4 = new e75();
        r1.put(r3, r4);
        return r4;
    L18:
        return r2;
    L12:
        kf2.o("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        return null;
    L14:
        kf2.o("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        return null;
    }

    public final void e() {
        if (this.w == true) goto L8;
        gp3 r0 = this.v;
        ((xm2) r0.o).a();
        this.w = true;
        if (this.r == null) goto L7;
        e54.b(this);
    L7:
        r0.s(this.t);
    L8:
        int r1 = this.q.ordinal();
        int r2 = this.x.ordinal();
        ea2 r3 = this.u;
        if (r1 >= r2) goto L12;
        r3.g(this.q);
        return;
    L12:
        r3.g(this.x);
    }

    public final boolean equals(Object r5) {
        if (r5 != null) goto L5;
    L37:
        return false;
    L5:
        if ((r5 instanceof a23) == false) goto L37;
        a23 r6 = (a23) r5;
        Bundle r1 = r6.p;
        String r2 = r6.s;
        if (h12.c(this.s, r2) == false) goto L37;
        if (h12.c(this.o, r6.o) == false) goto L37;
        if (h12.c(this.u, r6.u) == false) goto L37;
        if (h12.c((rm3) this.v.p, (rm3) r6.v.p) == false) goto L37;
        Bundle r4 = this.p;
        if (h12.c(r4, r1) == true) goto L35;
        if (r4 == null) goto L37;
        Set<String> r7 = r4.keySet();
        if (r7 == null) goto L37;
        Set<String> r8 = r7;
        if ((r8 instanceof Collection) == true) goto L23;
    L25:
        Iterator<T> r9 = r8.iterator();
    L27:
        if (r9.hasNext() == false) goto L42;
        String r3 = (String) r9.next();
        Object r10 = r4.get(r3);
        if (r1 == null) goto L31;
        Object r11 = r1.get(r3);
    L33:
        if (h12.c(r10, r11) == true) goto L27;
    L31:
        r11 = null;
        goto L33
    L42:
        return true;
    L23:
        if (r8.isEmpty() == false) goto L25;
        return true;
    L35:
        return true;
    }

    @Override // defpackage.j54
    public final rm3 f() {
        return (rm3) this.v.p;
    }

    @Override // defpackage.ba2
    public final ea2 h() {
        return this.u;
    }

    public final int hashCode() {
        int r0 = this.s.hashCode() * 31;
        int r1 = this.o.hashCode() + r0;
        Bundle r2 = this.p;
        if (r2 == null) goto L14;
        Set<String> r3 = r2.keySet();
        if (r3 == null) goto L14;
        Iterator<T> r4 = r3.iterator();
    L8:
        if (r4.hasNext() == false) goto L14;
        int r5 = r1 * 31;
        Object r6 = r2.get((String) r4.next());
        if (r6 == null) goto L12;
        int r7 = r6.hashCode();
    L13:
        r1 = r5 + r7;
        goto L8
    L12:
        r7 = 0;
    L14:
        int r8 = this.u.hashCode();
        int r9 = ((rm3) this.v.p).hashCode();
        return r9 + ((r8 + (r1 * 31)) * 31);
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(a23.class.getSimpleName());
        r0.append("(" + this.s + ')');
        r0.append(" destination=");
        r0.append(this.o);
        return r0.toString();
    }
}
