package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bv3 implements gy, Cloneable {
    public volatile boolean A;
    public volatile y10 B;
    public final CopyOnWriteArrayList C;
    public final o83 n;
    public final oz3 o;
    public final dv3 p;
    public final av3 q;
    public final AtomicBoolean r;
    public Object s;
    public s21 t;
    public cv3 u;
    public boolean v;
    public y10 w;
    public boolean x;
    public boolean y;
    public boolean z;

    public bv3(o83 o83Var, oz3 oz3Var) {
        o83Var.getClass();
        oz3Var.getClass();
        this.n = o83Var;
        this.o = oz3Var;
        this.p = (dv3) o83Var.E.o;
        o83Var.d.getClass();
        av3 av3Var = new av3(this);
        av3Var.g(o83Var.w, TimeUnit.MILLISECONDS);
        this.q = av3Var;
        this.r = new AtomicBoolean();
        this.z = true;
        this.C = new CopyOnWriteArrayList();
    }

    public static final String a(bv3 bv3Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(bv3Var.A ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(bv3Var.o.a.i());
        return sb.toString();
    }

    public final IOException b(IOException iOException) {
        IOException interruptedIOException;
        Socket socketH;
        tl1 tl1Var = ze5.a;
        cv3 cv3Var = this.u;
        if (cv3Var != null) {
            synchronized (cv3Var) {
                socketH = h();
            }
            if (this.u == null) {
                if (socketH != null) {
                    ze5.c(socketH);
                }
            } else if (socketH != null) {
                kf2.o("Check failed.");
                return null;
            }
        }
        if (!this.v && this.q.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            interruptedIOException.getClass();
        }
        return interruptedIOException;
    }

    public final k14 c() {
        if (!this.r.compareAndSet(false, true)) {
            kf2.o("Already Executed");
            return null;
        }
        this.q.h();
        qg3 qg3Var = qg3.a;
        this.s = qg3.a.g();
        try {
            na4 na4Var = this.n.a;
            synchronized (na4Var) {
                ((ArrayDeque) na4Var.q).add(this);
            }
            k14 k14VarE = e();
            na4 na4Var2 = this.n.a;
            na4Var2.getClass();
            na4Var2.p((ArrayDeque) na4Var2.q, this);
            return k14VarE;
        } catch (Throwable th) {
            na4 na4Var3 = this.n.a;
            na4Var3.getClass();
            na4Var3.p((ArrayDeque) na4Var3.q, this);
            throw th;
        }
    }

    public final void cancel() {
        if (this.A) {
            return;
        }
        this.A = true;
        y10 y10Var = this.B;
        if (y10Var != null) {
            ((r21) y10Var.f).cancel();
        }
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            ((q34) it.next()).cancel();
        }
    }

    public final Object clone() {
        return new bv3(this.n, this.o);
    }

    public final void d(boolean z) {
        y10 y10Var;
        synchronized (this) {
            if (!this.z) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (y10Var = this.B) != null) {
            ((r21) y10Var.f).cancel();
            ((bv3) y10Var.d).f(y10Var, true, true, null);
        }
        this.w = null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x007f  */
    public final k14 e() throws Throwable {
        ArrayList arrayList = new ArrayList();
        v40.n0(this.n.b, arrayList);
        arrayList.add(new xu(this.n));
        arrayList.add(new xu(this.n.j));
        int i = 1;
        arrayList.add(new xu(i, this.n.k));
        arrayList.add(u90.b);
        v40.n0(this.n.c, arrayList);
        arrayList.add(new u90(i));
        oz3 oz3Var = this.o;
        o83 o83Var = this.n;
        try {
            k14 k14VarB = new ev3(this, arrayList, 0, null, oz3Var, o83Var.x, o83Var.y, o83Var.z).b(this.o);
            if (this.A) {
                xe5.b(k14VarB);
                throw new IOException("Canceled");
            }
            g(null);
            return k14VarB;
        } catch (IOException e) {
            try {
                IOException iOExceptionG = g(e);
                iOExceptionG.getClass();
                throw iOExceptionG;
            } catch (Throwable th) {
                th = th;
                if (i == 0) {
                    g(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i = 0;
            if (i == 0) {
                g(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0020 A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:8:0x0011, B:17:0x0020, B:19:0x0024, B:20:0x0026, B:22:0x002a, B:27:0x0033, B:29:0x0037, B:14:0x001a), top: B:53:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0024 A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:8:0x0011, B:17:0x0020, B:19:0x0024, B:20:0x0026, B:22:0x002a, B:27:0x0033, B:29:0x0037, B:14:0x001a), top: B:53:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0030  */
    public final IOException f(y10 y10Var, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        y10Var.getClass();
        if (y10Var.equals(this.B)) {
            synchronized (this) {
                z3 = false;
                if (z) {
                    try {
                        if (this.x) {
                            if (z) {
                                this.x = false;
                            }
                            if (z2) {
                                this.y = false;
                            }
                            z5 = this.x;
                            if (z5) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            if (!z5) {
                                z3 = true;
                            }
                            z4 = z3;
                            z3 = z6;
                        } else if (z2 || !this.y) {
                            z4 = false;
                        } else {
                            if (z) {
                                this.x = false;
                            }
                            if (z2) {
                                this.y = false;
                            }
                            z5 = this.x;
                            if (z5 || this.y) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            if (!z5 && !this.y && !this.z) {
                                z3 = true;
                            }
                            z4 = z3;
                            z3 = z6;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z2) {
                    }
                    z4 = false;
                }
            }
            if (z3) {
                this.B = null;
                cv3 cv3Var = this.u;
                if (cv3Var != null) {
                    synchronized (cv3Var) {
                        cv3Var.p++;
                    }
                }
            }
            if (z4) {
                return b(iOException);
            }
        }
        return iOException;
    }

    public final IOException g(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.z) {
                this.z = false;
                if (!this.x && !this.y) {
                    z = true;
                }
            }
        }
        return z ? b(iOException) : iOException;
    }

    public final Socket h() {
        cv3 cv3Var = this.u;
        cv3Var.getClass();
        tl1 tl1Var = ze5.a;
        ArrayList arrayList = cv3Var.s;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (h12.c(((Reference) obj).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            kf2.o("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.u = null;
        if (arrayList.isEmpty()) {
            cv3Var.t = System.nanoTime();
            dv3 dv3Var = this.p;
            ConcurrentLinkedQueue concurrentLinkedQueue = dv3Var.f;
            tl1 tl1Var2 = ze5.a;
            if (!cv3Var.m) {
                dv3Var.d.d(dv3Var.e, 0L);
                return null;
            }
            cv3Var.m = true;
            concurrentLinkedQueue.remove(cv3Var);
            if (concurrentLinkedQueue.isEmpty()) {
                dv3Var.d.a();
            }
            f6 f6Var = cv3Var.d.a;
            f6Var.getClass();
            if (dv3Var.c.get(f6Var) == null) {
                Socket socket = cv3Var.f;
                socket.getClass();
                return socket;
            }
            kf2.k();
        }
        return null;
    }
}
