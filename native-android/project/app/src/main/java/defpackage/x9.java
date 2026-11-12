package defpackage;

import android.view.autofill.AutofillId;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x9 implements sn {
    public final ra a;
    public final wn b;
    public final AutofillId c;

    public x9(ra raVar, wn wnVar) {
        this.a = raVar;
        this.b = wnVar;
        raVar.setImportantForAutofill(1);
        hg3 hg3VarL = bu.l(raVar);
        AutofillId autofillIdF = hg3VarL != null ? tn.f(hg3VarL.o) : null;
        if (autofillIdF == null) {
            throw xa3.l("Required value was null.");
        }
        this.c = autofillIdF;
    }
}
