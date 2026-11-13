.class public final synthetic Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/b;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;

.field public final synthetic p:Lorg/json/JSONException;


# direct methods
.method public synthetic constructor <init>(Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;Lorg/json/JSONException;I)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/b;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/b;->o:Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;

    .line 4
    .line 5
    iput-object p2, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/b;->p:Lorg/json/JSONException;

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
    iget v0, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/b;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/b;->o:Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;

    .line 7
    .line 8
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/b;->p:Lorg/json/JSONException;

    .line 9
    .line 10
    invoke-static {v0, p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1;->$r8$lambda$9bmIlvNFoi-AP2Y18i8aPhUzSdc(Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;Lorg/json/JSONException;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/b;->o:Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;

    .line 15
    .line 16
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/b;->p:Lorg/json/JSONException;

    .line 17
    .line 18
    invoke-static {v0, p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$handleResponse$6;->$r8$lambda$QySyva6z0tMSvGGTmRAmrU9VHo4(Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;Lorg/json/JSONException;)V

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
