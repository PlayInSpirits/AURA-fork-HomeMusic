package defpackage;

import com.google.gson.reflect.TypeToken;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m73 implements cz4 {
    public final /* synthetic */ int n;
    public final /* synthetic */ bz4 o;

    public /* synthetic */ m73(bz4 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.cz4
    public final bz4 a(nk1 r2, TypeToken r3) {
        int r4 = this.n;
        bz4 r1 = this.o;
        switch(r4) {
            case 0: goto L11;
            default: goto L4;
        };
    L4:
        Class r5 = r3.getRawType();
        if (r5 == Calendar.class) goto L9;
        if (r5 == GregorianCalendar.class) goto L9;
        return null;
    L9:
        return (lk1) r1;
    L11:
        if (r3.getRawType() == Number.class) goto L13;
        return null;
    L13:
        return (n73) r1;
    }

    public String toString() {
        switch(this.n) {
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((lk1) this.o) + "]";
    }
}
