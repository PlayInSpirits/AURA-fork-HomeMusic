package androidx.work.impl;

import android.content.Context;
import defpackage.aq4;
import defpackage.bq4;
import defpackage.fd5;
import defpackage.gp3;
import defpackage.h95;
import defpackage.hd5;
import defpackage.kw2;
import defpackage.li0;
import defpackage.oc5;
import defpackage.s12;
import defpackage.so4;
import defpackage.su3;
import defpackage.v24;
import defpackage.vo0;
import defpackage.wo0;
import defpackage.xc5;
import defpackage.y10;
import defpackage.yc5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile fd5 k;
    public volatile wo0 l;
    public volatile hd5 m;
    public volatile bq4 n;
    public volatile xc5 o;
    public volatile yc5 p;
    public volatile gp3 q;

    @Override // androidx.work.impl.WorkDatabase
    public final fd5 A() {
        fd5 fd5Var;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            try {
                if (this.k == null) {
                    this.k = new fd5(this);
                }
                fd5Var = this.k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fd5Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final hd5 B() {
        hd5 hd5Var;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            try {
                if (this.m == null) {
                    this.m = new hd5(this);
                }
                hd5Var = this.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hd5Var;
    }

    @Override // defpackage.s24
    public final s12 d() {
        return new s12(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // defpackage.s24
    public final so4 f(li0 li0Var) {
        v24 v24Var = new v24(li0Var, new h95(this));
        Context context = li0Var.a;
        context.getClass();
        return li0Var.c.c(new y10(context, li0Var.b, v24Var, false, false));
    }

    @Override // defpackage.s24
    public final List g(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new kw2(13, 14, 23));
        arrayList.add(new kw2(24));
        int i = 17;
        arrayList.add(new kw2(16, i, 25));
        int i2 = 18;
        arrayList.add(new kw2(i, i2, 26));
        arrayList.add(new kw2(i2, 19, 27));
        arrayList.add(new kw2(28));
        arrayList.add(new oc5(20, 21, 1));
        arrayList.add(new oc5(22, 23, 0));
        return arrayList;
    }

    @Override // defpackage.s24
    public final Set k() {
        return new HashSet();
    }

    @Override // defpackage.s24
    public final Map l() {
        HashMap map = new HashMap();
        List list = Collections.EMPTY_LIST;
        map.put(fd5.class, list);
        map.put(wo0.class, list);
        map.put(hd5.class, list);
        map.put(bq4.class, list);
        map.put(xc5.class, list);
        map.put(yc5.class, list);
        map.put(gp3.class, list);
        map.put(su3.class, list);
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final wo0 v() {
        wo0 wo0Var;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            try {
                if (this.l == null) {
                    wo0 wo0Var2 = new wo0();
                    wo0Var2.n = this;
                    wo0Var2.o = new vo0(this, 0);
                    this.l = wo0Var2;
                }
                wo0Var = this.l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wo0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final gp3 w() {
        gp3 gp3Var;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    this.q = new gp3(this);
                }
                gp3Var = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gp3Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final bq4 x() {
        bq4 bq4Var;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            try {
                if (this.n == null) {
                    this.n = new bq4(this);
                }
                bq4Var = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bq4Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final xc5 y() {
        xc5 xc5Var;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new xc5(this);
                }
                xc5Var = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xc5Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final yc5 z() {
        yc5 yc5Var;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            try {
                if (this.p == null) {
                    yc5 yc5Var2 = new yc5();
                    yc5Var2.n = this;
                    new vo0(this, 4);
                    yc5Var2.o = new aq4(this, 2);
                    yc5Var2.p = new aq4(this, 3);
                    this.p = yc5Var2;
                }
                yc5Var = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return yc5Var;
    }
}
