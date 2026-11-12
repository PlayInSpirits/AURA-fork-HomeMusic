package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hg1 extends jy implements gg1, w32 {
    private final int arity;

    public hg1(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
    }

    @Override // defpackage.jy
    public u32 computeReflected() {
        kx3.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hg1) {
            hg1 hg1Var = (hg1) obj;
            return getName().equals(hg1Var.getName()) && getSignature().equals(hg1Var.getSignature()) && h12.c(getBoundReceiver(), hg1Var.getBoundReceiver()) && h12.c(getOwner(), hg1Var.getOwner());
        }
        if (obj instanceof w32) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.gg1
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.jy
    public w32 getReflected() {
        u32 u32VarCompute = compute();
        if (u32VarCompute != this) {
            return (w32) u32VarCompute;
        }
        throw new cf0("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.w32
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.w32
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.w32
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.w32
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.w32
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        u32 u32VarCompute = compute();
        if (u32VarCompute != this) {
            return u32VarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
