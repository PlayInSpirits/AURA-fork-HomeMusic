package defpackage;

import com.bumptech.glide.Registry$MissingComponentException;
import com.bumptech.glide.Registry$NoModelLoaderAvailableException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ey3 {
    public final rf2 a;
    public final hg3 b;
    public final rf2 c;
    public final b52 d;
    public final zh0 e;
    public final c52 f;
    public final xv1 g;
    public final qr2 h = new qr2(13);
    public final gd2 i = new gd2();
    public final i61 j;

    public ey3() {
        i61 i61Var = new i61(new ko3(20), new y41(4), new y41(5), 5);
        this.j = i61Var;
        tv1 tv1Var = na4.r;
        na4 na4Var = new na4();
        na4Var.n = new ArrayList();
        na4Var.p = new HashSet();
        na4Var.q = i61Var;
        na4Var.o = tv1Var;
        rf2 rf2Var = new rf2();
        int i = 0;
        rf2Var.o = new om1(12, (byte) 0);
        rf2Var.n = na4Var;
        this.a = rf2Var;
        this.b = new hg3(16);
        this.c = new rf2(19);
        this.d = new b52();
        this.e = new zh0(0);
        c52 c52Var = new c52();
        c52Var.a = new ArrayList();
        this.f = c52Var;
        this.g = new xv1(0);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        rf2 rf2Var2 = this.c;
        synchronized (rf2Var2) {
            try {
                ArrayList arrayList2 = new ArrayList((ArrayList) rf2Var2.n);
                ((ArrayList) rf2Var2.n).clear();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((ArrayList) rf2Var2.n).add((String) obj);
                }
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    String str = (String) obj2;
                    if (!arrayList.contains(str)) {
                        ((ArrayList) rf2Var2.n).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Class cls, c11 c11Var) {
        hg3 hg3Var = this.b;
        synchronized (hg3Var) {
            ((ArrayList) hg3Var.o).add(new d11(cls, c11Var));
        }
    }

    public final void b(Class cls, w04 w04Var) {
        b52 b52Var = this.d;
        synchronized (b52Var) {
            b52Var.a.add(new x04(cls, w04Var));
        }
    }

    public final void c(Class cls, Class cls2, vw2 vw2Var) {
        rf2 rf2Var = this.a;
        synchronized (rf2Var) {
            ((na4) rf2Var.n).e(cls, cls2, vw2Var);
            ((HashMap) ((om1) rf2Var.o).o).clear();
        }
    }

    public final void d(String str, Class cls, Class cls2, t04 t04Var) {
        rf2 rf2Var = this.c;
        synchronized (rf2Var) {
            rf2Var.d(str).add(new u04(cls, cls2, t04Var));
        }
    }

    public final ArrayList e() {
        ArrayList arrayList;
        xv1 xv1Var = this.g;
        synchronized (xv1Var) {
            arrayList = xv1Var.a;
        }
        if (arrayList.isEmpty()) {
            throw new Registry$MissingComponentException() { // from class: com.bumptech.glide.Registry$NoImageHeaderParserException
            };
        }
        return arrayList;
    }

    public final List f(Object obj) {
        List listUnmodifiableList;
        rf2 rf2Var = this.a;
        rf2Var.getClass();
        Class<?> cls = obj.getClass();
        synchronized (rf2Var) {
            ww2 ww2Var = (ww2) ((HashMap) ((om1) rf2Var.o).o).get(cls);
            listUnmodifiableList = ww2Var == null ? null : ww2Var.a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(((na4) rf2Var.n).h(cls));
                if (((ww2) ((HashMap) ((om1) rf2Var.o).o).put(cls, new ww2(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new Registry$NoModelLoaderAvailableException("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            uw2 uw2Var = (uw2) listUnmodifiableList.get(i);
            if (uw2Var.a(obj)) {
                if (z) {
                    arrayList = new ArrayList(size - i);
                    z = false;
                }
                arrayList.add(uw2Var);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new Registry$NoModelLoaderAvailableException("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    public final yh0 g(Object obj) {
        yh0 yh0VarB;
        zh0 zh0Var = this.e;
        synchronized (zh0Var) {
            try {
                h12.e(obj);
                xh0 xh0Var = (xh0) ((HashMap) zh0Var.o).get(obj.getClass());
                if (xh0Var == null) {
                    for (xh0 xh0Var2 : ((HashMap) zh0Var.o).values()) {
                        if (xh0Var2.a().isAssignableFrom(obj.getClass())) {
                            xh0Var = xh0Var2;
                            break;
                        }
                    }
                }
                if (xh0Var == null) {
                    xh0Var = zh0.p;
                }
                yh0VarB = xh0Var.b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return yh0VarB;
    }

    public final void h(xh0 xh0Var) {
        zh0 zh0Var = this.e;
        synchronized (zh0Var) {
            ((HashMap) zh0Var.o).put(xh0Var.a(), xh0Var);
        }
    }

    public final void i(Class cls, Class cls2, d14 d14Var) {
        c52 c52Var = this.f;
        synchronized (c52Var) {
            c52Var.a.add(new nw4(cls, cls2, d14Var));
        }
    }
}
