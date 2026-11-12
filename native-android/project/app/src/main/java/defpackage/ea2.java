package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ea2 {
    public final boolean a;
    public c12 b;
    public final h95 c;
    public int d;
    public boolean e;
    public boolean f;
    public final ArrayList g;
    public r92 h;
    public final nl4 i;

    public ea2(ba2 ba2Var, boolean z) {
        new AtomicReference(null);
        this.a = z;
        this.b = new c12();
        this.c = new h95(ba2Var);
        this.g = new ArrayList();
        r92 r92Var = r92.o;
        this.h = r92Var;
        this.i = ya4.a(r92Var);
    }

    public final void a(aa2 aa2Var) {
        w92 tl0Var;
        da2 da2Var;
        ba2 ba2Var;
        q92 q92Var;
        aa2Var.getClass();
        c("addObserver");
        r92 r92Var = this.h;
        r92 r92Var2 = r92.n;
        if (r92Var != r92Var2) {
            r92Var2 = r92.o;
        }
        da2 da2Var2 = new da2();
        da2Var2.a = r92Var2;
        HashMap map = ka2.a;
        boolean z = aa2Var instanceof w92;
        boolean z2 = aa2Var instanceof rl0;
        int i = 2;
        if (z && z2) {
            tl0Var = new tl0((rl0) aa2Var, (w92) aa2Var);
        } else if (z2) {
            tl0Var = new tl0((rl0) aa2Var, (w92) null);
        } else if (z) {
            tl0Var = (w92) aa2Var;
        } else {
            Class<?> cls = aa2Var.getClass();
            if (ka2.b(cls) == 2) {
                Object obj = ka2.b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    ka2.a((Constructor) list.get(0), aa2Var);
                    throw null;
                }
                int size = list.size();
                ah1[] ah1VarArr = new ah1[size];
                if (size > 0) {
                    ka2.a((Constructor) list.get(0), aa2Var);
                    throw null;
                }
                tl0Var = new vv3(i, ah1VarArr);
            } else {
                tl0Var = new tl0(aa2Var);
            }
        }
        da2Var2.b = tl0Var;
        c12 c12Var = this.b;
        c12Var.getClass();
        w03 w03Var = (w03) c12Var.o;
        b61 b61Var = (b61) w03Var.g(aa2Var);
        if (b61Var != null) {
            da2Var = b61Var.o;
        } else {
            b61 b61Var2 = new b61(aa2Var, da2Var2);
            w03Var.l(aa2Var, b61Var2);
            b61 b61Var3 = (b61) c12Var.q;
            if (b61Var3 == null) {
                c12Var.p = b61Var2;
                c12Var.q = b61Var2;
            } else {
                b61Var3.p = b61Var2;
                b61Var2.q = b61Var3;
                c12Var.q = b61Var2;
            }
            da2Var = null;
        }
        if (da2Var == null && (ba2Var = (ba2) ((WeakReference) this.c.n).get()) != null) {
            boolean z3 = this.d != 0 || this.e;
            r92 r92VarB = b(aa2Var);
            this.d++;
            while (da2Var2.a.compareTo(r92VarB) < 0) {
                c12 c12Var2 = this.b;
                c12Var2.getClass();
                if (!((w03) c12Var2.o).c(aa2Var)) {
                    break;
                }
                r92 r92Var3 = da2Var2.a;
                ArrayList arrayList = this.g;
                arrayList.add(r92Var3);
                o92 o92Var = q92.Companion;
                r92 r92Var4 = da2Var2.a;
                o92Var.getClass();
                r92Var4.getClass();
                int iOrdinal = r92Var4.ordinal();
                if (iOrdinal == 1) {
                    q92Var = q92.ON_CREATE;
                } else if (iOrdinal != 2) {
                    q92Var = iOrdinal != 3 ? null : q92.ON_RESUME;
                } else {
                    q92Var = q92.ON_START;
                }
                if (q92Var == null) {
                    nz2.x(da2Var2.a, "no event up from ");
                    return;
                } else {
                    da2Var2.a(ba2Var, q92Var);
                    v40.r0(arrayList);
                    r92VarB = b(aa2Var);
                }
            }
            if (!z3) {
                h();
            }
            this.d--;
        }
    }

    public final r92 b(aa2 aa2Var) {
        c12 c12Var = this.b;
        c12Var.getClass();
        aa2Var.getClass();
        b61 b61Var = (b61) ((w03) c12Var.o).g(aa2Var);
        b61 b61Var2 = b61Var != null ? b61Var.q : null;
        r92 r92Var = b61Var2 != null ? b61Var2.o.a : null;
        ArrayList arrayList = this.g;
        r92 r92Var2 = arrayList.isEmpty() ? null : (r92) arrayList.get(arrayList.size() - 1);
        r92 r92Var3 = this.h;
        if (r92Var == null || r92Var.compareTo(r92Var3) >= 0) {
            r92Var = r92Var3;
        }
        return (r92Var2 == null || r92Var2.compareTo(r92Var) >= 0) ? r92Var : r92Var2;
    }

    public final void c(String str) {
        if (this.a) {
            ei.V().j.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            nz2.f(xa3.h("Method ", str, " must be called on the main thread"));
        }
    }

    public final void d(q92 q92Var) {
        q92Var.getClass();
        c("handleLifecycleEvent");
        e(q92Var.a());
    }

    public final void e(r92 r92Var) {
        if (this.h == r92Var) {
            return;
        }
        ba2 ba2Var = (ba2) ((WeakReference) this.c.n).get();
        r92 r92Var2 = this.h;
        r92 r92Var3 = r92.o;
        r92 r92Var4 = r92.n;
        if (r92Var2 == r92Var3 && r92Var == r92Var4) {
            throw new IllegalStateException(("State must be at least '" + r92.p + "' to be moved to '" + r92Var + "' in component " + ba2Var).toString());
        }
        if (r92Var2 == r92Var4 && r92Var2 != r92Var) {
            throw new IllegalStateException(("State is '" + r92Var4 + "' and cannot be moved to `" + r92Var + "` in component " + ba2Var).toString());
        }
        this.h = r92Var;
        if (this.e || this.d != 0) {
            this.f = true;
            return;
        }
        this.e = true;
        h();
        this.e = false;
        if (this.h == r92Var4) {
            this.b = new c12();
        }
    }

    public final void f(aa2 aa2Var) {
        aa2Var.getClass();
        c("removeObserver");
        c12 c12Var = this.b;
        c12Var.getClass();
        b61 b61Var = (b61) ((w03) c12Var.o).j(aa2Var);
        if (b61Var == null) {
            return;
        }
        b61 b61Var2 = b61Var.q;
        b61 b61Var3 = b61Var.p;
        if (b61Var2 == null) {
            c12Var.p = b61Var3;
        } else {
            b61Var2.p = b61Var3;
        }
        b61 b61Var4 = b61Var.p;
        if (b61Var4 == null) {
            c12Var.q = b61Var2;
        } else {
            b61Var4.q = b61Var2;
        }
        b61Var.r = true;
    }

    public final void g(r92 r92Var) {
        r92Var.getClass();
        c("setCurrentState");
        e(r92Var);
    }

    public final void h() {
        Object obj = ((WeakReference) this.c.n).get();
        if (obj == null) {
            kf2.o("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        final ba2 ba2Var = (ba2) obj;
        while (true) {
            c12 c12Var = this.b;
            final int i = 0;
            if (((w03) c12Var.o).e == 0) {
                break;
            }
            b61 b61Var = (b61) c12Var.p;
            if (b61Var == null) {
                kf2.m("Collection is empty.");
                return;
            }
            r92 r92Var = b61Var.o.a;
            b61 b61Var2 = (b61) c12Var.q;
            if (b61Var2 == null) {
                kf2.m("Collection is empty.");
                return;
            }
            r92 r92Var2 = b61Var2.o.a;
            if (r92Var == r92Var2 && this.h == r92Var2) {
                break;
            }
            this.f = false;
            r92 r92Var3 = this.h;
            if (b61Var == null) {
                kf2.m("Collection is empty.");
                return;
            }
            if (r92Var3.compareTo(r92Var) < 0) {
                c12 c12Var2 = this.b;
                if1 if1Var = new if1(this) { // from class: ca2
                    public final /* synthetic */ ea2 o;

                    {
                        this.o = this;
                    }

                    @Override // defpackage.if1
                    public final Object invoke(Object obj2) {
                        q92 q92Var;
                        q92 q92Var2;
                        int i2 = i;
                        j15 j15Var = j15.a;
                        ba2 ba2Var2 = ba2Var;
                        ea2 ea2Var = this.o;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (i2) {
                            case 0:
                                entry.getClass();
                                aa2 aa2Var = (aa2) entry.getKey();
                                da2 da2Var = (da2) entry.getValue();
                                while (true) {
                                    r92 r92Var4 = da2Var.a;
                                    r92 r92Var5 = ea2Var.h;
                                    ArrayList arrayList = ea2Var.g;
                                    if (r92Var4.compareTo(r92Var5) <= 0 || ea2Var.f) {
                                        return j15Var;
                                    }
                                    c12 c12Var3 = ea2Var.b;
                                    c12Var3.getClass();
                                    aa2Var.getClass();
                                    if (!((w03) c12Var3.o).c(aa2Var)) {
                                        return j15Var;
                                    }
                                    o92 o92Var = q92.Companion;
                                    r92 r92Var6 = da2Var.a;
                                    o92Var.getClass();
                                    r92Var6.getClass();
                                    int iOrdinal = r92Var6.ordinal();
                                    if (iOrdinal == 2) {
                                        q92Var = q92.ON_DESTROY;
                                    } else if (iOrdinal != 3) {
                                        q92Var = iOrdinal != 4 ? null : q92.ON_PAUSE;
                                    } else {
                                        q92Var = q92.ON_STOP;
                                    }
                                    if (q92Var == null) {
                                        nz2.u(da2Var.a, "no event down from ");
                                        return null;
                                    }
                                    arrayList.add(q92Var.a());
                                    da2Var.a(ba2Var2, q92Var);
                                    v40.r0(arrayList);
                                }
                                break;
                            default:
                                entry.getClass();
                                aa2 aa2Var2 = (aa2) entry.getKey();
                                da2 da2Var2 = (da2) entry.getValue();
                                while (true) {
                                    r92 r92Var7 = da2Var2.a;
                                    r92 r92Var8 = ea2Var.h;
                                    ArrayList arrayList2 = ea2Var.g;
                                    if (r92Var7.compareTo(r92Var8) >= 0 || ea2Var.f) {
                                        return j15Var;
                                    }
                                    c12 c12Var4 = ea2Var.b;
                                    c12Var4.getClass();
                                    aa2Var2.getClass();
                                    if (!((w03) c12Var4.o).c(aa2Var2)) {
                                        return j15Var;
                                    }
                                    arrayList2.add(da2Var2.a);
                                    o92 o92Var2 = q92.Companion;
                                    r92 r92Var9 = da2Var2.a;
                                    o92Var2.getClass();
                                    r92Var9.getClass();
                                    int iOrdinal2 = r92Var9.ordinal();
                                    if (iOrdinal2 == 1) {
                                        q92Var2 = q92.ON_CREATE;
                                    } else if (iOrdinal2 != 2) {
                                        q92Var2 = iOrdinal2 != 3 ? null : q92.ON_RESUME;
                                    } else {
                                        q92Var2 = q92.ON_START;
                                    }
                                    if (q92Var2 == null) {
                                        nz2.u(da2Var2.a, "no event up from ");
                                        return null;
                                    }
                                    da2Var2.a(ba2Var2, q92Var2);
                                    v40.r0(arrayList2);
                                }
                                break;
                        }
                    }
                };
                c12Var2.getClass();
                for (b61 b61Var3 = (b61) c12Var2.q; b61Var3 != null; b61Var3 = b61Var3.q) {
                    if (!b61Var3.r) {
                        if1Var.invoke(b61Var3);
                    }
                }
            }
            b61 b61Var4 = (b61) this.b.q;
            if (!this.f && b61Var4 != null && this.h.compareTo(b61Var4.o.a) > 0) {
                c12 c12Var3 = this.b;
                final int i2 = 1;
                if1 if1Var2 = new if1(this) { // from class: ca2
                    public final /* synthetic */ ea2 o;

                    {
                        this.o = this;
                    }

                    @Override // defpackage.if1
                    public final Object invoke(Object obj2) {
                        q92 q92Var;
                        q92 q92Var2;
                        int i3 = i2;
                        j15 j15Var = j15.a;
                        ba2 ba2Var2 = ba2Var;
                        ea2 ea2Var = this.o;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (i3) {
                            case 0:
                                entry.getClass();
                                aa2 aa2Var = (aa2) entry.getKey();
                                da2 da2Var = (da2) entry.getValue();
                                while (true) {
                                    r92 r92Var4 = da2Var.a;
                                    r92 r92Var5 = ea2Var.h;
                                    ArrayList arrayList = ea2Var.g;
                                    if (r92Var4.compareTo(r92Var5) <= 0 || ea2Var.f) {
                                        return j15Var;
                                    }
                                    c12 c12Var4 = ea2Var.b;
                                    c12Var4.getClass();
                                    aa2Var.getClass();
                                    if (!((w03) c12Var4.o).c(aa2Var)) {
                                        return j15Var;
                                    }
                                    o92 o92Var = q92.Companion;
                                    r92 r92Var6 = da2Var.a;
                                    o92Var.getClass();
                                    r92Var6.getClass();
                                    int iOrdinal = r92Var6.ordinal();
                                    if (iOrdinal == 2) {
                                        q92Var = q92.ON_DESTROY;
                                    } else if (iOrdinal != 3) {
                                        q92Var = iOrdinal != 4 ? null : q92.ON_PAUSE;
                                    } else {
                                        q92Var = q92.ON_STOP;
                                    }
                                    if (q92Var == null) {
                                        nz2.u(da2Var.a, "no event down from ");
                                        return null;
                                    }
                                    arrayList.add(q92Var.a());
                                    da2Var.a(ba2Var2, q92Var);
                                    v40.r0(arrayList);
                                }
                                break;
                            default:
                                entry.getClass();
                                aa2 aa2Var2 = (aa2) entry.getKey();
                                da2 da2Var2 = (da2) entry.getValue();
                                while (true) {
                                    r92 r92Var7 = da2Var2.a;
                                    r92 r92Var8 = ea2Var.h;
                                    ArrayList arrayList2 = ea2Var.g;
                                    if (r92Var7.compareTo(r92Var8) >= 0 || ea2Var.f) {
                                        return j15Var;
                                    }
                                    c12 c12Var5 = ea2Var.b;
                                    c12Var5.getClass();
                                    aa2Var2.getClass();
                                    if (!((w03) c12Var5.o).c(aa2Var2)) {
                                        return j15Var;
                                    }
                                    arrayList2.add(da2Var2.a);
                                    o92 o92Var2 = q92.Companion;
                                    r92 r92Var9 = da2Var2.a;
                                    o92Var2.getClass();
                                    r92Var9.getClass();
                                    int iOrdinal2 = r92Var9.ordinal();
                                    if (iOrdinal2 == 1) {
                                        q92Var2 = q92.ON_CREATE;
                                    } else if (iOrdinal2 != 2) {
                                        q92Var2 = iOrdinal2 != 3 ? null : q92.ON_RESUME;
                                    } else {
                                        q92Var2 = q92.ON_START;
                                    }
                                    if (q92Var2 == null) {
                                        nz2.u(da2Var2.a, "no event up from ");
                                        return null;
                                    }
                                    da2Var2.a(ba2Var2, q92Var2);
                                    v40.r0(arrayList2);
                                }
                                break;
                        }
                    }
                };
                c12Var3.getClass();
                for (b61 b61Var5 = (b61) c12Var3.p; b61Var5 != null; b61Var5 = b61Var5.p) {
                    if (!b61Var5.r) {
                        if1Var2.invoke(b61Var5);
                    }
                }
            }
        }
        this.f = false;
        this.i.i(this.h);
    }
}
