package defpackage;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r01 implements g32 {
    public final List a;

    public r01() {
        Locale r1 = Locale.US;
        SimpleDateFormat r0 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", r1);
        r0.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat r3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", r1);
        r3.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat r4 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", r1);
        r4.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.a = gb.P(new SimpleDateFormat[]{r0, r3, r4});
    }

    @Override // defpackage.g32
    public final Object a(h32 r1, Type r2, si1 r3) {
        r1.getClass();
        r2.getClass();
        String r4 = r1.b();
        r4.getClass();
        String r5 = qm4.K0(r4).toString();
        Date r6 = null;
        if (r5.length() != 0) goto L5;
        return null;
    L5:
        Iterator r0 = this.a.iterator();
    L7:
        if (r0.hasNext() == false) goto L10;
        r6 = ((SimpleDateFormat) r0.next()).parse(r5);     // Catch: ParseException -> L11
    L10:
        return r6;
    }
}
