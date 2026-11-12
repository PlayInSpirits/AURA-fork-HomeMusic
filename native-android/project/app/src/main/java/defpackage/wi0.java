package defpackage;

import com.bumptech.glide.Registry$NoSourceEncoderAvailableException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wi0 {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public ii1 c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public sd0 h;
    public db3 i;
    public Map j;
    public Class k;
    public boolean l;
    public boolean m;
    public f42 n;
    public eq3 o;
    public xq0 p;
    public boolean q;
    public boolean r;

    public final ArrayList a() {
        boolean z = this.m;
        ArrayList arrayList = this.b;
        if (!z) {
            this.m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i = 0; i < size; i++) {
                tw2 tw2Var = (tw2) arrayListB.get(i);
                f42 f42Var = tw2Var.a;
                List list = tw2Var.b;
                if (!arrayList.contains(f42Var)) {
                    arrayList.add(tw2Var.a);
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (!arrayList.contains(list.get(i2))) {
                        arrayList.add(list.get(i2));
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z = this.l;
        ArrayList arrayList = this.a;
        if (!z) {
            this.l = true;
            arrayList.clear();
            List listF = this.c.a().f(this.d);
            int size = listF.size();
            for (int i = 0; i < size; i++) {
                tw2 tw2VarB = ((uw2) listF.get(i)).b(this.d, this.e, this.f, this.i);
                if (tw2VarB != null) {
                    arrayList.add(tw2VarB);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fd2 c(Class cls) {
        fd2 fd2Var;
        Class cls2;
        Class cls3;
        Class cls4;
        fd2 fd2Var2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        d14 d14Var;
        Class cls5 = cls;
        ey3 ey3VarA = this.c.a();
        Class cls6 = this.g;
        Class cls7 = this.k;
        gd2 gd2Var = ey3VarA.i;
        yy2 yy2Var = (yy2) gd2Var.b.getAndSet(null);
        if (yy2Var == null) {
            yy2Var = new yy2();
        }
        yy2Var.a = cls5;
        yy2Var.b = cls6;
        yy2Var.c = cls7;
        synchronized (gd2Var.a) {
            fd2Var = (fd2) gd2Var.a.get(yy2Var);
        }
        gd2Var.b.set(yy2Var);
        ey3VarA.i.getClass();
        if (gd2.c.equals(fd2Var)) {
            return null;
        }
        if (fd2Var != null) {
            return fd2Var;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayListF = ey3VarA.c.f(cls5, cls6);
        int size = arrayListF.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            Class<?> cls8 = (Class) arrayListF.get(i2);
            ArrayList arrayListE = ey3VarA.f.e(cls8, cls7);
            int size2 = arrayListE.size();
            int i4 = 0;
            while (i4 < size2) {
                int i5 = i4 + 1;
                Class cls9 = (Class) arrayListE.get(i4);
                rf2 rf2Var = ey3VarA.c;
                synchronized (rf2Var) {
                    arrayList = new ArrayList();
                    ArrayList arrayList4 = (ArrayList) rf2Var.n;
                    int size3 = arrayList4.size();
                    arrayList2 = arrayListE;
                    int i6 = 0;
                    while (i6 < size3) {
                        Object obj = arrayList4.get(i6);
                        int i7 = i6 + 1;
                        String str = (String) obj;
                        int i8 = size2;
                        List list = (List) ((HashMap) rf2Var.o).get(str);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                u04 u04Var = (u04) it.next();
                                Iterator it2 = it;
                                if (u04Var.a.isAssignableFrom(cls5) && cls8.isAssignableFrom(u04Var.b)) {
                                    arrayList.add(u04Var.c);
                                }
                                it = it2;
                            }
                        }
                        size2 = i8;
                        i6 = i7;
                    }
                    i = size2;
                }
                c52 c52Var = ey3VarA.f;
                synchronized (c52Var) {
                    if (cls9.isAssignableFrom(cls8)) {
                        d14Var = rv2.I;
                    } else {
                        ArrayList arrayList5 = c52Var.a;
                        int size4 = arrayList5.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size4) {
                                throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                            }
                            Object obj2 = arrayList5.get(i9);
                            i9++;
                            nw4 nw4Var = (nw4) obj2;
                            ArrayList arrayList6 = arrayList5;
                            if (nw4Var.a.isAssignableFrom(cls8) && cls9.isAssignableFrom(nw4Var.b)) {
                                d14Var = nw4Var.c;
                                break;
                            }
                            cls5 = cls;
                            arrayList5 = arrayList6;
                        }
                    }
                }
                arrayList3.add(new yi0(cls5, cls8, cls9, arrayList, d14Var, ey3VarA.j));
                cls5 = cls;
                i4 = i5;
                arrayListE = arrayList2;
                size2 = i;
            }
            cls5 = cls;
            i2 = i3;
        }
        if (arrayList3.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            fd2Var2 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            fd2Var2 = new fd2(cls2, cls3, cls4, arrayList3, ey3VarA.j);
        }
        gd2 gd2Var2 = ey3VarA.i;
        synchronized (gd2Var2.a) {
            gd2Var2.a.put(new yy2(cls2, cls3, cls4), fd2Var2 != null ? fd2Var2 : gd2.c);
        }
        return fd2Var2;
    }

    public final c11 d(Object obj) {
        c11 c11Var;
        hg3 hg3Var = this.c.a().b;
        Class<?> cls = obj.getClass();
        synchronized (hg3Var) {
            ArrayList arrayList = (ArrayList) hg3Var.o;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    c11Var = null;
                    break;
                }
                Object obj2 = arrayList.get(i);
                i++;
                d11 d11Var = (d11) obj2;
                if (d11Var.a.isAssignableFrom(cls)) {
                    c11Var = d11Var.b;
                    break;
                }
            }
        }
        if (c11Var != null) {
            return c11Var;
        }
        throw new Registry$NoSourceEncoderAvailableException("Failed to find source encoder for data class: " + obj.getClass());
    }

    public final uw4 e(Class cls) {
        uw4 uw4Var = (uw4) this.j.get(cls);
        if (uw4Var == null) {
            for (Map.Entry entry : this.j.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    uw4Var = (uw4) entry.getValue();
                    break;
                }
            }
        }
        if (uw4Var != null) {
            return uw4Var;
        }
        if (!this.j.isEmpty() || !this.q) {
            return m15.b;
        }
        nz2.A(cls, ". If you wish to ignore unknown resource types, use the optional transformation methods.", "Missing transformation for ");
        return null;
    }
}
