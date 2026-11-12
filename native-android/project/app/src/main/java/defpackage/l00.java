package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l00 implements rn4 {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final ArrayDeque c;
    public j00 d;
    public long e;
    public long f;
    public long g;

    public l00() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new j00());
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            cn cnVar = new cn(1, this);
            k00 k00Var = new k00();
            k00Var.u = cnVar;
            arrayDeque.add(k00Var);
        }
        this.c = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    @Override // defpackage.zi0
    public void a() {
    }

    @Override // defpackage.zi0
    public final void b(long j) {
        this.g = j;
    }

    @Override // defpackage.rn4
    public final void c(long j) {
        this.e = j;
    }

    @Override // defpackage.zi0
    public final Object e() {
        rr2.w(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        j00 j00Var = (j00) arrayDeque.pollFirst();
        this.d = j00Var;
        return j00Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    @Override // defpackage.zi0
    public final void f(vn4 vn4Var) {
        rr2.l(vn4Var == this.d);
        j00 j00Var = (j00) vn4Var;
        if (j00Var.d(4)) {
            long j = this.f;
            this.f = 1 + j;
            j00Var.y = j;
            this.c.add(j00Var);
        } else {
            long j2 = j00Var.t;
            if (j2 != Long.MIN_VALUE) {
                long j3 = this.g;
                if (j3 == -9223372036854775807L || j2 >= j3) {
                    long j4 = this.f;
                    this.f = 1 + j4;
                    j00Var.y = j4;
                    this.c.add(j00Var);
                } else {
                    j00Var.r();
                    this.a.add(j00Var);
                }
            } else {
                long j5 = this.f;
                this.f = 1 + j5;
                j00Var.y = j5;
                this.c.add(j00Var);
            }
        }
        this.d = null;
    }

    @Override // defpackage.zi0
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.a;
            if (zIsEmpty) {
                break;
            }
            j00 j00Var = (j00) arrayDeque2.poll();
            String str = f35.a;
            j00Var.r();
            arrayDeque.add(j00Var);
        }
        j00 j00Var2 = this.d;
        if (j00Var2 != null) {
            j00Var2.r();
            arrayDeque.add(j00Var2);
            this.d = null;
        }
    }

    public abstract zh0 g();

    public abstract void h(j00 j00Var);

    @Override // defpackage.zi0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public wn4 d() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            j00 j00Var = (j00) arrayDeque2.peek();
            String str = f35.a;
            if (j00Var.t > this.e) {
                return null;
            }
            j00 j00Var2 = (j00) arrayDeque2.poll();
            boolean zD = j00Var2.d(4);
            ArrayDeque arrayDeque3 = this.a;
            if (zD) {
                wn4 wn4Var = (wn4) arrayDeque.pollFirst();
                wn4Var.a(4);
                j00Var2.r();
                arrayDeque3.add(j00Var2);
                return wn4Var;
            }
            h(j00Var2);
            if (j()) {
                zh0 zh0VarG = g();
                wn4 wn4Var2 = (wn4) arrayDeque.pollFirst();
                long j = j00Var2.t;
                wn4Var2.p = j;
                wn4Var2.s = zh0VarG;
                wn4Var2.t = j;
                j00Var2.r();
                arrayDeque3.add(j00Var2);
                return wn4Var2;
            }
            j00Var2.r();
            arrayDeque3.add(j00Var2);
        }
    }

    public abstract boolean j();
}
