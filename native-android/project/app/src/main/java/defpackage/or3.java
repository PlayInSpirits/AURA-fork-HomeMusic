package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class or3 extends jy implements c42 {
    public final boolean n;

    public or3(Object r9, Class r10, String r11, String r12, int r13) {
        if ((r13 & 1) != 1) goto L6;
        boolean r7 = true;
    L7:
        super(r9, r10, r11, r12, r7);
        this.n = false;
        return;
    L6:
        r7 = false;
        goto L7
    }

    public final c42 b() {
        if (this.n == true) goto L10;
        u32 r0 = compute();
        if (r0 == this) goto L9;
        return (c42) r0;
    L9:
        throw new cf0("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    L10:
        er1.l("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        return null;
    }

    @Override // defpackage.jy
    public final u32 compute() {
        if (this.n == false) goto L6;
        return this;
    L6:
        return super.compute();
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof or3) == false) goto L18;
        or3 r6 = (or3) r5;
        if (getOwner().equals(r6.getOwner()) == true) goto L10;
    L16:
        return false;
    L10:
        if (getName().equals(r6.getName()) == false) goto L16;
        if (getSignature().equals(r6.getSignature()) == false) goto L16;
        if (h12.c(getBoundReceiver(), r6.getBoundReceiver()) == false) goto L16;
        return true;
    L18:
        if ((r5 instanceof c42) == true) goto L20;
        return false;
    L20:
        return r5.equals(compute());
    }

    @Override // defpackage.jy
    public final /* bridge */ /* synthetic */ u32 getReflected() {
        return b();
    }

    public final int hashCode() {
        int r0 = getOwner().hashCode() * 31;
        int r1 = (getName().hashCode() + r0) * 31;
        return getSignature().hashCode() + r1;
    }

    public final String toString() {
        u32 r0 = compute();
        if (r0 == this) goto L7;
        return r0.toString();
    L7:
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
