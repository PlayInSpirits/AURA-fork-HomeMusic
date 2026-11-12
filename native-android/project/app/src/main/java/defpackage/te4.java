package defpackage;

import android.util.SparseArray;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class te4 implements Comparable {
    public static final Pattern t = null;
    public static final Pattern u = null;
    public static final Pattern v = null;
    public final String n;
    public final long o;
    public final long p;
    public final boolean q;
    public final File r;
    public final long s;

    static {
        t = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
        u = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
        v = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);
    }

    public te4(String r1, long r2, long r4, long r6, File r8) {
        this.n = r1;
        this.o = r2;
        this.p = r4;
        if (r8 == null) goto L5;
        boolean r3 = true;
    L6:
        this.q = r3;
        this.r = r8;
        this.s = r6;
        return;
    L5:
        r3 = false;
        goto L6
    }

    public static te4 b(File r16, long r17, long r19, ml3 r21) {
        String r1 = r16.getName();
        if (r1.endsWith(".v3.exo") == true) goto L37;
        String r2 = r16.getName();
        Matcher r3 = u.matcher(r2);
        if (r3.matches() == false) goto L25;
        String r4 = r3.group(1);
        r4.getClass();
        String r7 = f35.a;
        int r8 = r4.length();
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
    L7:
        if (r10 >= r8) goto L12;
        if (r4.charAt(r10) != '%') goto L11;
        r11 = r11 + 1;
    L11:
        r10 = r10 + 1;
        goto L7
    L12:
        if (r11 == 0) goto L29;
        int r12 = r8 - (r11 * 2);
        StringBuilder r13 = new StringBuilder(r12);
        Matcher r14 = f35.e.matcher(r4);
    L15:
        if (r11 <= 0) goto L19;
        if (r14.find() == false) goto L19;
        String r15 = r14.group(1);
        r15.getClass();
        char r18 = (char) Integer.parseInt(r15, 16);
        r13.append(r4, r9, r14.start());
        r13.append(r18);
        r9 = r14.end();
        r11 = r11 - 1;
    L19:
        if (r9 >= r8) goto L22;
        r13.append(r4, r9, r8);
    L22:
        if (r13.length() != r12) goto L28;
        r4 = r13.toString();
    L28:
        r4 = null;
    L29:
        if (r4 != null) goto L31;
    L30:
        File r5 = null;
    L34:
        if (r5 != null) goto L36;
        return null;
    L36:
        File r110 = r5;
        r1 = r5.getName();
    L38:
        Matcher r6 = v.matcher(r1);
        if (r6.matches() == true) goto L41;
        return null;
    L41:
        String r20 = r6.group(1);
        r20.getClass();
        String r22 = (String) ((SparseArray) r21.b).get(Integer.parseInt(r20));
        if (r22 != null) goto L45;
        return null;
    L45:
        if (r17 != (-1)) goto L47;
        long r111 = r110.length();
    L49:
        if (r111 != 0) goto L51;
        return null;
    L51:
        String r0 = r6.group(2);
        r0.getClass();
        long r23 = Long.parseLong(r0);
        if (r19 != (-9223372036854775807L)) goto L54;
        String r24 = r6.group(3);
        r24.getClass();
        long r112 = Long.parseLong(r24);
    L56:
        return new te4(r22, r23, r111, r112, r110);
    L54:
        r112 = r19;
        goto L56
    L47:
        r111 = r17;
        goto L49
    L31:
        File r25 = r16.getParentFile();
        r25.getClass();
        int r26 = r21.m(r4).a;
        String r27 = r3.group(2);
        r27.getClass();
        long r28 = Long.parseLong(r27);
        String r29 = r3.group(3);
        r29.getClass();
        r5 = c(r25, r26, r28, Long.parseLong(r29));
        if (r16.renameTo(r5) == true) goto L34;
    L25:
        r3 = t.matcher(r2);
        if (r3.matches() == false) goto L28;
        r4 = r3.group(1);
        r4.getClass();
        goto L29
    L37:
        r110 = r16;
        goto L38
    }

    public static File c(File r2, int r3, long r4, long r6) {
        StringBuilder r1 = new StringBuilder();
        r1.append(r3);
        r1.append(".");
        r1.append(r4);
        r1.append(".");
        return new File(r2, b11.p(r1, r6, ".v3.exo"));
    }

    public final int a(te4 r3) {
        String r0 = r3.n;
        String r1 = this.n;
        if (r1.equals(r0) == false) goto L5;
        long r2 = this.o - r3.o;
        if (r2 != 0) goto L10;
        return 0;
    L10:
        if (r2 >= 0) goto L13;
        return -1;
    L13:
        return 1;
    L5:
        return r1.compareTo(r3.n);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return a((te4) r1);
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("[");
        r0.append(this.o);
        r0.append(", ");
        return b11.p(r0, this.p, "]");
    }
}
