package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zc extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ zc(int r1) {
        this.a = r1;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch(this.a) {
            case 0: goto L12;
            case 1: goto L10;
            case 2: goto L9;
            case 3: goto L7;
            default: goto L5;
        };
    L10:
        SimpleDateFormat r2 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        r2.setLenient(false);
        r2.setTimeZone(ze5.b);
        return r2;
    L12:
        Choreographer r0 = Choreographer.getInstance();
        Looper r1 = Looper.myLooper();
        if (r1 == null) goto L15;
        bd r3 = new bd(r0, wr1.m(r1));
        return ya4.F(r3, r3.y);
    L15:
        kf2.o("no Looper on this thread");
        return null;
    L5:
        return 0L;
    L7:
        return Boolean.FALSE;
    L9:
        return new Random();
    }
}
