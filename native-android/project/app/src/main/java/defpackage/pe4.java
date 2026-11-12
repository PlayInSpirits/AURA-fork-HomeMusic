package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;
import androidx.media3.common.PlaybackException;
import java.util.AbstractCollection;

public final class pe4 {
    public final int A;
    public final int B;
    public final int C;
    public final ne4 D;
    public final xm E;
    public final xm F;
    public final xm G;
    public final xm H;
    public final boolean I;
    public final int J;
    public final long K;
    public final boolean L;
    public final mi3 a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final PlaybackException f;
    public final int g;
    public final boolean h;
    public final long i;
    public final long j;
    public final long k;
    public final qh3 l;
    public final cw4 m;
    public final il n;
    public final float o;
    public final float p;
    public final s55 q;
    public final jg0 r;
    public final hp0 s;
    public final int t;
    public final pf4 u;
    public final qv2 v;
    public final cu4 w;
    public final jw4 x;
    public final do2 y;
    public final do2 z;

    public pe4(oe4 oe42) {
        long l16;
        pv2[] pv2Array;
        Object object;
        int n16;
        Object object2 = oe42.y;
        Object object3 = oe42.z;
        boolean bl5 = oe42.x.p();
        boolean bl6 = false;
        if (bl5) {
            n16 = oe42.d;
            bl5 = n16 == 1 || n16 == 4;
            rr2.k("Empty playlist only allowed in STATE_IDLE or STATE_ENDED", bl5);
            bl5 = oe42.C == -1 && oe42.D == -1;
            rr2.k("Ads not allowed if playlist is empty", bl5);
            object = object2;
            if (object2 == null) {
                object = jw4.b;
            }
            pv2Array = object;
            object2 = object3;
            bl5 = bl6;
            if (object3 == null) {
                object2 = do2.K;
                pv2Array = object;
                bl5 = bl6;
            }
        } else {
            int n17;
            Object object4;
            n16 = oe42.B;
            if (n16 == -1) {
                n16 = 0;
            } else {
                bl5 = n16 < oe42.x.o();
                rr2.k("currentMediaItemIndex must be less than playlist.size()", bl5);
            }
            if (oe42.C != -1) {
                object = new zt4();
                pv2Array = new bu4();
                object4 = oe42.E;
                l16 = object4 != null ? ((Long)object4).longValue() : oe42.F.get();
                object4 = oe42.x;
                n17 = ((cu4)object4).b(((cu4)object4).i((bu4)pv2Array, (zt4)object, (int)n16, (long)f35.Q((long)l16)).first);
                oe42.x.f(n17, (zt4)object, false);
                bl5 = oe42.C < ((zt4)object).g.a;
                rr2.k("PeriodData has less ad groups than adGroupIndex", bl5);
                n17 = oe42.C;
                n17 = ((zt4)object).g.a((int)n17).b;
                if (n17 != -1) {
                    bl5 = oe42.D < n17;
                    rr2.k("Ad group has less ads than adIndexInGroupIndex", bl5);
                }
            }
            pv2Array = oe42.w;
            object = object2;
            object2 = object3;
            if (pv2Array != null) {
                object2 = (he4)pv2Array.get(n16);
                object = ((he4)object2).b;
                object2 = ((he4)object2).d;
            }
            if (object2 == null) {
                gn2 gn22 = oe42.x.m((int)n16, (bu4)new bu4(), (long)0L).b;
                object.getClass();
                object4 = new co2();
                object2 = ((jw4)object).a;
                int n18 = ((AbstractCollection)object2).size();
                for (n16 = 0; n16 < n18; ++n16) {
                    iw4 iw42 = (iw4)object2.get(n16);
                    for (n17 = 0; n17 < iw42.a; ++n17) {
                        if (!iw42.e[n17]) continue;
                        object3 = iw42.a(n17);
                        if (((tb1)object3).l == null) continue;
                        for (int i16 = 0; i16 < (pv2Array = ((tb1)object3).l.a).length; ++i16) {
                            pv2Array[i16].b((co2)object4);
                        }
                    }
                }
                ((co2)object4).b(gn22.d);
                object2 = new do2((co2)object4);
                bl5 = true;
                pv2Array = object;
            } else {
                bl5 = false;
                pv2Array = object;
            }
        }
        if (oe42.f != null) {
            bl6 = oe42.d == 1;
            rr2.k("Player error only allowed in STATE_IDLE", bl6);
        }
        n16 = oe42.d;
        object = oe42.F;
        object3 = oe42.E;
        if (object3 != null) {
            if (oe42.C == -1 && oe42.b && oe42.d == 3 && oe42.e == 0 && (Long)object3 != -9223372036854775807L) {
                l16 = oe42.E;
                float f16 = oe42.l.a;
                object = new me4(l16, SystemClock.elapsedRealtime(), f16);
            } else {
                object = new xm(oe42.E);
            }
        }
        object3 = oe42.G;
        this.a = oe42.a;
        this.b = oe42.b;
        this.c = oe42.c;
        this.d = oe42.d;
        this.e = oe42.e;
        this.f = oe42.f;
        this.g = oe42.g;
        this.h = oe42.h;
        this.i = oe42.i;
        this.j = oe42.j;
        this.k = oe42.k;
        this.l = oe42.l;
        this.m = oe42.m;
        this.n = oe42.n;
        this.o = oe42.o;
        this.p = oe42.p;
        this.q = oe42.q;
        this.r = oe42.r;
        this.s = oe42.s;
        this.t = oe42.t;
        this.u = oe42.u;
        this.v = oe42.v;
        this.w = oe42.x;
        pv2Array.getClass();
        this.x = pv2Array;
        this.y = object2;
        this.z = oe42.A;
        this.A = oe42.B;
        this.B = oe42.C;
        this.C = oe42.D;
        this.D = object;
        this.E = object3;
        this.F = oe42.H;
        this.G = oe42.I;
        this.H = oe42.J;
        this.I = oe42.K;
        this.J = oe42.L;
        this.K = oe42.M;
        this.L = bl5;
    }

