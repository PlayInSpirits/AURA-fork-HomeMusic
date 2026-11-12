package com.eddyizm.tempus.viewmodel;

import android.app.Application;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.SmartPlan;
import com.eddyizm.tempus.model.Favorite;
import com.eddyizm.tempus.model.HomeSector;
import defpackage.at0;
import defpackage.ba2;
import defpackage.bl4;
import defpackage.c7;
import defpackage.cl4;
import defpackage.d34;
import defpackage.fu;
import defpackage.g12;
import defpackage.g7;
import defpackage.hd;
import defpackage.hh3;
import defpackage.i61;
import defpackage.k03;
import defpackage.le1;
import defpackage.lg1;
import defpackage.lu2;
import defpackage.mm3;
import defpackage.mp1;
import defpackage.nk1;
import defpackage.op1;
import defpackage.p20;
import defpackage.pa;
import defpackage.r20;
import defpackage.ri4;
import defpackage.rv2;
import defpackage.s24;
import defpackage.t24;
import defpackage.ud3;
import defpackage.x;
import defpackage.xi4;
import defpackage.zh0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class b extends hd {
    public final k03 A;
    public final lu2 B;
    public final k03 C;
    public final List D;
    public String E;
    public int F;
    public final xi4 c;
    public final rv2 d;
    public final pa e;
    public final zh0 f;
    public final d34 g;
    public final mm3 h;
    public final hh3 i;
    public final bl4 j;
    public final cl4 k;
    public final k03 l;
    public final k03 m;
    public final k03 n;
    public final k03 o;
    public final k03 p;
    public final k03 q;
    public final k03 r;
    public final k03 s;
    public final k03 t;
    public final k03 u;
    public final k03 v;
    public final k03 w;
    public final k03 x;
    public final k03 y;
    public final k03 z;

    public b(Application application) {
        super(application);
        this.l = new k03(null);
        this.m = new k03(null);
        this.n = new k03(null);
        this.o = new k03(null);
        this.p = new k03(null);
        this.q = new k03(null);
        this.r = new k03(null);
        this.s = new k03(null);
        this.t = new k03(null);
        this.u = new k03(null);
        this.v = new k03(null);
        this.w = new k03(null);
        this.x = new k03(null);
        this.y = new k03(null);
        this.z = new k03(null);
        this.A = new k03();
        this.C = new k03(null);
        this.E = ud3.k();
        int i = 0;
        this.F = 0;
        int i2 = 2;
        if (ud3.r() != null && !ud3.r().equals("null")) {
            List list = (List) new nk1().f(ud3.r(), new HomeViewModel$2().getType());
            this.D = list;
            if (list != null && list.stream().noneMatch(new c7(15))) {
                List list2 = this.D;
                Application application2 = this.b;
                application2.getClass();
                list2.add(new HomeSector("HOME_SECTOR_CONTINUE_LISTENING", application2.getString(R.string.home_title_continue_listening), true, 2));
                ud3.l0(this.D);
            }
        }
        this.c = new xi4(i2);
        int i3 = 27;
        this.d = new rv2(i3);
        this.e = new pa(12);
        this.f = new zh0(13);
        d34 d34Var = new d34(25);
        this.g = d34Var;
        this.h = new mm3();
        this.i = new hh3(i3);
        this.j = new bl4(application);
        this.k = new cl4(application);
        List arrayList = new ArrayList();
        lg1 lg1Var = new lg1((i61) d34Var.o);
        Thread thread = new Thread(lg1Var);
        thread.start();
        try {
            thread.join();
            arrayList = (List) lg1Var.p;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        HashMap map = new HashMap();
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            Favorite favorite = (Favorite) obj;
            String string = favorite.toString();
            if (!map.containsKey(string) || favorite.getTimestamp() > ((Favorite) map.get(string)).getTimestamp()) {
                map.put(string, favorite);
            }
        }
        ArrayList arrayList3 = new ArrayList(map.values());
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList2.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList2.get(i5);
            i5++;
            Favorite favorite2 = (Favorite) obj2;
            if (!arrayList3.contains(favorite2)) {
                arrayList4.add(favorite2);
            }
        }
        int size3 = arrayList3.size();
        int i6 = 0;
        while (i6 < size3) {
            Object obj3 = arrayList3.get(i6);
            i6++;
            Favorite favorite3 = (Favorite) obj3;
            if (favorite3.getToStar()) {
                if (!g12.P(favorite3)) {
                    d34Var.C(favorite3);
                } else if (favorite3.getSongId() != null) {
                    d34.I(favorite3.getSongId(), null, null, new op1(this, favorite3));
                } else if (favorite3.getAlbumId() != null) {
                    d34.I(null, favorite3.getAlbumId(), null, new op1(this, favorite3));
                } else if (favorite3.getArtistId() != null) {
                    d34.I(null, null, favorite3.getArtistId(), new op1(this, favorite3));
                }
            } else if (!g12.P(favorite3)) {
                d34Var.C(favorite3);
            } else if (favorite3.getSongId() != null) {
                d34.K(favorite3.getSongId(), null, null, new op1(this, favorite3));
            } else if (favorite3.getAlbumId() != null) {
                d34.K(null, favorite3.getAlbumId(), null, new op1(this, favorite3));
            } else if (favorite3.getArtistId() != null) {
                d34.K(null, null, favorite3.getArtistId(), new op1(this, favorite3));
            }
        }
        int size4 = arrayList4.size();
        while (i < size4) {
            Object obj4 = arrayList4.get(i);
            i++;
            d34Var.C((Favorite) obj4);
        }
        this.A.k(ud3.s());
        this.B = fu.N(this.A, new x(17, this));
    }

    public final void c(le1 le1Var, int i) {
        long j;
        long j2;
        long timeInMillis;
        long timeInMillis2;
        Calendar calendar = Calendar.getInstance();
        String strE = ud3.E();
        int i2 = calendar.get(3);
        if (i == 0) {
            timeInMillis = calendar.getTimeInMillis();
            calendar.set(3, i2 - 1);
            timeInMillis2 = calendar.getTimeInMillis();
        } else {
            if (i != 1) {
                if (i == 2) {
                    timeInMillis = calendar.getTimeInMillis();
                    calendar.set(3, i2 - 52);
                    timeInMillis2 = calendar.getTimeInMillis();
                } else {
                    j = 0;
                    j2 = 0;
                }
                r20 r20Var = (r20) this.f.o;
                t24 t24VarA = ((s24) r20Var.o).i().a(new String[]{"chronology"}, new p20(r20Var, j, j2, strE));
                k03 k03Var = this.x;
                Objects.requireNonNull(k03Var);
                t24VarA.e(le1Var, new g7(k03Var, 0));
            }
            timeInMillis = calendar.getTimeInMillis();
            calendar.set(3, i2 - 4);
            timeInMillis2 = calendar.getTimeInMillis();
        }
        j2 = timeInMillis;
        j = timeInMillis2;
        r20 r20Var2 = (r20) this.f.o;
        t24 t24VarA2 = ((s24) r20Var2.o).i().a(new String[]{"chronology"}, new p20(r20Var2, j, j2, strE));
        k03 k03Var2 = this.x;
        Objects.requireNonNull(k03Var2);
        t24VarA2.e(le1Var, new g7(k03Var2, 0));
    }

    public final boolean d(String str) {
        List list = this.D;
        return list != null && list.stream().filter(new at0(12, str)).findAny().orElse(null) == null;
    }

    public final boolean e() {
        String strK = ud3.k();
        if (Objects.equals(strK, this.E)) {
            return false;
        }
        this.E = strK;
        this.F++;
        this.l.k(null);
        this.m.k(null);
        this.t.k(null);
        this.u.k(null);
        this.w.k(null);
        this.v.k(null);
        return true;
    }

    public final void f(le1 le1Var) {
        int i = Calendar.getInstance().get(1);
        int i2 = this.F;
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(i);
        this.d.getClass();
        rv2.m("byYear", SmartPlan.MAX_QUEUE, numValueOf, numValueOf2).e(le1Var, new ri4(i2, 2, this));
    }

    public final void g(ba2 ba2Var) {
        this.i.getClass();
        k03 k03VarM = hh3.m();
        k03 k03Var = this.C;
        Objects.requireNonNull(k03Var);
        k03VarM.e(ba2Var, new g7(k03Var, 0));
    }

    public final mp1 h(k03 k03Var) {
        return new mp1(this, this.F, k03Var, 0);
    }
}
