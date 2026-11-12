package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j94 {
    public final e94 a;
    public final j03 b;

    public j94(i94 r5, e02 r6) {
        this.a = r5.d;
        List r7 = i94.j(4, r5);
        this.b = new j03(r7.size());
        int r0 = r7.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L8;
        i94 r2 = (i94) r7.get(r1);
        if (r6.a(r2.f) == false) goto L7;
        this.b.a(r2.f);
    L7:
        r1 = r1 + 1;
        goto L3
    }
}
