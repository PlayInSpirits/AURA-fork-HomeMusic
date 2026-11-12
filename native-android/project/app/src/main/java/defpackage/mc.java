package defpackage;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mc implements qd3 {
    public final String n;
    public final zs4 o;
    public final List p;
    public final List q;
    public final ha1 r;
    public final oo0 s;
    public final xc t;
    public final CharSequence u;
    public final t62 v;
    public z05 w;
    public final boolean x;
    public final int y;
    public final int z;

    /* JADX WARN: Code duplicated, block: B:15:0x0071  */
    /* JADX WARN: Code duplicated, block: B:18:0x0076  */
    /* JADX WARN: Code duplicated, block: B:229:0x0453  */
    /* JADX WARN: Code duplicated, block: B:245:0x0497  */
    /* JADX WARN: Code duplicated, block: B:251:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:257:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:258:0x04df  */
    /* JADX WARN: Code duplicated, block: B:260:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:261:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:264:0x0501  */
    /* JADX WARN: Code duplicated, block: B:265:0x0506  */
    /* JADX WARN: Code duplicated, block: B:267:0x0511  */
    /* JADX WARN: Code duplicated, block: B:268:0x0517  */
    /* JADX WARN: Code duplicated, block: B:272:0x0544  */
    /* JADX WARN: Code duplicated, block: B:274:0x0550  */
    /* JADX WARN: Code duplicated, block: B:283:0x0566  */
    /* JADX WARN: Code duplicated, block: B:296:0x0581  */
    /* JADX WARN: Code duplicated, block: B:299:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:301:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:302:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:304:0x05fd A[LOOP:8: B:303:0x05fb->B:304:0x05fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:307:0x0613  */
    /* JADX WARN: Code duplicated, block: B:309:0x0618  */
    /* JADX WARN: Code duplicated, block: B:311:0x061f  */
    /* JADX WARN: Code duplicated, block: B:313:0x0623  */
    /* JADX WARN: Code duplicated, block: B:314:0x062a  */
    /* JADX WARN: Code duplicated, block: B:316:0x0632  */
    /* JADX WARN: Code duplicated, block: B:324:0x0665  */
    /* JADX WARN: Code duplicated, block: B:329:0x0682  */
    /* JADX WARN: Code duplicated, block: B:331:0x068e  */
    /* JADX WARN: Code duplicated, block: B:338:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:392:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:394:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:396:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:403:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:417:0x0849  */
    /* JADX WARN: Code duplicated, block: B:419:0x085a  */
    /* JADX WARN: Code duplicated, block: B:420:0x085e  */
    /* JADX WARN: Code duplicated, block: B:422:0x0869  */
    /* JADX WARN: Code duplicated, block: B:425:0x0873 A[LOOP:6: B:424:0x0871->B:425:0x0873, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:428:0x0884  */
    /* JADX WARN: Code duplicated, block: B:430:0x088f  */
    /* JADX WARN: Code duplicated, block: B:432:0x089c A[LOOP:7: B:431:0x089a->B:432:0x089c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:435:0x08a9  */
    /* JADX WARN: Code duplicated, block: B:437:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:440:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:452:0x0569 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:430:0x088f, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mc] */
    public mc(String str, zs4 zs4Var, List list, List list2, ha1 ha1Var, oo0 oo0Var, boolean z) throws Throwable {
        boolean zBooleanValue;
        Locale locale;
        int i;
        Object obj;
        lc lcVar;
        Typeface typeface;
        CharSequence charSequence;
        int length;
        int i2;
        cs4 cs4Var;
        ArrayList arrayList;
        int size;
        int i3;
        vk0 vk0Var;
        ij4 ij4Var;
        gc3 gc3Var;
        int size2;
        int i4;
        int[] iArr;
        int size3;
        int i5;
        int i6;
        int i7;
        int i8;
        int size4;
        ij4 ij4VarZ;
        int i9;
        ArrayList arrayList2;
        ij4 ij4Var2;
        int i10;
        int i11;
        int i12;
        int size5;
        int i13;
        boolean z2;
        cs4 cs4Var2;
        int size6;
        int i14;
        mc mcVar;
        int i15;
        ge geVar;
        long j;
        long jB;
        int size7;
        int i16;
        ge geVar2;
        fe feVar;
        int i17;
        int i18;
        int i19;
        ge geVar3;
        Object obj2;
        int i20;
        int i21;
        ge geVar4;
        Object obj3;
        ij4 ij4Var3;
        long j2;
        long j3;
        int i22;
        long jB2;
        float fC;
        long jB3;
        float fC2;
        zg3 zg3Var;
        CharSequence charSequence2;
        zg3 zg3Var2;
        ?? obj4 = new Object();
        obj4.n = str;
        obj4.o = zs4Var;
        obj4.p = list;
        obj4.q = list2;
        obj4.r = ha1Var;
        obj4.s = oo0Var;
        float fG = oo0Var.g();
        int i23 = 1;
        xc xcVar = new xc(1);
        ((TextPaint) xcVar).density = fG;
        xcVar.b = sr4.b;
        xcVar.c = 3;
        xcVar.d = xb4.d;
        obj4.t = xcVar;
        boolean zB = fu.b(zs4Var);
        ij4 ij4Var4 = zs4Var.a;
        sd3 sd3Var = zs4Var.b;
        int i24 = 0;
        if (zB) {
            d34 d34Var = xz0.a;
            d34 d34Var2 = xz0.a;
            kl4 kl4VarD = (kl4) d34Var2.o;
            if (kl4VarD == null) {
                if (tz0.c()) {
                    kl4VarD = d34Var2.D();
                    d34Var2.o = kl4VarD;
                } else {
                    kl4VarD = fu.t;
                }
            }
            zBooleanValue = ((Boolean) kl4VarD.getValue()).booleanValue();
        } else {
            zBooleanValue = false;
        }
        obj4.x = zBooleanValue;
        int i25 = sd3Var.b;
        vd2 vd2Var = ij4Var4.k;
        if (i25 == 4) {
            i = 2;
        } else if (i25 == 5) {
            i = 3;
        } else if (i25 == 1) {
            i = 0;
        } else if (i25 == 2) {
            i = 1;
        } else {
            if (i25 != 3 && i25 != 0) {
                kf2.o("Invalid TextDirection.");
                throw null;
            }
            int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((vd2Var == null || (locale = ((ud2) vd2Var.n.get(0)).a) == null) ? Locale.getDefault() : locale);
            if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                i = 2;
            } else {
                i = 3;
            }
        }
        obj4.y = i;
        obj4.z = -1;
        lc lcVar2 = new lc(i24, obj4);
        qs4 qs4Var = sd3Var.i;
        qs4Var = qs4Var == null ? qs4.c : qs4Var;
        xcVar.setFlags(qs4Var.b ? xcVar.getFlags() | 128 : xcVar.getFlags() & (-129));
        int i26 = qs4Var.a;
        if (i26 == 1) {
            xcVar.setFlags(xcVar.getFlags() | 64);
            xcVar.setHinting(0);
        } else if (i26 == 2) {
            xcVar.getFlags();
            xcVar.setHinting(1);
        } else if (i26 == 3) {
            xcVar.getFlags();
            xcVar.setHinting(0);
        } else {
            xcVar.getFlags();
        }
        int size8 = list.size();
        int i27 = 0;
        while (true) {
            if (i27 >= size8) {
                obj = null;
                break;
            }
            obj = list.get(i27);
            if (((ge) obj).a instanceof ij4) {
                break;
            } else {
                i27++;
            }
        }
        boolean z3 = obj != null;
        long j4 = ij4Var4.b;
        gb1 gb1Var = ij4Var4.c;
        eb1 eb1Var = ij4Var4.d;
        String str2 = ij4Var4.g;
        vd2 vd2Var2 = ij4Var4.k;
        as4 as4Var = ij4Var4.a;
        bs4 bs4Var = ij4Var4.j;
        long j5 = ij4Var4.h;
        long jB4 = bt4.b(j4);
        boolean z4 = z3;
        if (ct4.a(jB4, 4294967296L)) {
            xcVar.setTextSize(oo0Var.a0(j4));
        } else if (ct4.a(jB4, 8589934592L)) {
            xcVar.setTextSize(bt4.c(j4) * xcVar.getTextSize());
        }
        vk0 vk0Var2 = ij4Var4.f;
        if (vk0Var2 == null && eb1Var == null && gb1Var == null) {
            lcVar = lcVar2;
        } else {
            gb1 gb1Var2 = gb1Var == null ? gb1.p : gb1Var;
            int i28 = eb1Var != null ? eb1Var.a : 0;
            fb1 fb1Var = ij4Var4.e;
            int i29 = fb1Var != null ? fb1Var.a : 65535;
            lcVar = lcVar2;
            mc mcVar2 = (mc) lcVar.o;
            n05 n05VarB = ((ia1) mcVar2.r).b(vk0Var2, gb1Var2, i28, i29);
            if (n05VarB instanceof n05) {
                Object obj5 = n05VarB.n;
                obj5.getClass();
                typeface = (Typeface) obj5;
            } else {
                z05 z05Var = new z05(n05VarB, mcVar2.w);
                mcVar2.w = z05Var;
                Object obj6 = z05Var.q;
                obj6.getClass();
                typeface = (Typeface) obj6;
            }
            xcVar.setTypeface(typeface);
        }
        if (vd2Var2 != null) {
            vd2 vd2Var3 = vd2.p;
            if (!vd2Var2.equals(fh0.m())) {
                ArrayList arrayList3 = new ArrayList(r40.k0(vd2Var2, 10));
                Iterator it = vd2Var2.n.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((ud2) it.next()).a);
                }
                Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                xcVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            }
        }
        if (str2 != null && !str2.equals("")) {
            xcVar.setFontFeatureSettings(str2);
        }
        if (bs4Var != null && !bs4Var.equals(bs4.c)) {
            xcVar.setTextScaleX(xcVar.getTextScaleX() * bs4Var.a);
            xcVar.setTextSkewX(xcVar.getTextSkewX() + bs4Var.b);
        }
        xcVar.d(as4Var.c());
        xcVar.c(as4Var.f(), 9205357640488583168L, as4Var.b());
        xcVar.f(ij4Var4.n);
        xcVar.g(ij4Var4.m);
        xcVar.e(ij4Var4.o);
        if (ct4.a(bt4.b(j5), 4294967296L) && bt4.c(j5) != 0.0f) {
            float textScaleX = xcVar.getTextScaleX() * xcVar.getTextSize();
            float fA0 = oo0Var.a0(j5);
            if (textScaleX != 0.0f) {
                xcVar.setLetterSpacing(fA0 / textScaleX);
            }
        } else if (ct4.a(bt4.b(j5), 8589934592L)) {
            xcVar.setLetterSpacing(bt4.c(j5));
        }
        long j6 = ij4Var4.l;
        hr hrVar = ij4Var4.i;
        boolean z5 = z4 && ct4.a(bt4.b(j5), 4294967296L) && bt4.c(j5) != 0.0f;
        long j7 = x40.g;
        boolean z6 = (x40.c(j6, j7) || x40.c(j6, x40.f)) ? false : true;
        boolean z7 = (hrVar == null || Float.compare(hrVar.a, 0.0f) == 0) ? false : true;
        ij4 ij4Var5 = (z5 || z6 || z7) ? new ij4(0L, 0L, (gb1) null, (eb1) null, (fb1) null, (vk0) null, (String) null, z5 ? j5 : bt4.c, z7 ? hrVar : null, (bs4) null, (vd2) null, z6 ? j6 : j7, (sr4) null, (xb4) null, 63103) : null;
        List list3 = obj4.p;
        if (ij4Var5 != null) {
            int size9 = list3.size() + 1;
            ArrayList arrayList4 = new ArrayList(size9);
            int i30 = 0;
            while (i30 < size9) {
                arrayList4.add(i30 == 0 ? new ge(0, obj4.n.length(), ij4Var5) : (ge) obj4.p.get(i30 - 1));
                i30++;
            }
            list3 = arrayList4;
        }
        String str3 = obj4.n;
        float textSize = obj4.t.getTextSize();
        zs4 zs4Var2 = obj4.o;
        List list4 = obj4.q;
        oo0 oo0Var2 = obj4.s;
        boolean z8 = obj4.x;
        String str4 = obj4.n;
        if (obj4.z == -1) {
            obj4.z = (str4.length() > 512 || qm4.n0(str4, '\n')) ? 1 : 0;
        }
        jc jcVar = kc.a;
        if (z8 && tz0.c()) {
            eh3 eh3Var = zs4Var2.c;
            h01 h01Var = (eh3Var == null || (zg3Var2 = eh3Var.a) == null) ? null : new h01(zg3Var2.b);
            CharSequence charSequenceF = tz0.a().f(0, str3.length(), (h01Var != null && h01Var.a == 2) ? 1 : 0, str3);
            charSequenceF.getClass();
            charSequence = charSequenceF;
        } else {
            charSequence = str3;
        }
        if (!list3.isEmpty() || !list4.isEmpty() || !h12.c(zs4Var2.b.d, cs4.c) || (zs4Var2.b.c & 1095216660480L) != 0) {
            mcVar = obj4;
            charSequence2 = charSequence;
            Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
            ij4 ij4Var6 = zs4Var2.a;
            sd3 sd3Var2 = zs4Var2.b;
            if (h12.c(ij4Var6.m, sr4.c)) {
                spannableString.setSpan(kc.a, 0, str3.length(), 33);
            }
            eh3 eh3Var2 = zs4Var2.c;
            if (((eh3Var2 == null || (zg3Var = eh3Var2.a) == null) ? false : zg3Var.a) && sd3Var2.f == null) {
                float fO = uo.O(sd3Var2.c, textSize, oo0Var2);
                if (!Float.isNaN(fO)) {
                    spannableString.setSpan(new na2(fO), 0, spannableString.length(), 33);
                }
            } else {
                ra2 ra2Var = sd3Var2.f;
                ra2Var = ra2Var == null ? ra2.d : ra2Var;
                float fO2 = uo.O(sd3Var2.c, textSize, oo0Var2);
                if (!Float.isNaN(fO2)) {
                    if (spannableString.length() == 0) {
                        length = spannableString.length() + 1;
                    } else {
                        if (spannableString.length() == 0) {
                            kf2.m("Char sequence is empty.");
                            throw null;
                        }
                        if (spannableString.charAt(spannableString.length() - 1) == '\n') {
                            length = spannableString.length() + 1;
                        } else {
                            length = spannableString.length();
                        }
                    }
                    int i31 = length;
                    int i32 = ra2Var.b;
                    i2 = 0;
                    spannableString.setSpan(new sa2(fO2, i31, (i32 & 1) > 0, (i32 & 16) > 0, ra2Var.a, ra2Var.c), 0, spannableString.length(), 33);
                }
                cs4Var = sd3Var2.d;
                if (cs4Var != null) {
                    j2 = cs4Var.a;
                    j3 = cs4Var.b;
                    i22 = i2;
                    if ((bt4.a(j2, su3.v(i22)) || !bt4.a(j3, su3.v(i22))) && (j2 & 1095216660480L) != 0 && (j3 & 1095216660480L) != 0) {
                        jB2 = bt4.b(j2);
                        if (ct4.a(jB2, 4294967296L)) {
                            fC = oo0Var2.a0(j2);
                        } else if (ct4.a(jB2, 8589934592L)) {
                            fC = bt4.c(j2) * textSize;
                        } else {
                            fC = 0.0f;
                        }
                        jB3 = bt4.b(j3);
                        if (ct4.a(jB3, 4294967296L)) {
                            fC2 = oo0Var2.a0(j3);
                        } else if (ct4.a(jB3, 8589934592L)) {
                            fC2 = bt4.c(j3) * textSize;
                        } else {
                            fC2 = 0.0f;
                        }
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                    }
                }
                arrayList = new ArrayList(list3.size());
                size = list3.size();
                for (i3 = 0; i3 < size; i3++) {
                    geVar4 = (ge) list3.get(i3);
                    obj3 = geVar4.a;
                    if (obj3 instanceof ij4) {
                        ij4Var3 = (ij4) obj3;
                        if (ij4Var3.f == null || ij4Var3.d != null || ij4Var3.c != null || ((ij4) obj3).e != null) {
                            arrayList.add(geVar4);
                        }
                    }
                }
                vk0Var = ij4Var6.f;
                if (vk0Var != null && ij4Var6.d == null && ij4Var6.c == null && ij4Var6.e == null) {
                    ij4Var = null;
                } else {
                    ij4Var = new ij4(0L, 0L, ij4Var6.c, ij4Var6.d, ij4Var6.e, vk0Var, (String) null, 0L, (hr) null, (bs4) null, (vd2) null, 0L, (sr4) null, (xb4) null, 65475);
                }
                gc3Var = new gc3(i23, spannableString, lcVar);
                if (arrayList.size() <= 1) {
                    size2 = arrayList.size();
                    i4 = size2 * 2;
                    iArr = new int[i4];
                    size3 = arrayList.size();
                    for (i5 = 0; i5 < size3; i5++) {
                        ge geVar5 = (ge) arrayList.get(i5);
                        iArr[i5] = geVar5.b;
                        iArr[i5 + size2] = geVar5.c;
                    }
                    if (i4 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i4 != 0) {
                        kf2.m("Array is empty.");
                        throw null;
                    }
                    i6 = iArr[0];
                    i7 = 0;
                    while (i7 < i4) {
                        i8 = iArr[i7];
                        if (i8 == i6) {
                            arrayList2 = arrayList;
                            ij4Var2 = ij4Var;
                            i10 = i7;
                        } else {
                            size4 = arrayList.size();
                            ij4VarZ = ij4Var;
                            i9 = 0;
                            while (i9 < size4) {
                                ArrayList arrayList5 = arrayList;
                                ge geVar6 = (ge) arrayList.get(i9);
                                ij4 ij4Var7 = ij4Var;
                                i11 = geVar6.b;
                                int i33 = i7;
                                i12 = geVar6.c;
                                if (i11 == i12 && ie.a(i6, i8, i11, i12)) {
                                    ij4VarZ = uo.z(ij4VarZ, (ij4) geVar6.a);
                                }
                                i9++;
                                arrayList = arrayList5;
                                ij4Var = ij4Var7;
                                i7 = i33;
                            }
                            arrayList2 = arrayList;
                            ij4Var2 = ij4Var;
                            i10 = i7;
                            if (ij4VarZ != null) {
                                gc3Var.a(ij4VarZ, Integer.valueOf(i6), Integer.valueOf(i8));
                            }
                            i6 = i8;
                        }
                        i7 = i10 + 1;
                        arrayList = arrayList2;
                        ij4Var = ij4Var2;
                    }
                } else if (!arrayList.isEmpty()) {
                    gc3Var.a(uo.z(ij4Var, (ij4) ((ge) arrayList.get(0)).a), Integer.valueOf(((ge) arrayList.get(0)).b), Integer.valueOf(((ge) arrayList.get(0)).c));
                }
                size5 = list3.size();
                i13 = 0;
                z2 = false;
                while (i13 < size5) {
                    geVar3 = (ge) list3.get(i13);
                    obj2 = geVar3.a;
                    if (obj2 instanceof ij4) {
                        i20 = geVar3.b;
                        int i34 = geVar3.c;
                        if (i20 >= 0 || i20 >= spannableString.length() || i34 <= i20 || i34 > spannableString.length()) {
                            size5 = size5;
                            z2 = z2;
                        } else {
                            ij4 ij4Var8 = (ij4) obj2;
                            long j8 = ij4Var8.h;
                            hr hrVar2 = ij4Var8.i;
                            as4 as4Var2 = ij4Var8.a;
                            if (hrVar2 != null) {
                                spannableString.setSpan(new ir(0, hrVar2.a), i20, i34, 33);
                            }
                            uo.P(spannableString, as4Var2.c(), i20, i34);
                            uo uoVarF = as4Var2.f();
                            float fB = as4Var2.b();
                            if (uoVarF != null) {
                                if (uoVarF instanceof zh4) {
                                    uo.P(spannableString, ((zh4) uoVarF).u, i20, i34);
                                } else {
                                    spannableString.setSpan(new wb4((pv) uoVarF, fB), i20, i34, 33);
                                }
                            }
                            sr4 sr4Var = ij4Var8.m;
                            if (sr4Var != null) {
                                int i35 = sr4Var.a;
                                tr4 tr4Var = new tr4((i35 | 1) == i35, (i35 | 2) == i35);
                                i21 = 33;
                                spannableString.setSpan(tr4Var, i20, i34, 33);
                            } else {
                                i21 = 33;
                            }
                            sd3Var2 = sd3Var2;
                            uo.Q(spannableString, ij4Var8.b, oo0Var2, i20, i34);
                            String str5 = ij4Var8.g;
                            if (str5 != null) {
                                spannableString.setSpan(new ka1(0, str5), i20, i34, i21);
                            }
                            bs4 bs4Var2 = ij4Var8.j;
                            if (bs4Var2 != null) {
                                spannableString.setSpan(new ScaleXSpan(bs4Var2.a), i20, i34, i21);
                                spannableString.setSpan(new ir(1, bs4Var2.b), i20, i34, i21);
                            }
                            uo.R(spannableString, ij4Var8.k, i20, i34);
                            long j9 = ij4Var8.l;
                            if (j9 != 16) {
                                spannableString.setSpan(new BackgroundColorSpan(e35.U(j9)), i20, i34, i21);
                            }
                            xb4 xb4Var = ij4Var8.n;
                            if (xb4Var != null) {
                                long j10 = xb4Var.b;
                                int iU = e35.U(xb4Var.a);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
                                float f = xb4Var.c;
                                zb4 zb4Var = new zb4(iU, fIntBitsToFloat, fIntBitsToFloat2, f == 0.0f ? Float.MIN_VALUE : f);
                                i21 = 33;
                                spannableString.setSpan(zb4Var, i20, i34, 33);
                            }
                            q05 q05Var = ij4Var8.o;
                            if (q05Var != null) {
                                spannableString.setSpan(new tv0(q05Var), i20, i34, i21);
                            }
                            z2 = (ct4.a(bt4.b(j8), 4294967296L) || ct4.a(bt4.b(j8), 8589934592L)) ? true : z2;
                        }
                        z2 = z2;
                    } else {
                        size5 = size5;
                        z2 = z2;
                        z2 = z2;
                    }
                    i13++;
                    size5 = size5;
                }
                if (z2) {
                    size7 = list3.size();
                    i16 = 0;
                    while (i16 < size7) {
                        geVar2 = (ge) list3.get(i16);
                        feVar = (fe) geVar2.a;
                        if (feVar instanceof ij4) {
                            i19 = geVar2.b;
                            int i36 = geVar2.c;
                            if (i19 >= 0 || i19 >= spannableString.length() || i36 <= i19 || i36 > spannableString.length()) {
                                i17 = size7;
                                i18 = i16;
                            } else {
                                long j11 = ((ij4) feVar).h;
                                long jB5 = bt4.b(j11);
                                i17 = size7;
                                i18 = i16;
                                Object i92Var = ct4.a(jB5, 4294967296L) ? new i92(oo0Var2.a0(j11)) : ct4.a(jB5, 8589934592L) ? new h92(bt4.c(j11)) : null;
                                if (i92Var != null) {
                                    spannableString.setSpan(i92Var, i19, i36, 33);
                                }
                            }
                        } else {
                            i17 = size7;
                            i18 = i16;
                        }
                        i16 = i18 + 1;
                        size7 = i17;
                    }
                }
                cs4Var2 = sd3Var2.d;
                if (cs4Var2 != null) {
                    j = cs4Var2.a;
                    jB = bt4.b(j);
                    if (ct4.a(jB, 4294967296L)) {
                        oo0Var2.a0(j);
                    } else if (ct4.a(jB, 8589934592L)) {
                        bt4.c(j);
                    }
                }
                size6 = list3.size();
                for (i14 = 0; i14 < size6; i14++) {
                    Object obj7 = ((ge) list3.get(i14)).a;
                }
                if (list4.size() > 0) {
                    geVar = (ge) list4.get(0);
                    if (geVar.a == null) {
                        kf2.k();
                        throw null;
                    }
                    for (Object obj8 : spannableString.getSpans(geVar.b, geVar.c, l05.class)) {
                        spannableString.removeSpan((l05) obj8);
                    }
                    throw null;
                }
                mcVar = this;
                charSequence2 = spannableString;
            }
            i2 = 0;
            cs4Var = sd3Var2.d;
            if (cs4Var != null) {
                j2 = cs4Var.a;
                j3 = cs4Var.b;
                i22 = i2;
                if (bt4.a(j2, su3.v(i22))) {
                    jB2 = bt4.b(j2);
                    if (ct4.a(jB2, 4294967296L)) {
                        fC = oo0Var2.a0(j2);
                    } else if (ct4.a(jB2, 8589934592L)) {
                        fC = bt4.c(j2) * textSize;
                    } else {
                        fC = 0.0f;
                    }
                    jB3 = bt4.b(j3);
                    if (ct4.a(jB3, 4294967296L)) {
                        fC2 = oo0Var2.a0(j3);
                    } else if (ct4.a(jB3, 8589934592L)) {
                        fC2 = bt4.c(j3) * textSize;
                    } else {
                        fC2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                } else {
                    jB2 = bt4.b(j2);
                    if (ct4.a(jB2, 4294967296L)) {
                        fC = oo0Var2.a0(j2);
                    } else if (ct4.a(jB2, 8589934592L)) {
                        fC = bt4.c(j2) * textSize;
                    } else {
                        fC = 0.0f;
                    }
                    jB3 = bt4.b(j3);
                    if (ct4.a(jB3, 4294967296L)) {
                        fC2 = oo0Var2.a0(j3);
                    } else if (ct4.a(jB3, 8589934592L)) {
                        fC2 = bt4.c(j3) * textSize;
                    } else {
                        fC2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                }
            }
            arrayList = new ArrayList(list3.size());
            size = list3.size();
            while (i3 < size) {
                geVar4 = (ge) list3.get(i3);
                obj3 = geVar4.a;
                if (obj3 instanceof ij4) {
                    ij4Var3 = (ij4) obj3;
                    if (ij4Var3.f == null) {
                        arrayList.add(geVar4);
                    } else {
                        arrayList.add(geVar4);
                    }
                }
            }
            vk0Var = ij4Var6.f;
            if (vk0Var != null) {
                ij4Var = new ij4(0L, 0L, ij4Var6.c, ij4Var6.d, ij4Var6.e, vk0Var, (String) null, 0L, (hr) null, (bs4) null, (vd2) null, 0L, (sr4) null, (xb4) null, 65475);
            } else {
                ij4Var = new ij4(0L, 0L, ij4Var6.c, ij4Var6.d, ij4Var6.e, vk0Var, (String) null, 0L, (hr) null, (bs4) null, (vd2) null, 0L, (sr4) null, (xb4) null, 65475);
            }
            gc3Var = new gc3(i23, spannableString, lcVar);
            if (arrayList.size() <= 1) {
                size2 = arrayList.size();
                i4 = size2 * 2;
                iArr = new int[i4];
                size3 = arrayList.size();
                while (i5 < size3) {
                    ge geVar7 = (ge) arrayList.get(i5);
                    iArr[i5] = geVar7.b;
                    iArr[i5 + size2] = geVar7.c;
                }
                if (i4 > 1) {
                    Arrays.sort(iArr);
                }
                if (i4 != 0) {
                    kf2.m("Array is empty.");
                    throw null;
                }
                i6 = iArr[0];
                i7 = 0;
                while (i7 < i4) {
                    i8 = iArr[i7];
                    if (i8 == i6) {
                        arrayList2 = arrayList;
                        ij4Var2 = ij4Var;
                        i10 = i7;
                    } else {
                        size4 = arrayList.size();
                        ij4VarZ = ij4Var;
                        i9 = 0;
                        while (i9 < size4) {
                            ArrayList arrayList6 = arrayList;
                            ge geVar8 = (ge) arrayList.get(i9);
                            ij4 ij4Var9 = ij4Var;
                            i11 = geVar8.b;
                            int i37 = i7;
                            i12 = geVar8.c;
                            if (i11 == i12) {
                            }
                            i9++;
                            arrayList = arrayList6;
                            ij4Var = ij4Var9;
                            i7 = i37;
                        }
                        arrayList2 = arrayList;
                        ij4Var2 = ij4Var;
                        i10 = i7;
                        if (ij4VarZ != null) {
                            gc3Var.a(ij4VarZ, Integer.valueOf(i6), Integer.valueOf(i8));
                        }
                        i6 = i8;
                    }
                    i7 = i10 + 1;
                    arrayList = arrayList2;
                    ij4Var = ij4Var2;
                }
            } else if (!arrayList.isEmpty()) {
                gc3Var.a(uo.z(ij4Var, (ij4) ((ge) arrayList.get(0)).a), Integer.valueOf(((ge) arrayList.get(0)).b), Integer.valueOf(((ge) arrayList.get(0)).c));
            }
            size5 = list3.size();
            i13 = 0;
            z2 = false;
            while (i13 < size5) {
                geVar3 = (ge) list3.get(i13);
                obj2 = geVar3.a;
                if (obj2 instanceof ij4) {
                    i20 = geVar3.b;
                    int i38 = geVar3.c;
                    if (i20 >= 0) {
                        size5 = size5;
                        z2 = z2;
                        z2 = z2;
                    } else {
                        size5 = size5;
                        z2 = z2;
                        z2 = z2;
                    }
                } else {
                    size5 = size5;
                    z2 = z2;
                    z2 = z2;
                }
                i13++;
                size5 = size5;
            }
            if (z2) {
                size7 = list3.size();
                i16 = 0;
                while (i16 < size7) {
                    geVar2 = (ge) list3.get(i16);
                    feVar = (fe) geVar2.a;
                    if (feVar instanceof ij4) {
                        i19 = geVar2.b;
                        int i39 = geVar2.c;
                        if (i19 >= 0) {
                            i17 = size7;
                            i18 = i16;
                        } else {
                            i17 = size7;
                            i18 = i16;
                        }
                    } else {
                        i17 = size7;
                        i18 = i16;
                    }
                    i16 = i18 + 1;
                    size7 = i17;
                }
            }
            cs4Var2 = sd3Var2.d;
            if (cs4Var2 != null) {
                j = cs4Var2.a;
                jB = bt4.b(j);
                if (ct4.a(jB, 4294967296L)) {
                    oo0Var2.a0(j);
                } else if (ct4.a(jB, 8589934592L)) {
                    bt4.c(j);
                }
            }
            size6 = list3.size();
            while (i14 < size6) {
                Object obj9 = ((ge) list3.get(i14)).a;
            }
            if (list4.size() > 0) {
                geVar = (ge) list4.get(0);
                if (geVar.a == null) {
                    kf2.k();
                    throw null;
                }
                while (i15 < r1) {
                    spannableString.removeSpan((l05) obj8);
                }
                throw null;
            }
            mcVar = this;
            charSequence2 = spannableString;
        }
        mcVar = obj4;
        charSequence2 = charSequence;
        mcVar.u = charSequence2;
        mcVar.v = new t62(charSequence2, mcVar.t, mcVar.y);
    }

    @Override // defpackage.qd3
    public final boolean a() {
        z05 z05Var = this.w;
        if (z05Var != null ? z05Var.j() : false) {
            return true;
        }
        if (!this.x && fu.b(this.o)) {
            d34 d34Var = xz0.a;
            d34 d34Var2 = xz0.a;
            kl4 kl4VarD = (kl4) d34Var2.o;
            if (kl4VarD == null) {
                if (tz0.c()) {
                    kl4VarD = d34Var2.D();
                    d34Var2.o = kl4VarD;
                } else {
                    kl4VarD = fu.t;
                }
            }
            if (((Boolean) kl4VarD.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final float b() {
        t62 t62Var = this.v;
        float f = t62Var.e;
        TextPaint textPaint = t62Var.b;
        if (!Float.isNaN(f)) {
            return t62Var.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = t62Var.a;
        lineInstance.setText(new v10(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, g12.d);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new j02(i, next, 1));
            } else {
                j02 j02Var = (j02) priorityQueue.peek();
                if (j02Var != null && j02Var.o - j02Var.n < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new j02(i, next, 1));
                }
            }
            i = next;
        }
        float desiredWidth = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                tb4.k();
                return 0.0f;
            }
            j02 j02Var2 = (j02) it.next();
            desiredWidth = Layout.getDesiredWidth(t62Var.b(), j02Var2.n, j02Var2.o, textPaint);
            while (it.hasNext()) {
                j02 j02Var3 = (j02) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(t62Var.b(), j02Var3.n, j02Var3.o, textPaint));
            }
        }
        t62Var.e = desiredWidth;
        return desiredWidth;
    }

    @Override // defpackage.qd3
    public final float d() {
        return this.v.c();
    }
}
