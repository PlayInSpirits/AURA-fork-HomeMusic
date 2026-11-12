package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c33 extends g33 {
    public final Class s;

    public c33(Class cls) {
        super(0, cls);
        if (cls.isEnum()) {
            this.s = cls;
        } else {
            nz2.h(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // defpackage.g33, defpackage.h33
    public final String b() {
        return this.s.getName();
    }

    @Override // defpackage.g33
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Enum d(String str) {
        Object obj;
        str.getClass();
        Class cls = this.s;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            if (xm4.f0(((Enum) obj).name(), str, true)) {
                break;
            }
            i++;
        }
        Enum r3 = (Enum) obj;
        if (r3 != null) {
            return r3;
        }
        StringBuilder sbJ = xa3.j("Enum value ", str, " not found for type ");
        sbJ.append(cls.getName());
        sbJ.append('.');
        throw new IllegalArgumentException(sbJ.toString());
    }
}
