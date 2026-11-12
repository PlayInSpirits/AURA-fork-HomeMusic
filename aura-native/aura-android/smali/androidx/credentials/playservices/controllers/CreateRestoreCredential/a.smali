.class public final synthetic Landroidx/credentials/playservices/controllers/CreateRestoreCredential/a;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lvf0;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lvf0;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/a;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/a;->o:Lvf0;

    .line 4
    .line 5
    iput-object p2, p0, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/a;->p:Ljava/lang/Object;

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
    iget v0, p0, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/a;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/a;->p:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljx3;

    .line 9
    .line 10
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/a;->o:Lvf0;

    .line 11
    .line 12
    invoke-static {p0, v0}, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/CredentialProviderCreateRestoreCredentialController$invokePlayServices$2$1;->$r8$lambda$mr5wTFaW8tipTxJt9cofDQVO-7k(Lvf0;Ljx3;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/a;->p:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/lang/Exception;

    .line 19
    .line 20
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/a;->o:Lvf0;

    .line 21
    .line 22
    invoke-static {p0, v0}, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/CredentialProviderCreateRestoreCredentialController$invokePlayServices$1$2;->$r8$lambda$C_-AnX8lOpjpLe5K2xibIv16c18(Lvf0;Ljava/lang/Exception;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    iget-object v0, p0, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/a;->p:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Llf0;

    .line 29
    .line 30
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/a;->o:Lvf0;

    .line 31
    .line 32
    invoke-static {p0, v0}, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/CredentialProviderCreateRestoreCredentialController$invokePlayServices$1$1;->$r8$lambda$i027dJjkRcIrL_IqBSKHJujGwFs(Lvf0;Llf0;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
