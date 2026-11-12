package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class or3 extends jy implements c42 {
    public final boolean n;

    public or3(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.n = false;
    }

    @Override // defpackage.jy
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c42 getReflected() {
        if (this.n) {
            er1.l("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
            return null;
        }
        u32 u32VarCompute = compute();
        if (u32VarCompute != this) {
            return (c42) u32VarCompute;
        }
        throw new cf0("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    @Override // defpackage.jy
    public final u32 compute() {
        return this.n ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof or3) {
            or3 or3Var = (or3) obj;
            return getOwner().equals(or3Var.getOwner()) && getName().equals(or3Var.getName()) && getSignature().equals(or3Var.getSignature()) && h12.c(getBoundReceiver(), or3Var.getBoundReceiver());
        }
        if (obj instanceof c42) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        u32 u32VarCompute = compute();
        if (u32VarCompute != this) {
            return u32VarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
