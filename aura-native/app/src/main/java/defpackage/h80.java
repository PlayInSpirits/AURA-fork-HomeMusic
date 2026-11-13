package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import app.homemusic.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class h80 {
    public final View a;
    public boolean b;
    public u80 c;
    public ba2 d;
    public j54 e;
    public f75 f;
    public final iw1 g;
    public final z04 h;
    public final Configuration i;
    public final b13 j;
    public final rv2 k;
    public final pa l;
    public final hd5 m;
    public final y30 n;
    public final ga1 o;
    public final b13 p;
    public final kl1 q;
    public final gd r;
    public final e72 s;
    public final om1 t;
    public final nz u;
    public int v;
    public vc w;
    public final g80 x;

    public h80(h80 h80Var, View view, u80 u80Var, ba2 ba2Var, j54 j54Var, f75 f75Var) {
        iw1 iw1Var;
        Configuration configuration;
        b13 B;
        rv2 rv2Var;
        pa paVar;
        hd5 hd5Var;
        y30 rv2Var2;
        ga1 paVar2;
        b13 zd3Var;
        gd gdVar;
        nz nzVar;
        e72 e72Var;
        z04 z04Var;
        View view2;
        boolean c = h12.c((h80Var == null || (view2 = h80Var.a) == null) ? null : view2.getContext(), view.getContext());
        this.a = view;
        this.c = u80Var;
        this.d = ba2Var;
        this.e = j54Var;
        this.f = f75Var;
        if (c) {
            h80Var.getClass();
            iw1Var = h80Var.g;
        } else {
            iw1Var = new iw1();
        }
        this.g = iw1Var;
        this.h = (h80Var == null || (z04Var = h80Var.h) == null) ? new z04() : z04Var;
        if (c) {
            h80Var.getClass();
            configuration = h80Var.i;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.i = configuration;
        if (c) {
            h80Var.getClass();
            B = h80Var.j;
        } else {
            B = uc5.B(new Configuration(configuration));
        }
        this.j = B;
        if (c) {
            h80Var.getClass();
            rv2Var = h80Var.k;
        } else {
            Context context = view.getContext();
            rv2Var = new rv2(28);
            Object systemService = context.getSystemService("accessibility");
            systemService.getClass();
        }
        this.k = rv2Var;
        if (c) {
            h80Var.getClass();
            paVar = h80Var.l;
        } else {
            view.getContext();
            paVar = new pa(5);
        }
        this.l = paVar;
        if (c) {
            h80Var.getClass();
            hd5Var = h80Var.m;
        } else {
            hd5Var = new hd5(view.getContext());
        }
        this.m = hd5Var;
        if (c) {
            h80Var.getClass();
            rv2Var2 = h80Var.n;
        } else {
            rv2Var2 = new rv2(29);
        }
        this.n = rv2Var2;
        int i = 2;
        if (c) {
            h80Var.getClass();
            paVar2 = h80Var.o;
        } else {
            view.getContext();
            paVar2 = new pa(i);
        }
        this.o = paVar2;
        if (c) {
            h80Var.getClass();
            zd3Var = h80Var.p;
        } else {
            zd3Var = new zd3(gb.o(view.getContext()), rv2.A);
        }
        this.p = zd3Var;
        this.q = view == (h80Var != null ? h80Var.a : null) ? h80Var.q : new sg3(view);
        if (c) {
            h80Var.getClass();
            gdVar = h80Var.r;
        } else {
            gdVar = new gd(ViewConfiguration.get(view.getContext()));
        }
        this.r = gdVar;
        this.s = (h80Var == null || (e72Var = h80Var.s) == null) ? new e72() : e72Var;
        this.t = new om1(4, (byte) 0);
        this.u = (h80Var == null || (nzVar = h80Var.u) == null) ? new nz() : nzVar;
        new wc(i, this);
        this.x = new g80(this);
    }

    public final void a(ra raVar, r70 r70Var, rg1 rg1Var, int i) {
        rg1Var.S(123858079);
        int i2 = 2;
        int i3 = (rg1Var.g(raVar) ? 4 : 2) | i | (rg1Var.g(r70Var) ? 32 : 16) | (rg1Var.g(this) ? 256 : 128);
        if (rg1Var.K(i3 & 1, (i3 & 147) != 146)) {
            Object tag = raVar.getTag(app.homemusic.R.id.inspection_slot_table_set);
            Set set = null;
            Set set2 = (!(tag instanceof Set) || ((tag instanceof x32) && !(tag instanceof b42))) ? null : (Set) tag;
            if (set2 == null) {
                Object parent = raVar.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(app.homemusic.R.id.inspection_slot_table_set) : null;
                if ((tag2 instanceof Set) && (!(tag2 instanceof x32) || (tag2 instanceof b42))) {
                    set = (Set) tag2;
                }
            } else {
                set = set2;
            }
            if (set != null) {
                set.add(rg1Var.t());
                rg1Var.q = true;
                rg1Var.C = true;
                rg1Var.c.b();
                rg1Var.H.b();
                lg4 lg4Var = rg1Var.I;
                ig4 ig4Var = lg4Var.a;
                lg4Var.e = ig4Var.w;
                lg4Var.f = ig4Var.x;
            }
            boolean e = rg1Var.e(raVar.getView());
            Object H = rg1Var.H();
            i80 i80Var = j80.a;
            if (e || H == i80Var) {
                H = new y75(raVar.getView());
                rg1Var.b0(H);
            }
            y75 y75Var = (y75) H;
            rr3 a = qd2.a.a(d());
            qr3 qr3Var = td2.a;
            g();
            j54 j54Var = this.e;
            j54Var.getClass();
            rr3 a2 = qr3Var.a(j54Var);
            rr3 a3 = hb.d.a(this.g);
            rr3 a4 = hb.e.a(this.h);
            wl4 wl4Var = g90.v;
            boolean g = rg1Var.g(this);
            Object H2 = rg1Var.H();
            if (g || H2 == i80Var) {
                H2 = new x(8, this);
                rg1Var.b0(H2);
            }
            rr3 c = wl4Var.c((if1) H2);
            rr3 a5 = hb.b.a(raVar.getContext());
            rr3 a6 = yz1.a.a(set);
            rr3 a7 = hb.a.a(raVar.getConfiguration());
            wl4 wl4Var2 = z44.a;
            boolean g2 = rg1Var.g(raVar);
            Object H3 = rg1Var.H();
            if (g2 || H3 == i80Var) {
                H3 = new ja(raVar, i2);
                rg1Var.b0(H3);
            }
            rr3 c2 = wl4Var2.c((if1) H3);
            rr3 a8 = hb.f.a(raVar.getView());
            l90 l90Var = g90.x;
            boolean g3 = rg1Var.g(raVar);
            Object H4 = rg1Var.H();
            if (g3 || H4 == i80Var) {
                H4 = new ja(raVar, 3);
                rg1Var.b0(H4);
            }
            gi1.b(new rr3[]{a, a2, a3, a4, c, a5, a6, a7, c2, a8, l90Var.c((if1) H4), g90.t.a(raVar.getViewConfiguration()), vp1.a.a(y75Var)}, fh0.w(1317454175, new f80(raVar, this, r70Var), rg1Var), rg1Var, 56);
        } else {
            rg1Var.N();
        }
        lv3 p = rg1Var.p();
        if (p != null) {
            p.d = new f80(this, raVar, r70Var, i);
        }
    }

    public final void b() {
        int i = this.v - 1;
        this.v = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            this.v = 0;
        }
        if (this.v == 0) {
            View view = this.a;
            Context context = view.getContext();
            g80 g80Var = this.x;
            context.unregisterComponentCallbacks(g80Var);
            this.t.getClass();
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(g80Var);
        }
    }

    public final u80 c() {
        g();
        u80 u80Var = this.c;
        u80Var.getClass();
        return u80Var;
    }

    public final ba2 d() {
        g();
        ba2 ba2Var = this.d;
        ba2Var.getClass();
        return ba2Var;
    }

    public final void e() {
        int i = this.v + 1;
        this.v = i;
        if (i == 1) {
            View view = this.a;
            Context context = view.getContext();
            g80 g80Var = this.x;
            context.registerComponentCallbacks(g80Var);
            f(view.getResources().getConfiguration());
            ((zd3) this.t.o).setValue(Boolean.valueOf(view.hasWindowFocus()));
            view.getViewTreeObserver().addOnWindowFocusChangeListener(g80Var);
        }
    }

    public final void f(Configuration configuration) {
        int updateFrom = this.i.updateFrom(configuration);
        if (updateFrom != 0) {
            Iterator it = this.g.a.entrySet().iterator();
            while (it.hasNext()) {
                gw1 gw1Var = (gw1) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (gw1Var == null || Configuration.needNewResources(updateFrom, gw1Var.b)) {
                    it.remove();
                }
            }
            this.j.setValue(new Configuration(configuration));
            z04 z04Var = this.h;
            synchronized (z04Var) {
                z04Var.a.c();
            }
            if ((268435456 & updateFrom) != 0) {
                this.p.setValue(gb.o(this.a.getContext()));
            }
            if ((805248384 & updateFrom) != 0) {
                this.t.getClass();
            }
        }
    }

    public final void g() {
        if (this.b) {
            return;
        }
        this.b = true;
        u80 u80Var = this.c;
        View view = this.a;
        if (u80Var == null) {
            u80 a = ic5.a(view);
            if (a == null) {
                Object parent = view.getParent();
                while (a == null && (parent instanceof View)) {
                    View view2 = (View) parent;
                    a = ic5.a(view2);
                    parent = au0.z(view2);
                }
            }
            if (a == null) {
                a = ic5.b(view);
            }
            this.c = a;
        }
        if (this.d == null) {
            ba2 u = j51.u(view);
            if (u == null) {
                kf2.o("Composed into a View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
            this.d = u;
        }
        if (this.e == null) {
            j54 y = kb4.y(view);
            if (y == null) {
                kf2.o("Composed into a View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return;
            }
            this.e = y;
        }
        if (this.f == null) {
            this.f = gi1.o(view);
        }
    }
}
