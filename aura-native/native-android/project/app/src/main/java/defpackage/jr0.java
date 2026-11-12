package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jr0 implements Closeable, Flushable {
    public static final ux3 G = new ux3("[a-z0-9_-]{1,120}");
    public static final String H = "CLEAN";
    public static final String I = "DIRTY";
    public static final String J = "REMOVE";
    public static final String K = "READ";
    public boolean A;
    public boolean B;
    public boolean C;
    public long D;
    public final fr4 E;
    public final gr0 F;
    public final ge3 n;
    public final hr0 o;
    public final long p;
    public final ge3 q;
    public final ge3 r;
    public final ge3 s;
    public long t;
    public wu3 u;
    public final LinkedHashMap v;
    public int w;
    public boolean x;
    public boolean y;
    public boolean z;

    public jr0(b71 b71Var, ge3 ge3Var, gr4 gr4Var) {
        b71Var.getClass();
        gr4Var.getClass();
        this.n = ge3Var;
        this.o = new hr0(b71Var);
        this.p = 10485760L;
        this.v = new LinkedHashMap(0, 0.75f, true);
        this.E = gr4Var.e();
        this.F = new gr0(this, b11.q(new StringBuilder(), ze5.c, " Cache"), 0);
        this.q = ge3Var.d("journal");
        this.r = ge3Var.d("journal.tmp");
        this.s = ge3Var.d("journal.bkp");
    }

    public static void R(String str) {
        if (G.a(str)) {
            return;
        }
        er1.k(str, "keys must match regex [a-z0-9_-]{1,120}: \"");
    }

    public final void F() throws Throwable {
        ej4 ej4VarK = this.o.k(this.q);
        ej4VarK.getClass();
        xu3 xu3Var = new xu3(ej4VarK);
        try {
            String strT = xu3Var.t(Long.MAX_VALUE);
            String strT2 = xu3Var.t(Long.MAX_VALUE);
            String strT3 = xu3Var.t(Long.MAX_VALUE);
            String strT4 = xu3Var.t(Long.MAX_VALUE);
            String strT5 = xu3Var.t(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strT) || !"1".equals(strT2) || !h12.c(String.valueOf(201105), strT3) || !h12.c(String.valueOf(2), strT4) || strT5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strT + ", " + strT2 + ", " + strT4 + ", " + strT5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    H(xu3Var.t(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.w = i - this.v.size();
                    if (xu3Var.l()) {
                        wu3 wu3Var = this.u;
                        if (wu3Var != null) {
                            xe5.b(wu3Var);
                        }
                        this.u = u();
                    } else {
                        J();
                    }
                    try {
                        xu3Var.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                xu3Var.close();
            } catch (Throwable th3) {
                j51.d(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public final void H(String str) throws IOException {
        String strSubstring;
        int iR0 = qm4.r0(str, ' ', 0, 6);
        if (iR0 == -1) {
            mj0.i("unexpected journal line: ".concat(str));
            return;
        }
        int i = iR0 + 1;
        int iR1 = qm4.r0(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.v;
        if (iR1 == -1) {
            strSubstring = str.substring(i);
            String str2 = J;
            if (iR0 == str2.length() && xm4.k0(str, str2, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iR1);
        }
        dr0 dr0Var = (dr0) linkedHashMap.get(strSubstring);
        if (dr0Var == null) {
            dr0Var = new dr0(this, strSubstring);
            linkedHashMap.put(strSubstring, dr0Var);
        }
        if (iR1 != -1) {
            String str3 = H;
            if (iR0 == str3.length() && xm4.k0(str, str3, false)) {
                List listD0 = qm4.D0(str.substring(iR1 + 1), new char[]{' '});
                dr0Var.e = true;
                dr0Var.g = null;
                int size = listD0.size();
                dr0Var.j.getClass();
                if (size != 2) {
                    tb4.d(listD0, "unexpected journal line: ");
                    return;
                }
                try {
                    int size2 = listD0.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        dr0Var.b[i2] = Long.parseLong((String) listD0.get(i2));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    tb4.d(listD0, "unexpected journal line: ");
                    return;
                }
            }
        }
        if (iR1 == -1) {
            String str4 = I;
            if (iR0 == str4.length() && xm4.k0(str, str4, false)) {
                dr0Var.g = new ll(this, dr0Var);
                return;
            }
        }
        if (iR1 == -1) {
            String str5 = K;
            if (iR0 == str5.length() && xm4.k0(str, str5, false)) {
                return;
            }
        }
        mj0.i("unexpected journal line: ".concat(str));
    }

    public final synchronized void J() {
        Throwable th;
        try {
            wu3 wu3Var = this.u;
            if (wu3Var != null) {
                wu3Var.close();
            }
            of4 of4VarJ = this.o.j(this.r);
            of4VarJ.getClass();
            wu3 wu3Var2 = new wu3(of4VarJ);
            try {
                wu3Var2.y("libcore.io.DiskLruCache");
                wu3Var2.writeByte(10);
                wu3Var2.y("1");
                wu3Var2.writeByte(10);
                wu3Var2.Q(201105L);
                wu3Var2.writeByte(10);
                wu3Var2.Q(2L);
                wu3Var2.writeByte(10);
                wu3Var2.writeByte(10);
                for (dr0 dr0Var : this.v.values()) {
                    if (dr0Var.g != null) {
                        wu3Var2.y(I);
                        wu3Var2.writeByte(32);
                        wu3Var2.y(dr0Var.a);
                        wu3Var2.writeByte(10);
                    } else {
                        wu3Var2.y(H);
                        wu3Var2.writeByte(32);
                        wu3Var2.y(dr0Var.a);
                        for (long j : dr0Var.b) {
                            wu3Var2.writeByte(32);
                            wu3Var2.Q(j);
                        }
                        wu3Var2.writeByte(10);
                    }
                }
                try {
                    wu3Var2.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    wu3Var2.close();
                } catch (Throwable th4) {
                    j51.d(th3, th4);
                }
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            boolean zE = this.o.e(this.q);
            hr0 hr0Var = this.o;
            if (zE) {
                hr0Var.b(this.q, this.s);
                this.o.b(this.r, this.q);
                xe5.d(this.o, this.s);
            } else {
                hr0Var.b(this.r, this.q);
            }
            wu3 wu3Var3 = this.u;
            if (wu3Var3 != null) {
                xe5.b(wu3Var3);
            }
            this.u = u();
            this.x = false;
            this.C = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final void K(dr0 dr0Var) {
        wu3 wu3Var;
        String str = dr0Var.a;
        if (!this.y) {
            if (dr0Var.h > 0 && (wu3Var = this.u) != null) {
                wu3Var.y(I);
                wu3Var.writeByte(32);
                wu3Var.y(str);
                wu3Var.writeByte(10);
                wu3Var.flush();
            }
            if (dr0Var.h > 0 || dr0Var.g != null) {
                dr0Var.f = true;
                return;
            }
        }
        ll llVar = dr0Var.g;
        if (llVar != null) {
            llVar.d();
        }
        for (int i = 0; i < 2; i++) {
            xe5.d(this.o, (ge3) dr0Var.c.get(i));
            long j = this.t;
            long[] jArr = dr0Var.b;
            this.t = j - jArr[i];
            jArr[i] = 0;
        }
        this.w++;
        wu3 wu3Var2 = this.u;
        if (wu3Var2 != null) {
            wu3Var2.y(J);
            wu3Var2.writeByte(32);
            wu3Var2.y(str);
            wu3Var2.writeByte(10);
        }
        this.v.remove(str);
        if (s()) {
            this.E.d(this.F, 0L);
        }
    }

    public final void M() {
        while (this.t > this.p) {
            for (dr0 dr0Var : this.v.values()) {
                if (!dr0Var.f) {
                    K(dr0Var);
                }
            }
            return;
        }
        this.B = false;
    }

    public final synchronized void b() {
        if (this.A) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.z && !this.A) {
                Collection collectionValues = this.v.values();
                collectionValues.getClass();
                for (dr0 dr0Var : (dr0[]) collectionValues.toArray(new dr0[0])) {
                    ll llVar = dr0Var.g;
                    if (llVar != null) {
                        llVar.d();
                    }
                }
                M();
                wu3 wu3Var = this.u;
                if (wu3Var != null) {
                    xe5.b(wu3Var);
                }
                this.u = null;
                this.A = true;
                return;
            }
            this.A = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f(ll llVar, boolean z) {
        dr0 dr0Var = (dr0) llVar.p;
        if (!h12.c(dr0Var.g, llVar)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z && !dr0Var.e) {
            for (int i = 0; i < 2; i++) {
                boolean[] zArr = (boolean[]) llVar.q;
                zArr.getClass();
                if (!zArr[i]) {
                    llVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!this.o.e((ge3) dr0Var.d.get(i))) {
                    llVar.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            ge3 ge3Var = (ge3) dr0Var.d.get(i2);
            if (!z || dr0Var.f) {
                xe5.d(this.o, ge3Var);
            } else if (this.o.e(ge3Var)) {
                ge3 ge3Var2 = (ge3) dr0Var.c.get(i2);
                this.o.b(ge3Var, ge3Var2);
                long j = dr0Var.b[i2];
                Long l = (Long) this.o.g(ge3Var2).e;
                long jLongValue = l != null ? l.longValue() : 0L;
                dr0Var.b[i2] = jLongValue;
                this.t = (this.t - j) + jLongValue;
            }
        }
        dr0Var.g = null;
        if (dr0Var.f) {
            K(dr0Var);
            return;
        }
        this.w++;
        wu3 wu3Var = this.u;
        wu3Var.getClass();
        if (dr0Var.e || z) {
            dr0Var.e = true;
            wu3Var.y(H);
            wu3Var.writeByte(32);
            wu3Var.y(dr0Var.a);
            for (long j2 : dr0Var.b) {
                wu3Var.writeByte(32);
                wu3Var.Q(j2);
            }
            wu3Var.writeByte(10);
            if (z) {
                long j3 = this.D;
                this.D = 1 + j3;
                dr0Var.i = j3;
            }
        } else {
            this.v.remove(dr0Var.a);
            wu3Var.y(J);
            wu3Var.writeByte(32);
            wu3Var.y(dr0Var.a);
            wu3Var.writeByte(10);
        }
        wu3Var.flush();
        if (this.t > this.p || s()) {
            this.E.d(this.F, 0L);
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.z) {
            b();
            M();
            wu3 wu3Var = this.u;
            wu3Var.getClass();
            wu3Var.flush();
        }
    }

    public final synchronized ll j(String str, long j) {
        str.getClass();
        q();
        b();
        R(str);
        dr0 dr0Var = (dr0) this.v.get(str);
        if (j != -1 && (dr0Var == null || dr0Var.i != j)) {
            return null;
        }
        if ((dr0Var != null ? dr0Var.g : null) != null) {
            return null;
        }
        if (dr0Var != null && dr0Var.h != 0) {
            return null;
        }
        if (!this.B && !this.C) {
            wu3 wu3Var = this.u;
            wu3Var.getClass();
            wu3Var.y(I);
            wu3Var.writeByte(32);
            wu3Var.y(str);
            wu3Var.writeByte(10);
            wu3Var.flush();
            if (this.x) {
                return null;
            }
            if (dr0Var == null) {
                dr0Var = new dr0(this, str);
                this.v.put(str, dr0Var);
            }
            ll llVar = new ll(this, dr0Var);
            dr0Var.g = llVar;
            return llVar;
        }
        this.E.d(this.F, 0L);
        return null;
    }

    public final synchronized fr0 n(String str) {
        str.getClass();
        q();
        b();
        R(str);
        dr0 dr0Var = (dr0) this.v.get(str);
        if (dr0Var == null) {
            return null;
        }
        fr0 fr0VarA = dr0Var.a();
        if (fr0VarA == null) {
            return null;
        }
        this.w++;
        wu3 wu3Var = this.u;
        wu3Var.getClass();
        wu3Var.y(K);
        wu3Var.writeByte(32);
        wu3Var.y(str);
        wu3Var.writeByte(10);
        if (s()) {
            this.E.d(this.F, 0L);
        }
        return fr0VarA;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006b A[Catch: all -> 0x0033, TRY_ENTER, TryCatch #3 {all -> 0x0033, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0015, B:13:0x0023, B:14:0x002d, B:17:0x0036, B:38:0x0071, B:40:0x007d, B:50:0x00c3, B:44:0x0088, B:46:0x00bc, B:48:0x00c0, B:49:0x00c2, B:37:0x006b, B:53:0x00ca, B:28:0x005a, B:25:0x0055, B:45:0x00b2, B:19:0x0046), top: B:61:0x0003, inners: #1, #5, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ca A[Catch: all -> 0x0033, TRY_ENTER, TryCatch #3 {all -> 0x0033, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0015, B:13:0x0023, B:14:0x002d, B:17:0x0036, B:38:0x0071, B:40:0x007d, B:50:0x00c3, B:44:0x0088, B:46:0x00bc, B:48:0x00c0, B:49:0x00c2, B:37:0x006b, B:53:0x00ca, B:28:0x005a, B:25:0x0055, B:45:0x00b2, B:19:0x0046), top: B:61:0x0003, inners: #1, #5, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final synchronized void q() {
        boolean z;
        try {
            tl1 tl1Var = ze5.a;
            if (this.z) {
                return;
            }
            if (this.o.e(this.s)) {
                boolean zE = this.o.e(this.q);
                hr0 hr0Var = this.o;
                ge3 ge3Var = this.s;
                if (zE) {
                    hr0Var.getClass();
                    ge3Var.getClass();
                    hr0Var.d(ge3Var);
                } else {
                    hr0Var.b(ge3Var, this.q);
                }
            }
            hr0 hr0Var2 = this.o;
            ge3 ge3Var2 = this.s;
            hr0Var2.getClass();
            ge3Var2.getClass();
            of4 of4VarJ = hr0Var2.j(ge3Var2);
            try {
                hr0Var2.c.d(ge3Var2);
                if (of4VarJ != null) {
                    try {
                        of4VarJ.close();
                    } catch (Throwable unused) {
                    }
                }
                z = true;
            } catch (IOException unused2) {
                if (of4VarJ != null) {
                    try {
                        of4VarJ.close();
                    } catch (Throwable th) {
                        th = th;
                        th = th;
                        if (th != null) {
                            throw th;
                        }
                        hr0Var2.c.d(ge3Var2);
                        z = false;
                        this.y = z;
                        if (this.o.e(this.q)) {
                            try {
                                F();
                                v();
                                this.z = true;
                                return;
                            } catch (IOException e) {
                                qg3 qg3Var = qg3.a;
                                qg3 qg3Var2 = qg3.a;
                                String str = "DiskLruCache " + this.n + " is corrupt: " + e.getMessage() + ", removing";
                                qg3Var2.getClass();
                                qg3.i(str, 5, e);
                                try {
                                    close();
                                    xe5.c(this.o, this.n);
                                    this.A = false;
                                    J();
                                    this.z = true;
                                } catch (Throwable th2) {
                                    this.A = false;
                                    throw th2;
                                }
                            }
                        }
                        J();
                        this.z = true;
                    }
                }
                th = null;
                th = th;
                if (th != null) {
                    throw th;
                }
                hr0Var2.c.d(ge3Var2);
                z = false;
            } catch (Throwable th3) {
                th = th3;
                if (of4VarJ != null) {
                    try {
                        of4VarJ.close();
                    } catch (Throwable th4) {
                        j51.d(th, th4);
                    }
                }
                if (th != null) {
                    throw th;
                }
                hr0Var2.c.d(ge3Var2);
                z = false;
                this.y = z;
                if (this.o.e(this.q)) {
                    F();
                    v();
                    this.z = true;
                    return;
                }
                J();
                this.z = true;
            }
            this.y = z;
            if (this.o.e(this.q)) {
                F();
                v();
                this.z = true;
                return;
            }
            J();
            this.z = true;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final boolean s() {
        int i = this.w;
        return i >= 2000 && i >= this.v.size();
    }

    public final wu3 u() {
        hr0 hr0Var = this.o;
        hr0Var.getClass();
        ge3 ge3Var = this.q;
        ge3Var.getClass();
        return new wu3(new f61(hr0Var.c.a(ge3Var), new ir0(0, this)));
    }

    public final void v() {
        ge3 ge3Var = this.r;
        hr0 hr0Var = this.o;
        xe5.d(hr0Var, ge3Var);
        Iterator it = this.v.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            dr0 dr0Var = (dr0) next;
            int i = 0;
            if (dr0Var.g == null) {
                while (i < 2) {
                    this.t += dr0Var.b[i];
                    i++;
                }
            } else {
                dr0Var.g = null;
                while (i < 2) {
                    xe5.d(hr0Var, (ge3) dr0Var.c.get(i));
                    xe5.d(hr0Var, (ge3) dr0Var.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }
}
