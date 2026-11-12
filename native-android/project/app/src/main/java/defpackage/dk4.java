package defpackage;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dk4 extends bz4 {
    public static final ri c = new ri(2);
    public static final ri d = new ri(3);
    public static final ri e = new ri(1);
    public final /* synthetic */ int a;
    public final Object b;

    public dk4(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new SimpleDateFormat("hh:mm:ss a");
                break;
            case 2:
                ArrayList arrayList = new ArrayList();
                this.b = arrayList;
                Locale locale = Locale.US;
                arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
                if (!Locale.getDefault().equals(locale)) {
                    arrayList.add(DateFormat.getDateTimeInstance(2, 2));
                }
                if (o22.a >= 9) {
                    arrayList.add(g12.z(2, 2));
                }
                break;
            default:
                this.b = new SimpleDateFormat("MMM d, yyyy");
                break;
        }
    }

    @Override // defpackage.bz4
    public final Object a(l32 l32Var) throws IOException {
        Date date;
        Time time;
        Date dateB;
        switch (this.a) {
            case 0:
                if (l32Var.e0() == 9) {
                    l32Var.a0();
                    return null;
                }
                String strC0 = l32Var.c0();
                try {
                    synchronized (this) {
                        date = ((SimpleDateFormat) this.b).parse(strC0);
                        break;
                    }
                    return new java.sql.Date(date.getTime());
                } catch (ParseException e2) {
                    oi0.a(xa3.j("Failed parsing '", strC0, "' as SQL Date; at path "), l32Var.H(), e2);
                    return null;
                }
            case 1:
                if (l32Var.e0() == 9) {
                    l32Var.a0();
                    return null;
                }
                String strC1 = l32Var.c0();
                try {
                    synchronized (this) {
                        try {
                            time = new Time(((SimpleDateFormat) this.b).parse(strC1).getTime());
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return time;
                } catch (ParseException e3) {
                    oi0.a(xa3.j("Failed parsing '", strC1, "' as SQL Time; at path "), l32Var.H(), e3);
                    return null;
                }
            default:
                if (l32Var.e0() == 9) {
                    l32Var.a0();
                    return null;
                }
                String strC2 = l32Var.c0();
                synchronized (((ArrayList) this.b)) {
                    try {
                        ArrayList arrayList = (ArrayList) this.b;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            try {
                                dateB = ((DateFormat) obj).parse(strC2);
                            } catch (ParseException unused) {
                            }
                        }
                        try {
                            dateB = fv1.b(strC2, new ParsePosition(0));
                        } catch (ParseException e4) {
                            oi0.a(xa3.j("Failed parsing '", strC2, "' as Date; at path "), l32Var.H(), e4);
                            return null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return dateB;
        }
    }

    @Override // defpackage.bz4
    public final void b(q32 q32Var, Object obj) throws IOException {
        String str;
        String str2;
        String str3;
        switch (this.a) {
            case 0:
                java.sql.Date date = (java.sql.Date) obj;
                if (date == null) {
                    q32Var.F();
                    return;
                }
                synchronized (this) {
                    str = ((SimpleDateFormat) this.b).format((Date) date);
                    break;
                }
                q32Var.W(str);
                return;
            case 1:
                Time time = (Time) obj;
                if (time == null) {
                    q32Var.F();
                    return;
                }
                synchronized (this) {
                    str2 = ((SimpleDateFormat) this.b).format((Date) time);
                    break;
                }
                q32Var.W(str2);
                return;
            default:
                Date date2 = (Date) obj;
                if (date2 == null) {
                    q32Var.F();
                    return;
                }
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.b).get(0);
                synchronized (((ArrayList) this.b)) {
                    str3 = dateFormat.format(date2);
                    break;
                }
                q32Var.W(str3);
                return;
        }
    }
}