    public final oe4 a() {
        Object object = new Object();
        ((oe4)object).a = this.a;
        ((oe4)object).b = this.b;
        ((oe4)object).c = this.c;
        ((oe4)object).d = this.d;
        ((oe4)object).e = this.e;
        ((oe4)object).f = this.f;
        ((oe4)object).g = this.g;
        ((oe4)object).h = this.h;
        ((oe4)object).i = this.i;
        ((oe4)object).j = this.j;
        ((oe4)object).k = this.k;
        ((oe4)object).l = this.l;
        ((oe4)object).m = this.m;
        ((oe4)object).n = this.n;
        ((oe4)object).o = this.o;
        ((oe4)object).p = this.p;
        ((oe4)object).q = this.q;
        ((oe4)object).r = this.r;
        ((oe4)object).s = this.s;
        ((oe4)object).t = this.t;
        ((oe4)object).u = this.u;
        ((oe4)object).v = this.v;
        Object object2 = this.w;
        ((oe4)object).x = object2;
        if (object2 instanceof le4) {
            ((oe4)object).w = ((le4)object2).e;
        } else {
            ((oe4)object).y = this.x;
            object2 = this.L ? null : this.y;
            ((oe4)object).z = object2;
        }
        ((oe4)object).A = this.z;
        ((oe4)object).B = this.A;
        ((oe4)object).C = this.B;
        ((oe4)object).D = this.C;
        ((oe4)object).E = null;
        ((oe4)object).F = this.D;
        ((oe4)object).G = this.E;
        ((oe4)object).H = this.F;
        ((oe4)object).I = this.G;
        ((oe4)object).J = this.H;
        ((oe4)object).K = this.I;
        ((oe4)object).L = this.J;
        ((oe4)object).M = this.K;
        return object;
    }

