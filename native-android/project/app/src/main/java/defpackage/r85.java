package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r85 implements pv2 {
    public final String a;
    public final String b;

    public r85(String r1, String r2) {
        this.a = rr2.V(r1);
        this.b = r2;
    }

    @Override // defpackage.pv2
    public final void b(co2 r4) {
        String r0 = this.a;
        r0.getClass();
        byte r2 = -1;
        switch(r0.hashCode()) {
            case -1935137620: goto L42;
            case -215998278: goto L38;
            case -113312716: goto L34;
            case 62359119: goto L30;
            case 67703139: goto L26;
            case 79833656: goto L22;
            case 428414940: goto L18;
            case 993300766: goto L14;
            case 1746739798: goto L10;
            case 1939198791: goto L6;
            default: goto L45;
        };
    L45:
        String r3 = this.b;
        switch(r2) {
            case 0: goto L72;
            case 1: goto L68;
            case 2: goto L64;
            case 3: goto L62;
            case 4: goto L60;
            case 5: goto L58;
            case 6: goto L56;
            case 7: goto L52;
            case 8: goto L50;
            case 9: goto L48;
            default: goto L80;
        };
    L48:
        r4.b = r3;
        return;
    L50:
        r4.d = r3;
        return;
    L52:
        Integer r5 = jz4.O(r3);
        if (r5 == null) goto L76;
        r4.B = r5;
        return;
    L76:
        return;
    L56:
        r4.g = r3;
        return;
    L58:
        r4.a = r3;
        return;
    L60:
        r4.D = r3;
        return;
    L62:
        r4.c = r3;
        return;
    L64:
        Integer r6 = jz4.O(r3);
        if (r6 == null) goto L77;
        r4.n = r6;
        return;
    L77:
        return;
    L68:
        Integer r7 = jz4.O(r3);
        if (r7 == null) goto L78;
        r4.C = r7;
        return;
    L78:
        return;
    L72:
        Integer r8 = jz4.O(r3);
        if (r8 == null) goto L79;
        r4.o = r8;
        return;
    L79:
        return;
    L80:
        return;
    L6:
        if (r0.equals("ARTIST") == false) goto L45;
        r2 = 9;
        goto L45
    L10:
        if (r0.equals("ALBUMARTIST") == false) goto L45;
        r2 = 8;
        goto L45
    L14:
        if (r0.equals("DISCNUMBER") == false) goto L45;
        r2 = 7;
        goto L45
    L18:
        if (r0.equals("DESCRIPTION") == false) goto L45;
        r2 = 6;
        goto L45
    L22:
        if (r0.equals("TITLE") == false) goto L45;
        r2 = 5;
        goto L45
    L26:
        if (r0.equals("GENRE") == false) goto L45;
        r2 = 4;
        goto L45
    L30:
        if (r0.equals("ALBUM") == false) goto L45;
        r2 = 3;
        goto L45
    L34:
        if (r0.equals("TRACKNUMBER") == false) goto L45;
        r2 = 2;
        goto L45
    L38:
        if (r0.equals("TOTALDISCS") == false) goto L45;
        r2 = 1;
        goto L45
    L42:
        if (r0.equals("TOTALTRACKS") == false) goto L45;
        r2 = 0;
        goto L45
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (r85.class != r5.getClass()) goto L15;
        r85 r6 = (r85) r5;
        if (this.a.equals(r6.a) == false) goto L15;
        if (this.b.equals(r6.b) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        int r0 = f34.e(this.a, 527, 31);
        return this.b.hashCode() + r0;
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }
}
