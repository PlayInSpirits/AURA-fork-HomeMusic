package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class qm4 extends xm4 {
    public static final void A0(int i) {
        if (i >= 0) {
            return;
        }
        kf2.e(f34.f(i, "Limit must be non-negative, but was "));
    }

    public static final List B0(String str, CharSequence charSequence, int i) {
        A0(i);
        int iQ0 = q0(charSequence, str, 0, false);
        if (iQ0 == -1 || i == 1) {
            return gb.O(charSequence.toString());
        }
        boolean z = i > 0;
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iQ0).toString());
            length = str.length() + iQ0;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            iQ0 = q0(charSequence, str, length, false);
        } while (iQ0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List C0(CharSequence charSequence, String[] strArr, int i) {
        int i2 = (i & 4) != 0 ? 0 : 2;
        charSequence.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return B0(str, charSequence, i2);
            }
        }
        A0(i2);
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        ha4 ha4Var = new ha4(new mo0(charSequence, i2, new z(15, listAsList)));
        ArrayList arrayList = new ArrayList(r40.k0(ha4Var, 10));
        Iterator it = ha4Var.iterator();
        while (true) {
            lo0 lo0Var = (lo0) it;
            if (!lo0Var.hasNext()) {
                return arrayList;
            }
            j02 j02Var = (j02) lo0Var.next();
            j02Var.getClass();
            arrayList.add(charSequence.subSequence(j02Var.n, j02Var.o + 1).toString());
        }
    }

    public static List D0(String str, char[] cArr) {
        str.getClass();
        if (cArr.length == 1) {
            return B0(String.valueOf(cArr[0]), str, 0);
        }
        A0(0);
        ha4 ha4Var = new ha4(new mo0(str, 0, new z(14, cArr)));
        ArrayList arrayList = new ArrayList(r40.k0(ha4Var, 10));
        Iterator it = ha4Var.iterator();
        while (true) {
            lo0 lo0Var = (lo0) it;
            if (!lo0Var.hasNext()) {
                return arrayList;
            }
            j02 j02Var = (j02) lo0Var.next();
            j02Var.getClass();
            arrayList.add(str.subSequence(j02Var.n, j02Var.o + 1).toString());
        }
    }

    public static String E0(String str, char c) {
        int iR0 = r0(str, c, 0, 6);
        return iR0 == -1 ? str : str.substring(iR0 + 1, str.length());
    }

    public static String F0(String str, String str2) {
        str.getClass();
        str.getClass();
        int iS0 = s0(str, str2, 0, 6);
        return iS0 == -1 ? str : str.substring(str2.length() + iS0, str.length());
    }

    public static String G0(String str, char c, String str2) {
        str.getClass();
        str2.getClass();
        int iV0 = v0(str, c, 0, 6);
        return iV0 == -1 ? str2 : str.substring(iV0 + 1, str.length());
    }

    public static String H0(String str, char c) {
        str.getClass();
        str.getClass();
        int iR0 = r0(str, c, 0, 6);
        return iR0 == -1 ? str : str.substring(0, iR0);
    }

    public static CharSequence I0(int i, String str) {
        str.getClass();
        if (i < 0) {
            kf2.e(b11.j(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.subSequence(0, i);
    }

    public static String J0(int i, String str) {
        str.getClass();
        if (i < 0) {
            kf2.e(b11.j(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static CharSequence K0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zY = ya4.y(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zY) {
                    break;
                }
                length--;
            } else if (zY) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String L0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i = length - 1;
            char cCharAt = str.charAt(length);
            int length2 = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    i2 = -1;
                    break;
                }
                if (cCharAt == cArr[i2]) {
                    break;
                }
                i2++;
            }
            if (i2 < 0) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i;
        }
        return charSequenceSubSequence.toString();
    }

    public static boolean n0(CharSequence charSequence, char c) {
        charSequence.getClass();
        return r0(charSequence, c, 0, 2) >= 0;
    }

    public static boolean o0(CharSequence charSequence, String str) {
        charSequence.getClass();
        str.getClass();
        return s0(charSequence, str, 0, 2) >= 0;
    }

    public static boolean p0(CharSequence charSequence, String str) {
        return charSequence instanceof String ? xm4.e0((String) charSequence, str, false) : y0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static final int q0(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        j02 j02Var = new j02(i, length, 1);
        boolean z2 = charSequence instanceof String;
        int i2 = j02Var.p;
        int i3 = j02Var.o;
        int i4 = j02Var.n;
        if (!z2 || !(str instanceof String)) {
            boolean z3 = z;
            if ((i2 > 0 && i4 <= i3) || (i2 < 0 && i3 <= i4)) {
                while (true) {
                    CharSequence charSequence2 = charSequence;
                    boolean z4 = z3;
                    int i5 = i4;
                    if (y0(str, 0, charSequence2, i5, str.length(), z4)) {
                        return i5;
                    }
                    if (i5 != i3) {
                        i4 = i5 + i2;
                        charSequence = charSequence2;
                        z3 = z4;
                    }
                }
            }
        } else if ((i2 > 0 && i4 <= i3) || (i2 < 0 && i3 <= i4)) {
            int i6 = i4;
            while (true) {
                String str2 = str;
                boolean z5 = z;
                if (xm4.g0(0, i6, str.length(), str2, (String) charSequence, z5)) {
                    return i6;
                }
                if (i6 != i3) {
                    i6 += i2;
                    str = str2;
                    z = z5;
                }
            }
        }
        return -1;
    }

    public static int r0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? t0(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int s0(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return q0(charSequence, str, i, false);
    }

    public static final int t0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ti.o0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (ya4.o(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    public static boolean u0(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!ya4.y(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int v0(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            str.getClass();
            i = str.length() - 1;
        }
        str.getClass();
        return str.lastIndexOf(c, i);
    }

    public static List w0(String str) {
        fb2 fb2Var = new fb2(str);
        if (!fb2Var.hasNext()) {
            return u01.n;
        }
        Object next = fb2Var.next();
        if (!fb2Var.hasNext()) {
            return gb.O(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (fb2Var.hasNext()) {
            arrayList.add(fb2Var.next());
        }
        return arrayList;
    }

    public static String x0(int i, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            kf2.n(b11.j(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean y0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!ya4.o(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String z0(String str, String str2) {
        str.getClass();
        return xm4.k0(str, str2, false) ? str.substring(str2.length()) : str;
    }
}
