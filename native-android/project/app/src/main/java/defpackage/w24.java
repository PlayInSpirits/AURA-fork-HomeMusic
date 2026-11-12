package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w24 implements wo4, vo4 {
    public static final TreeMap v = new TreeMap();
    public final int n;
    public volatile String o;
    public final long[] p;
    public final double[] q;
    public final String[] r;
    public final byte[][] s;
    public final int[] t;
    public int u;

    public w24(int i) {
        this.n = i;
        int i2 = i + 1;
        this.t = new int[i2];
        this.p = new long[i2];
        this.q = new double[i2];
        this.r = new String[i2];
        this.s = new byte[i2][];
    }

    public static final w24 b(int i, String str) {
        TreeMap treeMap = v;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry == null) {
                w24 w24Var = new w24(i);
                w24Var.o = str;
                w24Var.u = i;
                return w24Var;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            w24 w24Var2 = (w24) entryCeilingEntry.getValue();
            w24Var2.getClass();
            w24Var2.o = str;
            w24Var2.u = i;
            return w24Var2;
        }
    }

    @Override // defpackage.vo4
    public final void c(int i, long j) {
        this.t[i] = 2;
        this.p[i] = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.vo4
    public final void d(double d, int i) {
        this.t[i] = 3;
        this.q[i] = d;
    }

    @Override // defpackage.vo4
    public final void e(int i) {
        this.t[i] = 1;
    }

    @Override // defpackage.wo4
    public final String f() {
        String str = this.o;
        if (str != null) {
            return str;
        }
        kf2.o("Required value was null.");
        return null;
    }

    @Override // defpackage.vo4
    public final void h(int i, String str) {
        str.getClass();
        this.t[i] = 4;
        this.r[i] = str;
    }

    public final void j() {
        TreeMap treeMap = v;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.n), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                it.getClass();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // defpackage.wo4
    public final void n(vo4 vo4Var) {
        int i = this.u;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.t[i2];
            if (i3 == 1) {
                vo4Var.e(i2);
            } else if (i3 == 2) {
                vo4Var.c(i2, this.p[i2]);
            } else if (i3 == 3) {
                vo4Var.d(this.q[i2], i2);
            } else if (i3 == 4) {
                String str = this.r[i2];
                if (str == null) {
                    kf2.n("Required value was null.");
                    return;
                }
                vo4Var.h(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.s[i2];
                if (bArr == null) {
                    kf2.n("Required value was null.");
                    return;
                }
                vo4Var.x(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // defpackage.vo4
    public final void x(int i, byte[] bArr) {
        this.t[i] = 5;
        this.s[i] = bArr;
    }
}