    public final boolean equals(Object object) {
        block5: {
            block4: {
                if (this == object) break block4;
                if (!(object instanceof pe4)) break block5;
                object = (pe4)object;
                if (this.b != ((pe4)object).b || this.c != ((pe4)object).c || !this.a.equals(((pe4)object).a) || this.d != ((pe4)object).d || this.e != ((pe4)object).e) break block5;
                if (this.f != ((pe4)object).f) {
                    return false;
                }
                if (this.g != ((pe4)object).g || this.h != ((pe4)object).h || this.i != ((pe4)object).i || this.j != ((pe4)object).j || this.k != ((pe4)object).k || !this.l.equals(((pe4)object).l) || !this.m.equals(((pe4)object).m) || !this.n.equals(((pe4)object).n) || this.o != ((pe4)object).o || this.p != ((pe4)object).p || !this.q.equals(((pe4)object).q) || !this.r.equals(((pe4)object).r) || !this.s.equals(((pe4)object).s) || this.t != ((pe4)object).t || !this.u.equals(((pe4)object).u) || !this.v.equals(((pe4)object).v) || !this.w.equals(((pe4)object).w) || !this.x.equals(((pe4)object).x) || !this.y.equals(((pe4)object).y) || !this.z.equals(((pe4)object).z) || this.A != ((pe4)object).A || this.B != ((pe4)object).B || this.C != ((pe4)object).C || !this.D.equals(((pe4)object).D) || !this.E.equals(((pe4)object).E) || !this.F.equals(((pe4)object).F) || !this.G.equals(((pe4)object).G) || !this.H.equals(((pe4)object).H) || this.I != ((pe4)object).I || this.J != ((pe4)object).J || this.K != ((pe4)object).K) break block5;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int n16 = this.a.hashCode();
        int n17 = this.b;
        int n18 = this.c;
        int n19 = this.d;
        int n26 = this.e;
        PlaybackException playbackException = this.f;
        int n27 = playbackException == null ? 0 : playbackException.hashCode();
        int n28 = this.g;
        int n29 = this.h;
        long l16 = this.i;
        int n36 = (int)(l16 ^ l16 >>> 32);
        l16 = this.j;
        int n37 = (int)(l16 ^ l16 >>> 32);
        l16 = this.k;
        int n38 = (int)(l16 ^ l16 >>> 32);
        int n39 = this.l.hashCode();
        int n46 = this.m.hashCode();
        int n47 = this.n.hashCode();
        int n48 = Float.floatToRawIntBits(this.o);
        int n49 = Float.floatToRawIntBits(this.p);
        int n56 = this.q.hashCode();
        int n57 = this.r.hashCode();
        int n58 = this.s.hashCode();
        int n59 = this.t;
        int n66 = this.u.hashCode();
        int n67 = this.v.hashCode();
        int n68 = this.w.hashCode();
        int n69 = this.x.a.hashCode();
        int n76 = this.y.hashCode();
        int n77 = this.z.hashCode();
        int n78 = this.A;
        int n79 = this.B;
        int n86 = this.C;
        int n87 = this.D.hashCode();
        int n88 = this.E.hashCode();
        int n89 = this.F.hashCode();
        int n96 = this.G.hashCode();
        int n97 = this.H.hashCode();
        int n98 = this.I;
        int n99 = this.J;
        l16 = this.K;
        return (((n97 + (n96 + (n89 + (n88 + (n87 + ((((n77 + (n76 + (n69 + (n68 + (n67 + (n66 + ((n58 + (n57 + (n56 + (n49 + (n48 + (n47 + (n46 + (n39 + (((((((((((n16 + 217) * 31 + n17) * 31 + n18) * 31 + n19) * 31 + n26) * 31 + n27) * 31 + n28) * 31 + n29) * 961 + n36) * 31 + n37) * 31 + n38) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + n59) * 961) * 961) * 31) * 31) * 31) * 31) * 31 + n78) * 31 + n79) * 31 + n86) * 31) * 31) * 31) * 31) * 31) * 31 + n98) * 31 + n99) * 31 + (int)(l16 >>> 32 ^ l16);
    }
}

