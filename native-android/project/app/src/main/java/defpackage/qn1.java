package defpackage;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qn1 {
    public static final ux3 a = null;
    public static final ux3 b = null;
    public static final Map c = null;

    static {
        a = new ux3("\\p{Mn}+");
        b = new ux3("[^\\p{L}\\p{N}]+");
        c = lg2.X(new kd3[]{new kd3((char) 1072, "a"), new kd3((char) 1073, "b"), new kd3((char) 1074, "v"), new kd3((char) 1075, "g"), new kd3((char) 1076, "d"), new kd3((char) 1077, "e"), new kd3((char) 1078, "zh"), new kd3((char) 1079, "z"), new kd3((char) 1080, "i"), new kd3((char) 1081, "i"), new kd3((char) 1082, "k"), new kd3((char) 1083, "l"), new kd3((char) 1084, "m"), new kd3((char) 1085, "n"), new kd3((char) 1086, "o"), new kd3((char) 1087, "p"), new kd3((char) 1088, "r"), new kd3((char) 1089, "s"), new kd3((char) 1090, "t"), new kd3((char) 1091, "u"), new kd3((char) 1092, "f"), new kd3((char) 1093, "h"), new kd3((char) 1094, "c"), new kd3((char) 1095, "ch"), new kd3((char) 1096, "sh"), new kd3((char) 1097, "sh"), new kd3((char) 1098, ""), new kd3((char) 1099, "y"), new kd3((char) 1100, ""), new kd3((char) 1101, "e"), new kd3((char) 1102, "yu"), new kd3((char) 1103, "ya")});
    }

    public static boolean a(String r6, String r7) {
        r7.getClass();
        List r8 = qm4.D0(b(r7), new char[]{' '});
        ArrayList r1 = new ArrayList();
        Iterator r9 = r8.iterator();
    L4:
        if (r9.hasNext() == false) goto L9;
        Object r2 = r9.next();
        if (((String) r2).length() <= 0) goto L4;
        r1.add(r2);
        goto L4
    L9:
        if (r1.isEmpty() == true) goto L29;
        String r10 = b(r6);
        String r11 = c(r10);
        if (r1.isEmpty() == true) goto L29;
        int r3 = r1.size();
        int r4 = 0;
    L15:
        if (r4 >= r3) goto L29;
        Object r5 = r1.get(r4);
        r4 = r4 + 1;
        if (qm4.o0(r10, (String) r5) == true) goto L15;
        ArrayList r12 = new ArrayList(r40.k0(r1, 10));
        int r13 = r1.size();
        int r14 = 0;
    L19:
        if (r14 >= r13) goto L22;
        Object r15 = r1.get(r14);
        r14 = r14 + 1;
        r12.add(c((String) r15));
        goto L19
    L22:
        if (r12.isEmpty() == true) goto L29;
        int r16 = r12.size();
        int r17 = 0;
    L25:
        if (r17 >= r16) goto L29;
        Object r18 = r12.get(r17);
        r17 = r17 + 1;
        if (qm4.o0(r11, (String) r18) == true) goto L25;
        return false;
    L29:
        return true;
    }

    public static String b(String r3) {
        String r4 = r3.toLowerCase(Locale.ROOT);
        r4.getClass();
        String r5 = r4.replace(1105, 1077);
        r5.getClass();
        String r6 = r5.replace(1081, 1);
        r6.getClass();
        String r7 = Normalizer.normalize(r6, Normalizer.Form.NFD);
        r7.getClass();
        String r8 = a.n.matcher(r7).replaceAll("");
        r8.getClass();
        String r9 = r8.replace(1, 1081);
        r9.getClass();
        String r10 = b.n.matcher(r9).replaceAll(" ");
        r10.getClass();
        return qm4.K0(r10).toString();
    }

    public static String c(String r6) {
        StringBuilder r0 = new StringBuilder();
        int r1 = r6.length();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L9;
        char r3 = r6.charAt(r2);
        Object r4 = (String) c.get(Character.valueOf(r3));
        if (r4 != null) goto L7;
        r4 = Character.valueOf(r3);
    L7:
        r0.append(r4);
        r2 = r2 + 1;
        goto L3
    L9:
        return r0.toString();
    }
}
