.class public final synthetic Landroidx/credentials/playservices/controllers/CreatePassword/a;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/credentials/playservices/controllers/CreatePassword/a;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/credentials/playservices/controllers/CreatePassword/a;->o:Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;

    .line 4
    .line 5
    iput-object p2, p0, Landroidx/credentials/playservices/controllers/CreatePassword/a;->p:Ljava/lang/Object;

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
    iget v0, p0, Landroidx/credentials/playservices/controllers/CreatePassword/a;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/credentials/playservices/controllers/CreatePassword/a;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/CreatePassword/a;->o:Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v1, Ldefpackage/lf0;

    .line 11
    .line 12
    invoke-static {p0, v1}, Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController$handleResponse$3;->$r8$lambda$bSv_JNc6LGQQAxqE23iJP3KsmNk(Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;Ldefpackage/lf0;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    check-cast v1, Landroidx/credentials/exceptions/CreateCredentialException;

    .line 17
    .line 18
    invoke-static {p0, v1}, Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController$handleResponse$2;->$r8$lambda$Xf3l0PkPKOo1rTArgwmrPM3pKtc(Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;Landroidx/credentials/exceptions/CreateCredentialException;)V

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
