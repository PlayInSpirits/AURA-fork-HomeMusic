package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uy4 {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final xy4 f;
    public final String[] g;
    public final String h;
    public final String i;
    public final uy4 j;
    public final HashMap k;
    public final HashMap l;
    public ArrayList m;

    public uy4(String str, String str2, long j, long j2, xy4 xy4Var, String[] strArr, String str3, String str4, uy4 uy4Var) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = xy4Var;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        str3.getClass();
        this.h = str3;
        this.j = uy4Var;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public static uy4 a(String str) {
        return new uy4(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            hg0 hg0Var = new hg0();
            hg0Var.a = new SpannableStringBuilder();
            hg0Var.b = null;
            treeMap.put(str, hg0Var);
        }
        CharSequence charSequence = ((hg0) treeMap.get(str)).a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final uy4 b(int i) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (uy4) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z) {
        String str = this.a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z || zEquals || (zEquals2 && this.i != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i = 0; i < this.m.size(); i++) {
            ((uy4) this.m.get(i)).d(treeSet, z || zEquals);
        }
    }

    public final boolean f(long j) {
        long j2 = this.d;
        long j3 = this.e;
        if (j2 == -9223372036854775807L && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 <= j && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= j3) {
            return j2 <= j && j < j3;
        }
        return true;
    }

    public final void g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j) && "div".equals(this.a) && (str2 = this.i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < c(); i++) {
            b(i).g(j, str, arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x020a  */
    /* JADX WARN: Code duplicated, block: B:146:0x0218  */
    /* JADX WARN: Code duplicated, block: B:148:0x021b  */
    /* JADX WARN: Code duplicated, block: B:150:0x021e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0224  */
    /* JADX WARN: Code duplicated, block: B:153:0x0237  */
    /* JADX WARN: Code duplicated, block: B:165:0x0269  */
    /* JADX WARN: Code duplicated, block: B:168:0x0281  */
    /* JADX WARN: Code duplicated, block: B:169:0x0290  */
    /* JADX WARN: Code duplicated, block: B:172:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:174:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:177:0x02be  */
    /* JADX WARN: Code duplicated, block: B:180:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:193:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00be  */
    public final void h(long j, Map map, HashMap map2, String str, TreeMap treeMap) {
        Iterator it;
        int i;
        uy4 uy4Var;
        int i2;
        xy4 xy4VarQ;
        int i3;
        float f;
        float f2;
        float f3;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        RelativeSizeSpan[] relativeSizeSpanArr;
        int length;
        float sizeChange;
        int i4;
        RelativeSizeSpan relativeSizeSpan;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Map map3 = map;
        if (f(j)) {
            String str2 = this.h;
            String str3 = "".equals(str2) ? str : str2;
            Iterator it2 = this.l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap map4 = this.k;
                int iIntValue = map4.containsKey(str4) ? ((Integer) map4.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    hg0 hg0Var = (hg0) treeMap.get(str4);
                    hg0Var.getClass();
                    wy4 wy4Var = (wy4) map2.get(str3);
                    wy4Var.getClass();
                    int i10 = wy4Var.j;
                    xy4 xy4VarQ2 = j51.Q(this.f, this.g, map3);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hg0Var.a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        hg0Var.a = spannableStringBuilder;
                        hg0Var.b = null;
                    }
                    if (xy4VarQ2 != null) {
                        int i11 = xy4VarQ2.h;
                        int i12 = 1;
                        if (((i11 == -1 && xy4VarQ2.i == -1) ? -1 : (i11 == 1 ? (char) 1 : (char) 0) | (xy4VarQ2.i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i13 = xy4VarQ2.h;
                            if (i13 != -1) {
                                if (i13 == i12) {
                                    i7 = i12;
                                } else {
                                    i7 = 0;
                                }
                                if (xy4VarQ2.i == i12) {
                                    i8 = 2;
                                } else {
                                    i8 = 0;
                                }
                                i9 = i7 | i8;
                            } else if (xy4VarQ2.i == -1) {
                                i9 = -1;
                                i12 = 1;
                            } else {
                                i12 = 1;
                                if (i13 == i12) {
                                    i7 = i12;
                                } else {
                                    i7 = 0;
                                }
                                if (xy4VarQ2.i == i12) {
                                    i8 = 2;
                                } else {
                                    i8 = 0;
                                }
                                i9 = i7 | i8;
                            }
                            StyleSpan styleSpan = new StyleSpan(i9);
                            i = 33;
                            spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                        } else {
                            i = 33;
                        }
                        if (xy4VarQ2.f == i12) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i);
                        }
                        if (xy4VarQ2.g == i12) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i);
                        }
                        if (xy4VarQ2.c) {
                            if (!xy4VarQ2.c) {
                                kf2.o("Font color has not been defined.");
                                return;
                            }
                            xl.d(spannableStringBuilder, new ForegroundColorSpan(xy4VarQ2.b), iIntValue, iIntValue2);
                        }
                        if (xy4VarQ2.e) {
                            if (!xy4VarQ2.e) {
                                kf2.o("Background color has not been defined.");
                                return;
                            }
                            xl.d(spannableStringBuilder, new BackgroundColorSpan(xy4VarQ2.d), iIntValue, iIntValue2);
                        }
                        if (xy4VarQ2.a != null) {
                            xl.d(spannableStringBuilder, new TypefaceSpan(xy4VarQ2.a), iIntValue, iIntValue2);
                        }
                        yr4 yr4Var = xy4VarQ2.r;
                        if (yr4Var != null) {
                            int i14 = yr4Var.a;
                            if (i14 == -1) {
                                i14 = (i10 == 2 || i10 == 1) ? 3 : 1;
                                i6 = 1;
                            } else {
                                i6 = yr4Var.b;
                            }
                            int i15 = yr4Var.c;
                            if (i15 == -2) {
                                i15 = 1;
                            }
                            xl.d(spannableStringBuilder, new zr4(i14, i6, i15), iIntValue, iIntValue2);
                        }
                        int i16 = xy4VarQ2.m;
                        if (i16 == 2) {
                            uy4 uy4Var2 = this.j;
                            while (true) {
                                if (uy4Var2 == null) {
                                    uy4Var2 = null;
                                    break;
                                }
                                xy4 xy4VarQ3 = j51.Q(uy4Var2.f, uy4Var2.g, map3);
                                if (xy4VarQ3 != null && xy4VarQ3.m == 1) {
                                    break;
                                } else {
                                    uy4Var2 = uy4Var2.j;
                                }
                            }
                            if (uy4Var2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(uy4Var2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        uy4Var = null;
                                        break;
                                    }
                                    uy4 uy4Var3 = (uy4) arrayDeque.pop();
                                    xy4 xy4VarQ4 = j51.Q(uy4Var3.f, uy4Var3.g, map3);
                                    if (xy4VarQ4 != null && xy4VarQ4.m == 3) {
                                        uy4Var = uy4Var3;
                                        break;
                                    }
                                    for (int iC = uy4Var3.c() - 1; iC >= 0; iC--) {
                                        arrayDeque.push(uy4Var3.b(iC));
                                    }
                                }
                                if (uy4Var != null) {
                                    if (uy4Var.c() == 1) {
                                        i2 = 0;
                                        if (uy4Var.b(0).b != null) {
                                            String str5 = uy4Var.b(0).b;
                                            String str6 = f35.a;
                                            xy4 xy4VarQ5 = j51.Q(uy4Var.f, uy4Var.g, map3);
                                            int i17 = xy4VarQ5 != null ? xy4VarQ5.n : -1;
                                            if (i17 == -1 && (xy4VarQ = j51.Q(uy4Var2.f, uy4Var2.g, map3)) != null) {
                                                i17 = xy4VarQ.n;
                                            }
                                            spannableStringBuilder.setSpan(new u34(i17, str5), iIntValue, iIntValue2, 33);
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                    l93.K("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                }
                            }
                            if (xy4VarQ2.q == 1) {
                                xl.d(spannableStringBuilder, new tp1(), iIntValue, iIntValue2);
                            }
                            i3 = xy4VarQ2.j;
                            f = 100.0f;
                            if (i3 != 1) {
                                it = it2;
                                f2 = 100.0f;
                                xl.d(spannableStringBuilder, new AbsoluteSizeSpan((int) xy4VarQ2.k, true), iIntValue, iIntValue2);
                            } else if (i3 != 2) {
                                it = it2;
                                f2 = 100.0f;
                                xl.d(spannableStringBuilder, new RelativeSizeSpan(xy4VarQ2.k), iIntValue, iIntValue2);
                            } else if (i3 != 3) {
                                it = it2;
                                f2 = 100.0f;
                            } else {
                                float f4 = xy4VarQ2.k / 100.0f;
                                relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                length = relativeSizeSpanArr.length;
                                int i18 = i2;
                                sizeChange = f4;
                                i4 = i18;
                                while (i4 < length) {
                                    float f5 = f;
                                    relativeSizeSpan = relativeSizeSpanArr[i4];
                                    Iterator it3 = it2;
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= iIntValue2) {
                                        sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                    }
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue || spannableStringBuilder.getSpanEnd(relativeSizeSpan) != iIntValue2) {
                                        i5 = i4;
                                    } else {
                                        i5 = i4;
                                        if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                            spannableStringBuilder.removeSpan(relativeSizeSpan);
                                        }
                                    }
                                    i4 = i5 + 1;
                                    f = f5;
                                    it2 = it3;
                                }
                                it = it2;
                                f2 = f;
                                spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                            }
                            if ("p".equals(this.a)) {
                                f3 = xy4VarQ2.s;
                                if (f3 != Float.MAX_VALUE) {
                                    hg0Var.q = (f3 * (-90.0f)) / f2;
                                }
                                alignment = xy4VarQ2.o;
                                if (alignment != null) {
                                    hg0Var.c = alignment;
                                }
                                alignment2 = xy4VarQ2.p;
                                if (alignment2 != null) {
                                    hg0Var.d = alignment2;
                                }
                            }
                        } else if (i16 == 3 || i16 == 4) {
                            spannableStringBuilder.setSpan(new ko0(), iIntValue, iIntValue2, 33);
                        }
                        i2 = 0;
                        if (xy4VarQ2.q == 1) {
                            xl.d(spannableStringBuilder, new tp1(), iIntValue, iIntValue2);
                        }
                        i3 = xy4VarQ2.j;
                        f = 100.0f;
                        if (i3 != 1) {
                            it = it2;
                            f2 = 100.0f;
                            xl.d(spannableStringBuilder, new AbsoluteSizeSpan((int) xy4VarQ2.k, true), iIntValue, iIntValue2);
                        } else if (i3 != 2) {
                            it = it2;
                            f2 = 100.0f;
                            xl.d(spannableStringBuilder, new RelativeSizeSpan(xy4VarQ2.k), iIntValue, iIntValue2);
                        } else if (i3 != 3) {
                            it = it2;
                            f2 = 100.0f;
                        } else {
                            float f6 = xy4VarQ2.k / 100.0f;
                            relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                            length = relativeSizeSpanArr.length;
                            int i19 = i2;
                            sizeChange = f6;
                            i4 = i19;
                            while (i4 < length) {
                                float f7 = f;
                                relativeSizeSpan = relativeSizeSpanArr[i4];
                                Iterator it4 = it2;
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue) {
                                    sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                }
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue) {
                                    i5 = i4;
                                } else {
                                    i5 = i4;
                                }
                                i4 = i5 + 1;
                                f = f7;
                                it2 = it4;
                            }
                            it = it2;
                            f2 = f;
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                        }
                        if ("p".equals(this.a)) {
                            f3 = xy4VarQ2.s;
                            if (f3 != Float.MAX_VALUE) {
                                hg0Var.q = (f3 * (-90.0f)) / f2;
                            }
                            alignment = xy4VarQ2.o;
                            if (alignment != null) {
                                hg0Var.c = alignment;
                            }
                            alignment2 = xy4VarQ2.p;
                            if (alignment2 != null) {
                                hg0Var.d = alignment2;
                            }
                        }
                    }
                    it2 = it;
                }
                it = it2;
                it2 = it;
            }
            int i20 = 0;
            while (i20 < c()) {
                b(i20).h(j, map3, map2, str3, treeMap);
                i20++;
                map3 = map;
            }
        }
    }

    public final void i(long j, boolean z, String str, TreeMap treeMap) {
        HashMap map = this.k;
        map.clear();
        HashMap map2 = this.l;
        map2.clear();
        String str2 = this.a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.c && z) {
            SpannableStringBuilder spannableStringBuilderE = e(str4, treeMap);
            String str5 = this.b;
            str5.getClass();
            spannableStringBuilderE.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((hg0) entry.getValue()).a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i = 0; i < c(); i++) {
                b(i).i(j, z || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderE2 = e(str4, treeMap);
                int length = spannableStringBuilderE2.length() - 1;
                while (length >= 0 && spannableStringBuilderE2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderE2.charAt(length) != '\n') {
                    spannableStringBuilderE2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((hg0) entry2.getValue()).a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
