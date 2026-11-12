package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p25 {
    public final long a;
    public final gn2 b;
    public final String c;
    public final jw4 d;

    public p25(long r5, gn2 r7, String r8) {
        r7.getClass();
        this.a = r5;
        this.b = r7;
        this.c = r8;
        Set r0 = q25.Q;
        Bundle r9 = r7.d.I;
        String r1 = null;
        if (r9 == null) goto L5;
        String r2 = r9.getString("type");
    L6:
        if (r2 == null) goto L21;
        int r3 = r2.hashCode();
        if (r3 == (-405568764)) goto L16;
        if (r3 != 104263205) goto L21;
        if (r2.equals("music") == false) goto L21;
    L17:
        if (r8 == null) goto L21;
        Uri r10 = Uri.parse(r8);
        if (r10 == null) goto L21;
        String r11 = r10.getQueryParameter("format");
    L22:
        if (r11 != null) goto L24;
    L30:
        String r12 = e03.p(r9);
        if (r12 != null) goto L33;
    L35:
        if (r1 != null) goto L37;
        String r13 = "audio/x-unknown";
    L39:
        sb1 r14 = new sb1();
        r14.a = "upnp";
        r14.m = lw2.m(r13);
        this.d = new jw4(gb.O(new iw4(new sv4(String.valueOf(r5), new tb1[]{new tb1(r14)}), false, new int[]{4}, new boolean[]{true})));
        return;
    L37:
        r11 = r1;
    L38:
        r13 = "audio/".concat(r11);
        goto L39
    L33:
        if (r12.length() <= 0) goto L35;
        r1 = r12;
        goto L35
    L24:
        if (r11.length() > 0) goto L26;
    L28:
        r11 = null;
    L29:
        if (r11 != null) goto L38;
    L26:
        if (r11.equals("raw") == true) goto L28;
    L16:
        if (r2.equals("podcast") == true) goto L17;
    L21:
        r11 = null;
        goto L22
    L5:
        r2 = null;
        goto L6
    }
}
