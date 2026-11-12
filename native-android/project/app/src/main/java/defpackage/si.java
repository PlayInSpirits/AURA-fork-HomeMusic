package defpackage;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
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
    public static final ri d = new ri(0);
    public final /* synthetic */ int a = 2;
    public final Object b;
    public final Object c;

    public si(bk0 bk0Var, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        Objects.requireNonNull(bk0Var);
        this.c = bk0Var;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (o22.a >= 9) {
            arrayList.add(g12.z(i, i2));
        }
    }

    @Override // defpackage.bz4
    public final Object a(l32 l32Var) throws IOException {
        Date dateB;
        Collection collection = null;
        switch (this.a) {
            case 0:
                Class cls = (Class) this.c;
                if (l32Var.e0() == 9) {
                    l32Var.a0();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                l32Var.b();
                while (l32Var.J()) {
                    arrayList.add(((bz4) ((eg2) this.b).c).a(l32Var));
                }
                l32Var.q();
                int size = arrayList.size();
                if (!cls.isPrimitive()) {
                    return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
                }
                Object objNewInstance = Array.newInstance((Class<?>) cls, size);
                for (int i = 0; i < size; i++) {
                    Array.set(objNewInstance, i, arrayList.get(i));
                }
                return objNewInstance;
            case 1:
                if (l32Var.e0() == 9) {
                    l32Var.a0();
                } else {
                    collection = (Collection) ((o73) this.c).A();
                    l32Var.b();
                    while (l32Var.J()) {
                        collection.add(((bz4) ((eg2) this.b).c).a(l32Var));
                    }
                    l32Var.q();
                }
                return collection;
            case 2:
                if (l32Var.e0() == 9) {
                    l32Var.a0();
                    return null;
                }
                String strC0 = l32Var.c0();
                synchronized (((ArrayList) this.b)) {
                    try {
                        ArrayList arrayList2 = (ArrayList) this.b;
                        int size2 = arrayList2.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            Object obj = arrayList2.get(i2);
                            i2++;
                            try {
                                dateB = ((DateFormat) obj).parse(strC0);
                            } catch (ParseException unused) {
                            }
                        }
                        try {
                            dateB = fv1.b(strC0, new ParsePosition(0));
                        } catch (ParseException e) {
                            oi0.a(xa3.j("Failed parsing '", strC0, "' as Date; at path "), l32Var.H(), e);
                            return null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return ((bk0) this.c).b(dateB);
            default:
                Class cls2 = (Class) this.c;
                Object objA = ((dz4) this.b).p.a(l32Var);
                if (objA == null || cls2.isInstance(objA)) {
                    return objA;
                }
                throw new JsonSyntaxException("Expected a " + cls2.getName() + " but was " + objA.getClass().getName() + "; at path " + l32Var.H());
        }
    }

    @Override // defpackage.bz4
    public final void b(q32 q32Var, Object obj) throws IOException {
        String str;
        switch (this.a) {
            case 0:
                if (obj == null) {
                    q32Var.F();
                    return;
                }
                q32Var.f();
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    ((eg2) this.b).b(q32Var, Array.get(obj, i));
                }
                q32Var.q();
                return;
            case 1:
                Collection collection = (Collection) obj;
                if (collection == null) {
                    q32Var.F();
                    return;
                }
                q32Var.f();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ((eg2) this.b).b(q32Var, it.next());
                }
                q32Var.q();
                return;
            case 2:
                Date date = (Date) obj;
                if (date == null) {
                    q32Var.F();
                    return;
                }
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.b).get(0);
                synchronized (((ArrayList) this.b)) {
                    str = dateFormat.format(date);
                    break;
                }
                q32Var.W(str);
                return;
            default:
                ((dz4) this.b).p.b(q32Var, obj);
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.b).get(0);
                if (dateFormat instanceof SimpleDateFormat) {
                    return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
                }
                return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
            default:
                return super.toString();
        }
    }

    public si(nk1 nk1Var, bz4 bz4Var, Class cls) {
        this.b = new eg2(nk1Var, bz4Var, cls);
        this.c = cls;
    }

    public si(nk1 nk1Var, Type type, bz4 bz4Var, o73 o73Var) {
        this.b = new eg2(nk1Var, bz4Var, type);
        this.c = o73Var;
    }

    public si(dz4 dz4Var, Class cls) {
        this.b = dz4Var;
        this.c = cls;
    }
}
