package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qj0 {
    public final int a;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public qj0(int i) {
        this.c = new hd5(10);
        this.d = new mf2(0);
        this.e = new HashMap();
        this.f = new HashMap();
        this.a = i;
    }

    public static boolean a(qj0 qj0Var) {
        return Objects.equals(((tb1) qj0Var.c).n, "audio/raw");
    }

    public void b(int i, Class cls) {
        NavigableMap navigableMapG = g(cls);
        Integer num = (Integer) navigableMapG.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapG.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapG.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public void c(int i) {
        while (this.b > i) {
            Object objL = ((hd5) this.c).l();
            h12.e(objL);
            lw lwVarE = e(objL.getClass());
            this.b -= lwVarE.b() * lwVarE.a(objL);
            b(lwVarE.a(objL), objL.getClass());
            if (Log.isLoggable(lwVarE.c(), 2)) {
                Log.v(lwVarE.c(), "evicted: " + lwVarE.a(objL));
            }
        }
    }

    public synchronized Object d(int i, Class cls) {
        lf2 lf2Var;
        int i2;
        try {
            Integer num = (Integer) g(cls).ceilingKey(Integer.valueOf(i));
            boolean z = num != null && ((i2 = this.b) == 0 || this.a / i2 >= 2 || num.intValue() <= i * 8);
            mf2 mf2Var = (mf2) this.d;
            if (z) {
                int iIntValue = num.intValue();
                xn3 xn3VarU = (xn3) ((ArrayDeque) mf2Var.a).poll();
                if (xn3VarU == null) {
                    xn3VarU = mf2Var.u();
                }
                lf2Var = (lf2) xn3VarU;
                lf2Var.b = iIntValue;
                lf2Var.c = cls;
            } else {
                xn3 xn3VarU2 = (xn3) ((ArrayDeque) mf2Var.a).poll();
                if (xn3VarU2 == null) {
                    xn3VarU2 = mf2Var.u();
                }
                lf2Var = (lf2) xn3VarU2;
                lf2Var.b = i;
                lf2Var.c = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f(lf2Var, cls);
    }

    public lw e(Class cls) {
        lw lwVar;
        HashMap map = (HashMap) this.f;
        lw lwVar2 = (lw) map.get(cls);
        if (lwVar2 != null) {
            return lwVar2;
        }
        if (cls.equals(int[].class)) {
            lwVar = new lw(1);
        } else {
            if (!cls.equals(byte[].class)) {
                kf2.n("No array pool found for: ".concat(cls.getSimpleName()));
                return null;
            }
            lwVar = new lw(0);
        }
        map.put(cls, lwVar);
        return lwVar;
    }

    public Object f(lf2 lf2Var, Class cls) {
        lw lwVarE = e(cls);
        Object objH = ((hd5) this.c).h(lf2Var);
        if (objH != null) {
            this.b -= lwVarE.b() * lwVarE.a(objH);
            b(lwVarE.a(objH), cls);
        }
        if (objH != null) {
            return objH;
        }
        if (Log.isLoggable(lwVarE.c(), 2)) {
            Log.v(lwVarE.c(), "Allocated " + lf2Var.b + " bytes");
        }
        int i = lf2Var.b;
        switch (lwVarE.a) {
            case 0:
                return new byte[i];
            default:
                return new int[i];
        }
    }

    public NavigableMap g(Class cls) {
        HashMap map = (HashMap) this.e;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    public synchronized void h(Object obj) {
        Class<?> cls = obj.getClass();
        lw lwVarE = e(cls);
        int iA = lwVarE.a(obj);
        int iB = lwVarE.b() * iA;
        if (iB <= this.a / 2) {
            mf2 mf2Var = (mf2) this.d;
            xn3 xn3VarU = (xn3) ((ArrayDeque) mf2Var.a).poll();
            if (xn3VarU == null) {
                xn3VarU = mf2Var.u();
            }
            lf2 lf2Var = (lf2) xn3VarU;
            lf2Var.b = iA;
            lf2Var.c = cls;
            ((hd5) this.c).k(lf2Var, obj);
            NavigableMap navigableMapG = g(cls);
            Integer num = (Integer) navigableMapG.get(Integer.valueOf(lf2Var.b));
            Integer numValueOf = Integer.valueOf(lf2Var.b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapG.put(numValueOf, Integer.valueOf(iIntValue));
            this.b += iB;
            c(this.a);
        }
    }

    public qj0(tb1 tb1Var, tb1 tb1Var2, int i, int i2, em emVar, fm fmVar) {
        this.c = tb1Var;
        this.d = tb1Var2;
        this.a = i;
        this.b = i2;
        this.e = emVar;
        this.f = fmVar;
    }
}
