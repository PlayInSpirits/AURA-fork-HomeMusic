package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eg2 extends bz4 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public eg2(Class cls) {
        this.a = 2;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new gz4(cls))) {
                Enum r4 = (Enum) field.get(null);
                String strName = r4.name();
                String string = r4.toString();
                ka4 ka4Var = (ka4) field.getAnnotation(ka4.class);
                if (ka4Var != null) {
                    strName = ka4Var.value();
                    for (String str : ka4Var.alternate()) {
                        ((HashMap) this.b).put(str, r4);
                    }
                }
                ((HashMap) this.b).put(strName, r4);
                ((HashMap) this.c).put(string, r4);
                ((HashMap) this.d).put(r4, strName);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.bz4
    public final Object a(l32 l32Var) throws IOException {
        int i = this.a;
        Object obj = this.b;
        Map map = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                bz4 bz4Var = (bz4) ((eg2) obj2).c;
                bz4 bz4Var2 = (bz4) ((eg2) obj).c;
                int iE0 = l32Var.e0();
                if (iE0 == 9) {
                    l32Var.a0();
                } else {
                    map = (Map) ((o73) this.d).A();
                    if (iE0 == 1) {
                        l32Var.b();
                        while (l32Var.J()) {
                            l32Var.b();
                            Object objA = bz4Var2.a(l32Var);
                            if (map.put(objA, bz4Var.a(l32Var)) != null) {
                                throw new JsonSyntaxException("duplicate key: " + objA);
                            }
                            l32Var.q();
                        }
                        l32Var.q();
                    } else {
                        l32Var.f();
                        while (l32Var.J()) {
                            fz0.i0.getClass();
                            if (l32Var instanceof n32) {
                                n32 n32Var = (n32) l32Var;
                                n32Var.m0(5);
                                Map.Entry entry = (Map.Entry) ((Iterator) n32Var.q0()).next();
                                n32Var.s0(entry.getValue());
                                n32Var.s0(new k32((String) entry.getKey()));
                            } else {
                                int iN = l32Var.u;
                                if (iN == 0) {
                                    iN = l32Var.n();
                                }
                                if (iN == 13) {
                                    l32Var.u = 9;
                                } else if (iN == 12) {
                                    l32Var.u = 8;
                                } else if (iN == 14) {
                                    l32Var.u = 10;
                                } else {
                                    er1.j(b11.x(l32Var.e0()), l32Var.M(), "Expected a name but was ");
                                }
                            }
                            Object objA2 = bz4Var2.a(l32Var);
                            if (map.put(objA2, bz4Var.a(l32Var)) != null) {
                                throw new JsonSyntaxException("duplicate key: " + objA2);
                            }
                        }
                        l32Var.s();
                    }
                }
                return map;
            case 1:
                return ((bz4) obj2).a(l32Var);
            default:
                if (l32Var.e0() == 9) {
                    l32Var.a0();
                    return null;
                }
                String strC0 = l32Var.c0();
                Enum r2 = (Enum) ((HashMap) obj).get(strC0);
                return r2 == null ? (Enum) ((HashMap) obj2).get(strC0) : r2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    @Override // defpackage.bz4
    public final void b(q32 q32Var, Object obj) {
        bz4 bz4VarC;
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                eg2 eg2Var = (eg2) obj2;
                if (map == null) {
                    q32Var.F();
                } else {
                    q32Var.j();
                    for (Map.Entry entry : map.entrySet()) {
                        q32Var.u(String.valueOf(entry.getKey()));
                        eg2Var.b(q32Var, entry.getValue());
                    }
                    q32Var.s();
                }
                break;
            case 1:
                bz4 bz4Var = (bz4) obj2;
                Type type = (Type) obj3;
                Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
                if (type2 != type) {
                    bz4 bz4VarG = ((nk1) this.b).g(TypeToken.get(type2));
                    if (bz4VarG instanceof qx3) {
                        bz4 bz4Var2 = bz4Var;
                        while ((bz4Var2 instanceof ja4) && (bz4VarC = ((ja4) bz4Var2).c()) != bz4Var2) {
                            bz4Var2 = bz4VarC;
                        }
                        if (bz4Var2 instanceof qx3) {
                            bz4Var = bz4VarG;
                        }
                    } else {
                        bz4Var = bz4VarG;
                    }
                }
                bz4Var.b(q32Var, obj);
                break;
            default:
                Enum r5 = (Enum) obj;
                q32Var.W(r5 == null ? null : (String) ((HashMap) obj3).get(r5));
                break;
        }
    }

    public eg2(nk1 nk1Var, bz4 bz4Var, Type type) {
        this.a = 1;
        this.b = nk1Var;
        this.c = bz4Var;
        this.d = type;
    }

    public eg2(p40 p40Var, nk1 nk1Var, Type type, bz4 bz4Var, Type type2, bz4 bz4Var2, o73 o73Var) {
        this.a = 0;
        this.b = new eg2(nk1Var, bz4Var, type);
        this.c = new eg2(nk1Var, bz4Var2, type2);
        this.d = o73Var;
    }
}
