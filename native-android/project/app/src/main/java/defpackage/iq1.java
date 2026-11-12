package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class iq1 {
    public static final yw a = null;
    public static final String[] b = null;
    public static final String[] c = null;
    public static final String[] d = null;

    static {
        yw r0 = yw.q;
        a = pa.t("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        c = new String[64];
        String[] r1 = new String[256];
        int r2 = 0;
        int r3 = 0;
    L4:
        if (r3 >= 256) goto L6;
        String r5 = Integer.toBinaryString(r3);
        r5.getClass();
        String r4 = ze5.d("%8s", new Object[]{r5}).replace(' ', '0');
        r4.getClass();
        r1[r3] = r4;
        r3 = r3 + 1;
        goto L4
    L6:
        d = r1;
        String[] r6 = c;
        r6[0] = "";
        r6[1] = "END_STREAM";
        int[] r7 = {1};
        r6[8] = "PADDED";
        int r8 = r7[0];
        r6[r8 | 8] = b11.q(new StringBuilder(), r6[r8], "|PADDED");
        r6[4] = "END_HEADERS";
        r6[32] = "PRIORITY";
        r6[36] = "END_HEADERS|PRIORITY";
        int[] r9 = {4, 32, 36};
        int r10 = 0;
    L8:
        if (r10 >= 3) goto L10;
        int r11 = r9[r10];
        int r12 = r7[0];
        String[] r13 = c;
        int r14 = r12 | r11;
        r13[r14] = r13[r12] + '|' + r13[r11];
        StringBuilder r15 = new StringBuilder();
        r15.append(r13[r12]);
        r15.append('|');
        r13[r14 | 8] = b11.q(r15, r13[r11], "|PADDED");
        r10 = r10 + 1;
        goto L8
    L10:
        int r16 = c.length;
    L11:
        if (r2 >= r16) goto L16;
        String[] r17 = c;
        if (r17[r2] != null) goto L15;
        r17[r2] = d[r2];
    L15:
        r2 = r2 + 1;
        goto L11
    }

    public static String a(int r2) {
        String[] r0 = b;
        if (r2 >= r0.length) goto L7;
        return r0[r2];
    L7:
        return ze5.d("0x%02x", new Object[]{Integer.valueOf(r2)});
    }

    public static String b(boolean r4, int r5, int r6, int r7, int r8) {
        String r0 = a(r7);
        if (r8 != 0) goto L5;
        String r9 = "";
    L36:
        if (r4 == false) goto L38;
        String r10 = "<<";
    L40:
        return ze5.d("%s 0x%08x %5d %-13s %s", new Object[]{r10, Integer.valueOf(r5), Integer.valueOf(r6), r0, r9});
    L38:
        r10 = ">>";
        goto L40
    L5:
        String[] r2 = d;
        if (r7 != 2) goto L8;
    L35:
        r9 = r2[r8];
        goto L36
    L8:
        if (r7 == 3) goto L35;
        if (r7 == 4) goto L32;
        if (r7 == 6) goto L32;
        if (r7 == 7) goto L35;
        if (r7 == 8) goto L35;
        String[] r1 = c;
        if (r8 >= r1.length) goto L20;
        String r3 = r1[r8];
        r3.getClass();
    L22:
        if (r7 == 5) goto L24;
    L26:
        if (r7 == 0) goto L28;
    L30:
        r9 = r3;
        goto L36
    L28:
        if ((r8 & 32) == 0) goto L30;
        r9 = xm4.i0(r3, "PRIORITY", "COMPRESSED");
        goto L36
    L24:
        if ((r8 & 4) == 0) goto L26;
        r9 = xm4.i0(r3, "HEADERS", "PUSH_PROMISE");
        goto L36
    L20:
        r3 = r2[r8];
    L32:
        if (r8 != 1) goto L34;
        r9 = "ACK";
        goto L36
    L34:
        r9 = r2[r8];
        goto L36
    }

    public static String c(int r1, int r2, long r3, boolean r5) {
        String r0 = a(8);
        if (r5 == false) goto L5;
        String r6 = "<<";
    L7:
        return ze5.d("%s 0x%08x %5d %-13s %d", new Object[]{r6, Integer.valueOf(r1), Integer.valueOf(r2), r0, Long.valueOf(r3)});
    L5:
        r6 = ">>";
        goto L7
    }
}
