package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wn3 {
    public final int a;
    public final gf1 b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final sa0[] f;
    public final v94 g;
    public final x20 h;

    public wn3(int i, gf1 gf1Var) {
        this.a = i;
        this.b = gf1Var;
        this.f = new sa0[i];
        int i2 = w94.a;
        this.g = new v94(i);
        x20 x20Var = new x20();
        if (i < 1) {
            kf2.n("capacity must be >= 1");
            throw null;
        }
        if (i > 1073741824) {
            kf2.n("capacity must be <= 2^30");
            throw null;
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        x20Var.c = i - 1;
        x20Var.d = new Object[i];
        this.h = x20Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(wd0 wd0Var) {
        vn3 vn3Var;
        int andDecrement;
        if (wd0Var instanceof vn3) {
            vn3Var = (vn3) wd0Var;
            int i = vn3Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                vn3Var.q = i - Integer.MIN_VALUE;
            } else {
                vn3Var = new vn3(this, wd0Var);
            }
        } else {
            vn3Var = new vn3(this, wd0Var);
        }
        Object obj = vn3Var.o;
        int i2 = vn3Var.q;
        if (i2 == 0) {
            kb4.X(obj);
            vn3Var.n = this;
            vn3Var.q = 1;
            v94 v94Var = this.g;
            v94Var.getClass();
            int i3 = v94Var.n;
            do {
                andDecrement = u94.t.getAndDecrement(v94Var);
            } while (andDecrement > i3);
            Object obj2 = j15.a;
            xe0 xe0Var = xe0.n;
            if (andDecrement <= 0) {
                cz czVarS = zz1.s(ya4.x(vn3Var));
                try {
                    if (!v94Var.a(czVarS)) {
                        while (true) {
                            int andDecrement2 = u94.t.getAndDecrement(v94Var);
                            if (andDecrement2 <= i3) {
                                if (andDecrement2 > 0) {
                                    czVarS.k(obj2, v94Var.o);
                                    break;
                                }
                                if (v94Var.a(czVarS)) {
                                    break;
                                }
                            }
                        }
                    }
                    Object objQ = czVarS.q();
                    if (objQ != xe0Var) {
                        objQ = obj2;
                    }
                    if (objQ == xe0Var) {
                        obj2 = objQ;
                    }
                } catch (Throwable th) {
                    czVarS.B();
                    throw th;
                }
            }
            if (obj2 == xe0Var) {
                return xe0Var;
            }
        } else {
            if (i2 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = vn3Var.n;
            kb4.X(obj);
        }
        try {
            ReentrantLock reentrantLock = this.c;
            x20 x20Var = this.h;
            reentrantLock.lock();
            try {
                if (this.e) {
                    h12.P(21, "Connection pool is closed");
                    throw null;
                }
                if (x20Var.a == x20Var.b && this.d < this.a) {
                    sa0 sa0Var = new sa0((x34) this.b.invoke());
                    sa0[] sa0VarArr = this.f;
                    int i4 = this.d;
                    this.d = i4 + 1;
                    sa0VarArr[i4] = sa0Var;
                    x20Var.a(sa0Var);
                }
                int i5 = x20Var.a;
                if (i5 == x20Var.b) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                Object[] objArr = (Object[]) x20Var.d;
                Object obj3 = objArr[i5];
                objArr[i5] = null;
                x20Var.a = (i5 + 1) & x20Var.c;
                sa0 sa0Var2 = (sa0) obj3;
                reentrantLock.unlock();
                return sa0Var2;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            this.g.c();
            throw th3;
        }
    }

    public final void b() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (sa0 sa0Var : this.f) {
                if (sa0Var != null) {
                    sa0Var.close();
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void c(StringBuilder sb) {
        x20 x20Var = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            qb2 qb2VarR = gb.r();
            int i = (x20Var.b - x20Var.a) & x20Var.c;
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 >= 0) {
                    int i3 = x20Var.b;
                    int i4 = x20Var.a;
                    int i5 = x20Var.c;
                    if (i2 < ((i3 - i4) & i5)) {
                        Object obj = ((Object[]) x20Var.d)[(i4 + i2) & i5];
                        obj.getClass();
                        qb2VarR.add(obj);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            qb2 qb2VarF = gb.f(qb2VarR);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.a + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            v94 v94Var = this.g;
            v94Var.getClass();
            sb2.append(Math.max(u94.t.get(v94Var), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + qb2VarF.a() + ")[" + q40.B0(qb2VarF, null, null, null, null, 63) + "], ");
            sb.append(")");
            sb.append('\n');
            sa0[] sa0VarArr = this.f;
            int length = sa0VarArr.length;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                sa0 sa0Var = sa0VarArr[i7];
                i6++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i6);
                sb3.append("] - ");
                sb3.append(sa0Var != null ? sa0Var.n.toString() : null);
                sb.append(sb3.toString());
                sb.append('\n');
                if (sa0Var != null) {
                    sa0Var.j(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(sa0 sa0Var) {
        sa0Var.getClass();
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.a(sa0Var);
            reentrantLock.unlock();
            this.g.c();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
