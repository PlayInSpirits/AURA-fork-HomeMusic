package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jy implements u32, Serializable {
    public static final Object NO_RECEIVER = iy.n;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient u32 reflected;
    private final String signature;

    public jy(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.u32
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.u32
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public u32 compute() {
        u32 u32Var = this.reflected;
        if (u32Var != null) {
            return u32Var;
        }
        u32 u32VarComputeReflected = computeReflected();
        this.reflected = u32VarComputeReflected;
        return u32VarComputeReflected;
    }

    public abstract u32 computeReflected();

    @Override // defpackage.t32
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public v32 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return kx3.a(cls);
        }
        kx3.a.getClass();
        return new zb3(cls);
    }

    @Override // defpackage.u32
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract u32 getReflected();

    @Override // defpackage.u32
    public d42 getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.u32
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.u32
    public e42 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.u32
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.u32
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.u32
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
