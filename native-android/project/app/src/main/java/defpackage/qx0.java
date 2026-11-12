package defpackage;

import android.text.TextUtils;
import com.eddyizm.tempus.homemusic.PlayEvent;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qx0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public /* synthetic */ qx0(int r1, int r2, int r3, int r4, int r5, int r6) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
    }

    public static qx0 a(String r10) {
        rr2.l(r10.startsWith("Format:"));
        String[] r11 = TextUtils.split(r10.substring(7), ",");
        int r4 = -1;
        int r5 = -1;
        int r6 = -1;
        int r7 = -1;
        int r8 = -1;
        int r2 = 0;
    L4:
        if (r2 >= r11.length) goto L36;
        String r3 = rr2.U(r11[r2].trim());
        r3.getClass();
        switch(r3.hashCode()) {
            case 100571: goto L25;
            case 3556653: goto L21;
            case 102749521: goto L17;
            case 109757538: goto L13;
            case 109780401: goto L9;
            default: goto L7;
        };
    L7:
        byte r9 = -1;
    L28:
        switch(r9) {
            case 0: goto L34;
            case 1: goto L33;
            case 2: goto L32;
            case 3: goto L31;
            case 4: goto L30;
            default: goto L35;
        };
    L30:
        r7 = r2;
        goto L35
    L31:
        r5 = r2;
        goto L35
    L32:
        r4 = r2;
        goto L35
    L33:
        r8 = r2;
        goto L35
    L34:
        r6 = r2;
    L35:
        r2 = r2 + 1;
        goto L4
    L9:
        if (r3.equals("style") == false) goto L50;
        r9 = 4;
        goto L28
    L50:
        r9 = -1;
        goto L28
    L13:
        if (r3.equals(PlayEvent.START) == false) goto L51;
        r9 = 3;
        goto L28
    L51:
        r9 = -1;
        goto L28
    L17:
        if (r3.equals("layer") == false) goto L52;
        r9 = 2;
        goto L28
    L52:
        r9 = -1;
        goto L28
    L21:
        if (r3.equals("text") == false) goto L53;
        r9 = 1;
        goto L28
    L53:
        r9 = -1;
        goto L28
    L25:
        if (r3.equals("end") == false) goto L54;
        r9 = 0;
        goto L28
    L54:
        r9 = -1;
        goto L28
    L36:
        if (r5 == (-1)) goto L41;
        if (r6 == (-1)) goto L55;
        if (r8 != (-1)) goto L40;
        return null;
    L40:
        return new qx0(r4, r5, r6, r7, r8, r11.length);
    L55:
        return null;
    L41:
        return null;
    }
}
