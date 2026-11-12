package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jy implements u32, Serializable {
    public static final Object NO_RECEIVER = null;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient u32 reflected;
    private final String signature;

    static {
        NO_RECEIVER = iy.n;
    }

    public jy(Object r1, Class r2, String r3, String r4, boolean r5) {
        this.receiver = r1;
        this.owner = r2;
        this.name = r3;
        this.signature = r4;
        this.isTopLevel = r5;
    }

    @Override // defpackage.u32
    public Object call(Object... r1) {
        return getReflected().call(r1);
    }

    @Override // defpackage.u32
    public Object callBy(Map r1) {
        return getReflected().callBy(r1);
    }

    public u32 compute() {
        u32 r0 = this.reflected;
        if (r0 != null) goto L6;
        u32 r1 = computeReflected();
        this.reflected = r1;
        return r1;
    L6:
        return r0;
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
        Class r0 = this.owner;
        if (r0 != null) goto L7;
        return null;
    L7:
        if (this.isTopLevel == false) goto L11;
        kx3.a.getClass();
        return new zb3(r0);
    L11:
        return kx3.a(r0);
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
