package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class iv1 implements pv2 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public iv1(int r2, int r3, String r4, String r5, String r6, boolean r7) {
        if (r3 == (-1)) goto L7;
        if (r3 > 0) goto L7;
        boolean r0 = false;
    L8:
        rr2.l(r0);
        this.a = r2;
        this.b = r4;
        this.c = r5;
        this.d = r6;
        this.e = r7;
        this.f = r3;
        return;
    L7:
        r0 = true;
        goto L8
    }

    public static iv1 d(Map r14) {
        List r2 = (List) r14.get("icy-br");
        boolean r4 = true;
        int r6 = -1;
        if (r2 == null) goto L14;
        String r3 = (String) r2.get(0);
        int r7 = Integer.parseInt(r3) * 1000;
        if (r7 <= 0) goto L50;
        boolean r1 = true;
    L11:
        int r8 = r7;
    L15:
        List r5 = (List) r14.get("icy-genre");
        if (r5 == null) goto L18;
        String r10 = (String) r5.get(0);
        r1 = true;
    L19:
        List r9 = (List) r14.get("icy-name");
        if (r9 == null) goto L22;
        String r11 = (String) r9.get(0);
        r1 = true;
    L23:
        List r12 = (List) r14.get("icy-url");
        if (r12 == null) goto L26;
        String r13 = (String) r12.get(0);
        r1 = true;
    L27:
        List r15 = (List) r14.get("icy-pub");
        if (r15 == null) goto L30;
        boolean r16 = ((String) r15.get(0)).equals("1");
        r1 = true;
    L31:
        List r17 = (List) r14.get("icy-metaint");
        if (r17 == null) goto L40;
        String r18 = (String) r17.get(0);
        int r19 = Integer.parseInt(r18);     // Catch: NumberFormatException -> L46
        if (r19 <= 0) goto L52;
        r6 = r19;
    L39:
        r1 = r4;
        goto L40
    L52:
        l93.q0("IcyHeaders", "Invalid metadata interval: " + r18);     // Catch: NumberFormatException -> L41
        r4 = r1;
    L41:
        r6 = r19;
    L42:
        xa3.s("Invalid metadata interval: ", r18, "IcyHeaders");
    L40:
        int r20 = r6;
        if (r1 == true) goto L45;
        return null;
    L45:
        return new iv1(r8, r20, r10, r11, r13, r16);
    L30:
        r16 = false;
        goto L31
    L26:
        r13 = null;
        goto L27
    L22:
        r11 = null;
        goto L23
    L18:
        r10 = null;
        goto L19
    L50:
        l93.q0("IcyHeaders", "Invalid bitrate: " + r3);     // Catch: NumberFormatException -> L47
        r1 = false;
        r7 = -1;
    L13:
        xa3.s("Invalid bitrate header: ", r3, "IcyHeaders");
        r1 = false;
    L12:
        r7 = -1;
        goto L13
    L14:
        r1 = false;
        r8 = -1;
        goto L15
    }

    @Override // defpackage.pv2
    public final void b(co2 r2) {
        String r0 = this.c;
        if (r0 == null) goto L5;
        r2.F = r0;
    L5:
        String r1 = this.b;
        if (r1 == null) goto L9;
        r2.D = r1;
        return;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L23:
        return false;
    L8:
        if (iv1.class != r5.getClass()) goto L23;
        iv1 r6 = (iv1) r5;
        if (this.a != r6.a) goto L23;
        if (Objects.equals(this.b, r6.b) == false) goto L23;
        if (Objects.equals(this.c, r6.c) == false) goto L23;
        if (Objects.equals(this.d, r6.d) == false) goto L23;
        if (this.e != r6.e) goto L23;
        if (this.f != r6.f) goto L23;
        return true;
    }

    public final int hashCode() {
        int r0 = (527 + this.a) * 31;
        int r1 = 0;
        String r2 = this.b;
        if (r2 == null) goto L5;
        int r3 = r2.hashCode();
    L6:
        int r4 = (r0 + r3) * 31;
        String r5 = this.c;
        if (r5 == null) goto L9;
        int r6 = r5.hashCode();
    L10:
        int r7 = (r4 + r6) * 31;
        String r8 = this.d;
        if (r8 == null) goto L14;
        r1 = r8.hashCode();
    L14:
        return ((((r7 + r1) * 31) + (this.e ? 1 : 0)) * 31) + this.f;
    L9:
        r6 = 0;
        goto L10
    L5:
        r3 = 0;
        goto L6
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.c + "\", genre=\"" + this.b + "\", bitrate=" + this.a + ", metadataInterval=" + this.f;
    }
}
