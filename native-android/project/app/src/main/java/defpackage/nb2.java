package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nb2 extends AbstractMap implements Serializable {
    public static final jb2 v = new jb2(0);
    public final boolean o;
    public mb2 p;
    public final mb2 s;
    public lb2 t;
    public lb2 u;
    public int q = 0;
    public int r = 0;
    public final Comparator n = v;

    public nb2(boolean z) {
        this.o = z;
        this.s = new mb2(z);
    }

    public final mb2 a(Object obj, boolean z) {
        int iCompareTo;
        mb2 mb2Var;
        mb2 mb2Var2 = this.p;
        jb2 jb2Var = v;
        Comparator comparator = this.n;
        if (mb2Var2 != null) {
            Comparable comparable = comparator == jb2Var ? (Comparable) obj : null;
            while (true) {
                Object obj2 = mb2Var2.s;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return mb2Var2;
                }
                mb2 mb2Var3 = iCompareTo < 0 ? mb2Var2.o : mb2Var2.p;
                if (mb2Var3 == null) {
                    break;
                }
                mb2Var2 = mb2Var3;
            }
        } else {
            iCompareTo = 0;
        }
        mb2 mb2Var4 = mb2Var2;
        if (!z) {
            return null;
        }
        mb2 mb2Var5 = this.s;
        if (mb2Var4 != null) {
            mb2Var = new mb2(this.o, mb2Var4, obj, mb2Var5, mb2Var5.r);
            if (iCompareTo < 0) {
                mb2Var4.o = mb2Var;
            } else {
                mb2Var4.p = mb2Var;
            }
            b(mb2Var4, true);
        } else {
            if (comparator == jb2Var && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            mb2Var = new mb2(this.o, mb2Var4, obj, mb2Var5, mb2Var5.r);
            this.p = mb2Var;
        }
        this.q++;
        this.r++;
        return mb2Var;
    }

    public final void b(mb2 mb2Var, boolean z) {
        while (mb2Var != null) {
            mb2 mb2Var2 = mb2Var.o;
            mb2 mb2Var3 = mb2Var.p;
            int i = mb2Var2 != null ? mb2Var2.v : 0;
            int i2 = mb2Var3 != null ? mb2Var3.v : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                mb2 mb2Var4 = mb2Var3.o;
                mb2 mb2Var5 = mb2Var3.p;
                int i4 = (mb2Var4 != null ? mb2Var4.v : 0) - (mb2Var5 != null ? mb2Var5.v : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    e(mb2Var);
                } else {
                    f(mb2Var3);
                    e(mb2Var);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                mb2 mb2Var6 = mb2Var2.o;
                mb2 mb2Var7 = mb2Var2.p;
                int i5 = (mb2Var6 != null ? mb2Var6.v : 0) - (mb2Var7 != null ? mb2Var7.v : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    f(mb2Var);
                } else {
                    e(mb2Var2);
                    f(mb2Var);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                mb2Var.v = i + 1;
                if (z) {
                    return;
                }
            } else {
                mb2Var.v = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            mb2Var = mb2Var.n;
        }
    }

    public final void c(mb2 mb2Var, boolean z) {
        mb2 mb2Var2;
        mb2 mb2Var3;
        int i;
        if (z) {
            mb2 mb2Var4 = mb2Var.r;
            mb2Var4.q = mb2Var.q;
            mb2Var.q.r = mb2Var4;
        }
        mb2 mb2Var5 = mb2Var.o;
        mb2 mb2Var6 = mb2Var.p;
        mb2 mb2Var7 = mb2Var.n;
        int i2 = 0;
        if (mb2Var5 == null || mb2Var6 == null) {
            if (mb2Var5 != null) {
                d(mb2Var, mb2Var5);
                mb2Var.o = null;
            } else if (mb2Var6 != null) {
                d(mb2Var, mb2Var6);
                mb2Var.p = null;
            } else {
                d(mb2Var, null);
            }
            b(mb2Var7, false);
            this.q--;
            this.r++;
            return;
        }
        if (mb2Var5.v > mb2Var6.v) {
            mb2 mb2Var8 = mb2Var5.p;
            while (true) {
                mb2 mb2Var9 = mb2Var8;
                mb2Var3 = mb2Var5;
                mb2Var5 = mb2Var9;
                if (mb2Var5 == null) {
                    break;
                } else {
                    mb2Var8 = mb2Var5.p;
                }
            }
        } else {
            mb2 mb2Var10 = mb2Var6.o;
            while (true) {
                mb2Var2 = mb2Var6;
                mb2Var6 = mb2Var10;
                if (mb2Var6 == null) {
                    break;
                } else {
                    mb2Var10 = mb2Var6.o;
                }
            }
            mb2Var3 = mb2Var2;
        }
        c(mb2Var3, false);
        mb2 mb2Var11 = mb2Var.o;
        if (mb2Var11 != null) {
            i = mb2Var11.v;
            mb2Var3.o = mb2Var11;
            mb2Var11.n = mb2Var3;
            mb2Var.o = null;
        } else {
            i = 0;
        }
        mb2 mb2Var12 = mb2Var.p;
        if (mb2Var12 != null) {
            i2 = mb2Var12.v;
            mb2Var3.p = mb2Var12;
            mb2Var12.n = mb2Var3;
            mb2Var.p = null;
        }
        mb2Var3.v = Math.max(i, i2) + 1;
        d(mb2Var, mb2Var3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.p = null;
        this.q = 0;
        this.r++;
        mb2 mb2Var = this.s;
        mb2Var.r = mb2Var;
        mb2Var.q = mb2Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        mb2 mb2VarA = null;
        if (obj != null) {
            try {
                mb2VarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return mb2VarA != null;
    }

    public final void d(mb2 mb2Var, mb2 mb2Var2) {
        mb2 mb2Var3 = mb2Var.n;
        mb2Var.n = null;
        if (mb2Var2 != null) {
            mb2Var2.n = mb2Var3;
        }
        if (mb2Var3 == null) {
            this.p = mb2Var2;
        } else if (mb2Var3.o == mb2Var) {
            mb2Var3.o = mb2Var2;
        } else {
            mb2Var3.p = mb2Var2;
        }
    }

    public final void e(mb2 mb2Var) {
        mb2 mb2Var2 = mb2Var.o;
        mb2 mb2Var3 = mb2Var.p;
        mb2 mb2Var4 = mb2Var3.o;
        mb2 mb2Var5 = mb2Var3.p;
        mb2Var.p = mb2Var4;
        if (mb2Var4 != null) {
            mb2Var4.n = mb2Var;
        }
        d(mb2Var, mb2Var3);
        mb2Var3.o = mb2Var;
        mb2Var.n = mb2Var3;
        int iMax = Math.max(mb2Var2 != null ? mb2Var2.v : 0, mb2Var4 != null ? mb2Var4.v : 0) + 1;
        mb2Var.v = iMax;
        mb2Var3.v = Math.max(iMax, mb2Var5 != null ? mb2Var5.v : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        lb2 lb2Var = this.t;
        if (lb2Var != null) {
            return lb2Var;
        }
        lb2 lb2Var2 = new lb2(this, 0);
        this.t = lb2Var2;
        return lb2Var2;
    }

    public final void f(mb2 mb2Var) {
        mb2 mb2Var2 = mb2Var.o;
        mb2 mb2Var3 = mb2Var.p;
        mb2 mb2Var4 = mb2Var2.o;
        mb2 mb2Var5 = mb2Var2.p;
        mb2Var.o = mb2Var5;
        if (mb2Var5 != null) {
            mb2Var5.n = mb2Var;
        }
        d(mb2Var, mb2Var2);
        mb2Var2.p = mb2Var;
        mb2Var.n = mb2Var2;
        int iMax = Math.max(mb2Var3 != null ? mb2Var3.v : 0, mb2Var5 != null ? mb2Var5.v : 0) + 1;
        mb2Var.v = iMax;
        mb2Var2.v = Math.max(iMax, mb2Var4 != null ? mb2Var4.v : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        mb2 mb2VarA;
        if (obj != null) {
            try {
                mb2VarA = a(obj, false);
            } catch (ClassCastException unused) {
                mb2VarA = null;
            }
        } else {
            mb2VarA = null;
        }
        if (mb2VarA != null) {
            return mb2VarA.u;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        lb2 lb2Var = this.u;
        if (lb2Var != null) {
            return lb2Var;
        }
        lb2 lb2Var2 = new lb2(this, 1);
        this.u = lb2Var2;
        return lb2Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            nz2.n("key == null");
            return null;
        }
        if (obj2 == null && !this.o) {
            nz2.n("value == null");
            return null;
        }
        mb2 mb2VarA = a(obj, true);
        Object obj3 = mb2VarA.u;
        mb2VarA.u = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        mb2 mb2VarA;
        if (obj != null) {
            try {
                mb2VarA = a(obj, false);
            } catch (ClassCastException unused) {
                mb2VarA = null;
            }
        } else {
            mb2VarA = null;
        }
        if (mb2VarA != null) {
            c(mb2VarA, true);
        }
        if (mb2VarA != null) {
            return mb2VarA.u;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.q;
    }
}
