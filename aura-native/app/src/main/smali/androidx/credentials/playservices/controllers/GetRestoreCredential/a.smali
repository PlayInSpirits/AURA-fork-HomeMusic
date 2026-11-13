.class public final synthetic Landroidx/credentials/playservices/controllers/GetRestoreCredential/a;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;

.field public final synthetic p:Landroidx/credentials/exceptions/GetCredentialException;


# direct methods
.method public synthetic constructor <init>(Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;Landroidx/credentials/exceptions/GetCredentialException;I)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/a;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/a;->o:Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;

    .line 4
    .line 5
    iput-object p2, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/a;->p:Landroidx/credentials/exceptions/GetCredentialException;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/a;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/a;->p:Landroidx/credentials/exceptions/GetCredentialException;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/a;->o:Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v1}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$handleResponse$5;->$r8$lambda$e6J4B9dKg39wWUr00icItOkvSLA(Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;Landroidx/credentials/exceptions/GetCredentialException;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-static {p0, v1}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$handleResponse$2;->$r8$lambda$geYFE5GCQxoV3Lwhb0n-MRTtf6k(Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;Landroidx/credentials/exceptions/GetCredentialException;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
