package defpackage;

import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ve5 {
    public static final ux3 a = new ux3("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final ux3 b = new ux3(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX WARN: Code duplicated, block: B:10:0x0039  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d4  */
    public static final hu2 a(String str) {
        str.getClass();
        byte[] bArr = xe5.a;
        ux3 ux3Var = a;
        ux3Var.getClass();
        Matcher matcher = ux3Var.n.matcher(str);
        matcher.getClass();
        jv3 jv3Var = !matcher.find(0) ? null : new jv3(matcher, str);
        if (jv3Var == null) {
            jv3Var = null;
        } else {
            Matcher matcher2 = (Matcher) jv3Var.n;
            if (gb.g0(matcher2.start(), matcher2.end()).n != 0) {
                jv3Var = null;
            }
        }
        if (jv3Var == null) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        if (((tg2) jv3Var.p) == null) {
            jv3Var.p = new tg2(jv3Var);
        }
        tg2 tg2Var = (tg2) jv3Var.p;
        tg2Var.getClass();
        String str2 = (String) tg2Var.get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        if (((tg2) jv3Var.p) == null) {
            jv3Var.p = new tg2(jv3Var);
        }
        tg2 tg2Var2 = (tg2) jv3Var.p;
        tg2Var2.getClass();
        String lowerCase2 = ((String) tg2Var2.get(2)).toLowerCase(locale);
        lowerCase2.getClass();
        ArrayList arrayList = new ArrayList();
        Matcher matcher3 = (Matcher) jv3Var.n;
        int i = gb.g0(matcher3.start(), matcher3.end()).o;
        while (true) {
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return new hu2(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            ux3 ux3Var2 = b;
            ux3Var2.getClass();
            Matcher matcher4 = ux3Var2.n.matcher(str);
            matcher4.getClass();
            jv3 jv3Var2 = !matcher4.find(i2) ? null : new jv3(matcher4, str);
            if (jv3Var2 == null) {
                jv3Var2 = null;
            } else {
                Matcher matcher5 = (Matcher) jv3Var2.n;
                if (gb.g0(matcher5.start(), matcher5.end()).n != i2) {
                    jv3Var2 = null;
                }
            }
            if (jv3Var2 == null) {
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(i2) + "\" for: \"" + str + '\"').toString());
            }
            Matcher matcher6 = (Matcher) jv3Var2.n;
            ug2 ug2Var = (ug2) jv3Var2.o;
            sg2 sg2VarB = ug2Var.b(1);
            String str3 = sg2VarB != null ? sg2VarB.a : null;
            if (str3 == null) {
                i = gb.g0(matcher6.start(), matcher6.end()).o;
            } else {
                sg2 sg2VarB2 = ug2Var.b(2);
                String strSubstring = sg2VarB2 != null ? sg2VarB2.a : null;
                if (strSubstring == null) {
                    sg2 sg2VarB3 = ug2Var.b(3);
                    sg2VarB3.getClass();
                    strSubstring = sg2VarB3.a;
                } else if (xm4.k0(strSubstring, "'", false) && xm4.e0(strSubstring, "'", false) && strSubstring.length() > 2) {
                    strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                }
                arrayList.add(str3);
                arrayList.add(strSubstring);
                i = gb.g0(matcher6.start(), matcher6.end()).o;
            }
        }
    }
}
