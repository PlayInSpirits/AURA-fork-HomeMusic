.class public final synthetic Landroidx/credentials/playservices/a;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lvf0;


# direct methods
.method public synthetic constructor <init>(Lvf0;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/credentials/playservices/a;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/credentials/playservices/a;->o:Lvf0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/credentials/playservices/a;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/credentials/playservices/a;->o:Lvf0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$onGetCredential$3;->$r8$lambda$4rzAdejhCbKzIVTc41bn7Li0cO4(Lvf0;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-static {p0}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$onGetCredential$2;->$r8$lambda$D3nePHrtvN6a3Lrvu-PmAeVVcMc(Lvf0;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_1
    invoke-static {p0}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$onGetCredential$1;->$r8$lambda$-ogwK5XNDRJb12698oqo0IwnPbk(Lvf0;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_2
    invoke-static {p0}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$onCreateCredential$1;->$r8$lambda$ua9JkBh-WopeJXpAIy0PFy1qBgc(Lvf0;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_3
    invoke-static {p0}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$onClearCredential$4$1;->$r8$lambda$tuDU-TlXEyiRJkMSSJ0jM4geWQ8(Lvf0;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_4
    invoke-static {p0}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$onClearCredential$2$1;->$r8$lambda$fHvGCF0gxKkcSm0GZYLXYXVuF9g(Lvf0;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_5
    invoke-static {p0}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$onClearCredential$1;->$r8$lambda$KAhC5AyrcHY-cxG-GQdL4QVonXQ(Lvf0;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
