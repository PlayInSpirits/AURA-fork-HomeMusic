package defpackage;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
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

    static {
    }

    public gr1(String r1, String r2, String r3, String r4, int r5, ArrayList r6, ArrayList r7, String r8, String r9) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
        this.h = r8;
        this.i = r9;
    }

    public final String a() {
        if (this.c.length() != 0) goto L6;
        return "";
    L6:
        int r0 = this.a.length() + 3;
        String r4 = this.i;
        return r4.substring(qm4.r0(r4, ':', r0, 4) + 1, qm4.r0(r4, '@', 0, 6));
    }

    public final String b() {
        int r0 = this.a.length() + 3;
        String r3 = this.i;
        int r1 = qm4.r0(r3, '/', r0, 4);
        return r3.substring(r1, xe5.e(r1, r3.length(), r3, "?#"));
    }

    public final ArrayList c() {
        int r0 = this.a.length() + 3;
        String r5 = this.i;
        int r1 = qm4.r0(r5, '/', r0, 4);
        int r2 = xe5.e(r1, r5.length(), r5, "?#");
        ArrayList r3 = new ArrayList();
    L3:
        if (r1 >= r2) goto L5;
        int r4 = r1 + 1;
        int r6 = xe5.f(r5, '/', r4, r2);
        r3.add(r5.substring(r4, r6));
        r1 = r6;
        goto L3
    L5:
        return r3;
    }

    public final String d() {
        if (this.g != null) goto L6;
        return null;
    L6:
        String r3 = this.i;
        int r0 = qm4.r0(r3, '?', 0, 6) + 1;
        return r3.substring(r0, xe5.f(r3, '#', r0, r3.length()));
    }

    public final String e() {
        if (this.b.length() != 0) goto L6;
        return "";
    L6:
        int r0 = this.a.length() + 3;
        String r3 = this.i;
        return r3.substring(r0, xe5.e(r0, r3.length(), r3, ":@"));
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof gr1) == true) goto L5;
        return false;
    L5:
        if (((gr1) r2).i.equals(this.i) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final boolean f() {
        return h12.c(this.a, "https");
    }

    public final fr1 g() {
        fr1 r0 = new fr1();
        String r1 = this.a;
        r0.a = r1;
        r0.b = e();
        r0.c = a();
        r0.d = this.d;
        r1.getClass();
        int r3 = -1;
        if (r1.equals("http") == false) goto L6;
        int r2 = 80;
    L9:
        int r4 = this.e;
        if (r4 == r2) goto L12;
        r3 = r4;
    L12:
        r0.e = r3;
        ArrayList r5 = r0.f;
        r5.clear();
        r5.addAll(c());
        String r6 = d();
        String r7 = null;
        if (r6 == null) goto L15;
        ArrayList r8 = fr1.f(fu.g(r6, 0, 0, " \"'<>#", 83));
    L16:
        r0.g = r8;
        if (this.h == null) goto L20;
        String r9 = this.i;
        r7 = r9.substring(qm4.r0(r9, '#', 0, 6) + 1);
    L20:
        r0.h = r7;
        return r0;
    L15:
        r8 = null;
        goto L16
    L6:
        if (r1.equals("https") == false) goto L8;
        r2 = 443;
        goto L9
    L8:
        r2 = -1;
        goto L9
    }

    public final String h(String r5) {
        List r4 = this.g;
        if (r4 == null) goto L22;
        h02 r0 = gb.b0(gb.g0(0, r4.size()), 2);
        int r1 = r0.n;
        int r2 = r0.o;
        int r3 = r0.p;
        if (r3 <= 0) goto L8;
        if (r1 > r2) goto L8;
    L11:
        if (r5.equals(r4.get(r1)) == true) goto L13;
        if (r1 == r2) goto L23;
        r1 = r1 + r3;
        goto L11
    L23:
        return null;
    L13:
        return (String) r4.get(r1 + 1);
    L8:
        if (r3 >= 0) goto L16;
        if (r2 <= r1) goto L11;
        return null;
    L16:
        return null;
    L22:
        return null;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final String i() {
        fr1 r1 = new fr1();     // Catch: IllegalArgumentException -> L5
        r1.e(this, "/...");     // Catch: IllegalArgumentException -> L5
    L6:
        r1.getClass();
        r1.b = fu.g("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        r1.c = fu.g("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        return r1.b().i;
    L5:
        r1 = null;
        goto L6
    }

    public final URI j() {
        fr1 r9 = g();
        ArrayList r0 = r9.f;
        String r1 = r9.d;
        if (r1 == null) goto L5;
        Pattern r4 = Pattern.compile("[\"<>^`{|}]");
        r4.getClass();
        String r2 = r4.matcher(r1).replaceAll("");
        r2.getClass();
    L6:
        r9.d = r2;
        int r3 = r0.size();
        int r5 = 0;
    L7:
        if (r5 >= r3) goto L9;
        r0.set(r5, fu.g((String) r0.get(r5), 0, 0, "[]", 99));
        r5 = r5 + 1;
        goto L7
    L9:
        ArrayList r6 = r9.g;
        if (r6 == null) goto L18;
        int r7 = r6.size();
        int r8 = 0;
    L12:
        if (r8 >= r7) goto L18;
        String r10 = (String) r6.get(r8);
        if (r10 == null) goto L16;
        String r11 = fu.g(r10, 0, 0, "\\^`{|}", 67);
    L17:
        r6.set(r8, r11);
        r8 = r8 + 1;
        goto L12
    L16:
        r11 = null;
    L18:
        String r12 = r9.h;
        if (r12 == null) goto L21;
        String r13 = fu.g(r12, 0, 0, " \"#<>\\^`{|}", 35);
    L22:
        r9.h = r13;
        String r14 = r9.toString();
        return new URI(r14);
    L25:
        e = move-exception;
        Pattern r15 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");     // Catch: Exception -> L29
        r15.getClass();     // Catch: Exception -> L29
        String r16 = r15.matcher(r14).replaceAll("");     // Catch: Exception -> L29
        r16.getClass();     // Catch: Exception -> L29
        URI r17 = URI.create(r16);     // Catch: Exception -> L29
        r17.getClass();
        return r17;
    L29:
        er1.m(e);
        return null;
    L21:
        r13 = null;
        goto L22
    L5:
        r2 = null;
        goto L6
    }

    public final String toString() {
        return this.i;
    }
}
