/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.gb;
import defpackage.hu2;
import defpackage.jv3;
import defpackage.sg2;
import defpackage.tg2;
import defpackage.ug2;
import defpackage.ux3;
import defpackage.xe5;
import defpackage.xm4;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;

public abstract class ve5 {
    public static final ux3 a = new ux3("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final ux3 b = new ux3(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public static final hu2 a(String string) {
        Object object;
        block18: {
            Object object2;
            block17: {
                block16: {
                    string.getClass();
                    object = xe5.a;
                    object = a;
                    object.getClass();
                    object = ((ux3)object).n.matcher(string);
                    object.getClass();
                    object = !((Matcher)object).find(0) ? null : new jv3((Matcher)object, string);
                    if (object == null) break block16;
                    object2 = (Matcher)((jv3)object).n;
                    if (gb.g0((int)((Matcher)object2).start(), (int)((Matcher)object2).end()).n == 0) break block17;
                }
                object = null;
            }
            if (object == null) break block18;
            if ((tg2)((jv3)object).p == null) {
                ((jv3)object).p = new tg2((jv3)object);
            }
            object2 = (tg2)((jv3)object).p;
            object2.getClass();
            Object object3 = (String)((tg2)object2).get(1);
            object2 = Locale.ROOT;
            String string2 = ((String)object3).toLowerCase((Locale)object2);
            string2.getClass();
            if ((tg2)((jv3)object).p == null) {
                ((jv3)object).p = new tg2((jv3)object);
            }
            object3 = (tg2)((jv3)object).p;
            object3.getClass();
            String string3 = ((String)((tg2)object3).get(2)).toLowerCase((Locale)object2);
            string3.getClass();
            ArrayList<Object> arrayList = new ArrayList<Object>();
            object = (Matcher)((jv3)object).n;
            int n16 = gb.g0((int)((Matcher)object).start(), (int)((Matcher)object).end()).o;
            while (++n16 < string.length()) {
                block20: {
                    block19: {
                        object = b;
                        object.getClass();
                        object = ((ux3)object).n.matcher(string);
                        object.getClass();
                        object = !((Matcher)object).find(n16) ? null : new jv3((Matcher)object, string);
                        if (object == null) break block19;
                        object2 = (Matcher)((jv3)object).n;
                        if (gb.g0((int)((Matcher)object2).start(), (int)((Matcher)object2).end()).n == n16) break block20;
                    }
                    object = null;
                }
                if (object != null) {
                    Matcher matcher = (Matcher)((jv3)object).n;
                    object2 = (ug2)((jv3)object).o;
                    object = ((ug2)object2).b(1);
                    object3 = object != null ? ((sg2)object).a : null;
                    if (object3 == null) {
                        n16 = gb.g0((int)matcher.start(), (int)matcher.end()).o;
                        continue;
                    }
                    object = ((ug2)object2).b(2);
                    object = object != null ? ((sg2)object).a : null;
                    if (object == null) {
                        object = ((ug2)object2).b(3);
                        object.getClass();
                        object2 = ((sg2)object).a;
                    } else {
                        object2 = object;
                        if (xm4.k0((String)object, "'", false)) {
                            object2 = object;
                            if (xm4.e0((String)object, "'", false)) {
                                object2 = object;
                                if (((String)object).length() > 2) {
                                    object2 = ((String)object).substring(1, ((String)object).length() - 1);
                                }
                            }
                        }
                    }
                    arrayList.add(object3);
                    arrayList.add(object2);
                    n16 = gb.g0((int)matcher.start(), (int)matcher.end()).o;
                    continue;
                }
                object2 = string.substring(n16);
                object = new StringBuilder("Parameter is not formatted correctly: \"");
                ((StringBuilder)object).append((String)object2);
                ((StringBuilder)object).append("\" for: \"");
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append('\"');
                throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
            }
            return new hu2(string, string2, string3, arrayList.toArray(new String[0]));
        }
        object = new StringBuilder("No subtype found for: \"");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append('\"');
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }
}

