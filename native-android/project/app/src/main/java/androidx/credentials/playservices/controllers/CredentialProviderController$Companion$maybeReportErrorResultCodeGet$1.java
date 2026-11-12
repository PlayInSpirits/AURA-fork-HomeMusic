package androidx.credentials.playservices.controllers;

import defpackage.gf1;
import defpackage.if1;
import defpackage.j15;
import defpackage.jx3;
import defpackage.q42;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class CredentialProviderController$Companion$maybeReportErrorResultCodeGet$1 extends q42 implements gf1 {
    final /* synthetic */ jx3 $exception;
    final /* synthetic */ if1 $onError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderController$Companion$maybeReportErrorResultCodeGet$1(if1 if1Var, jx3 jx3Var) {
        super(0);
        this.$onError = if1Var;
        this.$exception = jx3Var;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m41invoke() {
        this.$onError.invoke(this.$exception.n);
    }

    @Override // defpackage.gf1
    public /* bridge */ /* synthetic */ Object invoke() {
        m41invoke();
        return j15.a;
    }
}
