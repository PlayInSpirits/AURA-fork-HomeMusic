.class public final Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException;
.super Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialException;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final synthetic s:I


# direct methods
.method public constructor <init>(Lh;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p1, p1, Lh;->a:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/"

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {p0, p2, p1}, Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
