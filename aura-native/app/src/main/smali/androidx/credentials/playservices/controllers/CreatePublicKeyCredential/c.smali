.class public final synthetic Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/c;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;

.field public final synthetic p:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;Ljava/lang/Throwable;I)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/c;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/c;->o:Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;

    .line 4
    .line 5
    iput-object p2, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/c;->p:Ljava/lang/Throwable;

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
    .locals 1

    .line 1
    iget v0, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/c;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/c;->o:Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;

    .line 7
    .line 8
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/c;->p:Ljava/lang/Throwable;

    .line 9
    .line 10
    invoke-static {v0, p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$2;->$r8$lambda$b5DcOVivUS4XaWdlkTanYsjUV6U(Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/c;->o:Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;

    .line 15
    .line 16
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/c;->p:Ljava/lang/Throwable;

    .line 17
    .line 18
    invoke-static {v0, p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$handleResponse$7;->$r8$lambda$CU0GC2dRsMZUzMkdU6m5qLxjNi0(Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
