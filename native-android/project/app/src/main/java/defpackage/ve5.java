package defpackage;

import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ve5 {
    public static final ux3 a = null;
    public static final ux3 b = null;

    static {
        a = new ux3("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
        b = new ux3(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    }

    public static final hu2 a(String r13) {
        r13.getClass();
        byte[] r0 = xe5.a;
        ux3 r1 = a;
        r1.getClass();
        Matcher r2 = r1.n.matcher(r13);
        r2.getClass();
        if (r2.find(0) == true) goto L5;
        jv3 r3 = null;
    L6:
        if (r3 == null) goto L10;
        Matcher r4 = (Matcher) r3.n;
        if (gb.g0(r4.start(), r4.end()).n != 0) goto L10;
    L12:
        if (r3 == null) goto L57;
        if (((tg2) r3.p) != null) goto L16;
        r3.p = new tg2(r3);
    L16:
        tg2 r5 = (tg2) r3.p;
        r5.getClass();
        String r6 = (String) r5.get(1);
        Locale r7 = Locale.ROOT;
        String r8 = r6.toLowerCase(r7);
        r8.getClass();
        if (((tg2) r3.p) != null) goto L19;
        r3.p = new tg2(r3);
    L19:
        tg2 r9 = (tg2) r3.p;
        r9.getClass();
        String r10 = ((String) r9.get(2)).toLowerCase(r7);
        r10.getClass();
        ArrayList r11 = new ArrayList();
        Matcher r12 = (Matcher) r3.n;
        int r14 = gb.g0(r12.start(), r12.end()).o;
    L20:
        int r15 = r14 + 1;
        if (r15 >= r13.length()) goto L55;
        ux3 r16 = b;
        r16.getClass();
        Matcher r17 = r16.n.matcher(r13);
        r17.getClass();
        if (r17.find(r15) == true) goto L25;
        jv3 r18 = null;
    L26:
        if (r18 == null) goto L30;
        Matcher r19 = (Matcher) r18.n;
        if (gb.g0(r19.start(), r19.end()).n != r15) goto L30;
    L31:
        if (r18 == null) goto L53;
        Matcher r20 = (Matcher) r18.n;
        ug2 r21 = (ug2) r18.o;
        sg2 r110 = r21.b(1);
        if (r110 == null) goto L35;
        String r111 = r110.a;
    L36:
        if (r111 == null) goto L37;
        sg2 r112 = r21.b(2);
        if (r112 == null) goto L41;
        String r113 = r112.a;
    L42:
        if (r113 != null) goto L45;
        sg2 r22 = r21.b(3);
        r22.getClass();
        r113 = r22.a;
    L51:
        r11.add(r111);
        r11.add(r113);
        r14 = gb.g0(r20.start(), r20.end()).o;
        goto L20
    L45:
        if (xm4.k0(r113, "'", false) == false) goto L51;
        if (xm4.e0(r113, "'", false) == false) goto L51;
        if (r113.length() <= 2) goto L51;
        r113 = r113.substring(1, r113.length() - 1);
        goto L51
    L41:
        r113 = null;
        goto L42
    L37:
        r14 = gb.g0(r20.start(), r20.end()).o;
        goto L20
    L35:
        r111 = null;
        goto L36
    L53:
        throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + r13.substring(r15) + "\" for: \"" + r13 + '\"').toString());
    L30:
        r18 = null;
        goto L31
    L25:
        r18 = new jv3(r17, r13);
        goto L26
    L55:
        return new hu2(r13, r8, r10, (String[]) r11.toArray(new String[0]));
    L57:
        throw new IllegalArgumentException("No subtype found for: \"" + r13 + '\"');
    L10:
        r3 = null;
        goto L12
    L5:
        r3 = new jv3(r2, r13);
        goto L6
    }
}
