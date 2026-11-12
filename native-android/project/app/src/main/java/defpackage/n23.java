package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n23 {
    public static final Pattern q = null;
    public static final Pattern r = null;
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final String e;
    public final rp4 f;
    public final rp4 g;
    public final r72 h;
    public boolean i;
    public final r72 j;
    public final r72 k;
    public final r72 l;
    public final rp4 m;
    public final String n;
    public final rp4 o;
    public final boolean p;

    static {
        q = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
        r = Pattern.compile("\\{(.+?)\\}");
    }

    public n23(String r6, String r7, String r8) {
        this.a = r6;
        this.b = r7;
        this.c = r8;
        ArrayList r9 = new ArrayList();
        this.d = r9;
        this.f = new rp4(new l23(this, 6));
        this.g = new rp4(new l23(this, 4));
        l23 r0 = new l23(this, 7);
        b92 r1 = b92.n;
        this.h = rr2.K(r1, r0);
        this.j = rr2.K(r1, new l23(this, 1));
        this.k = rr2.K(r1, new l23(this, 0));
        this.l = rr2.K(r1, new l23(this, 3));
        this.m = new rp4(new l23(this, 2));
        this.o = new rp4(new l23(this, 5));
        if (r6 == null) goto L15;
        StringBuilder r2 = new StringBuilder("^");
        if (q.matcher(r6).find() == true) goto L8;
        r2.append("http[s]?://");
    L8:
        Matcher r3 = Pattern.compile("(\\?|\\#|$)").matcher(r6);
        r3.find();
        a(r6.substring(0, r3.start()), r9, r2);
        if (qm4.o0(r2, ".*") == false) goto L11;
    L13:
        boolean r10 = false;
    L14:
        this.p = r10;
        r2.append("($|(\\?(.)*)|(\\#(.)*))");
        this.e = xm4.i0(r2.toString(), ".*", "\\E.*\\Q");
        goto L15
    L11:
        if (qm4.o0(r2, "([^/]+?)") == true) goto L13;
        r10 = true;
    L15:
        if (r8 != null) goto L18;
        return;
    L18:
        if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(r8).matches() == false) goto L38;
        Pattern r11 = Pattern.compile("/");
        r11.getClass();
        qm4.A0(0);
        Matcher r12 = r11.matcher(r8);
        if (r12.find() == true) goto L22;
        List r13 = gb.O(r8.toString());
    L27:
        if (r13.isEmpty() == true) goto L35;
        ListIterator r14 = r13.listIterator(r13.size());
    L30:
        if (r14.hasPrevious() == false) goto L35;
        if (((String) r14.previous()).length() == 0) goto L30;
        List r15 = q40.L0(r13, r14.nextIndex() + 1);
    L36:
        this.n = xm4.i0(f34.h("^(", (String) r15.get(0), "|[*]+)/(", (String) r15.get(1), "|[*]+)$"), "*|[*]", "[\\s\\S]");
        return;
    L35:
        r15 = u01.n;
        goto L36
    L22:
        ArrayList r16 = new ArrayList(10);
        int r4 = 0;
    L23:
        r16.add(r8.subSequence(r4, r12.start()).toString());
        r4 = r12.end();
        if (r12.find() == true) goto L23;
        r16.add(r8.subSequence(r4, r8.length()).toString());
        r13 = r16;
        goto L27
    L38:
        kf2.e(xa3.h("The given mimeType ", r8, " does not match to required \"type/subtype\" format"));
        throw null;
    }

    public static void a(String r3, ArrayList r4, StringBuilder r5) {
        Matcher r0 = r.matcher(r3);
        int r1 = 0;
    L4:
        if (r0.find() == false) goto L10;
        String r2 = r0.group(1);
        r2.getClass();
        r4.add(r2);
        if (r0.start() <= r1) goto L8;
        r5.append(Pattern.quote(r3.substring(r1, r0.start())));
    L8:
        r5.append("([^/]*?|)");
        r1 = r0.end();
        goto L4
    L10:
        if (r1 >= r3.length()) goto L16;
        r5.append(Pattern.quote(r3.substring(r1)));
        return;
    }

    public static void e(Bundle r0, String r1, String r2, z13 r3) {
        if (r3 == null) goto L5;
        h33 r4 = r3.a;
        r1.getClass();
        r4.e(r0, r1, r4.d(r2));
        return;
    L5:
        r0.putString(r1, r2);
    }

    public final ArrayList b() {
        Collection r0 = ((Map) this.h.getValue()).values();
        ArrayList r1 = new ArrayList();
        Iterator r2 = r0.iterator();
    L4:
        if (r2.hasNext() == false) goto L7;
        v40.n0(((k23) r2.next()).b, r1);
        goto L4
    L7:
        return q40.G0(q40.G0(this.d, r1), (List) this.k.getValue());
    }

    public final boolean c(Matcher r9, Bundle r10, Map r11) {
        ArrayList r8 = this.d;
        ArrayList r0 = new ArrayList(r40.k0(r8, 10));
        int r1 = r8.size();
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r4 >= r1) goto L12;
        Object r5 = r8.get(r4);
        r4 = r4 + 1;
        int r6 = r3 + 1;
        if (r3 < 0) goto L10;
        String r7 = (String) r5;
        String r12 = Uri.decode(r9.group(r6));
        z13 r13 = (z13) r11.get(r7);
        r12.getClass();     // Catch: IllegalArgumentException -> L9
        e(r10, r7, r12, r13);     // Catch: IllegalArgumentException -> L9
        r0.add(j15.a);
        r3 = r6;
    L9:
        return false;
    L10:
        gb.c0();
        throw null;
    L12:
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(Uri r21, Bundle r22, Map r23) {
        n23 r0 = this;
        Iterator r2 = ((Map) r0.h.getValue()).entrySet().iterator();
    L4:
        if (r2.hasNext() == false) goto L73;
        Map.Entry r3 = (Map.Entry) r2.next();
        String r5 = (String) r3.getKey();
        k23 r4 = (k23) r3.getValue();
        List<String> r6 = r21.getQueryParameters(r5);
        if (r0.i == false) goto L12;
        String r7 = r21.getQuery();
        if (r7 == null) goto L12;
        if (r7.equals(r21.toString()) == true) goto L12;
        r6 = gb.O(r7);
    L12:
        r6.getClass();
        j15 r8 = j15.a;
        int r9 = 0;
        Bundle r10 = fh0.g(new kd3[0]);
        ArrayList r11 = r4.b;
        int r12 = r11.size();
        int r13 = 0;
    L13:
        if (r13 >= r12) goto L32;
        Object r14 = r11.get(r13);
        r13 = r13 + 1;
        String r15 = (String) r14;
        z13 r16 = (z13) r23.get(r15);
        if (r16 == null) goto L18;
        h33 r17 = r16.a;
    L20:
        if ((r17 instanceof a33) == false) goto L13;
        if (r16.c == true) goto L13;
        int r18 = ((a33) r17).r;
        Object r19 = u01.n;
        switch(r18) {
            case 0: goto L30;
            case 1: goto L31;
            case 2: goto L29;
            case 3: goto L31;
            case 4: goto L28;
            case 5: goto L31;
            case 6: goto L27;
            case 7: goto L31;
            case 8: goto L26;
            default: goto L31;
        };
    L26:
        r19 = new String[0];
        goto L31
    L27:
        r19 = new long[0];
        goto L31
    L28:
        r19 = new int[0];
        goto L31
    L29:
        r19 = new float[0];
        goto L31
    L30:
        r19 = new boolean[0];
    L31:
        r17.e(r10, r15, r19);
        goto L13
    L18:
        r17 = null;
        goto L20
    L32:
        Iterator<T> r20 = r6.iterator();
    L34:
        if (r20.hasNext() == false) goto L72;
        String r24 = (String) r20.next();
        String r110 = r4.a;
        if (r110 == null) goto L38;
        Matcher r25 = Pattern.compile(r110, 32).matcher(r24);
    L39:
        if (r25 == null) goto L71;
        if (r25.matches() == false) goto L71;
        ArrayList r111 = r4.b;
        ArrayList r112 = new ArrayList(r40.k0(r111, 10));
        int r113 = r111.size();
        int r114 = r9;
        int r115 = r114;
    L44:
        if (r115 >= r113) goto L70;
        Object r116 = r111.get(r115);
        r115 = r115 + 1;
        int r117 = r9;
        int r26 = r114 + 1;
        if (r114 < 0) goto L68;
        String r118 = (String) r116;
        String r119 = r25.group(r26);
        if (r119 != null) goto L50;
        r119 = "";
    L50:
        String r120 = r119;
        z13 r1 = (z13) r23.get(r118);
        if (r10.containsKey(r118) == true) goto L55;
        e(r10, r118, r120, r1);     // Catch: IllegalArgumentException -> L75
        goto L66
    L55:
        if (r10.containsKey(r118) == true) goto L57;
        boolean r27 = 1;
    L64:
        Object r28 = Boolean.valueOf(r27);     // Catch: IllegalArgumentException -> L75
    L67:
        r112.add(r28);
        r23 = r23;
        r114 = r26;
        r9 = r117;
        goto L44
    L57:
        if (r1 == null) goto L63;
        h33 r29 = r1.a;     // Catch: IllegalArgumentException -> L75
        Object r30 = r29.a(r118, r10);     // Catch: IllegalArgumentException -> L75
        if (r10.containsKey(r118) == false) goto L62;
        r29.e(r10, r118, r29.c(r30, r120));     // Catch: IllegalArgumentException -> L75
        goto L63
    L62:
        throw new IllegalArgumentException("There is no previous value in this bundle.");     // Catch: IllegalArgumentException -> L75
    L63:
        r27 = r117;
    L66:
        r28 = r8;
        goto L67
    L68:
        gb.c0();
        throw null;
    L70:
        r23 = r23;
    L71:
        return r9;
    L38:
        r25 = null;
        goto L39
    L72:
        r22.putAll(r10);
        r0 = this;
        goto L4
    L73:
        return true;
    }

    public final boolean equals(Object r4) {
        if (r4 != null) goto L5;
    L15:
        return false;
    L5:
        if ((r4 instanceof n23) == false) goto L15;
        n23 r5 = (n23) r4;
        String r1 = r5.a;
        if (h12.c(this.a, r1) == false) goto L15;
        if (h12.c(this.b, r5.b) == false) goto L15;
        if (h12.c(this.c, r5.c) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        int r0 = 0;
        String r1 = this.a;
        if (r1 == null) goto L5;
        int r2 = r1.hashCode();
    L6:
        int r3 = r2 * 31;
        String r4 = this.b;
        if (r4 == null) goto L9;
        int r5 = r4.hashCode();
    L10:
        int r6 = (r3 + r5) * 31;
        String r7 = this.c;
        if (r7 == null) goto L14;
        r0 = r7.hashCode();
    L14:
        return r6 + r0;
    L9:
        r5 = 0;
        goto L10
    L5:
        r2 = 0;
        goto L6
    }
}
