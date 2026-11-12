package defpackage;

import android.media.AudioFormat;
import android.media.Spatializer;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class en0 implements ro3 {
    public final /* synthetic */ pn0 n;
    public final /* synthetic */ jn0 o;

    public /* synthetic */ en0(pn0 r1, jn0 r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.ro3
    public final boolean apply(Object r10) {
        tb1 r11 = (tb1) r10;
        pn0 r0 = this.n;
        r0.getClass();
        if (this.o.A0 == false) goto L78;
        Boolean r9 = r0.j;
        if (r9 != null) goto L7;
    L8:
        int r12 = r11.F;
        String r2 = r11.n;
        if (r12 == (-1)) goto L78;
        if (r12 <= 2) goto L78;
        if (r2 == null) goto L43;
        switch(r2.hashCode()) {
            case -2123537834: goto L31;
            case 187078296: goto L27;
            case 187078297: goto L23;
            case 1504578661: goto L19;
            default: goto L17;
        };
    L17:
        byte r8 = -1;
    L34:
        switch(r8) {
            case 0: goto L37;
            case 1: goto L37;
            case 2: goto L37;
            case 3: goto L37;
            default: goto L43;
        };
    L37:
        if (Build.VERSION.SDK_INT < 32) goto L78;
        ll r13 = r0.h;
        if (r13 == null) goto L78;
        if (r13.o == false) goto L78;
    L19:
        if (r2.equals("audio/eac3") == false) goto L79;
        r8 = 3;
        goto L34
    L79:
        r8 = -1;
        goto L34
    L23:
        if (r2.equals("audio/ac4") == false) goto L80;
        r8 = 2;
        goto L34
    L80:
        r8 = -1;
        goto L34
    L27:
        if (r2.equals("audio/ac3") == false) goto L81;
        r8 = 1;
        goto L34
    L81:
        r8 = -1;
        goto L34
    L31:
        if (r2.equals("audio/eac3-joc") == false) goto L82;
        r8 = 0;
        goto L34
    L82:
        r8 = -1;
    L43:
        if (Build.VERSION.SDK_INT < 32) goto L77;
        ll r7 = r0.h;
        if (r7 == null) goto L77;
        if (r7.o == false) goto L77;
        Spatializer r14 = (Spatializer) r7.p;
        r14.getClass();
        if (m3.k(m3.d(r14)) == false) goto L77;
        Spatializer r15 = (Spatializer) r0.h.p;
        r15.getClass();
        if (m3.n(m3.d(r15)) == false) goto L77;
        ll r16 = r0.h;
        il r1 = r0.i;
        r16.getClass();
        int r17 = r11.F;
        if (Objects.equals(r2, "audio/eac3-joc") == false) goto L58;
        if (r17 != 16) goto L68;
        r17 = 12;
    L68:
        int r18 = f35.s(r17);
        if (r18 != 0) goto L71;
        boolean r19 = false;
    L75:
        if (r19 == false) goto L77;
    L71:
        AudioFormat.Builder r20 = new AudioFormat.Builder().setEncoding(2).setChannelMask(r18);
        int r110 = r11.G;
        if (r110 == (-1)) goto L74;
        r20.setSampleRate(r110);
    L74:
        Spatializer r111 = (Spatializer) r16.p;
        r111.getClass();
        r19 = m3.l(m3.d(r111), r1.c(), r20.build());
        goto L75
    L58:
        if (Objects.equals(r2, "audio/iamf") == false) goto L62;
        if (r17 != (-1)) goto L68;
        r17 = 6;
        goto L68
    L62:
        if (Objects.equals(r2, "audio/ac4") == false) goto L68;
        if (r17 != 18) goto L66;
    L67:
        r17 = 24;
        goto L68
    L66:
        if (r17 != 21) goto L68;
    L77:
        return false;
    L7:
        if (r9.booleanValue() == false) goto L8;
    L78:
        return true;
    }
}
