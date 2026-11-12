package defpackage;

import android.net.Uri;
import androidx.compose.ui.platform.ComposeView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements wf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ z(int i, int i2, Object obj) {
        this.n = i2;
        this.o = obj;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x01cd A[LOOP:6: B:89:0x0197->B:102:0x01cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:124:0x0213 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x021a  */
    /* JADX WARN: Code duplicated, block: B:212:0x0403 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:213:0x0405 A[Catch: all -> 0x0422, LOOP:12: B:203:0x03d9->B:213:0x0405, LOOP_END, TryCatch #0 {, blocks: (B:200:0x03c6, B:203:0x03d9, B:205:0x03e5, B:207:0x03ef, B:209:0x03f5, B:210:0x03fd, B:213:0x0405, B:214:0x0408, B:216:0x040e, B:218:0x0414), top: B:283:0x03c6 }] */
    /* JADX WARN: Code duplicated, block: B:288:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x0035 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x0035 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:306:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x008f A[LOOP:0: B:19:0x005f->B:30:0x008f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:332:0x0408 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c9 A[LOOP:2: B:36:0x009a->B:47:0x00c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:8:0x0035  */
    /* JADX WARN: Instruction removed from duplicated block: B:127:0x021a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        x44 x44Var;
        char c;
        char c2;
        Object objG0;
        Object next;
        String str;
        kd3 kd3Var;
        String str2;
        Object next2;
        String str3;
        String str4;
        char c3 = 7;
        int i = 3;
        az azVarY = null;
        y94Var = null;
        y94Var = null;
        y94Var = null;
        y94 y94Var = null;
        s22 s22Var = null;
        int i2 = 1;
        switch (this.n) {
            case 0:
                b0 b0Var = (b0) this.o;
                rg1 rg1Var = (rg1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rg1Var.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b0Var.a(0, rg1Var);
                } else {
                    rg1Var.N();
                }
                return j15.a;
            case 1:
                z64 z64Var = (z64) this.o;
                fu.G(z64Var.e0(), null, null, new i2(z64Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case 2:
                ((Integer) obj2).getClass();
                int i3 = ComposeView.y;
                ((ComposeView) this.o).a(xl.O(1), (rg1) obj);
                return j15.a;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                uy3 uy3Var = (uy3) this.o;
                ((Integer) obj).getClass();
                if (obj2 instanceof u70) {
                    u70 u70Var = (u70) obj2;
                    x03 x03Var = uy3Var.h;
                    if (x03Var == null) {
                        x03 x03Var2 = w54.a;
                        x03Var = new x03();
                        uy3Var.h = x03Var;
                    }
                    x03Var.k(u70Var);
                    uy3Var.f.b(u70Var);
                }
                if (obj2 instanceof wg1) {
                    uy3Var.e((wg1) obj2);
                }
                if (obj2 instanceof lv3) {
                    ((lv3) obj2).c();
                }
                return j15.a;
            case 4:
                rg1 rg1Var2 = (rg1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (rg1Var2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    throw null;
                }
                rg1Var2.N();
                return j15.a;
            case 5:
                ((Integer) obj2).getClass();
                ((ty1) this.o).a(xl.O(1), (rg1) obj);
                return j15.a;
            case 6:
                ((Integer) obj2).getClass();
                q05.a((r70) this.o, (rg1) obj, xl.O(7));
                return j15.a;
            case 7:
                t44 t44Var = (t44) obj;
                List list = (List) ((d60) this.o).invoke(t44Var, obj2);
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Object obj3 = list.get(i4);
                    if (obj3 != null && (x44Var = t44Var.o) != null && !x44Var.b(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i4 + " can't be saved: " + obj3).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            case 8:
                kz2 kz2Var = (kz2) this.o;
                Set set = (Set) obj;
                jx3 jx3Var = new jx3();
                synchronized (kz2Var.a) {
                    w03 w03Var = kz2Var.b;
                    dd0 dd0Var = new dd0(set, kz2Var, jx3Var, i);
                    jz4.j(1, dd0Var);
                    Object[] objArr = w03Var.b;
                    long[] jArr = w03Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8 - ((~(i5 - length)) >>> 31);
                                for (int i7 = 0; i7 < i6; i7++) {
                                    if ((j & 255) < 128) {
                                        dd0Var.invoke(objArr[(i5 << 3) + i7]);
                                    }
                                    j >>= 8;
                                }
                                if (i6 == 8) {
                                    if (i5 != length) {
                                        i5++;
                                    }
                                }
                            } else if (i5 != length) {
                                i5++;
                            }
                        }
                    }
                    List list2 = (List) jx3Var.n;
                    if (list2 != null) {
                        int size2 = list2.size();
                        for (int i8 = 0; i8 < size2; i8++) {
                            ((y94) list2.get(i8)).d(j15.a);
                        }
                    }
                }
                return j15.a;
            case 9:
                hk3 hk3Var = (hk3) this.o;
                rg1 rg1Var3 = (rg1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                i80 i80Var = j80.a;
                if (rg1Var3.K(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    List listH0 = hk3Var.h0();
                    int iG = hk3Var.s0.g();
                    boolean zBooleanValue = ((Boolean) hk3Var.t0.getValue()).booleanValue();
                    Uri uri = (Uri) hk3Var.u0.getValue();
                    String str5 = (String) hk3Var.v0.getValue();
                    boolean zBooleanValue2 = ((Boolean) hk3Var.x0.getValue()).booleanValue();
                    boolean zBooleanValue3 = ((Boolean) hk3Var.y0.getValue()).booleanValue();
                    boolean zG = rg1Var3.g(hk3Var);
                    Object objH = rg1Var3.H();
                    if (zG || objH == i80Var) {
                        objH = new dk3(hk3Var, i2);
                        rg1Var3.b0(objH);
                    }
                    if1 if1Var = (if1) objH;
                    boolean zG2 = rg1Var3.g(hk3Var);
                    Object objH2 = rg1Var3.H();
                    if (zG2 || objH2 == i80Var) {
                        objH2 = new wc(17, hk3Var);
                        rg1Var3.b0(objH2);
                    }
                    e35.e(listH0, iG, zBooleanValue, uri, str5, zBooleanValue2, zBooleanValue3, if1Var, (gf1) objH2, rg1Var3, 0);
                } else {
                    rg1Var3.N();
                }
                return j15.a;
            case 10:
                tv3 tv3Var = (tv3) this.o;
                Set set2 = (Set) obj;
                synchronized (tv3Var.c) {
                    try {
                        if (((ov3) tv3Var.u.getValue()).compareTo(ov3.r) >= 0) {
                            x03 x03Var3 = tv3Var.h;
                            if (set2 instanceof x54) {
                                x03 x03Var4 = ((x54) set2).n;
                                Object[] objArr2 = x03Var4.b;
                                long[] jArr2 = x03Var4.a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i9 = 0;
                                    while (true) {
                                        long j2 = jArr2[i9];
                                        if ((((~j2) << c3) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                            int i11 = 0;
                                            while (i11 < i10) {
                                                if ((j2 & 255) < 128) {
                                                    Object obj4 = objArr2[(i9 << 3) + i11];
                                                    c2 = c3;
                                                    if (!(obj4 instanceof sl4) || ((sl4) obj4).e(1)) {
                                                        x03Var3.a(obj4);
                                                    }
                                                } else {
                                                    c2 = c3;
                                                }
                                                j2 >>= 8;
                                                i11++;
                                                c3 = c2;
                                            }
                                            c = c3;
                                            if (i10 == 8) {
                                            }
                                        } else {
                                            c = c3;
                                        }
                                        if (i9 != length2) {
                                            i9++;
                                            c3 = c;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj5 : set2) {
                                    if (!(obj5 instanceof sl4) || ((sl4) obj5).e(1)) {
                                        x03Var3.a(obj5);
                                    }
                                }
                            }
                            azVarY = tv3Var.y();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (azVarY != null) {
                    ((cz) azVarY).resumeWith(j15.a);
                }
                return j15.a;
            case 11:
                a44 a44Var = (a44) this.o;
                int iIntValue4 = ((Integer) obj).intValue();
                le0 le0Var = (le0) obj2;
                me0 key = le0Var.getKey();
                le0 le0VarK = a44Var.o.K(key);
                if (key == fz0.h0) {
                    s22 s22Var2 = (s22) le0VarK;
                    s22 parent = (s22) le0Var;
                    while (parent != null) {
                        if (parent != s22Var2 && (parent instanceof e64)) {
                            c20 c20VarG = ((e64) parent).G();
                            parent = c20VarG != null ? c20VarG.getParent() : null;
                        } else {
                            s22Var = parent;
                            if (s22Var == s22Var2) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + s22Var + ", expected child of " + s22Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                            if (s22Var2 != null) {
                                iIntValue4++;
                            }
                        }
                    }
                    if (s22Var == s22Var2) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + s22Var + ", expected child of " + s22Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (s22Var2 != null) {
                        iIntValue4++;
                    }
                } else if (le0Var != le0VarK) {
                    iIntValue4 = Integer.MIN_VALUE;
                } else {
                    iIntValue4++;
                }
                return Integer.valueOf(iIntValue4);
            case 12:
                jf4 jf4Var = (jf4) this.o;
                Set set3 = (Set) obj;
                synchronized (jf4Var.a) {
                    try {
                        x03 x03Var5 = jf4Var.d;
                        if (x03Var5 != null) {
                            Object[] objArr3 = x03Var5.b;
                            long[] jArr3 = x03Var5.a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j3 = jArr3[i12];
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        int i14 = 0;
                                        while (true) {
                                            if (i14 < i13) {
                                                if ((j3 & 255) >= 128 || !set3.contains(objArr3[(i12 << 3) + i14])) {
                                                    j3 >>= 8;
                                                    i14++;
                                                } else {
                                                    y94Var = jf4Var.f;
                                                }
                                            } else if (i13 == 8) {
                                                if (i12 != length3) {
                                                    i12++;
                                                }
                                            }
                                        }
                                    } else if (i12 != length3) {
                                        i12++;
                                    }
                                }
                            }
                        } else if (q40.s0(set3, jf4Var.b)) {
                            y94Var = jf4Var.f;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (y94Var != null) {
                    y94Var.d(j15.a);
                }
                return j15.a;
            case 13:
                pp3 pp3Var = (pp3) this.o;
                Set set4 = (Set) obj;
                AtomicReference atomicReference = (AtomicReference) pp3Var.d;
                while (true) {
                    Object obj6 = atomicReference.get();
                    if (obj6 == null) {
                        objG0 = set4;
                    } else if (obj6 instanceof Set) {
                        objG0 = gb.P(obj6, set4);
                    } else {
                        if (!(obj6 instanceof List)) {
                            l80.b("Unexpected notification");
                            er1.a();
                            return null;
                        }
                        objG0 = q40.G0((Collection) obj6, gb.O(set4));
                    }
                    do {
                        if (atomicReference.compareAndSet(obj6, objG0)) {
                            if (pp3Var.a()) {
                                ((ja) pp3Var.c).invoke(new wc(26, pp3Var));
                            }
                            return j15.a;
                        }
                    } while (atomicReference.get() == obj6);
                }
                break;
            case 14:
                char[] cArr = (char[]) this.o;
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                charSequence.getClass();
                int iT0 = qm4.t0(charSequence, cArr, iIntValue5, false);
                if (iT0 < 0) {
                    return null;
                }
                return new kd3(Integer.valueOf(iT0), 1);
            default:
                List list3 = (List) this.o;
                CharSequence charSequence2 = (CharSequence) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                charSequence2.getClass();
                if (list3.size() == 1) {
                    String str6 = (String) q40.I0(list3);
                    int iS0 = qm4.s0(charSequence2, str6, iIntValue6, 4);
                    if (iS0 < 0) {
                        kd3Var = null;
                    } else {
                        kd3Var = new kd3(Integer.valueOf(iS0), str6);
                    }
                } else {
                    if (iIntValue6 < 0) {
                        iIntValue6 = 0;
                    }
                    j02 j02Var = new j02(iIntValue6, charSequence2.length(), 1);
                    int i15 = j02Var.p;
                    int i16 = j02Var.o;
                    if (charSequence2 instanceof String) {
                        if ((i15 <= 0 || iIntValue6 > i16) && (i15 >= 0 || i16 > iIntValue6)) {
                            kd3Var = null;
                        } else {
                            while (true) {
                                Iterator it = list3.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        str4 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str3 = (String) next2;
                                    if (str3 != null) {
                                        kd3Var = new kd3(Integer.valueOf(iIntValue6), str3);
                                    } else if (iIntValue6 != i16) {
                                        iIntValue6 += i15;
                                    } else {
                                        kd3Var = null;
                                    }
                                } while (!str4.regionMatches(0, (String) charSequence2, iIntValue6, str4.length()));
                                str3 = (String) next2;
                                if (str3 != null) {
                                    kd3Var = new kd3(Integer.valueOf(iIntValue6), str3);
                                } else if (iIntValue6 != i16) {
                                    iIntValue6 += i15;
                                } else {
                                    kd3Var = null;
                                }
                            }
                        }
                    } else if ((i15 <= 0 || iIntValue6 > i16) && (i15 >= 0 || i16 > iIntValue6)) {
                        kd3Var = null;
                    } else {
                        int i17 = iIntValue6;
                        while (true) {
                            Iterator it2 = list3.iterator();
                            do {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    str2 = (String) next;
                                } else {
                                    next = null;
                                }
                                str = (String) next;
                                if (str != null) {
                                    kd3Var = new kd3(Integer.valueOf(i17), str);
                                } else if (i17 != i16) {
                                    i17 += i15;
                                } else {
                                    kd3Var = null;
                                }
                            } while (!qm4.y0(str2, 0, charSequence2, i17, str2.length(), false));
                            str = (String) next;
                            if (str != null) {
                                kd3Var = new kd3(Integer.valueOf(i17), str);
                            } else if (i17 != i16) {
                                i17 += i15;
                            } else {
                                kd3Var = null;
                            }
                        }
                    }
                }
                if (kd3Var != null) {
                    return new kd3(kd3Var.n, Integer.valueOf(((String) kd3Var.o).length()));
                }
                return null;
        }
    }

    public /* synthetic */ z(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }
}
