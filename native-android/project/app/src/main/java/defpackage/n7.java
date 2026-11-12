package defpackage;

import com.eddyizm.tempus.subsonic.models.Child;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n7 implements Comparator {
    public final /* synthetic */ int n;

    public /* synthetic */ n7(int r1) {
        this.n = r1;
    }

    @Override // java.util.Comparator
    public final int compare(Object r11, Object r12) {
        int r2 = 0;
        switch(this.n) {
            case 0: goto L115;
            case 1: goto L113;
            case 2: goto L111;
            case 3: goto L109;
            case 4: goto L98;
            case 5: goto L97;
            case 6: goto L94;
            case 7: goto L93;
            case 8: goto L91;
            case 9: goto L89;
            case 10: goto L77;
            case 11: goto L76;
            case 12: goto L64;
            case 13: goto L63;
            case 14: goto L61;
            case 15: goto L58;
            case 16: goto L53;
            case 17: goto L45;
            case 18: goto L16;
            case 19: goto L15;
            case 20: goto L13;
            case 21: goto L11;
            case 22: goto L9;
            case 23: goto L7;
            default: goto L5;
        };
    L16:
        Child r13 = (Child) r11;
        Child r14 = (Child) r12;
        if (r13.isDir() == false) goto L29;
        if (r14.isDir() == false) goto L29;
        String r0 = "";
        if (r13.getTitle() == null) goto L23;
        String r10 = r13.getTitle();
    L25:
        if (r14.getTitle() == null) goto L118;
        r0 = r14.getTitle();
    L118:
        return r10.compareToIgnoreCase(r0);
    L23:
        r10 = "";
    L29:
        if (r13.isDir() == true) goto L41;
        if (r14.isDir() == true) goto L41;
        if (r13.getTrack() == null) goto L35;
        int r15 = r13.getTrack().intValue();
    L37:
        if (r14.getTrack() == null) goto L119;
        r2 = r14.getTrack().intValue();
    L119:
        return Integer.compare(r15, r2);
    L35:
        r15 = 0;
    L41:
        if (r13.isDir() == false) goto L44;
        return -1;
    L44:
        return 1;
    L45:
        te4 r16 = (te4) r11;
        te4 r17 = (te4) r12;
        long r3 = r16.s;
        long r4 = r17.s;
        if ((r3 - r4) != 0) goto L49;
        return r16.a(r17);
    L49:
        if (r3 >= r4) goto L52;
        return -1;
    L52:
        return 1;
    L53:
        c72 r18 = (c72) r11;
        c72 r19 = (c72) r12;
        float r110 = r18.R.p.O;
        float r1 = r19.R.p.O;
        if (r110 != r1) goto L57;
        return h12.j(r18.u(), r19.u());
    L57:
        return Float.compare(r110, r1);
    L58:
        j02 r111 = (j02) r11;
        j02 r112 = (j02) r12;
        return (r111.o - r111.n) - (r112.o - r112.n);
    L64:
        byte[] r113 = (byte[]) r11;
        byte[] r114 = (byte[]) r12;
        if (r113.length != r114.length) goto L74;
        int r115 = 0;
    L69:
        if (r115 >= r113.length) goto L125;
        byte r5 = r113[r115];
        byte r6 = r114[r115];
        if (r5 != r6) goto L124;
        r115 = r115 + 1;
        goto L69
    L124:
        return r5 - r6;
    L125:
        return 0;
    L74:
        return r113.length - r114.length;
    L77:
        on0 r116 = (on0) r11;
        on0 r117 = (on0) r12;
        boolean r118 = r116.r;
        int r7 = r116.w;
        if (r118 == true) goto L80;
    L82:
        gb3 r119 = pn0.k.a();
    L83:
        boolean r8 = r116.s.F;
        v60 r9 = v60.a;
        if (r8 == false) goto L87;
        r9 = r9.b(Integer.valueOf(r7), Integer.valueOf(r117.w), pn0.k.a());
    L87:
        return r9.b(Integer.valueOf(r116.x), Integer.valueOf(r117.x), r119).b(Integer.valueOf(r7), Integer.valueOf(r117.w), r119).e();
    L80:
        if (r116.u == false) goto L82;
        r119 = pn0.k;
        goto L83
    L94:
        List r120 = (List) r11;
        List r121 = (List) r12;
        int r20 = 9;
        int r21 = 10;
        return t60.f(on0.c((on0) Collections.max(r120, new n7(r20)), (on0) Collections.max(r121, new n7(r20)))).a(r120.size(), r121.size()).b((on0) Collections.max(r120, new n7(r21)), (on0) Collections.max(r121, new n7(r21)), new n7(r21)).e();
    L98:
        Integer r122 = (Integer) r11;
        Integer r123 = (Integer) r12;
        if (r122.intValue() != (-1)) goto L104;
        if (r123.intValue() == (-1)) goto L127;
        return -1;
    L127:
        return 0;
    L104:
        if (r123.intValue() != (-1)) goto L107;
        return 1;
    L107:
        return r122.intValue() - r123.intValue();
    L5:
        return Long.compare(((r95) r11).b, ((r95) r12).b);
    L7:
        return Integer.compare(((s95) r11).a.b, ((s95) r12).a.b);
    L9:
        return ((Double) r11).compareTo((Double) r12);
    L11:
        return Float.compare(((eg4) r11).c, ((eg4) r12).c);
    L13:
        return ((eg4) r11).a - ((eg4) r12).a;
    L15:
        return ((Number) r94.b.invoke(r11, r12)).intValue();
    L61:
        return ((qm1) r11).a.compareTo(((qm1) r12).a);
    L63:
        return h12.j(((o12) r11).b, ((o12) r12).b);
    L76:
        return Long.compare(((ns0) r11).c, ((ns0) r12).c);
    L89:
        return on0.c((on0) r11, (on0) r12);
    L91:
        return ((ln0) ((List) r11).get(0)).c((ln0) ((List) r12).get(0));
    L93:
        return ((fn0) Collections.max((List) r11)).c((fn0) Collections.max((List) r12));
    L97:
        return Integer.compare(((gn0) ((List) r11).get(0)).s, ((gn0) ((List) r12).get(0)).s);
    L109:
        return Integer.compare(((f00) r12).b, ((f00) r11).b);
    L111:
        return ((tb1) r12).j - ((tb1) r11).j;
    L113:
        return h12.j(((gq3) r12).a, ((gq3) r11).a);
    L115:
        return ((Date) r11).compareTo((Date) r12);
    }
}
