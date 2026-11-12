package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p60 extends AbstractMap implements Serializable {
    public static final Object w = new Object();
    public transient Object n;
    public transient int[] o;
    public transient Object[] p;
    public transient Object[] q;
    public transient int r;
    public transient int s;
    public transient n60 t;
    public transient n60 u;
    public transient s1 v;

    public static p60 a() {
        p60 p60Var = new p60();
        p60Var.r = jz4.o(3, 1);
        return p60Var;
    }

    public static p60 b(int i) {
        p60 p60Var = new p60();
        rr2.k("Expected size must be >= 0", i >= 0);
        p60Var.r = jz4.o(i, 1);
        return p60Var;
    }

    public final Map c() {
        Object obj = this.n;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (g()) {
            return;
        }
        this.r += 32;
        Map mapC = c();
        if (mapC != null) {
            this.r = jz4.o(size(), 3);
            mapC.clear();
            this.n = null;
            this.s = 0;
            return;
        }
        Arrays.fill(j(), 0, this.s, (Object) null);
        Arrays.fill(k(), 0, this.s, (Object) null);
        Object obj = this.n;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(i(), 0, this.s, 0);
        this.s = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.containsKey(obj);
        }
        return e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.containsValue(obj);
        }
        for (int i = 0; i < this.s; i++) {
            if (si0.s(obj, k()[i])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.r & 31)) - 1;
    }

    public final int e(Object obj) {
        if (g()) {
            return -1;
        }
        int iU = g12.U(obj);
        int iD = d();
        Object obj2 = this.n;
        Objects.requireNonNull(obj2);
        int iB = bu.B(iU & iD, obj2);
        if (iB == 0) {
            return -1;
        }
        int i = ~iD;
        int i2 = iU & i;
        do {
            int i3 = iB - 1;
            int i4 = i()[i3];
            if ((i4 & i) == i2 && si0.s(obj, j()[i3])) {
                return i3;
            }
            iB = i4 & iD;
        } while (iB != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        n60 n60Var = this.u;
        if (n60Var != null) {
            return n60Var;
        }
        n60 n60Var2 = new n60(this, 0);
        this.u = n60Var2;
        return n60Var2;
    }

    public final void f(int i, int i2) {
        Object obj = this.n;
        Objects.requireNonNull(obj);
        int[] iArrI = i();
        Object[] objArrJ = j();
        Object[] objArrK = k();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrJ[i] = null;
            objArrK[i] = null;
            iArrI[i] = 0;
            return;
        }
        Object obj2 = objArrJ[i3];
        objArrJ[i] = obj2;
        objArrK[i] = objArrK[i3];
        objArrJ[i3] = null;
        objArrK[i3] = null;
        iArrI[i] = iArrI[i3];
        iArrI[i3] = 0;
        int iU = g12.U(obj2) & i2;
        int iB = bu.B(iU, obj);
        if (iB == size) {
            bu.C(iU, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = iB - 1;
            int i5 = iArrI[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrI[i4] = bu.s(i5, i + 1, i2);
                return;
            }
            iB = i6;
        }
    }

    public final boolean g() {
        return this.n == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.get(obj);
        }
        int iE = e(obj);
        if (iE == -1) {
            return null;
        }
        return k()[iE];
    }

    public final Object h(Object obj) {
        if (!g()) {
            int iD = d();
            Object obj2 = this.n;
            Objects.requireNonNull(obj2);
            int iA = bu.A(obj, null, iD, obj2, i(), j(), null);
            if (iA != -1) {
                Object obj3 = k()[iA];
                f(iA, iD);
                this.s--;
                this.r += 32;
                return obj3;
            }
        }
        return w;
    }

    public final int[] i() {
        int[] iArr = this.o;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.p;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] k() {
        Object[] objArr = this.q;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        n60 n60Var = this.t;
        if (n60Var != null) {
            return n60Var;
        }
        n60 n60Var2 = new n60(this, 1);
        this.t = n60Var2;
        return n60Var2;
    }

    public final int l(int i, int i2, int i3, int i4) {
        Object objG = bu.g(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            bu.C(i3 & i5, i4 + 1, objG);
        }
        Object obj = this.n;
        Objects.requireNonNull(obj);
        int[] iArrI = i();
        for (int i6 = 0; i6 <= i; i6++) {
            int iB = bu.B(i6, obj);
            while (iB != 0) {
                int i7 = iB - 1;
                int i8 = iArrI[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iB2 = bu.B(i10, objG);
                bu.C(i10, iB, objG);
                iArrI[i7] = bu.s(i9, iB2, i5);
                iB = i8 & i;
            }
        }
        this.n = objG;
        this.r = bu.s(this.r, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00de  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f1 -> B:34:0x00d9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:55:0x00f4
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p60.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.remove(obj);
        }
        Object objH = h(obj);
        if (objH == w) {
            return null;
        }
        return objH;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapC = c();
        return mapC != null ? mapC.size() : this.s;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        s1 s1Var = this.v;
        if (s1Var != null) {
            return s1Var;
        }
        s1 s1Var2 = new s1(2, this);
        this.v = s1Var2;
        return s1Var2;
    }
}
