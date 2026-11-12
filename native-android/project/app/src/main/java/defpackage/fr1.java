package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fr1 {
    public String a;
    public String d;
    public ArrayList g;
    public String h;
    public String b = "";
    public String c = "";
    public int e = -1;
    public final ArrayList f = gb.Q("");

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iR0 = qm4.r0(str, '&', i, 4);
            if (iR0 == -1) {
                iR0 = str.length();
            }
            int iR1 = qm4.r0(str, '=', i, 4);
            if (iR1 == -1 || iR1 > iR0) {
                arrayList.add(str.substring(i, iR0));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iR1));
                arrayList.add(str.substring(iR1 + 1, iR0));
            }
            i = iR0 + 1;
        }
        return arrayList;
    }

    public final void a(String str, String str2) {
        str.getClass();
        if (this.g == null) {
            this.g = new ArrayList();
        }
        ArrayList arrayList = this.g;
        arrayList.getClass();
        arrayList.add(fu.g(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91));
        ArrayList arrayList2 = this.g;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? fu.g(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91) : null);
    }

    public final gr1 b() {
        ArrayList arrayList;
        String str = this.a;
        if (str == null) {
            kf2.o("scheme == null");
            return null;
        }
        String strJ = fu.J(this.b, 0, 0, 7);
        String strJ2 = fu.J(this.c, 0, 0, 7);
        String str2 = this.d;
        if (str2 == null) {
            kf2.o("host == null");
            return null;
        }
        int iC = c();
        ArrayList arrayList2 = this.f;
        ArrayList arrayList3 = new ArrayList(r40.k0(arrayList2, 10));
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList3.add(fu.J((String) obj, 0, 0, 7));
        }
        ArrayList arrayList4 = this.g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(r40.k0(arrayList4, 10));
            int size2 = arrayList4.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                String str3 = (String) obj2;
                arrayList.add(str3 != null ? fu.J(str3, 0, 0, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.h;
        return new gr1(str, strJ, strJ2, str2, iC, arrayList3, arrayList, str4 != null ? fu.J(str4, 0, 0, 7) : null, toString());
    }

    public final int c() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        String str = this.a;
        str.getClass();
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public final void d(String str) {
        str.getClass();
        String strB = ue5.b(fu.J(str, 0, 0, 7));
        if (strB != null) {
            this.d = strB;
        } else {
            kf2.n("unexpected host: ".concat(str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0028  */
    public final void e(gr1 gr1Var, String str) {
        int i;
        int i2;
        int iE;
        int i3;
        char cCharAt;
        str.getClass();
        byte[] bArr = xe5.a;
        int i4 = xe5.i(str, 0, str.length());
        int iJ = xe5.j(str, i4, str.length());
        byte b = -1;
        if (iJ - i4 >= 2) {
            char cCharAt2 = str.charAt(i4);
            if ((h12.j(cCharAt2, 97) >= 0 && h12.j(cCharAt2, 122) <= 0) || (h12.j(cCharAt2, 65) >= 0 && h12.j(cCharAt2, 90) <= 0)) {
                i = i4 + 1;
                while (true) {
                    if (i < iJ) {
                        char cCharAt3 = str.charAt(i);
                        if (('a' > cCharAt3 || cCharAt3 >= '{') && (('A' > cCharAt3 || cCharAt3 >= '[') && !(('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                            if (cCharAt3 == ':') {
                                break;
                            } else {
                                break;
                            }
                        }
                        i++;
                    }
                    i = -1;
                    break;
                }
            } else {
                i = -1;
                break;
            }
        } else {
            i = -1;
            break;
        }
        int i5 = 1;
        if (i != -1) {
            if (xm4.j0(str, i4, "https:", true)) {
                this.a = "https";
                i4 += 6;
            } else {
                if (!xm4.j0(str, i4, "http:", true)) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, i) + '\'');
                }
                this.a = "http";
                i4 += 5;
            }
        } else {
            if (gr1Var == null) {
                kf2.n("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str.length() > 6 ? qm4.J0(6, str).concat("...") : str));
                return;
            }
            this.a = gr1Var.a;
        }
        int i6 = i4;
        int i7 = 0;
        while (true) {
            i2 = i5;
            if (i6 >= iJ || !((cCharAt = str.charAt(i6)) == '\\' || cCharAt == '/')) {
                break;
            }
            i7++;
            i6++;
            i5 = i2;
        }
        ArrayList arrayList = this.f;
        byte b2 = 35;
        if (i7 >= 2 || gr1Var == null || !h12.c(gr1Var.a, this.a)) {
            int i8 = i4 + i7;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                iE = xe5.e(i8, iJ, str, "@/\\?#");
                byte bCharAt = iE != iJ ? str.charAt(iE) : b;
                if (bCharAt == b || bCharAt == b2 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (i9 == 0) {
                        int iF = xe5.f(str, ':', i8, iE);
                        String strG = fu.g(str, i8, iF, " \"':;<=>@[]^`{}|/\\?#", 112);
                        if (i10 != 0) {
                            strG = this.b + "%40" + strG;
                        }
                        this.b = strG;
                        if (iF != iE) {
                            this.c = fu.g(str, iF + 1, iE, " \"':;<=>@[]^`{}|/\\?#", 112);
                            i9 = i2;
                        }
                        i10 = i2;
                    } else {
                        this.c += "%40" + fu.g(str, i8, iE, " \"':;<=>@[]^`{}|/\\?#", 112);
                    }
                    i8 = iE + 1;
                    b = -1;
                    b2 = 35;
                }
            }
            int i11 = i8;
            while (true) {
                if (i11 >= iE) {
                    i11 = iE;
                    break;
                }
                char cCharAt4 = str.charAt(i11);
                if (cCharAt4 == '[') {
                    do {
                        i11++;
                        if (i11 >= iE) {
                            break;
                        }
                    } while (str.charAt(i11) != ']');
                } else if (cCharAt4 == ':') {
                    break;
                }
                i11++;
            }
            int i12 = i11 + 1;
            if (i12 < iE) {
                this.d = ue5.b(fu.J(str, i8, i11, 4));
                try {
                    i3 = Integer.parseInt(fu.g(str, i12, iE, "", 120));
                    if (i2 > i3 || i3 >= 65536) {
                        i3 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.e = i3;
                if (i3 == -1) {
                    er1.k(str.substring(i12, iE), "Invalid URL port: \"");
                    return;
                }
            } else {
                int i13 = -1;
                this.d = ue5.b(fu.J(str, i8, i11, 4));
                String str2 = this.a;
                str2.getClass();
                if (str2.equals("http")) {
                    i13 = 80;
                } else if (str2.equals("https")) {
                    i13 = 443;
                }
                this.e = i13;
            }
            if (this.d == null) {
                er1.k(str.substring(i8, i11), "Invalid URL host: \"");
                return;
            }
            i4 = iE;
        } else {
            this.b = gr1Var.e();
            this.c = gr1Var.a();
            this.d = gr1Var.d;
            this.e = gr1Var.e;
            arrayList.clear();
            arrayList.addAll(gr1Var.c());
            if (i4 == iJ || str.charAt(i4) == '#') {
                String strD = gr1Var.d();
                this.g = strD != null ? f(fu.g(strD, 0, 0, " \"'<>#", 83)) : null;
            }
        }
        int iE2 = xe5.e(i4, iJ, str, "?#");
        if (i4 != iE2) {
            char cCharAt5 = str.charAt(i4);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList.clear();
                arrayList.add("");
                i4++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (i4 < iE2) {
                int iE3 = xe5.e(i4, iE2, str, "/\\");
                boolean z = iE3 < iE2;
                String strG2 = fu.g(str, i4, iE3, " \"<>^`{}|/\\?#", 112);
                if (!strG2.equals(".") && !strG2.equalsIgnoreCase("%2e")) {
                    if (!strG2.equals("..") && !strG2.equalsIgnoreCase("%2e.") && !strG2.equalsIgnoreCase(".%2e") && !strG2.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, strG2);
                        } else {
                            arrayList.add(strG2);
                        }
                        if (z) {
                            arrayList.add("");
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                i4 = z ? iE3 + 1 : iE3;
            }
        }
        if (iE2 < iJ && str.charAt(iE2) == '?') {
            int iF2 = xe5.f(str, '#', iE2, iJ);
            this.g = f(fu.g(str, iE2 + 1, iF2, " \"'<>#", 80));
            iE2 = iF2;
        }
        if (iE2 >= iJ || str.charAt(iE2) != '#') {
            return;
        }
        this.h = fu.g(str, iE2 + 1, iJ, "", 48);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.b.length() > 0 || this.c.length() > 0) {
            sb.append(this.b);
            if (this.c.length() > 0) {
                sb.append(':');
                sb.append(this.c);
            }
            sb.append('@');
        }
        String str2 = this.d;
        if (str2 != null) {
            if (qm4.n0(str2, ':')) {
                sb.append('[');
                sb.append(this.d);
                sb.append(']');
            } else {
                sb.append(this.d);
            }
        }
        int i = -1;
        if (this.e != -1 || this.a != null) {
            int iC = c();
            String str3 = this.a;
            if (str3 == null) {
                sb.append(':');
                sb.append(iC);
            } else {
                if (str3.equals("http")) {
                    i = 80;
                } else if (str3.equals("https")) {
                    i = 443;
                }
                if (iC != i) {
                    sb.append(':');
                    sb.append(iC);
                }
            }
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append((String) arrayList.get(i2));
        }
        if (this.g != null) {
            sb.append('?');
            ArrayList arrayList2 = this.g;
            arrayList2.getClass();
            y41.h(arrayList2, sb);
        }
        if (this.h != null) {
            sb.append('#');
            sb.append(this.h);
        }
        return sb.toString();
    }
}
