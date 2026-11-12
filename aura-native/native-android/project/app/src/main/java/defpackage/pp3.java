package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pp3 {
    public boolean a;
    public long b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;

    public pp3(ja jaVar) {
        this.c = jaVar;
        this.d = new AtomicReference(null);
        this.e = new z(13, this);
        this.f = new kl3(11, this);
        this.g = new f13(new sh4[16]);
        this.h = new Object();
        this.b = -1L;
    }

    public static String b(Context context) {
        return context.getPackageName() + "_preferences";
    }

    public boolean a() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.h) {
            z = this.a;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = (AtomicReference) this.d;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        l80.b("Unexpected notification");
                        er1.a();
                        return false;
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                do {
                    if (atomicReference.compareAndSet(obj, obj2)) {
                        set = set2;
                        break;
                    }
                } while (atomicReference.get() == obj);
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.h) {
                f13 f13Var = (f13) this.g;
                Object[] objArr = f13Var.n;
                int i = f13Var.p;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((sh4) objArr[i2]).a(set) || z2;
                }
            }
        }
    }

    public SharedPreferences.Editor c() {
        if (!this.a) {
            return d().edit();
        }
        if (((SharedPreferences.Editor) this.e) == null) {
            this.e = d().edit();
        }
        return (SharedPreferences.Editor) this.e;
    }

    public SharedPreferences d() {
        if (((SharedPreferences) this.d) == null) {
            this.d = ((Context) this.c).getSharedPreferences((String) this.f, 0);
        }
        return (SharedPreferences) this.d;
    }

    /* JADX WARN: Code duplicated, block: B:156:0x024e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x020b  */
    /* JADX WARN: Multi-variable type inference failed */
    public void e(Object obj, if1 if1Var, gf1 gf1Var) {
        f13 f13Var;
        Object obj2;
        sh4 sh4Var;
        boolean z;
        sh4 sh4Var2;
        long j;
        long j2;
        sh4 sh4Var3;
        ch4 ox4Var;
        long j3;
        Object obj3;
        p03 p03Var;
        Object obj4;
        int i;
        long j4;
        p03 p03Var2;
        long jM = te5.m();
        synchronized (this.h) {
            f13Var = (f13) this.g;
            Object[] objArr = f13Var.n;
            int i2 = f13Var.p;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i3];
                if (((sh4) obj2).a == if1Var) {
                    break;
                } else {
                    i3++;
                }
            }
            sh4Var = (sh4) obj2;
            z = true;
            if (sh4Var == null) {
                if1Var.getClass();
                jz4.j(1, if1Var);
                sh4Var = new sh4(if1Var);
                f13Var.b(sh4Var);
            }
            sh4Var2 = (sh4) this.j;
            j = this.b;
        }
        Object obj5 = f13Var;
        if (j != -1 && j != jM) {
            obj5 = f13Var;
            String name = Thread.currentThread().getName();
            StringBuilder sb = new StringBuilder("Detected multithreaded access to SnapshotStateObserver: previousThreadId=");
            sb.append(j);
            sb.append("), currentThread={id=");
            sb.append(jM);
            sb.append(", name=");
            sb.append(name);
            sb.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            oo3.a(sb.toString());
            obj5 = sb;
        }
        try {
            obj5 = f13Var;
            synchronized (this.h) {
                try {
                    this.j = sh4Var;
                    this.b = jM;
                } catch (Throwable th) {
                    th = th;
                    j2 = obj5;
                }
            }
            kl3 kl3Var = (kl3) this.f;
            Object obj6 = sh4Var.b;
            p03 p03Var3 = sh4Var.c;
            int i4 = sh4Var.d;
            sh4Var.b = obj;
            sh4Var.c = (p03) sh4Var.f.g(obj);
            if (sh4Var.d == -1) {
                sh4Var.d = Long.hashCode(jh4.j().g());
            }
            qg1 qg1Var = sh4Var.i;
            f13 f13VarN = uc5.n();
            try {
                f13VarN.b(qg1Var);
                if (kl3Var == null) {
                    gf1Var.invoke();
                    sh4Var3 = sh4Var;
                } else {
                    ch4 ch4Var = (ch4) jh4.b.f();
                    if (ch4Var instanceof ox4) {
                        sh4Var3 = sh4Var;
                        if (((ox4) ch4Var).t == te5.m()) {
                            if1 if1Var2 = ((ox4) ch4Var).r;
                            if1 if1Var3 = ((ox4) ch4Var).s;
                            try {
                                ((ox4) ch4Var).r = jh4.k(kl3Var, if1Var2, true);
                                ((ox4) ch4Var).s = if1Var3;
                                gf1Var.invoke();
                                ((ox4) ch4Var).r = if1Var2;
                                ((ox4) ch4Var).s = if1Var3;
                            } catch (Throwable th2) {
                                ((ox4) ch4Var).r = if1Var2;
                                ((ox4) ch4Var).s = if1Var3;
                                throw th2;
                            }
                        }
                    } else {
                        sh4Var3 = sh4Var;
                    }
                    if (ch4Var == null || (ch4Var instanceof a13)) {
                        ox4Var = new ox4(ch4Var instanceof a13 ? (a13) ch4Var : null, kl3Var, null, true, false);
                    } else {
                        ox4Var = ch4Var.u(kl3Var);
                    }
                    try {
                        ch4 ch4VarJ = ox4Var.j();
                        try {
                            gf1Var.invoke();
                            ch4.q(ch4VarJ);
                            ox4Var.c();
                        } catch (Throwable th3) {
                            try {
                                ch4.q(ch4VarJ);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    ox4Var.c();
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    f13VarN.k(f13VarN.p - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                f13VarN.k(f13VarN.p - 1);
                sh4 sh4Var4 = sh4Var3;
                Object obj7 = sh4Var4.b;
                obj7.getClass();
                int i5 = sh4Var4.d;
                p03 p03Var4 = sh4Var4.c;
                if (p03Var4 != null) {
                    try {
                        long[] jArr = p03Var4.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j5 = jArr[i6];
                                boolean z2 = z;
                                p03 p03Var5 = p03Var4;
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j5 & 255) < 128) {
                                            i = i8;
                                            int i9 = (i6 << 3) + i;
                                            j4 = j5;
                                            p03Var2 = p03Var5;
                                            Object obj8 = p03Var2.b[i9];
                                            j3 = j;
                                            try {
                                                boolean z3 = p03Var2.c[i9] != i5 ? z2 : false;
                                                if (z3) {
                                                    w03 w03Var = sh4Var4.e;
                                                    te5.I(w03Var, obj8, obj7);
                                                    obj4 = obj7;
                                                    if ((obj8 instanceof dp0) && !w03Var.c(obj8)) {
                                                        te5.J(sh4Var4.l, obj8);
                                                        sh4Var4.m.remove(obj8);
                                                    }
                                                } else {
                                                    obj4 = obj7;
                                                }
                                                if (z3) {
                                                    p03Var2.f(i9);
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                j2 = j3;
                                                synchronized (this.h) {
                                                    this.j = sh4Var2;
                                                    this.b = j2;
                                                }
                                                throw th;
                                            }
                                        } else {
                                            obj4 = obj7;
                                            i = i8;
                                            j4 = j5;
                                            p03Var2 = p03Var5;
                                            j3 = j;
                                        }
                                        i8 = i + 1;
                                        long j6 = j3;
                                        p03Var5 = p03Var2;
                                        j5 = j4 >> 8;
                                        j = j6;
                                        obj7 = obj4;
                                    }
                                    obj3 = obj7;
                                    p03Var = p03Var5;
                                    j3 = j;
                                    if (i7 != 8) {
                                        break;
                                    }
                                } else {
                                    obj3 = obj7;
                                    p03Var = p03Var5;
                                    j3 = j;
                                }
                                if (i6 == length) {
                                    break;
                                }
                                i6++;
                                p03Var4 = p03Var;
                                z = z2;
                                j = j3;
                                obj7 = obj3;
                            }
                        } else {
                            j3 = j;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        j3 = j;
                        j2 = j3;
                        synchronized (this.h) {
                            this.j = sh4Var2;
                            this.b = j2;
                            throw th;
                        }
                    }
                } else {
                    j3 = j;
                }
                sh4Var4.b = obj6;
                sh4Var4.c = p03Var3;
                sh4Var4.d = i4;
                synchronized (this.h) {
                    this.j = sh4Var2;
                    this.b = j3;
                }
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Throwable th10) {
            th = th10;
            j2 = j;
        }
    }

    public pp3(Context context) {
        this.b = 0L;
        this.c = context;
        this.f = b(context);
        this.d = null;
    }
}
