package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fr1 {
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public final ArrayList f;
    public ArrayList g;
    public String h;

    public fr1() {
        this.b = "";
        this.c = "";
        this.e = -1;
        this.f = gb.Q(new String[]{""});
    }

    public static ArrayList f(String r6) {
        ArrayList r0 = new ArrayList();
        int r1 = 0;
    L4:
        if (r1 > r6.length()) goto L15;
        int r2 = qm4.r0(r6, '&', r1, 4);
        if (r2 != (-1)) goto L8;
        r2 = r6.length();
    L8:
        int r3 = qm4.r0(r6, '=', r1, 4);
        if (r3 == (-1)) goto L13;
        if (r3 > r2) goto L13;
        r0.add(r6.substring(r1, r3));
        r0.add(r6.substring(r3 + 1, r2));
    L14:
        r1 = r2 + 1;
    L13:
        r0.add(r6.substring(r1, r2));
        r0.add(null);
        goto L14
    L15:
        return r0;
    }

    public final void a(String r5, String r6) {
        r5.getClass();
        if (this.g != null) goto L5;
        this.g = new ArrayList();
    L5:
        ArrayList r0 = this.g;
        r0.getClass();
        r0.add(fu.g(r5, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91));
        ArrayList r4 = this.g;
        r4.getClass();
        if (r6 == null) goto L8;
        String r7 = fu.g(r6, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91);
    L9:
        r4.add(r7);
        return;
    L8:
        r7 = null;
        goto L9
    }

    public final gr1 b() {
        String r1 = this.a;
        String r0 = null;
        if (r1 == null) goto L26;
        String r2 = fu.J(this.b, 0, 0, 7);
        String r5 = fu.J(this.c, 0, 0, 7);
        String r4 = this.d;
        if (r4 == null) goto L24;
        int r6 = c();
        ArrayList r9 = this.f;
        ArrayList r7 = new ArrayList(r40.k0(r9, 10));
        int r11 = r9.size();
        int r12 = 0;
    L7:
        if (r12 >= r11) goto L9;
        Object r13 = r9.get(r12);
        r12 = r12 + 1;
        r7.add(fu.J((String) r13, 0, 0, 7));
        goto L7
    L9:
        ArrayList r10 = this.g;
        if (r10 == null) goto L18;
        ArrayList r14 = new ArrayList(r40.k0(r10, 10));
        int r15 = r10.size();
        int r16 = 0;
    L12:
        if (r16 >= r15) goto L19;
        Object r17 = r10.get(r16);
        r16 = r16 + 1;
        String r18 = (String) r17;
        if (r18 == null) goto L16;
        String r19 = fu.J(r18, 0, 0, 3);
    L17:
        r14.add(r19);
        goto L12
    L16:
        r19 = null;
    L19:
        String r20 = this.h;
        if (r20 == null) goto L23;
        r0 = fu.J(r20, 0, 0, 7);
    L23:
        return new gr1(r1, r2, r5, r4, r6, r7, r14, r0, toString());
    L18:
        r14 = null;
        goto L19
    L24:
        kf2.o("host == null");
        return null;
    L26:
        kf2.o("scheme == null");
        return null;
    }

    public final int c() {
        int r0 = this.e;
        if (r0 == (-1)) goto L5;
        return r0;
    L5:
        String r2 = this.a;
        r2.getClass();
        if (r2.equals("http") == false) goto L9;
        return 80;
    L9:
        if (r2.equals("https") == false) goto L13;
        return 443;
    L13:
        return -1;
    }

    public final void d(String r3) {
        r3.getClass();
        String r0 = ue5.b(fu.J(r3, 0, 0, 7));
        if (r0 == null) goto L6;
        this.d = r0;
        return;
    L6:
        kf2.n("unexpected host: ".concat(r3));
    }

    public final void e(gr1 r18, String r19) {
        r19.getClass();
        byte[] r3 = xe5.a;
        int r4 = xe5.i(r19, 0, r19.length());
        int r5 = xe5.j(r19, r4, r19.length());
        byte r10 = -1;
        if ((r5 - r4) >= 2) goto L5;
    L4:
        int r6 = -1;
    L37:
        int r14 = 1;
        if (r6 != (-1)) goto L40;
        if (r18 == null) goto L194;
        this.a = r18.a;
    L49:
        int r7 = r4;
        int r15 = 0;
    L50:
        int r16 = r14;
        if (r7 >= r5) goto L56;
        char r8 = r19.charAt(r7);
        if (r8 == '\\') goto L55;
        if (r8 != '/') goto L56;
    L55:
        r15 = r15 + 1;
        r7 = r7 + 1;
        r14 = r16;
    L56:
        ArrayList r9 = this.f;
        byte r17 = 35;
        if (r15 >= 2) goto L71;
        if (r18 == null) goto L71;
        if (h12.c(r18.a, this.a) == false) goto L71;
        this.b = r18.e();
        this.c = r18.a();
        this.d = r18.d;
        this.e = r18.e;
        r9.clear();
        r9.addAll(r18.c());
        if (r4 != r5) goto L65;
    L66:
        String r1 = r18.d();
        if (r1 == null) goto L69;
        ArrayList r2 = f(fu.g(r1, 0, 0, " \"'<>#", 83));
    L70:
        this.g = r2;
    L138:
        int r11 = xe5.e(r4, r5, r19, "?#");
        if (r4 == r11) goto L182;
        char r12 = r19.charAt(r4);
        if (r12 != '/') goto L144;
    L147:
        r9.clear();
        r9.add("");
        r4 = r4 + 1;
    L148:
        if (r4 >= r11) goto L182;
        int r13 = xe5.e(r4, r11, r19, "/\\");
        if (r13 >= r11) goto L152;
        boolean r110 = true;
    L153:
        String r20 = fu.g(r19, r4, r13, " \"<>^`{}|/\\?#", 112);
        if (r20.equals(".") == false) goto L156;
    L179:
        if (r110 == true) goto L180;
        r4 = r13;
        goto L148
    L180:
        r4 = r13 + 1;
        goto L148
    L156:
        if (r20.equalsIgnoreCase("%2e") == true) goto L179;
        if (r20.equals("..") == true) goto L174;
        if (r20.equalsIgnoreCase("%2e.") == true) goto L174;
        if (r20.equalsIgnoreCase(".%2e") == true) goto L174;
        if (r20.equalsIgnoreCase("%2e%2e") == true) goto L174;
        if (((CharSequence) r9.get(r9.size() - 1)).length() != 0) goto L170;
        r9.set(r9.size() - 1, r20);
    L171:
        if (r110 == false) goto L179;
        r9.add("");
        goto L179
    L170:
        r9.add(r20);
    L174:
        if (((String) r9.remove(r9.size() - 1)).length() == 0) goto L176;
    L178:
        r9.add("");
        goto L179
    L176:
        if (r9.isEmpty() == true) goto L178;
        r9.set(r9.size() - 1, "");
        goto L179
    L152:
        r110 = false;
        goto L153
    L144:
        if (r12 == '\\') goto L147;
        r9.set(r9.size() - 1, "");
    L182:
        if (r11 < r5) goto L184;
    L186:
        if (r11 < r5) goto L188;
        return;
    L188:
        if (r19.charAt(r11) != '#') goto L239;
        this.h = fu.g(r19, r11 + 1, r5, "", 48);
        return;
    L239:
        return;
    L184:
        if (r19.charAt(r11) != '?') goto L186;
        int r21 = xe5.f(r19, '#', r11, r5);
        this.g = f(fu.g(r19, r11 + 1, r21, " \"'<>#", 80));
        r11 = r21;
        goto L186
    L69:
        r2 = null;
        goto L70
    L65:
        if (r19.charAt(r4) != '#') goto L138;
    L71:
        int r22 = r4 + r15;
        int r23 = 0;
        int r24 = 0;
    L72:
        int r111 = xe5.e(r22, r5, r19, "@/\\?#");
        if (r111 == r5) goto L75;
        byte r112 = r19.charAt(r111);
    L76:
        if (r112 == r10) goto L99;
        if (r112 == r17) goto L99;
        if (r112 == 47) goto L99;
        if (r112 == 92) goto L99;
        if (r112 == 63) goto L99;
        if (r112 != 64) goto L72;
        if (r23 != 0) goto L97;
        int r113 = xe5.f(r19, ':', r22, r111);
        String r25 = fu.g(r19, r22, r113, " \"':;<=>@[]^`{}|/\\?#", 112);
        if (r24 == 0) goto L92;
        r25 = this.b + "%40" + r25;
    L92:
        this.b = r25;
        if (r113 == r111) goto L96;
        this.c = fu.g(r19, r113 + 1, r111, " \"':;<=>@[]^`{}|/\\?#", 112);
        r23 = r16;
    L96:
        r24 = r16;
    L98:
        r22 = r111 + 1;
        r10 = -1;
        r17 = 35;
        goto L72
    L97:
        this.c += "%40" + fu.g(r19, r22, r111, " \"':;<=>@[]^`{}|/\\?#", 112);
    L99:
        int r26 = r22;
    L100:
        if (r26 >= r111) goto L112;
        char r27 = r19.charAt(r26);
        if (r27 != '[') goto L109;
    L103:
        r26 = r26 + 1;
        if (r26 >= r111) goto L111;
        if (r19.charAt(r26) != ']') goto L103;
    L111:
        r26 = r26 + 1;
        goto L100
    L109:
        if (r27 != ':') goto L111;
    L113:
        int r28 = r26 + 1;
        if (r28 >= r111) goto L128;
        this.d = ue5.b(fu.J(r19, r22, r26, 4));
        int r29 = Integer.parseInt(fu.g(r19, r28, r111, "", 120));     // Catch: NumberFormatException -> L199
        if (r16 > r29) goto L122;
        if (r29 >= 65536) goto L122;
    L123:
        this.e = r29;
        if (r29 != (-1)) goto L136;
        er1.k(r19.substring(r28, r111), "Invalid URL port: \"");
        return;
    L136:
        if (this.d == null) goto L191;
        r4 = r111;
        goto L138
    L191:
        er1.k(r19.substring(r22, r26), "Invalid URL host: \"");
        return;
    L122:
        r29 = -1;
        goto L123
    L128:
        int r114 = -1;
        this.d = ue5.b(fu.J(r19, r22, r26, 4));
        String r30 = this.a;
        r30.getClass();
        if (r30.equals("http") == false) goto L132;
        r114 = 80;
    L134:
        this.e = r114;
        goto L136
    L132:
        if (r30.equals("https") == false) goto L134;
        r114 = 443;
        goto L134
    L112:
        r26 = r111;
        goto L113
    L75:
        r112 = r10;
        goto L76
    L194:
        if (r19.length() <= 6) goto L196;
        String r0 = qm4.J0(6, r19).concat("...");
    L197:
        kf2.n("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(r0));
        return;
    L196:
        r0 = r19;
        goto L197
    L40:
        if (xm4.j0(r19, r4, "https:", true) == false) goto L43;
        this.a = "https";
        r4 = r4 + 6;
        goto L49
    L43:
        if (xm4.j0(r19, r4, "http:", true) == false) goto L46;
        this.a = "http";
        r4 = r4 + 5;
        goto L49
    L46:
        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + r19.substring(0, r6) + '\'');
    L5:
        char r31 = r19.charAt(r4);
        if (h12.j(r31, 97) < 0) goto L10;
        if (h12.j(r31, 122) > 0) goto L10;
    L14:
        r6 = r4 + 1;
    L15:
        if (r6 >= r5) goto L4;
        char r115 = r19.charAt(r6);
        if ('a' <= r115) goto L19;
    L21:
        if ('A' > r115) goto L24;
        if (r115 >= '[') goto L24;
    L35:
        r6 = r6 + 1;
    L24:
        if ('0' > r115) goto L28;
        if (r115 < ':') goto L35;
    L28:
        if (r115 == '+') goto L35;
        if (r115 == '-') goto L35;
        if (r115 == '.') goto L35;
        if (r115 != ':') goto L4;
    L19:
        if (r115 >= '{') goto L21;
    L10:
        if (h12.j(r31, 65) < 0) goto L4;
        if (h12.j(r31, 90) <= 0) goto L14;
        goto L14
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        String r1 = this.a;
        if (r1 == null) goto L5;
        r0.append(r1);
        r0.append("://");
    L7:
        if (this.b.length() <= 0) goto L10;
    L11:
        r0.append(this.b);
        if (this.c.length() <= 0) goto L14;
        r0.append(':');
        r0.append(this.c);
    L14:
        r0.append('@');
    L15:
        String r2 = this.d;
        if (r2 != null) goto L18;
    L21:
        int r3 = -1;
        if (this.e == (-1)) goto L24;
    L25:
        int r4 = c();
        String r5 = this.a;
        if (r5 != null) goto L28;
    L34:
        r0.append(':');
        r0.append(r4);
    L35:
        ArrayList r6 = this.f;
        int r7 = r6.size();
        int r8 = 0;
    L36:
        if (r8 >= r7) goto L39;
        r0.append('/');
        r0.append((String) r6.get(r8));
        r8 = r8 + 1;
        goto L36
    L39:
        if (this.g == null) goto L42;
        r0.append('?');
        ArrayList r9 = this.g;
        r9.getClass();
        y41.h(r9, r0);
    L42:
        if (this.h == null) goto L45;
        r0.append('#');
        r0.append(this.h);
    L45:
        return r0.toString();
    L28:
        if (r5.equals("http") == false) goto L31;
        r3 = 80;
    L33:
        if (r4 == r3) goto L35;
    L31:
        if (r5.equals("https") == false) goto L33;
        r3 = 443;
        goto L33
    L24:
        if (this.a == null) goto L35;
    L18:
        if (qm4.n0(r2, ':') == false) goto L20;
        r0.append('[');
        r0.append(this.d);
        r0.append(']');
        goto L21
    L20:
        r0.append(this.d);
        goto L21
    L10:
        if (this.c.length() <= 0) goto L15;
    L5:
        r0.append("//");
        goto L7
    }
}
