.class public final synthetic Landroidx/credentials/playservices/controllers/GetRestoreCredential/c;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/c;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/c;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/c;->p:Ljava/lang/Object;

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
    iget v0, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/c;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/c;->o:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lvf0;

    .line 9
    .line 10
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/c;->p:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ljx3;

    .line 13
    .line 14
    invoke-static {v0, p0}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetRestoreCredentialController$invokePlayServices$2$1;->$r8$lambda$Tph1liBZGG4csyUNhnG2bNv8-i8(Lvf0;Ljx3;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/c;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lvf0;

    .line 21
    .line 22
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/c;->p:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Ljava/lang/Exception;

    .line 25
    .line 26
    invoke-static {v0, p0}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetRestoreCredentialController$invokePlayServices$1$2;->$r8$lambda$KAaEQP1CEP8W3gvzATU5wMTCeJs(Lvf0;Ljava/lang/Exception;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    iget-object v0, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/c;->o:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lvf0;

    .line 33
    .line 34
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/c;->p:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Lmh1;

    .line 37
    .line 38
    invoke-static {v0, p0}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetRestoreCredentialController$invokePlayServices$1$1;->$r8$lambda$w8n8Q0V9BFPPvjH4CVuVUp3XL2M(Lvf0;Lmh1;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_2
    iget-object v0, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/c;->o:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Lvf0;

    .line 45
    .line 46
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/c;->p:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Landroidx/credentials/exceptions/GetCredentialException;

    .line 49
    .line 50
    invoke-static {v0, p0}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$invokePlayServices$2$1;->$r8$lambda$1Qhaqjx7kHDfAuP4b3cMQoDBv4I(Lvf0;Landroidx/credentials/exceptions/GetCredentialException;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_3
    iget-object v0, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/c;->o:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;

    .line 57
    .line 58
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/c;->p:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p0, Lmh1;

    .line 61
    .line 62
    invoke-static {v0, p0}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$handleResponse$4;->$r8$lambda$YUIqs5PSqlPW6HtD2DVcHUuPEno(Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;Lmh1;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
