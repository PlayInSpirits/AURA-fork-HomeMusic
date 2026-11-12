package defpackage;

import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class si extends bz4 {
    public static final ri d = null;
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    static {
        d = new ri(0);
    }

    public si(bk0 r2, int r3, int r4) {
        this.a = 2;
        ArrayList r0 = new ArrayList();
        this.b = r0;
        Objects.requireNonNull(r2);
        this.c = r2;
        Locale r1 = Locale.US;
        r0.add(DateFormat.getDateTimeInstance(r3, r4, r1));
        if (Locale.getDefault().equals(r1) == true) goto L6;
        r0.add(DateFormat.getDateTimeInstance(r3, r4));
    L6:
        if (o22.a < 9) goto L9;
        r0.add(g12.z(r3, r4));
        return;
    }

    @Override // defpackage.bz4
    public final Object a(l32 r9) {
        int r1 = 0;
        Collection r3 = null;
        switch(this.a) {
            case 0: goto L42;
            case 1: goto L34;
            case 2: goto L13;
            default: goto L4;
        };
    L4:
        Class r0 = (Class) this.c;
        Object r8 = ((dz4) this.b).p.a(r9);
        if (r8 != null) goto L7;
    L11:
        return r8;
    L7:
        if (r0.isInstance(r8) == true) goto L11;
        throw new JsonSyntaxException("Expected a " + r0.getName() + " but was " + r8.getClass().getName() + "; at path " + r9.H());
    L42:
        Class r2 = (Class) this.c;
        if (r9.e0() != 9) goto L45;
        r9.a0();
        return null;
    L45:
        ArrayList r4 = new ArrayList();
        r9.b();
    L47:
        if (r9.J() == false) goto L49;
        r4.add(((bz4) ((eg2) this.b).c).a(r9));
        goto L47
    L49:
        r9.q();
        int r10 = r4.size();
        if (r2.isPrimitive() == false) goto L55;
        Object r5 = Array.newInstance(r2, r10);
    L52:
        if (r1 >= r10) goto L70;
        Array.set(r5, r1, r4.get(r1));
        r1 = r1 + 1;
        goto L52
    L70:
        return r5;
    L55:
        return r4.toArray((Object[]) Array.newInstance(r2, r10));
    L13:
        if (r9.e0() != 9) goto L15;
        r9.a0();
        return null;
    L15:
        String r6 = r9.c0();
        ArrayList r7 = (ArrayList) this.b;
        monitor-enter(r7);
        ArrayList r11 = (ArrayList) this.b;     // Catch: Throwable -> L23
        int r12 = r11.size();     // Catch: Throwable -> L23
        int r13 = 0;
    L18:
        if (r13 >= r12) goto L25;
        Object r14 = r11.get(r13);     // Catch: Throwable -> L23
        r13 = r13 + 1;     // Catch: Throwable -> L23
        Date r15 = ((DateFormat) r14).parse(r6);     // Catch: ParseException -> L56 Throwable -> L23
        monitor-exit(r7);     // Catch: Throwable -> L23
    L68:
        return ((bk0) this.c).b(r15);
    L25:
        monitor-exit(r7);     // Catch: Throwable -> L23
        r15 = fv1.b(r6, new ParsePosition(0));     // Catch: ParseException -> L28
    L28:
        e = move-exception;
        oi0.a(xa3.j("Failed parsing '", r6, "' as Date; at path "), r9.H(), e);
        return null;
    L23:
        th = move-exception;
        throw th;
    L34:
        if (r9.e0() != 9) goto L36;
        r9.a0();
    L41:
        return r3;
    L36:
        r3 = (Collection) ((o73) this.c).A();
        r9.b();
    L38:
        if (r9.J() == false) goto L40;
        r3.add(((bz4) ((eg2) this.b).c).a(r9));
        goto L38
    L40:
        r9.q();
        goto L41
    }

    @Override // defpackage.bz4
    public final void b(q32 r5, Object r6) {
        int r1 = 0;
        switch(this.a) {
            case 0: goto L27;
            case 1: goto L18;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        ((dz4) this.b).p.b(r5, r6);
        return;
    L6:
        Date r7 = (Date) r6;
        if (r7 != null) goto L9;
        r5.F();
        return;
    L9:
        DateFormat r0 = (DateFormat) ((ArrayList) this.b).get(0);
        ArrayList r2 = (ArrayList) this.b;
        monitor-enter(r2);
        String r4 = r0.format(r7);     // Catch: Throwable -> L15
        monitor-exit(r2);     // Catch: Throwable -> L15
        r5.W(r4);
        return;
    L15:
        th = move-exception;
        throw th;
    L18:
        Collection r8 = (Collection) r6;
        if (r8 != null) goto L21;
        r5.F();
        return;
    L21:
        r5.f();
        Iterator r9 = r8.iterator();
    L23:
        if (r9.hasNext() == false) goto L25;
        Object r3 = r9.next();
        ((eg2) this.b).b(r5, r3);
        goto L23
    L25:
        r5.q();
        return;
    L27:
        if (r6 != null) goto L29;
        r5.F();
        return;
    L29:
        r5.f();
        int r10 = Array.getLength(r6);
    L30:
        if (r1 >= r10) goto L32;
        Object r11 = Array.get(r6, r1);
        ((eg2) this.b).b(r5, r11);
        r1 = r1 + 1;
        goto L30
    L32:
        r5.q();
    }

    public String toString() {
        switch(this.a) {
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        DateFormat r3 = (DateFormat) ((ArrayList) this.b).get(0);
        if ((r3 instanceof SimpleDateFormat) == false) goto L10;
        return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) r3).toPattern() + ')';
    L10:
        return "DefaultDateTypeAdapter(" + r3.getClass().getSimpleName() + ')';
    L5:
        return super.toString();
    }

    public si(nk1 r2, bz4 r3, Class r4) {
        this.a = 0;
        this.b = new eg2(r2, r3, r4);
        this.c = r4;
    }

    public si(nk1 r2, Type r3, bz4 r4, o73 r5) {
        this.a = 1;
        this.b = new eg2(r2, r4, r3);
        this.c = r5;
    }

    public si(dz4 r2, Class r3) {
        this.a = 3;
        this.b = r2;
        this.c = r3;
    }
}
