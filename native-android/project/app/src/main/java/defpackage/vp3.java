package defpackage;

import android.os.Trace;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vp3 implements p82 {
    public final int a;
    public final rm3 b;
    public final if1 c;
    public nc0 d;
    public jn4 e;
    public in4 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Object j;
    public boolean k;
    public up3 l;
    public boolean m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public final /* synthetic */ ll r;

    public vp3(ll llVar, int i, rm3 rm3Var, if1 if1Var) {
        this.r = llVar;
        this.a = i;
        this.b = rm3Var;
        this.c = if1Var;
        int i2 = hx2.b;
        this.p = System.nanoTime() - hx2.a;
    }

    @Override // defpackage.p82
    public final void a() {
        this.m = true;
    }

    public final void b() {
        in4 in4Var = this.f;
        if (in4Var != null) {
            in4Var.cancel();
        }
        this.f = null;
        jn4 jn4Var = this.e;
        if (jn4Var != null) {
            jn4Var.a();
        }
        this.e = null;
        this.l = null;
    }

    public final boolean c(yn4 yn4Var) {
        boolean zD;
        if (!this.r.o) {
            return false;
        }
        if (this.m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zD = d(yn4Var);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            zD = d(yn4Var);
        }
        si0.R("compose:lazy:prefetch:execute:item", -1L);
        return zD;
    }

    @Override // defpackage.p82
    public final void cancel() {
        if (this.h) {
            return;
        }
        this.h = true;
        b();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:102:0x01c8 A[Catch: all -> 0x01ed, TryCatch #5 {all -> 0x01ed, blocks: (B:79:0x016c, B:81:0x0174, B:83:0x017a, B:88:0x0186, B:90:0x0192, B:92:0x01a6, B:91:0x0195, B:93:0x01a8, B:94:0x01af, B:96:0x01b7, B:102:0x01c8, B:103:0x01ca, B:107:0x01d8, B:108:0x01de), top: B:183:0x016c }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01d8 A[Catch: all -> 0x01ed, LOOP:2: B:94:0x01af->B:107:0x01d8, LOOP_END, TRY_ENTER, TryCatch #5 {all -> 0x01ed, blocks: (B:79:0x016c, B:81:0x0174, B:83:0x017a, B:88:0x0186, B:90:0x0192, B:92:0x01a6, B:91:0x0195, B:93:0x01a8, B:94:0x01af, B:96:0x01b7, B:102:0x01c8, B:103:0x01ca, B:107:0x01d8, B:108:0x01de), top: B:183:0x016c }] */
    /* JADX WARN: Code duplicated, block: B:119:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:123:0x0209  */
    /* JADX WARN: Code duplicated, block: B:126:0x0212 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x021e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0229 A[Catch: all -> 0x026a, TryCatch #3 {all -> 0x026a, blocks: (B:130:0x0223, B:132:0x0229, B:133:0x022e, B:135:0x0232, B:136:0x0237, B:138:0x023d, B:140:0x0244, B:141:0x024a), top: B:180:0x0223 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x0232 A[Catch: all -> 0x026a, TryCatch #3 {all -> 0x026a, blocks: (B:130:0x0223, B:132:0x0229, B:133:0x022e, B:135:0x0232, B:136:0x0237, B:138:0x023d, B:140:0x0244, B:141:0x024a), top: B:180:0x0223 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x023d A[Catch: all -> 0x026a, TryCatch #3 {all -> 0x026a, blocks: (B:130:0x0223, B:132:0x0229, B:133:0x022e, B:135:0x0232, B:136:0x0237, B:138:0x023d, B:140:0x0244, B:141:0x024a), top: B:180:0x0223 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0244 A[Catch: all -> 0x026a, LOOP:3: B:139:0x0242->B:140:0x0244, LOOP_END, TryCatch #3 {all -> 0x026a, blocks: (B:130:0x0223, B:132:0x0229, B:133:0x022e, B:135:0x0232, B:136:0x0237, B:138:0x023d, B:140:0x0244, B:141:0x024a), top: B:180:0x0223 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x024a A[Catch: all -> 0x026a, TRY_LEAVE, TryCatch #3 {all -> 0x026a, blocks: (B:130:0x0223, B:132:0x0229, B:133:0x022e, B:135:0x0232, B:136:0x0237, B:138:0x023d, B:140:0x0244, B:141:0x024a), top: B:180:0x0223 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0266  */
    /* JADX WARN: Code duplicated, block: B:151:0x0276  */
    /* JADX WARN: Code duplicated, block: B:171:0x02cb A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:187:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fb A[Catch: all -> 0x0128, TryCatch #2 {all -> 0x0128, blocks: (B:53:0x00f7, B:55:0x00fb, B:57:0x010f, B:60:0x0120, B:59:0x0117), top: B:178:0x00f7 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x010f A[Catch: all -> 0x0128, TryCatch #2 {all -> 0x0128, blocks: (B:53:0x00f7, B:55:0x00fb, B:57:0x010f, B:60:0x0120, B:59:0x0117), top: B:178:0x00f7 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0117 A[Catch: all -> 0x0128, TryCatch #2 {all -> 0x0128, blocks: (B:53:0x00f7, B:55:0x00fb, B:57:0x010f, B:60:0x0120, B:59:0x0117), top: B:178:0x00f7 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x012d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0131  */
    /* JADX WARN: Code duplicated, block: B:70:0x0141  */
    /* JADX WARN: Code duplicated, block: B:72:0x0147  */
    /* JADX WARN: Code duplicated, block: B:76:0x0158 A[Catch: all -> 0x01f2, TRY_LEAVE, TryCatch #0 {all -> 0x01f2, blocks: (B:74:0x0151, B:76:0x0158), top: B:175:0x0151 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0174 A[Catch: all -> 0x01ed, TryCatch #5 {all -> 0x01ed, blocks: (B:79:0x016c, B:81:0x0174, B:83:0x017a, B:88:0x0186, B:90:0x0192, B:92:0x01a6, B:91:0x0195, B:93:0x01a8, B:94:0x01af, B:96:0x01b7, B:102:0x01c8, B:103:0x01ca, B:107:0x01d8, B:108:0x01de), top: B:183:0x016c }] */
    /* JADX WARN: Code duplicated, block: B:83:0x017a A[Catch: all -> 0x01ed, TRY_LEAVE, TryCatch #5 {all -> 0x01ed, blocks: (B:79:0x016c, B:81:0x0174, B:83:0x017a, B:88:0x0186, B:90:0x0192, B:92:0x01a6, B:91:0x0195, B:93:0x01a8, B:94:0x01af, B:96:0x01b7, B:102:0x01c8, B:103:0x01ca, B:107:0x01d8, B:108:0x01de), top: B:183:0x016c }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0186 A[Catch: all -> 0x01ed, TRY_ENTER, TryCatch #5 {all -> 0x01ed, blocks: (B:79:0x016c, B:81:0x0174, B:83:0x017a, B:88:0x0186, B:90:0x0192, B:92:0x01a6, B:91:0x0195, B:93:0x01a8, B:94:0x01af, B:96:0x01b7, B:102:0x01c8, B:103:0x01ca, B:107:0x01d8, B:108:0x01de), top: B:183:0x016c }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0192 A[Catch: all -> 0x01ed, TryCatch #5 {all -> 0x01ed, blocks: (B:79:0x016c, B:81:0x0174, B:83:0x017a, B:88:0x0186, B:90:0x0192, B:92:0x01a6, B:91:0x0195, B:93:0x01a8, B:94:0x01af, B:96:0x01b7, B:102:0x01c8, B:103:0x01ca, B:107:0x01d8, B:108:0x01de), top: B:183:0x016c }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0195 A[Catch: all -> 0x01ed, TryCatch #5 {all -> 0x01ed, blocks: (B:79:0x016c, B:81:0x0174, B:83:0x017a, B:88:0x0186, B:90:0x0192, B:92:0x01a6, B:91:0x0195, B:93:0x01a8, B:94:0x01af, B:96:0x01b7, B:102:0x01c8, B:103:0x01ca, B:107:0x01d8, B:108:0x01de), top: B:183:0x016c }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01b7 A[Catch: all -> 0x01ed, TryCatch #5 {all -> 0x01ed, blocks: (B:79:0x016c, B:81:0x0174, B:83:0x017a, B:88:0x0186, B:90:0x0192, B:92:0x01a6, B:91:0x0195, B:93:0x01a8, B:94:0x01af, B:96:0x01b7, B:102:0x01c8, B:103:0x01ca, B:107:0x01d8, B:108:0x01de), top: B:183:0x016c }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x01c3  */
    public final boolean d(yn4 yn4Var) {
        up3 up3Var;
        up3 up3Var2;
        nc0 nc0Var;
        long j;
        jn4 jn4Var;
        if1 if1Var;
        int iC;
        int i;
        up3 up3Var3;
        boolean z;
        List[] listArr;
        int i2;
        List list;
        int size;
        int i3;
        List list2;
        vp3 vp3Var;
        vp3 vp3Var2;
        q82 q82Var;
        uc3 uc3Var;
        List list3;
        jn4 jn4Var2;
        Object obj;
        int i4 = this.a;
        long j2 = i4;
        si0.R("compose:lazy:prefetch:execute:item", j2);
        nc3 nc3Var = (nc3) ((c82) this.r.p).b.invoke();
        if (!this.h) {
            int iB = nc3Var.b();
            if (i4 >= 0 && i4 < iB) {
                Object objC = nc3Var.c(i4);
                Object obj2 = this.j;
                if (obj2 != null && !objC.equals(obj2)) {
                    b();
                    return false;
                }
                rm3 rm3Var = this.b;
                zn znVar = (zn) rm3Var.o;
                if (znVar == null) {
                    w03 w03Var = (w03) rm3Var.n;
                    Object objG = w03Var.g(null);
                    if (objG == null) {
                        obj = objG;
                        zn znVar2 = new zn();
                        znVar2.e = -1;
                        w03Var.l(null, znVar2);
                        obj = znVar2;
                    }
                    obj = objG;
                    znVar = (zn) obj;
                    rm3Var.o = znVar;
                }
                e();
                long jA = yn4Var.a();
                this.n = jA;
                int i5 = hx2.b;
                this.p = System.nanoTime() - hx2.a;
                this.o = 0L;
                si0.R("compose:lazy:prefetch:available_time_nanos", jA);
                if (!e()) {
                    if (g(this.n, znVar.a + znVar.b)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            f(objC, znVar);
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                    if (e()) {
                    }
                    return true;
                }
                if (this.f == null) {
                    if (this.k) {
                        up3Var = this.l;
                        if (up3Var != null) {
                            z = this.m;
                            listArr = up3Var.b;
                            i2 = up3Var.c;
                            list = up3Var.a;
                            if (i2 < list.size()) {
                                if (up3Var.f.h) {
                                    fz1.c("Should not execute nested prefetch on canceled request");
                                }
                                Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                try {
                                    size = list.size();
                                    for (i3 = 0; i3 < size; i3++) {
                                        ((q82) list.get(i3)).getClass();
                                    }
                                    Trace.endSection();
                                    Trace.beginSection("compose:lazy:prefetch:nested");
                                    while (up3Var.c < list.size()) {
                                        try {
                                            if (listArr[up3Var.c] == null) {
                                                if (yn4Var.a() <= r12) {
                                                    Trace.endSection();
                                                    return true;
                                                }
                                                int i6 = up3Var.c;
                                                q82Var = (q82) list.get(i6);
                                                uc3Var = q82Var.a;
                                                if (uc3Var == null) {
                                                    list3 = u01.n;
                                                } else {
                                                    o82 o82Var = new o82(q82Var);
                                                    uc3Var.invoke(o82Var);
                                                    ArrayList arrayList = o82Var.a;
                                                    q82Var.e = arrayList.size();
                                                    list3 = arrayList;
                                                }
                                                listArr[i6] = list3;
                                            }
                                            list2 = listArr[up3Var.c];
                                            list2.getClass();
                                            while (up3Var.d < list2.size()) {
                                                vp3Var = (vp3) list2.get(up3Var.d);
                                                if (z) {
                                                    if (vp3Var != null) {
                                                        vp3Var2 = vp3Var;
                                                    } else {
                                                        vp3Var2 = null;
                                                    }
                                                    if (vp3Var2 != null) {
                                                        vp3Var2.m = true;
                                                    }
                                                }
                                                up3Var.e = true;
                                                if (vp3Var.c(yn4Var)) {
                                                    Trace.endSection();
                                                    return true;
                                                }
                                                up3Var.d++;
                                            }
                                            up3Var.d = 0;
                                            up3Var.c++;
                                        } catch (Throwable th2) {
                                            Trace.endSection();
                                            throw th2;
                                        }
                                    }
                                    Trace.endSection();
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            }
                        }
                        up3Var2 = this.l;
                        if (up3Var2 != null && up3Var2.e) {
                            h();
                            si0.R("compose:lazy:prefetch:execute:item", j2);
                            up3Var3 = this.l;
                            if (up3Var3 != null) {
                                up3Var3.e = false;
                            }
                        }
                        nc0Var = this.d;
                        if (!this.g && nc0Var != null) {
                            if (g(this.n, znVar.d)) {
                                Trace.beginSection("compose:lazy:prefetch:measure");
                                try {
                                    j = nc0Var.a;
                                    if (this.h) {
                                        fz1.a("Callers should check whether the request is still valid before calling performMeasure()");
                                    }
                                    if (this.g) {
                                        fz1.a("Request was already measured!");
                                    }
                                    this.g = true;
                                    jn4Var = this.e;
                                    if (jn4Var != null) {
                                        iC = jn4Var.c();
                                        for (i = 0; i < iC; i++) {
                                            jn4Var.d(i, j);
                                        }
                                    } else {
                                        fz1.b("performComposition() must be called before performMeasure()");
                                        er1.a();
                                    }
                                    Trace.endSection();
                                    h();
                                    znVar.d = zn.a(this.o, znVar.d);
                                    if1Var = this.c;
                                    if (if1Var != null) {
                                        if1Var.invoke(this);
                                    }
                                } catch (Throwable th4) {
                                    Trace.endSection();
                                    throw th4;
                                }
                            }
                        }
                        up3 up3Var4 = this.l;
                        if (this.g || !this.k || up3Var4 == null) {
                            return false;
                        }
                        List list4 = up3Var4.a;
                        int size2 = list4.size();
                        int iMin = Integer.MAX_VALUE;
                        for (int i7 = 0; i7 < size2; i7++) {
                            iMin = Math.min(iMin, ((q82) list4.get(i7)).d);
                        }
                        if (iMin == Integer.MAX_VALUE) {
                            iMin = 0;
                        }
                        int i8 = znVar.e;
                        znVar.e = i8 == -1 ? iMin : ((i8 * 3) + iMin) / 4;
                        int size3 = list4.size();
                        int iMin2 = Integer.MAX_VALUE;
                        for (int i9 = 0; i9 < size3; i9++) {
                            iMin2 = Math.min(iMin2, ((q82) list4.get(i9)).e);
                        }
                        if (iMin2 == Integer.MAX_VALUE) {
                            iMin2 = 0;
                        }
                        if (iMin2 >= iMin) {
                            return false;
                        }
                        znVar.d = 0L;
                        return false;
                    }
                    if (this.n > r12) {
                        Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                        try {
                            jn4Var2 = this.e;
                            if (jn4Var2 != null) {
                                jx3 jx3Var = new jx3();
                                jn4Var2.b(new ea(2, jx3Var));
                                List list5 = (List) jx3Var.n;
                                up3 up3Var5 = list5 != null ? new up3(this, list5) : null;
                                this.l = up3Var5;
                                this.k = true;
                                Trace.endSection();
                                up3Var = this.l;
                                if (up3Var != null) {
                                    z = this.m;
                                    listArr = up3Var.b;
                                    i2 = up3Var.c;
                                    list = up3Var.a;
                                    if (i2 < list.size()) {
                                        if (up3Var.f.h) {
                                            fz1.c("Should not execute nested prefetch on canceled request");
                                        }
                                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                        size = list.size();
                                        while (i3 < size) {
                                            ((q82) list.get(i3)).getClass();
                                        }
                                        Trace.endSection();
                                        Trace.beginSection("compose:lazy:prefetch:nested");
                                        while (up3Var.c < list.size()) {
                                            if (listArr[up3Var.c] == null) {
                                                if (yn4Var.a() <= r12) {
                                                    Trace.endSection();
                                                    return true;
                                                }
                                                int i10 = up3Var.c;
                                                q82Var = (q82) list.get(i10);
                                                uc3Var = q82Var.a;
                                                if (uc3Var == null) {
                                                    list3 = u01.n;
                                                } else {
                                                    o82 o82Var2 = new o82(q82Var);
                                                    uc3Var.invoke(o82Var2);
                                                    ArrayList arrayList2 = o82Var2.a;
                                                    q82Var.e = arrayList2.size();
                                                    list3 = arrayList2;
                                                }
                                                listArr[i10] = list3;
                                            }
                                            list2 = listArr[up3Var.c];
                                            list2.getClass();
                                            while (up3Var.d < list2.size()) {
                                                vp3Var = (vp3) list2.get(up3Var.d);
                                                if (z) {
                                                    if (vp3Var != null) {
                                                        vp3Var2 = vp3Var;
                                                    } else {
                                                        vp3Var2 = null;
                                                    }
                                                    if (vp3Var2 != null) {
                                                        vp3Var2.m = true;
                                                    }
                                                }
                                                up3Var.e = true;
                                                if (vp3Var.c(yn4Var)) {
                                                    Trace.endSection();
                                                    return true;
                                                }
                                                up3Var.d++;
                                            }
                                            up3Var.d = 0;
                                            up3Var.c++;
                                        }
                                        Trace.endSection();
                                    }
                                }
                                up3Var2 = this.l;
                                if (up3Var2 != null) {
                                    h();
                                    si0.R("compose:lazy:prefetch:execute:item", j2);
                                    up3Var3 = this.l;
                                    if (up3Var3 != null) {
                                        up3Var3.e = false;
                                    }
                                }
                                nc0Var = this.d;
                                if (!this.g) {
                                    if (g(this.n, znVar.d)) {
                                        Trace.beginSection("compose:lazy:prefetch:measure");
                                        j = nc0Var.a;
                                        if (this.h) {
                                            fz1.a("Callers should check whether the request is still valid before calling performMeasure()");
                                        }
                                        if (this.g) {
                                            fz1.a("Request was already measured!");
                                        }
                                        this.g = true;
                                        jn4Var = this.e;
                                        if (jn4Var != null) {
                                            iC = jn4Var.c();
                                            while (i < iC) {
                                                jn4Var.d(i, j);
                                            }
                                        } else {
                                            fz1.b("performComposition() must be called before performMeasure()");
                                            er1.a();
                                        }
                                        Trace.endSection();
                                        h();
                                        znVar.d = zn.a(this.o, znVar.d);
                                        if1Var = this.c;
                                        if (if1Var != null) {
                                            if1Var.invoke(this);
                                        }
                                    }
                                }
                                up3 up3Var6 = this.l;
                                if (this.g) {
                                    return false;
                                }
                                return false;
                            }
                            fz1.b("Should precompose before resolving nested prefetch states");
                            er1.a();
                            this.l = up3Var5;
                            this.k = true;
                            Trace.endSection();
                            up3Var = this.l;
                            if (up3Var != null) {
                                z = this.m;
                                listArr = up3Var.b;
                                i2 = up3Var.c;
                                list = up3Var.a;
                                if (i2 < list.size()) {
                                    if (up3Var.f.h) {
                                        fz1.c("Should not execute nested prefetch on canceled request");
                                    }
                                    Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                    size = list.size();
                                    while (i3 < size) {
                                        ((q82) list.get(i3)).getClass();
                                    }
                                    Trace.endSection();
                                    Trace.beginSection("compose:lazy:prefetch:nested");
                                    while (up3Var.c < list.size()) {
                                        if (listArr[up3Var.c] == null) {
                                            if (yn4Var.a() <= r12) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            int i11 = up3Var.c;
                                            q82Var = (q82) list.get(i11);
                                            uc3Var = q82Var.a;
                                            if (uc3Var == null) {
                                                list3 = u01.n;
                                            } else {
                                                o82 o82Var3 = new o82(q82Var);
                                                uc3Var.invoke(o82Var3);
                                                ArrayList arrayList3 = o82Var3.a;
                                                q82Var.e = arrayList3.size();
                                                list3 = arrayList3;
                                            }
                                            listArr[i11] = list3;
                                        }
                                        list2 = listArr[up3Var.c];
                                        list2.getClass();
                                        while (up3Var.d < list2.size()) {
                                            vp3Var = (vp3) list2.get(up3Var.d);
                                            if (z) {
                                                if (vp3Var != null) {
                                                    vp3Var2 = vp3Var;
                                                } else {
                                                    vp3Var2 = null;
                                                }
                                                if (vp3Var2 != null) {
                                                    vp3Var2.m = true;
                                                }
                                            }
                                            up3Var.e = true;
                                            if (vp3Var.c(yn4Var)) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            up3Var.d++;
                                        }
                                        up3Var.d = 0;
                                        up3Var.c++;
                                    }
                                    Trace.endSection();
                                }
                            }
                            up3Var2 = this.l;
                            if (up3Var2 != null) {
                                h();
                                si0.R("compose:lazy:prefetch:execute:item", j2);
                                up3Var3 = this.l;
                                if (up3Var3 != null) {
                                    up3Var3.e = false;
                                }
                            }
                            nc0Var = this.d;
                            if (!this.g) {
                                if (g(this.n, znVar.d)) {
                                    Trace.beginSection("compose:lazy:prefetch:measure");
                                    j = nc0Var.a;
                                    if (this.h) {
                                        fz1.a("Callers should check whether the request is still valid before calling performMeasure()");
                                    }
                                    if (this.g) {
                                        fz1.a("Request was already measured!");
                                    }
                                    this.g = true;
                                    jn4Var = this.e;
                                    if (jn4Var != null) {
                                        iC = jn4Var.c();
                                        while (i < iC) {
                                            jn4Var.d(i, j);
                                        }
                                    } else {
                                        fz1.b("performComposition() must be called before performMeasure()");
                                        er1.a();
                                    }
                                    Trace.endSection();
                                    h();
                                    znVar.d = zn.a(this.o, znVar.d);
                                    if1Var = this.c;
                                    if (if1Var != null) {
                                        if1Var.invoke(this);
                                    }
                                }
                            }
                            up3 up3Var7 = this.l;
                            if (this.g) {
                                return false;
                            }
                            return false;
                        } catch (Throwable th5) {
                            Trace.endSection();
                            throw th5;
                        }
                    }
                } else if (g(this.n, znVar.c)) {
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        in4 in4Var = this.f;
                        if (in4Var == null) {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                        this.e = in4Var.apply();
                        this.f = null;
                        this.i = true;
                        Trace.endSection();
                        h();
                        znVar.c = zn.a(this.o, znVar.c);
                        if (this.k) {
                            up3Var = this.l;
                            if (up3Var != null) {
                                z = this.m;
                                listArr = up3Var.b;
                                i2 = up3Var.c;
                                list = up3Var.a;
                                if (i2 < list.size()) {
                                    if (up3Var.f.h) {
                                        fz1.c("Should not execute nested prefetch on canceled request");
                                    }
                                    Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                    size = list.size();
                                    while (i3 < size) {
                                        ((q82) list.get(i3)).getClass();
                                    }
                                    Trace.endSection();
                                    Trace.beginSection("compose:lazy:prefetch:nested");
                                    while (up3Var.c < list.size()) {
                                        if (listArr[up3Var.c] == null) {
                                            if (yn4Var.a() <= r12) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            int i12 = up3Var.c;
                                            q82Var = (q82) list.get(i12);
                                            uc3Var = q82Var.a;
                                            if (uc3Var == null) {
                                                list3 = u01.n;
                                            } else {
                                                o82 o82Var4 = new o82(q82Var);
                                                uc3Var.invoke(o82Var4);
                                                ArrayList arrayList4 = o82Var4.a;
                                                q82Var.e = arrayList4.size();
                                                list3 = arrayList4;
                                            }
                                            listArr[i12] = list3;
                                        }
                                        list2 = listArr[up3Var.c];
                                        list2.getClass();
                                        while (up3Var.d < list2.size()) {
                                            vp3Var = (vp3) list2.get(up3Var.d);
                                            if (z) {
                                                if (vp3Var != null) {
                                                    vp3Var2 = vp3Var;
                                                } else {
                                                    vp3Var2 = null;
                                                }
                                                if (vp3Var2 != null) {
                                                    vp3Var2.m = true;
                                                }
                                            }
                                            up3Var.e = true;
                                            if (vp3Var.c(yn4Var)) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            up3Var.d++;
                                        }
                                        up3Var.d = 0;
                                        up3Var.c++;
                                    }
                                    Trace.endSection();
                                }
                            }
                            up3Var2 = this.l;
                            if (up3Var2 != null) {
                                h();
                                si0.R("compose:lazy:prefetch:execute:item", j2);
                                up3Var3 = this.l;
                                if (up3Var3 != null) {
                                    up3Var3.e = false;
                                }
                            }
                            nc0Var = this.d;
                            if (!this.g) {
                                if (g(this.n, znVar.d)) {
                                    Trace.beginSection("compose:lazy:prefetch:measure");
                                    j = nc0Var.a;
                                    if (this.h) {
                                        fz1.a("Callers should check whether the request is still valid before calling performMeasure()");
                                    }
                                    if (this.g) {
                                        fz1.a("Request was already measured!");
                                    }
                                    this.g = true;
                                    jn4Var = this.e;
                                    if (jn4Var != null) {
                                        iC = jn4Var.c();
                                        while (i < iC) {
                                            jn4Var.d(i, j);
                                        }
                                    } else {
                                        fz1.b("performComposition() must be called before performMeasure()");
                                        er1.a();
                                    }
                                    Trace.endSection();
                                    h();
                                    znVar.d = zn.a(this.o, znVar.d);
                                    if1Var = this.c;
                                    if (if1Var != null) {
                                        if1Var.invoke(this);
                                    }
                                }
                            }
                            up3 up3Var8 = this.l;
                            if (this.g) {
                                return false;
                            }
                            return false;
                        }
                        if (this.n > r12) {
                            Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                            jn4Var2 = this.e;
                            if (jn4Var2 != null) {
                                jx3 jx3Var2 = new jx3();
                                jn4Var2.b(new ea(2, jx3Var2));
                                List list6 = (List) jx3Var2.n;
                                if (list6 != null) {
                                }
                                this.l = up3Var5;
                                this.k = true;
                                Trace.endSection();
                                up3Var = this.l;
                                if (up3Var != null) {
                                    z = this.m;
                                    listArr = up3Var.b;
                                    i2 = up3Var.c;
                                    list = up3Var.a;
                                    if (i2 < list.size()) {
                                        if (up3Var.f.h) {
                                            fz1.c("Should not execute nested prefetch on canceled request");
                                        }
                                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                        size = list.size();
                                        while (i3 < size) {
                                            ((q82) list.get(i3)).getClass();
                                        }
                                        Trace.endSection();
                                        Trace.beginSection("compose:lazy:prefetch:nested");
                                        while (up3Var.c < list.size()) {
                                            if (listArr[up3Var.c] == null) {
                                                if (yn4Var.a() <= r12) {
                                                    Trace.endSection();
                                                    return true;
                                                }
                                                int i13 = up3Var.c;
                                                q82Var = (q82) list.get(i13);
                                                uc3Var = q82Var.a;
                                                if (uc3Var == null) {
                                                    list3 = u01.n;
                                                } else {
                                                    o82 o82Var5 = new o82(q82Var);
                                                    uc3Var.invoke(o82Var5);
                                                    ArrayList arrayList5 = o82Var5.a;
                                                    q82Var.e = arrayList5.size();
                                                    list3 = arrayList5;
                                                }
                                                listArr[i13] = list3;
                                            }
                                            list2 = listArr[up3Var.c];
                                            list2.getClass();
                                            while (up3Var.d < list2.size()) {
                                                vp3Var = (vp3) list2.get(up3Var.d);
                                                if (z) {
                                                    if (vp3Var != null) {
                                                        vp3Var2 = vp3Var;
                                                    } else {
                                                        vp3Var2 = null;
                                                    }
                                                    if (vp3Var2 != null) {
                                                        vp3Var2.m = true;
                                                    }
                                                }
                                                up3Var.e = true;
                                                if (vp3Var.c(yn4Var)) {
                                                    Trace.endSection();
                                                    return true;
                                                }
                                                up3Var.d++;
                                            }
                                            up3Var.d = 0;
                                            up3Var.c++;
                                        }
                                        Trace.endSection();
                                    }
                                }
                                up3Var2 = this.l;
                                if (up3Var2 != null) {
                                    h();
                                    si0.R("compose:lazy:prefetch:execute:item", j2);
                                    up3Var3 = this.l;
                                    if (up3Var3 != null) {
                                        up3Var3.e = false;
                                    }
                                }
                                nc0Var = this.d;
                                if (!this.g) {
                                    if (g(this.n, znVar.d)) {
                                        Trace.beginSection("compose:lazy:prefetch:measure");
                                        j = nc0Var.a;
                                        if (this.h) {
                                            fz1.a("Callers should check whether the request is still valid before calling performMeasure()");
                                        }
                                        if (this.g) {
                                            fz1.a("Request was already measured!");
                                        }
                                        this.g = true;
                                        jn4Var = this.e;
                                        if (jn4Var != null) {
                                            iC = jn4Var.c();
                                            while (i < iC) {
                                                jn4Var.d(i, j);
                                            }
                                        } else {
                                            fz1.b("performComposition() must be called before performMeasure()");
                                            er1.a();
                                        }
                                        Trace.endSection();
                                        h();
                                        znVar.d = zn.a(this.o, znVar.d);
                                        if1Var = this.c;
                                        if (if1Var != null) {
                                            if1Var.invoke(this);
                                        }
                                    }
                                }
                                up3 up3Var9 = this.l;
                                if (this.g) {
                                    return false;
                                }
                                return false;
                            }
                            fz1.b("Should precompose before resolving nested prefetch states");
                            er1.a();
                            this.l = up3Var5;
                            this.k = true;
                            Trace.endSection();
                            up3Var = this.l;
                            if (up3Var != null) {
                                z = this.m;
                                listArr = up3Var.b;
                                i2 = up3Var.c;
                                list = up3Var.a;
                                if (i2 < list.size()) {
                                    if (up3Var.f.h) {
                                        fz1.c("Should not execute nested prefetch on canceled request");
                                    }
                                    Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                    size = list.size();
                                    while (i3 < size) {
                                        ((q82) list.get(i3)).getClass();
                                    }
                                    Trace.endSection();
                                    Trace.beginSection("compose:lazy:prefetch:nested");
                                    while (up3Var.c < list.size()) {
                                        if (listArr[up3Var.c] == null) {
                                            if (yn4Var.a() <= r12) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            int i14 = up3Var.c;
                                            q82Var = (q82) list.get(i14);
                                            uc3Var = q82Var.a;
                                            if (uc3Var == null) {
                                                list3 = u01.n;
                                            } else {
                                                o82 o82Var6 = new o82(q82Var);
                                                uc3Var.invoke(o82Var6);
                                                ArrayList arrayList6 = o82Var6.a;
                                                q82Var.e = arrayList6.size();
                                                list3 = arrayList6;
                                            }
                                            listArr[i14] = list3;
                                        }
                                        list2 = listArr[up3Var.c];
                                        list2.getClass();
                                        while (up3Var.d < list2.size()) {
                                            vp3Var = (vp3) list2.get(up3Var.d);
                                            if (z) {
                                                if (vp3Var != null) {
                                                    vp3Var2 = vp3Var;
                                                } else {
                                                    vp3Var2 = null;
                                                }
                                                if (vp3Var2 != null) {
                                                    vp3Var2.m = true;
                                                }
                                            }
                                            up3Var.e = true;
                                            if (vp3Var.c(yn4Var)) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            up3Var.d++;
                                        }
                                        up3Var.d = 0;
                                        up3Var.c++;
                                    }
                                    Trace.endSection();
                                }
                            }
                            up3Var2 = this.l;
                            if (up3Var2 != null) {
                                h();
                                si0.R("compose:lazy:prefetch:execute:item", j2);
                                up3Var3 = this.l;
                                if (up3Var3 != null) {
                                    up3Var3.e = false;
                                }
                            }
                            nc0Var = this.d;
                            if (!this.g) {
                                if (g(this.n, znVar.d)) {
                                    Trace.beginSection("compose:lazy:prefetch:measure");
                                    j = nc0Var.a;
                                    if (this.h) {
                                        fz1.a("Callers should check whether the request is still valid before calling performMeasure()");
                                    }
                                    if (this.g) {
                                        fz1.a("Request was already measured!");
                                    }
                                    this.g = true;
                                    jn4Var = this.e;
                                    if (jn4Var != null) {
                                        iC = jn4Var.c();
                                        while (i < iC) {
                                            jn4Var.d(i, j);
                                        }
                                    } else {
                                        fz1.b("performComposition() must be called before performMeasure()");
                                        er1.a();
                                    }
                                    Trace.endSection();
                                    h();
                                    znVar.d = zn.a(this.o, znVar.d);
                                    if1Var = this.c;
                                    if (if1Var != null) {
                                        if1Var.invoke(this);
                                    }
                                }
                            }
                            up3 up3Var10 = this.l;
                            if (this.g) {
                                return false;
                            }
                            return false;
                        }
                    } catch (Throwable th6) {
                        Trace.endSection();
                        throw th6;
                    }
                }
                return true;
            }
        }
        b();
        return false;
    }

    public final boolean e() {
        in4 in4Var;
        return this.i || ((in4Var = this.f) != null && in4Var.d());
    }

    public final void f(Object obj, zn znVar) throws IOException {
        in4 hd5Var;
        in4 in4Var = this.f;
        if (in4Var == null) {
            ll llVar = this.r;
            wf1 wf1VarA = ((c82) llVar.p).a(this.a, obj);
            o72 o72VarA = ((kn4) llVar.q).a();
            int i = 12;
            if (o72VarA.n.G()) {
                o72VarA.k(obj, wf1VarA, true);
                hd5Var = new hd5(i, o72VarA, obj);
            } else {
                hd5Var = new xc5(i, o72VarA, obj);
            }
            in4Var = hd5Var;
            this.f = in4Var;
            this.j = obj;
        }
        this.q = false;
        while (!in4Var.d() && !this.q) {
            in4Var.e(new bt2(this, znVar));
        }
        h();
        boolean z = this.q;
        long j = this.o;
        if (z) {
            znVar.b = zn.a(j, znVar.b);
        } else {
            znVar.a = zn.a(j, znVar.a);
        }
    }

    public final boolean g(long j, long j2) {
        if (this.m) {
            j2 = 0;
        }
        return j > j2;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
    public final void h() {
        int i;
        long j;
        long j2;
        int i2 = hx2.b;
        long jNanoTime = System.nanoTime() - hx2.a;
        long j3 = this.p;
        long jW = 0;
        if (((j3 - 1) | 1) != Long.MAX_VALUE) {
            if ((1 | (jNanoTime - 1)) == Long.MAX_VALUE) {
                jW = jNanoTime < 0 ? mx0.p : mx0.o;
            } else {
                long j4 = jNanoTime - j3;
                i = 1;
                long j5 = (~(j4 ^ j3)) & (j4 ^ jNanoTime);
                ox0 ox0Var = ox0.NANOSECONDS;
                if (j5 < 0) {
                    ox0 ox0Var2 = ox0.MILLISECONDS;
                    if (ox0Var.compareTo(ox0Var2) < 0) {
                        long j6 = (jNanoTime / 1000000) - (j3 / 1000000);
                        long j7 = (jNanoTime % 1000000) - (j3 % 1000000);
                        om0 om0Var = mx0.n;
                        jW = mx0.b(e35.W(j6, ox0Var2), e35.W(j7, ox0Var));
                    } else {
                        long j8 = j4 < 0 ? mx0.p : mx0.o;
                        jW = ((-(j8 >> 1)) << 1) + ((long) (((int) j8) & 1));
                        int i3 = nx0.a;
                    }
                } else {
                    jW = e35.W(j4, ox0Var);
                }
            }
            j = jW >> i;
            om0 om0Var2 = mx0.n;
            if ((((int) jW) & i) == 0) {
                j2 = j;
            } else if (j > 9223372036854L) {
                j2 = Long.MAX_VALUE;
            } else if (j < -9223372036854L) {
                j2 = Long.MIN_VALUE;
            } else {
                j2 = j * 1000000;
            }
            this.o = j2;
            long j9 = this.n - j2;
            this.n = j9;
            this.p = jNanoTime;
            si0.R("compose:lazy:prefetch:available_time_nanos", j9);
        }
        if (jNanoTime == j3) {
            om0 om0Var3 = mx0.n;
        } else {
            long j10 = j3 < 0 ? mx0.p : mx0.o;
            jW = ((-(j10 >> 1)) << 1) + ((long) (((int) j10) & 1));
            int i4 = nx0.a;
        }
        i = 1;
        j = jW >> i;
        om0 om0Var4 = mx0.n;
        if ((((int) jW) & i) == 0) {
            j2 = j;
        } else if (j > 9223372036854L) {
            j2 = Long.MAX_VALUE;
        } else if (j < -9223372036854L) {
            j2 = Long.MIN_VALUE;
        } else {
            j2 = j * 1000000;
        }
        this.o = j2;
        long j11 = this.n - j2;
        this.n = j11;
        this.p = jNanoTime;
        si0.R("compose:lazy:prefetch:available_time_nanos", j11);
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.a + ", constraints = " + this.d + ", isComposed = " + e() + ", isMeasured = " + this.g + ", isCanceled = " + this.h + " }";
    }
}
