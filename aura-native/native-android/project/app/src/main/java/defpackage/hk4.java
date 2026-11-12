package defpackage;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hk4 implements zn4 {
    public static final Pattern t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean n;
    public final qx0 o;
    public LinkedHashMap q;
    public float r = -3.4028235E38f;
    public float s = -3.4028235E38f;
    public final be3 p = new be3();

    public hk4(List list) {
        if (list == null || list.isEmpty()) {
            this.n = false;
            this.o = null;
            return;
        }
        this.n = true;
        byte[] bArr = (byte[]) list.get(0);
        Charset charset = StandardCharsets.UTF_8;
        String str = new String(bArr, charset);
        rr2.l(str.startsWith("Format:"));
        qx0 qx0VarA = qx0.a(str);
        qx0VarA.getClass();
        this.o = qx0VarA;
        d(new be3((byte[]) list.get(1)), charset);
    }

    public static int a(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    public static long e(String str) {
        Matcher matcher = t.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = f35.a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    @Override // defpackage.zn4
    public final void c(byte[] bArr, int i, int i2, yn4 yn4Var, wc0 wc0Var) {
        Charset charset;
        be3 be3Var;
        long j;
        int i3;
        int i4;
        float f;
        int i5;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i6;
        int i7;
        int i8;
        float f2;
        float f3;
        float f4;
        int i9;
        int i10;
        float f5;
        int i11;
        int i12;
        float f6;
        int i13;
        int iA;
        int i14;
        hk4 hk4Var = this;
        long j2 = yn4Var.b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        be3 be3Var2 = hk4Var.p;
        be3Var2.L(i + i2, bArr);
        be3Var2.N(i);
        Charset charsetJ = be3Var2.J();
        if (charsetJ == null) {
            charsetJ = StandardCharsets.UTF_8;
        }
        boolean z = hk4Var.n;
        if (!z) {
            hk4Var.d(be3Var2, charsetJ);
        }
        qx0 qx0VarA = z ? hk4Var.o : null;
        while (true) {
            String strN = be3Var2.n(charsetJ);
            if (strN == null) {
                long j3 = j2;
                ArrayList arrayList3 = (j3 == -9223372036854775807L || !yn4Var.a) ? null : new ArrayList();
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    List list = (List) arrayList.get(i15);
                    if (!list.isEmpty() || i15 == 0) {
                        if (i15 == arrayList.size() - 1) {
                            tb4.a();
                            return;
                        }
                        long jLongValue = ((Long) arrayList2.get(i15)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i15 + 1)).longValue();
                        lg0 lg0Var = new lg0(jLongValue, jLongValue2 - jLongValue, list);
                        if (j3 == -9223372036854775807L || jLongValue2 >= j3) {
                            wc0Var.accept(lg0Var);
                        } else if (arrayList3 != null) {
                            arrayList3.add(lg0Var);
                        }
                    }
                }
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj = arrayList3.get(i16);
                        i16++;
                        wc0Var.accept((lg0) obj);
                    }
                    return;
                }
                return;
            }
            if (strN.startsWith("Format:")) {
                qx0VarA = qx0.a(strN);
            } else {
                if (strN.startsWith("Dialogue:")) {
                    if (qx0VarA == null) {
                        l93.q0("SsaParser", "Skipping dialogue line before complete format: ".concat(strN));
                    } else {
                        int i17 = qx0VarA.f;
                        rr2.l(strN.startsWith("Dialogue:"));
                        String strSubstring = strN.substring(9);
                        int i18 = qx0VarA.a;
                        String[] strArrSplit = strSubstring.split(",", i17);
                        if (strArrSplit.length != i17) {
                            l93.q0("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strN));
                        } else {
                            if (i18 != -1) {
                                try {
                                    i3 = Integer.parseInt(strArrSplit[i18].trim());
                                } catch (RuntimeException unused) {
                                    l93.q0("SsaParser", "Fail to parse layer: " + strArrSplit[i18]);
                                    i3 = 0;
                                }
                            } else {
                                i3 = 0;
                            }
                            long jE = e(strArrSplit[qx0VarA.b]);
                            charset = charsetJ;
                            if (jE == -9223372036854775807L) {
                                l93.q0("SsaParser", "Skipping invalid timing: ".concat(strN));
                                j = j2;
                                be3Var = be3Var2;
                            } else {
                                j = j2;
                                long jE2 = e(strArrSplit[qx0VarA.c]);
                                if (jE2 == -9223372036854775807L || jE2 <= jE) {
                                    be3Var = be3Var2;
                                    l93.q0("SsaParser", "Skipping invalid timing: ".concat(strN));
                                } else {
                                    LinkedHashMap linkedHashMap = hk4Var.q;
                                    kk4 kk4Var = (linkedHashMap == null || (i14 = qx0VarA.d) == -1) ? null : (kk4) linkedHashMap.get(strArrSplit[i14].trim());
                                    String str = strArrSplit[qx0VarA.e];
                                    Matcher matcher = jk4.a.matcher(str);
                                    PointF pointF = null;
                                    int i19 = -1;
                                    while (matcher.find()) {
                                        be3 be3Var3 = be3Var2;
                                        String strGroup = matcher.group(1);
                                        strGroup.getClass();
                                        try {
                                            PointF pointFA = jk4.a(strGroup);
                                            if (pointFA != null) {
                                                pointF = pointFA;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        try {
                                            Matcher matcher2 = jk4.d.matcher(strGroup);
                                            if (matcher2.find()) {
                                                String strGroup2 = matcher2.group(1);
                                                strGroup2.getClass();
                                                iA = kk4.a(strGroup2);
                                            } else {
                                                iA = -1;
                                            }
                                            if (iA != -1) {
                                                i19 = iA;
                                            }
                                        } catch (RuntimeException unused3) {
                                        }
                                        be3Var2 = be3Var3;
                                    }
                                    be3Var = be3Var2;
                                    String strReplace = jk4.a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f7 = hk4Var.r;
                                    float f8 = hk4Var.s;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    if (kk4Var != null) {
                                        boolean z2 = kk4Var.g;
                                        Integer num = kk4Var.d;
                                        Integer num2 = kk4Var.c;
                                        if (num2 != null) {
                                            i9 = 33;
                                            i10 = 0;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            i9 = 33;
                                            i10 = 0;
                                        }
                                        if (kk4Var.j == 3 && num != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i10, spannableString.length(), i9);
                                        }
                                        float f9 = kk4Var.e;
                                        if (f9 == -3.4028235E38f || f8 == -3.4028235E38f) {
                                            f5 = -3.4028235E38f;
                                            i11 = Integer.MIN_VALUE;
                                        } else {
                                            f5 = f9 / f8;
                                            i11 = 1;
                                        }
                                        boolean z3 = kk4Var.f;
                                        if (z3 && z2) {
                                            i12 = i11;
                                            f6 = f5;
                                            i13 = 33;
                                            i4 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i12 = i11;
                                            f6 = f5;
                                            i13 = 33;
                                            i4 = 0;
                                            if (z3) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z2 != 0) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (kk4Var.h) {
                                            spannableString.setSpan(new UnderlineSpan(), i4, spannableString.length(), i13);
                                        }
                                        if (kk4Var.i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i4, spannableString.length(), i13);
                                        }
                                        i5 = i12;
                                        f = f6;
                                    } else {
                                        f7 = f7;
                                        f8 = f8;
                                        i4 = 0;
                                        f = -3.4028235E38f;
                                        i5 = Integer.MIN_VALUE;
                                    }
                                    if (i19 == -1) {
                                        i19 = kk4Var != null ? kk4Var.b : -1;
                                    }
                                    switch (i19) {
                                        case 0:
                                        default:
                                            xa3.m(i19, "Unknown alignment: ", "SsaParser");
                                        case -1:
                                            alignment2 = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            alignment2 = alignment;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            alignment2 = alignment;
                                            break;
                                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            alignment2 = alignment;
                                            break;
                                    }
                                    int i20 = Integer.MIN_VALUE;
                                    switch (i19) {
                                        case 0:
                                        default:
                                            xa3.m(i19, "Unknown alignment: ", "SsaParser");
                                        case -1:
                                            i6 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i6 = i4;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i6 = 1;
                                            break;
                                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                        case 6:
                                        case 9:
                                            i6 = 2;
                                            break;
                                    }
                                    switch (i19) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            xa3.m(i19, "Unknown alignment: ", "SsaParser");
                                            break;
                                        case 1:
                                        case 2:
                                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                            i20 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i20 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i20 = i4;
                                            break;
                                    }
                                    if (pointF == null || f8 == -3.4028235E38f || f7 == -3.4028235E38f) {
                                        float f10 = 0.95f;
                                        if (i6 != 0) {
                                            i7 = 1;
                                            if (i6 != 1) {
                                                i8 = 2;
                                                f2 = i6 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i8 = 2;
                                                f2 = 0.5f;
                                            }
                                        } else {
                                            i7 = 1;
                                            i8 = 2;
                                            f2 = 0.05f;
                                        }
                                        if (i20 == 0) {
                                            f10 = 0.05f;
                                        } else if (i20 == i7) {
                                            f10 = 0.5f;
                                        } else if (i20 != i8) {
                                            f10 = -3.4028235E38f;
                                        }
                                        f3 = f10;
                                        f4 = f2;
                                    } else {
                                        f4 = pointF.x / f7;
                                        f3 = pointF.y / f8;
                                    }
                                    ig0 ig0Var = new ig0(spannableString, alignment2, null, null, f3, i4, i20, f4, i6, i5, f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, i3);
                                    int iA2 = a(jE2, arrayList2, arrayList);
                                    for (int iA3 = a(jE, arrayList2, arrayList); iA3 < iA2; iA3++) {
                                        ((List) arrayList.get(iA3)).add(ig0Var);
                                    }
                                }
                            }
                        }
                    }
                    charset = charsetJ;
                    j = j2;
                    be3Var = be3Var2;
                } else {
                    charset = charsetJ;
                    j = j2;
                    be3Var = be3Var2;
                }
                hk4Var = this;
                charsetJ = charset;
                j2 = j;
                qx0VarA = qx0VarA;
                be3Var2 = be3Var;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:170:0x02e8  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void d(be3 be3Var, Charset charset) {
        int i;
        kk4 kk4Var;
        while (true) {
            String strN = be3Var.n(charset);
            if (strN == null) {
                return;
            }
            int i2 = 0;
            int i3 = 91;
            if ("[Script Info]".equalsIgnoreCase(strN)) {
                while (true) {
                    String strN2 = be3Var.n(charset);
                    if (strN2 == null) {
                        break;
                    }
                    if (be3Var.a() != 0) {
                        int iH = be3Var.h(charset);
                        if ((iH != 0 ? jz4.m(iH >>> 8) : 1114112) == 91) {
                            break;
                        }
                    }
                    String[] strArrSplit = strN2.split(":");
                    if (strArrSplit.length == 2) {
                        String strU = rr2.U(strArrSplit[0].trim());
                        strU.getClass();
                        if (strU.equals("playresx")) {
                            this.r = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strU.equals("playresy")) {
                            try {
                                this.s = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strN)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ik4 ik4Var = null;
                while (true) {
                    String strN3 = be3Var.n(charset);
                    if (strN3 != null) {
                        if (be3Var.a() != 0) {
                            int iH2 = be3Var.h(charset);
                            if ((iH2 != 0 ? jz4.m(iH2 >>> 8) : 1114112) == i3) {
                            }
                        }
                        int i4 = -1;
                        if (strN3.startsWith("Format:")) {
                            String[] strArrSplit2 = TextUtils.split(strN3.substring(7), ",");
                            int i5 = -1;
                            int i6 = -1;
                            int i7 = -1;
                            int i8 = -1;
                            int i9 = -1;
                            int i10 = -1;
                            int i11 = -1;
                            int i12 = -1;
                            int i13 = -1;
                            int i14 = -1;
                            for (int i15 = i2; i15 < strArrSplit2.length; i15++) {
                                String strU2 = rr2.U(strArrSplit2[i15].trim());
                                strU2.getClass();
                                switch (strU2.hashCode()) {
                                    case -1178781136:
                                        i = strU2.equals("italic") ? i2 : -1;
                                        break;
                                    case -1026963764:
                                        i = strU2.equals("underline") ? 1 : -1;
                                        break;
                                    case -192095652:
                                        i = strU2.equals("strikeout") ? 2 : -1;
                                        break;
                                    case -70925746:
                                        i = strU2.equals("primarycolour") ? 3 : -1;
                                        break;
                                    case 3029637:
                                        i = strU2.equals("bold") ? 4 : -1;
                                        break;
                                    case 3373707:
                                        i = strU2.equals("name") ? 5 : -1;
                                        break;
                                    case 366554320:
                                        i = strU2.equals("fontsize") ? 6 : -1;
                                        break;
                                    case 767321349:
                                        i = strU2.equals("borderstyle") ? 7 : -1;
                                        break;
                                    case 1767875043:
                                        i = strU2.equals("alignment") ? 8 : -1;
                                        break;
                                    case 1988365454:
                                        i = strU2.equals("outlinecolour") ? 9 : -1;
                                        break;
                                    default:
                                        i = -1;
                                        break;
                                }
                                switch (i) {
                                    case 0:
                                        i11 = i15;
                                        break;
                                    case 1:
                                        i12 = i15;
                                        break;
                                    case 2:
                                        i13 = i15;
                                        break;
                                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                        i7 = i15;
                                        break;
                                    case 4:
                                        i10 = i15;
                                        break;
                                    case 5:
                                        i5 = i15;
                                        break;
                                    case 6:
                                        i9 = i15;
                                        break;
                                    case 7:
                                        i14 = i15;
                                        break;
                                    case 8:
                                        i6 = i15;
                                        break;
                                    case 9:
                                        i8 = i15;
                                        break;
                                }
                            }
                            ik4Var = i5 != -1 ? new ik4(i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, strArrSplit2.length) : null;
                        } else {
                            if (strN3.startsWith("Style:")) {
                                if (ik4Var == null) {
                                    l93.q0("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strN3));
                                } else {
                                    rr2.l(strN3.startsWith("Style:"));
                                    String[] strArrSplit3 = TextUtils.split(strN3.substring(6), ",");
                                    int length = strArrSplit3.length;
                                    int i16 = ik4Var.k;
                                    if (length != i16) {
                                        int length2 = strArrSplit3.length;
                                        String str = f35.a;
                                        Locale locale = Locale.US;
                                        StringBuilder sbT = b11.t("Skipping malformed 'Style:' line (expected ", " values, found ", i16, length2, "): '");
                                        sbT.append(strN3);
                                        sbT.append("'");
                                        l93.q0("SsaStyle", sbT.toString());
                                    } else {
                                        try {
                                            String strTrim = strArrSplit3[ik4Var.a].trim();
                                            int i17 = ik4Var.b;
                                            int iA = i17 != -1 ? kk4.a(strArrSplit3[i17].trim()) : -1;
                                            int i18 = ik4Var.c;
                                            Integer numC = i18 != -1 ? kk4.c(strArrSplit3[i18].trim()) : null;
                                            int i19 = ik4Var.d;
                                            Integer numC2 = i19 != -1 ? kk4.c(strArrSplit3[i19].trim()) : null;
                                            int i20 = ik4Var.e;
                                            float f = -3.4028235E38f;
                                            if (i20 != -1) {
                                                String strTrim2 = strArrSplit3[i20].trim();
                                                try {
                                                    f = Float.parseFloat(strTrim2);
                                                } catch (NumberFormatException e) {
                                                    l93.r0("SsaStyle", "Failed to parse font size: '" + strTrim2 + "'", e);
                                                }
                                            }
                                            float f2 = f;
                                            int i21 = ik4Var.f;
                                            boolean z = i21 != -1 && kk4.b(strArrSplit3[i21].trim());
                                            int i22 = ik4Var.g;
                                            boolean z2 = i22 != -1 && kk4.b(strArrSplit3[i22].trim());
                                            int i23 = ik4Var.h;
                                            boolean z3 = i23 != -1 && kk4.b(strArrSplit3[i23].trim());
                                            int i24 = ik4Var.i;
                                            boolean z4 = i24 != -1 && kk4.b(strArrSplit3[i24].trim());
                                            int i25 = ik4Var.j;
                                            if (i25 != -1) {
                                                String strTrim3 = strArrSplit3[i25].trim();
                                                try {
                                                    int i26 = Integer.parseInt(strTrim3.trim());
                                                    if (i26 == 1 || i26 == 3) {
                                                        i4 = i26;
                                                    } else {
                                                        l93.q0("SsaStyle", "Ignoring unknown BorderStyle: " + strTrim3);
                                                    }
                                                } catch (NumberFormatException unused2) {
                                                }
                                            }
                                            kk4Var = new kk4(strTrim, iA, numC, numC2, f2, z, z2, z3, z4, i4);
                                        } catch (RuntimeException e2) {
                                            l93.r0("SsaStyle", "Skipping malformed 'Style:' line: '" + strN3 + "'", e2);
                                            kk4Var = null;
                                        }
                                        if (kk4Var != null) {
                                            linkedHashMap.put(kk4Var.a, kk4Var);
                                        }
                                    }
                                    kk4Var = null;
                                    if (kk4Var != null) {
                                        linkedHashMap.put(kk4Var.a, kk4Var);
                                    }
                                }
                            }
                            i2 = 0;
                            i3 = 91;
                        }
                    }
                }
                this.q = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strN)) {
                l93.K("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strN)) {
                return;
            }
        }
    }
}
