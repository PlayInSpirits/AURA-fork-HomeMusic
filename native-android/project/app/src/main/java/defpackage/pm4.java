package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pm4 implements uw2 {
    public final /* synthetic */ int a;
    public final uw2 b;

    public /* synthetic */ pm4(uw2 r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.uw2
    public final /* bridge */ /* synthetic */ boolean a(Object r1) {
        switch(this.a) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        URL r2 = (URL) r1;
        return true;
    L7:
        String r3 = (String) r1;
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.uw2
    public final tw2 b(Object r4, int r5, int r6, db3 r7) {
        int r0 = this.a;
        uw2 r3 = this.b;
        switch(r0) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        String r8 = (String) r4;
        if (TextUtils.isEmpty(r8) == false) goto L10;
        Uri r9 = null;
    L16:
        if (r9 != null) goto L18;
        return null;
    L18:
        if (r3.a(r9) == true) goto L21;
        return null;
    L21:
        return r3.b(r9, r5, r6, r7);
    L10:
        if (r8.charAt(0) != '/') goto L12;
        r9 = Uri.fromFile(new File(r8));
        goto L16
    L12:
        Uri r1 = Uri.parse(r8);
        if (r1.getScheme() != null) goto L15;
        r9 = Uri.fromFile(new File(r8));
        goto L16
    L15:
        r9 = r1;
        goto L16
    L5:
        return r3.b(new qi1((URL) r4), r5, r6, r7);
    }
}
