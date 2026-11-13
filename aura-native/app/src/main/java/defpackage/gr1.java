package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class gr1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final List g;
    public final String h;
    public final String i;

    public gr1(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = str5;
        this.i = str6;
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(qm4.r0(str, ':', length, 4) + 1, qm4.r0(str, '@', 0, 6));
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.i;
        int r0 = qm4.r0(str, '/', length, 4);
        return str.substring(r0, xe5.e(r0, str.length(), str, "?#"));
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.i;
        int r0 = qm4.r0(str, '/', length, 4);
        int e = xe5.e(r0, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (r0 < e) {
            int i = r0 + 1;
            int f = xe5.f(str, '/', i, e);
            arrayList.add(str.substring(i, f));
            r0 = f;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int r0 = qm4.r0(str, '?', 0, 6) + 1;
        return str.substring(r0, xe5.f(str, '#', r0, str.length()));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(length, xe5.e(length, str.length(), str, ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof gr1) && ((gr1) obj).i.equals(this.i);
    }

    public final boolean f() {
        return h12.c(this.a, "https");
    }

    public final fr1 g() {
        fr1 fr1Var = new fr1();
        String str = this.a;
        fr1Var.a = str;
        fr1Var.b = e();
        fr1Var.c = a();
        fr1Var.d = this.d;
        str.getClass();
        int i = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i2 = this.e;
        fr1Var.e = i2 != i ? i2 : -1;
        ArrayList arrayList = fr1Var.f;
        arrayList.clear();
        arrayList.addAll(c());
        String d = d();
        String str2 = null;
        fr1Var.g = d != null ? fr1.f(fu.g(d, 0, 0, " \"'<>#", 83)) : null;
        if (this.h != null) {
            String str3 = this.i;
            str2 = str3.substring(qm4.r0(str3, '#', 0, 6) + 1);
        }
        fr1Var.h = str2;
        return fr1Var;
    }

    public final String h(String str) {
        List list = this.g;
        if (list == null) {
            return null;
        }
        h02 b0 = gb.b0(gb.g0(0, list.size()), 2);
        int i = b0.n;
        int i2 = b0.o;
        int i3 = b0.p;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return null;
        }
        while (!str.equals(list.get(i))) {
            if (i == i2) {
                return null;
            }
            i += i3;
        }
        return (String) list.get(i + 1);
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final String i() {
        fr1 fr1Var;
        try {
            fr1Var = new fr1();
            fr1Var.e(this, "/...");
        } catch (IllegalArgumentException unused) {
            fr1Var = null;
        }
        fr1Var.getClass();
        fr1Var.b = fu.g("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        fr1Var.c = fu.g("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        return fr1Var.b().i;
    }

    public final URI j() {
        String str;
        fr1 g = g();
        ArrayList arrayList = g.f;
        String str2 = g.d;
        if (str2 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            compile.getClass();
            str = compile.matcher(str2).replaceAll("");
            str.getClass();
        } else {
            str = null;
        }
        g.d = str;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, fu.g((String) arrayList.get(i), 0, 0, "[]", 99));
        }
        ArrayList arrayList2 = g.g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str3 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str3 != null ? fu.g(str3, 0, 0, "\\^`{|}", 67) : null);
            }
        }
        String str4 = g.h;
        g.h = str4 != null ? fu.g(str4, 0, 0, " \"#<>\\^`{|}", 35) : null;
        String fr1Var = g.toString();
        try {
            return new URI(fr1Var);
        } catch (URISyntaxException e) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                compile2.getClass();
                String replaceAll = compile2.matcher(fr1Var).replaceAll("");
                replaceAll.getClass();
                URI create = URI.create(replaceAll);
                create.getClass();
                return create;
            } catch (Exception unused) {
                er1.m(e);
                return null;
            }
        }
    }

    public final String toString() {
        return this.i;
    }
}
