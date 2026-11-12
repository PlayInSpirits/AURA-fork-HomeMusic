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
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", locale);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", locale);
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale);
        simpleDateFormat3.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.a = gb.P(simpleDateFormat, simpleDateFormat2, simpleDateFormat3);
    }

    @Override // defpackage.g32
    public final Object a(h32 h32Var, Type type, si1 si1Var) {
        h32Var.getClass();
        type.getClass();
        String strB = h32Var.b();
        strB.getClass();
        String string = qm4.K0(strB).toString();
        Date date = null;
        if (string.length() == 0) {
            return null;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                date = ((SimpleDateFormat) it.next()).parse(string);
                break;
            } catch (ParseException unused) {
            }
        }
        return date;
    }
}
