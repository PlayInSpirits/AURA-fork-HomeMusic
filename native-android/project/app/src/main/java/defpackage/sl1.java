package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sl1 {
    public final ArrayList a;

    public sl1() {
        this.a = new ArrayList(20);
    }

    public final void a(String r1, String r2) {
        r1.getClass();
        r2.getClass();
        e35.G(r1);
        e35.H(r2, r1);
        e35.p(this, r1, r2);
    }

    public final void b(String r6) {
        int r0 = qm4.r0(r6, ':', 1, 4);
        if (r0 == (-1)) goto L7;
        e35.p(this, r6.substring(0, r0), r6.substring(r0 + 1));
        return;
    L7:
        if (r6.charAt(0) != ':') goto L10;
        e35.p(this, "", r6.substring(1));
        return;
    L10:
        e35.p(this, "", r6);
    }

    public final tl1 c() {
        ArrayList r2 = this.a;
        return new tl1((String[]) r2.toArray(new String[0]));
    }

    public final String d(String r4) {
        r4.getClass();
        ArrayList r3 = this.a;
        int r0 = r3.size() - 2;
        int r1 = q05.n(r0, 0, -2);
        if (r1 <= r0) goto L5;
        return null;
    L5:
        if (r4.equalsIgnoreCase((String) r3.get(r0)) == true) goto L7;
        if (r0 == r1) goto L14;
        r0 = r0 - 2;
        goto L5
    L14:
        return null;
    L7:
        return (String) r3.get(r0 + 1);
    }

    public final void e(String r4) {
        r4.getClass();
        int r0 = 0;
    L3:
        ArrayList r1 = this.a;
        if (r0 >= r1.size()) goto L9;
        if (r4.equalsIgnoreCase((String) r1.get(r0)) == false) goto L8;
        r1.remove(r0);
        r1.remove(r0);
        r0 = r0 - 2;
    L8:
        r0 = r0 + 2;
        goto L3
    }
}
