package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zg1 {
    public static final Pattern c = null;
    public int a;
    public int b;

    static {
        c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    }

    public zg1() {
        this.a = -1;
        this.b = -1;
    }

    public final boolean a(String r5) {
        Matcher r6 = c.matcher(r5);
        if (r6.find() == true) goto L13;
        return false;
    L13:
        String r1 = r6.group(1);     // Catch: NumberFormatException -> L12
        String r2 = f35.a;     // Catch: NumberFormatException -> L12
        int r3 = Integer.parseInt(r1, 16);     // Catch: NumberFormatException -> L12
        int r7 = Integer.parseInt(r6.group(2), 16);     // Catch: NumberFormatException -> L12
        if (r3 > 0) goto L8;
        if (r7 > 0) goto L8;
        return false;
    L8:
        this.a = r3;     // Catch: NumberFormatException -> L12
        this.b = r7;     // Catch: NumberFormatException -> L12
        return true;
    L16:
        return false;
    }

    public final void b(qv2 r11) {
        r11.getClass();
        uw1 r0 = yw1.j();
        pv2[] r12 = r11.a;
        int r1 = r12.length;
        int r3 = 0;
    L3:
        pv2 r4 = null;
        if (r3 >= r1) goto L13;
        pv2 r6 = r12[r3];
        if (l60.class.isAssignableFrom(r6.getClass()) == false) goto L10;
        pv2 r7 = (pv2) l60.class.cast(r6);
        if (((l60) r7).c.equals("iTunSMPB") == false) goto L10;
        r4 = r7;
    L10:
        if (r4 == null) goto L12;
        r0.c(r4);
    L12:
        r3 = r3 + 1;
        goto L3
    L13:
        vw1 r2 = r0.f().m(0);
    L15:
        if (r2.hasNext() == false) goto L19;
        if (a(((l60) r2.next()).d) == false) goto L15;
        return;
    L19:
        uw1 r5 = yw1.j();
        int r8 = r12.length;
        int r9 = 0;
    L20:
        if (r9 >= r8) goto L35;
        pv2 r10 = r12[r9];
        if (s02.class.isAssignableFrom(r10.getClass()) == false) goto L31;
        pv2 r13 = (pv2) s02.class.cast(r10);
        s02 r14 = (s02) r13;
        if (r14.b.equals("com.apple.iTunes") == true) goto L26;
    L28:
        boolean r15 = false;
    L29:
        if (r15 == false) goto L31;
    L32:
        if (r13 == null) goto L34;
        r5.c(r13);
    L34:
        r9 = r9 + 1;
        goto L20
    L26:
        if (r14.c.equals("iTunSMPB") == false) goto L28;
        r15 = true;
    L31:
        r13 = null;
        goto L32
    L35:
        vw1 r16 = r5.f().m(0);
    L37:
        if (r16.hasNext() == false) goto L53;
        if (a(((s02) r16.next()).d) == false) goto L37;
        return;
    }
}
