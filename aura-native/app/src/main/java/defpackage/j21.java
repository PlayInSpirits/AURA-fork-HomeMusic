package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class j21 implements Runnable, Comparable, as0 {
    private volatile Object _heap;
    public long n;
    public int o = -1;

    public j21(long j) {
        this.n = j;
    }

    @Override // defpackage.as0
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                f01 f01Var = hw.b;
                if (obj == f01Var) {
                    return;
                }
                k21 k21Var = obj instanceof k21 ? (k21) obj : null;
                if (k21Var != null) {
                    synchronized (k21Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof lt4 ? (lt4) obj2 : null) != null) {
                            k21Var.b(this.o);
                        }
                    }
                }
                this._heap = f01Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b(long j, k21 k21Var, l21 l21Var) {
        synchronized (this) {
            if (this._heap == hw.b) {
                return 2;
            }
            synchronized (k21Var) {
                try {
                    j21[] j21VarArr = k21Var.a;
                    j21 j21Var = j21VarArr != null ? j21VarArr[0] : null;
                    if (l21.v.get(l21Var) != 0) {
                        return 1;
                    }
                    if (j21Var == null) {
                        k21Var.c = j;
                    } else {
                        long j2 = j21Var.n;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - k21Var.c > 0) {
                            k21Var.c = j;
                        }
                    }
                    long j3 = this.n;
                    long j4 = k21Var.c;
                    if (j3 - j4 < 0) {
                        this.n = j4;
                    }
                    k21Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.n - ((j21) obj).n;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(k21 k21Var) {
        if (this._heap != hw.b) {
            this._heap = k21Var;
        } else {
            kf2.n("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.n + ']';
    }
}
