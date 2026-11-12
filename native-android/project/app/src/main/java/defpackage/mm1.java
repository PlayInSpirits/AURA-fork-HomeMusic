package defpackage;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager$PriorityTooLowException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mm1 implements du0 {
    public final long a;
    public final long b;
    public final ii0 c;
    public final ce3 d;
    public final ArrayList e;
    public final kx f;
    public final se4 g;
    public final px h;
    public final Executor i;
    public final long j;
    public final ArrayList k;
    public volatile boolean l;

    public mm1(gn2 gn2Var, ce3 ce3Var, kx kxVar, Executor executor, long j, long j2, long j3) {
        bn2 bn2Var = gn2Var.b;
        bn2Var.getClass();
        this.c = d(bn2Var.a);
        this.d = ce3Var;
        this.e = new ArrayList(bn2Var.e);
        this.f = kxVar;
        this.i = executor;
        this.a = j2;
        this.b = j3;
        se4 se4Var = kxVar.n;
        se4Var.getClass();
        this.g = se4Var;
        this.h = kxVar.p;
        this.k = new ArrayList();
        this.j = f35.Q(j);
    }

    public static void c(ym1 ym1Var, vm1 vm1Var, HashSet hashSet, ArrayList arrayList) {
        String str = ym1Var.a;
        long j = ym1Var.h + vm1Var.r;
        String str2 = vm1Var.t;
        if (str2 != null) {
            Uri uriH = jz4.H(str, str2);
            if (hashSet.add(uriH)) {
                arrayList.add(new x84(j, d(uriH)));
            }
        }
        arrayList.add(new x84(j, new ii0(jz4.H(str, vm1Var.n), vm1Var.v, vm1Var.w)));
    }

    public static ii0 d(Uri uri) {
        Map map = Collections.EMPTY_MAP;
        rr2.s(uri, "The uri must be set.");
        return new ii0(uri, 0L, 1, null, map, 0L, -1L, null, 1);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    public static void g(ArrayList arrayList, px pxVar, long j) {
        HashMap map = new HashMap();
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            x84 x84Var = (x84) arrayList.get(i2);
            ii0 ii0Var = x84Var.o;
            String strD = pxVar.d(ii0Var);
            Integer num = (Integer) map.get(strD);
            x84 x84Var2 = num == null ? null : (x84) arrayList.get(num.intValue());
            if (x84Var2 != null) {
                long j2 = x84Var2.n;
                ii0 ii0Var2 = x84Var2.o;
                if (x84Var.n <= j2 + j) {
                    Uri uri = ii0Var2.a;
                    long j3 = ii0Var2.g;
                    if (!uri.equals(ii0Var.a)) {
                        map.put(strD, Integer.valueOf(i));
                        arrayList.set(i, x84Var);
                        i++;
                    } else if (j3 != -1 && ii0Var2.f + j3 == ii0Var.f && Objects.equals(ii0Var2.h, ii0Var.h) && ii0Var2.i == ii0Var.i && ii0Var2.c == ii0Var.c && ii0Var2.e.equals(ii0Var.e)) {
                        long j4 = ii0Var.g;
                        ii0 ii0VarB = ii0Var2.b(0L, j4 != -1 ? j3 + j4 : -1L);
                        num.getClass();
                        arrayList.set(num.intValue(), new x84(j2, ii0VarB));
                    } else {
                        map.put(strD, Integer.valueOf(i));
                        arrayList.set(i, x84Var);
                        i++;
                    }
                } else {
                    map.put(strD, Integer.valueOf(i));
                    arrayList.set(i, x84Var);
                    i++;
                }
            } else {
                map.put(strD, Integer.valueOf(i));
                arrayList.set(i, x84Var);
                i++;
            }
        }
        f35.X(arrayList, i, arrayList.size());
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.du0
    public final void a(kt0 kt0Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        lx lxVarB;
        byte[] bArr;
        boolean z;
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        try {
            lx lxVarB2 = this.f.b();
            dn1 dn1VarE = e(lxVarB2, this.c, false);
            if (!this.e.isEmpty()) {
                dn1VarE = (dn1) dn1VarE.a(this.e);
            }
            ArrayList arrayListF = f(lxVarB2, dn1VarE, false);
            Collections.sort(arrayListF);
            g(arrayListF, this.h, this.j);
            int size = arrayListF.size();
            int i = 0;
            long j = 0;
            long j2 = 0;
            for (int size2 = arrayListF.size() - 1; size2 >= 0; size2--) {
                ii0 ii0Var = ((x84) arrayListF.get(size2)).o;
                String strD = this.h.d(ii0Var);
                long j3 = ii0Var.g;
                if (j3 == -1) {
                    long jA = nd0.a(this.g.i(strD));
                    if (jA != -1) {
                        j3 = jA - ii0Var.f;
                    }
                }
                long j4 = j3;
                long jG = this.g.g(ii0Var.f, j4, strD);
                j2 += jG;
                if (j4 != -1) {
                    if (j4 == jG) {
                        i++;
                        arrayListF.remove(size2);
                    }
                    if (j != -1) {
                        j += j4;
                    }
                } else {
                    j = -1;
                }
            }
            w84 w84Var = new w84(kt0Var, j, size, j2, i);
            arrayDeque.addAll(arrayListF);
            while (!this.l && !arrayDeque.isEmpty()) {
                if (arrayDeque2.isEmpty()) {
                    lxVarB = this.f.b();
                    bArr = new byte[131072];
                } else {
                    y84 y84Var = (y84) arrayDeque2.removeFirst();
                    lxVarB = y84Var.v;
                    bArr = y84Var.x;
                }
                y84 y84Var2 = new y84((x84) arrayDeque.removeFirst(), lxVarB, w84Var, bArr);
                b(y84Var2);
                this.i.execute(y84Var2);
                for (int size3 = this.k.size() - 1; size3 >= 0; size3--) {
                    y84 y84Var3 = (y84) this.k.get(size3);
                    if (arrayDeque.isEmpty()) {
                        y84Var3.get();
                        h(size3);
                        arrayDeque2.addLast(y84Var3);
                    } else {
                        q90 q90Var = y84Var3.o;
                        synchronized (q90Var) {
                            z = q90Var.b;
                        }
                        if (z) {
                            try {
                                y84Var3.get();
                                h(size3);
                                arrayDeque2.addLast(y84Var3);
                            } catch (ExecutionException e) {
                                Throwable cause = e.getCause();
                                cause.getClass();
                                if (!(cause instanceof PriorityTaskManager$PriorityTooLowException)) {
                                    if (!(cause instanceof IOException)) {
                                        throw cause;
                                    }
                                    throw ((IOException) cause);
                                }
                                arrayDeque.addFirst(y84Var3.u);
                                h(size3);
                                arrayDeque2.addLast(y84Var3);
                            }
                        } else {
                            continue;
                        }
                    }
                }
                y84Var2.n.b();
            }
            int i2 = 0;
            while (true) {
                int size4 = this.k.size();
                arrayList2 = this.k;
                if (i2 >= size4) {
                    break;
                }
                ((w34) arrayList2.get(i2)).cancel(true);
                i2++;
            }
            for (int size5 = arrayList2.size() - 1; size5 >= 0; size5--) {
                ((w34) this.k.get(size5)).a();
                h(size5);
            }
        } catch (Throwable th) {
            int i3 = 0;
            while (true) {
                int size6 = this.k.size();
                arrayList = this.k;
                if (i3 >= size6) {
                    break;
                }
                ((w34) arrayList.get(i3)).cancel(true);
                i3++;
            }
            for (int size7 = arrayList.size() - 1; size7 >= 0; size7--) {
                ((w34) this.k.get(size7)).a();
                h(size7);
            }
            throw th;
        }
    }

    public final void b(w34 w34Var) {
        synchronized (this.k) {
            try {
                if (this.l) {
                    throw new InterruptedException();
                }
                this.k.add(w34Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.du0
    public final void cancel() {
        synchronized (this.k) {
            try {
                this.l = true;
                for (int i = 0; i < this.k.size(); i++) {
                    ((w34) this.k.get(i)).cancel(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final dn1 e(lx lxVar, ii0 ii0Var, boolean z) throws ExecutionException, InterruptedException, IOException {
        Object obj;
        if (!z) {
            while (!this.l) {
                v84 v84Var = new v84(this, lxVar, ii0Var);
                b(v84Var);
                this.i.execute(v84Var);
                try {
                    Object obj2 = v84Var.get();
                    v84Var.a();
                    i(v84Var);
                    obj = obj2;
                } catch (ExecutionException e) {
                    try {
                        Throwable cause = e.getCause();
                        cause.getClass();
                        if (!(cause instanceof PriorityTaskManager$PriorityTooLowException)) {
                            if (cause instanceof IOException) {
                                throw ((IOException) cause);
                            }
                            String str = f35.a;
                            throw e;
                        }
                        v84Var.a();
                        i(v84Var);
                    } catch (Throwable th) {
                        v84Var.a();
                        i(v84Var);
                        throw th;
                    }
                }
            }
            throw new InterruptedException();
        }
        v84 v84Var2 = new v84(this, lxVar, ii0Var);
        v84Var2.run();
        try {
            obj = v84Var2.get();
        } catch (ExecutionException e2) {
            Throwable cause2 = e2.getCause();
            cause2.getClass();
            if (cause2 instanceof IOException) {
                throw ((IOException) cause2);
            }
            String str2 = f35.a;
            throw e2;
        }
        return (dn1) obj;
    }

    public final ArrayList f(lx lxVar, dn1 dn1Var, boolean z) throws IOException {
        ArrayList arrayList;
        long j;
        long j2;
        ArrayList arrayList2 = new ArrayList();
        if (dn1Var instanceof cn1) {
            List list = ((cn1) dn1Var).d;
            for (int i = 0; i < list.size(); i++) {
                arrayList2.add(d((Uri) list.get(i)));
            }
        } else {
            arrayList2.add(d(Uri.parse(dn1Var.a)));
        }
        ArrayList arrayList3 = new ArrayList();
        HashSet hashSet = new HashSet();
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            ii0 ii0Var = (ii0) arrayList2.get(i2);
            arrayList3.add(new x84(0L, ii0Var));
            try {
                ym1 ym1Var = (ym1) e(lxVar, ii0Var, z);
                yw1 yw1Var = ym1Var.r;
                long j3 = z == 0 ? this.a : 0L;
                if (z) {
                    j2 = -9223372036854775807L;
                    j = -9223372036854775807L;
                } else {
                    j = -9223372036854775807L;
                    j2 = this.b;
                }
                long j4 = j;
                vm1 vm1Var = null;
                int i4 = 0;
                while (true) {
                    if (i4 >= yw1Var.size()) {
                        arrayList = arrayList2;
                        break;
                    }
                    vm1 vm1Var2 = (vm1) yw1Var.get(i4);
                    arrayList = arrayList2;
                    long j5 = ym1Var.h + vm1Var2.r;
                    if (j5 + vm1Var2.p > j3) {
                        if (j2 != j4 && j5 >= j3 + j2) {
                            break;
                        }
                        vm1 vm1Var3 = vm1Var2.o;
                        if (vm1Var3 != null && vm1Var3 != vm1Var) {
                            c(ym1Var, vm1Var3, hashSet, arrayList3);
                            vm1Var = vm1Var3;
                        }
                        c(ym1Var, vm1Var2, hashSet, arrayList3);
                    }
                    i4++;
                    arrayList2 = arrayList;
                }
            } catch (IOException e) {
                arrayList = arrayList2;
                if (!z) {
                    throw e;
                }
            }
            i2 = i3;
            arrayList2 = arrayList;
        }
        return arrayList3;
    }

    public final void h(int i) {
        synchronized (this.k) {
            this.k.remove(i);
        }
    }

    public final void i(w34 w34Var) {
        synchronized (this.k) {
            this.k.remove(w34Var);
        }
    }

    @Override // defpackage.du0
    public final void remove() {
        se4 se4Var = this.g;
        px pxVar = this.h;
        ii0 ii0Var = this.c;
        kx kxVar = this.f;
        lx lxVarC = kxVar.c(null, kxVar.s | 1);
        try {
            ArrayList arrayListF = f(lxVarC, e(lxVarC, ii0Var, true), true);
            for (int i = 0; i < arrayListF.size(); i++) {
                se4Var.m(pxVar.d(((x84) arrayListF.get(i)).o));
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception unused2) {
        } finally {
            se4Var.m(pxVar.d(ii0Var));
        }
    }
}
