package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jy4 {
    public static final String[] l = {"INSERT", "UPDATE", "DELETE"};
    public final s24 a;
    public final HashMap b;
    public final HashMap c;
    public final boolean d;
    public final q e;
    public final String[] g;
    public final ll h;
    public final om1 i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public gf1 k = new rd2(9);
    public final LinkedHashMap f = new LinkedHashMap();

    public jy4(s24 s24Var, HashMap map, HashMap map2, String[] strArr, boolean z, q qVar) {
        String lowerCase;
        this.a = s24Var;
        this.b = map;
        this.c = map2;
        this.d = z;
        this.e = qVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            this.f.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.b.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.g = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            lowerCase3.getClass();
            if (this.f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase4.getClass();
                LinkedHashMap linkedHashMap = this.f;
                linkedHashMap.put(lowerCase4, lg2.V(lowerCase3, linkedHashMap));
            }
        }
        this.h = new ll(this.g.length);
        this.i = new om1(this.g.length);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(jy4 jy4Var, yn3 yn3Var, wd0 wd0Var) {
        by4 by4Var;
        if (wd0Var instanceof by4) {
            by4Var = (by4) wd0Var;
            int i = by4Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                by4Var.q = i - Integer.MIN_VALUE;
            } else {
                by4Var = new by4(jy4Var, wd0Var);
            }
        } else {
            by4Var = new by4(jy4Var, wd0Var);
        }
        Object objB = by4Var.o;
        int i2 = by4Var.q;
        xe0 xe0Var = xe0.n;
        if (i2 == 0) {
            kb4.X(objB);
            o54 o54Var = new o54(21);
            by4Var.n = yn3Var;
            by4Var.q = 1;
            objB = yn3Var.b("SELECT * FROM room_table_modification_log WHERE invalidated = 1", o54Var, by4Var);
            if (objB != xe0Var) {
            }
            return xe0Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set = (Set) by4Var.n;
            kb4.X(objB);
            return set;
        }
        yn3Var = (yn3) by4Var.n;
        kb4.X(objB);
        Set set2 = (Set) objB;
        if (!set2.isEmpty()) {
            by4Var.n = set2;
            by4Var.q = 2;
            if (bu.i(yn3Var, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", by4Var) == xe0Var) {
                return xe0Var;
            }
        }
        return set2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object b(jy4 jy4Var, wd0 wd0Var) throws Throwable {
        dy4 dy4Var;
        qr2 qr2Var;
        Object objU;
        Throwable th;
        qr2 qr2Var2;
        Object value;
        int[] iArr;
        s24 s24Var = jy4Var.a;
        if (wd0Var instanceof dy4) {
            dy4Var = (dy4) wd0Var;
            int i = dy4Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                dy4Var.r = i - Integer.MIN_VALUE;
            } else {
                dy4Var = new dy4(jy4Var, wd0Var);
            }
        } else {
            dy4Var = new dy4(jy4Var, wd0Var);
        }
        Object obj = dy4Var.p;
        int i2 = dy4Var.r;
        vd0 vd0Var = null;
        int i3 = 1;
        if (i2 == 0) {
            kb4.X(obj);
            qr2Var = s24Var.f;
            boolean zD = qr2Var.d();
            z01 z01Var = z01.n;
            if (!zD) {
                return z01Var;
            }
            try {
                if (!jy4Var.j.compareAndSet(true, false)) {
                    qr2Var.x();
                    return z01Var;
                }
                if (!((Boolean) jy4Var.k.invoke()).booleanValue()) {
                    qr2Var.x();
                    return z01Var;
                }
                ey4 ey4Var = new ey4(jy4Var, vd0Var, i3);
                dy4Var.n = jy4Var;
                dy4Var.o = qr2Var;
                dy4Var.r = 1;
                objU = s24Var.u(false, ey4Var, dy4Var);
                xe0 xe0Var = xe0.n;
                if (objU == xe0Var) {
                    return xe0Var;
                }
            } catch (Throwable th2) {
                qr2 qr2Var3 = qr2Var;
                th = th2;
                qr2Var2 = qr2Var3;
                qr2Var2.x();
                throw th;
            }
        } else {
            if (i2 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qr2Var2 = dy4Var.o;
            jy4 jy4Var2 = dy4Var.n;
            try {
                kb4.X(obj);
                qr2Var = qr2Var2;
                jy4Var = jy4Var2;
                objU = obj;
            } catch (Throwable th3) {
                th = th3;
                qr2Var2.x();
                throw th;
            }
        }
        Set set = (Set) objU;
        if (!set.isEmpty()) {
            om1 om1Var = jy4Var.i;
            om1Var.getClass();
            set.getClass();
            if (!set.isEmpty()) {
                nl4 nl4Var = (nl4) om1Var.o;
                do {
                    value = nl4Var.getValue();
                    int[] iArr2 = (int[]) value;
                    int length = iArr2.length;
                    iArr = new int[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        iArr[i4] = set.contains(Integer.valueOf(i4)) ? iArr2[i4] + 1 : iArr2[i4];
                    }
                    f01 f01Var = xl.e;
                    if (value == null) {
                        value = f01Var;
                    }
                } while (!nl4Var.j(value, iArr));
            }
            jy4Var.e.invoke(set);
        }
        qr2Var.x();
        return set;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0090  */
    /* JADX WARN: Code duplicated, block: B:23:0x0096  */
    /* JADX WARN: Code duplicated, block: B:24:0x0099  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007e, code lost:
    
        if (defpackage.bu.i(r1, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00de, code lost:
    
        if (defpackage.bu.i(r10, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e0, code lost:
    
        return r8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00de -> B:28:0x00e1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(jy4 jy4Var, mw4 mw4Var, int i, wd0 wd0Var) {
        fy4 fy4Var;
        String[] strArr;
        jy4 jy4Var2;
        int i2;
        yn3 yn3Var;
        int i3;
        String str;
        String str2;
        boolean z;
        jy4 jy4Var3 = jy4Var;
        yn3 yn3Var2 = mw4Var;
        int i4 = i;
        jy4Var3.getClass();
        if (wd0Var instanceof fy4) {
            fy4Var = (fy4) wd0Var;
            int i5 = fy4Var.w;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                fy4Var.w = i5 - Integer.MIN_VALUE;
            } else {
                fy4Var = new fy4(jy4Var3, wd0Var);
            }
        } else {
            fy4Var = new fy4(jy4Var3, wd0Var);
        }
        Object obj = fy4Var.u;
        int i6 = fy4Var.w;
        boolean z2 = true;
        xe0 xe0Var = xe0.n;
        if (i6 != 0) {
            if (i6 == 1) {
                int i7 = fy4Var.r;
                yn3Var2 = fy4Var.o;
                jy4 jy4Var4 = fy4Var.n;
                kb4.X(obj);
                i4 = i7;
                jy4Var3 = jy4Var4;
            } else {
                if (i6 != 2) {
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = fy4Var.t;
                i3 = fy4Var.s;
                i4 = fy4Var.r;
                strArr = fy4Var.q;
                str = fy4Var.p;
                yn3Var = fy4Var.o;
                jy4Var2 = fy4Var.n;
                kb4.X(obj);
                z = true;
            }
            i3++;
            z2 = z;
            if (i3 < i2) {
                return j15.a;
            }
            String str3 = strArr[i3];
            if (jy4Var2.d) {
                str2 = "TEMP";
            } else {
                str2 = "";
            }
            z = z2;
            StringBuilder sbU = b11.u("CREATE ", str2, " TRIGGER IF NOT EXISTS `", "room_table_modification_trigger_" + str + '_' + str3, "` AFTER ");
            f34.n(sbU, str3, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
            String strI = f34.i(sbU, i4, " AND invalidated = 0; END");
            fy4Var.n = jy4Var2;
            fy4Var.o = yn3Var;
            fy4Var.p = str;
            fy4Var.q = strArr;
            fy4Var.r = i4;
            fy4Var.s = i3;
            fy4Var.t = i2;
            fy4Var.w = 2;
        } else {
            kb4.X(obj);
            String str4 = "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i4 + ", 0)";
            fy4Var.n = jy4Var3;
            fy4Var.o = yn3Var2;
            fy4Var.r = i4;
            fy4Var.w = 1;
        }
        String str5 = jy4Var3.g[i4];
        strArr = l;
        jy4Var2 = jy4Var3;
        i2 = 3;
        yn3Var = yn3Var2;
        i3 = 0;
        str = str5;
        if (i3 < i2) {
            return j15.a;
        }
        String str6 = strArr[i3];
        if (jy4Var2.d) {
            str2 = "TEMP";
        } else {
            str2 = "";
        }
        z = z2;
        StringBuilder sbU2 = b11.u("CREATE ", str2, " TRIGGER IF NOT EXISTS `", "room_table_modification_trigger_" + str + '_' + str6, "` AFTER ");
        f34.n(sbU2, str6, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
        String strI2 = f34.i(sbU2, i4, " AND invalidated = 0; END");
        fy4Var.n = jy4Var2;
        fy4Var.o = yn3Var;
        fy4Var.p = str;
        fy4Var.q = strArr;
        fy4Var.r = i4;
        fy4Var.s = i3;
        fy4Var.t = i2;
        fy4Var.w = 2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:18:0x008e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008c -> B:19:0x008f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(defpackage.jy4 r7, defpackage.mw4 r8, int r9, defpackage.wd0 r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof defpackage.gy4
            if (r0 == 0) goto L16
            r0 = r10
            gy4 r0 = (defpackage.gy4) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.u = r1
            goto L1b
        L16:
            gy4 r0 = new gy4
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.s
            int r1 = r0.u
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 != r2) goto L34
            int r7 = r0.r
            int r8 = r0.q
            java.lang.String[] r9 = r0.p
            java.lang.String r1 = r0.o
            yn3 r3 = r0.n
            defpackage.kb4.X(r10)
            r10 = r9
            r9 = r3
            goto L8f
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.kf2.o(r7)
            r7 = 0
            return r7
        L3b:
            defpackage.kb4.X(r10)
            java.lang.String[] r7 = r7.g
            r7 = r7[r9]
            java.lang.String[] r9 = defpackage.jy4.l
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4d:
            if (r8 >= r7) goto L91
            r3 = r10[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "DROP TRIGGER IF EXISTS `"
            r4.<init>(r5)
            r4.append(r3)
            r3 = 96
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.n = r9
            r0.o = r1
            r0.p = r10
            r0.q = r8
            r0.r = r7
            r0.u = r2
            java.lang.Object r3 = defpackage.bu.i(r9, r3, r0)
            xe0 r4 = defpackage.xe0.n
            if (r3 != r4) goto L8f
            return r4
        L8f:
            int r8 = r8 + r2
            goto L4d
        L91:
            j15 r7 = defpackage.j15.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jy4.d(jy4, mw4, int, wd0):java.lang.Object");
    }

    public final void e(gf1 gf1Var, gf1 gf1Var2) {
        gf1Var.getClass();
        gf1Var2.getClass();
        if (this.j.compareAndSet(false, true)) {
            gf1Var.invoke();
            fu.G(this.a.h(), new se0(), null, new p(this, gf1Var2, null, 17), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(wd0 wd0Var) throws Throwable {
        hy4 hy4Var;
        qr2 qr2Var;
        if (wd0Var instanceof hy4) {
            hy4Var = (hy4) wd0Var;
            int i = hy4Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                hy4Var.q = i - Integer.MIN_VALUE;
            } else {
                hy4Var = new hy4(this, wd0Var);
            }
        } else {
            hy4Var = new hy4(this, wd0Var);
        }
        Object obj = hy4Var.o;
        int i2 = hy4Var.q;
        vd0 vd0Var = null;
        if (i2 == 0) {
            kb4.X(obj);
            s24 s24Var = this.a;
            qr2 qr2Var2 = s24Var.f;
            if (qr2Var2.d()) {
                try {
                    ey4 ey4Var = new ey4(this, vd0Var, 2);
                    hy4Var.n = qr2Var2;
                    hy4Var.q = 1;
                    Object objU = s24Var.u(false, ey4Var, hy4Var);
                    xe0 xe0Var = xe0.n;
                    if (objU == xe0Var) {
                        return xe0Var;
                    }
                    qr2Var = qr2Var2;
                    qr2Var.x();
                } catch (Throwable th) {
                    th = th;
                    qr2Var = qr2Var2;
                    qr2Var.x();
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qr2Var = hy4Var.n;
            try {
                kb4.X(obj);
                qr2Var.x();
            } catch (Throwable th2) {
                th = th2;
                qr2Var.x();
                throw th;
            }
        }
        return j15.a;
    }

    public final kd3 g(String[] strArr) {
        fb4 fb4Var = new fb4();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) this.c.get(lowerCase);
            if (set != null) {
                fb4Var.addAll(set);
            } else {
                fb4Var.add(str);
            }
        }
        String[] strArr2 = (String[]) kb4.l(fb4Var).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) this.f.get(lowerCase2);
            if (num == null) {
                kf2.n("There is no table with name ".concat(str2));
                return null;
            }
            iArr[i] = num.intValue();
        }
        return new kd3(strArr2, iArr);
    }
}
