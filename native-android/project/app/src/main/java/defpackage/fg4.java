package defpackage;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class fg4 {
    public static final n7 h = new n7(20);
    public static final n7 i = new n7(21);
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Object f;
    public final Object g;

    public fg4(int i2) {
        this.a = 1;
        this.b = i2;
        if (i2 <= 0) {
            kf2.n("maxSize <= 0");
            throw null;
        }
        this.f = new si1(5);
        this.g = new tv1();
    }

    public void a(int i2, float f) {
        eg4 eg4Var;
        eg4[] eg4VarArr = (eg4[]) this.g;
        ArrayList arrayList = (ArrayList) this.f;
        if (this.b != 1) {
            Collections.sort(arrayList, h);
            this.b = 1;
        }
        int i3 = this.e;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.e = i4;
            eg4Var = eg4VarArr[i4];
        } else {
            eg4Var = new eg4();
        }
        int i5 = this.c;
        this.c = i5 + 1;
        eg4Var.a = i5;
        eg4Var.b = i2;
        eg4Var.c = f;
        arrayList.add(eg4Var);
        this.d += i2;
        while (true) {
            int i6 = this.d;
            if (i6 <= 2000) {
                return;
            }
            int i7 = i6 - 2000;
            eg4 eg4Var2 = (eg4) arrayList.get(0);
            int i8 = eg4Var2.b;
            if (i8 <= i7) {
                this.d -= i8;
                arrayList.remove(0);
                int i9 = this.e;
                if (i9 < 5) {
                    this.e = i9 + 1;
                    eg4VarArr[i9] = eg4Var2;
                }
            } else {
                eg4Var2.b = i8 - i7;
                this.d -= i7;
            }
        }
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.f;
        View view = (View) arrayList.get(arrayList.size() - 1);
        ok4 ok4Var = (ok4) view.getLayoutParams();
        this.c = ((StaggeredGridLayoutManager) this.g).r.d(view);
        ok4Var.getClass();
    }

    public void c() {
        ((ArrayList) this.f).clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public int d() {
        boolean z = ((StaggeredGridLayoutManager) this.g).w;
        ArrayList arrayList = (ArrayList) this.f;
        return z ? f(arrayList.size() - 1, -1) : f(0, arrayList.size());
    }

    public int e() {
        boolean z = ((StaggeredGridLayoutManager) this.g).w;
        ArrayList arrayList = (ArrayList) this.f;
        return z ? f(0, arrayList.size()) : f(arrayList.size() - 1, -1);
    }

    public int f(int i2, int i3) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        int iM = staggeredGridLayoutManager.r.m();
        int i4 = staggeredGridLayoutManager.r.i();
        int i5 = i3 > i2 ? 1 : -1;
        while (i2 != i3) {
            View view = (View) ((ArrayList) this.f).get(i2);
            int iG = staggeredGridLayoutManager.r.g(view);
            int iD = staggeredGridLayoutManager.r.d(view);
            boolean z = iG <= i4;
            boolean z2 = iD >= iM;
            if (z && z2 && (iG < iM || iD > i4)) {
                return mw3.I(view);
            }
            i2 += i5;
        }
        return -1;
    }

    public Object g(Object obj) {
        synchronized (((tv1) this.g)) {
            si1 si1Var = (si1) this.f;
            si1Var.getClass();
            Object obj2 = ((LinkedHashMap) si1Var.o).get(obj);
            if (obj2 != null) {
                this.d++;
                return obj2;
            }
            this.e++;
            return null;
        }
    }

    public int h(int i2) {
        int i3 = this.c;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (((ArrayList) this.f).size() == 0) {
            return i2;
        }
        b();
        return this.c;
    }

    public View i(int i2, int i3) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        ArrayList arrayList = (ArrayList) this.f;
        View view = null;
        if (i3 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.w && mw3.I(view2) >= i2) || ((!staggeredGridLayoutManager.w && mw3.I(view2) <= i2) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            View view3 = (View) arrayList.get(i4);
            if ((staggeredGridLayoutManager.w && mw3.I(view3) <= i2) || ((!staggeredGridLayoutManager.w && mw3.I(view3) >= i2) || !view3.hasFocusable())) {
                break;
            }
            i4++;
            view = view3;
        }
        return view;
    }

    public float j() {
        ArrayList arrayList = (ArrayList) this.f;
        if (this.b != 0) {
            Collections.sort(arrayList, i);
            this.b = 0;
        }
        float f = 0.5f * this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            eg4 eg4Var = (eg4) arrayList.get(i3);
            i2 += eg4Var.b;
            if (i2 >= f) {
                return eg4Var.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((eg4) arrayList.get(arrayList.size() - 1)).c;
    }

    public int k(int i2) {
        ArrayList arrayList = (ArrayList) this.f;
        int i3 = this.b;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (arrayList.size() == 0) {
            return i2;
        }
        View view = (View) arrayList.get(0);
        ok4 ok4Var = (ok4) view.getLayoutParams();
        this.b = ((StaggeredGridLayoutManager) this.g).r.g(view);
        ok4Var.getClass();
        return this.b;
    }

    public Object l(Object obj, Object obj2) {
        Object objPut;
        obj.getClass();
        synchronized (((tv1) this.g)) {
            this.c++;
            si1 si1Var = (si1) this.f;
            si1Var.getClass();
            objPut = ((LinkedHashMap) si1Var.o).put(obj, obj2);
            if (objPut != null) {
                this.c--;
            }
        }
        int i2 = this.b;
        while (true) {
            synchronized (((tv1) this.g)) {
                try {
                    if (this.c < 0 || (((LinkedHashMap) ((si1) this.f).o).isEmpty() && this.c != 0)) {
                        break;
                    }
                    if (this.c > i2 && !((LinkedHashMap) ((si1) this.f).o).isEmpty()) {
                        Set setEntrySet = ((LinkedHashMap) ((si1) this.f).o).entrySet();
                        setEntrySet.getClass();
                        Set set = setEntrySet;
                        Object next = null;
                        if (set instanceof List) {
                            List list = (List) set;
                            if (!list.isEmpty()) {
                                next = list.get(0);
                            }
                        } else {
                            Iterator it = set.iterator();
                            if (it.hasNext()) {
                                next = it.next();
                            }
                        }
                        Map.Entry entry = (Map.Entry) next;
                        if (entry == null) {
                            return objPut;
                        }
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        si1 si1Var2 = (si1) this.f;
                        si1Var2.getClass();
                        key.getClass();
                        ((LinkedHashMap) si1Var2.o).remove(key);
                        int i3 = this.c;
                        value.getClass();
                        this.c = i3 - 1;
                    }
                    return objPut;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 1:
                synchronized (((tv1) this.g)) {
                    try {
                        int i2 = this.d;
                        int i3 = this.e + i2;
                        str = "LruCache[maxSize=" + this.b + ",hits=" + this.d + ",misses=" + this.e + ",hitRate=" + (i3 != 0 ? (i2 * 100) / i3 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public fg4() {
        this.a = 0;
        this.g = new eg4[5];
        this.f = new ArrayList();
        this.b = -1;
    }

    public fg4(int i2, il ilVar, int i3, int i4, int i5, String str) {
        this.a = 2;
        this.b = i2;
        this.f = ilVar;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.g = str;
    }

    public fg4(StaggeredGridLayoutManager staggeredGridLayoutManager, int i2) {
        this.a = 3;
        this.g = staggeredGridLayoutManager;
        this.f = new ArrayList();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
        this.e = i2;
    }
}
