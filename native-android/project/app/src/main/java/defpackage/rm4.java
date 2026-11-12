package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rm4 extends si0 {
    public static String b0(String str) {
        return fa4.d0(new tq4(new w40(2, str), new rs0(19, "    "), 1), "\n", null, 62);
    }

    public static String c0(String str) {
        Comparable comparable;
        String strSubstring;
        List listW0 = qm4.w0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listW0) {
            if (!qm4.u0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r40.k0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                if (!ya4.y(str2.charAt(length2))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList2.add(Integer.valueOf(length2));
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listW0.size();
        int size2 = listW0.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listW0) {
            int i3 = i + 1;
            if (i < 0) {
                gb.c0();
                throw null;
            }
            String str3 = (String) obj3;
            if ((i == 0 || i == size2) && qm4.u0(str3)) {
                strSubstring = null;
            } else {
                str3.getClass();
                if (iIntValue < 0) {
                    kf2.e(b11.j(iIntValue, "Requested character count ", " is less than zero."));
                    return null;
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
            }
            if (strSubstring != null) {
                arrayList3.add(strSubstring);
            }
            i = i3;
        }
        StringBuilder sb = new StringBuilder(length3);
        q40.z0(arrayList3, sb, "\n", "", "", "...", null);
        return sb.toString();
    }

    public static String d0(String str) {
        if (qm4.u0("|")) {
            kf2.n("marginPrefix must be non-blank string.");
            return null;
        }
        List listW0 = qm4.w0(str);
        int length = str.length();
        listW0.size();
        int size = listW0.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listW0) {
            int i2 = i + 1;
            if (i < 0) {
                gb.c0();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && qm4.u0(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!ya4.y(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = (i3 != -1 && xm4.j0(str2, i3, "|", false)) ? str2.substring("|".length() + i3) : null;
                if (strSubstring != null) {
                    str2 = strSubstring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        q40.z0(arrayList, sb, "\n", "", "", "...", null);
        return sb.toString();
    }
}
