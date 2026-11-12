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

    public b(Application r13) {
        super(r13);
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
        int r0 = 0;
        this.F = 0;
        int r3 = 2;
        if (ud3.r() != null) goto L5;
    L11:
        this.c = new xi4(r3);
        int r4 = 27;
        this.d = new rv2(r4);
        this.e = new pa(12);
        this.f = new zh0(13);
        d34 r2 = new d34(25);
        this.g = r2;
        this.h = new mm3();
        this.i = new hh3(r4);
        this.j = new bl4(r13);
        this.k = new cl4(r13);
        List r5 = new ArrayList();
        lg1 r6 = new lg1((i61) r2.o);
        Thread r7 = new Thread(r6);
        r7.start();
        r7.join();     // Catch: InterruptedException -> L14
        r5 = (List) r6.p;     // Catch: InterruptedException -> L14
    L16:
        ArrayList r14 = new ArrayList(r5);
        HashMap r8 = new HashMap();
        int r9 = r14.size();
        int r10 = 0;
    L17:
        if (r10 >= r9) goto L23;
        Object r11 = r14.get(r10);
        r10 = r10 + 1;
        Favorite r12 = (Favorite) r11;
        String r15 = r12.toString();
        if (r8.containsKey(r15) == false) goto L22;
        if (r12.getTimestamp() <= ((Favorite) r8.get(r15)).getTimestamp()) goto L17;
    L22:
        r8.put(r15, r12);
        goto L17
    L23:
        ArrayList r16 = new ArrayList(r8.values());
        ArrayList r17 = new ArrayList();
        int r18 = r14.size();
        int r19 = 0;
    L24:
        if (r19 >= r18) goto L28;
        Object r20 = r14.get(r19);
        r19 = r19 + 1;
        Favorite r21 = (Favorite) r20;
        if (r16.contains(r21) == true) goto L24;
        r17.add(r21);
        goto L24
    L28:
        int r110 = r16.size();
        int r22 = 0;
    L29:
        if (r22 >= r110) goto L56;
        Object r23 = r16.get(r22);
        r22 = r22 + 1;
        Favorite r24 = (Favorite) r23;
        if (r24.getToStar() == true) goto L33;
        if (g12.P(r24) == false) goto L46;
        if (r24.getSongId() != null) goto L49;
        if (r24.getAlbumId() != null) goto L52;
        if (r24.getArtistId() == null) goto L29;
        d34.K(null, null, r24.getArtistId(), new op1(this, r24));
        goto L29
    L52:
        d34.K(null, r24.getAlbumId(), null, new op1(this, r24));
        goto L29
    L49:
        d34.K(r24.getSongId(), null, null, new op1(this, r24));
        goto L29
    L46:
        r2.C(r24);
        goto L29
    L33:
        if (g12.P(r24) == false) goto L34;
        if (r24.getSongId() != null) goto L37;
        if (r24.getAlbumId() != null) goto L40;
        if (r24.getArtistId() == null) goto L29;
        d34.I(null, null, r24.getArtistId(), new op1(this, r24));
        goto L29
    L40:
        d34.I(null, r24.getAlbumId(), null, new op1(this, r24));
        goto L29
    L37:
        d34.I(r24.getSongId(), null, null, new op1(this, r24));
        goto L29
    L34:
        r2.C(r24);
        goto L29
    L56:
        int r111 = r17.size();
    L57:
        if (r0 >= r111) goto L59;
        Object r1 = r17.get(r0);
        r0 = r0 + 1;
        r2.C((Favorite) r1);
        goto L57
    L59:
        this.A.k(ud3.s());
        this.B = fu.N(this.A, new x(17, this));
        return;
    L14:
        e = move-exception;
        e.printStackTrace();
        goto L16
    L5:
        if (ud3.r().equals("null") == true) goto L11;
        List r25 = (List) new nk1().f(ud3.r(), new HomeViewModel$2().getType());
        this.D = r25;
        if (r25 == null) goto L11;
        if (r25.stream().noneMatch(new c7(15)) == false) goto L11;
        List r26 = this.D;
        Application r27 = this.b;
        r27.getClass();
        r26.add(new HomeSector("HOME_SECTOR_CONTINUE_LISTENING", r27.getString(R.string.home_title_continue_listening), true, 2));
        ud3.l0(this.D);
        goto L11
    }

    public final void c(le1 r11, int r12) {
        Calendar r0 = Calendar.getInstance();
        String r7 = ud3.E();
        int r2 = r0.get(3);
        if (r12 != 0) goto L6;
        long r4 = r0.getTimeInMillis();
        r0.set(3, r2 - 1);
        long r1 = r0.getTimeInMillis();
    L5:
        long r5 = r4;
        long r3 = r1;
    L12:
        r20 r6 = (r20) this.f.o;
        t24 r13 = ((s24) r6.o).i().a(new String[]{"chronology"}, new p20(r6, r3, r5, r7));
        k03 r10 = this.x;
        Objects.requireNonNull(r10);
        r13.e(r11, new g7(r10, 0));
        return;
    L6:
        if (r12 != 1) goto L9;
        r4 = r0.getTimeInMillis();
        r0.set(3, r2 - 4);
        r1 = r0.getTimeInMillis();
        goto L5
    L9:
        if (r12 != 2) goto L11;
        r4 = r0.getTimeInMillis();
        r0.set(3, r2 - 52);
        r1 = r0.getTimeInMillis();
        goto L5
    L11:
        r3 = 0;
        r5 = 0;
        goto L12
    }

    public final boolean d(String r3) {
        List r2 = this.D;
        if (r2 != null) goto L5;
        return false;
    L5:
        if (r2.stream().filter(new at0(12, r3)).findAny().orElse(null) != null) goto L10;
        return true;
    L10:
        return false;
    }

    public final boolean e() {
        String r0 = ud3.k();
        if (Objects.equals(r0, this.E) == false) goto L6;
        return false;
    L6:
        this.E = r0;
        this.F++;
        this.l.k(null);
        this.m.k(null);
        this.t.k(null);
        this.u.k(null);
        this.w.k(null);
        this.v.k(null);
        return true;
    }

    public final void f(le1 r6) {
        int r0 = Calendar.getInstance().get(1);
        int r1 = this.F;
        Integer r2 = Integer.valueOf(r0);
        Integer r3 = Integer.valueOf(r0);
        this.d.getClass();
        rv2.m("byYear", SmartPlan.MAX_QUEUE, r2, r3).e(r6, new ri4(r1, 2, this));
    }

    public final void g(ba2 r4) {
        this.i.getClass();
        k03 r0 = hh3.m();
        k03 r3 = this.C;
        Objects.requireNonNull(r3);
        r0.e(r4, new g7(r3, 0));
    }

    public final mp1 h(k03 r4) {
        return new mp1(this, this.F, r4, 0);
    }
}
