package defpackage;

import com.eddyizm.tempus.homemusic.HubGoogleLogin;
import com.eddyizm.tempus.homemusic.HubMe;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class do1 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ String o;

    public /* synthetic */ do1(int r1, String r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int r0 = this.n;
        String r3 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        rr1 r1 = rr1.a;
        r3.getClass();
        sz3 r2 = tz3.Companion;
        nk1 r4 = rr1.c;
        Map r5 = Collections.singletonMap("id_token", r3);
        r5.getClass();
        String r6 = r4.j(r5);
        r6.getClass();
        hu2 r7 = rr1.b;
        r2.getClass();
        we5 r8 = sz3.b(r6, r7);
        rr1 r9 = rr1.a;
        return (HubMe) rr1.d(new nr1(r8, 2), new or1(8));
    L6:
        HubGoogleLogin r10 = rr1.l(r3, null, null);
        String r11 = r10.getUsername();
        String r12 = "";
        if (r11 != null) goto L9;
        r11 = "";
    L9:
        String r13 = r10.getPassword();
        if (r13 == null) goto L14;
        r12 = r13;
    L14:
        return new kd3(r11, r12);
    }
}
