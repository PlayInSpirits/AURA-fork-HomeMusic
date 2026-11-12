package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hg1 extends jy implements gg1, w32 {
    private final int arity;

    public hg1(int r8, int r9, Class r10, Object r11, String r12, String r13) {
        boolean r0 = true;
        if ((r9 & 1) == 1) goto L6;
        r0 = false;
    L6:
        super(r11, r10, r12, r13, r0);
        this.arity = r8;
    }

    @Override // defpackage.jy
    public u32 computeReflected() {
        kx3.a.getClass();
        return this;
    }

    public boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof hg1) == false) goto L18;
        hg1 r6 = (hg1) r5;
        if (getName().equals(r6.getName()) == true) goto L10;
    L16:
        return false;
    L10:
        if (getSignature().equals(r6.getSignature()) == false) goto L16;
        if (h12.c(getBoundReceiver(), r6.getBoundReceiver()) == false) goto L16;
        if (h12.c(getOwner(), r6.getOwner()) == false) goto L16;
        return true;
    L18:
        if ((r5 instanceof w32) == true) goto L20;
        return false;
    L20:
        return r5.equals(compute());
    }

    @Override // defpackage.gg1
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.jy
    public w32 getReflected() {
        u32 r0 = compute();
        if (r0 == this) goto L7;
        return (w32) r0;
    L7:
        throw new cf0("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public int hashCode() {
        if (getOwner() != null) goto L5;
        int r0 = 0;
    L6:
        int r1 = (getName().hashCode() + r0) * 31;
        return getSignature().hashCode() + r1;
    L5:
        r0 = getOwner().hashCode() * 31;
        goto L6
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
        u32 r0 = compute();
        if (r0 == this) goto L7;
        return r0.toString();
    L7:
        if ("<init>".equals(getName()) == false) goto L11;
        return "constructor (Kotlin reflection is not available)";
    L11:
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // defpackage.jy
    public /* bridge */ /* synthetic */ u32 getReflected() {
        return getReflected();
    }
}
