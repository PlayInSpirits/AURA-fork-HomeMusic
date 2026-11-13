package defpackage;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class qn1 {
    public static final ux3 a = new ux3("\\p{Mn}+");
    public static final ux3 b = new ux3("[^\\p{L}\\p{N}]+");
    public static final Map c = lg2.X(new kd3((char) 1072, "a"), new kd3((char) 1073, "b"), new kd3((char) 1074, "v"), new kd3((char) 1075, "g"), new kd3((char) 1076, "d"), new kd3((char) 1077, "e"), new kd3((char) 1078, "zh"), new kd3((char) 1079, "z"), new kd3((char) 1080, "i"), new kd3((char) 1081, "i"), new kd3((char) 1082, "k"), new kd3((char) 1083, "l"), new kd3((char) 1084, "m"), new kd3((char) 1085, "n"), new kd3((char) 1086, "o"), new kd3((char) 1087, "p"), new kd3((char) 1088, "r"), new kd3((char) 1089, "s"), new kd3((char) 1090, "t"), new kd3((char) 1091, "u"), new kd3((char) 1092, "f"), new kd3((char) 1093, "h"), new kd3((char) 1094, "c"), new kd3((char) 1095, "ch"), new kd3((char) 1096, "sh"), new kd3((char) 1097, "sh"), new kd3((char) 1098, ""), new kd3((char) 1099, "y"), new kd3((char) 1100, ""), new kd3((char) 1101, "e"), new kd3((char) 1102, "yu"), new kd3((char) 1103, "ya"));

    public static boolean a(String str, String str2) {
        str2.getClass();
        List D0 = qm4.D0(b(str2), new char[]{' '});
        ArrayList arrayList = new ArrayList();
        for (Object obj : D0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            String b2 = b(str);
            String c2 = c(b2);
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (!qm4.o0(b2, (String) obj2)) {
                        ArrayList arrayList2 = new ArrayList(r40.k0(arrayList, 10));
                        int size2 = arrayList.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            Object obj3 = arrayList.get(i2);
                            i2++;
                            arrayList2.add(c((String) obj3));
                        }
                        if (!arrayList2.isEmpty()) {
                            int size3 = arrayList2.size();
                            int i3 = 0;
                            while (i3 < size3) {
                                Object obj4 = arrayList2.get(i3);
                                i3++;
                                if (!qm4.o0(c2, (String) obj4)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static String b(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String replace = lowerCase.replace((char) 1105, (char) 1077);
        replace.getClass();
        String replace2 = replace.replace((char) 1081, (char) 1);
        replace2.getClass();
        String normalize = Normalizer.normalize(replace2, Normalizer.Form.NFD);
        normalize.getClass();
        String replaceAll = a.n.matcher(normalize).replaceAll("");
        replaceAll.getClass();
        String replace3 = replaceAll.replace((char) 1, (char) 1081);
        replace3.getClass();
        String replaceAll2 = b.n.matcher(replace3).replaceAll(" ");
        replaceAll2.getClass();
        return qm4.K0(replaceAll2).toString();
    }

    public static String c(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            Object obj = (String) c.get(Character.valueOf(charAt));
            if (obj == null) {
                obj = Character.valueOf(charAt);
            }
            sb.append(obj);
        }
        return sb.toString();
    }
}
